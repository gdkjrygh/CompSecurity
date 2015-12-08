// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.s;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a

public final class x extends a
{

    private final s d = new s();

    public x(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://schemas.microsoft.com/Passport/SoapServices/SOAPFault", "credProperties");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
_L2:
        Object obj;
        if (!c())
        {
            break; /* Loop/switch isn't completed */
        }
        obj = a.getAttributeValue("", "Name");
        if (obj == null)
        {
            e();
            continue; /* Loop/switch isn't completed */
        }
        obj = com.microsoft.onlineid.sts.s.a.valueOf(((String) (obj)));
        d.a(((com.microsoft.onlineid.sts.s.a) (obj)), a.nextText());
        continue; /* Loop/switch isn't completed */
        IllegalArgumentException illegalargumentexception;
        illegalargumentexception;
        e();
        if (true) goto _L2; else goto _L1
_L1:
    }

    public final s j()
    {
        i();
        return d;
    }
}
