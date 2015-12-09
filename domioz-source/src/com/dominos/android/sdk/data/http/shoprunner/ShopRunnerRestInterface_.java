// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.shoprunner;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.PowerHeaderInterceptor_;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import org.c.c.b.b.a;
import org.c.c.b.c;
import org.c.c.b.j;
import org.c.c.d;
import org.c.c.e;
import org.c.c.f;
import org.c.c.i;
import org.c.c.n;
import org.c.c.q;
import org.c.e.a.l;

// Referenced classes of package com.dominos.android.sdk.data.http.shoprunner:
//            ShopRunnerRestInterface

public final class ShopRunnerRestInterface_
    implements ShopRunnerRestInterface
{

    private org.c.c.c authentication;
    private HashMap availableCookies;
    private HashMap availableHeaders;
    private l restTemplate;
    private String rootUrl;

    public ShopRunnerRestInterface_(Context context)
    {
        restTemplate = new l();
        availableCookies = new HashMap();
        availableHeaders = new HashMap();
        rootUrl = "";
        restTemplate.getMessageConverters().clear();
        restTemplate.getMessageConverters().add(new j());
        restTemplate.getMessageConverters().add(new c());
        restTemplate.getMessageConverters().add(new a());
        restTemplate.setInterceptors(new ArrayList());
        restTemplate.getInterceptors().add(PowerHeaderInterceptor_.getInstance_(context));
    }

    public final String getCookie(String s)
    {
        return (String)availableCookies.get(s);
    }

    public final String getHeader(String s)
    {
        return (String)availableHeaders.get(s);
    }

    public final l getRestTemplate()
    {
        return restTemplate;
    }

    public final String getRootUrl()
    {
        return rootUrl;
    }

    public final void setAuthentication(org.c.c.c c1)
    {
        authentication = c1;
    }

    public final void setBearerAuth(final String arg0)
    {
        authentication = new _cls1();
    }

    public final void setCookie(String s, String s1)
    {
        availableCookies.put(s, s1);
    }

    public final void setHeader(String s, String s1)
    {
        availableHeaders.put(s, s1);
    }

    public final void setHttpBasicAuth(String s, String s1)
    {
        authentication = new d(s, s1);
    }

    public final void setRestTemplate(l l1)
    {
        restTemplate = l1;
    }

    public final void setRootUrl(String s)
    {
        rootUrl = s;
    }

    public final String validateMemberToken(String s)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        obj = new e(((org.c.d.j) (obj)));
        HashMap hashmap = new HashMap();
        hashmap.put("token", s);
        return (String)restTemplate.exchange(rootUrl.concat("{token}"), i.GET, ((e) (obj)), java/lang/String, hashmap).getBody();
    }

    public final String validateToken(String s)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("text/html")));
        obj = new e(((org.c.d.j) (obj)));
        HashMap hashmap = new HashMap();
        hashmap.put("token", s);
        return (String)restTemplate.exchange(rootUrl.concat("{token}"), i.GET, ((e) (obj)), java/lang/String, hashmap).getBody();
    }

    private class _cls1 extends org.c.c.c
    {

        final ShopRunnerRestInterface_ this$0;
        final String val$arg0;

        public String getHeaderValue()
        {
            return (new StringBuilder("Bearer ")).append(arg0).toString();
        }

        _cls1()
        {
            this$0 = ShopRunnerRestInterface_.this;
            arg0 = s;
            super();
        }
    }

}
