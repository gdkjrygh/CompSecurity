// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.photogrid.cloud;

import android.graphics.Bitmap;
import android.os.Handler;
import android.os.Message;
import android.widget.ImageView;
import android.widget.ListView;
import java.lang.ref.SoftReference;
import java.util.HashMap;

// Referenced classes of package com.roidapp.photogrid.cloud:
//            t

final class u extends Handler
{

    final t a;

    u(t t1)
    {
        a = t1;
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
        if (t.a(a)) goto _L1; else goto _L3
_L3:
        t t1 = a;
        t1;
        JVM INSTR monitorenter ;
        ImageView imageview = (ImageView)a.a.findViewWithTag(message.obj);
        if (imageview == null) goto _L5; else goto _L4
_L4:
        if (t.b(a) == null) goto _L5; else goto _L6
_L6:
        Object obj = (SoftReference)t.b(a).get(message.obj);
        if (obj != null) goto _L8; else goto _L7
_L7:
        t.a(a, (new StringBuilder()).append(message.obj).toString());
_L5:
        t1;
        JVM INSTR monitorexit ;
        return;
        message;
        t1;
        JVM INSTR monitorexit ;
        throw message;
_L8:
        obj = (Bitmap)((SoftReference) (obj)).get();
        if (obj == null) goto _L10; else goto _L9
_L9:
        if (!((Bitmap) (obj)).isRecycled()) goto _L11; else goto _L10
_L10:
        t.a(a, (new StringBuilder()).append(message.obj).toString());
          goto _L5
_L11:
        imageview.setImageBitmap(((Bitmap) (obj)));
          goto _L5
    }
}
