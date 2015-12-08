// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import java.security.KeyPair;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;
import kik.a.d.j;
import kik.a.f.c.e;
import kik.a.f.c.f;
import kik.a.f.n;
import kik.a.f.o;
import org.c.b;
import org.c.c;

// Referenced classes of package kik.a.f.f:
//            y, z

public final class ah extends y
{
    private final class a
        implements Comparator
    {

        final ah a;

        public final int compare(Object obj, Object obj1)
        {
            obj = (kik.a.f.c.c)obj;
            obj1 = (kik.a.f.c.c)obj1;
            long l1 = ((kik.a.f.c.c) (obj)).k();
            long l2 = ((kik.a.f.c.c) (obj1)).k();
            if (l1 == l2)
            {
                return 0;
            }
            return l1 >= l2 ? 1 : -1;
        }

        private a()
        {
            a = ah.this;
            super();
        }

        a(byte byte0)
        {
            this();
        }
    }

    private static final class b
    {

        public final List a = new ArrayList();
        public final boolean b;
        public final String c;
        public final String d;

        public b(boolean flag, String s, String s1)
        {
            b = flag;
            c = s1;
            d = s;
        }
    }


    private static final org.c.b a = c.a("QosRequest");
    private kik.a.e.o b;
    private KeyPair i;
    private final boolean j;
    private final Map k;
    private final List l;
    private Vector m;
    private long n;
    private boolean o;

    public ah(kik.a.f.j j1, KeyPair keypair, kik.a.e.o o1)
    {
        this(j1, keypair, o1, true);
    }

    public ah(kik.a.f.j j1, KeyPair keypair, kik.a.e.o o1, boolean flag)
    {
        super(j1, "set");
        n = 0x36ee80L;
        o = false;
        i = keypair;
        k = new LinkedHashMap();
        l = new ArrayList();
        j = flag;
        b = o1;
    }

    public final void a(kik.a.f.c.c c1, boolean flag, boolean flag1)
    {
        String s1 = c1.h();
        Object obj = null;
        String s = (new StringBuilder()).append(c1.i()).append(c1.h()).toString();
        if (flag)
        {
            obj = c1.i();
        }
        if (!k.containsKey(s))
        {
            obj = new b(flag1, s1, ((String) (obj)));
            k.put(s, obj);
        } else
        {
            obj = (b)k.get(s);
        }
        if (((b) (obj)).b != flag1)
        {
            throw new IllegalArgumentException("Attempting to block a message for an unblocked user");
        } else
        {
            ((b) (obj)).a.add(c1);
            return;
        }
    }

    protected final void a(n n1)
    {
        if (j)
        {
            m = new Vector();
        }
        n1.a(null, "query");
        n1.b("xmlns", "kik:iq:QoS");
        do
        {
            if (n1.b("query") || n1.b("iq"))
            {
                break;
            }
            if (j && n1.a("msg"))
            {
                String s = n1.getAttributeValue(null, "from");
                String s2 = n1.getAttributeValue(null, "id");
                try
                {
                    kik.a.f.c.c c1 = kik.a.f.c.e.a(n1, i, b);
                    m.addElement(c1);
                }
                catch (Exception exception)
                {
                    if (s2 != null && s != null)
                    {
                        l.add(new f(s2, kik.a.d.j.a(s), kik.a.d.j.a(s)));
                    }
                }
            } else
            if (n1.a("polling"))
            {
                String s1 = n1.getAttributeValue(null, "interval");
                try
                {
                    n = (long)Integer.parseInt(s1) * 60000L;
                }
                catch (NumberFormatException numberformatexception)
                {
                    (new StringBuilder("Failed to parse polling interval, got '")).append(s1).append("'");
                }
            }
            if (j && n1.a("history") && "1".equals(n1.getAttributeValue(null, "more")))
            {
                o = true;
            }
            n1.next();
        } while (true);
        if (j)
        {
            Collections.sort(m, new a((byte)0));
        }
    }

    public final boolean a(z z)
    {
        return k == null && (z instanceof ah) && ((ah)z).k == null;
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:iq:QoS");
        o1.a("msg-acks");
        Iterator iterator = k.values().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            b b1 = (b)iterator.next();
            if (!b1.a.isEmpty())
            {
                o1.a("sender");
                o1.a("jid", b1.d);
                if (b1.b)
                {
                    o1.a("b", "1");
                }
                Iterator iterator1;
                boolean flag;
                if (b1.c != null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    o1.a("g", b1.c);
                }
                iterator1 = b1.a.iterator();
                while (iterator1.hasNext()) 
                {
                    kik.a.f.c.c c1 = (kik.a.f.c.c)iterator1.next();
                    o1.a("ack-id");
                    String s;
                    String s2;
                    if (c1.d())
                    {
                        s2 = "e";
                        s = "1";
                    } else
                    {
                        s2 = "receipt";
                        if (c1.g())
                        {
                            s = "true";
                        } else
                        {
                            s = "false";
                        }
                    }
                    o1.a(s2, s);
                    o1.c(c1.j());
                    o1.b("ack-id");
                }
                o1.b("sender");
            }
        } while (true);
        o1.b("msg-acks");
        String s1;
        if (j)
        {
            s1 = "true";
        } else
        {
            s1 = "false";
        }
        o1.a("history");
        o1.a("attach", s1);
        o1.b("history");
        o1.b("query");
    }

    public final long d()
    {
        return n;
    }

    public final Vector e()
    {
        return m;
    }

    public final boolean f()
    {
        return o;
    }

    public final List g()
    {
        return l;
    }

    protected final boolean i()
    {
        return true;
    }

}
