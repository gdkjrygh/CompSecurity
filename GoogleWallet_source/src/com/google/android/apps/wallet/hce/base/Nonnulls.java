// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.hce.base;


public final class Nonnulls
{

    public static Object nonnull(Object obj)
    {
        return nonnull(obj, "Parameter is null.");
    }

    private static Object nonnull(Object obj, String s)
    {
        if (obj == null)
        {
            throw new NullPointerException(s);
        } else
        {
            return obj;
        }
    }
}
