// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.wlclient;

import org.apache.http.HttpResponse;
import org.apache.http.impl.client.DefaultRedirectHandler;
import org.apache.http.protocol.HttpContext;

// Referenced classes of package com.worklight.wlclient:
//            WLAuthorizationManagerInternal, HttpClientManager

public class WorklightRedirectHandler extends DefaultRedirectHandler
{

    public WorklightRedirectHandler(HttpClientManager httpclientmanager)
    {
    }

    public boolean isRedirectRequested(HttpResponse httpresponse, HttpContext httpcontext)
    {
        if (WLAuthorizationManagerInternal.getInstance().shouldIgnoreRedirect(httpresponse))
        {
            return false;
        } else
        {
            return super.isRedirectRequested(httpresponse, httpcontext);
        }
    }
}
