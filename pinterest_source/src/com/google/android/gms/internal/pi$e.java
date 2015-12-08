// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;


public class 
{

    public static int ck(String s)
    {
        if (s.equals("person"))
        {
            return 0;
        }
        if (s.equals("page"))
        {
            return 1;
        } else
        {
            throw new IllegalArgumentException((new StringBuilder("Unknown objectType string: ")).append(s).toString());
        }
    }
}
