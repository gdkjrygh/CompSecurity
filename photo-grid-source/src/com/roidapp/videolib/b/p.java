// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.graphics.Bitmap;
import android.opengl.GLES20;
import android.os.SystemClock;
import android.util.Log;
import com.roidapp.videolib.gl.a;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.f;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.videolib.b:
//            m

final class p
    implements e
{

    final m a;
    private Object b;
    private int c;
    private int d;

    p(m m1)
    {
        a = m1;
        super();
        b = null;
        c = -1;
        d = -1;
    }

    public final int a(int i)
    {
        return 0;
    }

    public final ByteBuffer[] a()
    {
        return null;
    }

    public final int[] b()
    {
        return null;
    }

    public final int c()
    {
        Log.e(m.c(a), (new StringBuilder("main scene loadTextureId :")).append(m.i(a)[0]).toString());
        return m.i(a)[0];
    }

    public final boolean d()
    {
        Object obj;
        boolean flag;
        SystemClock.uptimeMillis();
        a a1;
        if (com.roidapp.videolib.b.m.e(a) < 0 || com.roidapp.videolib.b.m.e(a) >= com.roidapp.videolib.b.m.a(a).d())
        {
            a1 = null;
        } else
        {
            a1 = com.roidapp.videolib.b.m.a(a).b(com.roidapp.videolib.b.m.e(a));
        }
        SystemClock.uptimeMillis();
        if (a1 == null) goto _L2; else goto _L1
_L1:
        obj = a1.a;
        obj;
        JVM INSTR monitorenter ;
        if (a1.b == null || a1.b.isRecycled() || b != null && a1.b.equals(b) && c != -1) goto _L4; else goto _L3
_L3:
        b = a1.b;
        SystemClock.uptimeMillis();
        c = g.a(a1.b, c, a1.d);
        SystemClock.uptimeMillis();
        com.roidapp.videolib.b.m.a(a, a1.c);
        flag = true;
_L6:
        obj;
        JVM INSTR monitorexit ;
        if (com.roidapp.videolib.b.m.f(a))
        {
            com.roidapp.videolib.b.m.g(a);
        }
        if (m.h(a) != c)
        {
            if (m.h(a) != -1)
            {
                GLES20.glDeleteTextures(1, new int[] {
                    m.h(a)
                }, 0);
            }
            com.roidapp.videolib.b.m.a(a, c);
        }
        return flag;
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
_L2:
        return false;
_L4:
        flag = false;
        if (true) goto _L6; else goto _L5
_L5:
    }
}
