// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, h, g, w

public final class o extends a
{

    private q d;
    private String e;
    private com.microsoft.onlineid.sts.f f;

    public o(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://www.w3.org/2003/05/soap-envelope", "Body");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            Object obj = g();
            if (((String) (obj)).equals("S:Fault"))
            {
                obj = new h(a);
                ((h) (obj)).a();
                d = ((h) (obj)).j();
            } else
            if (((String) (obj)).equals("EncryptedData"))
            {
                obj = new g(a);
                ((g) (obj)).a();
                e = ((g) (obj)).j();
            } else
            if (((String) (obj)).equals("wst:RequestSecurityTokenResponse"))
            {
                w w1 = new w(a, w.a.a);
                w1.a();
                f = w1.j();
            } else
            {
                e();
            }
        }
    }

    public final q j()
    {
        i();
        return d;
    }

    public final String k()
    {
        i();
        return e;
    }

    public final com.microsoft.onlineid.sts.f l()
    {
        i();
        return f;
    }
}
