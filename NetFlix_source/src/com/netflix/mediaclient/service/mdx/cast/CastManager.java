// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.service.mdx.cast;

import android.content.Context;
import android.os.Handler;
import android.support.v7.media.MediaRouteSelector;
import android.support.v7.media.MediaRouter;
import android.widget.Toast;
import com.google.android.gms.cast.CastDevice;
import com.google.android.gms.cast.CastMediaControlIntent;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.configuration.CastConfiguration;
import com.netflix.mediaclient.util.StringUtils;
import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.netflix.mediaclient.service.mdx.cast:
//            MdxCastApplication

public class CastManager extends android.support.v7.media.MediaRouter.Callback
    implements MdxCastApplication.MdxCastApplicaCallback
{

    private static final String CAST_SERVICE_PREFIX = "CastMediaRouteProviderService:";
    static final String NETFLIX_NAMESPACE = "urn:x-cast:mdx-netflix-com:service:target:2";
    private static final String NF_APPID = "CA5E8412";
    private static final String TAG = com/netflix/mediaclient/service/mdx/cast/CastManager.getSimpleName();
    private String mApplicationId;
    private Context mContext;
    private boolean mForceLaunch;
    private List mListOfRoutes;
    private Handler mMainHandler;
    private MediaRouteSelector mMediaRouteSelector;
    private MediaRouter mMediaRouter;
    private String mMyUuid;
    private MdxCastApplication mSelectedMdxCastApp;
    private android.support.v7.media.MediaRouter.RouteInfo mSelectedRoute;
    private String mTargetId;
    private JSONArray mWhiteList;
    private Handler mWorkerHandler;

    public CastManager(Context context, Handler handler, Handler handler1, String s)
    {
        mApplicationId = "CA5E8412";
        mListOfRoutes = new ArrayList();
        if (s == null)
        {
            throw new IllegalArgumentException("ESN can not be null!");
        } else
        {
            mContext = context;
            mMainHandler = handler;
            mWorkerHandler = handler1;
            mMyUuid = s;
            nativeInit();
            return;
        }
    }

    private void castLaunchApplication(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (mSelectedMdxCastApp != null)
        {
            mSelectedMdxCastApp.stop();
        }
        routeinfo = CastDevice.getFromBundle(routeinfo.getExtras());
        mSelectedMdxCastApp = new MdxCastApplication(mContext, mApplicationId, routeinfo, this, mForceLaunch);
    }

    private String createCastHandShakeMessage(String s, String s1)
    {
        JSONObject jsonobject = new JSONObject();
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("createCastHandShakeMessage ").append(s).append(", ").append(s1).toString());
        }
        try
        {
            jsonobject.put("type", "castHandShake").put("uuid", s).put("friendlyName", s1).put("payload", "intent=sync");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "createCastHandShakeMessage failed, e");
            return null;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("createCastHandShakeMessage ").append(jsonobject.toString()).toString());
        }
        return jsonobject.toString();
    }

    private String createCastMessage(String s)
    {
        String s1 = findReqPath(s);
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("@").append(s1).append("createCastMessage ").append(s).toString());
        }
        if (StringUtils.isEmpty(s1))
        {
            return "";
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("path", s1).put("body", s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "createMessage failed");
            return null;
        }
        return jsonobject.toString();
    }

    private String findReqPath(String s)
    {
        int j = s.indexOf("action=");
        if (j >= 0)
        {
            int i = j + "action=".length();
            j = s.indexOf("\r\n", j);
            if (j > i)
            {
                return s.substring(i, j);
            }
        }
        return null;
    }

    private String getIpAddress(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        String s = CastDevice.getFromBundle(routeinfo.getExtras()).getIpAddress().getHostAddress();
        Object obj = null;
        routeinfo = obj;
        if (StringUtils.isNotEmpty(s))
        {
            int i = s.indexOf(".");
            routeinfo = obj;
            if (i > 0)
            {
                routeinfo = (new StringBuilder()).append("0").append(s.substring(i)).toString();
            }
        }
        if (StringUtils.isNotEmpty(routeinfo))
        {
            return (new StringBuilder()).append("cast://").append(routeinfo).toString();
        } else
        {
            return "cast://0.1.2.3";
        }
    }

    private String getUuid(String s)
    {
        return s.substring(s.indexOf("CastMediaRouteProviderService:") + "CastMediaRouteProviderService:".length());
    }

    private boolean isCastDeviceWhiteListed(CastDevice castdevice)
    {
        if (mWhiteList != null)
        {
            int i = 0;
            while (i < mWhiteList.length()) 
            {
                if (mWhiteList.opt(i) instanceof JSONObject)
                {
                    String s = ((JSONObject)mWhiteList.opt(i)).optString("modelName");
                    String s1 = castdevice.getModelName();
                    if (StringUtils.isNotEmpty(s) && s.equalsIgnoreCase(s1))
                    {
                        return true;
                    }
                }
                i++;
            }
        }
        return false;
    }

    private void logCastDevice(android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        routeinfo = CastDevice.getFromBundle(routeinfo.getExtras());
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("Id: ").append(routeinfo.getDeviceId()).toString());
            Log.d(TAG, (new StringBuilder()).append("Version: ").append(routeinfo.getDeviceVersion()).toString());
            Log.d(TAG, (new StringBuilder()).append("FriendlyName: ").append(routeinfo.getFriendlyName()).toString());
            Log.d(TAG, (new StringBuilder()).append("IpAddress: ").append(routeinfo.getIpAddress()).toString());
            Log.d(TAG, (new StringBuilder()).append("ModelName: ").append(routeinfo.getModelName()).toString());
            Log.d(TAG, (new StringBuilder()).append("ServicePort: ").append(routeinfo.getServicePort()).toString());
        }
    }

    private synchronized native void nativeDeviceFound(String s, String s1, String s2);

    private void nativeDeviceFoundWrapper(final String uuid, final String location, final String friendlyName)
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;
            final String val$friendlyName;
            final String val$location;
            final String val$uuid;

            public void run()
            {
                nativeDeviceFound(uuid, location, friendlyName);
            }

            
            {
                this$0 = CastManager.this;
                uuid = s;
                location = s1;
                friendlyName = s2;
                super();
            }
        });
    }

    private synchronized native void nativeDeviceLost(String s);

    private void nativeDeviceLostWrapper(final String uuid)
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;
            final String val$uuid;

            public void run()
            {
                nativeDeviceLost(uuid);
            }

            
            {
                this$0 = CastManager.this;
                uuid = s;
                super();
            }
        });
    }

    private synchronized native void nativeInit();

    private synchronized native void nativeLaunchResult(boolean flag, String s);

    private void nativeLaunchResultWrapper(final boolean success, final String uuid)
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;
            final boolean val$success;
            final String val$uuid;

            public void run()
            {
                nativeLaunchResult(success, uuid);
            }

            
            {
                this$0 = CastManager.this;
                success = flag;
                uuid = s;
                super();
            }
        });
    }

    private synchronized native void nativeMessageReceived(String s, String s1, String s2);

    private void nativeMessageReceivedWrapper(final String msg, final String uuid, final String reqUrl)
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;
            final String val$msg;
            final String val$reqUrl;
            final String val$uuid;

            public void run()
            {
                nativeMessageReceived(msg, uuid, reqUrl);
            }

            
            {
                this$0 = CastManager.this;
                msg = s;
                uuid = s1;
                reqUrl = s2;
                super();
            }
        });
    }

    private synchronized native void nativeRelease();

    private synchronized native void nativeSendMessageResult(boolean flag, String s);

    private void nativeSendMessageResultWrapper(final boolean success, final String uuid)
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;
            final boolean val$success;
            final String val$uuid;

            public void run()
            {
                nativeSendMessageResult(success, uuid);
            }

            
            {
                this$0 = CastManager.this;
                success = flag;
                uuid = s;
                super();
            }
        });
    }

    private void startDiscovery()
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("startDiscovery() AppId: ").append(mApplicationId).toString());
        }
        mListOfRoutes.clear();
        mMediaRouter.addCallback(mMediaRouteSelector, this, 1);
        mSelectedRoute = mMediaRouter.getSelectedRoute();
        if (mSelectedRoute != null && mSelectedRoute.matchesSelector(mMediaRouteSelector))
        {
            onRouteAdded(mMediaRouter, mSelectedRoute);
        }
    }

    private void stopDiscovery()
    {
        Log.d(TAG, "stopDiscovery");
        mSelectedRoute = null;
        mListOfRoutes.clear();
        if (mMediaRouter != null)
        {
            mMediaRouter.removeCallback(this);
        }
        Log.d(TAG, "stopDiscovery done");
    }

    public void destroy()
    {
        nativeRelease();
    }

    public void launchNetflix(final String id)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("launchNetflix ").append(id).toString());
        }
        mMainHandler.post(new Runnable() {

            final CastManager this$0;
            final String val$id;

            public void run()
            {
                mSelectedRoute = null;
                Iterator iterator = mListOfRoutes.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break;
                    }
                    android.support.v7.media.MediaRouter.RouteInfo routeinfo = (android.support.v7.media.MediaRouter.RouteInfo)iterator.next();
                    if (id.equalsIgnoreCase(getUuid(routeinfo.getId())))
                    {
                        mSelectedRoute = routeinfo;
                        mTargetId = id;
                    }
                } while (true);
                if (mSelectedRoute == null)
                {
                    return;
                }
                mForceLaunch = true;
                if (!mMediaRouter.getSelectedRoute().equals(mSelectedRoute))
                {
                    mMediaRouter.selectRoute(mSelectedRoute);
                    return;
                } else
                {
                    castLaunchApplication(mSelectedRoute);
                    return;
                }
            }

            
            {
                this$0 = CastManager.this;
                id = s;
                super();
            }
        });
    }

    public void onApplicationStopped()
    {
        if (mSelectedRoute != null)
        {
            final String id = getUuid(mSelectedRoute.getId());
            String s = (new StringBuilder()).append("action=endCastSession\r\nfromuuid=").append(getUuid(mSelectedRoute.getId())).append("\r\n").toString();
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("onMessageReceived @session, body:").append(s).toString());
            }
            nativeMessageReceivedWrapper(s, getUuid(mSelectedRoute.getId()), "session");
            mWorkerHandler.postDelayed(new Runnable() {

                final CastManager this$0;
                final String val$id;

                public void run()
                {
                    nativeLaunchResult(false, id);
                }

            
            {
                this$0 = CastManager.this;
                id = s;
                super();
            }
            }, 50L);
        }
    }

    public void onFailToConnect()
    {
        Log.d(TAG, "onFailToConnect");
        onApplicationStopped();
    }

    public void onFailToLaunch()
    {
        Log.d(TAG, "onFailToLaunch");
        if (mSelectedRoute != null)
        {
            nativeLaunchResultWrapper(false, getUuid(mSelectedRoute.getId()));
            return;
        } else
        {
            Log.d(TAG, "onFailToLaunch, no selected route");
            return;
        }
    }

    public void onFailToSendMessage()
    {
        Log.d(TAG, "onFailToSendMessage");
        if (mSelectedRoute != null)
        {
            nativeSendMessageResultWrapper(false, getUuid(mSelectedRoute.getId()));
            return;
        } else
        {
            Log.d(TAG, "onFailToSendMessage, no selected route");
            return;
        }
    }

    public void onLaunched()
    {
        Log.d(TAG, "onLaunched");
        if (mSelectedRoute != null)
        {
            sendCastMessage(createCastHandShakeMessage(getUuid(mSelectedRoute.getId()), mSelectedRoute.getName()));
            return;
        } else
        {
            Log.d(TAG, "onLaunched, no selected route");
            return;
        }
    }

    public void onMessageReceived(String s)
    {
        String s1;
        Object obj;
        try
        {
            obj = new JSONObject(s);
            s1 = ((JSONObject) (obj)).optString("body");
            s = ((JSONObject) (obj)).optString("url");
            if (s.indexOf("/") >= 0)
            {
                s = s.substring(s.lastIndexOf("/"));
            }
            obj = ((JSONObject) (obj)).optString("type");
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            Log.e(TAG, "error onMessageReceived ", s);
            return;
        }
        if (((String) (obj)).equals("castHandShakeAck"))
        {
            nativeLaunchResultWrapper(true, getUuid(mSelectedRoute.getId()));
            return;
        }
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onMessageReceived @").append(s).append(", body:").append(s1).toString());
        }
        if (mSelectedRoute != null)
        {
            nativeMessageReceivedWrapper(s1, getUuid(mSelectedRoute.getId()), s);
            return;
        } else
        {
            Log.d(TAG, "onMessageReceived, no selected route");
            return;
        }
    }

    public void onMessageSent()
    {
        Log.d(TAG, "onMessageSent");
        if (mSelectedRoute != null)
        {
            nativeSendMessageResultWrapper(true, getUuid(mSelectedRoute.getId()));
            return;
        } else
        {
            Log.d(TAG, "onMessageSent, no selected route");
            return;
        }
    }

    public void onProviderAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onProviderAdded ").append(mediarouter).append(", provider: ").append(providerinfo).toString());
        }
    }

    public void onProviderChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onProviderChanged ").append(mediarouter).append(", provider: ").append(providerinfo).toString());
        }
    }

    public void onProviderRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.ProviderInfo providerinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onProviderRemoved ").append(mediarouter).append(", provider: ").append(providerinfo).toString());
        }
    }

    public void onRouteAdded(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onRouteAdded ").append(routeinfo).toString());
            logCastDevice(routeinfo);
        }
        CastDevice castdevice = CastDevice.getFromBundle(routeinfo.getExtras());
        if (castdevice == null || !isCastDeviceWhiteListed(castdevice))
        {
            Log.d(TAG, "device is not whitelisted");
            return;
        }
        mListOfRoutes.add(routeinfo);
        if (mTargetId != null && mTargetId.equalsIgnoreCase(getUuid(routeinfo.getId())))
        {
            if (!mediarouter.getSelectedRoute().equals(routeinfo))
            {
                Log.d(TAG, "onRouteAdded, selectRoute ");
                mForceLaunch = false;
                mSelectedRoute = routeinfo;
                mMediaRouter.selectRoute(mSelectedRoute);
            } else
            {
                mSelectedRoute = routeinfo;
                castLaunchApplication(mSelectedRoute);
            }
        }
        nativeDeviceFoundWrapper(getUuid(routeinfo.getId()), getIpAddress(routeinfo), (new StringBuilder()).append("CAST:").append(routeinfo.getName()).toString());
    }

    public void onRouteChanged(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onRouteChanged ").append(routeinfo).toString());
        }
    }

    public void onRouteRemoved(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onRouteRemoved ").append(routeinfo).toString());
        }
        mListOfRoutes.remove(routeinfo);
        if (routeinfo != null)
        {
            nativeDeviceLostWrapper(getUuid(routeinfo.getId()));
        }
    }

    public void onRouteSelected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onRouteSelected ").append(routeinfo).toString());
        }
        if (!mMediaRouter.getSelectedRoute().equals(mSelectedRoute))
        {
            if (Log.isLoggable(TAG, 3))
            {
                Log.d(TAG, (new StringBuilder()).append("XXX: wrong route is selected, suppose to be").append(mSelectedRoute).toString());
            }
            return;
        } else
        {
            castLaunchApplication(mSelectedRoute);
            return;
        }
    }

    public void onRouteUnselected(MediaRouter mediarouter, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("onRouteUnselected ").append(routeinfo).toString());
        }
        mSelectedMdxCastApp = null;
        mSelectedRoute = null;
    }

    public void sendCastMessage(String s)
    {
        if (mSelectedMdxCastApp == null)
        {
            break MISSING_BLOCK_LABEL_15;
        }
        mSelectedMdxCastApp.sendMessage(s);
        return;
        s;
        Log.e(TAG, (new StringBuilder()).append("sendCastMessage caught an excpetion ").append(s).toString());
        return;
    }

    public void sendMessage(String s)
    {
        sendCastMessage(createCastMessage(s));
    }

    public void setCastWhiteList(JSONArray jsonarray)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("setCastWhiteList: ").append(jsonarray).toString());
        }
        mWhiteList = jsonarray;
    }

    public void setTargetId(String s)
    {
        if (Log.isLoggable(TAG, 3))
        {
            Log.d(TAG, (new StringBuilder()).append("setTargetId ").append(s).toString());
        }
        mTargetId = s;
    }

    public void start()
    {
        if (StringUtils.isNotEmpty(CastConfiguration.getNewCastApplicationId(mContext)))
        {
            mApplicationId = CastConfiguration.getNewCastApplicationId(mContext);
        }
        CastConfiguration.setCastApplicationId(mContext, mApplicationId);
        mMainHandler.post(new Runnable() {

            final CastManager this$0;

            public void run()
            {
                (new ArrayList()).add("urn:x-cast:mdx-netflix-com:service:target:2");
                mMediaRouter = MediaRouter.getInstance(mContext);
                try
                {
                    mMediaRouteSelector = (new android.support.v7.media.MediaRouteSelector.Builder()).addControlCategory(CastMediaControlIntent.categoryForCast(mApplicationId)).build();
                }
                catch (IllegalArgumentException illegalargumentexception)
                {
                    Log.e(CastManager.TAG, (new StringBuilder()).append("MediaRouteSelector: ").append(illegalargumentexception).toString());
                    CastConfiguration.setCastApplicationId(mContext, "==invalid ApplicationId==");
                    Toast.makeText(mContext, "Invalid ApplicationId, Enter New One", 1).show();
                    return;
                }
                startDiscovery();
            }

            
            {
                this$0 = CastManager.this;
                super();
            }
        });
    }

    public void stop()
    {
        mWorkerHandler.post(new Runnable() {

            final CastManager this$0;

            public void run()
            {
                Log.d(CastManager.TAG, "stop ApiClient");
                if (mSelectedMdxCastApp != null)
                {
                    mSelectedMdxCastApp.stop();
                    mSelectedMdxCastApp = null;
                }
                Log.d(CastManager.TAG, "stop ApiClient done");
            }

            
            {
                this$0 = CastManager.this;
                super();
            }
        });
        mMainHandler.post(new Runnable() {

            final CastManager this$0;

            public void run()
            {
                stopDiscovery();
            }

            
            {
                this$0 = CastManager.this;
                super();
            }
        });
    }




/*
    static MediaRouter access$002(CastManager castmanager, MediaRouter mediarouter)
    {
        castmanager.mMediaRouter = mediarouter;
        return mediarouter;
    }

*/




/*
    static String access$1102(CastManager castmanager, String s)
    {
        castmanager.mTargetId = s;
        return s;
    }

*/


/*
    static boolean access$1202(CastManager castmanager, boolean flag)
    {
        castmanager.mForceLaunch = flag;
        return flag;
    }

*/








/*
    static MediaRouteSelector access$202(CastManager castmanager, MediaRouteSelector mediarouteselector)
    {
        castmanager.mMediaRouteSelector = mediarouteselector;
        return mediarouteselector;
    }

*/






/*
    static MdxCastApplication access$602(CastManager castmanager, MdxCastApplication mdxcastapplication)
    {
        castmanager.mSelectedMdxCastApp = mdxcastapplication;
        return mdxcastapplication;
    }

*/




/*
    static android.support.v7.media.MediaRouter.RouteInfo access$802(CastManager castmanager, android.support.v7.media.MediaRouter.RouteInfo routeinfo)
    {
        castmanager.mSelectedRoute = routeinfo;
        return routeinfo;
    }

*/

}
