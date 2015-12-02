// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.emoji;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.View;
import android.view.Window;
import android.widget.LinearLayout;
import com.facebook.analytics.av;
import com.facebook.analytics.cb;
import com.facebook.debug.d.e;
import com.facebook.g;
import com.facebook.i;
import com.facebook.inject.t;

// Referenced classes of package com.facebook.orca.emoji:
//            a, b

public abstract class ComposerPopup extends DialogFragment
{

    protected int Z;
    protected int aa;
    protected int ab;
    protected int ac;
    protected boolean ad;
    protected int ae;
    protected int af;
    protected View ag;
    protected av ah;
    private b ai;

    public ComposerPopup()
    {
    }

    private void U()
    {
        e e1 = e.a("setupDialogWindow");
        Dialog dialog = c();
        Window window = dialog.getWindow();
        window.setSoftInputMode(1);
        window.addFlags(0x20000);
        android.view.WindowManager.LayoutParams layoutparams = dialog.getWindow().getAttributes();
        layoutparams.x = Z;
        layoutparams.y = aa;
        layoutparams.width = 0x7fffffff;
        layoutparams.gravity = ae;
        dialog.getWindow().setAttributes(layoutparams);
        dialog.requestWindowFeature(1);
        window.addFlags(32);
        window.addFlags(0x40000);
        e1.a();
    }

    static b a(ComposerPopup composerpopup)
    {
        return composerpopup.ai;
    }

    public static int b(Context context)
    {
        return context.getResources().getDimensionPixelOffset(g.message_composer_popup_nub_height);
    }

    protected void O()
    {
        LinearLayout linearlayout = (LinearLayout)a(ag, i.composer_popup_content_container);
        android.widget.LinearLayout.LayoutParams layoutparams = (android.widget.LinearLayout.LayoutParams)linearlayout.getLayoutParams();
        layoutparams.width = ac;
        layoutparams.height = ab - af;
        linearlayout.setLayoutParams(layoutparams);
    }

    protected void P()
    {
        if (ad)
        {
            ag.findViewById(i.composer_popup_arrow_above).setVisibility(0);
            return;
        } else
        {
            ag.findViewById(i.composer_popup_arrow_below).setVisibility(0);
            return;
        }
    }

    protected void Q()
    {
        if (n() instanceof Activity)
        {
            U();
        }
    }

    public boolean R()
    {
        return ad;
    }

    protected abstract String S();

    protected cb T()
    {
        cb cb1 = new cb("click");
        cb1.f(S());
        return cb1;
    }

    protected View a(View view, int j)
    {
        return view.findViewById(j);
    }

    public void a(Bundle bundle)
    {
        super.a(bundle);
        Z = k().getInt("x");
        aa = k().getInt("y");
        ae = k().getInt("gravity");
        ab = k().getInt("height");
        ac = k().getInt("width");
        ad = k().getBoolean("showArrowAbove");
        ah = (av)t.a(n()).a(com/facebook/analytics/av);
        af = b(n());
    }

    protected void a(b b1)
    {
        ai = b1;
    }

    protected void a(String s)
    {
        cb cb1 = T();
        cb1.b("action", s);
        ah.a(cb1);
    }

    public Dialog c(Bundle bundle)
    {
        return new a(this, n(), d());
    }

    public void onDismiss(DialogInterface dialoginterface)
    {
        super.onDismiss(dialoginterface);
        if (ai != null)
        {
            ai.a();
        }
    }
}
