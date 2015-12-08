// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.joda.time.tz;

import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Collections;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;

// Referenced classes of package org.joda.time.tz:
//            Provider, DateTimeZoneBuilder

public class ZoneInfoProvider
    implements Provider
{

    private final File iFileDir;
    private final ClassLoader iLoader;
    private final String iResourcePath;
    private final Set iZoneInfoKeys;
    private final Map iZoneInfoMap;

    public ZoneInfoProvider(File file)
        throws IOException
    {
        if (file == null)
        {
            throw new IllegalArgumentException("No file directory provided");
        }
        if (!file.exists())
        {
            throw new IOException((new StringBuilder()).append("File directory doesn't exist: ").append(file).toString());
        }
        if (!file.isDirectory())
        {
            throw new IOException((new StringBuilder()).append("File doesn't refer to a directory: ").append(file).toString());
        } else
        {
            iFileDir = file;
            iResourcePath = null;
            iLoader = null;
            iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(iZoneInfoMap.keySet()));
            return;
        }
    }

    public ZoneInfoProvider(String s)
        throws IOException
    {
        this(s, null, false);
    }

    public ZoneInfoProvider(String s, ClassLoader classloader)
        throws IOException
    {
        this(s, classloader, true);
    }

    private ZoneInfoProvider(String s, ClassLoader classloader, boolean flag)
        throws IOException
    {
        if (s == null)
        {
            throw new IllegalArgumentException("No resource path provided");
        }
        String s1 = s;
        if (!s.endsWith("/"))
        {
            s1 = (new StringBuilder()).append(s).append('/').toString();
        }
        iFileDir = null;
        iResourcePath = s1;
        s = classloader;
        if (classloader == null)
        {
            s = classloader;
            if (!flag)
            {
                s = getClass().getClassLoader();
            }
        }
        iLoader = s;
        iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
        iZoneInfoKeys = Collections.unmodifiableSortedSet(new TreeSet(iZoneInfoMap.keySet()));
    }

    private DateTimeZone loadZoneData(String s)
    {
        InputStream inputstream1 = openResource(s);
        InputStream inputstream = inputstream1;
        Object obj = DateTimeZoneBuilder.readFrom(inputstream1, s);
        inputstream = inputstream1;
        iZoneInfoMap.put(s, new SoftReference(obj));
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return ((DateTimeZone) (obj));
            }
        }
        return ((DateTimeZone) (obj));
        obj;
        inputstream1 = null;
_L4:
        inputstream = inputstream1;
        uncaughtException(((Exception) (obj)));
        inputstream = inputstream1;
        iZoneInfoMap.remove(s);
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s) { }
        }
        return null;
        s;
        inputstream = null;
_L2:
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            catch (IOException ioexception) { }
        }
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        if (true) goto _L4; else goto _L3
_L3:
    }

    private static Map loadZoneInfoMap(InputStream inputstream)
        throws IOException
    {
        ConcurrentHashMap concurrenthashmap;
        concurrenthashmap = new ConcurrentHashMap();
        inputstream = new DataInputStream(inputstream);
        readZoneInfoMap(inputstream, concurrenthashmap);
        Exception exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        concurrenthashmap.put("UTC", new SoftReference(DateTimeZone.UTC));
        return concurrenthashmap;
        exception;
        try
        {
            inputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream) { }
        throw exception;
    }

    private InputStream openResource(String s)
        throws IOException
    {
        Object obj;
        if (iFileDir != null)
        {
            obj = new FileInputStream(new File(iFileDir, s));
        } else
        {
            String s1 = iResourcePath.concat(s);
            if (iLoader != null)
            {
                s = iLoader.getResourceAsStream(s1);
            } else
            {
                s = ClassLoader.getSystemResourceAsStream(s1);
            }
            obj = s;
            if (s == null)
            {
                StringBuilder stringbuilder = (new StringBuilder(40)).append("Resource not found: \"").append(s1).append("\" ClassLoader: ");
                if (iLoader != null)
                {
                    s = iLoader.toString();
                } else
                {
                    s = "system";
                }
                throw new IOException(stringbuilder.append(s).toString());
            }
        }
        return ((InputStream) (obj));
    }

    private static void readZoneInfoMap(DataInputStream datainputstream, Map map)
        throws IOException
    {
        boolean flag = false;
        int k = datainputstream.readUnsignedShort();
        String as[] = new String[k];
        for (int i = 0; i < k; i++)
        {
            as[i] = datainputstream.readUTF().intern();
        }

        k = datainputstream.readUnsignedShort();
        int j = ((flag) ? 1 : 0);
        while (j < k) 
        {
            try
            {
                map.put(as[datainputstream.readUnsignedShort()], as[datainputstream.readUnsignedShort()]);
            }
            // Misplaced declaration of an exception variable
            catch (DataInputStream datainputstream)
            {
                throw new IOException("Corrupt zone info map");
            }
            j++;
        }
    }

    public Set getAvailableIDs()
    {
        return iZoneInfoKeys;
    }

    public DateTimeZone getZone(String s)
    {
        Object obj;
        if (s == null)
        {
            obj = null;
        } else
        {
            obj = iZoneInfoMap.get(s);
            if (obj == null)
            {
                return null;
            }
            if (obj instanceof SoftReference)
            {
                DateTimeZone datetimezone = (DateTimeZone)((SoftReference)obj).get();
                obj = datetimezone;
                if (datetimezone == null)
                {
                    return loadZoneData(s);
                }
            } else
            if (s.equals(obj))
            {
                return loadZoneData(s);
            } else
            {
                return getZone((String)obj);
            }
        }
        return ((DateTimeZone) (obj));
    }

    protected void uncaughtException(Exception exception)
    {
        exception.printStackTrace();
    }
}
