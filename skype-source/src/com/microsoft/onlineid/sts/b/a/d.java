// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, t

public final class d extends a
{

    private byte d[];

    public d(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/sc", "DerivedKeyToken");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        b("wssc:Nonce");
        d = t.a(d());
    }

    public final byte[] j()
    {
        i();
        return d;
    }
}
