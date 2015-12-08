// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.imagelib.filter;

import android.os.Handler;
import android.os.Message;

// Referenced classes of package com.roidapp.imagelib.filter:
//            aj

final class al
    implements jp.co.cyberagent.android.gpuimage.GPUImage.OnImageLoadDoneListener
{

    final aj a;

    al(aj aj1)
    {
        a = aj1;
        super();
    }

    public final void onImageLoadDone(Throwable throwable, int i, int j)
    {
        throwable = Message.obtain(aj.g(a), 1026, i, j, throwable);
        aj.g(a).sendMessage(throwable);
    }
}
