// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.text.TextUtils;
import com.soundcloud.android.api.legacy.Request;
import com.soundcloud.java.collections.MoreCollections;
import com.soundcloud.java.functions.Predicate;
import java.net.URI;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URLEncodedUtils;

public class CollectionHolder
    implements Iterable
{

    private static final Predicate UNKNOWN_RESOURCE_PREDICATE = new _cls1();
    public List collection;
    public String next_href;

    public CollectionHolder()
    {
        this(Collections.emptyList());
    }

    public CollectionHolder(List list)
    {
        collection = new ArrayList(list);
    }

    public CollectionHolder(List list, String s)
    {
        this(list);
        next_href = s;
    }

    public boolean add(Object obj)
    {
        return collection.add(obj);
    }

    public Object get(int i)
    {
        return collection.get(i);
    }

    public List getCollection()
    {
        return Collections.unmodifiableList(collection);
    }

    public String getCursor()
    {
label0:
        {
            if (next_href == null)
            {
                break label0;
            }
            Iterator iterator1 = URLEncodedUtils.parse(URI.create(next_href), "UTF-8").iterator();
            NameValuePair namevaluepair;
            do
            {
                if (!iterator1.hasNext())
                {
                    break label0;
                }
                namevaluepair = (NameValuePair)iterator1.next();
            } while (!namevaluepair.getName().equalsIgnoreCase("cursor"));
            return namevaluepair.getValue();
        }
        return null;
    }

    public String getNextHref()
    {
        if (TextUtils.isEmpty(next_href))
        {
            return null;
        } else
        {
            return next_href;
        }
    }

    public Request getNextRequest()
    {
        if (!moreResourcesExist())
        {
            throw new IllegalStateException("next_href is null");
        } else
        {
            return new Request(URI.create(next_href));
        }
    }

    public boolean isEmpty()
    {
        return collection.isEmpty();
    }

    public Iterator iterator()
    {
        return collection.iterator();
    }

    public boolean moreResourcesExist()
    {
        return !TextUtils.isEmpty(next_href);
    }

    public void removeUnknownResources()
    {
        java.util.Collection collection1 = MoreCollections.filter(collection, UNKNOWN_RESOURCE_PREDICATE);
        collection.removeAll(collection1);
    }

    public int size()
    {
        if (collection != null)
        {
            return collection.size();
        } else
        {
            return 0;
        }
    }

    public String toString()
    {
        return (new StringBuilder()).append(getClass().getSimpleName()).append("{collection=").append(collection).append(", next_href='").append(next_href).append('\'').append('}').toString();
    }


    private class _cls1
        implements Predicate
    {

        public final boolean apply(Object obj)
        {
            return obj instanceof UnknownResource;
        }

        _cls1()
        {
        }
    }

}
