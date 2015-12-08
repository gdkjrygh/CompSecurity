// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.util.LinkedHashMap;
import java.util.Map;

// Referenced classes of package ezvcard.util:
//            GeoUri

public static class coordB
{

    private Double coordA;
    private Double coordB;
    private Double coordC;
    private String crs;
    private Map parameters;
    private Double uncertainty;

    public GeoUri build()
    {
        return new GeoUri(this, null);
    }

    public coordB coordA(Double double1)
    {
        double d;
        if (double1 == null)
        {
            d = 0.0D;
        } else
        {
            d = double1.doubleValue();
        }
        coordA = Double.valueOf(d);
        return this;
    }

    public coordA coordB(Double double1)
    {
        double d;
        if (double1 == null)
        {
            d = 0.0D;
        } else
        {
            d = double1.doubleValue();
        }
        coordB = Double.valueOf(d);
        return this;
    }

    public coordB coordC(Double double1)
    {
        coordC = double1;
        return this;
    }

    public coordC crs(String s)
    {
        if (s != null && !GeoUri.access$1300(s))
        {
            throw new IllegalArgumentException("CRS can only contain letters, numbers, and hypens.");
        } else
        {
            crs = s;
            return this;
        }
    }

    public crs parameter(String s, String s1)
    {
        if (!GeoUri.access$1300(s))
        {
            throw new IllegalArgumentException("Parameter names can only contain letters, numbers, and hyphens.");
        }
        if (s1 == null)
        {
            parameters.remove(s);
            return this;
        } else
        {
            parameters.put(s, s1);
            return this;
        }
    }

    public parameters uncertainty(Double double1)
    {
        uncertainty = double1;
        return this;
    }



/*
    static Double access$002(eption eption, Double double1)
    {
        eption.coordA = double1;
        return double1;
    }

*/



/*
    static Double access$102(coordA coorda, Double double1)
    {
        coorda.coordB = double1;
        return double1;
    }

*/



/*
    static Double access$202(coordB coordb, Double double1)
    {
        coordb.coordC = double1;
        return double1;
    }

*/



/*
    static String access$302(coordC coordc, String s)
    {
        coordc.crs = s;
        return s;
    }

*/



/*
    static Double access$402(crs crs1, Double double1)
    {
        crs1.uncertainty = double1;
        return double1;
    }

*/


    private uncertainty()
    {
        parameters = new LinkedHashMap(0);
    }

    t>(t> t>)
    {
        this();
    }

    public <init>(GeoUri geouri)
    {
        coordA(GeoUri.access$700(geouri));
        coordB(GeoUri.access$800(geouri));
        coordC = GeoUri.access$900(geouri);
        crs = GeoUri.access$1000(geouri);
        uncertainty = GeoUri.access$1100(geouri);
        parameters = new LinkedHashMap(GeoUri.access$1200(geouri));
    }

    public _cls200(Double double1, Double double2)
    {
        this();
        coordA(double1);
        coordB(double2);
    }
}
