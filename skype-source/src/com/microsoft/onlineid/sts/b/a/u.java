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
//            a, c

public final class u extends a
{

    private Date d;

    public u(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, null, null);
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("wsu:Expires");
        c c1 = new c(a, c.a.b);
        c1.a();
        d = c1.j();
    }

    public final Date j()
    {
        i();
        return d;
    }
}
