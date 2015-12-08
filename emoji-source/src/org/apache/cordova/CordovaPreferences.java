// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.cordova;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Map;
import java.util.Set;

// Referenced classes of package org.apache.cordova:
//            LOG

public class CordovaPreferences
{

    private Bundle preferencesBundleExtras;
    private HashMap prefs;

    public CordovaPreferences()
    {
        prefs = new HashMap(20);
    }

    public void copyIntoIntentExtras(Activity activity)
    {
        Iterator iterator = prefs.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            String s = (String)iterator.next();
            String s1 = (String)prefs.get(s);
            if (s1 != null)
            {
                if (s.equals("loglevel"))
                {
                    LOG.setLogLevel(s1);
                } else
                if (s.equals("splashscreen"))
                {
                    int i = activity.getResources().getIdentifier(s1, "drawable", activity.getClass().getPackage().getName());
                    activity.getIntent().putExtra(s, i);
                } else
                if (s.equals("backgroundcolor"))
                {
                    int j = (int)Long.decode(s1).longValue();
                    activity.getIntent().putExtra(s, j);
                } else
                if (s.equals("loadurltimeoutvalue"))
                {
                    int k = Integer.decode(s1).intValue();
                    activity.getIntent().putExtra(s, k);
                } else
                if (s.equals("splashscreendelay"))
                {
                    int l = Integer.decode(s1).intValue();
                    activity.getIntent().putExtra(s, l);
                } else
                if (s.equals("keeprunning"))
                {
                    boolean flag = Boolean.parseBoolean(s1);
                    activity.getIntent().putExtra(s, flag);
                } else
                if (s.equals("inappbrowserstorageenabled"))
                {
                    boolean flag1 = Boolean.parseBoolean(s1);
                    activity.getIntent().putExtra(s, flag1);
                } else
                if (s.equals("disallowoverscroll"))
                {
                    boolean flag2 = Boolean.parseBoolean(s1);
                    activity.getIntent().putExtra(s, flag2);
                } else
                {
                    activity.getIntent().putExtra(s, s1);
                }
            }
        } while (true);
        if (preferencesBundleExtras == null)
        {
            preferencesBundleExtras = activity.getIntent().getExtras();
        }
    }

    public Map getAll()
    {
        return prefs;
    }

    public boolean getBoolean(String s, boolean flag)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        String s1 = (String)prefs.get(s);
        boolean flag1;
        if (s1 != null)
        {
            flag1 = Boolean.parseBoolean(s1);
        } else
        {
            flag1 = flag;
            if (preferencesBundleExtras != null)
            {
                Object obj = preferencesBundleExtras.get(s);
                if (obj instanceof String)
                {
                    return "true".equals(obj);
                } else
                {
                    return preferencesBundleExtras.getBoolean(s, flag);
                }
            }
        }
        return flag1;
    }

    public double getDouble(String s, double d)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        String s1 = (String)prefs.get(s);
        double d1;
        if (s1 != null)
        {
            d1 = Double.valueOf(s1).doubleValue();
        } else
        {
            d1 = d;
            if (preferencesBundleExtras != null)
            {
                Object obj = preferencesBundleExtras.get(s);
                if (obj instanceof String)
                {
                    return Double.valueOf((String)obj).doubleValue();
                } else
                {
                    return preferencesBundleExtras.getDouble(s, d);
                }
            }
        }
        return d1;
    }

    public int getInteger(String s, int i)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        String s1 = (String)prefs.get(s);
        int j;
        if (s1 != null)
        {
            j = (int)Long.decode(s1).longValue();
        } else
        {
            j = i;
            if (preferencesBundleExtras != null)
            {
                Object obj = preferencesBundleExtras.get(s);
                if (obj instanceof String)
                {
                    return Integer.valueOf((String)obj).intValue();
                } else
                {
                    return preferencesBundleExtras.getInt(s, i);
                }
            }
        }
        return j;
    }

    public String getString(String s, String s1)
    {
        s = s.toLowerCase(Locale.ENGLISH);
        String s2 = (String)prefs.get(s);
        if (s2 != null)
        {
            return s2;
        }
        if (preferencesBundleExtras != null && !"errorurl".equals(s))
        {
            s = ((String) (preferencesBundleExtras.get(s)));
            if (s != null)
            {
                return s.toString();
            }
        }
        return s1;
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
