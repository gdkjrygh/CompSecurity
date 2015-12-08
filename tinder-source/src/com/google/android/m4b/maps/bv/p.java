// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.CharBuffer;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

final class p
{

    final float a[];
    final char b[];
    final int c;
    final int d;
    private final FloatBuffer e;
    private final FloatBuffer f;
    private final CharBuffer g;
    private final int h;

    public p(int i, int j)
    {
        if (i < 2 || i >= 0x10000)
        {
            throw new IllegalArgumentException("w");
        }
        if (j < 2 || j >= 0x10000)
        {
            throw new IllegalArgumentException("h");
        }
        if (i * j >= 0x10000)
        {
            throw new IllegalArgumentException("w * h >= 65536");
        }
        c = i;
        d = j;
        i *= j;
        a = new float[i * 3];
        e = ByteBuffer.allocateDirect(i * 4 * 3).order(ByteOrder.nativeOrder()).asFloatBuffer();
        f = ByteBuffer.allocateDirect(i * 4 * 2).order(ByteOrder.nativeOrder()).asFloatBuffer();
        int l = c - 1;
        int i1 = d - 1;
        i = l * i1 * 6;
        h = i;
        b = new char[i];
        g = ByteBuffer.allocateDirect(i * 2).order(ByteOrder.nativeOrder()).asCharBuffer();
        j = 0;
        i = 0;
        for (; j < i1; j++)
        {
            for (int k = 0; k < l; k++)
            {
                int k1 = c * j + k;
                char c1 = (char)(k1 + 1);
                char c2 = (char)(c + k1);
                char c3 = (char)(c + k1 + 1);
                char ac[] = b;
                int j1 = i + 1;
                ac[i] = (char)k1;
                ac = b;
                i = j1 + 1;
                ac[j1] = c1;
                ac = b;
                j1 = i + 1;
                ac[i] = c2;
                ac = b;
                i = j1 + 1;
                ac[j1] = c1;
                ac = b;
                j1 = i + 1;
                ac[i] = c2;
                ac = b;
                i = j1 + 1;
                ac[j1] = c3;
            }

        }

        g.position(0);
        g.put(b);
        g.position(0);
    }

    final void a(int i, int j, float f1, float f2, float f3, float f4, float f5)
    {
        if (i < 0 || i >= c)
        {
            throw new IllegalArgumentException("i");
        }
        if (j < 0 || j >= d)
        {
            throw new IllegalArgumentException("j");
        } else
        {
            i = c * j + i;
            j = i * 3;
            a[j] = f1;
            a[j + 1] = f2;
            a[j + 2] = f3;
            e.put(j, f1);
            e.put(j + 1, f2);
            e.put(j + 2, f3);
            i *= 2;
            f.put(i, f4);
            f.put(i + 1, f5);
            return;
        }
    }

    public final void a(GL10 gl10, boolean flag)
    {
        gl10.glEnableClientState(32884);
        gl10.glVertexPointer(3, 5126, 0, e);
        if (flag)
        {
            gl10.glEnableClientState(32888);
            gl10.glTexCoordPointer(2, 5126, 0, f);
            gl10.glEnable(3553);
        } else
        {
            gl10.glDisableClientState(32888);
            gl10.glDisable(3553);
        }
        gl10.glDrawElements(4, h, 5123, g);
    }
}
