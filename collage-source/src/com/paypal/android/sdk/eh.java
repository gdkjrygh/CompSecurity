// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.paypal.android.sdk;

import android.os.Build;

public final class eh
{

    public static String a = "Android";
    public static String b = "mobile";
    public static String c = "mplandroid";
    public static String d;
    public static String e;

    static 
    {
        d = android.os.Build.VERSION.RELEASE;
        e = Build.MODEL;
    }
}
