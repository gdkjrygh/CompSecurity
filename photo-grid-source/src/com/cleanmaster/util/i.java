// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.util;


public class i
{

    public static void a(boolean flag, String s)
    {
        if (!flag)
        {
            throw new IllegalStateException(s);
        } else
        {
            return;
        }
    }
}
