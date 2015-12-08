// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.cloudlib.ads;

import com.jirbo.adcolony.AdColonyAdAvailabilityListener;

public final class a
    implements AdColonyAdAvailabilityListener
{

    private static a a;
    private boolean b;

    public a()
    {
        b = false;
    }

    public static a a()
    {
        if (a == null)
        {
            a = new a();
        }
        return a;
    }

    public static boolean b()
    {
        if (a == null)
        {
            return false;
        } else
        {
            return a.b;
        }
    }

    public final void onAdColonyAdAvailabilityChange(boolean flag, String s)
    {
        b = flag;
    }
}
