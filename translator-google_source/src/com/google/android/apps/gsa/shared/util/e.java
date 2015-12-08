// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.gsa.shared.util;

import java.io.InputStream;
import java.nio.ByteBuffer;

public final class e
{

    public static int a(InputStream inputstream, byte abyte0[], int i, int j)
    {
        if (j < 0)
        {
            throw new IndexOutOfBoundsException("len is negative");
        }
        int k = 0;
        do
        {
            if (k >= j)
            {
                break;
            }
            int l = inputstream.read(abyte0, i + k, j - k);
            if (l == -1)
            {
                break;
            }
            k += l;
        } while (true);
        return k;
    }

    public static int a(ByteBuffer bytebuffer, ByteBuffer bytebuffer1)
    {
        int i = bytebuffer.limit();
        int j;
        j = Math.min(bytebuffer1.remaining(), bytebuffer.remaining());
        bytebuffer.limit(bytebuffer.position() + j);
        bytebuffer1.put(bytebuffer);
        bytebuffer.limit(i);
        return j;
        bytebuffer1;
        bytebuffer.limit(i);
        throw bytebuffer1;
    }
}
