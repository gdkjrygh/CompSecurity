// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.internal.o;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, s

public final class f extends a
{

    private String d;
    private q e;

    public f(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "", "DeviceAddResponse");
    }

    protected final void b()
        throws XmlPullParserException, IOException, com.microsoft.onlineid.sts.a.f
    {
        if (o.b(a.getAttributeValue("", "Success"), "true"))
        {
            b("puid");
            d = d();
            return;
        } else
        {
            s s1 = new s(a);
            s1.a();
            e = new q(s1.j());
            return;
        }
    }

    public final String j()
    {
        i();
        return d;
    }

    public final q k()
    {
        i();
        return e;
    }
}
