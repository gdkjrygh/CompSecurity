// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            MediaRouterJellybean

abstract class RemoteControlClientCompat
{
    static class JellybeanImpl extends RemoteControlClientCompat
    {

        private boolean mRegistered;
        private final Object mRouterObj;
        private final Object mUserRouteCategoryObj;
        private final Object mUserRouteObj;

        public void setPlaybackInfo(PlaybackInfo playbackinfo)
        {
            MediaRouterJellybean.UserRouteInfo.setVolume(mUserRouteObj, playbackinfo.volume);
            MediaRouterJellybean.UserRouteInfo.setVolumeMax(mUserRouteObj, playbackinfo.volumeMax);
            MediaRouterJellybean.UserRouteInfo.setVolumeHandling(mUserRouteObj, playbackinfo.volumeHandling);
            MediaRouterJellybean.UserRouteInfo.setPlaybackStream(mUserRouteObj, playbackinfo.playbackStream);
            MediaRouterJellybean.UserRouteInfo.setPlaybackType(mUserRouteObj, playbackinfo.playbackType);
            if (!mRegistered)
            {
                mRegistered = true;
                MediaRouterJellybean.UserRouteInfo.setVolumeCallback(mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
                MediaRouterJellybean.UserRouteInfo.setRemoteControlClient(mUserRouteObj, mRcc);
            }
        }

        public JellybeanImpl(Context context, Object obj)
        {
            super(context, obj);
            mRouterObj = MediaRouterJellybean.getMediaRouter(context);
            mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, "", false);
            mUserRouteObj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
        }
    }

    private static final class JellybeanImpl.VolumeCallbackWrapper
        implements MediaRouterJellybean.VolumeCallback
    {

        private final WeakReference mImplWeak;

        public void onVolumeSetRequest(Object obj, int i)
        {
            obj = (JellybeanImpl)mImplWeak.get();
            if (obj != null && ((JellybeanImpl) (obj)).mVolumeCallback != null)
            {
                ((JellybeanImpl) (obj)).mVolumeCallback.onVolumeSetRequest(i);
            }
        }

        public void onVolumeUpdateRequest(Object obj, int i)
        {
            obj = (JellybeanImpl)mImplWeak.get();
            if (obj != null && ((JellybeanImpl) (obj)).mVolumeCallback != null)
            {
                ((JellybeanImpl) (obj)).mVolumeCallback.onVolumeUpdateRequest(i);
            }
        }

        public JellybeanImpl.VolumeCallbackWrapper(JellybeanImpl jellybeanimpl)
        {
            mImplWeak = new WeakReference(jellybeanimpl);
        }
    }

    static class LegacyImpl extends RemoteControlClientCompat
    {

        public LegacyImpl(Context context, Object obj)
        {
            super(context, obj);
        }
    }

    public static final class PlaybackInfo
    {

        public int playbackStream;
        public int playbackType;
        public int volume;
        public int volumeHandling;
        public int volumeMax;

        public PlaybackInfo()
        {
            volumeHandling = 0;
            playbackStream = 3;
            playbackType = 1;
        }
    }

    public static interface VolumeCallback
    {

        public abstract void onVolumeSetRequest(int i);

        public abstract void onVolumeUpdateRequest(int i);
    }


    protected final Context mContext;
    protected final Object mRcc;
    protected VolumeCallback mVolumeCallback;

    protected RemoteControlClientCompat(Context context, Object obj)
    {
        mContext = context;
        mRcc = obj;
    }

    public static RemoteControlClientCompat obtain(Context context, Object obj)
    {
        if (android.os.Build.VERSION.SDK_INT >= 16)
        {
            return new JellybeanImpl(context, obj);
        } else
        {
            return new LegacyImpl(context, obj);
        }
    }

    public Object getRemoteControlClient()
    {
        return mRcc;
    }

    public void setPlaybackInfo(PlaybackInfo playbackinfo)
    {
    }

    public void setVolumeCallback(VolumeCallback volumecallback)
    {
        mVolumeCallback = volumecallback;
    }
}
