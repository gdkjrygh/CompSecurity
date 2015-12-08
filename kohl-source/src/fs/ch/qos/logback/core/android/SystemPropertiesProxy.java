// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package fs.ch.qos.logback.core.android;

import java.lang.reflect.Method;

public class SystemPropertiesProxy
{

    private static final SystemPropertiesProxy SINGLETON = new SystemPropertiesProxy(null);
    private Class SystemProperties;
    private Method getBoolean;
    private Method getString;

    private SystemPropertiesProxy(ClassLoader classloader)
    {
        try
        {
            setClassLoader(classloader);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return;
        }
    }

    public static SystemPropertiesProxy getInstance()
    {
        return SINGLETON;
    }

    public String get(String s, String s1)
        throws IllegalArgumentException
    {
        if (SystemProperties == null || getString == null)
        {
            s = null;
        } else
        {
            String s2;
            try
            {
                s2 = (String)getString.invoke(SystemProperties, new Object[] {
                    s, s1
                });
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                throw s;
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                s2 = null;
            }
            s = s1;
            if (s2 != null)
            {
                s = s1;
                if (s2.length() != 0)
                {
                    return s2;
                }
            }
        }
        return s;
    }

    public void setClassLoader(ClassLoader classloader)
        throws ClassNotFoundException, SecurityException, NoSuchMethodException
    {
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = getClass().getClassLoader();
        }
        SystemProperties = classloader1.loadClass("android.os.SystemProperties");
        getString = SystemProperties.getMethod("get", new Class[] {
            java/lang/String, java/lang/String
        });
        getBoolean = SystemProperties.getMethod("getBoolean", new Class[] {
            java/lang/String, Boolean.TYPE
        });
    }

}
