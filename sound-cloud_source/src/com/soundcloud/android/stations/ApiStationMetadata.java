// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;

public final class ApiStationMetadata
{

    private final String permalink;
    private final String title;
    private final String type;
    private final Urn urn;

    ApiStationMetadata(Urn urn1, String s, String s1, String s2)
    {
        urn = urn1;
        title = s;
        permalink = s1;
        type = s2;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            obj = (ApiStationMetadata)obj;
            return MoreObjects.equal(urn, ((ApiStationMetadata) (obj)).urn);
        }
    }

    public final long getId()
    {
        return urn.getNumericId();
    }

    public final String getPermalink()
    {
        return permalink;
    }

    public final String getTitle()
    {
        return title;
    }

    public final String getType()
    {
        return type;
    }

    public final Urn getUrn()
    {
        return urn;
    }

    public final int hashCode()
    {
        return urn.hashCode();
    }
}
