// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import guz;
import gvc;
import gvz;
import gwm;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            Picasso, MemoryPolicy

final class adedFrom extends Handler
{

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR lookupswitch 3: default 40
    //                   3: 278
    //                   8: 67
    //                   13: 324;
           goto _L1 _L2 _L3 _L4
_L1:
        throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(message.what).toString());
_L3:
        message = (List)message.obj;
        int j1 = message.size();
        int k;
        int i1;
        for (int i = 0; i < j1; i++)
        {
            Object obj = (gvc)message.get(i);
            Picasso picasso = ((gvc) (obj)).b;
            guz guz1 = ((gvc) (obj)).h;
            List list1 = ((gvc) (obj)).i;
            if (list1 != null && !list1.isEmpty())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (guz1 != null || k != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                Object obj1 = ((gvc) (obj)).d.d;
                obj1 = ((gvc) (obj)).m;
                obj1 = ((gvc) (obj)).j;
                obj = ((gvc) (obj)).l;
                if (guz1 != null)
                {
                    picasso.a(((android.graphics.Bitmap) (obj1)), ((adedFrom) (obj)), guz1);
                }
                if (k != 0)
                {
                    i1 = list1.size();
                    for (k = 0; k < i1; k++)
                    {
                        picasso.a(((android.graphics.Bitmap) (obj1)), ((adedFrom) (obj)), (guz)list1.get(k));
                    }

                }
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        message = (guz)message.obj;
        if (((guz) (message)).a.h)
        {
            gwm.a("Main", "canceled", ((guz) (message)).b.a(), "target got garbage collected");
        }
        Picasso.a(((guz) (message)).a, message.c());
_L6:
        return;
_L4:
        List list = (List)message.obj;
        int l = list.size();
        int j = 0;
        while (j < l) 
        {
            guz guz2 = (guz)list.get(j);
            Picasso picasso1 = guz2.a;
            message = null;
            if (MemoryPolicy.a(0))
            {
                message = picasso1.b(guz2.g);
            }
            if (message != null)
            {
                picasso1.a(message, adedFrom.a, guz2);
                if (picasso1.h)
                {
                    gwm.a("Main", "completed", guz2.b.a(), (new StringBuilder("from ")).append(adedFrom.a).toString());
                }
            } else
            {
                picasso1.a(guz2);
                if (picasso1.h)
                {
                    gwm.a("Main", "resumed", guz2.b.a());
                }
            }
            j++;
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    adedFrom(Looper looper)
    {
        super(looper);
    }
}
