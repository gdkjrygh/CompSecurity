// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, g

public final class i extends a
{

    private String d;

    public i(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/trust", "RequestedSecurityToken");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("EncryptedData");
        g g1 = new g(a);
        g1.a();
        d = g1.j();
    }

    public final String j()
    {
        i();
        return d;
    }
}
