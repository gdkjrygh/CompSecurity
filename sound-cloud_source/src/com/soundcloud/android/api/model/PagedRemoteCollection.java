// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.java.optional.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.model:
//            ModelCollection, Link

public class PagedRemoteCollection
    implements Iterable
{

    private final List items;
    private final Optional nextPage;

    public PagedRemoteCollection(ModelCollection modelcollection)
    {
        List list = modelcollection.getCollection();
        if (modelcollection.getNextLink().isPresent())
        {
            modelcollection = ((Link)modelcollection.getNextLink().get()).getHref();
        } else
        {
            modelcollection = null;
        }
        this(list, ((String) (modelcollection)));
    }

    public PagedRemoteCollection(List list, String s)
    {
        nextPage = Optional.fromNullable(s);
        items = new ArrayList(list.size());
        for (list = list.iterator(); list.hasNext(); items.add(s.toPropertySet()))
        {
            s = (PropertySetSource)list.next();
        }

    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PagedRemoteCollection))
            {
                return false;
            }
            obj = (PagedRemoteCollection)obj;
            if (!items.equals(((PagedRemoteCollection) (obj)).items) || !nextPage.equals(((PagedRemoteCollection) (obj)).nextPage))
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return nextPage.hashCode() * 31 + items.hashCode();
    }

    public Iterator iterator()
    {
        return items.iterator();
    }

    public Optional nextPageLink()
    {
        return nextPage;
    }
}
