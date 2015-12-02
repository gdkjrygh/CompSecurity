// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.fdlimit;

import com.facebook.debug.log.b;

public class FdLimitNative
{

    public static final Class a = com/facebook/fdlimit/FdLimitNative;
    private static boolean b = false;

    private FdLimitNative()
    {
    }

    static native int getHardFdLimit();

    static native int getSoftFdLimit();

    static native void setFdLimit(int i, int j);

    static 
    {
        try
        {
            System.loadLibrary("fb_fdlimit");
            b = true;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            b = false;
            com.facebook.debug.log.b.e("FdLimitOverride", (new StringBuilder()).append("got exception: ").append(unsatisfiedlinkerror.toString()).toString());
        }
    }
}
