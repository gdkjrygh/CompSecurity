// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.activity;

import android.view.Window;
import android.widget.Button;
import android.widget.TextView;
import com.facebook.base.activity.i;
import com.facebook.k;

// Referenced classes of package com.facebook.orca.activity:
//            i, f, g, h

public abstract class e extends i
{

    private TextView p;
    private TextView q;
    private Button r;
    private Button s;
    private Button t;

    public e()
    {
    }

    protected void a(com.facebook.orca.activity.i i1)
    {
        Window window = getWindow();
        android.view.WindowManager.LayoutParams layoutparams = window.getAttributes();
        layoutparams.type = 1003;
        window.setAttributes(layoutparams);
        window.addFlags(0x20000);
        setContentView(k.orca_confirm_action);
        p = (TextView)b(com.facebook.i.confirm_title);
        q = (TextView)b(com.facebook.i.confirm_message);
        r = (Button)b(com.facebook.i.confirm_okay_button);
        s = (Button)b(com.facebook.i.confirm_neutral_button);
        t = (Button)b(com.facebook.i.confirm_cancel_button);
        p.setText(i1.a());
        if (i1.b() != null)
        {
            q.setText(i1.b());
        } else
        {
            q.setVisibility(8);
        }
        r.setText(i1.c());
        if (i1.d() != null)
        {
            s.setText(i1.d());
        } else
        {
            s.setVisibility(8);
        }
        r.setOnClickListener(new f(this));
        s.setOnClickListener(new g(this));
        t.setOnClickListener(new h(this));
    }

    protected void j()
    {
    }

    protected void k()
    {
    }

    protected void l()
    {
        finish();
    }
}
