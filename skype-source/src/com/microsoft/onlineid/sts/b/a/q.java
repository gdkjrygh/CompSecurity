// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import android.util.Xml;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.c.d;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.e;
import com.microsoft.onlineid.sts.o;
import com.microsoft.onlineid.sts.s;
import java.io.IOException;
import java.io.StringReader;
import java.util.Date;
import java.util.Set;
import javax.crypto.BadPaddingException;
import javax.crypto.IllegalBlockSizeException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, k, t, r, 
//            p, o, v

public final class q extends a
{

    private final byte d[];
    private final com.microsoft.onlineid.d e;
    private byte f[];
    private i g;
    private com.microsoft.onlineid.sts.f h;
    private Date i;
    private int j;
    private int k;
    private String l;
    private String m;
    private String n;
    private s o;
    private com.microsoft.onlineid.sts.q p;
    private com.microsoft.onlineid.sts.q q;
    private String r;
    private Set s;

    public q(XmlPullParser xmlpullparser, byte abyte0[], com.microsoft.onlineid.d d1)
    {
        super(xmlpullparser, "http://www.w3.org/2003/05/soap-envelope", "Envelope");
        d = abyte0;
        e = d1;
    }

    private void a(k k1)
        throws f, IOException, XmlPullParserException
    {
        j = k1.j();
        k = k1.k();
        l = k1.l();
        m = k1.m();
        n = k1.n();
        o = k1.o();
        s = k1.p();
        if (o != null && o.a(com.microsoft.onlineid.sts.s.a.a) == null)
        {
            throw new f("CID not found.", new Object[0]);
        } else
        {
            return;
        }
    }

    private String c(String s1)
        throws f
    {
        s1 = t.a(s1);
        byte abyte0[] = (new o(d)).a(com.microsoft.onlineid.sts.o.a.b, f);
        try
        {
            s1 = new String(com.microsoft.onlineid.sts.e.a(s1, abyte0), com.microsoft.onlineid.internal.o.a);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new f(s1);
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            throw new f(s1);
        }
        return s1;
    }

    protected final void b()
        throws IOException, f, XmlPullParserException
    {
        Object obj;
        Object obj1;
        Object obj2;
        obj2 = null;
        obj1 = null;
        obj = null;
        r r1 = new r(d);
        while (c()) 
        {
            String s1 = g();
            if (s1.equals("S:Header"))
            {
                obj1 = new p(a, r1);
                ((p) (obj1)).a();
                i = ((p) (obj1)).j();
                f = ((p) (obj1)).k();
                obj2 = ((p) (obj1)).l();
                obj1 = ((p) (obj1)).m();
            } else
            if (s1.equals("S:Body"))
            {
                obj = new com.microsoft.onlineid.sts.b.a.o(r1.a(this));
                ((com.microsoft.onlineid.sts.b.a.o) (obj)).a();
                p = ((com.microsoft.onlineid.sts.b.a.o) (obj)).j();
                obj = ((com.microsoft.onlineid.sts.b.a.o) (obj)).k();
            } else
            {
                e();
            }
        }
        if (f != null || r1.a())
        {
            r1.b();
        }
        if (TextUtils.isEmpty(((CharSequence) (obj1)))) goto _L2; else goto _L1
_L1:
        obj1 = c(((String) (obj1)));
        com.microsoft.onlineid.internal.c.d.a(new com.microsoft.onlineid.internal.c.e((new StringBuilder("Decrypted service response header: ")).append(((String) (obj1))).toString()));
        obj2 = Xml.newPullParser();
        ((XmlPullParser) (obj2)).setInput(new StringReader(((String) (obj1))));
        obj1 = new k(((XmlPullParser) (obj2)));
        ((k) (obj1)).a();
        a(((k) (obj1)));
_L4:
        if (p == null)
        {
            obj = c(((String) (obj)));
            com.microsoft.onlineid.internal.c.d.a(new com.microsoft.onlineid.internal.c.e((new StringBuilder("Decrypted service response body: ")).append(((String) (obj))).toString()));
            XmlPullParser xmlpullparser = Xml.newPullParser();
            xmlpullparser.setInput(new StringReader(((String) (obj))));
            obj = new v(xmlpullparser, e);
            ((v) (obj)).a();
            h = ((v) (obj)).j();
            g = ((v) (obj)).k();
            q = ((v) (obj)).l();
            r = ((v) (obj)).m();
        }
        return;
_L2:
        if (obj2 != null)
        {
            a(((k) (obj2)));
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final i j()
    {
        i();
        return g;
    }

    public final String k()
    {
        i();
        return m;
    }

    public final com.microsoft.onlineid.sts.f l()
    {
        i();
        return h;
    }

    public final Date m()
    {
        i();
        return i;
    }

    public final com.microsoft.onlineid.sts.q n()
    {
        i();
        return p;
    }

    public final String o()
    {
        i();
        return l;
    }

    public final com.microsoft.onlineid.sts.q p()
    {
        i();
        return q;
    }

    public final String q()
    {
        i();
        return r;
    }
}
