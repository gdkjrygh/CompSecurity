// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.googlecode.flickrjandroid.photos;

import com.googlecode.flickrjandroid.util.StringUtilities;
import java.io.PrintStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class GeoData
    implements Serializable
{

    public static final long serialVersionUID = 12L;
    private int accuracy;
    private float latitude;
    private float longitude;

    public GeoData()
    {
    }

    public GeoData(float f, float f1, int i)
    {
        longitude = f;
        latitude = f1;
        accuracy = i;
    }

    public GeoData(String s, String s1, String s2)
    {
        longitude = Float.parseFloat(s);
        latitude = Float.parseFloat(s1);
        accuracy = Integer.parseInt(s2);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && obj.getClass() == getClass()) goto _L2; else goto _L1
_L1:
        return false;
_L2:
        Method amethod[];
        int i;
        obj = (GeoData)obj;
        amethod = getClass().getMethods();
        i = 0;
_L8:
        if (i >= amethod.length)
        {
            return true;
        }
        if (!StringUtilities.getterPattern.matcher(amethod[i].getName()).find() || amethod[i].getName().equals("getClass"))
        {
            break; /* Loop/switch isn't completed */
        }
        Object obj1;
        Object obj2;
        String s;
        obj1 = amethod[i].invoke(this, null);
        obj2 = amethod[i].invoke(obj, null);
        s = amethod[i].getReturnType().toString();
        if (s.indexOf("class") != 0) goto _L4; else goto _L3
_L3:
        if (obj1 == null || obj2 == null)
        {
            break; /* Loop/switch isn't completed */
        }
        if (!obj1.equals(obj2)) goto _L1; else goto _L5
_L4:
        if (!s.equals("int")) goto _L7; else goto _L6
_L6:
        if (!((Integer)obj1).equals((Integer)obj2))
        {
            return false;
        }
          goto _L5
_L7:
        if (s.equals("float"))
        {
            if (!((Float)obj1).equals((Float)obj2))
            {
                return false;
            }
        } else
        {
            try
            {
                System.out.println((new StringBuilder(String.valueOf(amethod[i].getName()))).append("|").append(amethod[i].getReturnType().toString()).toString());
            }
            catch (IllegalAccessException illegalaccessexception)
            {
                System.out.println((new StringBuilder("GeoData equals ")).append(amethod[i].getName()).append(" ").append(illegalaccessexception).toString());
            }
            catch (InvocationTargetException invocationtargetexception) { }
            catch (Exception exception)
            {
                System.out.println((new StringBuilder("GeoData equals ")).append(amethod[i].getName()).append(" ").append(exception).toString());
            }
        }
_L5:
        i++;
          goto _L8
    }

    public int getAccuracy()
    {
        return accuracy;
    }

    public float getLatitude()
    {
        return latitude;
    }

    public float getLongitude()
    {
        return longitude;
    }

    public int hashCode()
    {
        return (new Float(longitude)).hashCode() + 1 + (new Float(latitude)).hashCode() + (new Integer(accuracy)).hashCode();
    }

    public void setAccuracy(int i)
    {
        accuracy = i;
    }

    public void setLatitude(float f)
    {
        latitude = f;
    }

    public void setLongitude(float f)
    {
        longitude = f;
    }

    public String toString()
    {
        return (new StringBuilder("GeoData[longitude=")).append(longitude).append(" latitude=").append(latitude).append(" accuracy=").append(accuracy).append("]").toString();
    }
}
