// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.infrastructure.googleplaces;

import java.util.List;
import me.lyft.android.domain.location.Location;
import rx.Observable;

public interface IGooglePlaceService
{

    public abstract Observable getCurrentPlaces();

    public abstract Observable getPlaceDetails(String s);

    public abstract Observable queryPlaces(String s, Location location);

    public abstract Observable queryPlaces(String s, Location location, List list);

    public abstract Observable reportPlace(String s, String s1);
}
