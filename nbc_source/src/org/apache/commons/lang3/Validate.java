// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.commons.lang3;


public class Validate
{

    public static void inclusiveBetween(long l, long l1, long l2, String s)
    {
        if (l2 < l || l2 > l1)
        {
            throw new IllegalArgumentException(String.format(s, new Object[0]));
        } else
        {
            return;
        }
    }
}
