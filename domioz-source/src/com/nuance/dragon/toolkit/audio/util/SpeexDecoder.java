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
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.ShortBuffer;

public class SpeexDecoder
{

    public static boolean a = true;
    private com.nuance.dragon.toolkit.audio.e b;
    private com.nuance.dragon.toolkit.audio.e c;
    private int d;
    private long e;

    public SpeexDecoder()
    {
    }

    private static native int decodeNative(long l, byte abyte0[], int i, int j, OutputStream outputstream);

    private static native long initializeNative(int ai[], int ai1[], int i, int j);

    private static native void releaseNative(long l);

    public final void a(com.nuance.dragon.toolkit.audio.e e1)
    {
        f f1 = e1.m;
        f1 = f.b;
        int i;
        if (e1.l != 16000)
        {
            i = e1.l;
        }
        b = e1;
        c = new com.nuance.dragon.toolkit.audio.e(f.a, b.l);
        int ai[];
        int j;
        if (e1.l == 16000)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        j = e1.l;
        e1 = new int[1];
        ai = new int[1];
        if (e != 0L)
        {
            releaseNative(e);
        }
        e = initializeNative(ai, e1, i, j);
        d = ai[0];
    }

    public final g[] a(byte abyte0[], int i, i j)
    {
        if (e == 0L)
        {
            com.nuance.dragon.toolkit.d.e.d(this, "Speex decoder isn't initialized");
            return new g[0];
        }
        Object obj = new ByteArrayOutputStream();
        if (decodeNative(e, abyte0, 0, i, ((OutputStream) (obj))) >= 0)
        {
            abyte0 = ((ByteArrayOutputStream) (obj)).toByteArray();
            obj = ByteBuffer.wrap(abyte0);
            ((ByteBuffer) (obj)).order(ByteOrder.LITTLE_ENDIAN);
            obj = ((ByteBuffer) (obj)).asShortBuffer();
            abyte0 = new short[abyte0.length / 2];
            ((ShortBuffer) (obj)).get(abyte0);
            return (new g[] {
                new g(c, abyte0, j)
            });
        } else
        {
            return new g[0];
        }
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
