// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk;

import android.util.Log;

public final class j
{

    public static boolean a = true;
    public static boolean b = true;

    public static void a(String s, String s1)
    {
        if (a)
        {
            Log.i(s, s1, null);
        }
    }

    public static void a(String s, Throwable throwable)
    {
        if (a)
        {
            Log.i(s, (new StringBuilder(" ")).append(throwable).toString());
        }
    }

}
