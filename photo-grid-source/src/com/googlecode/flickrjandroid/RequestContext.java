// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid;

import com.googlecode.flickrjandroid.oauth.OAuth;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.googlecode.flickrjandroid:
//            a

public class RequestContext
{

    private static a threadLocal = new a((byte)0);
    private OAuth auth;
    private List extras;

    public RequestContext()
    {
    }

    public static RequestContext getRequestContext()
    {
        return (RequestContext)threadLocal.get();
    }

    public static void resetThreadLocals()
    {
        if (threadLocal.get() != null)
        {
            threadLocal.remove();
        }
    }

    public List getExtras()
    {
        if (extras == null)
        {
            extras = new ArrayList();
        }
        return extras;
    }

    public OAuth getOAuth()
    {
        return auth;
    }

    public void setExtras(List list)
    {
        extras = list;
    }

    public void setOAuth(OAuth oauth)
    {
        auth = oauth;
    }

}
