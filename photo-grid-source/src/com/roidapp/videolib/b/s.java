// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.opengl.GLES20;
import com.roidapp.videolib.gl.a;
import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.f;
import com.roidapp.videolib.gl.g;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.videolib.b:
//            m

final class s
    implements e
{

    final m a;
    private int b;
    private Object c;

    s(m m1)
    {
        a = m1;
        super();
        b = -1;
        c = null;
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
        int i = -1;
        if (com.roidapp.videolib.b.m.f(a))
        {
            i = m.l(a);
        } else
        {
            a a1 = new a();
            a1.b = com.roidapp.videolib.b.m.a(a).f();
            a1.d = false;
            if (a1.b != null)
            {
                if (c == null || !a1.b.equals(c) || b == -1)
                {
                    c = a1.b;
                    b = g.a(a1.b, b, a1.d);
                }
                if (m.m(a) != b)
                {
                    if (m.m(a) != -1)
                    {
                        GLES20.glDeleteTextures(1, new int[] {
                            m.m(a)
                        }, 0);
                    }
                    m.d(a, b);
                }
                return b;
            }
        }
        return i;
    }

    public final boolean d()
    {
        return false;
    }
}
