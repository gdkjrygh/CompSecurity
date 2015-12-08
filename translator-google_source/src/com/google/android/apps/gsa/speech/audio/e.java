// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.speech.audio;

import com.google.android.apps.gsa.speech.audio.a.a;
import com.google.common.a.c;
import com.google.common.base.p;
import java.io.IOException;
import java.io.InputStream;

public final class e extends a
{

    private final InputStream a;
    private final int b;
    private final int c;
    private int d;
    private byte e[];
    private volatile boolean f;

    public e(InputStream inputstream, int i, int j)
    {
        boolean flag1 = true;
        super();
        p.a(inputstream);
        boolean flag;
        if (i > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "channelCount must be larger than 0.");
        if (j >= 0 && j < i)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        p.a(flag, "selectedChannel must be between 0 and channelCount - 1");
        a = inputstream;
        b = i;
        c = j;
    }

    public final void close()
    {
        e = null;
        com.google.common.a.c.a(a);
        f = true;
    }

    public final int read(byte abyte0[], int i, int j)
    {
        if (f)
        {
            throw new IOException("Stream is closed");
        }
        j = b * j;
        if (e == null || e.length < j)
        {
            e = new byte[j];
        }
        int j1 = a.read(e, 0, j);
        if (j1 == -1)
        {
            return -1;
        }
        if (j1 % 2 != 0)
        {
            throw new IOException("Wrapped input stream returned a partial sample.");
        }
        int l = 0;
        int k = i;
        do
        {
            if (l >= j1)
            {
                break;
            }
            int i1;
            int l1;
            if (d == c)
            {
                int k1 = k + 1;
                byte abyte1[] = e;
                int i2 = l + 1;
                abyte0[k] = abyte1[l];
                i1 = k1 + 1;
                abyte1 = e;
                j = i2 + 1;
                abyte0[k1] = abyte1[i2];
            } else
            {
                j = l + 2;
                i1 = k;
            }
            l1 = d + 1;
            d = l1;
            l = j;
            k = i1;
            if (l1 >= b)
            {
                d = 0;
                l = j;
                k = i1;
            }
        } while (true);
        return k - i;
    }
}
