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
import android.util.Log;
import com.facebook.internal.LikeActionController;
import com.facebook.internal.NativeProtocol;
import com.facebook.internal.PendingCallStore;
import com.facebook.widget.FacebookDialog;
import java.util.UUID;

// Referenced classes of package com.facebook:
//            Settings, Session, AppEventsLogger, SessionState

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

        ActiveSessionBroadcastReceiver(ActiveSessionBroadcastReceiver activesessionbroadcastreceiver)
        {
            this();
        }
    }


    private static final String ACTIVITY_NULL_MESSAGE = "activity cannot be null";
    private static final String DIALOG_CALL_ID_SAVE_KEY = "com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey";
    private final Activity activity;
    private AppEventsLogger appEventsLogger;
    private final LocalBroadcastManager broadcastManager;
    private final Session.StatusCallback callback;
    private UUID pendingFacebookDialogCallId;
    private PendingCallStore pendingFacebookDialogCallStore;
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
            receiver = new ActiveSessionBroadcastReceiver(null);
            broadcastManager = LocalBroadcastManager.getInstance(activity1);
            pendingFacebookDialogCallStore = PendingCallStore.getInstance();
            Settings.sdkInitialize(activity1);
            return;
        }
    }

    private void cancelPendingAppCall(com.facebook.widget.FacebookDialog.Callback callback1)
    {
        com.facebook.widget.FacebookDialog.PendingCall pendingcall;
        if (pendingFacebookDialogCallId != null)
        {
            if ((pendingcall = pendingFacebookDialogCallStore.getPendingCallById(pendingFacebookDialogCallId)) != null)
            {
                if (callback1 != null)
                {
                    Intent intent = pendingcall.getRequestIntent();
                    Intent intent1 = new Intent();
                    intent1.putExtra("com.facebook.platform.protocol.CALL_ID", intent.getStringExtra("com.facebook.platform.protocol.CALL_ID"));
                    intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_ACTION", intent.getStringExtra("com.facebook.platform.protocol.PROTOCOL_ACTION"));
                    intent1.putExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", intent.getIntExtra("com.facebook.platform.protocol.PROTOCOL_VERSION", 0));
                    intent1.putExtra("com.facebook.platform.status.ERROR_TYPE", "UnknownError");
                    FacebookDialog.handleActivityResult(activity, pendingcall, pendingcall.getRequestCode(), intent1, callback1);
                }
                stopTrackingPendingAppCall();
                return;
            }
        }
    }

    private boolean handleFacebookDialogActivityResult(int i, int j, Intent intent, com.facebook.widget.FacebookDialog.Callback callback1)
    {
        com.facebook.widget.FacebookDialog.PendingCall pendingcall;
        if (pendingFacebookDialogCallId != null)
        {
            if ((pendingcall = pendingFacebookDialogCallStore.getPendingCallById(pendingFacebookDialogCallId)) != null && pendingcall.getRequestCode() == i)
            {
                if (intent == null)
                {
                    cancelPendingAppCall(callback1);
                    return true;
                }
                UUID uuid = NativeProtocol.getCallIdFromIntent(intent);
                if (uuid != null && pendingFacebookDialogCallId.equals(uuid))
                {
                    FacebookDialog.handleActivityResult(activity, pendingcall, i, intent, callback1);
                } else
                {
                    cancelPendingAppCall(callback1);
                }
                stopTrackingPendingAppCall();
                return true;
            }
        }
        return false;
    }

    private void stopTrackingPendingAppCall()
    {
        pendingFacebookDialogCallStore.stopTrackingPendingCall(pendingFacebookDialogCallId);
        pendingFacebookDialogCallId = null;
    }

    public AppEventsLogger getAppEventsLogger()
    {
        Session session = Session.getActiveSession();
        if (session == null)
        {
            return null;
        }
        if (appEventsLogger == null || !appEventsLogger.isValidForSession(session))
        {
            if (appEventsLogger != null)
            {
                AppEventsLogger.onContextStop();
            }
            appEventsLogger = AppEventsLogger.newLogger(activity, session);
        }
        return appEventsLogger;
    }

    public void onActivityResult(int i, int j, Intent intent)
    {
        onActivityResult(i, j, intent, null);
    }

    public void onActivityResult(int i, int j, Intent intent, com.facebook.widget.FacebookDialog.Callback callback1)
    {
        Session session = Session.getActiveSession();
        if (session != null)
        {
            session.onActivityResult(activity, i, j, intent);
        }
        if (LikeActionController.handleOnActivityResult(activity, i, j, intent))
        {
            return;
        } else
        {
            handleFacebookDialogActivityResult(i, j, intent, callback1);
            return;
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
            Session session1 = session;
            if (session == null)
            {
                session1 = new Session(activity);
            }
            Session.setActiveSession(session1);
        }
        if (bundle != null)
        {
            String s = bundle.getString("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey");
            if (s != null)
            {
                pendingFacebookDialogCallId = UUID.fromString(s);
            }
            pendingFacebookDialogCallStore.restoreFromSavedInstanceState(bundle);
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
        if (pendingFacebookDialogCallId != null)
        {
            bundle.putString("com.facebook.UiLifecycleHelper.pendingFacebookDialogCallKey", pendingFacebookDialogCallId.toString());
        }
        pendingFacebookDialogCallStore.saveInstanceState(bundle);
    }

    public void onStop()
    {
        AppEventsLogger.onContextStop();
    }

    public void trackPendingDialogCall(com.facebook.widget.FacebookDialog.PendingCall pendingcall)
    {
        if (pendingFacebookDialogCallId != null)
        {
            Log.i("Facebook", "Tracking new app call while one is still pending; canceling pending call.");
            cancelPendingAppCall(null);
        }
        if (pendingcall != null)
        {
            pendingFacebookDialogCallId = pendingcall.getCallId();
            pendingFacebookDialogCallStore.trackPendingCall(pendingcall);
        }
    }

}
