// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j.auth;

import java.io.Serializable;
import twitter4j.TwitterException;
import twitter4j.internal.http.HttpResponse;

// Referenced classes of package twitter4j.auth:
//            OAuthToken

public class AccessToken extends OAuthToken
    implements Serializable
{

    private static final long serialVersionUID = 0x8c3247a79636c1cdL;
    private String screenName;
    private long userId;

    AccessToken(String s)
    {
        super(s);
        screenName = getParameter("screen_name");
        s = getParameter("user_id");
        if (s != null)
        {
            userId = Long.parseLong(s);
        }
    }

    public AccessToken(String s, String s1)
    {
        super(s, s1);
        try
        {
            s = s.substring(0, s.indexOf("-"));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw new IllegalArgumentException("Invalid access token format.");
        }
        if (s != null)
        {
            userId = Long.parseLong(s);
        }
    }

    AccessToken(HttpResponse httpresponse)
        throws TwitterException
    {
        this(httpresponse.asString());
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            if (!super.equals(obj))
            {
                return false;
            }
            obj = (AccessToken)obj;
            if (userId != ((AccessToken) (obj)).userId)
            {
                return false;
            }
            if (screenName == null ? ((AccessToken) (obj)).screenName != null : !screenName.equals(((AccessToken) (obj)).screenName))
            {
                return false;
            }
        }
        return true;
    }

    public String getParameter(String s)
    {
        return super.getParameter(s);
    }

    public String getScreenName()
    {
        return screenName;
    }

    public String getToken()
    {
        return super.getToken();
    }

    public String getTokenSecret()
    {
        return super.getTokenSecret();
    }

    public long getUserId()
    {
        return userId;
    }

    public int hashCode()
    {
        int j = super.hashCode();
        int i;
        if (screenName != null)
        {
            i = screenName.hashCode();
        } else
        {
            i = 0;
        }
        return (j * 31 + i) * 31 + (int)(userId ^ userId >>> 32);
    }

    public String toString()
    {
        return "AccessToken{screenName='" + screenName + '\'' + ", userId=" + userId + '}';
    }
}
