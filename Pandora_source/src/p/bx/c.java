// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package p.bx;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.content.j;
import com.facebook.FacebookRequestError;
import com.facebook.HttpMethod;
import com.facebook.LoggingBehavior;
import com.facebook.Request;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionDefaultAudience;
import com.facebook.SessionLoginBehavior;
import com.facebook.SessionState;
import com.facebook.Settings;
import com.facebook.model.GraphUser;
import com.pandora.android.activity.PandoraIntent;
import com.pandora.android.activity.PandoraIntentFilter;
import com.pandora.android.data.h;
import com.pandora.android.provider.b;
import com.pandora.android.util.s;
import com.pandora.radio.data.ag;
import com.pandora.radio.data.ai;
import com.pandora.radio.data.o;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArraySet;
import org.json.JSONObject;
import p.bz.y;
import p.cm.ae;
import p.cm.m;
import p.dd.an;
import p.dd.bj;
import p.dd.bk;
import p.df.a;

// Referenced classes of package p.bx:
//            b, d, a

public class c
    implements p.bx.b
{

    private static final List h;
    private h a;
    private CopyOnWriteArraySet b;
    private com.facebook.Session.StatusCallback c;
    private BroadcastReceiver d;
    private boolean e;
    private boolean f;
    private boolean g;

    c()
    {
        a = new h(null);
        b = new CopyOnWriteArraySet();
        c = new com.facebook.Session.StatusCallback() {

            final c a;

            public void call(Session session, SessionState sessionstate, Exception exception)
            {
                p.bx.c.a(a, session, sessionstate, exception);
            }

            
            {
                a = c.this;
                super();
            }
        };
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("cmd_send_facebook_user_data_result");
        d = new BroadcastReceiver() {

            final c a;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                if (PandoraIntent.a("cmd_send_facebook_user_data_result").equals(context))
                {
                    a.a(intent);
                }
            }

            
            {
                a = c.this;
                super();
            }
        };
        b.a.C().a(d, pandoraintentfilter);
        b.a.b().b(this);
        b.a.e().c(this);
    }

    static h a(c c1)
    {
        return c1.a;
    }

    private void a(Activity activity, b.b b1)
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharingInternal()");
        if (!d())
        {
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharingInternal() --> ActivityHelper.showEnablePublicProfileDialog(...)");
            com.pandora.android.activity.a.a(activity, new p.bx.a(activity, b1) {

                final Activity a;
                final b.b b;
                final c c;

                public void a()
                {
                    p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharingInternal() : EnablePublicProfileListener.onEnabled() --> enableFaceookAutoSharingInternal(...)");
                    p.bx.c.a(c, a, b);
                }

                public void b()
                {
                    p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableFaceookAutoSharing() : enableFaceookAutoSharingInternal.onDeclined() --> user chose to keep profile private");
                    b.b();
                }

            
            {
                c = c.this;
                a = activity;
                b = b1;
                super();
            }
            });
            return;
        } else
        {
            b(activity, b1);
            return;
        }
    }

    private void a(Session session, SessionState sessionstate, Exception exception)
    {
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.onFacebookSessionCallback() : state = ").append(sessionstate).toString());
        static class _cls9
        {

            static final int a[];
            static final int b[];
            static final int c[];

            static 
            {
                c = new int[p.cx.e.a.values().length];
                try
                {
                    c[p.cx.e.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror13) { }
                try
                {
                    c[p.cx.e.a.b.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror12) { }
                try
                {
                    c[p.cx.e.a.d.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror11) { }
                try
                {
                    c[p.cx.e.a.c.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror10) { }
                b = new int[SessionState.values().length];
                try
                {
                    b[SessionState.CLOSED.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror9) { }
                try
                {
                    b[SessionState.CLOSED_LOGIN_FAILED.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror8) { }
                try
                {
                    b[SessionState.CREATED.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror7) { }
                try
                {
                    b[SessionState.CREATED_TOKEN_LOADED.ordinal()] = 4;
                }
                catch (NoSuchFieldError nosuchfielderror6) { }
                try
                {
                    b[SessionState.OPENED_TOKEN_UPDATED.ordinal()] = 5;
                }
                catch (NoSuchFieldError nosuchfielderror5) { }
                try
                {
                    b[SessionState.OPENED.ordinal()] = 6;
                }
                catch (NoSuchFieldError nosuchfielderror4) { }
                try
                {
                    b[SessionState.OPENING.ordinal()] = 7;
                }
                catch (NoSuchFieldError nosuchfielderror3) { }
                a = new int[p.cm.ae.a.values().length];
                try
                {
                    a[p.cm.ae.a.a.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    a[p.cm.ae.a.c.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    a[p.cm.ae.a.b.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        p.bx._cls9.b[sessionstate.ordinal()];
        JVM INSTR tableswitch 1 7: default 76
    //                   1 77
    //                   2 126
    //                   3 76
    //                   4 76
    //                   5 148
    //                   6 148
    //                   7 76;
           goto _L1 _L2 _L3 _L1 _L1 _L4 _L4 _L1
_L1:
        return;
_L2:
        c(false);
        b.a.b().j().b(false);
        b.a.b().k().u();
        s.b();
        a.clear();
        j();
        return;
_L3:
        (new ae()).execute(new Object[] {
            p.cm.ae.a.c
        });
        return;
_L4:
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.onFacebookSessionCallback() : mRequestingReadPermission = ").append(g).toString());
        if (g)
        {
            if (!m())
            {
                (new ae()).execute(new Object[] {
                    p.cm.ae.a.c
                });
                return;
            }
        } else
        if (!h())
        {
            (new ae()).execute(new Object[] {
                p.cm.ae.a.c
            });
            return;
        } else
        {
            session = Request.newMeRequest(session, new com.facebook.Request.GraphUserCallback(session) {

                final Session a;
                final c b;

                public void onCompleted(GraphUser graphuser, Response response)
                {
                    response = response.getError();
                    if (response != null)
                    {
                        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.onFacebookSessionCallback --> MeRequest.onComplete() : Could not get current user info.  ").append(response.getErrorMessage()).toString());
                        (new ae()).execute(new Object[] {
                            p.cm.ae.a.c
                        });
                    } else
                    if (a == Session.getActiveSession())
                    {
                        p.bx.c.a(b).a(graphuser);
                        if (p.bx.c.b(b))
                        {
                            p.bx.c.a(b, false);
                            c.c(b);
                            return;
                        } else
                        {
                            (new ae()).execute(new Object[] {
                                p.cm.ae.a.b
                            });
                            return;
                        }
                    }
                }

            
            {
                b = c.this;
                a = session;
                super();
            }
            });
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.onFacebookSessionCallback --> executing MeRequest to get current user info.");
            session.executeAsync();
            return;
        }
        if (true) goto _L1; else goto _L5
_L5:
    }

    static void a(c c1, Activity activity, b.b b1)
    {
        c1.b(activity, b1);
    }

    static void a(c c1, Session session, SessionState sessionstate, Exception exception)
    {
        c1.a(session, sessionstate, exception);
    }

    static boolean a(c c1, boolean flag)
    {
        c1.e = flag;
        return flag;
    }

    private void b(Activity activity, b.b b1)
    {
        if (!c() || !h())
        {
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.connect() --> new GetFacebookInfoAsyncTask(...) : user.getFacebookInfo");
            (new m()).execute(new Object[] {
                new p.cm.m.a(b1, activity) {

                    final b.b a;
                    final Activity b;
                    final c c;

                    public void a()
                    {
                        p.df.a.a("FacebookConnectImpl", "FacebookConnect.connect() : GetFacebookInfoAsyncTask.onSuccess() --> openSession(...)");
                        c.a(a, b);
                    }

                    public void b()
                    {
                        p.df.a.a("FacebookConnectImpl", "FacebookConnect.connect() : GetFacebookInfoAsyncTask.onFailure() --> authListener.onAuthFail");
                        a.b();
                    }

            
            {
                c = c.this;
                a = b1;
                b = activity;
                super();
            }
                }
            });
            return;
        } else
        {
            p.df.a.a("FacebookConnectImpl", "FaebookConnect.connect() : isConnected = true && checkPermissions = true --> authListener.onAuthSucceeded");
            b1.a();
            return;
        }
    }

    static boolean b(c c1)
    {
        return c1.e;
    }

    static boolean b(c c1, boolean flag)
    {
        c1.g = flag;
        return flag;
    }

    static void c(c c1)
    {
        c1.l();
    }

    static boolean d(c c1)
    {
        return c1.g;
    }

    private void j()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b.b)iterator.next()).c()) { }
    }

    private void k()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b.b)iterator.next()).b()) { }
    }

    private void l()
    {
        for (Iterator iterator = b.iterator(); iterator.hasNext(); ((b.b)iterator.next()).a()) { }
    }

    private boolean m()
    {
        String as[] = a.j();
        Object obj;
        if (as != null)
        {
            if ((obj = Session.getActiveSession()) != null && ((Session) (obj)).isOpened())
            {
                obj = ((Session) (obj)).getPermissions();
                p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.checkReadPermissions() --> checking requested READ permissions").append(obj).toString());
                StringBuffer stringbuffer = new StringBuffer(2);
                int j1 = as.length;
                for (int i1 = 0; i1 < j1; i1++)
                {
                    String s1 = as[i1];
                    if (!((List) (obj)).contains(s1) && !h.contains(s1))
                    {
                        stringbuffer.append(s1);
                    }
                }

                if (stringbuffer.length() == 0)
                {
                    p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.checkReadPermissions() --> all READ permissions have been granted : ").append(Arrays.asList(as)).toString());
                    return true;
                } else
                {
                    p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.checkReadPermissions() --> Required READ permissions have NOT been granted : ").append(stringbuffer).toString());
                    return false;
                }
            }
        }
        return false;
    }

    public void a()
    {
        Object obj;
        Session session2;
        h h1;
        android.app.Application application;
        obj = null;
        if (!s.p())
        {
            Settings.addLoggingBehavior(LoggingBehavior.INCLUDE_ACCESS_TOKENS);
        }
        h1 = p.bx.d.a().b();
        if (h1.n() == null)
        {
            return;
        }
        session2 = Session.getActiveSession();
        if (session2 != null && session2.isOpened() && h1.a() && session2.getAccessToken().equals(h1.c()))
        {
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.initSession : we have an Open Active Session.");
            return;
        }
        application = b.a.h();
        if (!h1.a() || !h1.b()) goto _L2; else goto _L1
_L1:
        Session session;
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.initSession : trying to create Session using AccessToken");
        e = true;
        session2 = Session.openActiveSessionWithAccessToken(application, h1.n(), h1.d(), h1, c);
        session = session2;
        if (!session2.isOpened())
        {
            Session.setActiveSession(null);
            session = obj;
        }
_L4:
        Session session1 = session;
        if (session == null)
        {
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.initSession : could not create Session with AccessToken. Creating NEW Session object");
            session1 = (new com.facebook.Session.Builder(application)).setTokenCachingStrategy(h1).setApplicationId(h1.n()).build();
            Session.setActiveSession(session1);
        }
        session1.addCallback(c);
        return;
_L2:
        p.df.a.a("FacebookConnectImpl", "FacebookConnect.initSession : fbUserData.accessToken string (from server) is null");
        session = session2;
        if (session2 != null)
        {
            session = session2;
            if (session2.isOpened())
            {
                p.df.a.a("FacebookConnectImpl", "FacebookConnect.initSession : closing current Opened Active Session");
                session2.closeAndClearTokenInformation();
                Session.setActiveSession(null);
                session = session2;
            }
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public void a(Activity activity, int i1, int j1, Intent intent)
    {
        if (i1 == 128)
        {
            Session session = Session.getActiveSession();
            if (session != null)
            {
                session.onActivityResult(activity, i1, j1, intent);
            }
        }
    }

    public void a(Activity activity, b.a a1)
    {
        BroadcastReceiver broadcastreceiver = new BroadcastReceiver(a1) {

            final b.a a;
            final c b;

            public void onReceive(Context context, Intent intent)
            {
                context = intent.getAction();
                p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.enableAutoSharing.broadcardReceiver --> ").append(context).toString());
                if (PandoraIntent.a("cmd_change_settings_result").equals(context))
                {
                    boolean flag = intent.getBooleanExtra("intent_success", false);
                    if (flag && intent.getBooleanExtra("facebook_auto_share_setting_changed", false))
                    {
                        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.broadcardReceiver --> publicApiSuccess == true && auto-share setting changed");
                        b.a.C().a(this);
                        a.a();
                    } else
                    if (!flag)
                    {
                        p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.broadcardReceiver --> publicApiSuccess == false");
                        b.a.C().a(this);
                        a.b();
                        return;
                    }
                }
            }

            
            {
                b = c.this;
                a = a1;
                super();
            }
        };
        PandoraIntentFilter pandoraintentfilter = new PandoraIntentFilter();
        pandoraintentfilter.a("cmd_change_settings_result");
        b.a.C().a(broadcastreceiver, pandoraintentfilter);
        a(activity, new b.b(a1) {

            final b.a a;
            final c b;

            public void a()
            {
                p.bx.d.a().b(this);
                p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthSucceed --> Facebook Auth Success : enabling auto-share --> setFacebookAutoShareSetting(true ...)");
                p.bx.d.a().a(true, true, false);
                a.a();
            }

            public void b()
            {
                p.bx.d.a().b(this);
                p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthFail --> Facebook Auth Failed : auto-share remaining off");
                a.b();
            }

            public void c()
            {
                p.df.a.a("FacebookConnectImpl", "FacebookConnect.enableAutoSharing.onAuthFail --> Facebook Disconnect : treating as authFailure. Auto-share remaining off");
                p.bx.d.a().b(this);
                a.b();
            }

            
            {
                b = c.this;
                a = a1;
                super();
            }
        });
    }

    protected void a(Intent intent)
    {
        boolean flag = intent.getBooleanExtra("intent_success", false);
        p.cm.ae.a a1 = p.cm.ae.a.valueOf(intent.getStringExtra("intent_reason"));
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.broadcastReceiver ACTION_CMD_SEND_FACEBOOK_USER_DATA_RESULT : success = ").append(flag).append(", Reason = ").append(a1).toString());
        if (flag)
        {
            switch (p.bx._cls9.a[a1.ordinal()])
            {
            default:
                p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.broadcastReceiver ACTION_CMD_SEND_FACEBOOK_USER_DATA_RESULT : success = ").append(flag).append(", Unexpected Reason = ").append(a1).toString());
                return;

            case 1: // '\001'
                a(false);
                return;

            case 2: // '\002'
                k();
                a(false);
                return;

            case 3: // '\003'
                l();
                break;
            }
            return;
        }
        int i1 = intent.getIntExtra("intent_api_error_code", 0);
        intent = intent.getStringExtra("intent_message");
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.broadcastReceiver ACTION_CMD_SEND_FACEBOOK_USER_DATA_RESULT :  ").append(a1).append(", FAILED; errorCode = ").append(i1).append(", errorMessage = '").append(intent).append("' ==> turning off auto-share; disconnect(FACEBOOK); notifyAuthFailed(FACEBOOK)").toString());
        switch (p.bx._cls9.a[a1.ordinal()])
        {
        default:
            p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.broadcastReceiver ACTION_CMD_SEND_FACEBOOK_USER_DATA_RESULT : success = ").append(flag).append(", Unexpected Reason = ").append(a1).toString());
            return;

        case 1: // '\001'
            intent = new PandoraIntent("cmd_change_settings_result");
            intent.putExtra("intent_success", false);
            intent.putExtra("intent_user_settings", b.a.b().k().t());
            b.a.C().a(intent);
            return;

        case 2: // '\002'
        case 3: // '\003'
            a(false, false, false);
            break;
        }
        k();
        a(false);
    }

    public void a(Bundle bundle, com.facebook.Request.Callback callback)
    {
        Session session = Session.getActiveSession();
        if (session != null && session.isOpened())
        {
            (new Request(session, "me/feed", bundle, HttpMethod.POST, callback)).executeAsync();
        }
    }

    public void a(com.facebook.Request.GraphUserListCallback graphuserlistcallback)
    {
        Session session = Session.getActiveSession();
        if (session != null && session.isOpened())
        {
            Request.newMyFriendsRequest(session, graphuserlistcallback).executeAsync();
        }
    }

    public void a(b.b b1, Activity activity)
    {
        a(b1);
        a();
        b1 = Session.getActiveSession();
        if (b1 != null && !b1.isOpened())
        {
            com.facebook.Session.OpenRequest openrequest = (new com.facebook.Session.OpenRequest(activity)).setLoginBehavior(SessionLoginBehavior.SSO_WITH_FALLBACK).setRequestCode(128).setPermissions(Arrays.asList(a.j()));
            openrequest.setCallback(new com.facebook.Session.StatusCallback(activity) {

                final Activity a;
                final c b;

                public void call(Session session, SessionState sessionstate, Exception exception)
                {
                    p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.openSession() --> OpenRequest.StatusCallback : SessionState = ").append(sessionstate).append(",  mRequestingReadPermission = ").append(c.d(b)).toString());
                    if (sessionstate == SessionState.OPENED && c.d(b))
                    {
                        p.bx.c.b(b, false);
                        session.removeCallback(this);
                        p.df.a.a("FacebookConnectImpl", "FacebookConnect.openSession() --> OpenRequest.StatusCallback : requesting PUBLISH permissions");
                        session.requestNewPublishPermissions((new com.facebook.Session.NewPermissionsRequest(a, Arrays.asList(p.bx.c.a(b).k()))).setDefaultAudience(SessionDefaultAudience.FRIENDS).setRequestCode(128));
                    }
                }

            
            {
                b = c.this;
                a = activity;
                super();
            }
            });
            g = true;
            p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.openSession() --> Session is NOT OPENED (SessionState = ").append(b1.getState()).append("), Opening Session with READ permissions").toString());
            b1.openForRead(openrequest);
        }
    }

    public void a(boolean flag, boolean flag1)
    {
        ai ai1 = b.a.b().k().t();
        ai ai2 = new ai(ai1.a(), ai1.c(), ai1.d(), flag, ai1.f(), ai1.g(), ai1.h(), ai1.i(), ai1.j(), ai1.k(), ai1.l(), ai1.m(), ai1.n(), ai1.o(), ai1.p(), ai1.q(), ai1.r(), ai1.s(), ai1.t(), flag1, ai1.v(), ai1.w());
        if (!ai1.a(ai2))
        {
            (new p.cm.h(ai1, ai2, false)).execute(new Object[0]);
        }
    }

    public void a(boolean flag, boolean flag1, boolean flag2)
    {
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.setFacebookAutoShareSetting() --> enableAutoshare = ").append(flag).append(", userInitiatedChange = ").append(flag1).append(", showToast = ").append(flag2).toString());
        ag ag1 = b.a.b().k();
        ai ai1 = ag1.t();
        boolean flag6 = ai1.q();
        boolean flag7 = ai1.r();
        boolean flag8 = ai1.s();
        boolean flag5 = flag6;
        boolean flag4 = flag7;
        boolean flag3 = flag8;
        if (flag)
        {
            flag5 = flag6;
            flag4 = flag7;
            flag3 = flag8;
            if (!ai1.q())
            {
                flag5 = flag6;
                flag4 = flag7;
                flag3 = flag8;
                if (!ai1.r())
                {
                    flag5 = flag6;
                    flag4 = flag7;
                    flag3 = flag8;
                    if (!ai1.s())
                    {
                        flag5 = true;
                        flag4 = true;
                        flag3 = true;
                    }
                }
            }
        }
        ai ai2 = new ai(ai1.a(), ai1.c(), ai1.d(), ai1.e(), ai1.f(), ai1.g(), ai1.h(), ai1.i(), ai1.j(), ai1.k(), ai1.l(), ai1.m(), ai1.n(), ai1.o(), flag, flag5, flag4, flag3, ai1.t(), flag1, ai1.v(), ai1.w());
        if (!ai1.a(ai2))
        {
            ag1.a(ai2);
            (new p.cm.h(ai1, ai2, flag2)).execute(new Object[0]);
        }
    }

    public boolean a(b.b b1)
    {
        if (b1 != null)
        {
            return b.add(b1);
        } else
        {
            return false;
        }
    }

    public boolean a(boolean flag)
    {
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.disconnect() : notifyServer = ").append(flag).toString());
        Session session = Session.getActiveSession();
        if (session == null)
        {
            p.df.a.a("FacebookConnectImpl", "FacebookConnect.disconnect() : facebook Session == null");
            return false;
        }
        if (flag)
        {
            b.a.b().k().c(null);
            (new ae()).execute(new Object[] {
                p.cm.ae.a.a
            });
        } else
        {
            session.closeAndClearTokenInformation();
            Session.setActiveSession(null);
        }
        return true;
    }

    public h b()
    {
        return a;
    }

    public void b(boolean flag)
    {
        f = flag;
    }

    public boolean b(b.b b1)
    {
        return b.remove(b1);
    }

    public void c(boolean flag)
    {
        ag ag1 = b.a.b().k();
        ag1.a(flag, ag1.d());
    }

    public boolean c()
    {
        Session session = Session.getActiveSession();
        if (session != null)
        {
            return session.isOpened();
        } else
        {
            return false;
        }
    }

    public boolean d()
    {
        return b.a.b().k().x();
    }

    public void e()
    {
        a(false);
        b.a.C().a(d);
        b.a.b().c(this);
        b.a.e().b(this);
    }

    public boolean f()
    {
        return f;
    }

    public boolean g()
    {
        return b.a.b().k().c();
    }

    public boolean h()
    {
        String as1[] = a.l();
        String as[] = a.m();
        Object obj;
        if (as1 != null && as != null)
        {
            if ((obj = Session.getActiveSession()) != null && ((Session) (obj)).isOpened())
            {
                obj = ((Session) (obj)).getPermissions();
                p.df.a.a("FacebookConnectImpl", "FacebookConnect.checkAllPermissions() --> checking requested Explicit Share permissions");
                StringBuffer stringbuffer = new StringBuffer(2);
                int k1 = as1.length;
                for (int i1 = 0; i1 < k1; i1++)
                {
                    String s2 = as1[i1];
                    if (!((List) (obj)).contains(s2))
                    {
                        stringbuffer.append(s2);
                    }
                }

                if (i())
                {
                    p.df.a.a("FacebookConnectImpl", "FacebookConnect.checkAllPermissions() --> checking requested Auto-Share permissions");
                    int l1 = as.length;
                    for (int j1 = 0; j1 < l1; j1++)
                    {
                        String s1 = as[j1];
                        if (!((List) (obj)).contains(s1))
                        {
                            stringbuffer.append(s1);
                        }
                    }

                }
                if (stringbuffer.length() == 0)
                {
                    p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.checkAllPermissions() --> all required permissions have been granted : ").append(obj).toString());
                    return true;
                } else
                {
                    p.df.a.c("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnect.checkPermissions() --> Required permissions have NOT been granted : ").append(stringbuffer).toString());
                    return false;
                }
            }
        }
        return false;
    }

    public boolean i()
    {
        return b.a.b().k().v();
    }

    public void onSignInStateChanged(an an1)
    {
        p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnectImpl.onSignInStateChanged(").append(an1.b).append(")").toString());
        _cls9.c[an1.b.ordinal()];
        JVM INSTR tableswitch 1 4: default 76
    //                   1 76
    //                   2 77
    //                   3 76
    //                   4 76;
           goto _L1 _L1 _L2 _L1 _L1
_L1:
        return;
_L2:
        if (a.i())
        {
            p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnectImpl.onSignInStateChanged(").append(an1.b).append(") : facebookReauthorize == TRUE.  Disabling auto-share and disconnecting facebook").toString());
            a(false, false, false);
            a(false);
            return;
        }
        if (true) goto _L1; else goto _L3
_L3:
    }

    public void onUiDestroyed(y y)
    {
        p.df.a.a("FacebookConnectImpl", "FacebookConnectImpl.onUiDestroyed() --> clearing incomplete facebook session");
        y = Session.getActiveSession();
        if (y != null && y.getState() == SessionState.OPENING)
        {
            y.close();
        }
    }

    public void onUpdateFacebookInfo(bj bj)
    {
        bj = b();
        if (!bj.a() || bj.i())
        {
            p.df.a.a("FacebookConnectImpl", (new StringBuilder()).append("FacebookConnectImpl.onUpdateFacebookInfo : isFacebookConnectedOnServer == ").append(bj.a()).append(", facebookReauthorize == ").append(bj.i()).append(".  Disabling auto-share and disconnecting facebook").toString());
            a(false);
        }
    }

    public void onUpdateFacebookUserData(bk bk1)
    {
        bk1 = bk1.a;
        b().a(bk1);
        Object obj = b.a.b().k();
        ai ai1 = ((ag) (obj)).t();
        if (bk1.has("facebookAccessToken"))
        {
            bk1 = new ai(ai1.a(), ai1.c(), ai1.d(), ai1.e(), ai1.f(), ai1.g(), ai1.h(), ai1.i(), ai1.j(), ai1.k(), ai1.l(), ai1.m(), ai1.n(), ai1.o(), bk1.optBoolean("facebookAutoShareEnabled", ai1.p()), bk1.optBoolean("autoShareTrackPlay", ai1.q()), bk1.optBoolean("autoShareLikes", ai1.r()), bk1.optBoolean("autoShareFollows", ai1.s()), bk1.optString("facebookSettingChecksum"), false, ai1.v(), ai1.w());
        } else
        {
            bk1 = new ai(ai1.a(), ai1.c(), ai1.d(), ai1.e(), ai1.f(), ai1.g(), ai1.h(), ai1.i(), ai1.j(), ai1.k(), ai1.l(), ai1.m(), ai1.n(), ai1.o(), false, false, false, false, "", false, ai1.v(), ai1.w());
        }
        ((ag) (obj)).a(bk1);
        obj = new PandoraIntent("cmd_change_settings_result");
        ((Intent) (obj)).putExtra("intent_success", true);
        ((Intent) (obj)).putExtra("intent_user_settings", bk1);
        b.a.C().a(((Intent) (obj)));
    }

    static 
    {
        h = new ArrayList();
        h.add("user_actions.music");
    }
}
