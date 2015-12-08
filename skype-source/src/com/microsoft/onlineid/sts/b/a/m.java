// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, r, u, d

public final class m extends a
{

    private Date d;
    private byte e[];
    private final r f;

    public m(XmlPullParser xmlpullparser, r r1)
    {
        super(xmlpullparser, "http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-secext-1.0.xsd", "Security");
        f = r1;
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        do
        {
            if (!c())
            {
                break;
            }
            Object obj = g();
            if (((String) (obj)).equals("wsu:Timestamp"))
            {
                if (f != null)
                {
                    obj = f.a(this);
                } else
                {
                    obj = a;
                }
                obj = new u(((XmlPullParser) (obj)));
                ((u) (obj)).a();
                d = ((u) (obj)).j();
            } else
            if (((String) (obj)).equals("wssc:DerivedKeyToken"))
            {
                obj = a.getAttributeValue("http://docs.oasis-open.org/wss/2004/01/oasis-200401-wss-wssecurity-utility-1.0.xsd", "Id");
                d d1 = new d(a);
                d1.a();
                if ("EncKey".equals(obj))
                {
                    e = d1.j();
                } else
                if ("SignKey".equals(obj) && f != null)
                {
                    f.a(d1.j());
                }
            } else
            if ("Signature".equals(obj) && f != null)
            {
                f.b(this);
            } else
            {
                e();
            }
        } while (true);
        if (d == null)
        {
            throw new f("wsu:Timestamp node not found.", new Object[0]);
        } else
        {
            return;
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
}
