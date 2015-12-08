// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.threatmetrix.TrustDefenderMobile;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;

// Referenced classes of package com.threatmetrix.TrustDefenderMobile:
//            StringUtils

class HttpParameterMap extends HashMap
{

    private static final String a = StringUtils.a(com/threatmetrix/TrustDefenderMobile/HttpParameterMap);
    private HashMap m_keySpecificLength;
    private int m_postValueLengthLimit;

    HttpParameterMap()
    {
        m_postValueLengthLimit = 0;
        m_keySpecificLength = new HashMap();
    }

    public int a()
    {
        return m_postValueLengthLimit;
    }

    public HttpParameterMap a(String s, String s1)
    {
        a(s, s1, false);
        return this;
    }

    public HttpParameterMap a(String s, String s1, Integer integer)
    {
        m_keySpecificLength.put(s, integer);
        a(s, s1, false);
        return this;
    }

    public HttpParameterMap a(String s, String s1, boolean flag)
    {
        if (flag && s1 != null && !s1.isEmpty())
        {
            put(s, s1.toLowerCase(Locale.US));
            return this;
        } else
        {
            put(s, s1);
            return this;
        }
    }

    public Integer a(String s)
    {
        return (Integer)m_keySpecificLength.get(s);
    }

    public void a(int i)
    {
        m_postValueLengthLimit = i;
    }

    public String b()
    {
        StringBuilder stringbuilder = new StringBuilder();
        Iterator iterator = keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)get(s);
            if (s1 != null && !s1.isEmpty())
            {
                if (stringbuilder.length() > 0)
                {
                    stringbuilder.append("&");
                }
                stringbuilder.append(s);
                Integer integer = (Integer)m_keySpecificLength.get(s);
                s = s1;
                if (integer != null)
                {
                    s = s1;
                    if (s1.length() > integer.intValue())
                    {
                        s = s1.substring(0, integer.intValue());
                    }
                }
                if (integer == null && m_postValueLengthLimit != 0 && s.length() > m_postValueLengthLimit)
                {
                    s = s.substring(0, m_postValueLengthLimit);
                }
                stringbuilder.append("=");
                stringbuilder.append(StringUtils.a(s));
            }
        } while (true);
        return stringbuilder.toString();
    }

}
