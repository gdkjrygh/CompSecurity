// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public class dhk
{

    private final Activity a;

    public dhk(Activity activity)
    {
        a = activity;
    }

    public final void a(msp msp)
    {
        msn msn1 = (new msn()).a(new msm(msp));
        msp = (nwm)olm.b(a, nwm);
        if (msp != null)
        {
            msp = msp.b();
            if (msp == null)
            {
                msp = null;
            } else
            {
                msp = ((am) (msp)).R;
            }
            if (msp != null)
            {
                msn1.a(msp);
            }
        } else
        {
            msn1.a(a);
        }
        mry.a(a, 4, msn1);
    }
}
