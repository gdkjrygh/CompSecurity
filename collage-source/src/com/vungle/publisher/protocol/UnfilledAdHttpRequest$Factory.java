// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.net.Uri;
import com.vungle.publisher.bt;
import com.vungle.publisher.bv;
import com.vungle.publisher.net.http.HttpRequest;

// Referenced classes of package com.vungle.publisher.protocol:
//            UnfilledAdHttpRequest

public static class  extends 
{

    bt g;
    com.vungle.publisher.protocol.message.A h;

    public final UnfilledAdHttpRequest a(long l)
    {
        UnfilledAdHttpRequest unfilledadhttprequest = (UnfilledAdHttpRequest)super.();
        android.net.tpRequest tprequest = Uri.parse((new StringBuilder()).append(d).append("unfilled").toString()).buildUpon().er("app_id", c.b());
        String s = g.a();
        if (s != null)
        {
            tprequest.er("ifa", s);
        }
        s = g.c();
        if (s != null)
        {
            tprequest.er("isu", s);
        }
        s = g.j();
        if (s != null)
        {
            tprequest.er("mac", s);
        }
        tprequest.er("ut", String.valueOf(l));
        unfilledadhttprequest.b = tprequest.b();
        return unfilledadhttprequest;
    }

    protected final HttpRequest b()
    {
        return new UnfilledAdHttpRequest();
    }

    public ()
    {
    }
}
