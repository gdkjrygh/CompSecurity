// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouter, MediaRouteProvider, MediaRouteProviderDescriptor

public static final class adata
{

    private MediaRouteProviderDescriptor mDescriptor;
    private final erMetadata mMetadata;
    private final MediaRouteProvider mProviderInstance;
    private Resources mResources;
    private boolean mResourcesNotAvailable;
    private final ArrayList mRoutes = new ArrayList();

    int findRouteByDescriptorId(String s)
    {
        int j = mRoutes.size();
        for (int i = 0; i < j; i++)
        {
            if (ess._mth000((ess._cls000)mRoutes.get(i)).equals(s))
            {
                return i;
            }
        }

        return -1;
    }

    public ComponentName getComponentName()
    {
        return mMetadata.getComponentName();
    }

    public String getPackageName()
    {
        return mMetadata.getPackageName();
    }

    public MediaRouteProvider getProviderInstance()
    {
        MediaRouter.checkCallingThread();
        return mProviderInstance;
    }

    Resources getResources()
    {
        if (mResources == null && !mResourcesNotAvailable)
        {
            String s = getPackageName();
            Context context = MediaRouter.sGlobal.getProviderContext(s);
            if (context != null)
            {
                mResources = context.getResources();
            } else
            {
                Log.w("MediaRouter", (new StringBuilder()).append("Unable to obtain resources for route provider package: ").append(s).toString());
                mResourcesNotAvailable = true;
            }
        }
        return mResources;
    }

    public List getRoutes()
    {
        MediaRouter.checkCallingThread();
        return mRoutes;
    }

    public String toString()
    {
        return (new StringBuilder()).append("MediaRouter.RouteProviderInfo{ packageName=").append(getPackageName()).append(" }").toString();
    }

    boolean updateDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
    {
        if (mDescriptor != mediarouteproviderdescriptor)
        {
            mDescriptor = mediarouteproviderdescriptor;
            return true;
        } else
        {
            return false;
        }
    }



    tor(MediaRouteProvider mediarouteprovider)
    {
        mProviderInstance = mediarouteprovider;
        mMetadata = mediarouteprovider.getMetadata();
    }
}
