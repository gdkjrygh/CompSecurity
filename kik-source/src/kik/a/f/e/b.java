// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.e;

import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kik.a.d.a.a;
import kik.a.d.a.g;
import kik.a.f.n;
import kik.a.f.o;
import kik.a.h.e;
import kik.a.h.i;

// Referenced classes of package kik.a.f.e:
//            g, i

public class b
    implements kik.a.f.e.g, kik.a.f.e.i
{

    public b()
    {
    }

    public final long a(o o1, g g1)
    {
        g1 = (a)g1;
        o1.a("content");
        o1.a("id", g1.o());
        if (g1.u() != null)
        {
            o1.a("app-id", g1.u());
        }
        o1.a("v", g1.p());
        o1.a("strings");
        Object obj = g1.r();
        if (((Map) (obj)).containsKey("app-name"))
        {
            o1.b("app-name", (String)((Map) (obj)).get("app-name"));
        }
        if (((Map) (obj)).containsKey("file-size"))
        {
            o1.b("file-size", (String)((Map) (obj)).get("file-size"));
        }
        o1.a();
        obj = ((Map) (obj)).entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            java.util.Map.Entry entry = (java.util.Map.Entry)((Iterator) (obj)).next();
            String s1 = (String)entry.getKey();
            if (s1 != null && !"file-url".equals(s1) && !s1.startsWith("int-") && !"app-name".equals(s1) && !"file-size".equals(s1))
            {
                o1.a(s1);
                o1.c((String)entry.getValue());
                o1.b(s1);
            }
        } while (true);
        long l = o1.b();
        o1.b("strings");
        o1.a("extras");
        o1.a();
        obj = g1.q().entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj1 = (java.util.Map.Entry)((Iterator) (obj)).next();
            String s = (String)((java.util.Map.Entry) (obj1)).getKey();
            obj1 = (String)((java.util.Map.Entry) (obj1)).getValue();
            if (!i.a(s) && !i.a(((CharSequence) (obj1))))
            {
                o1.a("item");
                o1.b("key", s);
                o1.b("val", ((String) (obj1)));
                o1.b("item");
            }
        } while (true);
        long l1 = o1.b();
        o1.b("extras");
        o1.a("images");
        o1.a();
        obj = g1.s().entrySet().iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            Object obj2 = (java.util.Map.Entry)((Iterator) (obj)).next();
            byte abyte0[] = e.a().a((kik.a.d.o)((java.util.Map.Entry) (obj2)).getValue());
            if (abyte0 != null)
            {
                obj2 = (String)((java.util.Map.Entry) (obj2)).getKey();
                o1.a(((String) (obj2)));
                o1.c(com.kik.m.e.a(abyte0));
                o1.b(((String) (obj2)));
            }
        } while (true);
        long l2 = o1.b();
        o1.b("images");
        o1.a("uris");
        obj = g1.f();
        if (obj != null)
        {
            int j = 0;
            while (j < ((ArrayList) (obj)).size()) 
            {
                g1 = (com.kik.f.a.a.a)((ArrayList) (obj)).get(j);
                o1.a("uri");
                if (g1.c() != null)
                {
                    o1.a("platform", g1.c());
                }
                if (g1.d() != null)
                {
                    o1.a("type", g1.d());
                }
                if (g1.i() != null)
                {
                    o1.a("file-content-type", g1.i());
                }
                if (g1.f() == null)
                {
                    g1 = "";
                } else
                {
                    g1 = g1.f();
                }
                o1.c(g1);
                o1.b("uri");
                j++;
            }
        }
        o1.b("uris");
        o1.b("content");
        return l + 0L + l1 + l2;
    }

    public final g a(n n1)
    {
        Hashtable hashtable = new Hashtable();
        ArrayList arraylist = new ArrayList();
        Hashtable hashtable1 = new Hashtable();
        Hashtable hashtable2 = new Hashtable();
        n1.a(null, "content");
        String s6 = n1.getAttributeValue(null, "id");
        String s7 = n1.getAttributeValue(null, "app-id");
        String s8 = n1.getAttributeValue(null, "v");
label0:
        do
        {
label1:
            do
            {
                for (int j = n1.getDepth(); j < n1.a();)
                {
                    if (n1.a("uris"))
                    {
                        int k = n1.getDepth();
                        while (k < n1.a()) 
                        {
                            if (n1.a("uri") && arraylist.size() < 10)
                            {
                                Object obj = n1.getAttributeValue(null, "priority");
                                String s = n1.getAttributeValue(null, "platform");
                                String s3 = n1.getAttributeValue(null, "type");
                                String s9 = n1.getAttributeValue(null, "file-content-type");
                                String s11 = n1.nextText();
                                i.b(((String) (obj)));
                                obj = new com.kik.f.a.a.a(s11, s7);
                                ((com.kik.f.a.a.a) (obj)).a(s);
                                ((com.kik.f.a.a.a) (obj)).b(s3);
                                ((com.kik.f.a.a.a) (obj)).e(s9);
                                arraylist.add(obj);
                            }
                        }
                    } else
                    if (n1.a("extras"))
                    {
                        int l = n1.getDepth();
                        while (l < n1.a()) 
                        {
                            if (n1.a("item"))
                            {
                                String s1 = null;
                                String s4 = null;
                                int k1 = n1.getDepth();
                                do
                                {
                                    if (k1 >= n1.a())
                                    {
                                        break;
                                    }
                                    if (n1.a("key"))
                                    {
                                        s1 = n1.nextText();
                                    } else
                                    if (n1.a("val"))
                                    {
                                        s4 = n1.nextText();
                                    }
                                } while (true);
                                if (!i.a(s1) && !i.a(s4))
                                {
                                    hashtable.put(s1, s4);
                                }
                            }
                        }
                    } else
                    {
                        if (!n1.a("strings"))
                        {
                            continue label1;
                        }
                        int i1 = n1.getDepth();
                        while (i1 < n1.a()) 
                        {
                            if (n1.a(null))
                            {
                                String s10 = n1.getName();
                                String s5 = n1.nextText();
                                String s2 = s5;
                                if (s5 != null)
                                {
                                    s2 = s5;
                                    if (s5.length() >= 1000)
                                    {
                                        s2 = s5.substring(0, 1000);
                                    }
                                }
                                hashtable1.put(s10, s2);
                            }
                        }
                    }
                }

                break label0;
            } while (!n1.a("images"));
            int j1 = n1.getDepth();
            while (j1 < n1.a()) 
            {
                if (n1.a(null))
                {
                    hashtable2.put(n1.getName(), new kik.a.d.o(com.kik.m.e.a(n1.nextText())));
                }
            }
        } while (true);
        return new a(s6, s7, s8, arraylist, hashtable1, hashtable2, hashtable);
    }
}
