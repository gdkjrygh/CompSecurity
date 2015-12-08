// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.internal.http;

import java.io.Serializable;
import twitter4j.auth.Authorization;
import twitter4j.auth.BasicAuthorization;

// Referenced classes of package twitter4j.internal.http:
//            HttpRequest

public class XAuthAuthorization
    implements Authorization, Serializable
{

    private static final long serialVersionUID = 0xab96cad8d4e9613aL;
    private BasicAuthorization basic;
    private String consumerKey;
    private String consumerSecret;

    public XAuthAuthorization(BasicAuthorization basicauthorization)
    {
        basic = basicauthorization;
    }

    public String getAuthorizationHeader(HttpRequest httprequest)
    {
        return basic.getAuthorizationHeader(httprequest);
    }

    public String getConsumerKey()
    {
        return consumerKey;
    }

    public String getConsumerSecret()
    {
        return consumerSecret;
    }

    public String getPassword()
    {
        return basic.getPassword();
    }

    public String getUserId()
    {
        return basic.getUserId();
    }

    public boolean isEnabled()
    {
        return basic.isEnabled();
    }

    public void setOAuthConsumer(String s, String s1)
    {
        this;
        JVM INSTR monitorenter ;
        consumerKey = s;
        consumerSecret = s1;
        this;
        JVM INSTR monitorexit ;
        return;
        s;
        throw s;
    }
}
