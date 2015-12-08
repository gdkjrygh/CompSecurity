// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.request;

import android.text.TextUtils;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.internal.a.c;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.sts.a.a;
import com.microsoft.onlineid.sts.b.b;
import com.microsoft.onlineid.sts.f;
import com.microsoft.onlineid.sts.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.xml.sax.SAXException;

// Referenced classes of package com.microsoft.onlineid.sts.request:
//            c, f, g

public final class h extends com.microsoft.onlineid.sts.request.c
    implements com.microsoft.onlineid.sts.request.f
{

    protected List a;
    private t b;
    private Element c;
    private f d;
    private f e;
    private String f;
    private String g;
    private boolean h;
    private String i;

    public h()
    {
        h = false;
        a = new ArrayList();
        a.add(f.a);
    }

    public final void a(d d1)
    {
        boolean flag1 = true;
        if (d1 == null)
        {
            throw new IllegalArgumentException("Cannot request a null scope.");
        }
        boolean flag;
        if (a.size() < 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        if (!d1.equals(f.a))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        if (!a.contains(d1))
        {
            a.add(d1);
        }
    }

    public final void a(f f1)
    {
        d = f1;
    }

    public final void a(t t1)
    {
        b = t1;
    }

    public final void a(String s)
    {
        i = s;
    }

    protected final void a(Element element)
    {
        super.a(element);
        com.microsoft.onlineid.sts.request.g.a(element, "ps:InlineUX", "Android");
        com.microsoft.onlineid.sts.request.g.a(element, "ps:ConsentFlags", "1");
        com.microsoft.onlineid.sts.request.g.a(element, "ps:IsConnected", "1");
        if (h)
        {
            com.microsoft.onlineid.sts.request.g.a(element, "ps:Experiments", com.microsoft.onlineid.internal.a.c.a());
        }
        if (i != null)
        {
            com.microsoft.onlineid.sts.request.g.a(element, "ps:InlineFT", i);
        }
        com.microsoft.onlineid.sts.request.g.a(element, "ps:ClientAppURI", f);
        if (!TextUtils.isEmpty(g))
        {
            com.microsoft.onlineid.sts.request.g.a(element, "ps:Telemetry", g);
        }
    }

    public final void a(boolean flag)
    {
        h = flag;
    }

    public final com.microsoft.onlineid.sts.n.b b()
    {
        return com.microsoft.onlineid.sts.n.b.b;
    }

    public final void b(f f1)
    {
        e = f1;
    }

    public final void b(String s)
    {
        f = s;
    }

    protected final void b(Element element)
    {
        Element element1;
        Element element2;
        try
        {
            element1 = com.microsoft.onlineid.sts.request.g.a(d.a());
        }
        // Misplaced declaration of an exception variable
        catch (Element element)
        {
            throw new a("Unable to parse user DAToken blob into XML, possibly corrupt.", element);
        }
        element.appendChild(element.getOwnerDocument().importNode(element1, true));
        a(element, e);
        element1 = com.microsoft.onlineid.sts.request.g.a(element, "wssc:DerivedKeyToken");
        element1.setAttribute("wsu:Id", "SignKey");
        element1.setAttribute("Algorithm", "urn:liveid:SP800-108CTR-HMAC-SHA256");
        element2 = com.microsoft.onlineid.sts.request.g.a(element1, "wsse:RequestedTokenReference");
        com.microsoft.onlineid.sts.request.g.a(element2, "wsse:KeyIdentifier").setAttribute("ValueType", "http://docs.oasis-open.org/wss/2004/XX/oasis-2004XX-wss-saml-token-profile-1.0#SAMLAssertionID");
        com.microsoft.onlineid.sts.request.g.a(element2, "wsse:Reference").setAttribute("URI", "");
        com.microsoft.onlineid.sts.request.g.a(element1, "wssc:Nonce", b.a());
        d(element);
        c = element;
    }

    public final void c(String s)
    {
        g = s;
    }

    public final b f()
    {
        d d1;
        Iterator iterator;
        boolean flag;
        if (a.size() == 2)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        com.microsoft.onlineid.internal.e.a(flag);
        iterator = a.iterator();
        if (!iterator.hasNext()) goto _L2; else goto _L1
_L1:
        d1 = (d)iterator.next();
        if (d1.equals(f.a))
        {
            break MISSING_BLOCK_LABEL_29;
        }
_L4:
        return new com.microsoft.onlineid.sts.b.e(d.b(), d1, d());
_L2:
        d1 = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    protected final List g()
    {
        return a;
    }

    public final t g_()
    {
        return b;
    }

    public final Element h_()
    {
        return c;
    }

    public final byte[] i_()
    {
        return d.b();
    }
}
