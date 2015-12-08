// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.model;

import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.strings.Strings;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

// Referenced classes of package com.soundcloud.android.api.model:
//            Link

public class ModelCollection
    implements Iterable
{

    public static final String NEXT_LINK_REL = "next";
    private List collection;
    private Map links;

    public ModelCollection()
    {
        collection = Collections.emptyList();
        links = Collections.emptyMap();
    }

    public ModelCollection(List list)
    {
        collection = Collections.emptyList();
        links = Collections.emptyMap();
        collection = list;
    }

    public ModelCollection(List list, String s)
    {
        this(list);
        if (Strings.isNotBlank(s))
        {
            links = Collections.singletonMap("next", new Link(s));
        }
    }

    public ModelCollection(List list, Map map)
    {
        this(list);
        links = map;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof ModelCollection))
            {
                return false;
            }
            obj = (ModelCollection)obj;
            if (!MoreObjects.equal(collection, ((ModelCollection) (obj)).collection) || !MoreObjects.equal(links, ((ModelCollection) (obj)).links))
            {
                return false;
            }
        }
        return true;
    }

    public List getCollection()
    {
        return collection;
    }

    public Map getLinks()
    {
        return links;
    }

    public Optional getNextLink()
    {
        return Optional.fromNullable(links.get("next"));
    }

    public int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            collection, links
        });
    }

    public Iterator iterator()
    {
        return collection.iterator();
    }

    public void setCollection(List list)
    {
        collection = list;
    }

    public void setLinks(Map map)
    {
        links = map;
    }
}
