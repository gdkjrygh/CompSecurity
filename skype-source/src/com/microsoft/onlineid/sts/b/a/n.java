// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.sts.a.f;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a

public final class n extends a
{

    private String d;

    public n(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/trust", "RequestedSecurityToken");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            String s = g();
            if (s.equals("EncryptedData"))
            {
                boolean flag;
                if (d == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e.a(flag);
                d = f();
            } else
            if (s.equals("wsse:BinarySecurityToken"))
            {
                boolean flag1;
                if (d == null)
                {
                    flag1 = true;
                } else
                {
                    flag1 = false;
                }
                e.a(flag1);
                d = d();
            } else
            {
                e();
            }
        }
    }

    public final String j()
    {
        i();
        return d;
    }
}
