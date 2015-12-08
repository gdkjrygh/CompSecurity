// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.Context;
import java.lang.ref.WeakReference;

// Referenced classes of package android.support.v7.media:
//            RemoteControlClientCompat, MediaRouterJellybean

static class mUserRouteCategoryObj extends RemoteControlClientCompat
{
    private static final class VolumeCallbackWrapper
        implements MediaRouterJellybean.VolumeCallback
    {

        private final WeakReference mImplWeak;

        public void onVolumeSetRequest(Object obj, int i)
        {
            obj = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
            if (obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
            {
                ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeSetRequest(i);
            }
        }

        public void onVolumeUpdateRequest(Object obj, int i)
        {
            obj = (RemoteControlClientCompat.JellybeanImpl)mImplWeak.get();
            if (obj != null && ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback != null)
            {
                ((RemoteControlClientCompat.JellybeanImpl) (obj)).mVolumeCallback.onVolumeUpdateRequest(i);
            }
        }

        public VolumeCallbackWrapper(RemoteControlClientCompat.JellybeanImpl jellybeanimpl)
        {
            mImplWeak = new WeakReference(jellybeanimpl);
        }
    }


    private boolean mRegistered;
    private final Object mRouterObj;
    private final Object mUserRouteCategoryObj;
    private final Object mUserRouteObj;

    public void setPlaybackInfo(.onVolumeUpdateRequest onvolumeupdaterequest)
    {
        lume(mUserRouteObj, onvolumeupdaterequest.olume);
        lumeMax(mUserRouteObj, onvolumeupdaterequest.olumeMax);
        lumeHandling(mUserRouteObj, onvolumeupdaterequest.olumeHandling);
        aybackStream(mUserRouteObj, onvolumeupdaterequest.laybackStream);
        aybackType(mUserRouteObj, onvolumeupdaterequest.laybackType);
        if (!mRegistered)
        {
            mRegistered = true;
            lumeCallback(mUserRouteObj, MediaRouterJellybean.createVolumeCallback(new VolumeCallbackWrapper(this)));
            moteControlClient(mUserRouteObj, mRcc);
        }
    }

    public VolumeCallbackWrapper.mImplWeak(Context context, Object obj)
    {
        super(context, obj);
        mRouterObj = MediaRouterJellybean.getMediaRouter(context);
        mUserRouteCategoryObj = MediaRouterJellybean.createRouteCategory(mRouterObj, "", false);
        mUserRouteObj = MediaRouterJellybean.createUserRoute(mRouterObj, mUserRouteCategoryObj);
    }
}
