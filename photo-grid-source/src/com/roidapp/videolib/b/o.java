// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.videolib.b;

import android.util.Log;
import com.roidapp.videolib.gl.e;
import java.nio.ByteBuffer;

// Referenced classes of package com.roidapp.videolib.b:
//            m

final class o
    implements e
{

    final m a;

    o(m m1)
    {
        a = m1;
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
        Log.e(m.c(a), (new StringBuilder("srcTextureprovider mProcessSrcTexture:")).append(m.d(a)).toString());
        return m.d(a);
    }

    public final boolean d()
    {
        return false;
    }
}
