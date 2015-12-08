// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.usermedia;


public final class q
{

    private Long a;
    private int b;

    public q(Long long1, int i)
    {
        a = long1;
        b = i;
    }

    public final Long a()
    {
        return a;
    }

    public final int b()
    {
        return b;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null)
            {
                return false;
            }
            if (getClass() != obj.getClass())
            {
                return false;
            }
            obj = (q)obj;
            if (a == null)
            {
                if (((q) (obj)).a != null)
                {
                    return false;
                }
            } else
            if (!a.equals(((q) (obj)).a))
            {
                return false;
            }
            if (b != ((q) (obj)).b)
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        int i;
        if (a == null)
        {
            i = 0;
        } else
        {
            i = a.hashCode();
        }
        return (i + 31) * 31 + b;
    }
}
