// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


public final class BitArray
{

    public static boolean a[];
    public static int b;

    public static native void nativeReverse(boolean aflag[]);

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(b);
        int i = 0;
        while (i < b) 
        {
            if ((i & 7) == 0)
            {
                stringbuffer.append(' ');
            }
            char c;
            if (a[i])
            {
                c = 'X';
            } else
            {
                c = '.';
            }
            stringbuffer.append(c);
            i++;
        }
        return stringbuffer.toString();
    }
}
