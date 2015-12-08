// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.miteksystems.misnap;

import android.os.Handler;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;

// Referenced classes of package com.miteksystems.misnap:
//            MiSnap, u, MiSnapAPI, i

final class w
    implements Runnable
{

    final u a;

    w(u u1)
    {
        a = u1;
        super();
    }

    public final void run()
    {
        MiSnap.i = false;
        u.a = false;
        if (u.n(a).a.aj() == 0)
        {
            u.a(a, false);
            u.a = false;
            u.A(a).setVisibility(4);
            u.B(a).setVisibility(0);
            u.b(a, true);
            u.n(a).j();
            android.widget.RelativeLayout.LayoutParams layoutparams;
            if (!u.n(a).a.b())
            {
                a.j.sendEmptyMessage(12);
            } else
            {
                a.j.sendEmptyMessage(15);
            }
            layoutparams = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams.setMargins(0, 0, 0, u.C(a));
            u.D(a).setLayoutParams(layoutparams);
        } else
        {
            u.a(a, true);
            android.widget.RelativeLayout.LayoutParams layoutparams1 = new android.widget.RelativeLayout.LayoutParams(-1, -1);
            layoutparams1.setMargins(0, 0, 0, u.C(a));
            u.D(a).setLayoutParams(layoutparams1);
            u.A(a).setVisibility(0);
            u.B(a).setVisibility(0);
            a.b(true);
            u.b(a, false);
            u.E(a).setVisibility(8);
            if (u.n(a).a.at())
            {
                u.F(a).setText(R.string.dialog_mitek_capture);
                a.l.a(u.F(a), R.string.dialog_mitek_capture);
            } else
            {
                u.F(a).setText(u.n(a).a.ai());
                a.l.a(u.F(a), u.n(a).a.ai());
            }
        }
        a.postInvalidate();
    }
}
