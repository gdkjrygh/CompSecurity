// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import com.snapchat.android.Timber;

public final class IR
{

    private static final String TAG = "ScreenRotationConverter";
    private final int mRotation;

    public IR(int i)
    {
        mRotation = i;
    }

    public final int a()
    {
        mRotation;
        JVM INSTR lookupswitch 3: default 40
    //                   1: 81
    //                   256: 91
    //                   4096: 86;
           goto _L1 _L2 _L3 _L4
_L1:
        byte byte0 = 3;
_L6:
        Timber.c("ScreenRotationConverter", (new StringBuilder("Snap orientation is")).append(mRotation).append(" return ").append(byte0).toString(), new Object[0]);
        return byte0;
_L2:
        byte0 = 0;
        continue; /* Loop/switch isn't completed */
_L4:
        byte0 = 1;
        continue; /* Loop/switch isn't completed */
_L3:
        byte0 = 2;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
