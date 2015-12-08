// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.release;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ListView;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.release:
//            bj

final class bk extends Handler
{

    final bj a;

    bk(bj bj1)
    {
        a = bj1;
        super();
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 0 0: default 24
    //                   0 25;
           goto _L1 _L2
_L1:
        return;
_L2:
        if (bj.a(a)) goto _L1; else goto _L3
_L3:
        bj bj1 = a;
        bj1;
        JVM INSTR monitorenter ;
        ImageView imageview = (ImageView)a.a.findViewWithTag(message.obj);
        if (imageview == null) goto _L5; else goto _L4
_L4:
        if (bj.b(a) == null) goto _L5; else goto _L6
_L6:
        Object obj = (SoftReference)bj.b(a).get(message.obj);
        if (obj != null) goto _L8; else goto _L7
_L7:
        bj.a(a, (new StringBuilder()).append(message.obj).toString());
_L5:
        bj1;
        JVM INSTR monitorexit ;
        return;
        message;
        bj1;
        JVM INSTR monitorexit ;
        throw message;
_L8:
        obj = (Bitmap)((SoftReference) (obj)).get();
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (!((Bitmap) (obj)).isRecycled()) goto _L11; else goto _L10
_L10:
        bj.a(a, (new StringBuilder()).append(message.obj).toString());
          goto _L5
_L11:
        imageview.setImageBitmap(((Bitmap) (obj)));
          goto _L5
    }
}
