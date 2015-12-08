// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.retouch;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.imagelib.retouch:
//            m

final class n
    implements jp.co.cyberagent.android.gpuimage.GPUImage.OnImageLoadDoneListener
{

    final m a;

    n(m m1)
    {
        a = m1;
        super();
    }

    public final void onImageLoadDone(Throwable throwable, int i, int j)
    {
        throwable = Message.obtain(m.e(a), 1026, i, j, throwable);
        m.e(a).sendMessage(throwable);
    }
}
