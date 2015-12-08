// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.internal.e;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, w

public final class v extends a
{

    private final d d;
    private com.microsoft.onlineid.sts.f e;
    private i f;
    private q g;
    private String h;

    public v(XmlPullParser xmlpullparser, d d1)
    {
        super(xmlpullparser, "http://schemas.xmlsoap.org/ws/2005/02/trust", "RequestSecurityTokenResponseCollection");
        d = d1;
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        do
        {
            if (!a("wst:RequestSecurityTokenResponse"))
            {
                break;
            }
            w w1 = new w(a, d, w.a.a);
            w1.a();
            boolean flag;
            if (w1.j() != null)
            {
                if (e == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.microsoft.onlineid.internal.e.a(flag);
                e = w1.j();
            }
            if (w1.l() != null)
            {
                if (g == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.microsoft.onlineid.internal.e.a(flag);
                g = w1.l();
                h = w1.m();
            }
            if (w1.k() != null)
            {
                if (f == null)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                com.microsoft.onlineid.internal.e.a(flag);
                f = w1.k();
            }
        } while (true);
        if (d != null && g == null && f == null)
        {
            throw new f("No ticket or ticket error found.", new Object[0]);
        } else
        {
            return;
        }
    }

    public final com.microsoft.onlineid.sts.f j()
    {
        i();
        return e;
    }

    public final i k()
    {
        i();
        return f;
    }

    public final q l()
    {
        i();
        return g;
    }

    public final String m()
    {
        i();
        return h;
    }
}
