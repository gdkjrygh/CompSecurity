// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package twitter4j;

import java.io.Serializable;

// Referenced classes of package twitter4j:
//            TwitterResponse, GeoLocation

public interface Place
    extends TwitterResponse, Comparable, Serializable
{

    public abstract GeoLocation[][] getBoundingBoxCoordinates();

    public abstract String getBoundingBoxType();

    public abstract Place[] getContainedWithIn();

    public abstract String getCountry();

    public abstract String getCountryCode();

    public abstract String getFullName();

    public abstract GeoLocation[][] getGeometryCoordinates();

    public abstract String getGeometryType();

    public abstract String getId();

    public abstract String getName();

    public abstract String getPlaceType();

    public abstract String getStreetAddress();

    public abstract String getURL();
}
