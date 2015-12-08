// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.common;


public final class BitMatrix
{

    public final int a;
    public final int b;
    public final int c;
    public final int d[];

    final native void nativeGetColumn(int ai[], int i, int j, int k, boolean aflag[]);

    final native void nativeGetRow(int ai[], int i, int j, int k, boolean aflag[]);

    public final String toString()
    {
        StringBuffer stringbuffer = new StringBuffer(b * (a + 1));
        for (int i = 0; i < b; i++)
        {
            int j = 0;
            while (j < a) 
            {
                int k = c;
                String s;
                boolean flag;
                if ((d[k * i + (j >> 5)] >>> (j & 0x1f) & 1) != 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    s = "X ";
                } else
                {
                    s = "  ";
                }
                stringbuffer.append(s);
                j++;
            }
            stringbuffer.append('\n');
        }

        return stringbuffer.toString();
    }
}
