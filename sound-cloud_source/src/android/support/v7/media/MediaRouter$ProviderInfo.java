// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.content.ComponentName;
import android.content.Context;
import android.content.res.Resources;
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

    final int findRouteByDescriptorId(String s)
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

    public final ComponentName getComponentName()
    {
        return mMetadata.getComponentName();
    }

    public final String getPackageName()
    {
        return mMetadata.getPackageName();
    }

    public final MediaRouteProvider getProviderInstance()
    {
        MediaRouter.checkCallingThread();
        return mProviderInstance;
    }

    final Resources getResources()
    {
        if (mResources == null && !mResourcesNotAvailable)
        {
            Object obj = getPackageName();
            obj = MediaRouter.sGlobal.getProviderContext(((String) (obj)));
            if (obj != null)
            {
                mResources = ((Context) (obj)).getResources();
            } else
            {
                mResourcesNotAvailable = true;
            }
        }
        return mResources;
    }

    public final List getRoutes()
    {
        MediaRouter.checkCallingThread();
        return mRoutes;
    }

    public final String toString()
    {
        return (new StringBuilder("MediaRouter.RouteProviderInfo{ packageName=")).append(getPackageName()).append(" }").toString();
    }

    final boolean updateDescriptor(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
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
