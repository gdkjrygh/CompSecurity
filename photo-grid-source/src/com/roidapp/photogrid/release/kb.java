// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.os.Handler;
import android.os.Message;
import android.text.TextUtils;
import com.roidapp.photogrid.common.b;

// Referenced classes of package com.roidapp.photogrid.release:
//            ig, rf, ImageSelector, rd

final class kb
    implements Runnable
{

    final ig a;
    final int b;
    final ImageSelector c;

    kb(ImageSelector imageselector, ig ig1, int i)
    {
        c = imageselector;
        a = ig1;
        b = i;
        super();
    }

    public final void run()
    {
        if (!com.roidapp.photogrid.release.rf.b(a.n))
        {
            com.roidapp.photogrid.common.b.a("error path");
            Message message = Message.obtain();
            message.what = 16;
            message.obj = a;
            ImageSelector.f(c).sendMessage(message);
            return;
        }
        Object obj = a;
        Object obj1;
        boolean flag;
        if (TextUtils.isEmpty(((ig) (obj)).b) && TextUtils.isEmpty(((ig) (obj)).a) && TextUtils.isEmpty(((ig) (obj)).c))
        {
            flag = false;
        } else
        {
            flag = true;
        }
        if (!flag) goto _L2; else goto _L1
_L1:
        rf.a();
        obj = rf.a(a);
_L5:
        obj1 = obj;
        if (obj != null) goto _L4; else goto _L3
_L3:
        com.roidapp.photogrid.common.b.a("bitmap null");
        obj1 = Message.obtain();
        obj1.what = 25;
        obj1.obj = a;
        ImageSelector.f(c).sendMessage(((Message) (obj1)));
        return;
        obj1;
_L7:
        ((Exception) (obj1)).printStackTrace();
        obj1 = obj;
_L4:
        ImageSelector.a(c, b, ((android.graphics.Bitmap) (obj1)), a);
        return;
_L2:
        rd.a();
        obj = com.roidapp.photogrid.release.rd.b(a.n, 100, 100);
          goto _L5
        obj1;
        obj = null;
_L6:
        ((OutOfMemoryError) (obj1)).printStackTrace();
        obj1 = obj;
          goto _L4
        obj1;
          goto _L6
        obj1;
        obj = null;
          goto _L7
    }
}
