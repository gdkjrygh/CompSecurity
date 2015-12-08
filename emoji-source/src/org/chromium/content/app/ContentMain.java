// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.app;

import android.content.Context;

public class ContentMain
{

    public ContentMain()
    {
    }

    public static void initApplicationContext(Context context)
    {
        nativeInitApplicationContext(context);
    }

    private static native void nativeInitApplicationContext(Context context);

    private static native int nativeStart();

    public static int start()
    {
        return nativeStart();
    }
}
