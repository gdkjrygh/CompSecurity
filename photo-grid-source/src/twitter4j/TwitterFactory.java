// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import twitter4j.auth.AccessToken;
import twitter4j.auth.Authorization;
import twitter4j.auth.AuthorizationFactory;
import twitter4j.auth.OAuthAuthorization;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationContext;

// Referenced classes of package twitter4j:
//            Twitter

public final class TwitterFactory
    implements Serializable
{

    static final Authorization DEFAULT_AUTHORIZATION;
    private static final Twitter SINGLETON;
    private static final Constructor TWITTER_CONSTRUCTOR;
    private static final long serialVersionUID = 0x481470a850d0e763L;
    private final Configuration conf;

    public TwitterFactory()
    {
        this(ConfigurationContext.getInstance());
    }

    public TwitterFactory(String s)
    {
        this(ConfigurationContext.getInstance(s));
    }

    public TwitterFactory(Configuration configuration)
    {
        if (configuration == null)
        {
            throw new NullPointerException("configuration cannot be null");
        } else
        {
            conf = configuration;
            return;
        }
    }

    public static Twitter getSingleton()
    {
        return SINGLETON;
    }

    public final Twitter getInstance()
    {
        return getInstance(AuthorizationFactory.getInstance(conf));
    }

    public final Twitter getInstance(AccessToken accesstoken)
    {
        String s = conf.getOAuthConsumerKey();
        String s1 = conf.getOAuthConsumerSecret();
        if (s == null && s1 == null)
        {
            throw new IllegalStateException("Consumer key and Consumer secret not supplied.");
        } else
        {
            OAuthAuthorization oauthauthorization = new OAuthAuthorization(conf);
            oauthauthorization.setOAuthAccessToken(accesstoken);
            return getInstance(((Authorization) (oauthauthorization)));
        }
    }

    public final Twitter getInstance(Authorization authorization)
    {
        try
        {
            authorization = (Twitter)TWITTER_CONSTRUCTOR.newInstance(new Object[] {
                conf, authorization
            });
        }
        // Misplaced declaration of an exception variable
        catch (Authorization authorization)
        {
            throw new AssertionError(authorization);
        }
        // Misplaced declaration of an exception variable
        catch (Authorization authorization)
        {
            throw new AssertionError(authorization);
        }
        // Misplaced declaration of an exception variable
        catch (Authorization authorization)
        {
            throw new AssertionError(authorization);
        }
        return authorization;
    }

    static 
    {
        Object obj;
        String s;
        DEFAULT_AUTHORIZATION = AuthorizationFactory.getInstance(ConfigurationContext.getInstance());
        s = null;
        obj = s;
        if (!ConfigurationContext.getInstance().isGAE())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Class.forName("twitter4j.AppEngineTwitterImpl");
        obj = "twitter4j.AppEngineTwitterImpl";
_L2:
        s = ((String) (obj));
        if (obj == null)
        {
            s = "twitter4j.TwitterImpl";
        }
        try
        {
            obj = Class.forName(s).getDeclaredConstructor(new Class[] {
                twitter4j/conf/Configuration, twitter4j/auth/Authorization
            });
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        TWITTER_CONSTRUCTOR = ((Constructor) (obj));
        try
        {
            SINGLETON = (Twitter)TWITTER_CONSTRUCTOR.newInstance(new Object[] {
                ConfigurationContext.getInstance(), DEFAULT_AUTHORIZATION
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new AssertionError(obj);
        }
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = s;
        if (true) goto _L2; else goto _L1
_L1:
    }
}
