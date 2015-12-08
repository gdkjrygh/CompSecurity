// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.spongycastle.crypto.modes.gcm;

import org.spongycastle.crypto.util.Pack;

abstract class a
{

    static void a(int ai[])
    {
        boolean flag;
        int i;
        int j;
        if ((ai[3] & 1) != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = 0;
        j = 0;
        do
        {
            int k = ai[j];
            ai[j] = i | k >>> 1;
            j++;
            if (j == 4)
            {
                break;
            }
            i = k << 31;
        } while (true);
        if (flag)
        {
            ai[0] = ai[0] ^ 0xe1000000;
        }
    }

    static void a(int ai[], int ai1[])
    {
        for (int i = 3; i >= 0; i--)
        {
            ai[i] = ai[i] ^ ai1[i];
        }

    }

    static int[] a(byte abyte0[])
    {
        return (new int[] {
            Pack.a(abyte0, 0), Pack.a(abyte0, 4), Pack.a(abyte0, 8), Pack.a(abyte0, 12)
        });
    }

    static void b(int ai[])
    {
        int l = ai[3];
        int i = 0;
        int k = 0;
        do
        {
            int i1 = ai[k];
            ai[k] = i | i1 >>> 8;
            k++;
            if (k == 4)
            {
                break;
            }
            i = i1 << 24;
        } while (true);
        for (int j = 7; j >= 0; j--)
        {
            if ((1 << j & l) != 0)
            {
                ai[0] = ai[0] ^ 0xe1000000 >>> 7 - j;
            }
        }

    }
}
