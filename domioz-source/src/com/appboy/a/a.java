// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.a;

import android.content.Context;
import android.content.res.Resources;
import com.appboy.f;
import com.appboy.f.c;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class a
{

    private static final String b;
    protected final Map a = new HashMap();
    private final Context c;

    public a(Context context)
    {
        c = context;
    }

    public final int a(String s, int i)
    {
        if (a.containsKey(s))
        {
            return ((Integer)a.get(s)).intValue();
        }
        int j = c.getResources().getIdentifier(s, "integer", com.appboy.f.c.a(c));
        if (j == 0)
        {
            String.format("Unable to find the integer configuration value with key %s. Using default value '%d'.", new Object[] {
                s, Integer.valueOf(i)
            });
        } else
        {
            i = c.getResources().getInteger(j);
        }
        a.put(s, Integer.valueOf(i));
        return i;
    }

    protected final String a(String s, String s1)
    {
        if (a.containsKey(s))
        {
            return (String)a.get(s);
        } else
        {
            s1 = b(s, s1);
            a.put(s, s1);
            return s1;
        }
    }

    protected final boolean a(String s)
    {
        boolean flag = false;
        if (a.containsKey(s))
        {
            return ((Boolean)a.get(s)).booleanValue();
        }
        int i = c.getResources().getIdentifier(s, "bool", com.appboy.f.c.a(c));
        if (i == 0)
        {
            String.format("Unable to find the boolean configuration value with key %s. Using default value '%b'.", new Object[] {
                s, Boolean.valueOf(false)
            });
        } else
        {
            flag = c.getResources().getBoolean(i);
        }
        a.put(s, Boolean.valueOf(flag));
        return flag;
    }

    protected final String b(String s, String s1)
    {
        if (s == null)
        {
            return s1;
        }
        int i = c.getResources().getIdentifier(s, "string", com.appboy.f.c.a(c));
        if (i == 0)
        {
            String.format("Unable to find the boolean configuration value with key %s. Using default value '%s'.", new Object[] {
                s, s1
            });
            return s1;
        } else
        {
            return c.getResources().getString(i);
        }
    }

    protected final String[] b(String s)
    {
        int i = c.getResources().getIdentifier(s, "array", com.appboy.f.c.a(c));
        if (i == 0)
        {
            String.format("Unable to find the string array configuration value with key %s. Using default value '%s'.", new Object[] {
                s, Arrays.toString(null)
            });
            return null;
        } else
        {
            return c.getResources().getStringArray(i);
        }
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            f.a, com/appboy/a/a.getName()
        });
    }
}
