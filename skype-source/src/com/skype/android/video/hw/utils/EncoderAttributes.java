// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.video.hw.utils;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EncoderAttributes
    implements Serializable
{
    public static class AttributeException extends Exception
    {

        private static final long serialVersionUID = 1L;

        public AttributeException(String s)
        {
            super(s);
        }

        public AttributeException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class IllegalAttributeValueException extends AttributeException
    {

        private static final long serialVersionUID = 1L;

        public IllegalAttributeValueException(String s, Throwable throwable)
        {
            super(s, throwable);
        }
    }

    public static class NoSuchAttributeException extends AttributeException
    {

        private static final long serialVersionUID = 1L;

        public NoSuchAttributeException(String s)
        {
            super(s);
        }
    }


    private static final Pattern parsePattern = Pattern.compile("(\\S+)\\s+(\\S+)\\s*");
    private static final Pattern replacePattern = Pattern.compile("-");
    private static final long serialVersionUID = 0x7e4c6b6d0a739d8aL;
    private final Map map = new HashMap();

    public EncoderAttributes(String s)
    {
        String s2;
        for (Matcher matcher = parsePattern.matcher(s); matcher.find(); map.put(convertKey(s2), s))
        {
            s2 = matcher.group(1);
            String s1 = matcher.group(2);
            s = s1;
            if (!s1.endsWith("\""))
            {
                continue;
            }
            s = s1;
            if (s1.startsWith("\""))
            {
                s = s1.substring(1, s1.length() - 1);
            }
        }

    }

    private static String convertKey(String s)
    {
        return replacePattern.matcher(s).replaceAll("_").toLowerCase();
    }

    private static native Object getObjFromNativePtr(long l);

    public boolean equals(Object obj)
    {
        if (this != obj) goto _L2; else goto _L1
_L1:
        return true;
_L2:
        if (obj == null)
        {
            return false;
        }
        if (getClass() != obj.getClass())
        {
            return false;
        }
        obj = (EncoderAttributes)obj;
        if (map != null)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (((EncoderAttributes) (obj)).map == null) goto _L1; else goto _L3
_L3:
        return false;
        if (map.equals(((EncoderAttributes) (obj)).map)) goto _L1; else goto _L4
_L4:
        return false;
    }

    public double getFloat(String s, double d)
    {
        s = (String)map.get(convertKey(s));
        if (s == null)
        {
            return d;
        }
        double d1;
        try
        {
            d1 = Double.parseDouble(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return d;
        }
        return d1;
    }

    public Double getFloat(String s)
        throws NoSuchAttributeException, IllegalAttributeValueException
    {
        String s1 = (String)map.get(convertKey(s));
        if (s1 == null)
        {
            throw new NoSuchAttributeException(s);
        }
        double d;
        try
        {
            d = Double.parseDouble(s1);
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalAttributeValueException(s, numberformatexception);
        }
        return Double.valueOf(d);
    }

    public int getInteger(String s, int i)
    {
        s = (String)map.get(convertKey(s));
        if (s == null)
        {
            return i;
        }
        int j;
        try
        {
            j = Integer.valueOf(s).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return i;
        }
        return j;
    }

    public Integer getInteger(String s)
        throws NoSuchAttributeException, IllegalAttributeValueException
    {
        Object obj = (String)map.get(convertKey(s));
        if (obj == null)
        {
            throw new NoSuchAttributeException(s);
        }
        try
        {
            obj = Integer.valueOf(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalAttributeValueException(s, numberformatexception);
        }
        return ((Integer) (obj));
    }

    public long getLong(String s, long l)
    {
        s = (String)map.get(convertKey(s));
        if (s == null)
        {
            return l;
        }
        long l1;
        try
        {
            l1 = Long.parseLong(s);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return l;
        }
        return l1;
    }

    public Long getLong(String s)
        throws NoSuchAttributeException, IllegalAttributeValueException
    {
        Object obj = (String)map.get(convertKey(s));
        if (obj == null)
        {
            throw new NoSuchAttributeException(s);
        }
        try
        {
            obj = Long.valueOf(((String) (obj)));
        }
        catch (NumberFormatException numberformatexception)
        {
            throw new IllegalAttributeValueException(s, numberformatexception);
        }
        return ((Long) (obj));
    }

    public Object getPointer(String s)
        throws NoSuchAttributeException, IllegalAttributeValueException
    {
        Object obj;
        obj = (String)map.get(convertKey(s));
        if (obj == null)
        {
            throw new NoSuchAttributeException(s);
        }
        try
        {
            if (!((String) (obj)).startsWith("0x"))
            {
                throw new NumberFormatException((new StringBuilder("'")).append(((String) (obj))).append("' does not denote a pointer").toString());
            }
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalAttributeValueException(s, ((Throwable) (obj)));
        }
        obj = getObjFromNativePtr(Long.valueOf(((String) (obj)).substring(2), 16).longValue());
        return obj;
    }

    public Object getPointer(String s, Object obj)
    {
        s = (String)map.get(convertKey(s));
        if (s == null)
        {
            return obj;
        }
        try
        {
            if (!s.startsWith("0x"))
            {
                throw new NumberFormatException((new StringBuilder("'")).append(s).append("' does not denote a pointer").toString());
            }
            s = ((String) (getObjFromNativePtr(Long.valueOf(s.substring(2), 16).longValue())));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return obj;
        }
        return s;
    }

    public String getString(String s)
        throws NoSuchAttributeException
    {
        String s1 = (String)map.get(convertKey(s));
        if (s1 == null)
        {
            throw new NoSuchAttributeException(s);
        } else
        {
            return s1;
        }
    }

    public String getString(String s, String s1)
    {
label0:
        {
            String s2 = (String)map.get(convertKey(s));
            if (s2 != null)
            {
                s = s2;
                if (s2.length() != 0)
                {
                    break label0;
                }
            }
            s = s1;
        }
        return s;
    }

    public int hashCode()
    {
        int i;
        if (map == null)
        {
            i = 0;
        } else
        {
            i = map.hashCode();
        }
        return i + 31;
    }

    public String put(String s, Object obj)
    {
        return (String)map.put(s, String.valueOf(obj));
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        for (Iterator iterator = map.entrySet().iterator(); iterator.hasNext(); stringbuilder.append(' '))
        {
            java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
            stringbuilder.append((String)entry.getKey());
            stringbuilder.append(' ');
            stringbuilder.append((String)entry.getValue());
        }

        return stringbuilder.toString();
    }

}
