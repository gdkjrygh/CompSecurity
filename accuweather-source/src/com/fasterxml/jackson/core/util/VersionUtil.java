// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.Version;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Properties;
import java.util.regex.Pattern;

public class VersionUtil
{

    public static final String VERSION_FILE = "VERSION.txt";
    private static final Pattern VERSION_SEPARATOR = Pattern.compile("[-_./;:]");
    private final Version _version;

    protected VersionUtil()
    {
        Version version1;
        version1 = null;
        Version version2 = versionFor(getClass());
        version1 = version2;
_L2:
        Version version3 = version1;
        if (version1 == null)
        {
            version3 = Version.unknownVersion();
        }
        _version = version3;
        return;
        Exception exception;
        exception;
        System.err.println((new StringBuilder()).append("ERROR: Failed to load Version information for bundle (via ").append(getClass().getName()).append(").").toString());
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Version mavenVersionFor(ClassLoader classloader, String s, String s1)
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
        s = parseVersion(s1, s.getProperty("groupId"), s2);
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
        return Version.unknownVersion();
        s;
        try
        {
            classloader.close();
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader) { }
        throw s;
    }

    public static Version parseVersion(String s)
    {
        return parseVersion(s, null, null);
    }

    public static Version parseVersion(String s, String s1, String s2)
    {
        Object obj = null;
        if (s != null)
        {
            if ((s = s.trim()).length() != 0)
            {
                String as[] = VERSION_SEPARATOR.split(s);
                int k = parseVersionPart(as[0]);
                int i;
                int j;
                if (as.length > 1)
                {
                    i = parseVersionPart(as[1]);
                } else
                {
                    i = 0;
                }
                if (as.length > 2)
                {
                    j = parseVersionPart(as[2]);
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

    protected static int parseVersionPart(String s)
    {
        s = s.toString();
        int k = s.length();
        int j = 0;
        int i = 0;
        do
        {
            char c;
label0:
            {
                if (i < k)
                {
                    c = s.charAt(i);
                    if (c <= '9' && c >= '0')
                    {
                        break label0;
                    }
                }
                return j;
            }
            j = j * 10 + (c - 48);
            i++;
        } while (true);
    }

    public static Version versionFor(Class class1)
    {
        Object obj;
        IOException ioexception;
        String s;
        ioexception = null;
        s = null;
        obj = ioexception;
        InputStream inputstream = class1.getResourceAsStream("VERSION.txt");
        class1 = s;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_120;
        }
        BufferedReader bufferedreader = new BufferedReader(new InputStreamReader(inputstream, "UTF-8"));
        obj = null;
        s = null;
        String s2 = bufferedreader.readLine();
        class1 = s;
        if (s2 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        String s1 = bufferedreader.readLine();
        class1 = s;
        obj = s1;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        s = s1.trim();
        s1 = bufferedreader.readLine();
        class1 = s1;
        obj = s;
        if (s1 == null)
        {
            break MISSING_BLOCK_LABEL_107;
        }
        class1 = s1.trim();
        obj = s;
        class1 = parseVersion(s2, ((String) (obj)), class1);
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (IOException ioexception)
        {
            obj = class1;
            try
            {
                throw new RuntimeException(ioexception);
            }
            // Misplaced declaration of an exception variable
            catch (Class class1)
            {
                class1 = ((Class) (obj));
            }
        }
        obj = class1;
        if (class1 == null)
        {
            obj = Version.unknownVersion();
        }
        return ((Version) (obj));
        class1;
        inputstream.close();
        obj = ioexception;
        throw class1;
        class1;
        obj = ioexception;
        throw new RuntimeException(class1);
    }

    public Version version()
    {
        return _version;
    }

}
