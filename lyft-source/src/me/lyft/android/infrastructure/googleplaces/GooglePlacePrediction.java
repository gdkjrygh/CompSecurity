// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import me.lyft.android.common.Strings;

// Referenced classes of package me.lyft.android.infrastructure.googleplaces:
//            GooglePlaceType

public class GooglePlacePrediction
{

    private final String description;
    private final String placeId;
    private final GooglePlaceType placeType;

    public GooglePlacePrediction(String s, String s1, GooglePlaceType googleplacetype)
    {
        placeId = s;
        description = s1;
        placeType = googleplacetype;
    }

    public String getDescription()
    {
        return description;
    }

    public String getName()
    {
        if (Strings.isNullOrEmpty(description))
        {
            return "";
        }
        int i = description.indexOf(',');
        if (i != -1)
        {
            return description.substring(0, i);
        } else
        {
            return description;
        }
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public GooglePlaceType getPlaceType()
    {
        return placeType;
    }
}
