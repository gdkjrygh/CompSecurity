// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.comscore.streaming.plugin;

import com.comscore.streaming.StreamSenseEventType;
import com.comscore.streaming.StreamSenseState;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.comscore.streaming.plugin:
//            StreamSensePlugin, StreamSensePlayer, b, StreamSensePluginListener

class a
    implements Runnable
{

    final StreamSensePlugin a;

    a(StreamSensePlugin streamsenseplugin)
    {
        a = streamsenseplugin;
        super();
    }

    public void run()
    {
        if (StreamSensePlugin.a(a) && StreamSensePlugin.b(a) != null) goto _L2; else goto _L1
_L1:
        StreamSensePlugin.c(a);
_L9:
        return;
_L2:
        StreamSenseState streamsensestate;
        long l;
        long l1;
        if (StreamSensePlugin.d(a))
        {
            StreamSensePlugin.a(a, false);
            return;
        }
        l = StreamSensePlugin.b(a).getPosition();
        streamsensestate = a.getState();
        l1 = System.currentTimeMillis();
        if (!StreamSensePlugin.e(a).isEmpty() && l == StreamSensePlugin.a(a, 0)) goto _L4; else goto _L3
_L3:
        boolean flag;
        StreamSensePlugin.e(a).add(Long.valueOf(Math.abs(l)));
        StreamSensePlugin.f(a).add(Long.valueOf(l1));
        if (StreamSensePlugin.e(a).size() <= 1 || StreamSensePlugin.a(a, 0) >= StreamSensePlugin.a(a, 1))
        {
            continue; /* Loop/switch isn't completed */
        }
        l1 = StreamSensePlugin.a(a, 0);
        long l2 = StreamSensePlugin.b(a, 0);
        StreamSensePlugin.e(a).clear();
        StreamSensePlugin.f(a).clear();
        StreamSensePlugin.e(a).add(Long.valueOf(l1));
        StreamSensePlugin.f(a).add(Long.valueOf(l2));
        if (!StreamSensePlugin.g(a))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = true;
_L10:
        boolean flag1;
        if (StreamSensePlugin.e(a).size() > StreamSensePlugin.i(a))
        {
            StreamSensePlugin.e(a).remove(0);
            StreamSensePlugin.f(a).remove(0);
        }
        flag1 = flag;
        if (StreamSensePlugin.g(a))
        {
            flag1 = flag;
            if (!flag)
            {
                flag1 = StreamSensePlugin.j(a);
            }
        }
_L11:
        b.a[a.getState().ordinal()];
        JVM INSTR tableswitch 1 4: default 396
    //                   1 519
    //                   2 519
    //                   3 519
    //                   4 743;
           goto _L5 _L6 _L6 _L6 _L7
_L5:
        break; /* Loop/switch isn't completed */
        if (StreamSensePlugin.e(a).size() < StreamSensePlugin.h(a)) goto _L9; else goto _L8
_L8:
        flag = false;
          goto _L10
_L4:
        StreamSensePlugin.f(a).set(StreamSensePlugin.f(a).size() - 1, Long.valueOf(l1));
        flag1 = false;
          goto _L11
_L6:
        if (StreamSensePlugin.k(a) && l > StreamSensePlugin.l(a) && !flag1 && !StreamSensePlugin.a(a, l))
        {
            for (Iterator iterator1 = StreamSensePlugin.m(a).iterator(); iterator1.hasNext() && ((StreamSensePluginListener)iterator1.next()).onPreStateChange(a.getState(), StreamSenseEventType.PLAY, StreamSensePlugin.n(a));) { }
            if (StreamSensePlugin.n(a) && !StreamSensePlugin.o(a))
            {
                HashMap hashmap = new HashMap();
                hashmap.put("ns_st_ui", "seek");
                a.notify(StreamSenseEventType.PLAY, hashmap, l);
            } else
            {
                a.notify(StreamSenseEventType.PLAY, null, ((Long)StreamSensePlugin.e(a).get(0)).longValue());
            }
            StreamSensePlugin.b(a, false);
            StreamSensePlugin.c(a, false);
        } else
        if (StreamSensePlugin.g(a) && flag1)
        {
            StreamSensePlugin.b(a, true);
        }
          goto _L12
_L7:
        if (StreamSensePlugin.g(a) && flag1)
        {
            for (Iterator iterator2 = StreamSensePlugin.m(a).iterator(); iterator2.hasNext() && ((StreamSensePluginListener)iterator2.next()).onPreStateChange(a.getState(), StreamSenseEventType.PAUSE, false);) { }
            a.notify(StreamSenseEventType.PAUSE, null, StreamSensePlugin.l(a));
            StreamSensePlugin.b(a, true);
        } else
        if (StreamSensePlugin.p(a) && StreamSensePlugin.a(a, l))
        {
            for (Iterator iterator3 = StreamSensePlugin.m(a).iterator(); iterator3.hasNext() && ((StreamSensePluginListener)iterator3.next()).onPreStateChange(a.getState(), StreamSenseEventType.END, false);) { }
            a.notify(StreamSenseEventType.END, null, StreamSensePlugin.b(a).getDuration());
            StreamSensePlugin.b(a, false);
        } else
        if (StreamSensePlugin.q(a) && Math.abs(l - StreamSensePlugin.l(a)) <= (long)StreamSensePlugin.r(a))
        {
            for (Iterator iterator4 = StreamSensePlugin.m(a).iterator(); iterator4.hasNext() && ((StreamSensePluginListener)iterator4.next()).onPreStateChange(a.getState(), StreamSenseEventType.PAUSE, false);) { }
            a.notify(StreamSenseEventType.PAUSE, null, StreamSensePlugin.l(a));
        }
_L12:
        if (streamsensestate != a.getState())
        {
            for (Iterator iterator = StreamSensePlugin.m(a).iterator(); iterator.hasNext(); ((StreamSensePluginListener)iterator.next()).onPostStateChange(a.getState())) { }
            if (a.getState() == StreamSenseState.PAUSED)
            {
                StreamSensePlugin.e(a).clear();
                StreamSensePlugin.f(a).clear();
            }
        }
        StreamSensePlugin.b(a, l);
        return;
          goto _L10
    }
}
