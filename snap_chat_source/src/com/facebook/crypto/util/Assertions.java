// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.crypto.util;


public class Assertions
{

    public static void checkState(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalStateException(String.valueOf(s));
        } else
        {
            return;
        }
    }
}
