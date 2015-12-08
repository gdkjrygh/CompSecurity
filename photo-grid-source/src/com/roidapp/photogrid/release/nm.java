// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import java.util.ArrayList;

// Referenced classes of package com.roidapp.photogrid.release:
//            nl, rf, ig, ml

final class nm
    implements Runnable
{

    final nl a;

    nm(nl nl1)
    {
        a = nl1;
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
        if (i >= nl.a(a).length)
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
            nl.a(bitmap1);
            nl.e(a);
            a.l.sendEmptyMessage(7);
            outofmemoryerror.printStackTrace();
            return;
        }
        bitmap1 = bitmap;
        bitmap = rf.a(nl.a(a)[i], nl.b(a), nl.c(a), Boolean.valueOf(false));
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
        nl.e(a);
        bitmap1 = bitmap;
        message = Message.obtain();
        bitmap1 = bitmap;
        message.what = 703;
        bitmap1 = bitmap;
        message.obj = nl.a(a)[i].n;
        bitmap1 = bitmap;
        a.K.sendMessage(message);
        return;
        if (bitmap.isRecycled())
        {
            break MISSING_BLOCK_LABEL_236;
        }
        bitmap1 = bitmap;
        nl.d(a).add(bitmap);
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
