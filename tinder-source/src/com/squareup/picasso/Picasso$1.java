// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.List;

// Referenced classes of package com.squareup.picasso:
//            Picasso, c, r, a, 
//            ab, MemoryPolicy

static final class adedFrom extends Handler
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
            Object obj = (c)message.get(i);
            Picasso picasso = ((c) (obj)).b;
            a a1 = ((c) (obj)).k;
            List list1 = ((c) (obj)).l;
            if (list1 != null && !list1.isEmpty())
            {
                k = 1;
            } else
            {
                k = 0;
            }
            if (a1 != null || k != 0)
            {
                i1 = 1;
            } else
            {
                i1 = 0;
            }
            if (i1 != 0)
            {
                Object obj1 = ((c) (obj)).g.d;
                obj1 = ((c) (obj)).p;
                obj1 = ((c) (obj)).m;
                obj = ((c) (obj)).o;
                if (a1 != null)
                {
                    picasso.a(((android.graphics.Bitmap) (obj1)), ((adedFrom) (obj)), a1);
                }
                if (k != 0)
                {
                    i1 = list1.size();
                    for (k = 0; k < i1; k++)
                    {
                        picasso.a(((android.graphics.Bitmap) (obj1)), ((adedFrom) (obj)), (a)list1.get(k));
                    }

                }
            }
        }

        break; /* Loop/switch isn't completed */
_L2:
        message = (a)message.obj;
        if (((a) (message)).a.n)
        {
            ab.a("Main", "canceled", ((a) (message)).b.a(), "target got garbage collected");
        }
        Picasso.a(((a) (message)).a, message.c());
_L6:
        return;
_L4:
        List list = (List)message.obj;
        int l = list.size();
        int j = 0;
        while (j < l) 
        {
            a a2 = (a)list.get(j);
            Picasso picasso1 = a2.a;
            message = null;
            if (MemoryPolicy.a(a2.e))
            {
                message = picasso1.b(a2.i);
            }
            if (message != null)
            {
                picasso1.a(message, adedFrom.a, a2);
                if (picasso1.n)
                {
                    ab.a("Main", "completed", a2.b.a(), (new StringBuilder("from ")).append(adedFrom.a).toString());
                }
            } else
            {
                picasso1.a(a2);
                if (picasso1.n)
                {
                    ab.a("Main", "resumed", a2.b.a());
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
