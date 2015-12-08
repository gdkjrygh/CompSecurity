// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b;

import com.microsoft.onlineid.sts.b.a.f;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.microsoft.onlineid.sts.b:
//            b

public final class d extends b
{

    private f a;

    public d()
    {
    }

    public final q a()
    {
        return a.k();
    }

    protected final void a(XmlPullParser xmlpullparser)
        throws IOException, com.microsoft.onlineid.sts.a.f
    {
        if (a != null)
        {
            throw new IllegalStateException("Each response object may only parse its respone once.");
        } else
        {
            a = new f(xmlpullparser);
            a.a();
            return;
        }
    }

    public final String c()
    {
        return a.j();
    }
}
