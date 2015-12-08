// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amobee.pulse3d;

import android.content.Context;
import dalvik.system.DexFile;
import java.io.File;
import java.lang.reflect.Method;

class SystemPropertiesProxy
{

    private SystemPropertiesProxy()
    {
    }

    public static String get(Context context, String s)
        throws IllegalArgumentException
    {
        try
        {
            context = context.getClassLoader().loadClass("android.os.SystemProperties");
            context = (String)context.getMethod("get", new Class[] {
                java/lang/String
            }).invoke(context, new Object[] {
                new String(s)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return "";
        }
        return context;
    }

    public static String get(Context context, String s, String s1)
        throws IllegalArgumentException
    {
        try
        {
            context = context.getClassLoader().loadClass("android.os.SystemProperties");
            context = (String)context.getMethod("get", new Class[] {
                java/lang/String, java/lang/String
            }).invoke(context, new Object[] {
                new String(s), new String(s1)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return s1;
        }
        return context;
    }

    public static Boolean getBoolean(Context context, String s, boolean flag)
        throws IllegalArgumentException
    {
        try
        {
            context = context.getClassLoader().loadClass("android.os.SystemProperties");
            context = (Boolean)context.getMethod("getBoolean", new Class[] {
                java/lang/String, Boolean.TYPE
            }).invoke(context, new Object[] {
                new String(s), new Boolean(flag)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Boolean.valueOf(flag);
        }
        return context;
    }

    public static Integer getInt(Context context, String s, int i)
        throws IllegalArgumentException
    {
        try
        {
            context = context.getClassLoader().loadClass("android.os.SystemProperties");
            context = (Integer)context.getMethod("getInt", new Class[] {
                java/lang/String, Integer.TYPE
            }).invoke(context, new Object[] {
                new String(s), new Integer(i)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Integer.valueOf(i);
        }
        return context;
    }

    public static Long getLong(Context context, String s, long l)
        throws IllegalArgumentException
    {
        try
        {
            context = context.getClassLoader().loadClass("android.os.SystemProperties");
            context = (Long)context.getMethod("getLong", new Class[] {
                java/lang/String, Long.TYPE
            }).invoke(context, new Object[] {
                new String(s), new Long(l)
            });
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return Long.valueOf(l);
        }
        return context;
    }

    public static void set(Context context, String s, String s1)
        throws IllegalArgumentException
    {
        try
        {
            new DexFile(new File("/system/app/Settings.apk"));
            context.getClassLoader();
            context = Class.forName("android.os.SystemProperties");
            context.getMethod("set", new Class[] {
                java/lang/String, java/lang/String
            }).invoke(context, new Object[] {
                new String(s), new String(s1)
            });
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw context;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return;
        }
    }
}
