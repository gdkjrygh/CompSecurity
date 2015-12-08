// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.preprocess;


public final class c
    implements Comparable
{

    public final String a;
    public final int b[];
    public final int c;
    public final int d;
    public int e;

    c(String s, int ai[], int i, int j)
    {
        a = s;
        b = ai;
        c = i;
        d = j;
        e = 0;
    }

    public final int compareTo(Object obj)
    {
        obj = (c)obj;
        int j = ((c) (obj)).e - e;
        int i = j;
        if (j == 0)
        {
            i = d - ((c) (obj)).d;
        }
        return i;
    }
}
