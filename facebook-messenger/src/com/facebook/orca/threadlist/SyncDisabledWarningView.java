// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.threadlist;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.net.ConnectivityManager;
import android.text.style.StyleSpan;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.common.j.a;
import com.facebook.common.w.o;
import com.facebook.i;
import com.facebook.k;
import com.facebook.widget.d;

// Referenced classes of package com.facebook.orca.threadlist:
//            l

public class SyncDisabledWarningView extends d
{

    private View a;
    private TextView b;
    private Button c;

    public SyncDisabledWarningView(Context context)
    {
        super(context);
        a(context);
    }

    public SyncDisabledWarningView(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        a(context);
    }

    public SyncDisabledWarningView(Context context, AttributeSet attributeset, int j)
    {
        super(context, attributeset, j);
        a(context);
    }

    private CharSequence a(int j)
    {
        String s = getResources().getString(j);
        o o1 = new o(getResources());
        o1.a(com.facebook.o.sync_settings_warning_template);
        o1.a("[[setting_type]]", s, new StyleSpan(1), 33);
        return o1.b();
    }

    private void a(Context context)
    {
        setContentView(k.orca_sync_disabled_warning);
        a = c(i.sync_warning_container);
        b = (TextView)c(i.sync_warning_text);
        c = (Button)c(i.goto_settings_button);
        c.setOnClickListener(new l(this));
        a.setVisibility(8);
        a();
    }

    static void a(SyncDisabledWarningView syncdisabledwarningview)
    {
        syncdisabledwarningview.c();
    }

    private void c()
    {
        Context context = getContext();
        if (com.facebook.common.j.a.a(context, "android.settings.SYNC_SETTINGS"))
        {
            context.startActivity(new Intent("android.settings.SYNC_SETTINGS"));
        } else
        if (com.facebook.common.j.a.a(context, "android.settings.SETTINGS"))
        {
            context.startActivity(new Intent("android.settings.SETTINGS"));
            return;
        }
    }

    public void a()
    {
        if (!((ConnectivityManager)getContext().getSystemService("connectivity")).getBackgroundDataSetting())
        {
            b.setText(a(com.facebook.o.sync_settings_warning_setting_background_data));
            a.setVisibility(0);
            return;
        } else
        {
            a.setVisibility(8);
            return;
        }
    }

    public boolean b()
    {
        return a.getVisibility() != 8;
    }
}
