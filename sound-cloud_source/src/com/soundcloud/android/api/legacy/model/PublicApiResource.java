// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import com.soundcloud.android.api.legacy.model.behavior.Identifiable;
import com.soundcloud.android.api.legacy.model.behavior.Persisted;
import com.soundcloud.android.storage.provider.BulkInsertMap;
import java.util.List;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            ScModel, CollectionHolder

public abstract class PublicApiResource extends ScModel
    implements Identifiable, Persisted
{
    public static final class CacheUpdateMode extends Enum
    {

        private static final CacheUpdateMode $VALUES[];
        public static final CacheUpdateMode FULL;
        public static final CacheUpdateMode MINI;
        public static final CacheUpdateMode NONE;

        public static CacheUpdateMode valueOf(String s)
        {
            return (CacheUpdateMode)Enum.valueOf(com/soundcloud/android/api/legacy/model/PublicApiResource$CacheUpdateMode, s);
        }

        public static CacheUpdateMode[] values()
        {
            return (CacheUpdateMode[])$VALUES.clone();
        }

        public final boolean shouldUpdate()
        {
            return this != NONE;
        }

        static 
        {
            NONE = new CacheUpdateMode("NONE", 0);
            MINI = new CacheUpdateMode("MINI", 1);
            FULL = new CacheUpdateMode("FULL", 2);
            $VALUES = (new CacheUpdateMode[] {
                NONE, MINI, FULL
            });
        }

        private CacheUpdateMode(String s, int i)
        {
            super(s, i);
        }
    }

    public static class ResourceHolder extends CollectionHolder
    {

        public ResourceHolder()
        {
        }

        public ResourceHolder(List list)
        {
            super(list);
        }

        public ResourceHolder(List list, String s)
        {
            super(list, s);
        }
    }


    public long last_updated;

    public PublicApiResource()
    {
        last_updated = -1L;
    }

    public PublicApiResource(long l)
    {
        super(l);
        last_updated = -1L;
    }

    public PublicApiResource(String s)
    {
        super(s);
        last_updated = -1L;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof PublicApiResource))
            {
                return false;
            }
            obj = (PublicApiResource)obj;
            if (getId() != ((PublicApiResource) (obj)).getId())
            {
                return false;
            }
        }
        return true;
    }

    public int hashCode()
    {
        return (int)(getId() ^ getId() >>> 32);
    }

    public boolean isSaved()
    {
        return getId() > -1L;
    }

    public void putDependencyValues(BulkInsertMap bulkinsertmap)
    {
    }

    public void putFullContentValues(BulkInsertMap bulkinsertmap)
    {
        putDependencyValues(bulkinsertmap);
        bulkinsertmap.add(getBulkInsertUri(), buildContentValues());
    }

    public void setUpdated()
    {
        last_updated = System.currentTimeMillis();
    }
}
