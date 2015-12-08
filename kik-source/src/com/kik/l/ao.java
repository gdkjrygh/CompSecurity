// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.l;


public final class ao
{

    public static String a(int i)
    {
        StringBuilder stringbuilder = new StringBuilder(i * 2 - 1);
        stringbuilder.append("?");
        for (int j = 1; j < i; j++)
        {
            stringbuilder.append(",?");
        }

        return stringbuilder.toString();
    }
}
