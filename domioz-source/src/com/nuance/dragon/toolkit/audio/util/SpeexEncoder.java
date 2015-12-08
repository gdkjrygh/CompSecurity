// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.audio.util;

import com.nuance.dragon.toolkit.audio.f;
import com.nuance.dragon.toolkit.audio.g;
import com.nuance.dragon.toolkit.audio.i;
import com.nuance.dragon.toolkit.d.e;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.util.ArrayList;

// Referenced classes of package com.nuance.dragon.toolkit.audio.util:
//            SpeexDecoder

public class SpeexEncoder
{

    public static boolean a = true;
    private com.nuance.dragon.toolkit.audio.e b;
    private com.nuance.dragon.toolkit.audio.e c;
    private int d;
    private i e;
    private long f;

    public SpeexEncoder()
    {
        e = i.b;
    }

    private static native int encodeNative(long l, short aword0[], int j, int k, OutputStream outputstream, int ai[], int ai1[]);

    private static native long initializeNative(int ai[], int ai1[], int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3, int j3);

    private static native void releaseNative(long l);

    public final void a(com.nuance.dragon.toolkit.audio.e e1, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2)
    {
        f f1 = e1.m;
        f1 = f.b;
        b = e1;
        c = new com.nuance.dragon.toolkit.audio.e(f.a, b.l);
        int ai[];
        int k2;
        char c1;
        byte byte0;
        if (e1.l == 8000)
        {
            k2 = 0;
            c1 = '\u1F40';
            byte0 = 6;
        } else
        {
            k2 = 1;
            c1 = '\u3E80';
            byte0 = 8;
        }
        e1 = new int[1];
        ai = new int[1];
        if (f != 0L)
        {
            releaseNative(f);
        }
        f = initializeNative(ai, e1, k2, c1, 3, byte0, j, k, l, i1, j1, k1, l1, i2, j2);
        d = ai[0];
    }

    public final g[] a(short aword0[], int j, int k)
    {
        if (k % d != 0)
        {
            com.nuance.dragon.toolkit.d.e.d(this, (new StringBuilder("the buffer length (")).append(k).append(") is NOT divisible by Speex encoder frame size (").append(d).append(")!!!").toString());
            return new g[0];
        }
        if (f == 0L)
        {
            com.nuance.dragon.toolkit.d.e.d(this, "Speex encoder isn't initialized");
            return new g[0];
        }
        short aword1[] = new short[aword0.length];
        System.arraycopy(aword0, 0, aword1, 0, k);
        aword0 = new ArrayList();
        int ai[] = new int[1];
        int ai1[] = new int[1];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        int j1 = k;
        k = j;
        do
        {
            bytearrayoutputstream.reset();
            if (encodeNative(f, aword1, k, j1, bytearrayoutputstream, ai, ai1) >= 0)
            {
                j1 -= ai[0];
                int k1 = k + ai[0];
                aword0.add(new g(b, bytearrayoutputstream.toByteArray(), c.a(ai[0]), e));
                int l1 = ai1[0];
                if (l1 == 1)
                {
                    i l = i.b;
                    e = i.c;
                    j = j1;
                    k = k1;
                } else
                {
                    k = k1;
                    j = j1;
                    if (l1 == 2)
                    {
                        i i1 = i.c;
                        e = i.b;
                        k = k1;
                        j = j1;
                    }
                }
            } else
            {
                j = 0;
            }
            j1 = j;
            if (j <= 0)
            {
                return (g[])aword0.toArray(new g[aword0.size()]);
            }
        } while (true);
    }

    static 
    {
        try
        {
            System.loadLibrary("dmt_speex");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            com.nuance.dragon.toolkit.d.e.a(com/nuance/dragon/toolkit/audio/util/SpeexDecoder, "Failed to load native library.", unsatisfiedlinkerror);
            a = false;
        }
    }
}
