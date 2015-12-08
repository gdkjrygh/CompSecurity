// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            mu, rf, ig, ml

final class mv
    implements Runnable
{

    final mu a;

    mv(mu mu1)
    {
        a = mu1;
        super();
    }

    public final void run()
    {
        Bitmap bitmap;
        int i;
        boolean flag;
        flag = false;
        bitmap = null;
        i = 0;
_L2:
        Bitmap bitmap1 = bitmap;
        if (i >= mu.a(a).length)
        {
            break MISSING_BLOCK_LABEL_79;
        }
        bitmap1 = bitmap;
        Message message;
        try
        {
            rf.a();
        }
        catch (OutOfMemoryError outofmemoryerror)
        {
            mu.a(bitmap1);
            mu.e(a);
            a.l.sendEmptyMessage(7);
            outofmemoryerror.printStackTrace();
            return;
        }
        bitmap1 = bitmap;
        bitmap = rf.a(mu.a(a)[i], mu.b(a), mu.c(a), Boolean.valueOf(false));
        if (bitmap == null)
        {
            break MISSING_BLOCK_LABEL_236;
        }
        bitmap1 = bitmap;
        break MISSING_BLOCK_LABEL_69;
        i = 0;
        for (; !flag; flag = true)
        {
            break MISSING_BLOCK_LABEL_185;
        }

        bitmap1 = bitmap;
        mu.e(a);
        bitmap1 = bitmap;
        message = Message.obtain();
        bitmap1 = bitmap;
        message.what = 703;
        bitmap1 = bitmap;
        message.obj = mu.a(a)[i].n;
        bitmap1 = bitmap;
        a.K.sendMessage(message);
        return;
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        bitmap1 = bitmap;
        mu.d(a).add(bitmap);
        bitmap1 = bitmap;
        a.l.a(i * 4 + 34, 0);
        i++;
        if (true) goto _L2; else goto _L1
_L1:
        bitmap1 = bitmap;
        a.l.sendEmptyMessage(3);
        return;
    }
}
