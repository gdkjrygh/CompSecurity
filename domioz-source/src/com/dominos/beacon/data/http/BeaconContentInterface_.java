// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.beacon.data.http;

import android.content.Context;
import com.dominos.android.sdk.data.http.power.MediaTypeHackForAkamai;
import com.dominos.beacon.model.BeaconConfig;
import java.util.HashMap;
import java.util.List;
import org.c.c.b.b.a;
import org.c.c.b.j;
import org.c.c.c;
import org.c.c.d;
import org.c.c.i;
import org.c.c.q;
import org.c.e.a.l;

// Referenced classes of package com.dominos.beacon.data.http:
//            BeaconContentInterface

public final class BeaconContentInterface_
    implements BeaconContentInterface
{

    private c authentication;
    private HashMap availableCookies;
    private HashMap availableHeaders;
    private l restTemplate;
    private String rootUrl;

    public BeaconContentInterface_(Context context)
    {
        restTemplate = new l();
        availableCookies = new HashMap();
        availableHeaders = new HashMap();
        rootUrl = "";
        restTemplate.getMessageConverters().clear();
        restTemplate.getMessageConverters().add(new j());
        restTemplate.getMessageConverters().add(new MediaTypeHackForAkamai());
        restTemplate.getMessageConverters().add(new a());
    }

    public final BeaconConfig getBeaconConfiguration(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("beaconConfigUrl", s);
        return (BeaconConfig)restTemplate.exchange(rootUrl.concat("{beaconConfigUrl}"), i.GET, null, com/dominos/beacon/model/BeaconConfig, hashmap).getBody();
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

    public final void setAuthentication(c c)
    {
        authentication = c;
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

    private class _cls1 extends c
    {

        final BeaconContentInterface_ this$0;
        final String val$arg0;

        public String getHeaderValue()
        {
            return (new StringBuilder("Bearer ")).append(arg0).toString();
        }

        _cls1()
        {
            this$0 = BeaconContentInterface_.this;
            arg0 = s;
            super();
        }
    }

}
