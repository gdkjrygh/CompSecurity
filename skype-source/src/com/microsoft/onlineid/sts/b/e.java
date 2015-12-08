// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b;

import android.text.TextUtils;
import com.microsoft.onlineid.d;
import com.microsoft.onlineid.i;
import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.b.a.q;
import com.microsoft.onlineid.sts.c;
import java.io.IOException;
import java.util.Date;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.microsoft.onlineid.sts.b:
//            a

public final class e extends a
{

    private final c a;
    private final byte b[];
    private q c;
    private final d d;

    public e(byte abyte0[], d d1, c c1)
    {
        b = abyte0;
        d = d1;
        a = c1;
    }

    public final com.microsoft.onlineid.sts.q a()
    {
        com.microsoft.onlineid.sts.q q2 = c.n();
        com.microsoft.onlineid.sts.q q1 = q2;
        if (q2 == null)
        {
            q1 = c.p();
        }
        return q1;
    }

    protected final void a(XmlPullParser xmlpullparser)
        throws f, IOException
    {
        if (c != null)
        {
            throw new IllegalStateException("Each response object may only parse its respone once.");
        }
        c = new q(xmlpullparser, b, d);
        c.a();
        xmlpullparser = a.a();
        Date date = c.m();
        if (date != null && xmlpullparser.after(date))
        {
            throw new f("Response is expired. Current time: %s Expiry Time: %s", new Object[] {
                xmlpullparser.toString(), date.toString()
            });
        } else
        {
            return;
        }
    }

    public final i c()
    {
        return c.j();
    }

    public final com.microsoft.onlineid.sts.f d()
    {
        return c.l();
    }

    public final String e()
    {
        return c.k();
    }

    public final String f()
    {
        String s1 = c.o();
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = c.q();
        }
        return s;
    }
}
