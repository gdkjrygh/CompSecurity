// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.android.api.legacy.model.CollectionHolder;
import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.android.api.model.ModelCollection;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import rx.b.f;

final class Holder
    implements f
{

    public final ModelCollection call(CollectionHolder collectionholder)
    {
        ArrayList arraylist = new ArrayList(collectionholder.size());
        for (Iterator iterator = collectionholder.iterator(); iterator.hasNext(); arraylist.add(((PublicApiUser)iterator.next()).toApiMobileUser())) { }
        return new ModelCollection(arraylist, collectionholder.getNextHref());
    }

    public final volatile Object call(Object obj)
    {
        return call((CollectionHolder)obj);
    }

    Holder()
    {
    }
}
