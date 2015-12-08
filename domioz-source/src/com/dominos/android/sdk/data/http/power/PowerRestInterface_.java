// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.data.http.power;

import android.content.Context;
import com.dominos.android.sdk.core.models.loyalty.CustomerLoyalty;
import com.dominos.android.sdk.core.models.loyalty.HistoryLoyalty;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
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

// Referenced classes of package com.dominos.android.sdk.data.http.power:
//            PowerRestInterface, MediaTypeHackForAkamai, PowerHeaderInterceptor_

public final class PowerRestInterface_
    implements PowerRestInterface
{

    private org.c.c.c authentication;
    private HashMap availableCookies;
    private HashMap availableHeaders;
    private l restTemplate;
    private String rootUrl;

    public PowerRestInterface_(Context context)
    {
        restTemplate = new l();
        availableCookies = new HashMap();
        availableHeaders = new HashMap();
        rootUrl = "";
        restTemplate.getMessageConverters().clear();
        restTemplate.getMessageConverters().add(new j());
        restTemplate.getMessageConverters().add(new c());
        restTemplate.getMessageConverters().add(new a());
        restTemplate.getMessageConverters().add(new MediaTypeHackForAkamai());
        restTemplate.setInterceptors(new ArrayList());
        restTemplate.getInterceptors().add(PowerHeaderInterceptor_.getInstance_(context));
    }

    public final String addCard(String s, String s1)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/vnd.dominos.customer.card+json;version=1.0")));
        ((f) (obj)).set("Content-Type", (String)availableHeaders.get("Content-Type"));
        ((f) (obj)).setAuthorization(authentication);
        s = new e(s, ((org.c.d.j) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("customerId", s1);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/card"), i.POST, s, java/lang/String, ((java.util.Map) (obj))).getBody();
    }

    public final String buildings(int k)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("siteId", Integer.valueOf(k));
        return (String)restTemplate.exchange(rootUrl.concat("site-locator/site/{siteId}/buildings"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String changePassword(org.c.d.j j1)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/x-www-form-urlencoded")));
        f1.setAuthorization(authentication);
        j1 = new e(j1, f1);
        return (String)restTemplate.exchange(rootUrl.concat("power/change-password"), i.POST, j1, java/lang/String, new Object[0]).getBody();
    }

    public final String deleteCard(String s, String s1)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/vnd.dominos.customer.card+json;version=1.0")));
        ((f) (obj)).set("Content-Type", (String)availableHeaders.get("Content-Type"));
        ((f) (obj)).setAuthorization(authentication);
        obj = new e(((org.c.d.j) (obj)));
        HashMap hashmap = new HashMap();
        hashmap.put("cardId", s1);
        hashmap.put("customerId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/card/{cardId}"), i.DELETE, ((e) (obj)), java/lang/String, hashmap).getBody();
    }

    public final String emailOptIn(String s)
    {
        s = new e(s);
        return (String)restTemplate.exchange(rootUrl.concat("power/opt-in-and-opt-out"), i.POST, s, java/lang/String, new Object[0]).getBody();
    }

    public final String getAllCards(String s)
    {
        Object obj = new f();
        Object obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(String.format("REMEMBER_ME_COOKIE=%s;", new Object[] {
            availableCookies.get("REMEMBER_ME_COOKIE")
        }));
        ((f) (obj)).set("Cookie", ((StringBuilder) (obj1)).toString());
        ((f) (obj)).setAuthorization(authentication);
        obj = new e(((org.c.d.j) (obj)));
        obj1 = new HashMap();
        ((HashMap) (obj1)).put("customerId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/card/"), i.GET, ((e) (obj)), java/lang/String, ((java.util.Map) (obj1))).getBody();
    }

    public final String getCard(String s, String s1)
    {
        Object obj = new f();
        ((f) (obj)).setAuthorization(authentication);
        obj = new e(((org.c.d.j) (obj)));
        HashMap hashmap = new HashMap();
        hashmap.put("cardId", s1);
        hashmap.put("customerId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/card/{cardId}"), i.GET, ((e) (obj)), java/lang/String, hashmap).getBody();
    }

    public final String getCookie(String s)
    {
        return (String)availableCookies.get(s);
    }

    public final String getFeedbackQuestions(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("lang", s2);
        hashmap.put("storeId", s);
        hashmap.put("orderId", s1);
        return (String)restTemplate.exchange("https://feedback.dominos.com/Feedback/GetFeedbackQuestions?StoreID={storeId}&OrderID={orderId}&Lang={lang}", i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String getHeader(String s)
    {
        return (String)availableHeaders.get(s);
    }

    public final HistoryLoyalty getLoyaltyHistory(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerId", s);
        return (HistoryLoyalty)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/loyalty/history"), i.GET, null, com/dominos/android/sdk/core/models/loyalty/HistoryLoyalty, hashmap).getBody();
    }

    public final CustomerLoyalty getLoyaltyInformation(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("customerId", s);
        return (CustomerLoyalty)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/loyalty"), i.GET, null, com/dominos/android/sdk/core/models/loyalty/CustomerLoyalty, hashmap).getBody();
    }

    public final l getRestTemplate()
    {
        return restTemplate;
    }

    public final String getRootUrl()
    {
        return rootUrl;
    }

    public final String giftCardBalanceInquiry(String s)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        s = new e(s, f1);
        return (String)restTemplate.exchange(rootUrl.concat("power/giftcard-balance"), i.POST, s, java/lang/String, new Object[0]).getBody();
    }

    public final String login()
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/x-www-form-urlencoded")));
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(String.format("REMEMBER_ME_COOKIE=%s;", new Object[] {
            availableCookies.get("REMEMBER_ME_COOKIE")
        }));
        ((f) (obj)).set("Cookie", stringbuilder.toString());
        obj = new e(((org.c.d.j) (obj)));
        return (String)restTemplate.exchange(rootUrl.concat("power/login"), i.POST, ((e) (obj)), java/lang/String, new Object[0]).getBody();
    }

    public final String login(org.c.d.j j1, String s)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/x-www-form-urlencoded")));
        j1 = new e(j1, ((org.c.d.j) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("rememberMe", s);
        j1 = restTemplate.exchange(rootUrl.concat("power/login?rememberMe={rememberMe}"), i.POST, j1, java/lang/String, ((java.util.Map) (obj)));
        s = j1.getHeaders().get("Set-Cookie");
        if (s == null) goto _L2; else goto _L1
_L1:
        s = s.iterator();
_L4:
        if (s.hasNext())
        {
            String s1 = (String)s.next();
            int k = 0;
            do
            {
                if (k > 0)
                {
                    continue; /* Loop/switch isn't completed */
                }
                String s2 = (new String[] {
                    "REMEMBER_ME_COOKIE"
                })[0];
                if (s1.startsWith(s2))
                {
                    int i1 = s1.indexOf(';');
                    k = i1;
                    if (i1 == -1)
                    {
                        k = s1.length();
                    }
                    availableCookies.put(s2, s1.substring(s1.indexOf("=") + 1, k));
                    continue; /* Loop/switch isn't completed */
                }
                k++;
            } while (true);
        }
_L2:
        return (String)j1.getBody();
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String menu(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("lang", s1);
        hashmap.put("storeId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/store/{storeId}/menu?structured&lang={lang}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String oauth(org.c.d.j j1)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/x-www-form-urlencoded")));
        j1 = new e(j1, f1);
        return (String)restTemplate.exchange(rootUrl.concat("as/token.oauth2"), i.POST, j1, java/lang/String, new Object[0]).getBody();
    }

    public final String orderHistory(String s, int k, String s1)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        Object obj1 = new StringBuilder();
        ((StringBuilder) (obj1)).append(String.format("REMEMBER_ME_COOKIE=%s;", new Object[] {
            availableCookies.get("REMEMBER_ME_COOKIE")
        }));
        ((f) (obj)).set("Cookie", ((StringBuilder) (obj1)).toString());
        ((f) (obj)).setAuthorization(authentication);
        obj = new e(((org.c.d.j) (obj)));
        obj1 = new HashMap();
        ((HashMap) (obj1)).put("limit", Integer.valueOf(k));
        ((HashMap) (obj1)).put("customerId", s);
        ((HashMap) (obj1)).put("lang", s1);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/order?limit={limit}&lang={lang}"), i.GET, ((e) (obj)), java/lang/String, ((java.util.Map) (obj1))).getBody();
    }

    public final String placeOrder(String s, String s1)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        ((f) (obj)).setAuthorization(authentication);
        s = new e(s, ((org.c.d.j) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("languageCode", s1);
        return (String)restTemplate.exchange(rootUrl.concat("power/place-order?LanguageCode={languageCode}"), i.POST, s, java/lang/String, ((java.util.Map) (obj))).getBody();
    }

    public final String priceOrder(String s)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        s = new e(s, f1);
        return (String)restTemplate.exchange(rootUrl.concat("power/price-order"), i.POST, s, java/lang/String, new Object[0]).getBody();
    }

    public final String regions()
    {
        return (String)restTemplate.exchange(rootUrl.concat("site-locator/regions"), i.GET, null, java/lang/String, new Object[0]).getBody();
    }

    public final String resetPassword(org.c.d.j j1)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/x-www-form-urlencoded")));
        j1 = new e(j1, f1);
        return (String)restTemplate.exchange(rootUrl.concat("power/change-password"), i.POST, j1, java/lang/String, new Object[0]).getBody();
    }

    public final String saveCustomer(String s)
    {
        f f1 = new f();
        f1.setAccept(Collections.singletonList(n.parseMediaType("application/json")));
        f1.setAuthorization(authentication);
        s = new e(s, f1);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer"), i.POST, s, java/lang/String, new Object[0]).getBody();
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

    public final String sites(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("regionCode", s);
        return (String)restTemplate.exchange(rootUrl.concat("site-locator/region/{regionCode}/sites"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String storeCoupon(String s, String s1, String s2)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("language", s2);
        hashmap.put("couponId", s1);
        hashmap.put("storeId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/store/{storeId}/coupon/{couponId}?lang={language}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String storeLocator(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("street", s);
        hashmap.put("city", s1);
        return (String)restTemplate.exchange(rootUrl.concat("power/store-locator?s={street}&c={city}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String storeProfile(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("storeId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/store/{storeId}/profile"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String stores(int k, String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("unitNumber", s);
        hashmap.put("buildingId", Integer.valueOf(k));
        return (String)restTemplate.exchange(rootUrl.concat("site-locator/building/{buildingId}/stores?u={unitNumber}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String submitFeedback(String s, String s1, String s2, String s3, String s4, String s5, String s6, 
            String s7, String s8, String s9)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("questionId", s3);
        hashmap.put("teamMemberId", s5);
        hashmap.put("feedbackResponse", s8);
        hashmap.put("teamMemberPosition", s7);
        hashmap.put("teamMemberName", s6);
        hashmap.put("questionType", s4);
        hashmap.put("orderKey", s2);
        hashmap.put("lang", s9);
        hashmap.put("storeId", s);
        hashmap.put("orderId", s1);
        return (String)restTemplate.exchange("https://feedback.dominos.com/Feedback/PutFeedbackResult?StoreID={storeId}&OrderID={orderId}&OrderKey={orderKey}&QuestionID={questionId}&QuestionType={questionType}&TeamMemberID={teamMemberId}&TeamMemberName={teamMemberName}&TeamMemberPosition={teamMemberPosition}&FeedbackResponse={feedbackResponse}&Lang={lang}", i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String trackOrder(String s)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("phone", s);
        return (String)restTemplate.exchange(rootUrl.concat("orderstorage/GetTrackerData?Phone={phone}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String trackOrder(String s, String s1)
    {
        HashMap hashmap = new HashMap();
        hashmap.put("orderKey", s1);
        hashmap.put("storeId", s);
        return (String)restTemplate.exchange(rootUrl.concat("orderstorage/GetTrackerData?StoreID={storeId}&OrderKey={orderKey}"), i.GET, null, java/lang/String, hashmap).getBody();
    }

    public final String updateCard(String s, String s1, String s2)
    {
        Object obj = new f();
        ((f) (obj)).setAccept(Collections.singletonList(n.parseMediaType("application/vnd.dominos.customer.card+json;version=1.0")));
        ((f) (obj)).set("Content-Type", (String)availableHeaders.get("Content-Type"));
        ((f) (obj)).setAuthorization(authentication);
        s2 = new e(s2, ((org.c.d.j) (obj)));
        obj = new HashMap();
        ((HashMap) (obj)).put("cardId", s1);
        ((HashMap) (obj)).put("customerId", s);
        return (String)restTemplate.exchange(rootUrl.concat("power/customer/{customerId}/card/{cardId}"), i.PUT, s2, java/lang/String, ((java.util.Map) (obj))).getBody();
    }

    private class _cls1 extends org.c.c.c
    {

        final PowerRestInterface_ this$0;
        final String val$arg0;

        public String getHeaderValue()
        {
            return (new StringBuilder("Bearer ")).append(arg0).toString();
        }

        _cls1()
        {
            this$0 = PowerRestInterface_.this;
            arg0 = s;
            super();
        }
    }

}
