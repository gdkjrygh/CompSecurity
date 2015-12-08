// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.google.android.apps.moviemaker.fragments.PlayerScreenFragment;

public final class cfo extends ogq
{

    private PlayerScreenFragment b;

    public cfo(PlayerScreenFragment playerscreenfragment, msp msp)
    {
        b = playerscreenfragment;
        super(msp);
    }

    protected final msm a(msp msp)
    {
        String s = PlayerScreenFragment.j(b).c.b.X;
        msp msp1 = pwp.m;
        msp = s;
        if (s == null)
        {
            msp = "";
        }
        return new ogv(msp1, new ogw[] {
            ogw.a(1, msp)
        });
    }
}
