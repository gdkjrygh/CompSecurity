// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.m4b.maps.bv;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import javax.microedition.khronos.opengles.GL10;

// Referenced classes of package com.google.android.m4b.maps.bv:
//            ab

static final class a
{

    final FloatBuffer a;
    private final int b;
    private final int c;
    private final ByteBuffer d;
    private final ByteBuffer e;

    private static ByteBuffer a(byte abyte0[])
    {
        int i = abyte0.length;
        ByteBuffer bytebuffer = ByteBuffer.allocateDirect(i).order(ByteOrder.nativeOrder());
        bytebuffer.put(abyte0, 0, i);
        bytebuffer.position(0);
        return bytebuffer;
    }

    private static byte[] a(int i)
    {
        byte abyte0[] = new byte[i];
        for (int j = 0; j < i; j++)
        {
            abyte0[j] = (byte)j;
        }

        return abyte0;
    }

    final void a(GL10 gl10)
    {
        gl10.glEnableClientState(32884);
        gl10.glVertexPointer(3, 5126, 0, a);
        gl10.glDisableClientState(32888);
        gl10.glDisable(3553);
        gl10.glDrawElements(6, b, 5121, d);
    }

    public GL10(float af[])
    {
        this(af, a(af.length / 3));
    }

    private a(float af[], byte abyte0[])
    {
        this(af, abyte0, abyte0);
    }

    private <init>(float af[], byte abyte0[], byte abyte1[])
    {
        a = ByteBuffer.allocateDirect(af.length * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
        a.put(af, 0, af.length);
        a.position(0);
        b = abyte0.length;
        c = abyte1.length;
        if (b > 256 || c > 256)
        {
            throw new IllegalArgumentException("Only up to 256 points");
        } else
        {
            d = a(abyte0);
            e = a(abyte1);
            return;
        }
    }
}
