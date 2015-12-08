// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.d.a;
import com.github.nkzawa.socketio.a.b;
import java.util.Arrays;
import java.util.logging.Logger;
import org.json.JSONArray;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            d, a

final class a
    implements Runnable
{

    final Object a[];
    final b b;

    public final void run()
    {
        if (b.b[0])
        {
            return;
        }
        b.b[0] = true;
        Logger logger = com.github.nkzawa.socketio.client.d.b();
        Object obj;
        byte byte0;
        if (a.length != 0)
        {
            obj = ((Object) (a));
        } else
        {
            obj = null;
        }
        logger.fine(String.format("sending ack %s", ((Object []) (obj))));
        if (com.github.nkzawa.d.a.a(((Object) (a))))
        {
            byte0 = 6;
        } else
        {
            byte0 = 3;
        }
        obj = new b(byte0, new JSONArray(Arrays.asList(a)));
        obj.b = b.b;
        com.github.nkzawa.socketio.client.d.b(b.b, ((b) (obj)));
    }

    ( , Object aobj[])
    {
        b = ;
        a = aobj;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/socketio/client/d$3

/* anonymous class */
    final class d._cls3
        implements com.github.nkzawa.socketio.client.a
    {

        final boolean a[];
        final int b;
        final d c;
        final d d;

        public final transient void a(Object aobj[])
        {
            com.github.nkzawa.f.a.a(new d._cls3._cls1(this, aobj));
        }

            
            {
                d = d1;
                a = aflag;
                b = i;
                c = d2;
                super();
            }
    }

}
