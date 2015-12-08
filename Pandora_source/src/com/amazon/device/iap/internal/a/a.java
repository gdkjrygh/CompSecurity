// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazon.device.iap.internal.a;

import android.util.Log;

public class a
    implements com.amazon.device.iap.internal.a
{

    public a()
    {
    }

    private static String a(String s)
    {
        return (new StringBuilder()).append("In App Purchasing SDK - Sandbox Mode: ").append(s).toString();
    }

    public void a(String s, String s1)
    {
        Log.d(s, a(s1));
    }

    public boolean a()
    {
        return true;
    }

    public void b(String s, String s1)
    {
        Log.e(s, a(s1));
    }

    public boolean b()
    {
        return true;
    }
}
