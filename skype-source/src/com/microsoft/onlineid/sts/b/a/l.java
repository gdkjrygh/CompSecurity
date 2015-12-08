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
//            a, g, t

public final class l extends a
{

    private byte d[];

    public l(XmlPullParser xmlpullparser)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/trust", "RequestedProofToken");
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            String s = g();
            if (s.equals("EncryptedKey"))
            {
                (new g(a, "EncryptedKey")).a();
                boolean flag;
                if (d == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                e.a(flag);
                d = null;
            } else
            if (s.equals("wst:BinarySecret"))
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
                d = t.a(d());
            } else
            {
                e();
            }
        }
    }

    public final byte[] j()
    {
        i();
        return d;
    }
}
