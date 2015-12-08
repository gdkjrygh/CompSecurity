// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.a.f.f;

import com.kik.m.e;
import java.util.ArrayList;
import kik.a.d.l;
import kik.a.d.m;
import kik.a.f.n;
import kik.a.f.o;

// Referenced classes of package kik.a.f.f:
//            y

public final class i extends y
{

    private byte a[];
    private boolean b;
    private ArrayList i;
    private m j;
    private String k;

    private i(byte abyte0[], String s)
    {
        super(null, s);
        i = new ArrayList();
        a = abyte0;
    }

    public static i a(byte abyte0[])
    {
        if (abyte0 == null || abyte0.length > 200)
        {
            return null;
        } else
        {
            return new i(abyte0, "get");
        }
    }

    protected final void a(n n1)
    {
        n1.a(null, "query");
        n1.b("xmlns", "kik:groups:admin");
        String s = null;
        String s1 = null;
        String s2 = null;
        while (!n1.b("query")) 
        {
            if (n1.a("g"))
            {
                n1.b("action", "lookup");
                Object obj;
                String s3;
                try
                {
                    b = Boolean.parseBoolean(n1.getAttributeValue(null, "is-public"));
                }
                catch (Exception exception) { }
                s3 = n1.getAttributeValue(null, "jid");
                k = s3;
                obj = s1;
            } else
            if (n1.a("n"))
            {
                obj = n1.nextText();
                s3 = s2;
            } else
            {
                obj = s1;
                s3 = s2;
                if (n1.a("m"))
                {
                    s3 = null;
                    obj = null;
                    for (; !n1.b("m"); n1.next())
                    {
                        if (n1.a("first-name"))
                        {
                            obj = n1.nextText();
                        }
                        if (n1.a("pic"))
                        {
                            s3 = n1.nextText();
                        }
                    }

                    if (kik.a.h.i.a(s3))
                    {
                        s3 = null;
                    } else
                    {
                        s3 = (new StringBuilder()).append(s3).append("/thumb.jpg").toString();
                    }
                    obj = new l(((String) (obj)), s3, false);
                    i.add(obj);
                    obj = s1;
                    s3 = s2;
                }
            }
            if (n1.a("pic"))
            {
                s = n1.nextText();
            }
            n1.next();
            s1 = ((String) (obj));
            s2 = s3;
        }
        if (kik.a.h.i.a(s))
        {
            n1 = null;
        } else
        {
            n1 = (new StringBuilder()).append(s).append("/thumb.jpg").toString();
        }
        j = new m(null, s1, s2, n1, e.b(a), i);
    }

    protected final void b(o o1)
    {
        o1.a("query");
        o1.a("xmlns", "kik:groups:admin");
        o1.a("g");
        o1.a("action", "lookup");
        if (a != null)
        {
            o1.b("invite-code", e.b(a));
        }
        o1.b("g");
        o1.b("query");
    }

    public final String d()
    {
        return k;
    }
}
