// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.rsa.mobilesdk.sdk;

import java.text.DecimalFormat;
import java.util.Properties;

public class Utils
{

    private static DecimalFormat mDecimalFormat = new DecimalFormat("###.########;-###");

    public Utils()
    {
    }

    public static boolean getBooleanProperty(Properties properties, String s, boolean flag)
    {
        boolean flag1 = true;
        if (properties == null)
        {
            return flag;
        }
        int i;
        if (flag)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        if (getIntProperty(properties, s, i) != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        return flag;
    }

    public static String getDoubleString(double d)
    {
        return mDecimalFormat.format(d);
    }

    public static int getIntProperty(Properties properties, String s, int i)
    {
        if (properties == null)
        {
            return i;
        }
        Object obj = properties.get(s);
        int j = i;
        if (obj instanceof String)
        {
            properties = (String)properties.get(s);
            j = i;
            if (obj != null)
            {
                try
                {
                    j = Integer.parseInt(properties);
                }
                // Misplaced declaration of an exception variable
                catch (Properties properties)
                {
                    j = i;
                }
            }
        }
        return j;
    }

    public static String toJSONValue(double d)
    {
        return (new StringBuilder()).append("\"").append(Double.toString(d)).append("\"").toString();
    }

    public static String toJSONValue(float f)
    {
        return (new StringBuilder()).append("\"").append(Float.toString(f)).append("\"").toString();
    }

    public static String toJSONValue(int i)
    {
        return (new StringBuilder()).append("\"").append(Integer.toString(i)).append("\"").toString();
    }

    public static String toJSONValue(long l)
    {
        return (new StringBuilder()).append("\"").append(Long.toString(l)).append("\"").toString();
    }

    public static String toJSONValue(String s)
    {
        if (s == null)
        {
            return "null";
        } else
        {
            return (new StringBuilder()).append("\"").append(s).append("\"").toString();
        }
    }

    public static String toJSONValue(boolean flag)
    {
        return Boolean.toString(flag);
    }

}
