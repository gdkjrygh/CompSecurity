// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.configuration;

import android.content.Context;
import android.content.res.Resources;
import com.appboy.Constants;
import com.appboy.support.PackageUtils;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class CachedConfigurationProvider
{

    private static final String a;
    private final Context b;
    protected final Map mConfigurationCache = Collections.synchronizedMap(new HashMap());

    public CachedConfigurationProvider(Context context)
    {
        b = context;
    }

    protected boolean getBooleanValue(String s, boolean flag)
    {
        if (mConfigurationCache.containsKey(s))
        {
            return ((Boolean)mConfigurationCache.get(s)).booleanValue();
        } else
        {
            flag = readBooleanResourceValue(s, flag);
            mConfigurationCache.put(s, Boolean.valueOf(flag));
            return flag;
        }
    }

    public int getIntValue(String s, int i)
    {
        if (mConfigurationCache.containsKey(s))
        {
            return ((Integer)mConfigurationCache.get(s)).intValue();
        } else
        {
            i = readIntegerResourceValue(s, i);
            mConfigurationCache.put(s, Integer.valueOf(i));
            return i;
        }
    }

    protected String getStringValue(String s, String s1)
    {
        if (mConfigurationCache.containsKey(s))
        {
            return (String)mConfigurationCache.get(s);
        } else
        {
            s1 = readStringResourceValue(s, s1);
            mConfigurationCache.put(s, s1);
            return s1;
        }
    }

    protected boolean readBooleanResourceValue(String s, boolean flag)
    {
        if (s == null)
        {
            return flag;
        }
        int i = b.getResources().getIdentifier(s, "bool", PackageUtils.getResourcePackageName(b));
        if (i == 0)
        {
            String s1 = a;
            String.format("Unable to find the boolean configuration value with key %s. Using default value '%b'.", new Object[] {
                s, Boolean.valueOf(flag)
            });
            return flag;
        } else
        {
            return b.getResources().getBoolean(i);
        }
    }

    protected int readIntegerResourceValue(String s, int i)
    {
        if (s == null)
        {
            return i;
        }
        int j = b.getResources().getIdentifier(s, "integer", PackageUtils.getResourcePackageName(b));
        if (j == 0)
        {
            String s1 = a;
            String.format("Unable to find the integer configuration value with key %s. Using default value '%d'.", new Object[] {
                s, Integer.valueOf(i)
            });
            return i;
        } else
        {
            return b.getResources().getInteger(j);
        }
    }

    protected String[] readStringArrayResourceValue(String s, String as[])
    {
        if (s == null)
        {
            return as;
        }
        int i = b.getResources().getIdentifier(s, "array", PackageUtils.getResourcePackageName(b));
        if (i == 0)
        {
            String s1 = a;
            String.format("Unable to find the string array configuration value with key %s. Using default value '%s'.", new Object[] {
                s, Arrays.toString(as)
            });
            return as;
        } else
        {
            return b.getResources().getStringArray(i);
        }
    }

    protected String readStringResourceValue(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        }
        int i = b.getResources().getIdentifier(s, "string", PackageUtils.getResourcePackageName(b));
        if (i == 0)
        {
            String s2 = a;
            String.format("Unable to find the boolean configuration value with key %s. Using default value '%s'.", new Object[] {
                s, s1
            });
            return s1;
        } else
        {
            return b.getResources().getString(i);
        }
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/configuration/CachedConfigurationProvider.getName()
        });
    }
}
