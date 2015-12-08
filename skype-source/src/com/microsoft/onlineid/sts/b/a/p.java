// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import android.text.TextUtils;
import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, m, k, j, 
//            r, g

public final class p extends a
{

    private Date d;
    private byte e[];
    private String f;
    private final r g;
    private k h;

    public p(XmlPullParser xmlpullparser)
    {
        this(xmlpullparser, null);
    }

    public p(XmlPullParser xmlpullparser, r r1)
    {
        super(xmlpullparser, "http://www.w3.org/2003/05/soap-envelope", "Header");
        g = r1;
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            Object obj = g();
            Object obj2 = a.getAttributeValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
            if (((String) (obj)).equals("wsse:Security"))
            {
                obj = new m(a, g);
                ((m) (obj)).a();
                d = ((m) (obj)).j();
                e = ((m) (obj)).k();
            } else
            if (((String) (obj)).equals("psf:pp"))
            {
                h = new k(a);
                h.a();
            } else
            if (((String) (obj)).equals("psf:EncryptedPP"))
            {
                obj2 = h();
                ((j) (obj2)).b("EncryptedData");
                Object obj1;
                if (g != null)
                {
                    obj1 = g.a(this);
                } else
                {
                    obj1 = a;
                }
                obj1 = new g(((XmlPullParser) (obj1)));
                ((g) (obj1)).a();
                f = ((g) (obj1)).j();
                ((j) (obj2)).b();
            } else
            if (g != null && !TextUtils.isEmpty(((CharSequence) (obj2))))
            {
                g.a(this);
            } else
            {
                e();
            }
        }
    }

    public final Date j()
    {
        i();
        return d;
    }

    public final byte[] k()
    {
        i();
        return e;
    }

    public final k l()
    {
        i();
        return h;
    }

    public final String m()
    {
        i();
        return f;
    }
}
