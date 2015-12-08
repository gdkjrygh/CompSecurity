// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.vungle.publisher.protocol;

import android.net.Uri;
import com.vungle.publisher.bt;
import com.vungle.publisher.bv;
import com.vungle.publisher.net.http.HttpRequest;

// Referenced classes of package com.vungle.publisher.protocol:
//            TrackInstallHttpRequest, ProtocolHttpRequest

public static class  extends 
{

    bt g;
    com.vungle.publisher.protocol.message. h;

    public final ProtocolHttpRequest a()
    {
        return d();
    }

    protected final HttpRequest b()
    {
        return new TrackInstallHttpRequest();
    }

    public final HttpRequest c()
    {
        return d();
    }

    public final TrackInstallHttpRequest d()
    {
        TrackInstallHttpRequest trackinstallhttprequest = (TrackInstallHttpRequest)super.d();
        android.net.tpRequest tprequest = Uri.parse((new StringBuilder()).append(d).append("new").toString()).buildUpon().("app_id", c.b());
        String s = g.a();
        if (s != null)
        {
            tprequest.("ifa", s);
        }
        s = g.c();
        if (s != null)
        {
            tprequest.("isu", s);
        }
        s = g.j();
        if (s != null)
        {
            tprequest.("mac", s);
        }
        trackinstallhttprequest.b = tprequest.();
        return trackinstallhttprequest;
    }

    public ()
    {
    }
}
