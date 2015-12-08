// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.app.Activity;

public final class cis
{

    private final Activity a;
    private final bpa b;

    public cis(Activity activity, bpa bpa1)
    {
        a = activity;
        b = bpa1;
    }

    public final void a(msp msp)
    {
        am am1;
        msp = (new msn()).a(new msm(msp));
        am1 = b.v();
        if (am1 == null) goto _L2; else goto _L1
_L1:
        android.view.View view = am1.R;
        if (view == null) goto _L4; else goto _L3
_L3:
        msp.a(view);
_L2:
        mry.a(a, 4, msp);
        return;
_L4:
        if (am1 instanceof cgz)
        {
            msp.a(((cgz)am1).r());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }
}
