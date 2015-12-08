// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pandora.android.data;


public class t
{

    public final String a;
    public final String b;

    public t(String s, String s1)
    {
        a = s;
        b = s1;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (t)obj;
            if (a == null ? ((t) (obj)).a != null : !a.equals(((t) (obj)).a))
            {
                return false;
            }
            if (b == null ? ((t) (obj)).b != null : !b.equals(((t) (obj)).b))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        int j = 0;
        int i;
        if (a != null)
        {
            i = a.hashCode();
        } else
        {
            i = 0;
        }
        if (b != null)
        {
            j = b.hashCode();
        }
        return i * 31 + j;
    }
}
