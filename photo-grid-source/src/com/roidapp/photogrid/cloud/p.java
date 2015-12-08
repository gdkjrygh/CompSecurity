// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;


final class p
    implements Comparable
{

    int a;
    int b;
    String c;
    String d;
    private long e;

    p(int i, String s, String s1)
    {
        b = i;
        c = s;
        d = s1;
    }

    p(long l, int i, int j, String s)
    {
        e = l;
        a = j;
        b = i;
        c = s;
    }

    p(p p1, long l, int i)
    {
        e = l;
        a = i;
        b = p1.b;
        c = p1.c;
        d = p1.d;
    }

    public final volatile int compareTo(Object obj)
    {
        long l = ((p)obj).e;
        long l1 = e;
        if (l < l1)
        {
            return -1;
        }
        return l != l1 ? 1 : 0;
    }
}
