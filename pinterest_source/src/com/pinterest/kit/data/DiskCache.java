// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.kit.data;

import android.app.Application;
import android.os.StatFs;
import com.pinterest.kit.application.PApplication;
import com.pinterest.kit.log.PLog;
import com.pinterest.kit.utils.IOUtils;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import com.pinterest.reporting.CrashReporting;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DiskCache
{

    public static final String CINEMATIC_GIF = "Cinematic";
    public static final String CONNECTION_QUALITY = "CONNECTION_QUALITY";
    public static final String CONTEXTUAL_EXPLORE = "CONTEXTUAL_EXPLORE";
    public static final String COUNTRIES = "COUNTRIES";
    public static final String EXPLORE_TOPIC_DATA = "EXPLORE_TOPIC_DATA";
    public static final String MY_DIGEST_FEED = "MY_DIGEST_FEED";
    public static final String MY_EXPERIMENTS = "MY_EXPERIMENTS";
    public static final String MY_HOME_FEED = "MY_HOME_FEED";
    public static final String MY_PICKER_BOARDS = "MY_PICKER_BOARDS";
    public static final String MY_PINPICKS_FEED = "MY_PINPICKS_FEED";
    public static final String MY_USED_BOARDS = "MY_USED_BOARDS_v2";
    public static final String MY_USED_CATEGORIES = "MY_USED_CATEGORIES_v2";
    public static final String MY_USED_INTERESTS = "MY_USED_INTERESTS";
    public static final String PIN_GIF_DATA = "PIN_GIF_DATA";
    public static final String RECENT_CONVERSATIONS = "RECENT_CONVERSATIONS";
    public static final String SILENCED_URL = "SILENCED_URL";
    private static final String TAG = "DiskCache";

    public DiskCache()
    {
    }

    public static boolean cacheFileExists(String s, String s1)
    {
        return (new File(String.format("%s/%s", new Object[] {
            new File(getCachePath(), s1), Integer.valueOf(s.hashCode())
        }))).exists();
    }

    public static void clean()
    {
        delete("MY_EXPERIMENTS");
        delete("MY_HOME_FEED");
        delete("MY_PICKER_BOARDS");
        delete("MY_USED_BOARDS_v2");
        delete("MY_USED_CATEGORIES_v2");
        delete("MY_USED_INTERESTS");
        delete("COUNTRIES");
        delete("RECENT_CONVERSATIONS");
        delete("MY_DIGEST_FEED");
        delete("EXPLORE_TOPIC_DATA");
        delete("PIN_GIF_DATA");
        delete("CONNECTION_QUALITY");
        delete("Cinematic");
        delete("CONTEXTUAL_EXPLORE");
    }

    public static void delete(String s)
    {
        getCacheFile(s).delete();
    }

    public static File ensureDirectory(String s)
    {
        s = new File(getCachePath(), s);
        if (!s.exists())
        {
            s.mkdirs();
        }
        return s;
    }

    public static byte[] getBytes(String s)
    {
        return IOUtils.loadFileBytes(getCacheFile(s));
    }

    public static File getCacheFile(String s)
    {
        return new File(getCacheFilePath(s));
    }

    private static String getCacheFilePath(String s)
    {
        String s1 = String.format("%s/%s", new Object[] {
            getCachePath(), s
        });
        File file = new File(s1);
        if (!file.exists())
        {
            try
            {
                file.createNewFile();
            }
            catch (IOException ioexception)
            {
                if (s.equals("MY_HOME_FEED"))
                {
                    CrashReporting.a(new IOException((new StringBuilder()).append(s).append(" org_msg:").append(ioexception.getMessage()).toString()));
                }
                PLog.warn("#getCacheFilePath", new Object[] {
                    ioexception
                });
                return s1;
            }
        }
        return s1;
    }

    public static List getCacheFiles(String s)
    {
        s = new File(getCachePath(), s);
        if (s.exists())
        {
            return Arrays.asList(s.listFiles());
        } else
        {
            return new ArrayList();
        }
    }

    private static String getCachePath()
    {
        File file = new File(PApplication.context().getCacheDir(), "json");
        if (!file.exists())
        {
            file.mkdir();
        }
        return file.getPath();
    }

    public static File getDirectoryCacheFile(String s, String s1)
    {
        return new File(String.format("%s/%s", new Object[] {
            new File(getCachePath(), s1), Integer.valueOf(s.hashCode())
        }));
    }

    public static long getFreeSpace()
    {
        StatFs statfs = new StatFs(getCachePath());
        long l = statfs.getAvailableBlocks();
        return (long)statfs.getBlockSize() * l;
    }

    public static PinterestJsonArray getJsonArray(String s)
    {
        try
        {
            s = new PinterestJsonArray(IOUtils.loadFileString(getCacheFile(s)));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static PinterestJsonObject getJsonObject(String s)
    {
        String s1 = IOUtils.loadFileString(new File(getCacheFilePath(s)));
        PinterestJsonObject pinterestjsonobject = new PinterestJsonObject(s1);
        return pinterestjsonobject;
        Exception exception;
        exception;
        s1 = null;
_L2:
        if (s.equals("MY_HOME_FEED"))
        {
            CrashReporting.a(new Exception((new StringBuilder()).append(s).append(" org_msg:").append(exception.getMessage()).append(" json string [").append(String.valueOf(s1)).append("] ").toString()));
        }
        return null;
        exception;
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static String getJsonString(String s)
    {
        String s1 = null;
        String s2 = IOUtils.loadFileString(new File(getCacheFilePath(s)));
        s1 = s2;
_L2:
        return s1;
        Exception exception;
        exception;
        if (s.equals("MY_HOME_FEED"))
        {
            CrashReporting.a(new Exception((new StringBuilder()).append(s).append(" org_msg:").append(exception.getMessage()).append(" json string [").append(String.valueOf(null)).append("] ").toString()));
            return null;
        }
        if (true) goto _L2; else goto _L1
_L1:
    }

    public static Object getSerializable(String s)
    {
        Object obj = new ObjectInputStream(new BufferedInputStream(new FileInputStream(getCacheFilePath(s))));
        s = ((String) (obj));
        Object obj1 = ((ObjectInputStream) (obj)).readObject();
        org.apache.commons.io.IOUtils.closeQuietly(((java.io.InputStream) (obj)));
        return obj1;
        Object obj2;
        obj2;
        obj = null;
_L4:
        s = ((String) (obj));
        PLog.warn("#getSerializable", new Object[] {
            obj2
        });
        org.apache.commons.io.IOUtils.closeQuietly(((java.io.InputStream) (obj)));
        return null;
        s;
        obj2 = null;
        obj = s;
_L2:
        org.apache.commons.io.IOUtils.closeQuietly(((java.io.InputStream) (obj2)));
        throw obj;
        obj;
        obj2 = s;
        if (true) goto _L2; else goto _L1
_L1:
        obj2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public static void setBytes(String s, byte abyte0[])
    {
        IOUtils.writeFile(getCacheFile(s), abyte0);
    }

    public static void setJsonArray(String s, PinterestJsonArray pinterestjsonarray)
    {
        IOUtils.writeFile(getCacheFile(s), pinterestjsonarray.toString());
    }

    public static void setJsonObject(String s, PinterestJsonObject pinterestjsonobject)
    {
        IOUtils.writeFile(getCacheFile(s), pinterestjsonobject.toString());
    }

    public static void setJsonString(String s, String s1)
    {
        IOUtils.writeFile(getCacheFile(s), s1);
    }

    public static void setSerializable(String s, Serializable serializable)
    {
        Exception exception = null;
        Object obj = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(getCacheFilePath(s))));
        s = ((String) (obj));
        ((ObjectOutputStream) (obj)).writeObject(serializable);
        org.apache.commons.io.IOUtils.closeQuietly(((java.io.OutputStream) (obj)));
        return;
        exception;
        serializable = null;
_L4:
        s = serializable;
        PLog.warn("#setSerializable", new Object[] {
            exception
        });
        org.apache.commons.io.IOUtils.closeQuietly(serializable);
        return;
        s;
        serializable = exception;
_L2:
        org.apache.commons.io.IOUtils.closeQuietly(serializable);
        throw s;
        obj;
        serializable = s;
        s = ((String) (obj));
        if (true) goto _L2; else goto _L1
_L1:
        exception;
        serializable = ((Serializable) (obj));
        if (true) goto _L4; else goto _L3
_L3:
    }
}
