// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.util;


public final class br
{

    public static boolean a(long l, int i)
    {
        return System.currentTimeMillis() > (long)(0x36ee80 * i) + l;
    }
}
