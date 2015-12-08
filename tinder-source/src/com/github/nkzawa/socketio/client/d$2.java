// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.d.a;
import com.github.nkzawa.socketio.a.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.logging.Logger;
import org.json.JSONArray;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            d, a

final class b
    implements Runnable
{

    final String a;
    final Object b[];
    final d c;

    public final void run()
    {
        if (com.github.nkzawa.socketio.client.d.b.containsKey(a))
        {
            com.github.nkzawa.socketio.client.d.a(c, a, b);
            return;
        }
        ArrayList arraylist = new ArrayList(b.length + 1);
        arraylist.add(a);
        arraylist.addAll(Arrays.asList(b));
        JSONArray jsonarray = new JSONArray();
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); jsonarray.put(iterator.next())) { }
        b b1;
        byte byte0;
        if (com.github.nkzawa.d.a.a(jsonarray))
        {
            byte0 = 5;
        } else
        {
            byte0 = 2;
        }
        b1 = new b(byte0, jsonarray);
        if (arraylist.get(arraylist.size() - 1) instanceof com.github.nkzawa.socketio.client.a)
        {
            com.github.nkzawa.socketio.client.d.b().fine(String.format("emitting packet with ack id %d", new Object[] {
                Integer.valueOf(d.e(c))
            }));
            d.f(c).put(Integer.valueOf(d.e(c)), (com.github.nkzawa.socketio.client.a)arraylist.remove(arraylist.size() - 1));
            b1.d = com.github.nkzawa.socketio.client.d.a(jsonarray, jsonarray.length() - 1);
            b1.b = d.g(c);
        }
        if (com.github.nkzawa.socketio.client.d.b(c))
        {
            com.github.nkzawa.socketio.client.d.b(c, b1);
            return;
        } else
        {
            d.h(c).add(b1);
            return;
        }
    }

    (d d1, String s, Object aobj[])
    {
        c = d1;
        a = s;
        b = aobj;
        super();
    }
}
