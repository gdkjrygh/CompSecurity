// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import com.roidapp.videolib.gl.e;
import java.nio.ByteBuffer;
import jp.co.cyberagent.android.a.k;

// Referenced classes of package com.roidapp.videolib.b:
//            c

final class d
    implements e
{

    final c a;

    d(c c1)
    {
        a = c1;
        super();
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
        if (a.k == null || com.roidapp.videolib.b.c.a(a) < 0)
        {
            return -1;
        } else
        {
            return a.k.b(com.roidapp.videolib.b.c.a(a));
        }
    }

    public final boolean d()
    {
        return false;
    }
}
