// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.accuweather.android.services;

import com.accuweather.android.models.location.LocationSearch;
import com.accuweather.android.models.location.LocationSearchResult;
import java.io.IOException;

public interface ILocationService
{

    public abstract LocationSearch performAutocompleteSearch(String s, String s1)
        throws IOException;

    public abstract LocationSearch performCitySearch(String s, String s1)
        throws IOException;

    public abstract LocationSearchResult performCoordinatesSearch(double d, double d1, String s)
        throws IOException;

    public abstract LocationSearchResult performLocationKeySearch(String s, String s1)
        throws IOException;
}
