// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.v4.app.Fragment;
import android.text.TextUtils;
import android.util.Log;
import aoe;
import aoz;
import apa;
import apb;
import apc;
import apd;
import ape;
import apf;
import aph;
import api;
import apj;
import arp;
import ars;
import com.facebook.internal.SessionAuthorizationType;
import com.facebook.model.GraphMultiResult;
import com.facebook.model.GraphObject;
import com.facebook.model.GraphObjectList;
import de;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.facebook:
//            SessionState, AccessToken, FacebookAuthorizationException, FacebookOperationCanceledException, 
//            FacebookException, AuthorizationClient, AppEventsLogger, LoginActivity, 
//            SessionLoginBehavior, SessionDefaultAudience

public class Session
    implements Serializable
{

    public static final String a = com/facebook/Session.getCanonicalName();
    static volatile Context b;
    private static final Object c = new Object();
    private static Session d;
    private static final Set e = new HashSet() {

            
            {
                add("ads_management");
                add("create_event");
                add("rsvp_event");
            }
    };
    private static final long serialVersionUID = 1L;
    private AppEventsLogger appEventsLogger;
    public String applicationId;
    private volatile Bundle authorizationBundle;
    private AuthorizationClient authorizationClient;
    private apa autoPublishAsyncTask;
    private final List callbacks;
    volatile apf currentTokenRefreshRequest;
    private Handler handler;
    Date lastAttemptedTokenExtendDate;
    public final Object lock;
    public AuthorizationRequest pendingAuthorizationRequest;
    public SessionState state;
    public apj tokenCachingStrategy;
    public AccessToken tokenInfo;

    public Session(Context context)
    {
        this(context, ((String) (null)));
    }

    public Session(Context context, byte byte0)
    {
        this(context, ((String) (null)));
    }

    private Session(Context context, String s)
    {
        boolean flag1;
        flag1 = false;
        super();
        lastAttemptedTokenExtendDate = new Date(0L);
        lock = new Object();
        if (context != null)
        {
            s = arp.a(context);
        }
        ars.a(s, "applicationId");
        b(context);
        context = new api(b);
        applicationId = s;
        tokenCachingStrategy = context;
        state = SessionState.a;
        pendingAuthorizationRequest = null;
        callbacks = new ArrayList();
        handler = new Handler(Looper.getMainLooper());
        s = context.a();
        if (s != null) goto _L2; else goto _L1
_L1:
        boolean flag = flag1;
_L4:
        if (flag)
        {
            Date date = apj.a(s, "com.facebook.TokenCachingStrategy.ExpirationDate");
            Date date1 = new Date();
            if (date != null && !date.before(date1))
            {
                break; /* Loop/switch isn't completed */
            }
            context.b();
        }
        tokenInfo = AccessToken.a();
        return;
_L2:
        String s1 = s.getString("com.facebook.TokenCachingStrategy.Token");
        flag = flag1;
        if (s1 != null)
        {
            flag = flag1;
            if (s1.length() != 0)
            {
                flag = flag1;
                if (s.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0L) != 0L)
                {
                    flag = true;
                }
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
        tokenInfo = AccessToken.a(s);
        state = SessionState.b;
        return;
    }

    private Session(String s, SessionState sessionstate, AccessToken accesstoken, Date date, AuthorizationRequest authorizationrequest)
    {
        lastAttemptedTokenExtendDate = new Date(0L);
        lock = new Object();
        applicationId = s;
        state = sessionstate;
        tokenInfo = accesstoken;
        lastAttemptedTokenExtendDate = date;
        pendingAuthorizationRequest = authorizationrequest;
        handler = new Handler(Looper.getMainLooper());
        currentTokenRefreshRequest = null;
        tokenCachingStrategy = null;
        callbacks = new ArrayList();
    }

    Session(String s, SessionState sessionstate, AccessToken accesstoken, Date date, AuthorizationRequest authorizationrequest, byte byte0)
    {
        this(s, sessionstate, accesstoken, date, authorizationrequest);
    }

    static apc a(aoz aoz1)
    {
        if (aoz1.b != null)
        {
            return null;
        }
        aoz1 = (GraphMultiResult)aoz1.a(com/facebook/model/GraphMultiResult);
        if (aoz1 == null)
        {
            return null;
        }
        Object obj = aoz1.getData();
        if (obj == null || ((GraphObjectList) (obj)).size() == 0)
        {
            return null;
        }
        aoz1 = new ArrayList(((GraphObjectList) (obj)).size());
        ArrayList arraylist = new ArrayList(((GraphObjectList) (obj)).size());
        Object obj1 = (GraphObject)((GraphObjectList) (obj)).get(0);
        if (((GraphObject) (obj1)).getProperty("permission") != null)
        {
            obj = ((GraphObjectList) (obj)).iterator();
            do
            {
                if (!((Iterator) (obj)).hasNext())
                {
                    break;
                }
                Object obj2 = (GraphObject)((Iterator) (obj)).next();
                obj1 = (String)((GraphObject) (obj2)).getProperty("permission");
                if (!((String) (obj1)).equals("installed"))
                {
                    obj2 = (String)((GraphObject) (obj2)).getProperty("status");
                    if (((String) (obj2)).equals("granted"))
                    {
                        aoz1.add(obj1);
                    } else
                    if (((String) (obj2)).equals("declined"))
                    {
                        arraylist.add(obj1);
                    }
                }
            } while (true);
        } else
        {
            Iterator iterator = ((GraphObject) (obj1)).asMap().entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                if (!((String)entry.getKey()).equals("installed") && ((Integer)entry.getValue()).intValue() == 1)
                {
                    aoz1.add(entry.getKey());
                }
            } while (true);
        }
        return new apc(aoz1, arraylist);
    }

    public static Session a(Context context)
    {
        return a(context, false, ((OpenRequest) (null)));
    }

    public static Session a(Context context, Fragment fragment, ape ape)
    {
        return a(context, true, (new OpenRequest(fragment)).b(ape));
    }

    public static final Session a(Context context, ape ape, Bundle bundle)
    {
        Object obj;
        if (bundle == null)
        {
            return null;
        }
        byte abyte0[] = bundle.getByteArray("com.facebook.sdk.Session.saveSessionKey");
        if (abyte0 == null)
        {
            break MISSING_BLOCK_LABEL_92;
        }
        obj = new ByteArrayInputStream(abyte0);
        obj = (Session)(new ObjectInputStream(((java.io.InputStream) (obj)))).readObject();
        b(context);
        obj.tokenCachingStrategy = new api(context);
        if (ape == null)
        {
            break MISSING_BLOCK_LABEL_67;
        }
        ((Session) (obj)).a(ape);
        obj.authorizationBundle = bundle.getBundle("com.facebook.sdk.Session.authBundleKey");
        return ((Session) (obj));
        context;
        Log.w(a, "Unable to restore session", context);
_L2:
        return null;
        context;
        Log.w(a, "Unable to restore session.", context);
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Session a(Context context, boolean flag, OpenRequest openrequest)
    {
        context = (new apb(context)).a();
        if (SessionState.b.equals(context.c()) || flag)
        {
            a(((Session) (context)));
            context.a(openrequest);
            return context;
        } else
        {
            return null;
        }
    }

    private void a(int i1, AuthorizationClient.Result result)
    {
        Object obj;
        AccessToken accesstoken;
        if (i1 == -1)
        {
            if (result.code == AuthorizationClient.Result.Code.a)
            {
                accesstoken = result.token;
                obj = null;
            } else
            {
                obj = new FacebookAuthorizationException(result.errorMessage);
                accesstoken = null;
            }
        } else
        if (i1 == 0)
        {
            obj = new FacebookOperationCanceledException(result.errorMessage);
            accesstoken = null;
        } else
        {
            obj = null;
            accesstoken = null;
        }
        a(result.code, result.loggingExtras, ((Exception) (obj)));
        authorizationClient = null;
        a(accesstoken, ((Exception) (obj)));
    }

    static void a(Handler handler1, Runnable runnable)
    {
        b(handler1, runnable);
    }

    private void a(AccessToken accesstoken)
    {
        if (accesstoken != null && tokenCachingStrategy != null)
        {
            tokenCachingStrategy.a(accesstoken.b());
        }
    }

    private void a(AccessToken accesstoken, Exception exception)
    {
        AccessToken accesstoken1 = accesstoken;
        Object obj = exception;
        if (accesstoken != null)
        {
            public final class _cls4
            {

                public static final int a[];

                static 
                {
                    a = new int[SessionState.values().length];
                    try
                    {
                        a[SessionState.a.ordinal()] = 1;
                    }
                    catch (NoSuchFieldError nosuchfielderror6) { }
                    try
                    {
                        a[SessionState.c.ordinal()] = 2;
                    }
                    catch (NoSuchFieldError nosuchfielderror5) { }
                    try
                    {
                        a[SessionState.b.ordinal()] = 3;
                    }
                    catch (NoSuchFieldError nosuchfielderror4) { }
                    try
                    {
                        a[SessionState.d.ordinal()] = 4;
                    }
                    catch (NoSuchFieldError nosuchfielderror3) { }
                    try
                    {
                        a[SessionState.e.ordinal()] = 5;
                    }
                    catch (NoSuchFieldError nosuchfielderror2) { }
                    try
                    {
                        a[SessionState.g.ordinal()] = 6;
                    }
                    catch (NoSuchFieldError nosuchfielderror1) { }
                    try
                    {
                        a[SessionState.f.ordinal()] = 7;
                    }
                    catch (NoSuchFieldError nosuchfielderror)
                    {
                        return;
                    }
                }
            }

            boolean flag;
            if (arp.a(accesstoken.token) || (new Date()).after(accesstoken.expires))
            {
                flag = true;
            } else
            {
                flag = false;
            }
            accesstoken1 = accesstoken;
            obj = exception;
            if (flag)
            {
                obj = new FacebookException("Invalid access token.");
                accesstoken1 = null;
            }
        }
        accesstoken = ((AccessToken) (lock));
        accesstoken;
        JVM INSTR monitorenter ;
        _cls4.a[state.ordinal()];
        JVM INSTR tableswitch 1 7: default 270
    //                   1 240
    //                   2 127
    //                   3 240
    //                   4 193
    //                   5 193
    //                   6 240
    //                   7 240;
           goto _L1 _L2 _L3 _L2 _L4 _L4 _L2 _L2
_L1:
        return;
_L3:
        exception = state;
        if (accesstoken1 == null) goto _L6; else goto _L5
_L5:
        tokenInfo = accesstoken1;
        a(accesstoken1);
        state = SessionState.d;
_L8:
        pendingAuthorizationRequest = null;
        a(((SessionState) (exception)), state, ((Exception) (obj)));
          goto _L1
        exception;
        accesstoken;
        JVM INSTR monitorexit ;
        throw exception;
_L6:
        if (obj == null) goto _L8; else goto _L7
_L7:
        state = SessionState.f;
          goto _L8
_L4:
        exception = state;
        if (accesstoken1 == null) goto _L10; else goto _L9
_L9:
        tokenInfo = accesstoken1;
        a(accesstoken1);
        state = SessionState.e;
_L10:
        pendingAuthorizationRequest = null;
        a(((SessionState) (exception)), state, ((Exception) (obj)));
          goto _L1
_L2:
        Log.d(a, (new StringBuilder("Unexpected call to finishAuthOrReauth in state ")).append(state).toString());
          goto _L1
    }

    private void a(AuthorizationClient.Result.Code code, Map map, Exception exception)
    {
        if (pendingAuthorizationRequest != null) goto _L2; else goto _L1
_L1:
        code = AuthorizationClient.a("");
        code.putString("2_result", AuthorizationClient.Result.Code.c.loggingValue);
        code.putString("5_error_message", "Unexpected call to logAuthorizationComplete with null pendingAuthorizationRequest.");
_L4:
        code.putLong("1_timestamp_ms", System.currentTimeMillis());
        l().b("fb_mobile_login_complete", code);
        return;
_L2:
        Bundle bundle;
        bundle = AuthorizationClient.a(pendingAuthorizationRequest.authId);
        if (code != null)
        {
            bundle.putString("2_result", code.loggingValue);
        }
        if (exception != null && exception.getMessage() != null)
        {
            bundle.putString("5_error_message", exception.getMessage());
        }
        code = null;
        if (!AuthorizationRequest.a(pendingAuthorizationRequest).isEmpty())
        {
            code = new JSONObject(AuthorizationRequest.a(pendingAuthorizationRequest));
        }
        exception = code;
        if (map != null)
        {
            if (code == null)
            {
                code = new JSONObject();
            }
            try
            {
                for (map = map.entrySet().iterator(); map.hasNext(); code.put((String)exception.getKey(), exception.getValue()))
                {
                    exception = (java.util.Map.Entry)map.next();
                }

                break; /* Loop/switch isn't completed */
            }
            // Misplaced declaration of an exception variable
            catch (Map map)
            {
                exception = code;
            }
        }
_L5:
        if (exception != null)
        {
            bundle.putString("6_extras", exception.toString());
        }
        code = bundle;
        if (true) goto _L4; else goto _L3
_L3:
        exception = code;
          goto _L5
        if (true) goto _L4; else goto _L6
_L6:
    }

    public static void a(AuthorizationRequest authorizationrequest, SessionAuthorizationType sessionauthorizationtype)
    {
        if (authorizationrequest == null || arp.a(authorizationrequest.permissions))
        {
            if (SessionAuthorizationType.b.equals(sessionauthorizationtype))
            {
                throw new FacebookException("Cannot request publish or manage authorization with no permissions.");
            }
        } else
        {
            authorizationrequest = authorizationrequest.permissions.iterator();
            do
            {
                if (!authorizationrequest.hasNext())
                {
                    break;
                }
                String s = (String)authorizationrequest.next();
                boolean flag;
                if (s != null && (s.startsWith("publish") || s.startsWith("manage") || e.contains(s)))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (flag)
                {
                    if (SessionAuthorizationType.a.equals(sessionauthorizationtype))
                    {
                        throw new FacebookException(String.format("Cannot pass a publish or manage permission (%s) to a request for read authorization", new Object[] {
                            s
                        }));
                    }
                } else
                if (SessionAuthorizationType.b.equals(sessionauthorizationtype))
                {
                    Log.w(a, String.format("Should not pass a read permission (%s) to a request for publish or manage authorization", new Object[] {
                        s
                    }));
                }
            } while (true);
        }
    }

    public static final void a(Session session)
    {
        Object obj = c;
        obj;
        JVM INSTR monitorenter ;
        Session session1;
        if (session == d)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        session1 = d;
        if (session1 == null)
        {
            break MISSING_BLOCK_LABEL_25;
        }
        session1.k();
        d = session;
        if (session1 == null)
        {
            break MISSING_BLOCK_LABEL_39;
        }
        a("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        if (session == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        a("com.facebook.sdk.ACTIVE_SESSION_SET");
        if (session.a())
        {
            a("com.facebook.sdk.ACTIVE_SESSION_OPENED");
        }
        obj;
        JVM INSTR monitorexit ;
        return;
        session;
        obj;
        JVM INSTR monitorexit ;
        throw session;
    }

    static void a(Session session, int i1, AuthorizationClient.Result result)
    {
        session.a(i1, result);
    }

    public static final void a(Session session, Bundle bundle)
    {
        if (bundle != null && session != null && !bundle.containsKey("com.facebook.sdk.Session.saveSessionKey"))
        {
            ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
            try
            {
                (new ObjectOutputStream(bytearrayoutputstream)).writeObject(session);
            }
            // Misplaced declaration of an exception variable
            catch (Session session)
            {
                throw new FacebookException("Unable to save session.", session);
            }
            bundle.putByteArray("com.facebook.sdk.Session.saveSessionKey", bytearrayoutputstream.toByteArray());
            bundle.putBundle("com.facebook.sdk.Session.authBundleKey", session.authorizationBundle);
        }
    }

    private static void a(String s)
    {
        s = new Intent(s);
        de.a(b).a(s);
    }

    private static boolean a(Intent intent)
    {
        return b.getPackageManager().resolveActivity(intent, 0) != null;
    }

    private static boolean a(Object obj, Object obj1)
    {
        if (obj == null)
        {
            return obj1 == null;
        } else
        {
            return obj.equals(obj1);
        }
    }

    static List b(Session session)
    {
        return session.callbacks;
    }

    private static void b(Context context)
    {
        if (context != null && b == null)
        {
            Context context1 = context.getApplicationContext();
            if (context1 != null)
            {
                context = context1;
            }
            b = context;
        }
    }

    private static void b(Handler handler1, Runnable runnable)
    {
        if (handler1 != null)
        {
            handler1.post(runnable);
            return;
        } else
        {
            aph.c().execute(runnable);
            return;
        }
    }

    public static void b(AuthorizationRequest authorizationrequest)
    {
        if (authorizationrequest != null && !AuthorizationRequest.b(authorizationrequest))
        {
            Intent intent = new Intent();
            intent.setClass(b, com/facebook/LoginActivity);
            if (!a(intent))
            {
                throw new FacebookException(String.format("Cannot use SessionLoginBehavior %s when %s is not declared as an activity in AndroidManifest.xml", new Object[] {
                    authorizationrequest.loginBehavior, com/facebook/LoginActivity.getName()
                }));
            }
        }
    }

    static Handler c(Session session)
    {
        return session.handler;
    }

    private static boolean c(AuthorizationRequest authorizationrequest)
    {
        Intent intent = new Intent();
        intent.setClass(b, com/facebook/LoginActivity);
        intent.setAction(authorizationrequest.loginBehavior.toString());
        intent.putExtras(LoginActivity.a(authorizationrequest.a()));
        if (!a(intent))
        {
            return false;
        }
        try
        {
            authorizationrequest.startActivityDelegate.a(intent, authorizationrequest.requestCode);
        }
        // Misplaced declaration of an exception variable
        catch (AuthorizationRequest authorizationrequest)
        {
            return false;
        }
        return true;
    }

    public static apf d(Session session)
    {
        return session.currentTokenRefreshRequest;
    }

    public static apf e(Session session)
    {
        session.currentTokenRefreshRequest = null;
        return null;
    }

    public static apa f(Session session)
    {
        session.autoPublishAsyncTask = null;
        return null;
    }

    public static final Session g()
    {
        Session session;
        synchronized (c)
        {
            session = d;
        }
        return session;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Context h()
    {
        return b;
    }

    public static Context i()
    {
        return b;
    }

    private Date j()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        Date date = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return date;
_L2:
        date = tokenInfo.expires;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void k()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        Object obj1 = state;
        _cls4.a[state.ordinal()];
        JVM INSTR tableswitch 1 5: default 113
    //                   1 59
    //                   2 59
    //                   3 93
    //                   4 93
    //                   5 93;
           goto _L1 _L2 _L2 _L3 _L3 _L3
_L1:
        break; /* Loop/switch isn't completed */
_L3:
        break MISSING_BLOCK_LABEL_93;
_L4:
        return;
_L2:
        state = SessionState.f;
        a(((SessionState) (obj1)), state, new FacebookException("Log in attempt aborted."));
          goto _L4
        obj1;
        obj;
        JVM INSTR monitorexit ;
        throw obj1;
        state = SessionState.g;
        a(((SessionState) (obj1)), state, ((Exception) (null)));
          goto _L4
    }

    private AppEventsLogger l()
    {
        AppEventsLogger appeventslogger;
        synchronized (lock)
        {
            if (appEventsLogger == null)
            {
                appEventsLogger = AppEventsLogger.a(b, applicationId);
            }
            appeventslogger = appEventsLogger;
        }
        return appeventslogger;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private void readObject(ObjectInputStream objectinputstream)
    {
        throw new InvalidObjectException("Cannot readObject, serialization proxy required");
    }

    private Object writeReplace()
    {
        return new SerializationProxyV1(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, pendingAuthorizationRequest);
    }

    public final void a(ape ape)
    {
        List list = callbacks;
        list;
        JVM INSTR monitorenter ;
        if (ape == null)
        {
            break MISSING_BLOCK_LABEL_35;
        }
        if (!callbacks.contains(ape))
        {
            callbacks.add(ape);
        }
        list;
        JVM INSTR monitorexit ;
        return;
        ape;
        list;
        JVM INSTR monitorexit ;
        throw ape;
    }

    public final void a(AuthorizationRequest authorizationrequest)
    {
        authorizationrequest.applicationId = applicationId;
        this;
        JVM INSTR monitorenter ;
        Object obj;
        if (autoPublishAsyncTask != null || !aph.e())
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj = applicationId;
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_443;
        }
        obj = new apa(this, ((String) (obj)), b);
        autoPublishAsyncTask = ((apa) (obj));
_L1:
        this;
        JVM INSTR monitorexit ;
        if (obj != null)
        {
            ((apa) (obj)).execute(new Void[0]);
        }
        obj = AuthorizationClient.a(pendingAuthorizationRequest.authId);
        ((Bundle) (obj)).putLong("1_timestamp_ms", System.currentTimeMillis());
        Object obj1;
        boolean flag;
        try
        {
            JSONObject jsonobject = new JSONObject();
            jsonobject.put("login_behavior", AuthorizationRequest.c(pendingAuthorizationRequest).toString());
            jsonobject.put("request_code", AuthorizationRequest.d(pendingAuthorizationRequest));
            jsonobject.put("is_legacy", AuthorizationRequest.b(pendingAuthorizationRequest));
            jsonobject.put("permissions", TextUtils.join(",", AuthorizationRequest.e(pendingAuthorizationRequest)));
            jsonobject.put("default_audience", AuthorizationRequest.f(pendingAuthorizationRequest).toString());
            ((Bundle) (obj)).putString("6_extras", jsonobject.toString());
        }
        catch (JSONException jsonexception) { }
        l().b("fb_mobile_login_start", ((Bundle) (obj)));
        flag = c(authorizationrequest);
        obj1 = AuthorizationRequest.a(pendingAuthorizationRequest);
        if (flag)
        {
            obj = "1";
        } else
        {
            obj = "0";
        }
        ((Map) (obj1)).put("try_login_activity", obj);
        if (!flag && AuthorizationRequest.b(authorizationrequest))
        {
            AuthorizationRequest.a(pendingAuthorizationRequest).put("try_legacy", "1");
            authorizationClient = new AuthorizationClient();
            authorizationClient.c = new aoe() {

                private Session a;

                public final void a(AuthorizationClient.Result result)
                {
                    int i1;
                    if (result.code == AuthorizationClient.Result.Code.b)
                    {
                        i1 = 0;
                    } else
                    {
                        i1 = -1;
                    }
                    Session.a(a, i1, result);
                }

            
            {
                a = Session.this;
                super();
            }
            };
            obj = authorizationClient;
            obj.a = b;
            obj.b = null;
            authorizationClient.a(authorizationrequest.a());
            flag = true;
        }
        if (flag)
        {
            break MISSING_BLOCK_LABEL_414;
        }
        authorizationrequest = ((AuthorizationRequest) (lock));
        authorizationrequest;
        JVM INSTR monitorenter ;
        obj = state;
        switch (_cls4.a[state.ordinal()])
        {
        default:
            state = SessionState.f;
            obj1 = new FacebookException("Log in attempt failed: LoginActivity could not be started, and not legacy request");
            a(AuthorizationClient.Result.Code.c, ((Map) (null)), ((Exception) (obj1)));
            a(((SessionState) (obj)), state, ((Exception) (obj1)));
            break;

        case 6: // '\006'
        case 7: // '\007'
            break MISSING_BLOCK_LABEL_428;
        }
        return;
        authorizationrequest;
        this;
        JVM INSTR monitorexit ;
        throw authorizationrequest;
        authorizationrequest;
        JVM INSTR monitorexit ;
        return;
        obj;
        authorizationrequest;
        JVM INSTR monitorexit ;
        throw obj;
        obj = null;
          goto _L1
    }

    public final void a(OpenRequest openrequest)
    {
        a(openrequest, SessionAuthorizationType.a);
    }

    public final void a(OpenRequest openrequest, SessionAuthorizationType sessionauthorizationtype)
    {
label0:
        {
            a(((AuthorizationRequest) (openrequest)), sessionauthorizationtype);
            b(openrequest);
            synchronized (lock)
            {
                if (pendingAuthorizationRequest == null)
                {
                    break label0;
                }
                a(state, state, ((Exception) (new UnsupportedOperationException("Session: an attempt was made to open a session that has a pending request."))));
            }
            return;
        }
        SessionState sessionstate = state;
        _cls4.a[state.ordinal()];
        JVM INSTR tableswitch 1 3: default 237
    //                   1 108
    //                   2 92
    //                   3 172;
           goto _L1 _L2 _L1 _L3
_L1:
        throw new UnsupportedOperationException("Session: an attempt was made to open an already opened session.");
        openrequest;
        obj;
        JVM INSTR monitorexit ;
        throw openrequest;
_L2:
        sessionauthorizationtype = SessionState.c;
        state = sessionauthorizationtype;
        if (openrequest != null) goto _L5; else goto _L4
_L4:
        throw new IllegalArgumentException("openRequest cannot be null when opening a new Session");
_L5:
        pendingAuthorizationRequest = openrequest;
_L12:
        if (openrequest == null) goto _L7; else goto _L6
_L6:
        a(((AuthorizationRequest) (openrequest)).statusCallback);
_L7:
        a(sessionstate, ((SessionState) (sessionauthorizationtype)), ((Exception) (null)));
        obj;
        JVM INSTR monitorexit ;
        if (sessionauthorizationtype == SessionState.c)
        {
            a(((AuthorizationRequest) (openrequest)));
            return;
        } else
        {
            return;
        }
_L3:
        if (openrequest == null) goto _L9; else goto _L8
_L8:
        if (!arp.a(((AuthorizationRequest) (openrequest)).permissions) && !arp.a(((AuthorizationRequest) (openrequest)).permissions, e()))
        {
            pendingAuthorizationRequest = openrequest;
        }
_L9:
        if (pendingAuthorizationRequest != null) goto _L11; else goto _L10
_L10:
        sessionauthorizationtype = SessionState.d;
        state = sessionauthorizationtype;
          goto _L12
_L11:
        sessionauthorizationtype = SessionState.c;
        state = sessionauthorizationtype;
          goto _L12
    }

    public final void a(SessionState sessionstate, SessionState sessionstate1, Exception exception)
    {
        if (sessionstate != sessionstate1 || sessionstate == SessionState.e || exception != null)
        {
            if (sessionstate1.b())
            {
                tokenInfo = AccessToken.a();
            }
            exception = new Runnable(sessionstate1, exception) {

                final SessionState a;
                final Exception b;
                final Session c;

                public final void run()
                {
                    List list = Session.b(c);
                    list;
                    JVM INSTR monitorenter ;
                    Runnable runnable;
                    for (Iterator iterator = Session.b(c).iterator(); iterator.hasNext(); Session.a(Session.c(c), runnable))
                    {
                        runnable = new Runnable(this, (ape)iterator.next()) {

                            private ape a;
                            private _cls3 b;

                            public final void run()
                            {
                                a.a(b.c, b.a, b.b);
                            }

            
            {
                b = _pcls3;
                a = ape1;
                super();
            }
                        };
                    }

                    break MISSING_BLOCK_LABEL_69;
                    Exception exception1;
                    exception1;
                    list;
                    JVM INSTR monitorexit ;
                    throw exception1;
                    list;
                    JVM INSTR monitorexit ;
                }

            
            {
                c = Session.this;
                a = sessionstate;
                b = exception;
                super();
            }
            };
            b(handler, exception);
            if (this == d && sessionstate.a() != sessionstate1.a())
            {
                if (sessionstate1.a())
                {
                    a("com.facebook.sdk.ACTIVE_SESSION_OPENED");
                    return;
                } else
                {
                    a("com.facebook.sdk.ACTIVE_SESSION_CLOSED");
                    return;
                }
            }
        }
    }

    public final boolean a()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = state.a();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final boolean a(Activity activity, int i1, int j1, Intent intent)
    {
label0:
        {
            ars.a(activity, "currentActivity");
            b(activity);
            synchronized (lock)
            {
                if (pendingAuthorizationRequest != null && i1 == pendingAuthorizationRequest.requestCode)
                {
                    break label0;
                }
            }
            return false;
        }
        activity;
        JVM INSTR monitorexit ;
        Object obj = AuthorizationClient.Result.Code.c;
        if (intent != null)
        {
            activity = (AuthorizationClient.Result)intent.getSerializableExtra("com.facebook.LoginActivity:Result");
            if (activity != null)
            {
                a(j1, ((AuthorizationClient.Result) (activity)));
                return true;
            }
            break MISSING_BLOCK_LABEL_83;
        }
        if (j1 == 0)
        {
            activity = new FacebookOperationCanceledException("User canceled operation.");
            intent = AuthorizationClient.Result.Code.b;
        } else
        {
            activity = null;
            intent = ((Intent) (obj));
        }
          goto _L1
        intent;
        activity;
        JVM INSTR monitorexit ;
        throw intent;
        if (authorizationClient != null)
        {
            authorizationClient.a(i1, j1, intent);
            return true;
        }
        activity = null;
        intent = ((Intent) (obj));
_L3:
        obj = activity;
        if (activity == null)
        {
            obj = new FacebookException("Unexpected call to Session.onActivityResult");
        }
        a(((AuthorizationClient.Result.Code) (intent)), ((Map) (null)), ((Exception) (obj)));
        a(((AccessToken) (null)), ((Exception) (obj)));
        return true;
_L1:
        if (true) goto _L3; else goto _L2
_L2:
    }

    public final void b(ape ape)
    {
        synchronized (callbacks)
        {
            callbacks.remove(ape);
        }
        return;
        ape;
        list;
        JVM INSTR monitorexit ;
        throw ape;
    }

    public final boolean b()
    {
        boolean flag;
        synchronized (lock)
        {
            flag = state.b();
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final SessionState c()
    {
        SessionState sessionstate;
        synchronized (lock)
        {
            sessionstate = state;
        }
        return sessionstate;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final String d()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        String s = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return s;
_L2:
        s = tokenInfo.token;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public final List e()
    {
        Object obj = lock;
        obj;
        JVM INSTR monitorenter ;
        if (tokenInfo != null) goto _L2; else goto _L1
_L1:
        List list = null;
_L4:
        obj;
        JVM INSTR monitorexit ;
        return list;
_L2:
        list = tokenInfo.permissions;
        if (true) goto _L4; else goto _L3
_L3:
        Exception exception;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof Session)
        {
            if (a(((Session) (obj = (Session)obj)).applicationId, applicationId) && a(((Session) (obj)).authorizationBundle, authorizationBundle) && a(((Session) (obj)).state, state) && a(((Session) (obj)).j(), j()))
            {
                return true;
            }
        }
        return false;
    }

    public final void f()
    {
        if (tokenCachingStrategy != null)
        {
            tokenCachingStrategy.b();
        }
        arp.b(b);
        arp.c(b);
        k();
    }

    public int hashCode()
    {
        return 0;
    }

    public String toString()
    {
        StringBuilder stringbuilder = (new StringBuilder("{Session state:")).append(state).append(", token:");
        Object obj;
        if (tokenInfo == null)
        {
            obj = "null";
        } else
        {
            obj = tokenInfo;
        }
        stringbuilder = stringbuilder.append(obj).append(", appId:");
        if (applicationId == null)
        {
            obj = "null";
        } else
        {
            obj = applicationId;
        }
        return stringbuilder.append(((String) (obj))).append("}").toString();
    }


    private class OpenRequest extends AuthorizationRequest
    {
        private class AuthorizationRequest
            implements Serializable
        {

            private static final long serialVersionUID = 1L;
            String applicationId;
            final String authId;
            private SessionDefaultAudience defaultAudience;
            private boolean isLegacy;
            private final Map loggingExtras;
            SessionLoginBehavior loginBehavior;
            List permissions;
            int requestCode;
            final apd startActivityDelegate;
            public ape statusCallback;
            public String validateSameFbidAsToken;

            static Map a(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.loggingExtras;
            }

            static boolean b(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.isLegacy;
            }

            static SessionLoginBehavior c(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.loginBehavior;
            }

            static int d(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.requestCode;
            }

            static List e(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.permissions;
            }

            static SessionDefaultAudience f(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.defaultAudience;
            }

            static apd g(AuthorizationRequest authorizationrequest)
            {
                return authorizationrequest.startActivityDelegate;
            }

            private void readObject(ObjectInputStream objectinputstream)
            {
                throw new InvalidObjectException("Cannot readObject, serialization proxy required");
            }

            AuthorizationClient.AuthorizationRequest a()
            {
                aof aof = new aof() {

                    private AuthorizationRequest a;

                    public final Activity a()
                    {
                        return AuthorizationRequest.g(a).a();
                    }

                    public final void a(Intent intent, int i1)
                    {
                        AuthorizationRequest.g(a).a(intent, i1);
                    }

                    
                    {
                        a = AuthorizationRequest.this;
                        super();
                    }
                };
                return new AuthorizationClient.AuthorizationRequest(loginBehavior, requestCode, isLegacy, permissions, defaultAudience, applicationId, validateSameFbidAsToken, aof, authId);
            }

            AuthorizationRequest a(int i1)
            {
                if (i1 >= 0)
                {
                    requestCode = i1;
                }
                return this;
            }

            AuthorizationRequest a(ape ape)
            {
                statusCallback = ape;
                return this;
            }

            AuthorizationRequest a(SessionDefaultAudience sessiondefaultaudience)
            {
                if (sessiondefaultaudience != null)
                {
                    defaultAudience = sessiondefaultaudience;
                }
                return this;
            }

            AuthorizationRequest a(SessionLoginBehavior sessionloginbehavior)
            {
                if (sessionloginbehavior != null)
                {
                    loginBehavior = sessionloginbehavior;
                }
                return this;
            }

            AuthorizationRequest a(List list)
            {
                if (list != null)
                {
                    permissions = list;
                }
                return this;
            }

            Object writeReplace()
            {
                class AuthRequestSerializationProxyV1
                    implements Serializable
                {

                    private static final long serialVersionUID = 0x8697a02191312db1L;
                    private final String applicationId;
                    private final String defaultAudience;
                    private boolean isLegacy;
                    private final SessionLoginBehavior loginBehavior;
                    private final List permissions;
                    private final int requestCode;
                    private final String validateSameFbidAsToken;

                    private Object readResolve()
                    {
                        return new AuthorizationRequest(loginBehavior, requestCode, permissions, defaultAudience, isLegacy, applicationId, validateSameFbidAsToken, (byte)0);
                    }

                    private AuthRequestSerializationProxyV1(SessionLoginBehavior sessionloginbehavior, int i1, List list, String s, boolean flag, String s1, String s2)
                    {
                        loginBehavior = sessionloginbehavior;
                        requestCode = i1;
                        permissions = list;
                        defaultAudience = s;
                        isLegacy = flag;
                        applicationId = s1;
                        validateSameFbidAsToken = s2;
                    }

                    AuthRequestSerializationProxyV1(SessionLoginBehavior sessionloginbehavior, int i1, List list, String s, boolean flag, String s1, String s2, 
                            byte byte0)
                    {
                        this(sessionloginbehavior, i1, list, s, flag, s1, s2);
                    }
                }

                return new AuthRequestSerializationProxyV1(loginBehavior, requestCode, permissions, defaultAudience.name(), isLegacy, applicationId, validateSameFbidAsToken, (byte)0);
            }

            AuthorizationRequest(Activity activity)
            {
                loginBehavior = SessionLoginBehavior.a;
                requestCode = 64206;
                isLegacy = false;
                permissions = Collections.emptyList();
                defaultAudience = SessionDefaultAudience.a;
                authId = UUID.randomUUID().toString();
                loggingExtras = new HashMap();
                startActivityDelegate = new apd(activity) {

                    private Activity a;

                    public final Activity a()
                    {
                        return a;
                    }

                    public final void a(Intent intent, int i1)
                    {
                        a.startActivityForResult(intent, i1);
                    }

                    
                    {
                        a = activity;
                        super();
                    }
                };
            }

            AuthorizationRequest(Fragment fragment)
            {
                loginBehavior = SessionLoginBehavior.a;
                requestCode = 64206;
                isLegacy = false;
                permissions = Collections.emptyList();
                defaultAudience = SessionDefaultAudience.a;
                authId = UUID.randomUUID().toString();
                loggingExtras = new HashMap();
                startActivityDelegate = new apd(fragment) {

                    private Fragment a;

                    public final Activity a()
                    {
                        return a.k();
                    }

                    public final void a(Intent intent, int i1)
                    {
                        a.a(intent, i1);
                    }

                    
                    {
                        a = fragment;
                        super();
                    }
                };
            }

            private AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i1, List list, String s, boolean flag, String s1, String s2)
            {
                loginBehavior = SessionLoginBehavior.a;
                requestCode = 64206;
                isLegacy = false;
                permissions = Collections.emptyList();
                defaultAudience = SessionDefaultAudience.a;
                authId = UUID.randomUUID().toString();
                loggingExtras = new HashMap();
                startActivityDelegate = new apd() {

                    public final Activity a()
                    {
                        throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
                    }

                    public final void a(Intent intent, int j1)
                    {
                        throw new UnsupportedOperationException("Cannot create an AuthorizationRequest without a valid Activity or Fragment");
                    }

                };
                loginBehavior = sessionloginbehavior;
                requestCode = i1;
                permissions = list;
                defaultAudience = SessionDefaultAudience.valueOf(s);
                isLegacy = flag;
                applicationId = s1;
                validateSameFbidAsToken = s2;
            }

            AuthorizationRequest(SessionLoginBehavior sessionloginbehavior, int i1, List list, String s, boolean flag, String s1, String s2, 
                    byte byte0)
            {
                this(sessionloginbehavior, i1, list, s, flag, s1, s2);
            }
        }


        private static final long serialVersionUID = 1L;

        public final volatile AuthorizationRequest a(int i1)
        {
            super.a(i1);
            return this;
        }

        public final volatile AuthorizationRequest a(ape ape)
        {
            super.a(ape);
            return this;
        }

        public final volatile AuthorizationRequest a(SessionDefaultAudience sessiondefaultaudience)
        {
            super.a(sessiondefaultaudience);
            return this;
        }

        public final volatile AuthorizationRequest a(SessionLoginBehavior sessionloginbehavior)
        {
            super.a(sessionloginbehavior);
            return this;
        }

        public final volatile AuthorizationRequest a(List list)
        {
            super.a(list);
            return this;
        }

        public final OpenRequest b()
        {
            super.a(100);
            return this;
        }

        public final OpenRequest b(ape ape)
        {
            super.a(ape);
            return this;
        }

        public final OpenRequest b(SessionDefaultAudience sessiondefaultaudience)
        {
            super.a(sessiondefaultaudience);
            return this;
        }

        public final OpenRequest b(SessionLoginBehavior sessionloginbehavior)
        {
            super.a(sessionloginbehavior);
            return this;
        }

        public final OpenRequest b(List list)
        {
            super.a(list);
            return this;
        }

        public OpenRequest(Activity activity)
        {
            super(activity);
        }

        public OpenRequest(Fragment fragment)
        {
            super(fragment);
        }
    }


    private class SerializationProxyV1
        implements Serializable
    {

        private static final long serialVersionUID = 0x6a59fe98cd935affL;
        private final String applicationId;
        private final Date lastAttemptedTokenExtendDate;
        private final AuthorizationRequest pendingAuthorizationRequest;
        private final boolean shouldAutoPublish = false;
        private final SessionState state;
        private final AccessToken tokenInfo;

        private Object readResolve()
        {
            return new Session(applicationId, state, tokenInfo, lastAttemptedTokenExtendDate, pendingAuthorizationRequest, (byte)0);
        }

        SerializationProxyV1(String s, SessionState sessionstate, AccessToken accesstoken, Date date, AuthorizationRequest authorizationrequest)
        {
            applicationId = s;
            state = sessionstate;
            tokenInfo = accesstoken;
            lastAttemptedTokenExtendDate = date;
            pendingAuthorizationRequest = authorizationrequest;
        }
    }

}
