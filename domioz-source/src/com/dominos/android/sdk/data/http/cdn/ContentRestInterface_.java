// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.cdn;

import android.content.Context;
import com.dominos.android.sdk.core.models.ApplicationConfigVersion;
import com.dominos.android.sdk.core.models.ApplicationConfiguration;
import com.dominos.android.sdk.core.models.ReplacedProducts;
import com.dominos.android.sdk.core.models.loyalty.LoyaltyFAQHolder;
import com.dominos.android.sdk.data.http.power.MediaTypeHackForAkamai;
import java.util.HashMap;
import java.util.List;
import org.c.c.b.b.a;
import org.c.c.b.j;
import org.c.c.c;
import org.c.c.d;
import org.c.c.i;
import org.c.c.q;
import org.c.e.a.l;

// Referenced classes of package com.dominos.android.sdk.data.http.cdn:
//            ContentRestInterface

public final class ContentRestInterface_
    implements ContentRestInterface
{

    private c authentication;
    private HashMap availableCookies;
    private HashMap availableHeaders;
    private l restTemplate;
    private String rootUrl;

    public ContentRestInterface_(Context context)
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

    public final ApplicationConfigVersion getApplicationConfigVersion(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("configVersionFile", s);
        return (ApplicationConfigVersion)restTemplate.exchange(rootUrl.concat("mobile/android/config/{configVersionFile}"), i.GET, null, com/dominos/android/sdk/core/models/ApplicationConfigVersion, hashmap).getBody();
    }

    public final ApplicationConfiguration getApplicationConfiguration(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("configFile", s);
        return (ApplicationConfiguration)restTemplate.exchange(rootUrl.concat("mobile/android/config/{configFile}"), i.GET, null, com/dominos/android/sdk/core/models/ApplicationConfiguration, hashmap).getBody();
    }

    public final String getCookie(String s)
    {
        return (String)availableCookies.get(s);
    }

    public final String getHeader(String s)
    {
        return (String)availableHeaders.get(s);
    }

    public final LoyaltyFAQHolder getLoyaltyFaqs(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("lang", s);
        return (LoyaltyFAQHolder)restTemplate.exchange(rootUrl.concat("/mobile/loyalty/{lang}/loyaltyFAQs.cfg"), i.GET, null, com/dominos/android/sdk/core/models/loyalty/LoyaltyFAQHolder, hashmap).getBody();
    }

    public final String getPrompts(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("filename", s);
        return (String)restTemplate.exchange(rootUrl.concat("/{filename}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final ReplacedProducts getReplacedProducts()
    {
        return (ReplacedProducts)restTemplate.exchange(rootUrl.concat("mobile/android/config/replacementProducts.cfg"), i.GET, null, com/dominos/android/sdk/core/models/ReplacedProducts, new Object[0]).getBody();
    }

    public final l getRestTemplate()
    {
        return restTemplate;
    }

    public final String getRootUrl()
    {
        return rootUrl;
    }

    public final com.dominos.android.sdk.core.upsell.UpsellBarProductData.UpsellData getUpsellBarData(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("environment", s);
        return (com.dominos.android.sdk.core.upsell.UpsellBarProductData.UpsellData)restTemplate.exchange(rootUrl.concat("/mobile/android/{environment}/cartUpsell.cfg"), i.GET, null, com/dominos/android/sdk/core/upsell/UpsellBarProductData$UpsellData, hashmap).getBody();
    }

    public final String getUpsellConfiguration(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("filename", s);
        return (String)restTemplate.exchange(rootUrl.concat("mobile/android/main/upsell/{filename}"), i.GET, null, java/lang/String, hashmap).getBody();
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

        final ContentRestInterface_ this$0;
        final String val$arg0;

        public String getHeaderValue()
        {
            return (new StringBuilder("Bearer ")).append(arg0).toString();
        }

        _cls1()
        {
            this$0 = ContentRestInterface_.this;
            arg0 = s;
            super();
        }
    }

}
