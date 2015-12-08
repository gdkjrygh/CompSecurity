// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.a.a.a;


public final class k
{

    public static boolean a(String s)
    {
        boolean flag1 = false;
        boolean flag;
        if (s.equals("POST") || s.equals("PUT") || s.equals("PATCH"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (flag || s.equals("DELETE"))
        {
            flag1 = true;
        }
        return flag1;
    }
}
