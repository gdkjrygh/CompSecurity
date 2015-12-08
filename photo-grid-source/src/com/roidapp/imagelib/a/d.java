// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.a;

import android.opengl.GLES20;
import java.nio.IntBuffer;
import java.util.concurrent.Semaphore;

// Referenced classes of package com.roidapp.imagelib.a:
//            a

final class d
    implements Runnable
{

    final int a;
    final int b;
    final int c[];
    final Semaphore d;
    final a e;

    d(a a1, int i, int j, int ai[], Semaphore semaphore)
    {
        e = a1;
        a = i;
        b = j;
        c = ai;
        d = semaphore;
        super();
    }

    public final void run()
    {
        IntBuffer intbuffer = IntBuffer.allocate(a * b);
        GLES20.glReadPixels(0, 0, a, b, 6408, 5121, intbuffer);
        int ai[] = intbuffer.array();
        for (int i = 0; i < b; i++)
        {
            for (int j = 0; j < a; j++)
            {
                c[(b - i - 1) * a + j] = ai[a * i + j];
            }

        }

        d.release();
    }
}
