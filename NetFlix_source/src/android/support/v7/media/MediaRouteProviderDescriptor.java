// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.media;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package android.support.v7.media:
//            MediaRouteDescriptor

public final class MediaRouteProviderDescriptor
{
    public static final class Builder
    {

        private final Bundle mBundle;
        private ArrayList mRoutes;

        public Builder addRoute(MediaRouteDescriptor mediaroutedescriptor)
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

        public Builder addRoutes(Collection collection)
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
            return new MediaRouteProviderDescriptor(mBundle, mRoutes);
        }

        public Builder()
        {
            mBundle = new Bundle();
        }

        public Builder(MediaRouteProviderDescriptor mediarouteproviderdescriptor)
        {
            if (mediarouteproviderdescriptor == null)
            {
                throw new IllegalArgumentException("descriptor must not be null");
            }
            mBundle = new Bundle(mediarouteproviderdescriptor.mBundle);
            mediarouteproviderdescriptor.ensureRoutes();
            if (!mediarouteproviderdescriptor.mRoutes.isEmpty())
            {
                mRoutes = new ArrayList(mediarouteproviderdescriptor.mRoutes);
            }
        }
    }


    private static final String KEY_ROUTES = "routes";
    private final Bundle mBundle;
    private List mRoutes;

    private MediaRouteProviderDescriptor(Bundle bundle, List list)
    {
        mBundle = bundle;
        mRoutes = list;
    }


    private void ensureRoutes()
    {
        if (mRoutes == null)
        {
            ArrayList arraylist = mBundle.getParcelableArrayList("routes");
            if (arraylist == null || arraylist.isEmpty())
            {
                mRoutes = Collections.emptyList();
            } else
            {
                int j = arraylist.size();
                mRoutes = new ArrayList(j);
                int i = 0;
                while (i < j) 
                {
                    mRoutes.add(MediaRouteDescriptor.fromBundle((Bundle)arraylist.get(i)));
                    i++;
                }
            }
        }
    }

    public static MediaRouteProviderDescriptor fromBundle(Bundle bundle)
    {
        if (bundle != null)
        {
            return new MediaRouteProviderDescriptor(bundle, null);
        } else
        {
            return null;
        }
    }

    public Bundle asBundle()
    {
        return mBundle;
    }

    public List getRoutes()
    {
        ensureRoutes();
        return mRoutes;
    }

    public boolean isValid()
    {
        ensureRoutes();
        int j = mRoutes.size();
        for (int i = 0; i < j; i++)
        {
            MediaRouteDescriptor mediaroutedescriptor = (MediaRouteDescriptor)mRoutes.get(i);
            if (mediaroutedescriptor == null || !mediaroutedescriptor.isValid())
            {
                return false;
            }
        }

        return true;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("MediaRouteProviderDescriptor{ ");
        stringbuilder.append("routes=").append(Arrays.toString(getRoutes().toArray()));
        stringbuilder.append(", isValid=").append(isValid());
        stringbuilder.append(" }");
        return stringbuilder.toString();
    }



}
