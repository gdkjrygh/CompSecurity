// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.data.http;

import android.content.Context;
import com.dominos.beacon.model.CarryoutOrder;
import com.dominos.beacon.model.CheckInResponse;
import java.util.HashMap;
import java.util.List;
import org.c.c.b.b.a;
import org.c.c.b.c;
import org.c.c.b.j;
import org.c.c.d;
import org.c.c.e;
import org.c.c.f;
import org.c.c.i;
import org.c.c.q;
import org.c.e.a.l;

// Referenced classes of package com.dominos.beacon.data.http:
//            BeaconRestInterface

public final class BeaconRestInterface_
    implements BeaconRestInterface
{

    private org.c.c.c authentication;
    private HashMap availableCookies;
    private HashMap availableHeaders;
    private l restTemplate;
    private String rootUrl;

    public BeaconRestInterface_(Context context)
    {
        restTemplate = new l();
        availableCookies = new HashMap();
        availableHeaders = new HashMap();
        rootUrl = "";
        restTemplate.getMessageConverters().clear();
        restTemplate.getMessageConverters().add(new j());
        restTemplate.getMessageConverters().add(new a());
        restTemplate.getMessageConverters().add(new c());
    }

    public final CheckInResponse checkIn(String s)
    {
        f f1 = new f();
        f1.set("Content-Type", (String)availableHeaders.get("Content-Type"));
        s = new e(s, f1);
        return (CheckInResponse)restTemplate.exchange(rootUrl.concat("/checkin"), i.POST, s, com/dominos/beacon/model/CheckInResponse, new Object[0]).getBody();
    }

    public final String getCookie(String s)
    {
        return (String)availableCookies.get(s);
    }

    public final String getHeader(String s)
    {
        return (String)availableHeaders.get(s);
    }

    public final CarryoutOrder getOrders(String s)
    {
        f f1 = new f();
        f1.set("Content-Type", (String)availableHeaders.get("Content-Type"));
        s = new e(s, f1);
        return (CarryoutOrder)restTemplate.exchange(rootUrl.concat("/details"), i.POST, s, com/dominos/beacon/model/CarryoutOrder, new Object[0]).getBody();
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

    private class _cls1 extends org.c.c.c
    {

        final BeaconRestInterface_ this$0;
        final String val$arg0;

        public String getHeaderValue()
        {
            return (new StringBuilder("Bearer ")).append(arg0).toString();
        }

        _cls1()
        {
            this$0 = BeaconRestInterface_.this;
            arg0 = s;
            super();
        }
    }

}
