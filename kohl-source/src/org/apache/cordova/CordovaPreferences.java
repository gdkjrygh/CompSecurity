// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.os.Bundle;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

public class CordovaPreferences
{

    private Bundle preferencesBundleExtras;
    private HashMap prefs;

    public CordovaPreferences()
    {
        prefs = new HashMap(20);
    }

    public Map getAll()
    {
        return prefs;
    }

    public boolean getBoolean(String s, boolean flag)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        s = (String)prefs.get(s);
        if (s != null)
        {
            flag = Boolean.parseBoolean(s);
        }
        return flag;
    }

    public double getDouble(String s, double d)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        s = (String)prefs.get(s);
        if (s != null)
        {
            d = Double.valueOf(s).doubleValue();
        }
        return d;
    }

    public int getInteger(String s, int i)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        s = (String)prefs.get(s);
        if (s != null)
        {
            i = (int)Long.decode(s).longValue();
        }
        return i;
    }

    public String getString(String s, String s1)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        s = (String)prefs.get(s);
        if (s != null)
        {
            return s;
        } else
        {
            return s1;
        }
    }

    public void set(String s, double d)
    {
        set(s, (new StringBuilder()).append("").append(d).toString());
    }

    public void set(String s, int i)
    {
        set(s, (new StringBuilder()).append("").append(i).toString());
    }

    public void set(String s, String s1)
    {
        prefs.put(s.toLowerCase(Locale.ENGLISH), s1);
    }

    public void set(String s, boolean flag)
    {
        set(s, (new StringBuilder()).append("").append(flag).toString());
    }

    public void setPreferencesBundle(Bundle bundle)
    {
        preferencesBundleExtras = bundle;
    }
}
