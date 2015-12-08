// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.search;

import com.soundcloud.android.api.model.Link;
import com.soundcloud.android.model.PropertySetSource;
import com.soundcloud.android.utils.ErrorUtils;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class SearchResult
    implements Iterable
{

    private final List items;
    final Optional nextHref;
    final Optional queryUrn;

    SearchResult(List list, Optional optional, Optional optional1)
    {
        items = new ArrayList(list.size());
        Iterator iterator1 = list.iterator();
        int i = 0;
        while (iterator1.hasNext()) 
        {
            PropertySetSource propertysetsource = (PropertySetSource)iterator1.next();
            if (propertysetsource == null)
            {
                i++;
            } else
            {
                items.add(propertysetsource.toPropertySet());
            }
        }
        nextHref = optional;
        queryUrn = optional1;
        if (i > 0)
        {
            ErrorUtils.handleSilentException(getMissingItemException(list, optional, i));
        }
    }

    private IllegalStateException getMissingItemException(List list, Optional optional, int i)
    {
        int j = list.size();
        if (optional != null && optional.isPresent())
        {
            list = ((Link)optional.get()).getHref();
        } else
        {
            list = "none";
        }
        return new IllegalStateException(String.format("%d/%d empty items in search result with nextHref %s", new Object[] {
            Integer.valueOf(i), Integer.valueOf(j), list
        }));
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof SearchResult))
            {
                return false;
            }
            obj = (SearchResult)obj;
            if (!MoreObjects.equal(items, ((SearchResult) (obj)).items) || !MoreObjects.equal(nextHref, ((SearchResult) (obj)).nextHref) || !MoreObjects.equal(queryUrn, ((SearchResult) (obj)).queryUrn))
            {
                return false;
            }
        }
        return true;
    }

    public List getItems()
    {
        return items;
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            items, nextHref, queryUrn
        });
    }

    public Iterator iterator()
    {
        return items.iterator();
    }
}
