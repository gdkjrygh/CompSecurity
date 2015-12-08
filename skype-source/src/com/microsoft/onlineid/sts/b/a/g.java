// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, j

public final class g extends a
{

    private String d;

    public g(XmlPullParser xmlpullparser)
    {
        this(xmlpullparser, "EncryptedData");
    }

    public g(XmlPullParser xmlpullparser, String s)
    {
        super(xmlpullparser, "http://www.w3.org/2001/04/xmlenc#", s);
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("CipherData");
        j j1 = h();
        j1.b("CipherValue");
        d = d();
        j1.b();
    }

    public final String j()
    {
        i();
        return d;
    }
}
