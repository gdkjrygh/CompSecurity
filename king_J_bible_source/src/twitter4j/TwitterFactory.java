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
    static Class class$twitter4j$auth$Authorization;
    static Class class$twitter4j$conf$Configuration;
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

    static Class _mthclass$(String s)
    {
        try
        {
            s = Class.forName(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            throw (new NoClassDefFoundError()).initCause(s);
        }
        return s;
    }

    public static Twitter getSingleton()
    {
        return SINGLETON;
    }

    public Twitter getInstance()
    {
        return getInstance(AuthorizationFactory.getInstance(conf));
    }

    public Twitter getInstance(AccessToken accesstoken)
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

    public Twitter getInstance(Authorization authorization)
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
        Object obj1;
        DEFAULT_AUTHORIZATION = AuthorizationFactory.getInstance(ConfigurationContext.getInstance());
        obj1 = null;
        obj = obj1;
        if (!ConfigurationContext.getInstance().isGAE())
        {
            break MISSING_BLOCK_LABEL_33;
        }
        Class.forName("twitter4j.AppEngineTwitterImpl");
        obj = "twitter4j.AppEngineTwitterImpl";
_L6:
        obj1 = obj;
        if (obj == null)
        {
            obj1 = "twitter4j.TwitterImpl";
        }
        Class class1 = Class.forName(((String) (obj1)));
        if (class$twitter4j$conf$Configuration != null) goto _L2; else goto _L1
_L1:
        obj = _mthclass$("twitter4j.conf.Configuration");
        class$twitter4j$conf$Configuration = ((Class) (obj));
_L3:
        if (class$twitter4j$auth$Authorization != null)
        {
            break MISSING_BLOCK_LABEL_136;
        }
        obj1 = _mthclass$("twitter4j.auth.Authorization");
        class$twitter4j$auth$Authorization = ((Class) (obj1));
_L4:
        obj = class1.getDeclaredConstructor(new Class[] {
            obj, obj1
        });
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
_L2:
        try
        {
            obj = class$twitter4j$conf$Configuration;
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
          goto _L3
        obj1 = class$twitter4j$auth$Authorization;
          goto _L4
        ClassNotFoundException classnotfoundexception;
        classnotfoundexception;
        classnotfoundexception = ((ClassNotFoundException) (obj1));
        if (true) goto _L6; else goto _L5
_L5:
    }
}
