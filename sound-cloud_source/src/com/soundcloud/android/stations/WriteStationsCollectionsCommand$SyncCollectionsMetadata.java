// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.java.objects.MoreObjects;

// Referenced classes of package com.soundcloud.android.stations:
//            WriteStationsCollectionsCommand, ApiStationsCollections

static final class stationsCollections
{

    private final long clearBeforeTime;
    private final ApiStationsCollections stationsCollections;

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (stationsCollections)obj;
            if (!MoreObjects.equal(Long.valueOf(clearBeforeTime), Long.valueOf(((clearBeforeTime) (obj)).clearBeforeTime)) || !MoreObjects.equal(stationsCollections, ((stationsCollections) (obj)).stationsCollections))
            {
                return false;
            }
        }
        return true;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            Long.valueOf(clearBeforeTime), stationsCollections
        });
    }



    public (long l, ApiStationsCollections apistationscollections)
    {
        clearBeforeTime = l;
        stationsCollections = apistationscollections;
    }
}
