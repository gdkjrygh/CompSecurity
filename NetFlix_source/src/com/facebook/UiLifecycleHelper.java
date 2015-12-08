// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook;

import android.app.Activity;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Bundle;
import android.support.v4.content.LocalBroadcastManager;

// Referenced classes of package com.facebook:
//            Session, SessionState

public class UiLifecycleHelper
{
    private class ActiveSessionBroadcastReceiver extends BroadcastReceiver
    {

        final UiLifecycleHelper this$0;

        public void onReceive(Context context, Intent intent)
        {
            if ("com.facebook.sdk.ACTIVE_SESSION_SET".equals(intent.getAction()))
            {
                context = Session.getActiveSession();
                if (context != null && callback != null)
                {
                    context.addCallback(callback);
                }
            } else
            if ("com.facebook.sdk.ACTIVE_SESSION_UNSET".equals(intent.getAction()))
            {
                context = Session.getActiveSession();
                if (context != null && callback != null)
                {
                    context.removeCallback(callback);
                    return;
                }
            }
        }

        private ActiveSessionBroadcastReceiver()
        {
            this$0 = UiLifecycleHelper.this;
            super();
        }

    }


    private static final String ACTIVITY_NULL_MESSAGE = "activity cannot be null";
    private final Activity activity;
    private final LocalBroadcastManager broadcastManager;
    private final Session.StatusCallback callback;
    private final BroadcastReceiver receiver;

    public UiLifecycleHelper(Activity activity1, Session.StatusCallback statuscallback)
    {
        if (activity1 == null)
        {
            throw new IllegalArgumentException("activity cannot be null");
        } else
        {
            activity = activity1;
            callback = statuscallback;
            receiver = new ActiveSessionBroadcastReceiver();
            broadcastManager = LocalBroadcastManager.getInstance(activity1);
            return;
        }
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        Session session = Session.getActiveSession();
        if (session != null)
        {
            session.onActivityResult(activity, i, j, intent);
        }
    }

    public void onCreate(Bundle bundle)
    {
        Session session = Session.getActiveSession();
        if (session == null)
        {
            if (bundle != null)
            {
                session = Session.restoreSession(activity, null, callback, bundle);
            }
            bundle = session;
            if (session == null)
            {
                bundle = new Session(activity);
            }
            Session.setActiveSession(bundle);
        }
    }

    public void onDestroy()
    {
    }

    public void onPause()
    {
        broadcastManager.unregisterReceiver(receiver);
        if (callback != null)
        {
            Session session = Session.getActiveSession();
            if (session != null)
            {
                session.removeCallback(callback);
            }
        }
    }

    public void onResume()
    {
        Object obj = Session.getActiveSession();
        if (obj != null)
        {
            if (callback != null)
            {
                ((Session) (obj)).addCallback(callback);
            }
            if (SessionState.CREATED_TOKEN_LOADED.equals(((Session) (obj)).getState()))
            {
                ((Session) (obj)).openForRead(null);
            }
        }
        obj = new IntentFilter();
        ((IntentFilter) (obj)).addAction("com.facebook.sdk.ACTIVE_SESSION_SET");
        ((IntentFilter) (obj)).addAction("com.facebook.sdk.ACTIVE_SESSION_UNSET");
        broadcastManager.registerReceiver(receiver, ((IntentFilter) (obj)));
    }

    public void onSaveInstanceState(Bundle bundle)
    {
        Session.saveSession(Session.getActiveSession(), bundle);
    }

}
