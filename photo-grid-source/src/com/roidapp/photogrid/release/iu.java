// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import com.roidapp.photogrid.common.az;
import java.util.Map;

// Referenced classes of package com.roidapp.photogrid.release:
//            ImageEditor, aq, ig, rf

final class iu
    implements Runnable
{

    final ImageEditor a;

    iu(ImageEditor imageeditor)
    {
        a = imageeditor;
        super();
    }

    public final void run()
    {
        int k;
        k = ImageEditor.s(a).getId() - 1;
        a.e[k].w = false;
        az.q;
        JVM INSTR tableswitch 0 5: default 68
    //                   0 160
    //                   1 68
    //                   2 194
    //                   3 215
    //                   4 68
    //                   5 160;
           goto _L1 _L2 _L1 _L3 _L4 _L1 _L2
_L1:
        int i;
        int j;
        i = 0;
        j = 0;
_L7:
        if (!ImageEditor.v(a).containsKey(Integer.valueOf(k))) goto _L6; else goto _L5
_L5:
        Object obj;
        rf.a();
        obj = rf.a(a.e[k], i, j, Boolean.valueOf(false));
_L8:
        OutOfMemoryError outofmemoryerror1;
        Object obj1;
        OutOfMemoryError outofmemoryerror2;
        if (obj != null && !((Bitmap) (obj)).isRecycled())
        {
            Message message = Message.obtain();
            message.what = ImageEditor.a;
            message.obj = obj;
            a.h.sendMessage(message);
            return;
        } else
        {
            ImageEditor.a(a, 163);
            a.h.sendEmptyMessage(ImageEditor.i());
            ImageEditor.a(a, false);
            return;
        }
_L2:
        rf.a();
        obj = rf.a(ImageEditor.s(a));
        j = obj[0] + 6;
        i = obj[1] + 6;
          goto _L7
_L3:
        i = rf.a(a);
        j = (int)((float)i * 0.75F);
          goto _L7
_L4:
        j = rf.a(a);
        i = (int)((float)j * 0.75F);
          goto _L7
_L6:
        obj = rf.a().a(a.e[k], i, j);
          goto _L8
        outofmemoryerror2;
        if (false)
        {
            throw new NullPointerException();
        }
        System.gc();
        if (!ImageEditor.v(a).containsKey(Integer.valueOf(k))) goto _L10; else goto _L9
_L9:
        rf.a();
        obj = rf.a(a.e[k], i, j, Boolean.valueOf(false));
_L11:
        outofmemoryerror2.printStackTrace();
          goto _L8
        outofmemoryerror1;
        obj1 = obj;
_L12:
        obj = obj1;
        if (obj1 != null)
        {
            obj = obj1;
            if (!((Bitmap) (obj1)).isRecycled())
            {
                ((Bitmap) (obj1)).recycle();
                obj = null;
            }
        }
        ImageEditor.a(a, 162);
        a.h.sendEmptyMessage(ImageEditor.i());
        ImageEditor.a(a, false);
        System.gc();
        outofmemoryerror2.printStackTrace();
          goto _L8
_L10:
        obj = rf.a().a(a.e[k], i, j);
          goto _L11
        OutOfMemoryError outofmemoryerror;
        outofmemoryerror;
        obj1 = null;
          goto _L12
    }
}
