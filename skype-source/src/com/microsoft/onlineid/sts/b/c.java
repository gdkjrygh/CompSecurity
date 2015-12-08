// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.onlineid.sts.b;

import com.microsoft.onlineid.sts.a.f;
import com.microsoft.onlineid.sts.b.a.e;
import com.microsoft.onlineid.sts.q;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParser;

// Referenced classes of package com.microsoft.onlineid.sts.b:
//            a

public final class c extends a
{

    private final com.microsoft.onlineid.sts.c a;
    private e b;

    public c(com.microsoft.onlineid.sts.c c1)
    {
        a = c1;
    }

    public final q a()
    {
        return b.k();
    }

    protected final void a(XmlPullParser xmlpullparser)
        throws IOException, f
    {
        if (b != null)
        {
            throw new IllegalStateException("Each response object may only parse its respone once.");
        } else
        {
            b = new e(xmlpullparser, a);
            b.a();
            return;
        }
    }

    public final com.microsoft.onlineid.sts.f c()
    {
        return b.j();
    }
}
