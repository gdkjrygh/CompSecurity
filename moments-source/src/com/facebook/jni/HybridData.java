// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.jni;

import com.facebook.soloader.SoLoader;

public class HybridData
{

    private long mNativePointer;

    public HybridData()
    {
        mNativePointer = 0L;
    }

    protected void finalize()
    {
        resetNative();
        super.finalize();
    }

    public native void resetNative();

    static 
    {
        SoLoader.a("fbjni");
    }
}
