// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.internal.k;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.l;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, j, u, n, 
//            i, l, k

public final class w extends com.microsoft.onlineid.sts.b.a.a
{
    public static final class a extends Enum
    {

        public static final a a;
        public static final a b;
        private static final a c[];

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(com/microsoft/onlineid/sts/b/a/w$a, s);
        }

        public static a[] values()
        {
            return (a[])c.clone();
        }

        static 
        {
            a = new a("ServiceRequest", 0);
            b = new a("NgcAuthentication", 1);
            c = (new a[] {
                a, b
            });
        }

        private a(String s, int i1)
        {
            super(s, i1);
        }
    }


    private com.microsoft.onlineid.sts.f d;
    private i e;
    private final d f;
    private q g;
    private String h;
    private final a i;

    public w(XmlPullParser xmlpullparser, d d1, a a1)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/trust", "RequestSecurityTokenResponse");
        f = d1;
        i = a1;
    }

    public w(XmlPullParser xmlpullparser, a a1)
    {
        this(xmlpullparser, null, a1);
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        Object obj;
        String s;
        String s1;
        byte abyte0[];
        Object obj1;
        s = null;
        s1 = null;
        obj = null;
        abyte0 = null;
        obj1 = null;
_L2:
        while (c()) 
        {
            Object obj2 = g();
            if (((String) (obj2)).equals("wst:TokenType"))
            {
                s = d();
            } else
            if (((String) (obj2)).equals("wsp:AppliesTo"))
            {
                obj2 = h();
                ((j) (obj2)).b("wsa:EndpointReference");
                h().b("wsa:Address");
                s1 = d();
                ((j) (obj2)).b();
            } else
            if (((String) (obj2)).equals("wst:Lifetime"))
            {
                obj1 = new u(a);
                ((u) (obj1)).a();
                obj1 = ((u) (obj1)).j();
            } else
            {
                static final class _cls1
                {

                    static final int a[];

                    static 
                    {
                        a = new int[a.values().length];
                        try
                        {
                            a[a.a.ordinal()] = 1;
                        }
                        catch (NoSuchFieldError nosuchfielderror1) { }
                        try
                        {
                            a[a.b.ordinal()] = 2;
                        }
                        catch (NoSuchFieldError nosuchfielderror)
                        {
                            return;
                        }
                    }
                }

                if (((String) (obj2)).equals("wst:RequestedSecurityToken"))
                {
                    switch (_cls1.a[i.ordinal()])
                    {
                    case 1: // '\001'
                        obj = new n(a);
                        ((n) (obj)).a();
                        obj = ((n) (obj)).j();
                        break;

                    case 2: // '\002'
                        obj = new com.microsoft.onlineid.sts.b.a.i(a);
                        ((com.microsoft.onlineid.sts.b.a.i) (obj)).a();
                        obj = ((com.microsoft.onlineid.sts.b.a.i) (obj)).j();
                        break;
                    }
                } else
                if (((String) (obj2)).equals("wst:RequestedProofToken"))
                {
                    abyte0 = new com.microsoft.onlineid.sts.b.a.l(a);
                    abyte0.a();
                    abyte0 = abyte0.j();
                } else
                if (((String) (obj2)).equals("psf:pp"))
                {
                    com.microsoft.onlineid.sts.b.a.k k1 = new com.microsoft.onlineid.sts.b.a.k(a);
                    k1.a();
                    g = new q(new l(k1.k()));
                    h = k1.l();
                } else
                {
                    e();
                }
                continue; /* Loop/switch isn't completed */
            }
        }
        if (g == null && s == null)
        {
            throw new f("wst:TokenType node is missing", new Object[0]);
        }
        boolean flag;
        if (com.microsoft.onlineid.internal.k.a(s, "urn:passport:legacy") && abyte0 != null)
        {
            try
            {
                com.microsoft.onlineid.internal.e.a(com.microsoft.onlineid.sts.f.a.a().equals(s1));
                d = new com.microsoft.onlineid.sts.f(((String) (obj)), abyte0);
                return;
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                throw new f(illegalargumentexception);
            }
        }
        break MISSING_BLOCK_LABEL_396;
        if (true) goto _L2; else goto _L1
_L1:
        if (!com.microsoft.onlineid.internal.k.a(s, "urn:passport:compact") && !com.microsoft.onlineid.internal.k.a(s, "urn:passport:loginprooftoken") || g != null)
        {
            break MISSING_BLOCK_LABEL_487;
        }
        if (f != null && f.a().equals(s1))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        e = new i(f, ((java.util.Date) (obj1)), ((String) (obj)));
        return;
    }

    public final com.microsoft.onlineid.sts.f j()
    {
        i();
        return d;
    }

    public final i k()
    {
        i();
        return e;
    }

    public final q l()
    {
        i();
        return g;
    }

    public final String m()
    {
        i();
        return h;
    }
}
