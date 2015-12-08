// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.storage.provider;

import android.content.ContentResolver;
import android.content.ContentValues;
import android.net.Uri;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class BulkInsertMap extends HashMap
{
    public class ResourceValues
    {

        ContentValues contentValues;
        final BulkInsertMap this$0;

        public boolean equals(Object obj)
        {
            if (this != obj)
            {
                if (obj == null || getClass() != obj.getClass())
                {
                    return false;
                }
                obj = (ResourceValues)obj;
                if (contentValues != null ? !contentValues.containsKey("_id") || !((ResourceValues) (obj)).contentValues.containsKey("_id") || contentValues.get("_id") != ((ResourceValues) (obj)).contentValues.get("_id") : ((ResourceValues) (obj)).contentValues != null)
                {
                    return false;
                }
            }
            return true;
        }

        public int hashCode()
        {
            if (contentValues != null)
            {
                if (contentValues.containsKey("_id"))
                {
                    return contentValues.getAsLong("_id").hashCode();
                } else
                {
                    return contentValues.hashCode();
                }
            } else
            {
                return 0;
            }
        }

        private ResourceValues(ContentValues contentvalues)
        {
            this$0 = BulkInsertMap.this;
            super();
            contentValues = contentvalues;
        }

        ResourceValues(ContentValues contentvalues, _cls1 _pcls1)
        {
            this(contentvalues);
        }
    }


    public BulkInsertMap()
    {
    }

    public void add(Uri uri, ContentValues contentvalues)
    {
        if (!containsKey(uri))
        {
            put(uri, new LinkedHashSet());
        }
        ((Set)get(uri)).add(new ResourceValues(contentvalues, null));
    }

    public int insert(ContentResolver contentresolver)
    {
        Iterator iterator = entrySet().iterator();
        java.util.Map.Entry entry;
        ContentValues acontentvalues[];
        int i;
        for (i = 0; iterator.hasNext(); i = contentresolver.bulkInsert((Uri)entry.getKey(), acontentvalues) + i)
        {
            entry = (java.util.Map.Entry)iterator.next();
            acontentvalues = new ContentValues[((Set)entry.getValue()).size()];
            Iterator iterator1 = ((Set)entry.getValue()).iterator();
            for (int j = 0; iterator1.hasNext(); j++)
            {
                acontentvalues[j] = ((ResourceValues)iterator1.next()).contentValues;
            }

        }

        return i;
    }
}
