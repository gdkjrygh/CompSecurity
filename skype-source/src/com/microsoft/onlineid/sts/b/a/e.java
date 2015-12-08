// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b.a;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.c;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

// Referenced classes of package com.microsoft.onlineid.sts.b.a:
//            a, p, k, o

public final class e extends a
{

    private final c d;
    private com.microsoft.onlineid.sts.f e;
    private int f;
    private int g;
    private String h;
    private q i;
    private Date j;

    public e(XmlPullParser xmlpullparser, c c1)
    {
        super(xmlpullparser, "http://www.w3.org/2003/05/soap-envelope", "Envelope");
        d = c1;
    }

    protected final void b()
        throws XmlPullParserException, IOException, f
    {
        while (c()) 
        {
            Object obj = g();
            if (((String) (obj)).equals("S:Header"))
            {
                obj = new p(a);
                ((p) (obj)).a();
                j = ((p) (obj)).j();
                obj = ((p) (obj)).l();
                if (obj == null)
                {
                    throw new f("Missing passport node in device auth response.", new Object[0]);
                }
                f = ((k) (obj)).j();
                g = ((k) (obj)).k();
                h = ((k) (obj)).m();
            } else
            if (((String) (obj)).equals("S:Body"))
            {
                o o1 = new o(a);
                o1.a();
                i = o1.j();
                e = o1.l();
            } else
            {
                e();
            }
        }
        if (i == null && j == null)
        {
            throw new f("S:Header tag not found", new Object[0]);
        }
        if (i == null && e == null)
        {
            throw new f("S:Body tag not found", new Object[0]);
        }
        Date date = d.a();
        if (j != null && date.after(j))
        {
            throw new f("Response is expired. Current time: %s Expiry Time: %s", new Object[] {
                date.toString(), j.toString()
            });
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

    public final q k()
    {
        i();
        return i;
    }
}
