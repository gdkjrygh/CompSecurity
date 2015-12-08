// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import twitter4j.internal.http.BASE64Encoder;
import twitter4j.internal.http.HttpRequest;

// Referenced classes of package twitter4j.auth:
//            Authorization

public class BasicAuthorization
    implements Serializable, Authorization
{

    private static final long serialVersionUID = 0xaea92c9832b810acL;
    private String basic;
    private String password;
    private String userId;

    public BasicAuthorization(String s, String s1)
    {
        userId = s;
        password = s1;
        basic = encodeBasicAuthenticationString();
    }

    private String encodeBasicAuthenticationString()
    {
        if (userId != null && password != null)
        {
            return (new StringBuilder("Basic ")).append(BASE64Encoder.encode((new StringBuilder()).append(userId).append(":").append(password).toString().getBytes())).toString();
        } else
        {
            return null;
        }
    }

    public boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (!(obj instanceof BasicAuthorization))
        {
            return false;
        } else
        {
            obj = (BasicAuthorization)obj;
            return basic.equals(((BasicAuthorization) (obj)).basic);
        }
    }

    public String getAuthorizationHeader(HttpRequest httprequest)
    {
        return basic;
    }

    public String getPassword()
    {
        return password;
    }

    public String getUserId()
    {
        return userId;
    }

    public int hashCode()
    {
        return basic.hashCode();
    }

    public boolean isEnabled()
    {
        return true;
    }

    public String toString()
    {
        return (new StringBuilder("BasicAuthorization{userId='")).append(userId).append('\'').append(", password='**********''}").toString();
    }
}
