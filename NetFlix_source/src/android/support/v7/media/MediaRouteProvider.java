// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;

// Referenced classes of package android.support.v7.media:
//            MediaRouter, MediaRouteDiscoveryRequest, MediaRouteProviderDescriptor

public abstract class MediaRouteProvider
{
    public static abstract class Callback
    {

        public void onDescriptorChanged(MediaRouteProvider mediarouteprovider, MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
        }

        public Callback()
        {
        }
    }

    private final class ProviderHandler extends Handler
    {

        final MediaRouteProvider this$0;

        public void handleMessage(Message message)
        {
            switch (message.what)
            {
            default:
                return;

            case 1: // '\001'
                deliverDescriptorChanged();
                return;

            case 2: // '\002'
                deliverDiscoveryRequestChanged();
                break;
            }
        }

        private ProviderHandler()
        {
            this$0 = MediaRouteProvider.this;
            super();
        }

    }

    public static final class ProviderMetadata
    {

        private final ComponentName mComponentName;

        public ComponentName getComponentName()
        {
            return mComponentName;
        }

        public String getPackageName()
        {
            return mComponentName.getPackageName();
        }

        public String toString()
        {
            return (new StringBuilder()).append("ProviderMetadata{ componentName=").append(mComponentName.flattenToShortString()).append(" }").toString();
        }

        ProviderMetadata(ComponentName componentname)
        {
            if (componentname == null)
            {
                throw new IllegalArgumentException("componentName must not be null");
            } else
            {
                mComponentName = componentname;
                return;
            }
        }
    }

    public static abstract class RouteController
    {

        public boolean onControlRequest(Intent intent, MediaRouter.ControlRequestCallback controlrequestcallback)
        {
            return false;
        }

        public void onRelease()
        {
        }

        public void onSelect()
        {
        }

        public void onSetVolume(int i)
        {
        }

        public void onUnselect()
        {
        }

        public void onUpdateVolume(int i)
        {
        }

        public RouteController()
        {
        }
    }


    private static final int MSG_DELIVER_DESCRIPTOR_CHANGED = 1;
    private static final int MSG_DELIVER_DISCOVERY_REQUEST_CHANGED = 2;
    private Callback mCallback;
    private final Context mContext;
    private MediaRouteProviderDescriptor mDescriptor;
    private MediaRouteDiscoveryRequest mDiscoveryRequest;
    private final ProviderHandler mHandler;
    private final ProviderMetadata mMetadata;
    private boolean mPendingDescriptorChange;
    private boolean mPendingDiscoveryRequestChange;

    public MediaRouteProvider(Context context)
    {
        this(context, null);
    }

    MediaRouteProvider(Context context, ProviderMetadata providermetadata)
    {
        mHandler = new ProviderHandler();
        if (context == null)
        {
            throw new IllegalArgumentException("context must not be null");
        }
        mContext = context;
        if (providermetadata == null)
        {
            mMetadata = new ProviderMetadata(new ComponentName(context, getClass()));
            return;
        } else
        {
            mMetadata = providermetadata;
            return;
        }
    }

    private void deliverDescriptorChanged()
    {
        mPendingDescriptorChange = false;
        if (mCallback != null)
        {
            mCallback.onDescriptorChanged(this, mDescriptor);
        }
    }

    private void deliverDiscoveryRequestChanged()
    {
        mPendingDiscoveryRequestChange = false;
        onDiscoveryRequestChanged(mDiscoveryRequest);
    }

    public final Context getContext()
    {
        return mContext;
    }

    public final MediaRouteProviderDescriptor getDescriptor()
    {
        return mDescriptor;
    }

    public final MediaRouteDiscoveryRequest getDiscoveryRequest()
    {
        return mDiscoveryRequest;
    }

    public final Handler getHandler()
    {
        return mHandler;
    }

    public final ProviderMetadata getMetadata()
    {
        return mMetadata;
    }

    public RouteController onCreateRouteController(String s)
    {
        return null;
    }

    public void onDiscoveryRequestChanged(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
    {
    }

    public final void setCallback(Callback callback)
    {
        MediaRouter.checkCallingThread();
        mCallback = callback;
    }

    public final void setDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
    {
        MediaRouter.checkCallingThread();
        if (mDescriptor != mediarouteproviderdescriptor)
        {
            mDescriptor = mediarouteproviderdescriptor;
            if (!mPendingDescriptorChange)
            {
                mPendingDescriptorChange = true;
                mHandler.sendEmptyMessage(1);
            }
        }
    }

    public final void setDiscoveryRequest(MediaRouteDiscoveryRequest mediaroutediscoveryrequest)
    {
        MediaRouter.checkCallingThread();
        if (mDiscoveryRequest != mediaroutediscoveryrequest && (mDiscoveryRequest == null || !mDiscoveryRequest.equals(mediaroutediscoveryrequest)))
        {
            mDiscoveryRequest = mediaroutediscoveryrequest;
            if (!mPendingDiscoveryRequestChange)
            {
                mPendingDiscoveryRequestChange = true;
                mHandler.sendEmptyMessage(2);
                return;
            }
        }
    }


}
