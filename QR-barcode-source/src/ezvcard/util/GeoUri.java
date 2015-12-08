// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package ezvcard.util;

import java.net.URI;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package ezvcard.util:
//            VCardFloatFormatter

public final class GeoUri
{
    public static class Builder
    {

        private Double coordA;
        private Double coordB;
        private Double coordC;
        private String crs;
        private Map parameters;
        private Double uncertainty;

        public GeoUri build()
        {
            return new GeoUri(this);
        }

        public Builder coordA(Double double1)
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

        public Builder coordB(Double double1)
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

        public Builder coordC(Double double1)
        {
            coordC = double1;
            return this;
        }

        public Builder crs(String s)
        {
            if (s != null && !GeoUri.isLabelText(s))
            {
                throw new IllegalArgumentException("CRS can only contain letters, numbers, and hypens.");
            } else
            {
                crs = s;
                return this;
            }
        }

        public Builder parameter(String s, String s1)
        {
            if (!GeoUri.isLabelText(s))
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

        public Builder uncertainty(Double double1)
        {
            uncertainty = double1;
            return this;
        }



/*
        static Double access$002(Builder builder, Double double1)
        {
            builder.coordA = double1;
            return double1;
        }

*/



/*
        static Double access$102(Builder builder, Double double1)
        {
            builder.coordB = double1;
            return double1;
        }

*/



/*
        static Double access$202(Builder builder, Double double1)
        {
            builder.coordC = double1;
            return double1;
        }

*/



/*
        static String access$302(Builder builder, String s)
        {
            builder.crs = s;
            return s;
        }

*/



/*
        static Double access$402(Builder builder, Double double1)
        {
            builder.uncertainty = double1;
            return double1;
        }

*/


        private Builder()
        {
            parameters = new LinkedHashMap(0);
        }


        public Builder(GeoUri geouri)
        {
            coordA(geouri.coordA);
            coordB(geouri.coordB);
            coordC = geouri.coordC;
            crs = geouri.crs;
            uncertainty = geouri.uncertainty;
            parameters = new LinkedHashMap(geouri.parameters);
        }

        public Builder(Double double1, Double double2)
        {
            this();
            coordA(double1);
            coordB(double2);
        }
    }


    public static final String CRS_WGS84 = "wgs84";
    private static final String PARAM_CRS = "crs";
    private static final String PARAM_UNCERTAINTY = "u";
    private static final Pattern hexPattern = Pattern.compile("(?i)%([0-9a-f]{2})");
    private static final Pattern labelTextPattern = Pattern.compile("(?i)^[-a-z0-9]+$");
    private static final Pattern uriPattern = Pattern.compile("(?i)^geo:(-?\\d+(\\.\\d+)?),(-?\\d+(\\.\\d+)?)(,(-?\\d+(\\.\\d+)?))?(;(.*))?$");
    private static final char validParamValueChars[];
    private final Double coordA;
    private final Double coordB;
    private final Double coordC;
    private final String crs;
    private final Map parameters;
    private final Double uncertainty;

    private GeoUri(Builder builder)
    {
        coordA = builder.coordA;
        coordB = builder.coordB;
        coordC = builder.coordC;
        crs = builder.crs;
        uncertainty = builder.uncertainty;
        parameters = Collections.unmodifiableMap(builder.parameters);
    }


    private static String decodeParamValue(String s)
    {
        s = hexPattern.matcher(s);
        StringBuffer stringbuffer = new StringBuffer();
        int i;
        for (; s.find(); s.appendReplacement(stringbuffer, (new StringBuilder()).append("").append((char)i).toString()))
        {
            i = Integer.parseInt(s.group(1), 16);
        }

        s.appendTail(stringbuffer);
        return stringbuffer.toString();
    }

