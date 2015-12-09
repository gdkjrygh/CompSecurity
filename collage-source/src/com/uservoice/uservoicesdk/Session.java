// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.uservoice.uservoicesdk;

import a.a.a.a;
import a.a.c;
import android.content.Context;
import android.content.SharedPreferences;
import com.uservoice.uservoicesdk.flow.SigninManager;
import com.uservoice.uservoicesdk.model.AccessToken;
import com.uservoice.uservoicesdk.model.ClientConfig;
import com.uservoice.uservoicesdk.model.Forum;
import com.uservoice.uservoicesdk.model.RequestToken;
import com.uservoice.uservoicesdk.model.User;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.uservoice.uservoicesdk:
//            Config

public class Session
{

    private static Session instance;
    private AccessToken accessToken;
    private ClientConfig clientConfig;
    private Config config;
    private Context context;
    private Map externalIds;
    private Forum forum;
    private c oauthConsumer;
    private RequestToken requestToken;
    private Runnable signinListener;
    private List topics;
    private User user;

    private Session()
    {
        externalIds = new HashMap();
    }

    public static Session getInstance()
    {
        com/uservoice/uservoicesdk/Session;
        JVM INSTR monitorenter ;
        Session session;
        if (instance == null)
        {
            instance = new Session();
        }
        session = instance;
        com/uservoice/uservoicesdk/Session;
        JVM INSTR monitorexit ;
        return session;
        Exception exception;
        exception;
        throw exception;
    }

    public static void reset()
    {
        instance = null;
    }

    public AccessToken getAccessToken()
    {
        return accessToken;
    }

    public ClientConfig getClientConfig()
    {
        return clientConfig;
    }

    public Config getConfig()
    {
        if (config == null && context != null)
        {
            config = (Config)Config.load(getSharedPreferences(), "config", "config", com/uservoice/uservoicesdk/Config);
        }
        return config;
    }

    public Context getContext()
    {
        return context;
    }

    public String getEmail()
    {
        if (user != null)
        {
            return user.getEmail();
        } else
        {
            return getSharedPreferences().getString("user_email", null);
        }
    }

    public Map getExternalIds()
    {
        return externalIds;
    }

    public Forum getForum()
    {
        return forum;
    }

    public String getName()
    {
        if (user != null)
        {
            return user.getName();
        } else
        {
            return getSharedPreferences().getString("user_name", null);
        }
    }

    public c getOAuthConsumer()
    {
        if (oauthConsumer != null) goto _L2; else goto _L1
_L1:
        if (getConfig().getKey() == null) goto _L4; else goto _L3
_L3:
        oauthConsumer = new a(getConfig().getKey(), getConfig().getSecret());
_L2:
        return oauthConsumer;
_L4:
        if (clientConfig != null)
        {
            oauthConsumer = new a(clientConfig.getKey(), clientConfig.getSecret());
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public RequestToken getRequestToken()
    {
        return requestToken;
    }

    public SharedPreferences getSharedPreferences()
    {
        String s;
        if (config != null)
        {
            s = config.getSite();
        } else
        {
            s = context.getSharedPreferences("uv_site", 0).getString("site", null);
        }
        return context.getSharedPreferences((new StringBuilder()).append("uv_").append(s.replaceAll("\\W", "_")).toString(), 0);
    }

    public List getTopics()
    {
        return topics;
    }

    public User getUser()
    {
        return user;
    }

    public void persistIdentity(String s, String s1)
    {
        android.content.SharedPreferences.Editor editor = getSharedPreferences().edit();
        editor.putString("user_name", s);
        if (SigninManager.isValidEmail(s1))
        {
            editor.putString("user_email", s1);
        }
        editor.commit();
    }

    protected void persistSite()
    {
        android.content.SharedPreferences.Editor editor = context.getSharedPreferences("uv_site", 0).edit();
        editor.putString("site", config.getSite());
        editor.commit();
    }

    public void setAccessToken(Context context1, AccessToken accesstoken)
    {
        accessToken = accesstoken;
        accesstoken.persist(getSharedPreferences(), "access_token", "access_token");
        if (signinListener != null)
        {
            signinListener.run();
        }
    }

    public void setAccessToken(AccessToken accesstoken)
    {
        accessToken = accesstoken;
    }

    public void setClientConfig(ClientConfig clientconfig)
    {
        clientConfig = clientconfig;
    }

    public void setConfig(Config config1)
    {
        config = config1;
        persistIdentity(config1.getName(), config1.getEmail());
        config1.persist(getSharedPreferences(), "config", "config");
        persistSite();
    }

    public void setContext(Context context1)
    {
        context = context1;
    }

    public void setExternalId(String s, String s1)
    {
        externalIds.put(s, s1);
    }

    public void setForum(Forum forum1)
    {
        forum = forum1;
    }

    public void setRequestToken(RequestToken requesttoken)
    {
        requestToken = requesttoken;
    }

    public void setSignInListener(Runnable runnable)
    {
        signinListener = runnable;
    }

    public void setTopics(List list)
    {
        topics = list;
    }

    public void setUser(User user1)
    {
        user = user1;
        persistIdentity(user1.getName(), user1.getEmail());
    }
}
