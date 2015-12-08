// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bo;

import java.io.DataInput;
import java.io.DataOutput;

public final class am
{

    public static int a(DataInput datainput)
    {
        int i = datainput.readUnsignedByte();
        if (i >= 128) goto _L2; else goto _L1
_L1:
        return i;
_L2:
        int k = datainput.readUnsignedByte();
        int j = i & 0x7f | (k & 0x7f) << 7;
        i = j;
        if (k < 128)
        {
            continue;
        }
        k = datainput.readUnsignedByte();
        j |= (k & 0x7f) << 14;
        i = j;
        if (k < 128)
        {
            continue;
        }
        k = datainput.readUnsignedByte();
        j |= (k & 0x7f) << 21;
        i = j;
        if (k < 128)
        {
            continue;
        }
        int l = datainput.readUnsignedByte();
        k = j | (l & 0x7f) << 28;
        i = k;
        if (l < 128)
        {
            continue;
        }
        j = l;
        do
        {
            i = k;
            if (j < 128)
            {
                continue;
            }
            j = datainput.readUnsignedByte();
        } while (true);
        if (true) goto _L1; else goto _L3
_L3:
    }

    public static void a(DataOutput dataoutput, int i)
    {
        if (i < 0)
        {
            long l = 0x100000000L + (long)i;
            dataoutput.write((int)(l | 128L));
            dataoutput.write((int)(l >> 7 | 128L));
            dataoutput.write((int)(l >> 14 | 128L));
            dataoutput.write((int)(l >> 21 | 128L));
            dataoutput.write((int)(l >> 28));
            return;
        }
        if (i < 128)
        {
            dataoutput.write(i);
            return;
        }
        if (i < 16384)
        {
            dataoutput.write(i | 0x80);
            dataoutput.write(i >> 7);
            return;
        }
        if (i < 0x200000)
        {
            dataoutput.write(i | 0x80);
            dataoutput.write(i >> 7 | 0x80);
            dataoutput.write(i >> 14);
            return;
        }
        if (i < 0x10000000)
        {
            dataoutput.write(i | 0x80);
            dataoutput.write(i >> 7 | 0x80);
            dataoutput.write(i >> 14 | 0x80);
            dataoutput.write(i >> 21);
            return;
        } else
        {
            dataoutput.write(i | 0x80);
            dataoutput.write(i >> 7 | 0x80);
            dataoutput.write(i >> 14 | 0x80);
            dataoutput.write(i >> 21 | 0x80);
            dataoutput.write(i >> 28);
            return;
        }
    }

    public static int b(DataInput datainput)
    {
        int i = a(datainput);
        return -(i & 1) ^ i >>> 1;
    }
}
