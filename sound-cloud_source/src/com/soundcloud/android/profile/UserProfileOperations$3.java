// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.model.PagedRemoteCollection;
import com.soundcloud.android.model.PostProperty;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;
import java.util.Iterator;
import rx.b.g;

final class 
    implements g
{

    public final PagedRemoteCollection call(PagedRemoteCollection pagedremotecollection, PropertySet propertyset)
    {
        Iterator iterator = pagedremotecollection.iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            PropertySet propertyset1 = (PropertySet)iterator.next();
            if (((Boolean)propertyset1.getOrElse(PostProperty.IS_REPOST, Boolean.valueOf(false))).booleanValue())
            {
                propertyset1.put(PostProperty.REPOSTER, propertyset.get(UserProperty.USERNAME));
                propertyset1.put(PostProperty.REPOSTER_URN, propertyset.get(UserProperty.URN));
            }
        } while (true);
        return pagedremotecollection;
    }

    public final volatile Object call(Object obj, Object obj1)
    {
        return call((PagedRemoteCollection)obj, (PropertySet)obj1);
    }

    ()
    {
    }
}
