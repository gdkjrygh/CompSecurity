// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.auth.oauth2;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpExecuteInterceptor;
import com.google.api.client.http.HttpHeaders;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.HttpUnsuccessfulResponseHandler;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.util.Clock;
import com.google.api.client.util.Lists;
import com.google.api.client.util.Objects;
import com.google.api.client.util.Preconditions;
import java.io.IOException;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.google.api.client.auth.oauth2:
//            RefreshTokenRequest, BearerToken, TokenResponseException, CredentialRefreshListener, 
//            TokenResponse

public class Credential
    implements HttpExecuteInterceptor, HttpRequestInitializer, HttpUnsuccessfulResponseHandler
{
    public static interface AccessMethod
    {

        public abstract String getAccessTokenFromRequest(HttpRequest httprequest);

        public abstract void intercept(HttpRequest httprequest, String s)
            throws IOException;
    }

    public static class Builder
    {

        HttpExecuteInterceptor clientAuthentication;
        Clock clock;
        JsonFactory jsonFactory;
        final AccessMethod method;
        Collection refreshListeners;
        HttpRequestInitializer requestInitializer;
        GenericUrl tokenServerUrl;
        HttpTransport transport;

        public Builder addRefreshListener(CredentialRefreshListener credentialrefreshlistener)
        {
            refreshListeners.add(Preconditions.checkNotNull(credentialrefreshlistener));
            return this;
        }

        public Credential build()
        {
            return new Credential(this);
        }

        public final HttpExecuteInterceptor getClientAuthentication()
        {
            return clientAuthentication;
        }

        public final Clock getClock()
        {
            return clock;
        }

        public final JsonFactory getJsonFactory()
        {
            return jsonFactory;
        }

        public final AccessMethod getMethod()
        {
            return method;
        }

        public final Collection getRefreshListeners()
        {
            return refreshListeners;
        }

        public final HttpRequestInitializer getRequestInitializer()
        {
            return requestInitializer;
        }

        public final GenericUrl getTokenServerUrl()
        {
            return tokenServerUrl;
        }

        public final HttpTransport getTransport()
        {
            return transport;
        }

        public Builder setClientAuthentication(HttpExecuteInterceptor httpexecuteinterceptor)
        {
            clientAuthentication = httpexecuteinterceptor;
            return this;
        }

        public Builder setClock(Clock clock1)
        {
            clock = (Clock)Preconditions.checkNotNull(clock1);
            return this;
        }

        public Builder setJsonFactory(JsonFactory jsonfactory)
        {
            jsonFactory = jsonfactory;
            return this;
        }

        public Builder setRefreshListeners(Collection collection)
        {
            refreshListeners = (Collection)Preconditions.checkNotNull(collection);
            return this;
        }

        public Builder setRequestInitializer(HttpRequestInitializer httprequestinitializer)
        {
            requestInitializer = httprequestinitializer;
            return this;
        }

        public Builder setTokenServerEncodedUrl(String s)
        {
            if (s == null)
            {
                s = null;
            } else
            {
                s = new GenericUrl(s);
            }
            tokenServerUrl = s;
            return this;
        }

        public Builder setTokenServerUrl(GenericUrl genericurl)
        {
            tokenServerUrl = genericurl;
            return this;
        }

        public Builder setTransport(HttpTransport httptransport)
        {
            transport = httptransport;
            return this;
        }

        public Builder(AccessMethod accessmethod)
        {
            clock = Clock.SYSTEM;
            refreshListeners = Lists.newArrayList();
            method = (AccessMethod)Preconditions.checkNotNull(accessmethod);
        }
    }


    static final Logger LOGGER = Logger.getLogger(com/google/api/client/auth/oauth2/Credential.getName());
    private String accessToken;
    private final HttpExecuteInterceptor clientAuthentication;
    private final Clock clock;
    private Long expirationTimeMilliseconds;
    private final JsonFactory jsonFactory;
    private final Lock lock;
    private final AccessMethod method;
    private final Collection refreshListeners;
    private String refreshToken;
    private final HttpRequestInitializer requestInitializer;
    private final String tokenServerEncodedUrl;
    private final HttpTransport transport;

    public Credential(AccessMethod accessmethod)
    {
        this(new Builder(accessmethod));
    }

    protected Credential(Builder builder)
    {
        lock = new ReentrantLock();
        method = (AccessMethod)Preconditions.checkNotNull(builder.method);
        transport = builder.transport;
        jsonFactory = builder.jsonFactory;
        String s;
        if (builder.tokenServerUrl == null)
        {
            s = null;
        } else
        {
            s = builder.tokenServerUrl.build();
        }
        tokenServerEncodedUrl = s;
        clientAuthentication = builder.clientAuthentication;
        requestInitializer = builder.requestInitializer;
        refreshListeners = Collections.unmodifiableCollection(builder.refreshListeners);
        clock = (Clock)Preconditions.checkNotNull(builder.clock);
    }

    protected TokenResponse executeRefreshToken()
        throws IOException
    {
        if (refreshToken == null)
        {
            return null;
        } else
        {
            return (new RefreshTokenRequest(transport, jsonFactory, new GenericUrl(tokenServerEncodedUrl), refreshToken)).setClientAuthentication(clientAuthentication).setRequestInitializer(requestInitializer).execute();
        }
    }

    public final String getAccessToken()
    {
        lock.lock();
        String s = accessToken;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final HttpExecuteInterceptor getClientAuthentication()
    {
        return clientAuthentication;
    }

    public final Clock getClock()
    {
        return clock;
    }

    public final Long getExpirationTimeMilliseconds()
    {
        lock.lock();
        Long long1 = expirationTimeMilliseconds;
        lock.unlock();
        return long1;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final Long getExpiresInSeconds()
    {
        lock.lock();
        Long long1 = expirationTimeMilliseconds;
        if (long1 == null)
        {
            lock.unlock();
            return null;
        }
        long l = (expirationTimeMilliseconds.longValue() - clock.currentTimeMillis()) / 1000L;
        lock.unlock();
        return Long.valueOf(l);
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final JsonFactory getJsonFactory()
    {
        return jsonFactory;
    }

    public final AccessMethod getMethod()
    {
        return method;
    }

    public final Collection getRefreshListeners()
    {
        return refreshListeners;
    }

    public final String getRefreshToken()
    {
        lock.lock();
        String s = refreshToken;
        lock.unlock();
        return s;
        Exception exception;
        exception;
        lock.unlock();
        throw exception;
    }

    public final HttpRequestInitializer getRequestInitializer()
    {
        return requestInitializer;
    }

    public final String getTokenServerEncodedUrl()
    {
        return tokenServerEncodedUrl;
    }

    public final HttpTransport getTransport()
    {
        return transport;
    }

    public boolean handleResponse(HttpRequest httprequest, HttpResponse httpresponse, boolean flag)
    {
        boolean flag1;
        boolean flag3;
label0:
        {
            flag3 = true;
            boolean flag4 = false;
            boolean flag2 = false;
            Object obj = httpresponse.getHeaders().getAuthenticateAsList();
            flag1 = flag2;
            flag = flag4;
            if (obj == null)
            {
                break label0;
            }
            obj = ((List) (obj)).iterator();
            String s;
            do
            {
                flag1 = flag2;
                flag = flag4;
                if (!((Iterator) (obj)).hasNext())
                {
                    break label0;
                }
                s = (String)((Iterator) (obj)).next();
            } while (!s.startsWith("Bearer "));
            flag1 = true;
            flag = BearerToken.INVALID_TOKEN_ERROR.matcher(s).find();
        }
        if (!flag1)
        {
            if (httpresponse.getStatusCode() == 401)
            {
                flag = true;
            } else
            {
                flag = false;
            }
        }
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_195;
        }
        lock.lock();
        flag = flag3;
        if (!Objects.equal(accessToken, method.getAccessTokenFromRequest(httprequest)))
        {
            break MISSING_BLOCK_LABEL_158;
        }
        flag = refreshToken();
        if (flag)
        {
            flag = flag3;
        } else
        {
            flag = false;
        }
        lock.unlock();
        return flag;
        httprequest;
        try
        {
            lock.unlock();
            throw httprequest;
        }
        // Misplaced declaration of an exception variable
        catch (HttpRequest httprequest)
        {
            LOGGER.log(Level.SEVERE, "unable to refresh token", httprequest);
        }
        return false;
    }

    public void initialize(HttpRequest httprequest)
        throws IOException
    {
        httprequest.setInterceptor(this);
        httprequest.setUnsuccessfulResponseHandler(this);
    }

    public void intercept(HttpRequest httprequest)
        throws IOException
    {
        lock.lock();
        Object obj;
        obj = getExpiresInSeconds();
        if (accessToken == null)
        {
            break MISSING_BLOCK_LABEL_36;
        }
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        if (((Long) (obj)).longValue() > 60L)
        {
            break MISSING_BLOCK_LABEL_60;
        }
        refreshToken();
        obj = accessToken;
        if (obj == null)
        {
            lock.unlock();
            return;
        }
        method.intercept(httprequest, accessToken);
        lock.unlock();
        return;
        httprequest;
        lock.unlock();
        throw httprequest;
    }

    public final boolean refreshToken()
        throws IOException
    {
        lock.lock();
        TokenResponse tokenresponse = executeRefreshToken();
        if (tokenresponse == null)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        setFromTokenResponse(tokenresponse);
        for (Iterator iterator = refreshListeners.iterator(); iterator.hasNext(); ((CredentialRefreshListener)iterator.next()).onTokenResponse(this, tokenresponse)) { }
        break MISSING_BLOCK_LABEL_161;
        Object obj;
        obj;
        boolean flag;
        if (400 <= ((TokenResponseException) (obj)).getStatusCode() && ((TokenResponseException) (obj)).getStatusCode() < 500)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        if (((TokenResponseException) (obj)).getDetails() == null || !flag)
        {
            break MISSING_BLOCK_LABEL_108;
        }
        setAccessToken(null);
        setExpiresInSeconds(null);
        for (Iterator iterator1 = refreshListeners.iterator(); iterator1.hasNext(); ((CredentialRefreshListener)iterator1.next()).onTokenErrorResponse(this, ((TokenResponseException) (obj)).getDetails())) { }
        break MISSING_BLOCK_LABEL_177;
        obj;
        lock.unlock();
        throw obj;
        lock.unlock();
        return true;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_183;
        }
        throw obj;
        lock.unlock();
        return false;
    }

    public Credential setAccessToken(String s)
    {
        lock.lock();
        accessToken = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

    public Credential setExpirationTimeMilliseconds(Long long1)
    {
        lock.lock();
        expirationTimeMilliseconds = long1;
        lock.unlock();
        return this;
        long1;
        lock.unlock();
        throw long1;
    }

    public Credential setExpiresInSeconds(Long long1)
    {
        if (long1 == null)
        {
            long1 = null;
        } else
        {
            long1 = Long.valueOf(clock.currentTimeMillis() + long1.longValue() * 1000L);
        }
        return setExpirationTimeMilliseconds(long1);
    }

    public Credential setFromTokenResponse(TokenResponse tokenresponse)
    {
        setAccessToken(tokenresponse.getAccessToken());
        if (tokenresponse.getRefreshToken() != null)
        {
            setRefreshToken(tokenresponse.getRefreshToken());
        }
        setExpiresInSeconds(tokenresponse.getExpiresInSeconds());
        return this;
    }

    public Credential setRefreshToken(String s)
    {
        lock.lock();
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_50;
        }
        boolean flag;
        if (jsonFactory != null && transport != null && clientAuthentication != null && tokenServerEncodedUrl != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        Preconditions.checkArgument(flag, "Please use the Builder and call setJsonFactory, setTransport, setClientAuthentication and setTokenServerUrl/setTokenServerEncodedUrl");
        refreshToken = s;
        lock.unlock();
        return this;
        s;
        lock.unlock();
        throw s;
    }

}
