// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.c.b;

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.c.b:
//            aj, s, a, q, 
//            d, aw, bj

final class r extends Handler
{

    private final q a;

    public r(Looper looper, q q1)
    {
        super(looper);
        a = q1;
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 85
    //                   2 103
    //                   3 68
    //                   4 663
    //                   5 680
    //                   6 697
    //                   7 715
    //                   8 68
    //                   9 723
    //                   10 740
    //                   11 294
    //                   12 649;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11
_L4:
        break MISSING_BLOCK_LABEL_663;
_L5:
        break MISSING_BLOCK_LABEL_680;
_L6:
        break MISSING_BLOCK_LABEL_697;
_L7:
        break MISSING_BLOCK_LABEL_715;
_L8:
        break MISSING_BLOCK_LABEL_723;
_L9:
        break MISSING_BLOCK_LABEL_740;
_L1:
        aj.a.post(new s(this, message));
_L12:
        return;
_L2:
        message = (a)message.obj;
        a.a(message, true);
        return;
_L3:
        message = (a)message.obj;
        q q1 = a;
        String s1 = ((a) (message)).i;
        d d1 = (d)q1.e.get(s1);
        if (d1 != null)
        {
            d1.a(message);
            if (d1.a())
            {
                q1.e.remove(s1);
                if (((a) (message)).a.l)
                {
                    bj.a("Dispatcher", "canceled", ((a) (message)).b.a());
                }
            }
        }
        if (q1.h.contains(((a) (message)).j))
        {
            q1.g.remove(message.c());
            if (((a) (message)).a.l)
            {
                bj.a("Dispatcher", "canceled", ((a) (message)).b.a(), "because paused request got canceled");
            }
        }
        message = (a)q1.f.remove(message.c());
        if (message != null && ((a) (message)).a.l)
        {
            bj.a("Dispatcher", "canceled", ((a) (message)).b.a(), "from replaying");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        message = ((Message) (message.obj));
        q q2 = a;
        if (q2.h.add(message))
        {
            Iterator iterator = q2.e.values().iterator();
            while (iterator.hasNext()) 
            {
                d d2 = (d)iterator.next();
                boolean flag = d2.b.l;
                a a1 = d2.k;
                List list = d2.l;
                int i;
                if (list != null && !list.isEmpty())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (a1 != null || i != 0)
                {
                    if (a1 != null && a1.j.equals(message))
                    {
                        d2.a(a1);
                        q2.g.put(a1.c(), a1);
                        if (flag)
                        {
                            bj.a("Dispatcher", "paused", a1.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                        }
                    }
                    if (i != 0)
                    {
                        for (i = list.size() - 1; i >= 0; i--)
                        {
                            a a2 = (a)list.get(i);
                            if (!a2.j.equals(message))
                            {
                                continue;
                            }
                            d2.a(a2);
                            q2.g.put(a2.c(), a2);
                            if (flag)
                            {
                                bj.a("Dispatcher", "paused", a2.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                            }
                        }

                    }
                    if (d2.a())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            bj.a("Dispatcher", "canceled", bj.a(d2), "all actions paused");
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
        message = (d)message.obj;
        a.d(message);
        return;
        message = (d)message.obj;
        a.c(message);
        return;
        message = (d)message.obj;
        a.a(message, false);
        return;
        a.a();
        return;
        message = (NetworkInfo)message.obj;
        a.a(message);
        return;
        q q3 = a;
        boolean flag1;
        if (message.arg1 == 1)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        q3.p = flag1;
        return;
    }
}
