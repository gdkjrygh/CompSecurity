// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.internal.h;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.p;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a

public final class s extends a
{

    private String d;
    private Integer e;
    private p f;

    public s(XmlPullParser xmlpullparser)
        throws XmlPullParserException
    {
        super(xmlpullparser, null, null);
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            String s1 = a.getName();
            if (s1.equals("Error"))
            {
                d = a.getAttributeValue("", "Code");
            } else
            if (s1.equals("ErrorSubcode"))
            {
                String s2 = a.nextText();
                try
                {
                    e = Integer.valueOf(h.a(s2));
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    throw new f("Hex error code could not be parsed: %s.", illegalargumentexception, new Object[] {
                        s2
                    });
                }
            } else
            {
                e();
            }
        }
        if (d == null)
        {
            throw new f("Required node \"Error\" is missing or empty.", new Object[0]);
        }
        if (e == null)
        {
            throw new f("Required node \"ErrorSubcode\" is missing.", new Object[0]);
        } else
        {
            f = new p(d, e.intValue());
            return;
        }
    }

    public final p j()
    {
        i();
        return f;
    }
}
