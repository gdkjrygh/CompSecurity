// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.jni;

import com.facebook.soloader.SoLoader;

public class Countable
{

    private long mInstance;

    public Countable()
    {
        mInstance = 0L;
    }

    public native void dispose();

    protected void finalize()
    {
        dispose();
        super.finalize();
    }

    static 
    {
        SoLoader.a("fbjni");
    }
}
