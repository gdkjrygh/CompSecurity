// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.apache.http.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public class VersionInfo
{

    public static final String PROPERTY_MODULE = "info.module";
    public static final String PROPERTY_RELEASE = "info.release";
    public static final String PROPERTY_TIMESTAMP = "info.timestamp";
    public static final String UNAVAILABLE = "UNAVAILABLE";
    public static final String VERSION_PROPERTY_FILE = "version.properties";
    private final String infoClassloader;
    private final String infoModule;
    private final String infoPackage;
    private final String infoRelease;
    private final String infoTimestamp;

    protected VersionInfo(String s, String s1, String s2, String s3, String s4)
    {
        if (s == null)
        {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        infoPackage = s;
        if (s1 == null)
        {
            s1 = "UNAVAILABLE";
        }
        infoModule = s1;
        if (s2 == null)
        {
            s2 = "UNAVAILABLE";
        }
        infoRelease = s2;
        if (s3 == null)
        {
            s3 = "UNAVAILABLE";
        }
        infoTimestamp = s3;
        if (s4 == null)
        {
            s4 = "UNAVAILABLE";
        }
        infoClassloader = s4;
    }

    protected static final VersionInfo fromMap(String s, Map map, ClassLoader classloader)
    {
        Object obj3 = null;
        if (s == null)
        {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        Object obj;
        Object obj1;
        if (map != null)
        {
            obj = (String)map.get("info.module");
            if (obj != null && ((String) (obj)).length() <= 0)
            {
                obj = null;
            }
            obj1 = (String)map.get("info.release");
            if (obj1 != null && (((String) (obj1)).length() <= 0 || ((String) (obj1)).equals("${pom.version}")))
            {
                obj1 = null;
            }
            Object obj2 = (String)map.get("info.timestamp");
            if (obj2 != null && (((String) (obj2)).length() <= 0 || ((String) (obj2)).equals("${mvn.timestamp}")))
            {
                Object obj4 = null;
                map = ((Map) (obj1));
                obj2 = obj;
                obj1 = obj4;
                obj = map;
                map = ((Map) (obj2));
            } else
            {
                map = ((Map) (obj));
                obj = obj1;
                obj1 = obj2;
            }
        } else
        {
            obj1 = null;
            obj = null;
            map = null;
        }
        obj2 = obj3;
        if (classloader != null)
        {
            obj2 = classloader.toString();
        }
        return new VersionInfo(s, map, ((String) (obj)), ((String) (obj1)), ((String) (obj2)));
    }

    public static final VersionInfo loadVersionInfo(String s, ClassLoader classloader)
    {
        ClassLoader classloader1;
        VersionInfo versioninfo;
        versioninfo = null;
        if (s == null)
        {
            throw new IllegalArgumentException("Package identifier must not be null.");
        }
        classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = Thread.currentThread().getContextClassLoader();
        }
        InputStream inputstream = classloader1.getResourceAsStream((new StringBuilder()).append(s.replace('.', '/')).append("/version.properties").toString());
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_112;
        }
        classloader = new Properties();
        classloader.load(inputstream);
        try
        {
            inputstream.close();
        }
        catch (IOException ioexception) { }
        if (classloader != null)
        {
            versioninfo = fromMap(s, classloader, classloader1);
        }
        return versioninfo;
        classloader;
        try
        {
            inputstream.close();
            throw classloader;
        }
        // Misplaced declaration of an exception variable
        catch (ClassLoader classloader)
        {
            classloader = null;
        }
        continue;
label0:
        {
            for (classloader = null; true;)
            {
                break MISSING_BLOCK_LABEL_85;
            }

            break label0;
        }
    }

    public static final VersionInfo[] loadVersionInfo(String as[], ClassLoader classloader)
    {
        if (as == null)
        {
            throw new IllegalArgumentException("Package identifier list must not be null.");
        }
        ArrayList arraylist = new ArrayList(as.length);
        for (int i = 0; i < as.length; i++)
        {
            VersionInfo versioninfo = loadVersionInfo(as[i], classloader);
            if (versioninfo != null)
            {
                arraylist.add(versioninfo);
            }
        }

        return (VersionInfo[])arraylist.toArray(new VersionInfo[arraylist.size()]);
    }

    public final String getClassloader()
    {
        return infoClassloader;
    }

    public final String getModule()
    {
        return infoModule;
    }

    public final String getPackage()
    {
        return infoPackage;
    }

    public final String getRelease()
    {
        return infoRelease;
    }

    public final String getTimestamp()
    {
        return infoTimestamp;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(infoPackage.length() + 20 + infoModule.length() + infoRelease.length() + infoTimestamp.length() + infoClassloader.length());
        stringbuilder.append("VersionInfo(").append(infoPackage).append(':').append(infoModule);
        if (!"UNAVAILABLE".equals(infoRelease))
        {
            stringbuilder.append(':').append(infoRelease);
        }
        if (!"UNAVAILABLE".equals(infoTimestamp))
        {
            stringbuilder.append(':').append(infoTimestamp);
        }
        stringbuilder.append(')');
        if (!"UNAVAILABLE".equals(infoClassloader))
        {
            stringbuilder.append('@').append(infoClassloader);
        }
        return stringbuilder.toString();
    }
}
