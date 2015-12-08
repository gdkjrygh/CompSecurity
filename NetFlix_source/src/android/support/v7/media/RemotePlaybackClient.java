// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;

// Referenced classes of package android.support.v7.media:
//            MediaSessionStatus, MediaItemStatus

public class RemotePlaybackClient
{
    public static abstract class ActionCallback
    {

        public void onError(String s, int i, Bundle bundle)
        {
        }

        public ActionCallback()
        {
        }
    }

    public static abstract class ItemActionCallback extends ActionCallback
    {

        public void onResult(Bundle bundle, String s, MediaSessionStatus mediasessionstatus, String s1, MediaItemStatus mediaitemstatus)
        {
        }

        public ItemActionCallback()
        {
        }
    }

    public static abstract class SessionActionCallback extends ActionCallback
    {

        public void onResult(Bundle bundle, String s, MediaSessionStatus mediasessionstatus)
        {
        }

        public SessionActionCallback()
        {
        }
    }

    public static abstract class StatusCallback
    {

        public void onItemStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus, String s1, MediaItemStatus mediaitemstatus)
        {
        }

        public void onSessionChanged(String s)
        {
        }

        public void onSessionStatusChanged(Bundle bundle, String s, MediaSessionStatus mediasessionstatus)
        {
        }

