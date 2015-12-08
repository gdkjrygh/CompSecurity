// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Handler;
import android.os.Message;
import com.roidapp.imagelib.c.c;
import jp.co.cyberagent.android.gpuimage.GPUImageRenderer;
import jp.co.cyberagent.android.gpuimage.PixelBuffer;

// Referenced classes of package com.roidapp.imagelib.filter:
//            aj, aq

final class am
    implements c
{

    final aq a;
    final aj b;

    am(aj aj1, aq aq)
    {
        b = aj1;
        a = aq;
        super();
    }

    public final void a()
    {
        Message message = Message.obtain(aj.g(b), 1024, 0, 0);
        message.obj = a;
        aj.g(b).sendMessage(message);
    }

    public final void b()
    {
        b.c.destroy();
        if (b.d != null)
        {
            b.d.destroy();
            b.d = null;
        }
    }
}
