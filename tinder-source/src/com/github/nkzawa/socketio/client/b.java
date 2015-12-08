// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.github.nkzawa.socketio.client;

import com.github.nkzawa.socketio.a.c;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.concurrent.ConcurrentHashMap;
import java.util.logging.Logger;

// Referenced classes of package com.github.nkzawa.socketio.client:
//            e, Manager, d

public class b
{
    public static final class a extends Manager.c
    {

        public boolean q;
        public boolean r;

        public a()
        {
            r = true;
        }
    }


    public static int a;
    private static final Logger b = Logger.getLogger(com/github/nkzawa/socketio/client/b.getName());
    private static final ConcurrentHashMap c = new ConcurrentHashMap();

    private b()
    {
    }

    public static d a(String s, a a1)
        throws URISyntaxException
    {
        return a(new URI(s), a1);
    }

    private static d a(URI uri, a a1)
    {
        Object obj;
label0:
        {
            obj = a1;
            if (a1 == null)
            {
                obj = new a();
            }
            a1 = e.a(uri);
            String s;
            try
            {
                uri = a1.toURI();
            }
            // Misplaced declaration of an exception variable
            catch (URI uri)
            {
                throw new RuntimeException(uri);
            }
            if (((a) (obj)).q || !((a) (obj)).r)
            {
                b.fine(String.format("ignoring socket cache for %s", new Object[] {
                    uri
                }));
                uri = new Manager(uri, ((Manager.c) (obj)));
            } else
            {
                String s1 = e.a(a1);
                if (!c.containsKey(s1))
                {
                    b.fine(String.format("new io instance for %s", new Object[] {
                        uri
                    }));
                    c.putIfAbsent(s1, new Manager(uri, ((Manager.c) (obj))));
                }
                uri = (Manager)c.get(s1);
            }
            s = a1.getPath();
            obj = (d)((Manager) (uri)).i.get(s);
            a1 = ((a) (obj));
            if (obj == null)
            {
                obj = new d(uri, s);
                a1 = (d)((Manager) (uri)).i.putIfAbsent(s, obj);
                if (a1 == null)
                {
                    break label0;
                }
            }
            return a1;
        }
        ((d) (obj)).a("connect", new Manager._cls6(uri, ((d) (obj)), uri));
        return ((d) (obj));
    }

    static 
    {
        a = c.a;
    }
}
