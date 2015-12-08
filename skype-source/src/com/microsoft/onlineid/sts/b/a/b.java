// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.internal.a.d;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.n;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, j, t

public final class b extends a
{

    private final com.microsoft.onlineid.sts.n.a d;
    private final Map e = new HashMap();
    private final Map f = new HashMap();
    private final Map g = new HashMap();
    private final Map h = new HashMap();

    public b(XmlPullParser xmlpullparser, com.microsoft.onlineid.sts.n.a a1)
    {
        super(xmlpullparser, "http://www.w3.org/2000/09/xmldsig#", "Signature");
        d = a1;
        a(e, n.b);
        xmlpullparser = com.microsoft.onlineid.sts.n.c.values();
        int l = xmlpullparser.length;
        for (int i = 0; i < l; i++)
        {
            a1 = xmlpullparser[i];
            a(f, a1);
        }

        xmlpullparser = com.microsoft.onlineid.sts.n.b.values();
        l = xmlpullparser.length;
        for (int k = 0; k < l; k++)
        {
            a1 = xmlpullparser[k];
            a(g, a1);
        }

        a(h, n.e);
    }

    private static void a(Map map, d d1)
    {
        map.put(d1.a(), d1);
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("cfg:Configuration");
        j j1 = h();
label0:
        do
        {
            if (!j1.e())
            {
                break;
            }
            String s = g();
            if (s.equalsIgnoreCase("cfg:Settings") || s.equalsIgnoreCase("cfg:ServiceURIs") || s.equalsIgnoreCase("cfg:ServiceURIs1"))
            {
                j j2 = h();
                do
                {
                    do
                    {
                        Object obj;
                        do
                        {
                            boolean flag;
                            do
                            {
                                do
                                {
                                    if (!j2.e())
                                    {
                                        continue label0;
                                    }
                                    obj = a.getName();
                                    Object obj1 = (d)e.get(obj);
                                    Object obj2;
                                    android.text.TextUtils.SimpleStringSplitter simplestringsplitter;
                                    if (obj1 != null)
                                    {
                                        d.b(((d) (obj1)), d());
                                        flag = true;
                                    } else
                                    {
                                        flag = false;
                                    }
                                } while (flag);
                                obj1 = (d)f.get(obj);
                                if (obj1 != null)
                                {
                                    d.b(((d) (obj1)), t.a(d(), ((String) (obj))));
                                    flag = true;
                                } else
                                {
                                    flag = false;
                                }
                            } while (flag);
                            obj1 = (com.microsoft.onlineid.sts.n.b)g.get(obj);
                            if (obj1 != null)
                            {
                                d.a(((com.microsoft.onlineid.sts.n.b) (obj1)), t.b(d(), ((String) (obj))));
                                flag = true;
                            } else
                            {
                                flag = false;
                            }
                        } while (flag);
                        obj = (d)h.get(obj);
                        boolean flag1;
                        if (obj != null)
                        {
                            obj2 = d();
                            if (!TextUtils.isEmpty(((CharSequence) (obj2))))
                            {
                                HashSet hashset = new HashSet();
                                simplestringsplitter = new android.text.TextUtils.SimpleStringSplitter(',');
                                simplestringsplitter.setString(((String) (obj2)));
                                for (obj2 = simplestringsplitter.iterator(); ((Iterator) (obj2)).hasNext(); hashset.add((String)((Iterator) (obj2)).next())) { }
                                d.b(((d) (obj)), hashset);
                            }
                            flag1 = true;
                        } else
                        {
                            flag1 = false;
                        }
                    } while (flag1);
                    j2.d();
                } while (true);
            }
            j1.d();
        } while (true);
    }
}
