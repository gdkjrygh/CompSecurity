// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.squareup.picasso;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.squareup.picasso:
//            i, Picasso, a, c, 
//            r, ab, MemoryPolicy, d

private static final class a extends Handler
{

    private final i a;

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 85
    //                   2 103
    //                   3 68
    //                   4 663
    //                   5 746
    //                   6 763
    //                   7 781
    //                   8 68
    //                   9 830
    //                   10 847
    //                   11 294
    //                   12 649;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11
_L5:
        break MISSING_BLOCK_LABEL_746;
_L6:
        break MISSING_BLOCK_LABEL_763;
_L7:
        break MISSING_BLOCK_LABEL_781;
_L8:
        break MISSING_BLOCK_LABEL_830;
_L9:
        break MISSING_BLOCK_LABEL_847;
_L1:
        Picasso.a.post(new Runnable(message) {

            final Message a;
            final i.a b;

            public final void run()
            {
                throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
            }

            
            {
                b = i.a.this;
                a = message;
                super();
            }
        });
_L12:
        return;
_L2:
        message = (a)message.obj;
        a.a(message, true);
        return;
_L3:
        message = (a)message.obj;
        i j = a;
        String s = ((a) (message)).i;
        c c1 = (c)j.e.get(s);
        if (c1 != null)
        {
            c1.a(message);
            if (c1.a())
            {
                j.e.remove(s);
                if (((a) (message)).a.n)
                {
                    ab.a("Dispatcher", "canceled", ((a) (message)).b.a());
                }
            }
        }
        if (j.h.contains(((a) (message)).j))
        {
            j.g.remove(message.c());
            if (((a) (message)).a.n)
            {
                ab.a("Dispatcher", "canceled", ((a) (message)).b.a(), "because paused request got canceled");
            }
        }
        message = (a)j.f.remove(message.c());
        if (message != null && ((a) (message)).a.n)
        {
            ab.a("Dispatcher", "canceled", ((a) (message)).b.a(), "from replaying");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        message = ((Message) (message.obj));
        i k = a;
        if (k.h.add(message))
        {
            Iterator iterator = k.e.values().iterator();
            while (iterator.hasNext()) 
            {
                c c2 = (c)iterator.next();
                boolean flag = c2.b.n;
                a a1 = c2.k;
                List list = c2.l;
                int j1;
                if (list != null && !list.isEmpty())
                {
                    j1 = 1;
                } else
                {
                    j1 = 0;
                }
                if (a1 != null || j1 != 0)
                {
                    if (a1 != null && a1.j.equals(message))
                    {
                        c2.a(a1);
                        k.g.put(a1.c(), a1);
                        if (flag)
                        {
                            ab.a("Dispatcher", "paused", a1.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                        }
                    }
                    if (j1 != 0)
                    {
                        for (j1 = list.size() - 1; j1 >= 0; j1--)
                        {
                            a a2 = (a)list.get(j1);
                            if (!a2.j.equals(message))
                            {
                                continue;
                            }
                            c2.a(a2);
                            k.g.put(a2.c(), a2);
                            if (flag)
                            {
                                ab.a("Dispatcher", "paused", a2.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                            }
                        }

                    }
                    if (c2.a())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            ab.a("Dispatcher", "canceled", ab.a(c2), "all actions paused");
                        }
                    }
                }
            }
        }
        if (true) goto _L12; else goto _L11
_L11:
        message = ((Message) (message.obj));
        a.a(message);
        return;
_L4:
        message = (c)message.obj;
        i l = a;
        if (MemoryPolicy.b(((c) (message)).h))
        {
            l.k.a(((c) (message)).f, ((c) (message)).m);
        }
        l.e.remove(((c) (message)).f);
        l.d(message);
        if (!((c) (message)).b.n) goto _L12; else goto _L13
_L13:
        ab.a("Dispatcher", "batched", ab.a(message), "for completion");
        return;
        message = (c)message.obj;
        a.c(message);
        return;
        message = (c)message.obj;
        a.a(message, false);
        return;
        message = a;
        ArrayList arraylist = new ArrayList(((i) (message)).m);
        ((i) (message)).m.clear();
        ((i) (message)).j.sendMessage(((i) (message)).j.obtainMessage(8, arraylist));
        i.a(arraylist);
        return;
        message = (NetworkInfo)message.obj;
        a.a(message);
        return;
        i i1 = a;
        boolean flag1;
        if (message.arg1 == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        i1.p = flag1;
        return;
    }

    public _cls1.a(Looper looper, i j)
    {
        super(looper);
        a = j;
    }
}
