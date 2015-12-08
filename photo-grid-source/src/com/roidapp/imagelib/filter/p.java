// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import com.roidapp.imagelib.c.c;
import jp.co.cyberagent.android.gpuimage.GPUImageRenderer;
import jp.co.cyberagent.android.gpuimage.PixelBuffer;

// Referenced classes of package com.roidapp.imagelib.filter:
//            n

final class p
    implements c
{

    final n a;

    p(n n1)
    {
        a = n1;
        super();
    }

    public final void a()
    {
    }

    public final void b()
    {
        a.c.destroy();
        if (a.d != null)
        {
            a.d.destroy();
            a.d = null;
        }
    }
}
