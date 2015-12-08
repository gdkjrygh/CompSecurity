// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.serverinteraction;

import android.content.Context;
import android.text.TextUtils;
import com.fitbit.FitBitApplication;
import com.fitbit.config.BuildType;
import com.fitbit.config.b;
import com.fitbit.data.bl.exceptions.ApplicationBackedOffException;
import com.fitbit.data.bl.exceptions.AuthenticationException;
import com.fitbit.data.bl.exceptions.BlockerRestrictionException;
import com.fitbit.data.bl.exceptions.IncorrectTimestampException;
import com.fitbit.data.bl.exceptions.NetworkTimeoutException;
import com.fitbit.data.bl.exceptions.RateLimitException;
import com.fitbit.data.bl.exceptions.ServerCommunicationException;
import com.fitbit.data.bl.exceptions.ServerValidationException;
import com.fitbit.data.bl.exceptions.SignupException;
import com.fitbit.data.bl.exceptions.TrackerSigningKeyExpiredException;
import com.fitbit.data.repo.l;
import com.fitbit.data.repo.o;
import com.fitbit.e.a;
import com.fitbit.savedstate.ServerSavedState;
import com.fitbit.savedstate.d;
import com.fitbit.serverinteraction.a.c;
import com.fitbit.serverinteraction.b.g;
import com.fitbit.serverinteraction.restrictions.RestrictionsController;
import com.fitbit.serverinteraction.validators.f;
import com.fitbit.util.ar;
import com.fitbit.util.t;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.Authenticator;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.PasswordAuthentication;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import oauth.signpost.OAuthConsumer;
import oauth.signpost.OAuthProvider;
import oauth.signpost.exception.OAuthCommunicationException;
import oauth.signpost.exception.OAuthExpectationFailedException;
import oauth.signpost.exception.OAuthMessageSignerException;
import oauth.signpost.exception.OAuthNotAuthorizedException;
import org.apache.http.Header;
import org.apache.http.client.ClientProtocolException;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.serverinteraction:
//            p, b, HttpURLConnectionOAuthConsumer, o, 
//            g, t, RequestParametersBuilder, j, 
//            i, SharedHttpUrlConnectionFactoryOauthProvider, a, k

public class ServerGateway
{
    public static final class HttpMethods extends Enum
    {

        public static final HttpMethods a;
        public static final HttpMethods b;
        public static final HttpMethods c;
        public static final HttpMethods d;
        private static final HttpMethods e[];

        public static HttpMethods valueOf(String s)
        {
            return (HttpMethods)Enum.valueOf(com/fitbit/serverinteraction/ServerGateway$HttpMethods, s);
        }

        public static HttpMethods[] values()
        {
            return (HttpMethods[])e.clone();
        }

        static 
        {
            a = new HttpMethods("GET", 0);
            b = new HttpMethods("POST", 1);
            c = new HttpMethods("DELETE", 2);
            d = new HttpMethods("PUT", 3);
            e = (new HttpMethods[] {
                a, b, c, d
            });
        }

        private HttpMethods(String s, int i1)
        {
            super(s, i1);
        }
    }

    public static interface a
    {

        public abstract void a(ServerGateway servergateway);
    }


    private static int a[] = {
        301, 302, 303
    };
    private static final String c = "ServerGateway";
    private static ServerGateway m = null;
    private com.fitbit.serverinteraction.b b;
    private final com.fitbit.serverinteraction.o d;
    private OAuthConsumer e;
    private OAuthProvider f;
    private g.b g;
    private c h;
    private a i;
    private RestrictionsController j;
    private Object k;
    private volatile boolean l;
    private final Context n;

    public ServerGateway(Context context)
    {
        k = new Object();
        n = context;
        j = new RestrictionsController();
        d = (new p(context)).a();
        b = new com.fitbit.serverinteraction.b();
        e = new HttpURLConnectionOAuthConsumer(d.h(), d.i());
        g = com.fitbit.serverinteraction.g.a(FitBitApplication.a());
        try
        {
            context = new URL(d.k());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new IllegalArgumentException("Tracker request url is invalid");
        }
        Authenticator.setDefault(new Authenticator(context) {

            final URL a;
            final ServerGateway b;

            protected PasswordAuthentication getPasswordAuthentication()
            {
                String s = a.getHost();
                if (b.a.a())
                {
                    com.fitbit.e.a.a("ServerGateway", String.format("Requesting Host %s, Url host %s", new Object[] {
                        getRequestingHost(), s
                    }), new Object[0]);
                }
                if (TextUtils.equals(s, getRequestingHost()))
                {
                    return new PasswordAuthentication(com.fitbit.serverinteraction.ServerGateway.a(b).l(), com.fitbit.serverinteraction.ServerGateway.a(b).m().toCharArray());
                } else
                {
                    return null;
                }
            }

            
            {
                b = ServerGateway.this;
                a = url;
                super();
            }
        });
        h = com.fitbit.serverinteraction.a.c.a();
    }

