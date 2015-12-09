// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.net.NetworkInfo;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.squareup.picasso.MemoryPolicy;
import com.squareup.picasso.Picasso;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

final class gvj extends Handler
{

    private final gvi a;

    public gvj(Looper looper, gvi gvi1)
    {
        super(looper);
        a = gvi1;
    }

    public final void handleMessage(Message message)
    {
        message.what;
        JVM INSTR tableswitch 1 12: default 68
    //                   1 84
    //                   2 102
    //                   3 68
    //                   4 662
    //                   5 745
    //                   6 762
    //                   7 780
    //                   8 68
    //                   9 829
    //                   10 846
    //                   11 293
    //                   12 648;
           goto _L1 _L2 _L3 _L1 _L4 _L5 _L6 _L7 _L1 _L8 _L9 _L10 _L11
_L5:
        break MISSING_BLOCK_LABEL_745;
_L6:
        break MISSING_BLOCK_LABEL_762;
_L7:
        break MISSING_BLOCK_LABEL_780;
_L8:
        break MISSING_BLOCK_LABEL_829;
_L9:
        break MISSING_BLOCK_LABEL_846;
_L1:
        Picasso.a.post(new Runnable(message) {

            private Message a;

            public final void run()
            {
                throw new AssertionError((new StringBuilder("Unknown handler message received: ")).append(a.what).toString());
            }

            
            {
                a = message;
                super();
            }
        });
_L12:
        return;
_L2:
        message = (guz)message.obj;
        a.a(message, true);
        return;
_L3:
        message = (guz)message.obj;
        gvi gvi1 = a;
        String s = ((guz) (message)).g;
        gvc gvc1 = (gvc)gvi1.b.get(s);
        if (gvc1 != null)
        {
            gvc1.a(message);
            if (gvc1.a())
            {
                gvi1.b.remove(s);
                if (((guz) (message)).a.h)
                {
                    gwm.a("Dispatcher", "canceled", ((guz) (message)).b.a());
                }
            }
        }
        if (gvi1.e.contains(((guz) (message)).h))
        {
            gvi1.d.remove(message.c());
            if (((guz) (message)).a.h)
            {
                gwm.a("Dispatcher", "canceled", ((guz) (message)).b.a(), "because paused request got canceled");
            }
        }
        message = (guz)gvi1.c.remove(message.c());
        if (message != null && ((guz) (message)).a.h)
        {
            gwm.a("Dispatcher", "canceled", ((guz) (message)).b.a(), "from replaying");
            return;
        }
        continue; /* Loop/switch isn't completed */
_L10:
        message = ((Message) (message.obj));
        gvi gvi2 = a;
        if (gvi2.e.add(message))
        {
            Iterator iterator = gvi2.b.values().iterator();
            while (iterator.hasNext()) 
            {
                gvc gvc2 = (gvc)iterator.next();
                boolean flag = gvc2.b.h;
                guz guz1 = gvc2.h;
                List list = gvc2.i;
                int i;
                if (list != null && !list.isEmpty())
                {
                    i = 1;
                } else
                {
                    i = 0;
                }
                if (guz1 != null || i != 0)
                {
                    if (guz1 != null && guz1.h.equals(message))
                    {
                        gvc2.a(guz1);
                        gvi2.d.put(guz1.c(), guz1);
                        if (flag)
                        {
                            gwm.a("Dispatcher", "paused", guz1.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                        }
                    }
                    if (i != 0)
                    {
                        for (i = list.size() - 1; i >= 0; i--)
                        {
                            guz guz2 = (guz)list.get(i);
                            if (!guz2.h.equals(message))
                            {
                                continue;
                            }
                            gvc2.a(guz2);
                            gvi2.d.put(guz2.c(), guz2);
                            if (flag)
                            {
                                gwm.a("Dispatcher", "paused", guz2.b.a(), (new StringBuilder("because tag '")).append(message).append("' was paused").toString());
                            }
                        }

                    }
                    if (gvc2.a())
                    {
                        iterator.remove();
                        if (flag)
                        {
                            gwm.a("Dispatcher", "canceled", gwm.a(gvc2), "all actions paused");
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
        message = (gvc)message.obj;
        gvi gvi3 = a;
        if (MemoryPolicy.b(((gvc) (message)).e))
        {
            gvi3.h.a(((gvc) (message)).c, ((gvc) (message)).j);
        }
        gvi3.b.remove(((gvc) (message)).c);
        gvi3.d(message);
        if (!((gvc) (message)).b.h) goto _L12; else goto _L13
_L13:
        gwm.a("Dispatcher", "batched", gwm.a(message), "for completion");
        return;
        message = (gvc)message.obj;
        a.c(message);
        return;
        message = (gvc)message.obj;
        a.a(message, false);
        return;
        message = a;
        ArrayList arraylist = new ArrayList(((gvi) (message)).i);
        ((gvi) (message)).i.clear();
        ((gvi) (message)).g.sendMessage(((gvi) (message)).g.obtainMessage(8, arraylist));
        gvi.a(arraylist);
        return;
        message = (NetworkInfo)message.obj;
        a.a(message);
        return;
        int j = message.arg1;
        return;
    }
}
