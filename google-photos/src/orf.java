// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;

public class orf
{

    public final Context a;

    public orf(Context context)
    {
        a = context;
    }

    public void a(int i)
    {
        bgi.a[i - 1];
        JVM INSTR tableswitch 1 1: default 24
    //                   1 65;
           goto _L1 _L2
_L1:
        msp msp = null;
_L4:
        if (msp != null)
        {
            mry.a(a, 30, (new msn()).a(new msm(msp)).a(a));
        }
        return;
_L2:
        msp = pwu.N;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
