// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.api.client.http;

import com.google.api.client.util.Preconditions;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class HttpMediaType
{

    private static final Pattern FULL_MEDIA_TYPE_REGEX = Pattern.compile((new StringBuilder()).append("\\s*(").append("[^\\s/=;\"]+").append(")/(").append("[^\\s/=;\"]+").append(")").append("\\s*(").append(";.*").append(")?").toString(), 32);
    private static final Pattern PARAMETER_REGEX;
    private static final Pattern TOKEN_REGEX = Pattern.compile("[\\p{ASCII}&&[^\\p{Cntrl} ;/=\\[\\]\\(\\)\\<\\>\\@\\,\\:\\\"\\?\\=]]+");
    private static final Pattern TYPE_REGEX = Pattern.compile("[\\w!#$&.+\\-\\^_]+|[*]");
    private String cachedBuildResult;
    private final SortedMap parameters;
    private String subType;
    private String type;

    public HttpMediaType(String s)
    {
        type = "application";
        subType = "octet-stream";
        parameters = new TreeMap();
        fromString(s);
    }

    public HttpMediaType(String s, String s1)
    {
        type = "application";
        subType = "octet-stream";
        parameters = new TreeMap();
        setType(s);
        setSubType(s1);
    }

    public static boolean equalsIgnoreParameters(String s, String s1)
    {
        return s == null && s1 == null || s != null && s1 != null && (new HttpMediaType(s)).equalsIgnoreParameters(new HttpMediaType(s1));
    }

    private HttpMediaType fromString(String s)
    {
        s = FULL_MEDIA_TYPE_REGEX.matcher(s);
        Preconditions.checkArgument(s.matches(), "Type must be in the 'maintype/subtype; parameter=value' format");
        setType(s.group(1));
        setSubType(s.group(2));
        s = s.group(3);
        if (s != null)
        {
            String s2;
            for (Matcher matcher = PARAMETER_REGEX.matcher(s); matcher.find(); setParameter(s2, s))
            {
                s2 = matcher.group(1);
                String s1 = matcher.group(3);
                s = s1;
                if (s1 == null)
                {
                    s = matcher.group(2);
                }
            }

        }
        return this;
    }

    static boolean matchesToken(String s)
    {
        return TOKEN_REGEX.matcher(s).matches();
    }

    private static String quoteString(String s)
    {
        s = s.replace("\\", "\\\\").replace("\"", "\\\"");
        return (new StringBuilder()).append("\"").append(s).append("\"").toString();
    }

    public String build()
    {
        if (cachedBuildResult != null)
        {
            return cachedBuildResult;
        }
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(type);
        stringbuilder.append('/');
        stringbuilder.append(subType);
        if (parameters != null)
        {
            Object obj;
            for (Iterator iterator = parameters.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(((String) (obj))))
            {
                obj = (java.util.Map.Entry)iterator.next();
                String s = (String)((java.util.Map.Entry) (obj)).getValue();
                stringbuilder.append("; ");
                stringbuilder.append((String)((java.util.Map.Entry) (obj)).getKey());
                stringbuilder.append("=");
                obj = s;
                if (!matchesToken(s))
                {
                    obj = quoteString(s);
                }
            }

        }
        cachedBuildResult = stringbuilder.toString();
        return cachedBuildResult;
    }

    public void clearParameters()
    {
        cachedBuildResult = null;
        parameters.clear();
    }

    public boolean equals(Object obj)
    {
        if (obj instanceof HttpMediaType)
        {
            if (equalsIgnoreParameters(((HttpMediaType) (obj = (HttpMediaType)obj))) && parameters.equals(((HttpMediaType) (obj)).parameters))
            {
                return true;
            }
        }
        return false;
    }

    public boolean equalsIgnoreParameters(HttpMediaType httpmediatype)
    {
        return httpmediatype != null && getType().equalsIgnoreCase(httpmediatype.getType()) && getSubType().equalsIgnoreCase(httpmediatype.getSubType());
    }

    public Charset getCharsetParameter()
    {
        String s = getParameter("charset");
        if (s == null)
        {
            return null;
        } else
        {
            return Charset.forName(s);
        }
    }

    public String getParameter(String s)
    {
        return (String)parameters.get(s.toLowerCase());
    }

    public Map getParameters()
    {
        return Collections.unmodifiableMap(parameters);
    }

    public String getSubType()
    {
        return subType;
    }

    public String getType()
    {
        return type;
    }

    public int hashCode()
    {
        return build().hashCode();
    }

    public HttpMediaType removeParameter(String s)
    {
        cachedBuildResult = null;
        parameters.remove(s.toLowerCase());
        return this;
    }

    public HttpMediaType setCharsetParameter(Charset charset)
    {
        if (charset == null)
        {
            charset = null;
        } else
        {
            charset = charset.name();
        }
        setParameter("charset", charset);
        return this;
    }

    public HttpMediaType setParameter(String s, String s1)
    {
        if (s1 == null)
        {
            removeParameter(s);
            return this;
        } else
        {
            Preconditions.checkArgument(TOKEN_REGEX.matcher(s).matches(), "Name contains reserved characters");
            cachedBuildResult = null;
            parameters.put(s.toLowerCase(), s1);
            return this;
        }
    }

    public HttpMediaType setSubType(String s)
    {
        Preconditions.checkArgument(TYPE_REGEX.matcher(s).matches(), "Subtype contains reserved characters");
        subType = s;
        cachedBuildResult = null;
        return this;
    }

    public HttpMediaType setType(String s)
    {
        Preconditions.checkArgument(TYPE_REGEX.matcher(s).matches(), "Type contains reserved characters");
        type = s;
        cachedBuildResult = null;
        return this;
    }

    public String toString()
    {
        return build();
    }

    static 
    {
        String s = (new StringBuilder()).append("\"([^\"]*)\"").append("|").append("[^\\s;\"]*").toString();
        PARAMETER_REGEX = Pattern.compile((new StringBuilder()).append("\\s*;\\s*(").append("[^\\s/=;\"]+").append(")").append("=(").append(s).append(")").toString());
    }
}
