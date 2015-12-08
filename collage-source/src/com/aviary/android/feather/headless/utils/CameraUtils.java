// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aviary.android.feather.headless.utils;


// Referenced classes of package com.aviary.android.feather.headless.utils:
//            a

public final class CameraUtils
{

    public CameraUtils()
    {
    }

    public static final a a()
    {
        return a(n_getSmallMp());
    }

    static a a(int i)
    {
        a aa[] = (a[])com/aviary/android/feather/headless/utils/a.getEnumConstants();
        if (i >= 0 && i < aa.length)
        {
            return aa[i];
        } else
        {
            return a.b;
        }
    }

    private static native int n_getLargeMp();

    private static native int n_getMaximumMp();

    private static native int n_getMediumMp();

    private static native int n_getSmallMp();

    static 
    {
        System.loadLibrary("cutils");
        System.loadLibrary("aviary_moalite");
        System.loadLibrary("aviary_native");
    }
}
