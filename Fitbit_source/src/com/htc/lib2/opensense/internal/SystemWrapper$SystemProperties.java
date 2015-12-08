// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.htc.lib2.opensense.internal;


// Referenced classes of package com.htc.lib2.opensense.internal:
//            SystemWrapper

public static class 
{

    public static String get(String s)
    {
        return (String)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "get", "", new Class[] {
            java/lang/String
        }, new Object[] {
            s
        });
    }

    public static String get(String s, String s1)
    {
        return (String)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "get", s1, new Class[] {
            java/lang/String, java/lang/String
        }, new Object[] {
            s, s1
        });
    }

    public static boolean getBoolean(String s, boolean flag)
    {
        return ((Boolean)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getBoolean", Boolean.valueOf(flag), new Class[] {
            java/lang/String, Boolean.TYPE
        }, new Object[] {
            s, Boolean.valueOf(flag)
        })).booleanValue();
    }

    public static int getInt(String s, int i)
    {
        return ((Integer)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getInt", Integer.valueOf(i), new Class[] {
            java/lang/String, Integer.TYPE
        }, new Object[] {
            s, Integer.valueOf(i)
        })).intValue();
    }

    public static long getLong(String s, long l)
    {
        return ((Long)SystemWrapper.invokePublicStaticMethod("android.os.SystemProperties", "getLong", Long.valueOf(l), new Class[] {
            java/lang/String, Long.TYPE
        }, new Object[] {
            s, Long.valueOf(l)
        })).longValue();
    }

    public ()
    {
    }
}
