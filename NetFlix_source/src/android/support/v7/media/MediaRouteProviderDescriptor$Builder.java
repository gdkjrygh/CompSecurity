// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouteProviderDescriptor, MediaRouteDescriptor

public static final class _cls00
{

    private final Bundle mBundle;
    private ArrayList mRoutes;

    public _cls00 addRoute(MediaRouteDescriptor mediaroutedescriptor)
    {
        if (mediaroutedescriptor == null)
        {
            throw new IllegalArgumentException("route must not be null");
        }
        if (mRoutes == null)
        {
            mRoutes = new ArrayList();
        } else
        if (mRoutes.contains(mediaroutedescriptor))
        {
            throw new IllegalArgumentException("route descriptor already added");
        }
        mRoutes.add(mediaroutedescriptor);
        return this;
    }

    public mRoutes addRoutes(Collection collection)
    {
        if (collection == null)
        {
            throw new IllegalArgumentException("routes must not be null");
        }
        if (!collection.isEmpty())
        {
            for (collection = collection.iterator(); collection.hasNext(); addRoute((MediaRouteDescriptor)collection.next())) { }
        }
        return this;
    }

    public MediaRouteProviderDescriptor build()
    {
        if (mRoutes != null)
        {
            int j = mRoutes.size();
            ArrayList arraylist = new ArrayList(j);
            for (int i = 0; i < j; i++)
            {
                arraylist.add(((MediaRouteDescriptor)mRoutes.get(i)).asBundle());
            }

            mBundle.putParcelableArrayList("routes", arraylist);
        }
        return new MediaRouteProviderDescriptor(mBundle, mRoutes, null);
    }

    public ()
    {
        mBundle = new Bundle();
    }

    public mBundle(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
    {
        if (mediarouteproviderdescriptor == null)
        {
            throw new IllegalArgumentException("descriptor must not be null");
        }
        mBundle = new Bundle(MediaRouteProviderDescriptor.access$000(mediarouteproviderdescriptor));
        MediaRouteProviderDescriptor.access$100(mediarouteproviderdescriptor);
        if (!MediaRouteProviderDescriptor.access$200(mediarouteproviderdescriptor).isEmpty())
        {
            mRoutes = new ArrayList(MediaRouteProviderDescriptor.access$200(mediarouteproviderdescriptor));
        }
    }
}
