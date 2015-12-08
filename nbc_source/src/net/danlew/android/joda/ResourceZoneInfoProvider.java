// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package net.danlew.android.joda;

import android.content.Context;
import android.content.res.Resources;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.ref.SoftReference;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.concurrent.ConcurrentHashMap;
import org.joda.time.DateTimeZone;
import org.joda.time.tz.DateTimeZoneBuilder;
import org.joda.time.tz.Provider;

// Referenced classes of package net.danlew.android.joda:
//            ResUtils

public class ResourceZoneInfoProvider
    implements Provider
{

    private final Map iZoneInfoMap;
    private Context mAppContext;

    public ResourceZoneInfoProvider(Context context)
        throws IOException
    {
        if (context == null)
        {
            throw new IllegalArgumentException("Context must not be null");
        } else
        {
            mAppContext = context.getApplicationContext();
            iZoneInfoMap = loadZoneInfoMap(openResource("ZoneInfoMap"));
            return;
        }
    }

    private DateTimeZone loadZoneData(String s)
    {
        InputStream inputstream;
        InputStream inputstream1;
        inputstream1 = null;
        inputstream = null;
        InputStream inputstream2 = openResource(s);
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        DateTimeZone datetimezone = DateTimeZoneBuilder.readFrom(inputstream2, s);
        inputstream = inputstream2;
        inputstream1 = inputstream2;
        iZoneInfoMap.put(s, new SoftReference(datetimezone));
        s = datetimezone;
        if (inputstream2 != null)
        {
            IOException ioexception1;
            try
            {
                inputstream2.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return datetimezone;
            }
            s = datetimezone;
        }
        return s;
        ioexception1;
        inputstream1 = inputstream;
        uncaughtException(ioexception1);
        inputstream1 = inputstream;
        iZoneInfoMap.remove(s);
        s = null;
        if (inputstream != null)
        {
            try
            {
                inputstream.close();
            }
            // Misplaced declaration of an exception variable
            catch (String s)
            {
                return null;
            }
            return null;
        } else
        {
            break MISSING_BLOCK_LABEL_67;
        }
        s;
        if (inputstream1 != null)
        {
            try
            {
                inputstream1.close();
            }
            catch (IOException ioexception) { }
        }
        throw s;
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
        if (mAppContext == null)
        {
            throw new RuntimeException("Need to call JodaTimeAndroid.init() before using joda-time-android");
        }
        String s1 = ResUtils.getTzResource(s);
        int i = ResUtils.getIdentifier(net/danlew/android/joda/R$raw, s1);
        if (i == 0)
        {
            throw new IOException((new StringBuilder()).append("Resource not found: \"").append(s).append("\" (resName: \"").append(s1).append("\"").toString());
        } else
        {
            return mAppContext.getResources().openRawResource(i);
        }
    }

    private static void readZoneInfoMap(DataInputStream datainputstream, Map map)
        throws IOException
    {
        int k = datainputstream.readUnsignedShort();
        String as[] = new String[k];
        for (int i = 0; i < k; i++)
        {
            as[i] = datainputstream.readUTF().intern();
        }

        k = datainputstream.readUnsignedShort();
        int j = 0;
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
        return new TreeSet(iZoneInfoMap.keySet());
    }

    public DateTimeZone getZone(String s)
    {
        Object obj = null;
        Object obj1;
        if (s != null)
        {
            if ((obj1 = iZoneInfoMap.get(s)) != null)
            {
                if (s.equals(obj1))
                {
                    return loadZoneData(s);
                }
                if (obj1 instanceof SoftReference)
                {
                    obj1 = (DateTimeZone)((SoftReference)obj1).get();
                    obj = obj1;
                    if (obj1 == null)
                    {
                        return loadZoneData(s);
                    }
                } else
                {
                    return getZone((String)obj1);
                }
            }
        }
        return ((DateTimeZone) (obj));
    }

    protected void uncaughtException(Exception exception)
    {
        exception.printStackTrace();
    }
}
