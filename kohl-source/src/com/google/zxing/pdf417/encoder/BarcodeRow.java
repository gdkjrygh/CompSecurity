// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.pdf417.encoder;


final class BarcodeRow
{

    private int currentLocation;
    private final byte row[];

    BarcodeRow(int i)
    {
        row = new byte[i];
        currentLocation = 0;
    }

    void addBar(boolean flag, int i)
    {
        for (int j = 0; j < i; j++)
        {
            int k = currentLocation;
            currentLocation = k + 1;
            set(k, flag);
        }

    }

    byte[] getScaledRow(int i)
    {
        byte abyte0[] = new byte[row.length * i];
        for (int j = 0; j < abyte0.length; j++)
        {
            abyte0[j] = row[j / i];
        }

        return abyte0;
    }

    void set(int i, byte byte0)
    {
        row[i] = byte0;
    }

    void set(int i, boolean flag)
    {
        byte abyte0[] = row;
        int j;
        if (flag)
        {
            j = 1;
        } else
        {
            j = 0;
        }
        abyte0[i] = (byte)j;
    }
}
