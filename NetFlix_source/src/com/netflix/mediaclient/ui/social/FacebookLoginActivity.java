// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.social;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Window;
import android.widget.Toast;
import com.facebook.Response;
import com.facebook.Session;
import com.facebook.SessionState;
import com.facebook.internal.SessionTracker;
import com.facebook.model.GraphUser;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.repository.SecurityRepository;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.ManagerStatusListener;
import com.netflix.mediaclient.servicemgr.ServiceManager;
import com.netflix.mediaclient.ui.login.AccountActivity;

public class FacebookLoginActivity extends AccountActivity
{
    private class ConnectedToFacebookCallback extends LoggingManagerCallback
    {

        final FacebookLoginActivity this$0;

        public void onConnectWithFacebookComplete(int i, String s)
        {
            super.onConnectWithFacebookComplete(i, s);
            if (i == 0)
            {
                handleConnectSuccess();
                return;
            } else
            {
                handleConnectFailure();
                return;
            }
        }

        public ConnectedToFacebookCallback()
        {
            this$0 = FacebookLoginActivity.this;
            super("FacebookLoginActivity");
        }
    }


    private static final String TAG = "FacebookLoginActivity";
    private final com.facebook.Session.StatusCallback facebookSdkStatusCallback = new com.facebook.Session.StatusCallback() {

        final FacebookLoginActivity this$0;

        public void call(Session session, SessionState sessionstate, Exception exception)
        {
            Log.v("FacebookLoginActivity", (new StringBuilder()).append("Callback - Session: ").append(session).append(", State: ").append(sessionstate).append(", Exception: ").append(exception).toString());
            if (sessionstate.isOpened())
            {
                executeMeRequestIfDebug();
                manager.connectWithFacebook(Session.getActiveSession().getAccessToken(), new ConnectedToFacebookCallback());
            } else
            if (sessionstate.isClosed())
            {
                handleConnectFailure();
                return;
            }
        }

            
            {
                this$0 = FacebookLoginActivity.this;
                super();
            }
    };
    private ServiceManager manager;
    private SessionTracker tracker;

    public FacebookLoginActivity()
    {
    }

    private void executeMeRequestIfDebug()
    {
    }

    private void handleConnectFailure()
    {
        Toast.makeText(this, 0x7f0c016b, 1).show();
        finish();
    }

    private void handleConnectSuccess()
    {
        sendHomeRefreshBrodcast();
        Toast.makeText(this, 0x7f0c016a, 1).show();
        finish();
    }

    private void initFacebookSession()
    {
        Session.openActiveSession(this, true, facebookSdkStatusCallback, SecurityRepository.getFacebookId());
    }

    private void printAppSignatureKeyIfDebug()
    {
    }

    public static void show(Activity activity)
    {
        activity.startActivity(new Intent(activity, com/netflix/mediaclient/ui/social/FacebookLoginActivity));
        activity.overridePendingTransition(0, 0);
    }

    protected ManagerStatusListener createManagerStatusListener()
    {
        return new ManagerStatusListener() {

            final FacebookLoginActivity this$0;

            public void onManagerReady(ServiceManager servicemanager, int i)
            {
                manager = servicemanager;
                initFacebookSession();
            }

            public void onManagerUnavailable(ServiceManager servicemanager, int i)
            {
                manager = null;
            }

            
            {
                this$0 = FacebookLoginActivity.this;
                super();
            }
        };
    }

    public com.netflix.mediaclient.servicemgr.IClientLogging.ModalView getUiScreen()
    {
        return com.netflix.mediaclient.servicemgr.IClientLogging.ModalView.facebook;
    }

    protected void onActivityResult(int i, int j, Intent intent)
    {
        super.onActivityResult(i, j, intent);
        StringBuilder stringbuilder = (new StringBuilder()).append("onActivityResult: ").append(i).append(", result: ");
        Object obj;
        if (j == -1)
        {
            obj = "ok";
        } else
        if (j == 0)
        {
            obj = "cancelled";
        } else
        {
            obj = Integer.valueOf(j);
        }
        Log.v("FacebookLoginActivity", stringbuilder.append(obj).toString());
        obj = Session.getActiveSession();
        if (obj != null)
        {
            ((Session) (obj)).onActivityResult(this, i, j, intent);
        }
        Log.v("FacebookLoginActivity", (new StringBuilder()).append("onActivityResult session: ").append(obj).toString());
    }

    protected void onCreate(Bundle bundle)
    {
        getWindow().requestFeature(1);
        getWindow().setBackgroundDrawableResource(0x7f090030);
        super.onCreate(bundle);
        printAppSignatureKeyIfDebug();
    }

    public void sendHomeRefreshBrodcast()
    {
        sendBroadcast(new Intent("com.netflix.mediaclient.intent.action.REFRESH_HOME_LOLOMO"));
        Log.v("FacebookLoginActivity", "Intent REFRESH_HOME sent");
    }



/*
    static ServiceManager access$002(FacebookLoginActivity facebookloginactivity, ServiceManager servicemanager)
    {
        facebookloginactivity.manager = servicemanager;
        return servicemanager;
    }

*/





    // Unreferenced inner class com/netflix/mediaclient/ui/social/FacebookLoginActivity$2

/* anonymous class */
    class _cls2
        implements com.facebook.Request.GraphUserCallback
    {

        final FacebookLoginActivity this$0;

        public void onCompleted(GraphUser graphuser, Response response)
        {
            if (graphuser == null)
            {
                Log.v("FacebookLoginActivity", "Me request user: null");
            } else
            {
                Log.v("FacebookLoginActivity", (new StringBuilder()).append("Me request user: ").append(graphuser.getId()).append(" ").append(graphuser.getName()).append(" ").append(graphuser.getInnerJSONObject()).toString());
            }
            Log.v("FacebookLoginActivity", (new StringBuilder()).append("Me response: ").append(response).toString());
        }

            
            {
                this$0 = FacebookLoginActivity.this;
                super();
            }
    }

}
