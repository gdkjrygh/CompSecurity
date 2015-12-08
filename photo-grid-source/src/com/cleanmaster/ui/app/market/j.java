// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cleanmaster.ui.app.market;

import java.net.URI;
import org.apache.http.HttpResponse;
import org.apache.http.client.RedirectHandler;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.cleanmaster.ui.app.market:
//            i

final class j
    implements RedirectHandler
{

    final i a;

    j(i i)
    {
        a = i;
        super();
    }

    public final URI getLocationURI(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return null;
    }

    public final boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
    {
        return false;
    }
}