    public static ServerGateway a()
    {
        return FitBitApplication.a().b();
    }

    static com.fitbit.serverinteraction.o a(ServerGateway servergateway)
    {
        return servergateway.d;
    }

    private HttpURLConnection a(RequestParametersBuilder.RequestParameters requestparameters, HttpURLConnection httpurlconnection)
        throws IOException, ClientProtocolException, ServerCommunicationException
    {
        if (h.a(httpurlconnection))
        {
            com.fitbit.analytics.google.ga.AnalyticsContainer.Timer timer = com.fitbit.analytics.google.ga.AnalyticsContainer.Timer.a(FitBitApplication.a().c(), 0x7f11000d, com.fitbit.analytics.google.ga.AnalyticsContainer.Timer.Category.a, "http_upload_overall");
            ServerSavedState.b(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.b);
            httpurlconnection.connect();
            if (requestparameters.c() != null)
            {
                requestparameters.c().a(httpurlconnection.getOutputStream());
            }
            timer.a();
            return httpurlconnection;
        }
        if (b.a.a())
        {
            com.fitbit.e.a.e("ServerGateway", String.format("Exceeded background request limit by request %s", new Object[] {
                httpurlconnection.getURL().toString()
            }), new Object[0]);
        } else
        {
            com.fitbit.e.a.e("ServerGateway", "Background request limit exceeded, backing off", new Object[0]);
        }
        throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.b);
    }

    private void a(ServerCommunicationException servercommunicationexception)
        throws TrackerSigningKeyExpiredException
    {
        if (servercommunicationexception.e() == 419)
        {
            throw new TrackerSigningKeyExpiredException();
        } else
        {
            return;
        }
    }

    private void a(String s, String s1, HttpURLConnection httpurlconnection)
    {
        if (!b.a.b()) goto _L2; else goto _L1
_L1:
        return;
_L2:
        String s2;
        int i1;
        try
        {
            i1 = httpurlconnection.getResponseCode();
            s2 = httpurlconnection.getResponseMessage();
        }
        // Misplaced declaration of an exception variable
        catch (String s1)
        {
            com.fitbit.e.a.e("ServerGateway", (new StringBuilder()).append("Exception logging ").append(s).toString(), s1, new Object[0]);
            return;
        }
        if (i1 <= 299) goto _L1; else goto _L3
_L3:
        s1 = new StringBuilder();
        s1.append("ERROR RESPONSE (");
        s1.append(s);
        s1.append("): ");
        s1.append("REASON - ");
        s1.append(s2);
        s1.append(", CODE - ");
        s1.append(i1);
        httpurlconnection = httpurlconnection.getErrorStream();
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_115;
        }
        s1.append(", CONTENT - ");
        s1.append(com.fitbit.serverinteraction.t.a(httpurlconnection));
        com.fitbit.e.a.a("ServerGateway", s1.toString(), new Object[0]);
        return;
    }

    private void a(HttpURLConnection httpurlconnection, HttpMethods httpmethods, String s, String s1)
    {
        if (b.a.b())
        {
            return;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("{");
        java.util.Map.Entry entry;
        for (httpurlconnection = httpurlconnection.getRequestProperties().entrySet().iterator(); httpurlconnection.hasNext(); stringbuilder.append(String.format("%s=%s", new Object[] {
    entry.getKey(), TextUtils.join(", ", (Iterable)entry.getValue())
})))
        {
            entry = (java.util.Map.Entry)httpurlconnection.next();
            if (stringbuilder.length() > 1)
            {
                stringbuilder.append(",");
            }
        }

        stringbuilder.append("}");
        com.fitbit.e.a.a("ServerGateway", "REQUEST : %s %s HEADERS: %s\nPARAMS: %s", new Object[] {
            httpmethods, s, stringbuilder, s1
        });
    }

    private void a(boolean flag, long l1, com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType applicationbackofftype)
    {
        if (!flag)
        {
            ServerSavedState.a(l1, applicationbackofftype);
        }
        j.a(false, 409);
    }

    private void a(boolean flag, com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType applicationbackofftype)
    {
        a(flag, d.a(), applicationbackofftype);
    }

    private boolean a(int i1)
    {
        int ai[] = a;
        int k1 = ai.length;
        int j1 = 0;
        boolean flag1 = false;
        while (j1 < k1) 
        {
            boolean flag;
            if (ai[j1] == i1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            flag1 |= flag;
            j1++;
        }
        return flag1;
    }

    private String b(String s, String s1)
        throws ServerCommunicationException
    {
        s = (new StringBuilder()).append("email=").append(t.a(s)).append("&password=").append(t.a(s1)).append("&oauth_login_allow=allow").toString();
        try
        {
            s1 = new RequestParametersBuilder();
            s1.a(d.f()).a(s, false).a(com.fitbit.serverinteraction.validators.f.a()).a(null);
            s = (j)b(s1.a());
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            if (s.e() == 401)
            {
                return null;
            } else
            {
                throw s;
            }
        }
        if (s.c("oauth_verifier"))
        {
            return s.b("oauth_verifier");
        } else
        {
            return null;
        }
    }

    private k c(RequestParametersBuilder.RequestParameters requestparameters)
        throws ServerCommunicationException, Throwable, Throwable, IOException
    {
        Object obj;
        o o1;
        boolean flag1;
        boolean flag2;
        o1 = com.fitbit.data.repo.l.a();
        boolean flag = requestparameters.k();
        flag1 = requestparameters.l();
        flag2 = requestparameters.o();
        boolean flag3 = requestparameters.n();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_171;
        }
        if (flag3)
        {
            o1.b(requestparameters.b());
        }
        obj = o1.a(requestparameters.b(), requestparameters.m());
        if (!flag2 && (((com.fitbit.data.repo.o.a) (obj)).a() || flag1)) goto _L2; else goto _L1
_L1:
        obj = com.fitbit.serverinteraction.i.a(((com.fitbit.data.repo.o.a) (obj)).b(), requestparameters.j(), requestparameters.p());
_L4:
        return ((k) (obj));
_L2:
        j j1;
        try
        {
            j1 = d(requestparameters);
        }
        catch (ServerCommunicationException servercommunicationexception)
        {
            if (((com.fitbit.data.repo.o.a) (obj)).b() != null && !flag1)
            {
                return com.fitbit.serverinteraction.i.a(((com.fitbit.data.repo.o.a) (obj)).b(), requestparameters.j(), requestparameters.p());
            } else
            {
                throw servercommunicationexception;
            }
        }
        obj = j1;
        if (j1 == null) goto _L4; else goto _L3
_L3:
        o1.b(requestparameters.b());
        o1.a(requestparameters.b(), ((j)j1).e(), requestparameters.m());
        return j1;
        return d(requestparameters);
    }

    private j d(RequestParametersBuilder.RequestParameters requestparameters)
        throws ServerCommunicationException, Throwable, Throwable
    {
        HttpURLConnection httpurlconnection;
        boolean flag;
        flag = false;
        boolean flag1;
        try
        {
            httpurlconnection = g.a(requestparameters.b());
            httpurlconnection.setRequestMethod(requestparameters.d().name());
        }
        catch (ProtocolException protocolexception)
        {
            throw new ServerCommunicationException(String.format("Could not process %s", new Object[] {
                requestparameters.d()
            }), protocolexception);
        }
        catch (MalformedURLException malformedurlexception)
        {
            throw new ServerCommunicationException(String.format("Invalid URL %s", new Object[] {
                requestparameters.b()
            }), malformedurlexception);
        }
        // Misplaced declaration of an exception variable
        catch (RequestParametersBuilder.RequestParameters requestparameters)
        {
            throw new ServerCommunicationException("Something very wrong occurred", requestparameters);
        }
        flag1 = ServerSavedState.a(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        if (!flag1) goto _L2; else goto _L1
_L1:
        throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        requestparameters;
        flag = true;
_L19:
        a(flag, requestparameters.c(), com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        throw requestparameters;
_L2:
        Header header;
        for (Iterator iterator = requestparameters.e().iterator(); iterator.hasNext(); httpurlconnection.addRequestProperty(header.getName(), header.getValue()))
        {
            header = (Header)iterator.next();
        }

        int i1;
        httpurlconnection.setDoInput(true);
        if (requestparameters.c() == null)
        {
            break MISSING_BLOCK_LABEL_792;
        }
        httpurlconnection.setDoOutput(true);
        String s = requestparameters.c().c();
        if (!TextUtils.isEmpty(s))
        {
            httpurlconnection.addRequestProperty("Content-Encoding", s);
        }
        i1 = requestparameters.c().b();
        if (i1 < 0)
        {
            break MISSING_BLOCK_LABEL_271;
        }
        com.fitbit.e.a.a("ServerGateway", "Content Length is %s", new Object[] {
            Integer.valueOf(i1)
        });
        httpurlconnection.setFixedLengthStreamingMode(i1);
        Object obj;
        httpurlconnection.addRequestProperty("Content-Type", requestparameters.a().contentType);
        obj = requestparameters.c().toString();
_L17:
        a(httpurlconnection, requestparameters.d(), requestparameters.b(), ((String) (obj)));
        if (!requestparameters.h() && !requestparameters.g()) goto _L4; else goto _L3
_L3:
        requestparameters.f().a(httpurlconnection, e);
        OAuthConsumer oauthconsumer = e;
        oauthconsumer;
        JVM INSTR monitorenter ;
        if (!(e instanceof HttpURLConnectionOAuthConsumer)) goto _L6; else goto _L5
_L5:
        Object obj1 = (HttpURLConnectionOAuthConsumer)e;
        if (requestparameters.c() == null) goto _L8; else goto _L7
_L7:
        obj1 = ((HttpURLConnectionOAuthConsumer) (obj1)).a(httpurlconnection, requestparameters.c().d().a());
_L11:
        e.a(((oauth.signpost.http.a) (obj1)));
_L12:
        requestparameters.f().a(httpurlconnection);
_L4:
        obj1 = a(requestparameters, httpurlconnection);
        if (obj1 != null) goto _L10; else goto _L9
_L9:
        throw new ServerCommunicationException();
        requestparameters;
        throw requestparameters;
_L8:
        obj1 = ((HttpURLConnectionOAuthConsumer) (obj1)).a(httpurlconnection);
          goto _L11
_L6:
        e.b(httpurlconnection);
          goto _L12
        requestparameters;
        oauthconsumer;
        JVM INSTR monitorexit ;
        throw requestparameters;
        requestparameters;
_L16:
        a(flag, requestparameters.F_());
        throw requestparameters;
_L10:
        a(requestparameters.b(), ((String) (obj)), ((HttpURLConnection) (obj1)));
        if (requestparameters.q())
        {
            j.a(((HttpURLConnection) (obj1)));
        }
        if (requestparameters.i() != null)
        {
            requestparameters.i().a(((HttpURLConnection) (obj1)));
        }
        if (requestparameters.q())
        {
            j.a(true, null);
        }
        if (!a(((HttpURLConnection) (obj1)).getResponseCode())) goto _L14; else goto _L13
_L13:
        obj = ((HttpURLConnection) (obj1)).getHeaderField("Location");
        if (TextUtils.isEmpty(((CharSequence) (obj))))
        {
            break MISSING_BLOCK_LABEL_787;
        }
        ((HttpURLConnection) (obj1)).disconnect();
        obj = d((new RequestParametersBuilder(requestparameters)).a(((String) (obj))).a());
_L15:
        if (requestparameters.j() == null || requestparameters.j().S_())
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        return ((j) (obj));
_L14:
        obj = com.fitbit.serverinteraction.j.a(((HttpURLConnection) (obj1)), requestparameters.j());
          goto _L15
        obj;
        if (requestparameters.j() == null || requestparameters.j().S_())
        {
            ((HttpURLConnection) (obj1)).disconnect();
        }
        throw obj;
        requestparameters;
        a(requestparameters);
        throw requestparameters;
        requestparameters;
        requestparameters = new ServerCommunicationException(requestparameters.getMessage(), requestparameters);
        requestparameters.a(com.fitbit.data.bl.exceptions.ServerCommunicationException.ServerErrorType.a);
        throw requestparameters;
        requestparameters;
        throw new ServerCommunicationException(requestparameters);
        requestparameters;
        g();
        throw new ServerCommunicationException(requestparameters);
        requestparameters;
        g();
        throw new ServerCommunicationException(requestparameters);
        requestparameters;
        g();
        if (requestparameters.getCause() != null && (requestparameters.getCause() instanceof IOException))
        {
            throw new NetworkTimeoutException(requestparameters.getCause());
        } else
        {
            throw new ServerCommunicationException(requestparameters);
        }
        requestparameters;
        throw new ServerCommunicationException(requestparameters);
        requestparameters;
        requestparameters.printStackTrace();
        throw new NetworkTimeoutException(requestparameters);
        requestparameters;
        flag = true;
          goto _L16
        obj = null;
          goto _L15
        obj = null;
          goto _L17
        requestparameters;
        flag = false;
        if (true) goto _L19; else goto _L18
_L18:
    }

    com.fitbit.serverinteraction.a a(String s, String s1, boolean flag)
        throws ServerCommunicationException, AuthenticationException
    {
        Object obj = k;
        obj;
        JVM INSTR monitorenter ;
        if (ServerSavedState.a(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a))
        {
            throw new ApplicationBackedOffException(com.fitbit.savedstate.ServerSavedState.ApplicationBackoffType.a);
        }
        break MISSING_BLOCK_LABEL_49;
        s;
        obj;
        JVM INSTR monitorexit ;
        OAuthConsumer oauthconsumer;
        try
        {
            throw s;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
            throw new ServerCommunicationException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
            s1 = s.a();
            if (s1 != null && s1.contains("oauth_timestamp"))
            {
                throw new IncorrectTimestampException();
            } else
            {
                throw new ServerCommunicationException(s);
            }
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
            throw new ServerCommunicationException(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            g();
        }
        break MISSING_BLOCK_LABEL_352;
        if (l && !flag)
        {
            break MISSING_BLOCK_LABEL_261;
        }
        f = new SharedHttpUrlConnectionFactoryOauthProvider(g, d.g(), d.e(), d.f());
        oauthconsumer = e;
        oauthconsumer;
        JVM INSTR monitorenter ;
        f.a(e, "oob", new String[0]);
        s1 = b(s, s1);
        if (s1 != null)
        {
            break MISSING_BLOCK_LABEL_180;
        }
        h();
        e = new HttpURLConnectionOAuthConsumer(d.h(), d.i());
        throw new AuthenticationException();
        s;
        oauthconsumer;
        JVM INSTR monitorexit ;
        throw s;
        f.b(e, s1, new String[0]);
        s1 = new com.fitbit.serverinteraction.a(e.a(), e.b());
        l = true;
        b.b(s1);
        com.fitbit.savedstate.d.a(s);
        com.fitbit.e.a.a("ServerGateway", "Authenticated", new Object[0]);
        oauthconsumer;
        JVM INSTR monitorexit ;
        obj;
        JVM INSTR monitorexit ;
        return s1;
        s = new com.fitbit.serverinteraction.a(e.a(), e.b());
        obj;
        JVM INSTR monitorexit ;
        return s;
        if (s.getCause() != null && (s.getCause() instanceof IOException))
        {
            throw new NetworkTimeoutException(s.getCause());
        } else
        {
            throw new ServerCommunicationException(s);
        }
    }

    JSONObject a(RequestParametersBuilder.RequestParameters requestparameters)
        throws ServerCommunicationException, JSONException, SignupException
    {
        e = new HttpURLConnectionOAuthConsumer(d.h(), d.i());
        return (JSONObject)b(requestparameters).f();
    }

    public void a(a a1)
    {
        i = a1;
    }

    public void a(String s, String s1)
    {
        synchronized (k)
        {
            e.a(s, s1);
            l = true;
        }
        return;
        s;
        obj;
        JVM INSTR monitorexit ;
        throw s;
    }

    k b(RequestParametersBuilder.RequestParameters requestparameters)
        throws ServerCommunicationException, Throwable, Throwable
    {
        k k1;
        try
        {
            k1 = c(requestparameters);
        }
        // Misplaced declaration of an exception variable
        catch (RequestParametersBuilder.RequestParameters requestparameters)
        {
            requestparameters.printStackTrace();
            throw new NetworkTimeoutException(requestparameters);
        }
        if (requestparameters.g() && !f() && !ServerSavedState.k())
        {
            throw new ServerCommunicationException(401, "Token expired");
        } else
        {
            return k1;
        }
    }

    public RestrictionsController b()
    {
        return j;
    }

    public com.fitbit.serverinteraction.o c()
    {
        return d;
    }

    public boolean d()
    {
        return !e() && ar.c(FitBitApplication.a());
    }

    public boolean e()
    {
        return ServerSavedState.k();
    }

    public boolean f()
    {
        return l;
    }

    public void g()
    {
        synchronized (k)
        {
            l = false;
            if (i != null)
            {
                i.a(this);
            }
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void h()
    {
        synchronized (k)
        {
            l = false;
            b.c();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public void i()
    {
        e = new HttpURLConnectionOAuthConsumer(d.h(), d.i());
        j();
        l = false;
    }

    void j()
    {
        g = com.fitbit.serverinteraction.g.a(FitBitApplication.a());
    }

}