        public StatusCallback()
        {
        }
    }

    private final class StatusReceiver extends BroadcastReceiver
    {

        public static final String ACTION_ITEM_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED";
        public static final String ACTION_SESSION_STATUS_CHANGED = "android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED";
        final RemotePlaybackClient this$0;

        public void onReceive(Context context, Intent intent)
        {
            context = intent.getStringExtra("android.media.intent.extra.SESSION_ID");
            if (context != null && context.equals(mSessionId)) goto _L2; else goto _L1
_L1:
            Log.w("RemotePlaybackClient", (new StringBuilder()).append("Discarding spurious status callback with missing or invalid session id: sessionId=").append(context).toString());
_L4:
            return;
_L2:
            MediaSessionStatus mediasessionstatus;
            String s;
            mediasessionstatus = MediaSessionStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.SESSION_STATUS"));
            s = intent.getAction();
            if (!s.equals("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED"))
            {
                continue; /* Loop/switch isn't completed */
            }
            s = intent.getStringExtra("android.media.intent.extra.ITEM_ID");
            if (s == null)
            {
                Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item id.");
                return;
            }
            MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(intent.getBundleExtra("android.media.intent.extra.ITEM_STATUS"));
            if (mediaitemstatus == null)
            {
                Log.w("RemotePlaybackClient", "Discarding spurious status callback with missing item status.");
                return;
            }
            if (RemotePlaybackClient.DEBUG)
            {
                Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received item status callback: sessionId=").append(context).append(", sessionStatus=").append(mediasessionstatus).append(", itemId=").append(s).append(", itemStatus=").append(mediaitemstatus).toString());
            }
            if (mStatusCallback != null)
            {
                mStatusCallback.onItemStatusChanged(intent.getExtras(), context, mediasessionstatus, s, mediaitemstatus);
                return;
            }
            continue; /* Loop/switch isn't completed */
            if (!s.equals("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED")) goto _L4; else goto _L3
_L3:
            if (mediasessionstatus == null)
            {
                Log.w("RemotePlaybackClient", "Discarding spurious media status callback with missing session status.");
                return;
            }
            if (RemotePlaybackClient.DEBUG)
            {
                Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received session status callback: sessionId=").append(context).append(", sessionStatus=").append(mediasessionstatus).toString());
            }
            if (mStatusCallback != null)
            {
                mStatusCallback.onSessionStatusChanged(intent.getExtras(), context, mediasessionstatus);
                return;
            }
            if (true) goto _L4; else goto _L5
_L5:
        }

        private StatusReceiver()
        {
            this$0 = RemotePlaybackClient.this;
            super();
        }

    }


    private static final boolean DEBUG = Log.isLoggable("RemotePlaybackClient", 3);
    private static final String TAG = "RemotePlaybackClient";
    private final Context mContext;
    private final PendingIntent mItemStatusPendingIntent;
    private final MediaRouter.RouteInfo mRoute;
    private boolean mRouteSupportsQueuing;
    private boolean mRouteSupportsRemotePlayback;
    private boolean mRouteSupportsSessionManagement;
    private String mSessionId;
    private final PendingIntent mSessionStatusPendingIntent;
    private StatusCallback mStatusCallback;
    private final StatusReceiver mStatusReceiver;

    public RemotePlaybackClient(Context context, MediaRouter.RouteInfo routeinfo)
    {
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        if (routeinfo == null)
        {
            throw new IllegalArgumentException("route must not be null");
        } else
        {
            mContext = context;
            mRoute = routeinfo;
            routeinfo = new IntentFilter();
            routeinfo.addAction("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED");
            routeinfo.addAction("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED");
            mStatusReceiver = new StatusReceiver();
            context.registerReceiver(mStatusReceiver, routeinfo);
            routeinfo = new Intent("android.support.v7.media.actions.ACTION_ITEM_STATUS_CHANGED");
            routeinfo.setPackage(context.getPackageName());
            mItemStatusPendingIntent = PendingIntent.getBroadcast(context, 0, routeinfo, 0);
            routeinfo = new Intent("android.support.v7.media.actions.ACTION_SESSION_STATUS_CHANGED");
            routeinfo.setPackage(context.getPackageName());
            mSessionStatusPendingIntent = PendingIntent.getBroadcast(context, 0, routeinfo, 0);
            detectFeatures();
            return;
        }
    }

    private void adoptSession(String s)
    {
        if (s != null)
        {
            setSessionId(s);
        }
    }

    private static String bundleToString(Bundle bundle)
    {
        if (bundle != null)
        {
            bundle.size();
            return bundle.toString();
        } else
        {
            return "null";
        }
    }

    private void detectFeatures()
    {
        boolean flag1 = true;
        boolean flag;
        if (routeSupportsAction("android.media.intent.action.PLAY") && routeSupportsAction("android.media.intent.action.SEEK") && routeSupportsAction("android.media.intent.action.GET_STATUS") && routeSupportsAction("android.media.intent.action.PAUSE") && routeSupportsAction("android.media.intent.action.RESUME") && routeSupportsAction("android.media.intent.action.STOP"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRouteSupportsRemotePlayback = flag;
        if (mRouteSupportsRemotePlayback && routeSupportsAction("android.media.intent.action.ENQUEUE") && routeSupportsAction("android.media.intent.action.REMOVE"))
        {
            flag = true;
        } else
        {
            flag = false;
        }
        mRouteSupportsQueuing = flag;
        if (mRouteSupportsRemotePlayback && routeSupportsAction("android.media.intent.action.START_SESSION") && routeSupportsAction("android.media.intent.action.GET_SESSION_STATUS") && routeSupportsAction("android.media.intent.action.END_SESSION"))
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        mRouteSupportsSessionManagement = flag;
    }

    private void handleError(Intent intent, ActionCallback actioncallback, String s, Bundle bundle)
    {
        int i;
        if (bundle != null)
        {
            i = bundle.getInt("android.media.intent.extra.ERROR_CODE", 0);
        } else
        {
            i = 0;
        }
        if (DEBUG)
        {
            Log.w("RemotePlaybackClient", (new StringBuilder()).append("Received error from ").append(intent.getAction()).append(": error=").append(s).append(", code=").append(i).append(", data=").append(bundleToString(bundle)).toString());
        }
        actioncallback.onError(s, i, bundle);
    }

    private void handleInvalidResult(Intent intent, ActionCallback actioncallback, Bundle bundle)
    {
        Log.w("RemotePlaybackClient", (new StringBuilder()).append("Received invalid result data from ").append(intent.getAction()).append(": data=").append(bundleToString(bundle)).toString());
        actioncallback.onError(null, 0, bundle);
    }

    private static String inferMissingResult(String s, String s1)
    {
        if (s1 == null)
        {
            return s;
        }
        if (s == null || s.equals(s1))
        {
            return s1;
        } else
        {
            return null;
        }
    }

    private static void logRequest(Intent intent)
    {
        if (DEBUG)
        {
            Log.d("RemotePlaybackClient", (new StringBuilder()).append("Sending request: ").append(intent).toString());
        }
    }

    private void performItemAction(final Intent intent, final String sessionId, final String itemId, Bundle bundle, final ItemActionCallback callback)
    {
        intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        if (sessionId != null)
        {
            intent.putExtra("android.media.intent.extra.SESSION_ID", sessionId);
        }
        if (itemId != null)
        {
            intent.putExtra("android.media.intent.extra.ITEM_ID", itemId);
        }
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        logRequest(intent);
        mRoute.sendControlRequest(intent, new MediaRouter.ControlRequestCallback() {

            final RemotePlaybackClient this$0;
            final ItemActionCallback val$callback;
            final Intent val$intent;
            final String val$itemId;
            final String val$sessionId;

            public void onError(String s, Bundle bundle1)
            {
                handleError(intent, callback, s, bundle1);
            }

            public void onResult(Bundle bundle1)
            {
                if (bundle1 != null)
                {
                    String s = RemotePlaybackClient.inferMissingResult(sessionId, bundle1.getString("android.media.intent.extra.SESSION_ID"));
                    MediaSessionStatus mediasessionstatus = MediaSessionStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.SESSION_STATUS"));
                    String s1 = RemotePlaybackClient.inferMissingResult(itemId, bundle1.getString("android.media.intent.extra.ITEM_ID"));
                    MediaItemStatus mediaitemstatus = MediaItemStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.ITEM_STATUS"));
                    adoptSession(s);
                    if (s != null && s1 != null && mediaitemstatus != null)
                    {
                        if (RemotePlaybackClient.DEBUG)
                        {
                            Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received result from ").append(intent.getAction()).append(": data=").append(RemotePlaybackClient.bundleToString(bundle1)).append(", sessionId=").append(s).append(", sessionStatus=").append(mediasessionstatus).append(", itemId=").append(s1).append(", itemStatus=").append(mediaitemstatus).toString());
                        }
                        callback.onResult(bundle1, s, mediasessionstatus, s1, mediaitemstatus);
                        return;
                    }
                }
                handleInvalidResult(intent, callback, bundle1);
            }

            
            {
                this$0 = RemotePlaybackClient.this;
                sessionId = s;
                itemId = s1;
                intent = intent1;
                callback = itemactioncallback;
                super();
            }
        });
    }

    private void performSessionAction(final Intent intent, final String sessionId, Bundle bundle, final SessionActionCallback callback)
    {
        intent.addCategory("android.media.intent.category.REMOTE_PLAYBACK");
        if (sessionId != null)
        {
            intent.putExtra("android.media.intent.extra.SESSION_ID", sessionId);
        }
        if (bundle != null)
        {
            intent.putExtras(bundle);
        }
        logRequest(intent);
        mRoute.sendControlRequest(intent, new MediaRouter.ControlRequestCallback() {

            final RemotePlaybackClient this$0;
            final SessionActionCallback val$callback;
            final Intent val$intent;
            final String val$sessionId;

            public void onError(String s, Bundle bundle1)
            {
                handleError(intent, callback, s, bundle1);
            }

            public void onResult(Bundle bundle1)
            {
                String s;
                MediaSessionStatus mediasessionstatus;
                if (bundle1 == null)
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                s = RemotePlaybackClient.inferMissingResult(sessionId, bundle1.getString("android.media.intent.extra.SESSION_ID"));
                mediasessionstatus = MediaSessionStatus.fromBundle(bundle1.getBundle("android.media.intent.extra.SESSION_STATUS"));
                adoptSession(s);
                if (s == null)
                {
                    break MISSING_BLOCK_LABEL_195;
                }
                if (RemotePlaybackClient.DEBUG)
                {
                    Log.d("RemotePlaybackClient", (new StringBuilder()).append("Received result from ").append(intent.getAction()).append(": data=").append(RemotePlaybackClient.bundleToString(bundle1)).append(", sessionId=").append(s).append(", sessionStatus=").append(mediasessionstatus).toString());
                }
                callback.onResult(bundle1, s, mediasessionstatus);
                if (intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(mSessionId))
                {
                    setSessionId(null);
                }
                return;
                bundle1;
                if (intent.getAction().equals("android.media.intent.action.END_SESSION") && s.equals(mSessionId))
                {
                    setSessionId(null);
                }
                throw bundle1;
                handleInvalidResult(intent, callback, bundle1);
                return;
            }

            
            {
                this$0 = RemotePlaybackClient.this;
                sessionId = s;
                intent = intent1;
                callback = sessionactioncallback;
                super();
            }
        });
    }

    private void playOrEnqueue(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback, 
            String s1)
    {
        if (uri == null)
        {
            throw new IllegalArgumentException("contentUri must not be null");
        }
        throwIfRemotePlaybackNotSupported();
        if (s1.equals("android.media.intent.action.ENQUEUE"))
        {
            throwIfQueuingNotSupported();
        }
        s1 = new Intent(s1);
        s1.setDataAndType(uri, s);
        s1.putExtra("android.media.intent.extra.ITEM_STATUS_UPDATE_RECEIVER", mItemStatusPendingIntent);
        if (bundle != null)
        {
            s1.putExtra("android.media.intent.extra.ITEM_METADATA", bundle);
        }
        if (l != 0L)
        {
            s1.putExtra("android.media.intent.extra.ITEM_POSITION", l);
        }
        performItemAction(s1, mSessionId, null, bundle1, itemactioncallback);
    }

    private boolean routeSupportsAction(String s)
    {
        return mRoute.supportsControlAction("android.media.intent.category.REMOTE_PLAYBACK", s);
    }

    private void throwIfNoCurrentSession()
    {
        if (mSessionId == null)
        {
            throw new IllegalStateException("There is no current session.");
        } else
        {
            return;
        }
    }

    private void throwIfQueuingNotSupported()
    {
        if (!mRouteSupportsQueuing)
        {
            throw new UnsupportedOperationException("The route does not support queuing.");
        } else
        {
            return;
        }
    }

    private void throwIfRemotePlaybackNotSupported()
    {
        if (!mRouteSupportsRemotePlayback)
        {
            throw new UnsupportedOperationException("The route does not support remote playback.");
        } else
        {
            return;
        }
    }

    private void throwIfSessionManagementNotSupported()
    {
        if (!mRouteSupportsSessionManagement)
        {
            throw new UnsupportedOperationException("The route does not support session management.");
        } else
        {
            return;
        }
    }

    public void endSession(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfSessionManagementNotSupported();
        throwIfNoCurrentSession();
        performSessionAction(new Intent("android.media.intent.action.END_SESSION"), mSessionId, bundle, sessionactioncallback);
    }

    public void enqueue(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback)
    {
        playOrEnqueue(uri, s, bundle, l, bundle1, itemactioncallback, "android.media.intent.action.ENQUEUE");
    }

    public String getSessionId()
    {
        return mSessionId;
    }

    public void getSessionStatus(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfSessionManagementNotSupported();
        throwIfNoCurrentSession();
        performSessionAction(new Intent("android.media.intent.action.GET_SESSION_STATUS"), mSessionId, bundle, sessionactioncallback);
    }

    public void getStatus(String s, Bundle bundle, ItemActionCallback itemactioncallback)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("itemId must not be null");
        } else
        {
            throwIfNoCurrentSession();
            performItemAction(new Intent("android.media.intent.action.GET_STATUS"), mSessionId, s, bundle, itemactioncallback);
            return;
        }
    }

    public boolean hasSession()
    {
        return mSessionId != null;
    }

    public boolean isQueuingSupported()
    {
        return mRouteSupportsQueuing;
    }

    public boolean isRemotePlaybackSupported()
    {
        return mRouteSupportsRemotePlayback;
    }

    public boolean isSessionManagementSupported()
    {
        return mRouteSupportsSessionManagement;
    }

    public void pause(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfNoCurrentSession();
        performSessionAction(new Intent("android.media.intent.action.PAUSE"), mSessionId, bundle, sessionactioncallback);
    }

    public void play(Uri uri, String s, Bundle bundle, long l, Bundle bundle1, ItemActionCallback itemactioncallback)
    {
        playOrEnqueue(uri, s, bundle, l, bundle1, itemactioncallback, "android.media.intent.action.PLAY");
    }

    public void release()
    {
        mContext.unregisterReceiver(mStatusReceiver);
    }

    public void remove(String s, Bundle bundle, ItemActionCallback itemactioncallback)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("itemId must not be null");
        } else
        {
            throwIfQueuingNotSupported();
            throwIfNoCurrentSession();
            performItemAction(new Intent("android.media.intent.action.REMOVE"), mSessionId, s, bundle, itemactioncallback);
            return;
        }
    }

    public void resume(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfNoCurrentSession();
        performSessionAction(new Intent("android.media.intent.action.RESUME"), mSessionId, bundle, sessionactioncallback);
    }

    public void seek(String s, long l, Bundle bundle, ItemActionCallback itemactioncallback)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("itemId must not be null");
        } else
        {
            throwIfNoCurrentSession();
            Intent intent = new Intent("android.media.intent.action.SEEK");
            intent.putExtra("android.media.intent.extra.ITEM_POSITION", l);
            performItemAction(intent, mSessionId, s, bundle, itemactioncallback);
            return;
        }
    }

    public void setSessionId(String s)
    {
        if (mSessionId != s && (mSessionId == null || !mSessionId.equals(s)))
        {
            if (DEBUG)
            {
                Log.d("RemotePlaybackClient", (new StringBuilder()).append("Session id is now: ").append(s).toString());
            }
            mSessionId = s;
            if (mStatusCallback != null)
            {
                mStatusCallback.onSessionChanged(s);
            }
        }
    }

    public void setStatusCallback(StatusCallback statuscallback)
    {
        mStatusCallback = statuscallback;
    }

    public void startSession(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfSessionManagementNotSupported();
        Intent intent = new Intent("android.media.intent.action.START_SESSION");
        intent.putExtra("android.media.intent.extra.SESSION_STATUS_UPDATE_RECEIVER", mSessionStatusPendingIntent);
        performSessionAction(intent, null, bundle, sessionactioncallback);
    }

    public void stop(Bundle bundle, SessionActionCallback sessionactioncallback)
    {
        throwIfNoCurrentSession();
        performSessionAction(new Intent("android.media.intent.action.STOP"), mSessionId, bundle, sessionactioncallback);
    }









}
