// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.socketio.a.b;
import java.util.LinkedList;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            d, c, Manager

final class a
    implements com.github.nkzawa.b.nt.Socket._cls2._cls1
{

    final a a;

    public final transient void a(Object aobj[])
    {
        d.a(a.a);
    }

    <init>(<init> <init>1)
    {
        a = <init>1;
        super();
    }

    // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2

/* anonymous class */
    class Socket._cls2 extends LinkedList
    {

        final Manager a;
        final d b;

            
            {
                b = d1;
                a = manager;
                super();
                add(c.a(a, "open", new Socket._cls2._cls1(this)));
                add(c.a(a, "packet", new Socket._cls2._cls2()));
                add(c.a(a, "close", new Socket._cls2._cls3()));
            }

        // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2$2

/* anonymous class */
        final class Socket._cls2._cls2
            implements com.github.nkzawa.b.a.a
        {

            final Socket._cls2 a;

            public final transient void a(Object aobj[])
            {
                d.a(a.b, (b)aobj[0]);
            }

                    
                    {
                        a = Socket._cls2.this;
                        super();
                    }
        }


        // Unreferenced inner class com/github/nkzawa/socketio/client/Socket$2$3

/* anonymous class */
        final class Socket._cls2._cls3
            implements com.github.nkzawa.b.a.a
        {

            final Socket._cls2 a;

            public final transient void a(Object aobj[])
            {
                d d1 = a.b;
                if (aobj.length > 0)
                {
                    aobj = (String)aobj[0];
                } else
                {
                    aobj = null;
                }
                d.a(d1, ((String) (aobj)));
            }

                    
                    {
                        a = Socket._cls2.this;
                        super();
                    }
        }

    }

}
