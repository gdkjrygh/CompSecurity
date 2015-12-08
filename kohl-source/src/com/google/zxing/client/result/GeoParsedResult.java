// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.result;


// Referenced classes of package com.google.zxing.client.result:
//            ParsedResult, ParsedResultType

public final class GeoParsedResult extends ParsedResult
{

    private final double altitude;
    private final double latitude;
    private final double longitude;
    private final String query;

    GeoParsedResult(double d, double d1, double d2, String s)
    {
        super(ParsedResultType.GEO);
        latitude = d;
        longitude = d1;
        altitude = d2;
        query = s;
    }

    public double getAltitude()
    {
        return altitude;
    }

    public String getDisplayResult()
    {
        StringBuilder stringbuilder = new StringBuilder(20);
        stringbuilder.append(latitude);
        stringbuilder.append(", ");
        stringbuilder.append(longitude);
        if (altitude > 0.0D)
        {
            stringbuilder.append(", ");
            stringbuilder.append(altitude);
            stringbuilder.append('m');
        }
        if (query != null)
        {
            stringbuilder.append(" (");
            stringbuilder.append(query);
            stringbuilder.append(')');
        }
        return stringbuilder.toString();
    }

    public String getGeoURI()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("geo:");
        stringbuilder.append(latitude);
        stringbuilder.append(',');
        stringbuilder.append(longitude);
        if (altitude > 0.0D)
        {
            stringbuilder.append(',');
            stringbuilder.append(altitude);
        }
        if (query != null)
        {
            stringbuilder.append('?');
            stringbuilder.append(query);
        }
        return stringbuilder.toString();
    }

    public double getLatitude()
    {
        return latitude;
    }

    public double getLongitude()
    {
        return longitude;
    }

    public String getQuery()
    {
        return query;
    }
}
