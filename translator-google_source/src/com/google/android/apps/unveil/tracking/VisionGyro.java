// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.unveil.tracking;

import com.google.android.apps.unveil.env.v;

public class VisionGyro
{

    public VisionGyro()
    {
        constructNative();
    }

    public final float[] a(byte abyte0[], int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        nextFrameNative(abyte0, i, j);
        abyte0 = new float[9];
        obtainVgTransformNative(abyte0, false);
        this;
        JVM INSTR monitorexit ;
        return abyte0;
        abyte0;
        throw abyte0;
    }

    protected native void constructNative();

    protected native void destroyNative();

    protected native void nextFrameNative(byte abyte0[], int i, int j);

    protected native void obtainVgTransformNative(float af[], boolean flag);

    static 
    {
        v.c("clientvision");
    }
}