    private static String encodeParamValue(String s)
    {
        StringBuilder stringbuilder = new StringBuilder(s.length());
        s = s.toCharArray();
        int j = s.length;
        int i = 0;
        while (i < j) 
        {
            char c = s[i];
            if (c >= 'a' && c <= 'z' || c >= 'A' && c <= 'Z' || c >= '0' && c <= '9' || Arrays.binarySearch(validParamValueChars, c) >= 0)
            {
                stringbuilder.append(c);
            } else
            {
                stringbuilder.append('%');
                stringbuilder.append(Integer.toString(c, 16));
            }
            i++;
        }
        return stringbuilder.toString();
    }

    private static boolean isLabelText(String s)
    {
        return labelTextPattern.matcher(s).find();
    }

    public static GeoUri parse(String s)
    {
        Builder builder;
        String as[];
        int i;
        int j;
        Matcher matcher = uriPattern.matcher(s);
        if (!matcher.find())
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Invalid geo URI: ").append(s).toString());
        }
        builder = new Builder();
        builder.coordA = Double.valueOf(Double.parseDouble(matcher.group(1)));
        builder.coordB = Double.valueOf(Double.parseDouble(matcher.group(3)));
        s = matcher.group(6);
        if (s != null)
        {
            builder.coordC = Double.valueOf(s);
        }
        s = matcher.group(9);
        if (s == null)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        as = s.split(";");
        j = as.length;
        i = 0;
_L3:
        String s1;
        if (i >= j)
        {
            break MISSING_BLOCK_LABEL_231;
        }
        s = as[i].split("=", 2);
        s1 = s[0];
        if (s.length > 1)
        {
            s = decodeParamValue(s[1]);
        } else
        {
            s = "";
        }
        if (!"crs".equalsIgnoreCase(s1)) goto _L2; else goto _L1
_L1:
        builder.crs = s;
_L4:
        i++;
          goto _L3
_L2:
        if (!"u".equalsIgnoreCase(s1))
        {
            break MISSING_BLOCK_LABEL_216;
        }
        builder.uncertainty = Double.valueOf(s);
          goto _L4
        NumberFormatException numberformatexception;
        numberformatexception;
        builder.parameters.put(s1, s);
          goto _L4
        return builder.build();
    }

    private void writeParameter(String s, String s1, StringBuilder stringbuilder)
    {
        stringbuilder.append(';').append(s).append('=').append(encodeParamValue(s1));
    }

    public Double getCoordA()
    {
        return coordA;
    }

    public Double getCoordB()
    {
        return coordB;
    }

    public Double getCoordC()
    {
        return coordC;
    }

    public String getCrs()
    {
        return crs;
    }

    public String getParameter(String s)
    {
        return (String)parameters.get(s);
    }

    public Map getParameters()
    {
        return parameters;
    }

    public Double getUncertainty()
    {
        return uncertainty;
    }

    public String toString()
    {
        return toString(6);
    }

    public String toString(int i)
    {
        VCardFloatFormatter vcardfloatformatter = new VCardFloatFormatter(i);
        StringBuilder stringbuilder = new StringBuilder("geo:");
        stringbuilder.append(vcardfloatformatter.format(coordA));
        stringbuilder.append(',');
        stringbuilder.append(vcardfloatformatter.format(coordB));
        if (coordC != null)
        {
            stringbuilder.append(',');
            stringbuilder.append(coordC);
        }
        if (crs != null && !crs.equalsIgnoreCase("wgs84"))
        {
            writeParameter("crs", crs, stringbuilder);
        }
        if (uncertainty != null)
        {
            writeParameter("u", vcardfloatformatter.format(uncertainty), stringbuilder);
        }
        java.util.Map.Entry entry;
        for (Iterator iterator = parameters.entrySet().iterator(); iterator.hasNext(); writeParameter((String)entry.getKey(), (String)entry.getValue(), stringbuilder))
        {
            entry = (java.util.Map.Entry)iterator.next();
        }

        return stringbuilder.toString();
    }

    public URI toUri()
    {
        return URI.create(toString());
    }

    static 
    {
        validParamValueChars = "!$&'()*+-.:[]_~".toCharArray();
        Arrays.sort(validParamValueChars);
    }







}
