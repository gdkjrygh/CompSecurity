// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import com.fasterxml.jackson.core.h;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.io.Reader;
import java.io.UnsupportedEncodingException;
import java.util.Properties;
import java.util.regex.Pattern;

public class g
{

    public static final String a = "VERSION.txt";
    public static final String b = "PackageVersion";
    private static final Pattern c = Pattern.compile("[-_./;:]");
    private final Version d;

    protected g()
    {
        Version version;
        version = null;
        Version version1 = a(getClass());
        version = version1;
_L2:
        Version version2 = version;
        if (version == null)
        {
            version2 = Version.a();
        }
        d = version2;
        return;
        Exception exception;
        exception;
        System.err.println((new StringBuilder()).append("ERROR: Failed to load Version information for bundle (via ").append(getClass().getName()).append(").").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    private static Version a(Reader reader)
    {
        Object obj2;
        BufferedReader bufferedreader;
        obj2 = null;
        bufferedreader = new BufferedReader(reader);
        String s = bufferedreader.readLine();
        if (s == null) goto _L2; else goto _L1
_L1:
        Object obj1 = bufferedreader.readLine();
        Object obj;
        obj = obj1;
        reader = obj2;
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_46;
        }
        reader = bufferedreader.readLine();
        obj = obj1;
_L6:
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj1) { }
_L3:
        obj1 = obj;
        if (obj != null)
        {
            obj1 = ((String) (obj)).trim();
        }
        obj = reader;
        if (reader != null)
        {
            obj = reader.trim();
        }
        return a(s, ((String) (obj1)), ((String) (obj)));
        reader;
        reader = null;
        s = null;
_L4:
        bufferedreader.close();
        obj = reader;
        reader = null;
          goto _L3
        obj;
        obj = reader;
        reader = null;
          goto _L3
        reader;
        try
        {
            bufferedreader.close();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj) { }
        throw reader;
        reader;
        reader = null;
          goto _L4
        reader;
        reader = ((Reader) (obj1));
          goto _L4
_L2:
        obj = null;
        reader = obj2;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public static Version a(Class class1)
    {
        Version version = b(class1);
        if (version != null)
        {
            return version;
        }
        class1 = class1.getResourceAsStream("VERSION.txt");
        if (class1 == null)
        {
            return Version.a();
        }
        Object obj = new InputStreamReader(class1, "UTF-8");
        Version version1 = a(((Reader) (obj)));
        ((InputStreamReader) (obj)).close();
_L2:
        try
        {
            class1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        return version1;
        Exception exception;
        exception;
        Object obj1;
        try
        {
            ((InputStreamReader) (obj)).close();
        }
        catch (IOException ioexception) { }
        throw exception;
        obj1;
        obj1 = Version.a();
        try
        {
            class1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        return ((Version) (obj1));
        obj1;
        try
        {
            class1.close();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw new RuntimeException(class1);
        }
        throw obj1;
        obj1;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Version a(ClassLoader classloader, String s, String s1)
    {
        classloader = classloader.getResourceAsStream((new StringBuilder()).append("META-INF/maven/").append(s.replaceAll("\\.", "/")).append("/").append(s1).append("/pom.properties").toString());
        if (classloader == null)
        {
            break MISSING_BLOCK_LABEL_99;
        }
        s = new Properties();
        s.load(classloader);
        s1 = s.getProperty("version");
        String s2 = s.getProperty("artifactId");
        s = a(s1, s.getProperty("groupId"), s2);
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            return s;
        }
        return s;
        s;
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader) { }
        return Version.a();
        s;
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader) { }
        throw s;
    }

    public static Version a(String s)
    {
        return a(s, null, null);
    }

    public static Version a(String s, String s1, String s2)
    {
        Object obj = null;
        if (s != null)
        {
            if ((s = s.trim()).length() != 0)
            {
                String as[] = c.split(s);
                int k = b(as[0]);
                int i;
                int j;
                if (as.length > 1)
                {
                    i = b(as[1]);
                } else
                {
                    i = 0;
                }
                if (as.length > 2)
                {
                    j = b(as[2]);
                } else
                {
                    j = 0;
                }
                s = obj;
                if (as.length > 3)
                {
                    s = as[3];
                }
                return new Version(k, i, j, s, s1, s2);
            }
        }
        return null;
    }

    protected static int b(String s)
    {
        int i = 0;
        s = s.toString();
        int k = s.length();
        int j = 0;
        do
        {
            char c1;
label0:
            {
                if (i < k)
                {
                    c1 = s.charAt(i);
                    if (c1 <= '9' && c1 >= '0')
                    {
                        break label0;
                    }
                }
                return j;
            }
            j = j * 10 + (c1 - 48);
            i++;
        } while (true);
    }

    public static Version b(Class class1)
    {
        Object obj;
        try
        {
            class1 = Class.forName((new StringBuilder(class1.getPackage().getName())).append(".").append("PackageVersion").toString(), true, class1.getClassLoader());
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            return null;
        }
        if (class1 == null)
        {
            return null;
        }
        try
        {
            obj = class1.newInstance();
        }
        // Misplaced declaration of an exception variable
        catch (Class class1)
        {
            throw class1;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Failed to instantiate ").append(class1.getName()).append(" to find version information, problem: ").append(((Exception) (obj)).getMessage()).toString(), ((Throwable) (obj)));
        }
        if (!(obj instanceof h))
        {
            throw new IllegalArgumentException((new StringBuilder()).append("Bad version class ").append(class1.getName()).append(": does not implement ").append(com/fasterxml/jackson/core/h.getName()).toString());
        } else
        {
            return ((h)obj).d();
        }
    }

    public static final void b()
    {
        throw new RuntimeException("Internal error: this code path should never get executed");
    }

    public Version a()
    {
        return d;
    }

}
