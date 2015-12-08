// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.support.v7.widget.SwitchCompat;
import android.view.View;

final class cgr
    implements android.view.View.OnClickListener
{

    private cgp a;

    cgr(cgp cgp1)
    {
        a = cgp1;
        super();
    }

    public final void onClick(View view)
    {
        msm msm;
        if (cgp.b(a).isChecked())
        {
            msm = cgp.t();
        } else
        {
            msm = cgp.u();
        }
        b.a(view, msm);
        mry.a(view, 4);
        cgp.a(a).a(cgp.b(a).isChecked());
    }
}
