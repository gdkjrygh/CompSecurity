// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import com.roidapp.videolib.gl.e;
import com.roidapp.videolib.gl.f;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.videolib.b:
//            m

final class n
    implements e
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final int a(int i)
    {
        return m.a(a).a(i - 1);
    }

    public final ByteBuffer[] a()
    {
        if (m.h() == null)
        {
            int ai[] = m.a(a).b();
            if (ai == null)
            {
                return null;
            }
            m.a(new ByteBuffer[ai.length]);
            for (int i = 0; i < m.h().length; i++)
            {
                m.h()[i] = ByteBuffer.allocateDirect(ai[0] * ai[1] << 2);
            }

        }
        m.a(a).a(m.h(), m.b(a));
        return m.h();
    }

    public final int[] b()
    {
        return m.a(a).b();
    }

    public final int c()
    {
        return 0;
    }

    public final boolean d()
    {
        return false;
    }
}
