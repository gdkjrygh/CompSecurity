// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.utils;

import android.content.ContentResolver;
import android.content.Context;
import android.database.Cursor;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.Proxy;
import android.net.Uri;
import android.net.wifi.WifiManager;
import android.os.Environment;
import android.os.StatFs;
import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectReader;
import com.soundcloud.android.Consts;
import com.soundcloud.android.SoundCloudApplication;
import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import org.apache.http.HttpHost;

// Referenced classes of package com.soundcloud.android.utils:
//            ErrorUtils

public final class IOUtils
{

    private static final int BUFFER_SIZE = 8192;

    private IOUtils()
    {
    }

    public static File appendToFilename(File file, String s)
    {
        String s1 = file.getName();
        int i = s1.lastIndexOf('.');
        if (i != -1)
        {
            String s2 = s1.substring(i, s1.length());
            return new File(file.getParentFile(), (new StringBuilder()).append(s1.substring(0, i)).append(s).append(s2).toString());
        } else
        {
            return new File(file.getParentFile(), (new StringBuilder()).append(file.getName()).append(s).toString());
        }
    }

    public static File changeExtension(File file, String s)
    {
        String s1 = file.getName();
        int i = s1.lastIndexOf('.');
        if (i != -1)
        {
            return new File(file.getParentFile(), (new StringBuilder()).append(s1.substring(0, i)).append(".").append(s).toString());
        } else
        {
            return new File(file.getParentFile(), (new StringBuilder()).append(file.getName()).append(".").append(s).toString());
        }
    }

    public static void cleanDir(File file)
    {
        if (file.isDirectory())
        {
            file = file.listFiles();
            if (file != null && file.length > 0)
            {
                int j = file.length;
                int i = 0;
                while (i < j) 
                {
                    File file1 = file[i];
                    if (file1.isDirectory())
                    {
                        deleteDir(file1);
                    } else
                    {
                        deleteFile(file1);
                    }
                    i++;
                }
            }
        }
    }

    public static transient void cleanDirs(File afile[])
    {
        int j = afile.length;
        for (int i = 0; i < j; i++)
        {
            cleanDir(afile[i]);
        }

    }

    public static void close(Cursor cursor)
    {
        if (cursor != null)
        {
            cursor.close();
        }
    }

    public static void close(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
    }

    public static void consumeStream(HttpURLConnection httpurlconnection)
    {
        if (httpurlconnection == null)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        int i;
        try
        {
            i = httpurlconnection.getContentLength();
        }
        // Misplaced declaration of an exception variable
        catch (HttpURLConnection httpurlconnection)
        {
            httpurlconnection.printStackTrace();
            return;
        }
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        readInputStreamAsBytes(httpurlconnection.getInputStream(), i);
    }

    public static void copy(File file, File file1)
        throws IOException
    {
        file = new FileInputStream(file);
        copy(((InputStream) (file)), file1);
        file.close();
        return;
        file1;
        file.close();
        throw file1;
    }

    public static void copy(InputStream inputstream, File file)
        throws IOException
    {
        file = new FileOutputStream(file);
        byte abyte0[] = new byte[8192];
        do
        {
            int i = inputstream.read(abyte0);
            if (i != -1)
            {
                file.write(abyte0, 0, i);
            } else
            {
                file.close();
                return;
            }
        } while (true);
    }

    public static void createCacheDirs()
    {
        if (isSDCardAvailable())
        {
            mkdirs(Consts.EXTERNAL_STORAGE_DIRECTORY);
            mkdirs(Consts.EXTERNAL_MEDIAPLAYER_STREAM_DIRECTORY);
            mkdirs(Consts.EXTERNAL_SKIPPY_STREAM_DIRECTORY);
            nomedia(Consts.FILES_PATH);
        }
    }

    public static android.net.wifi.WifiManager.WifiLock createHiPerfWifiLock(Context context, String s)
    {
        return ((WifiManager)context.getSystemService("wifi")).createWifiLock(3, s);
    }

    public static boolean deleteDir(File file)
    {
        if (file == null || !file.isDirectory()) goto _L2; else goto _L1
_L1:
        File afile[];
        int i;
        int j;
        afile = nullSafeListFiles(file, null);
        j = afile.length;
        i = 0;
_L5:
        if (i >= j)
        {
            break; /* Loop/switch isn't completed */
        }
        File file1 = afile[i];
        boolean flag;
        if (file1.isDirectory())
        {
            flag = deleteDir(file1);
        } else
        {
            flag = deleteFile(file1);
        }
        if (flag) goto _L3; else goto _L2
_L2:
        return false;
_L3:
        i++;
        if (true) goto _L5; else goto _L4
_L4:
        return file.delete();
    }

    public static boolean deleteFile(File file)
    {
label0:
        {
            if (file != null && file.exists())
            {
                if (file.delete())
                {
                    break label0;
                }
                String s = SoundCloudApplication.TAG;
                (new StringBuilder("could not delete ")).append(file);
            }
            return false;
        }
        return true;
    }

    public static File ensureUpdatedDirectory(File file, File file1)
    {
        mkdirs(file);
        if (file1.exists())
        {
            File afile[] = nullSafeListFiles(file1, null);
            int j = afile.length;
            for (int i = 0; i < j; i++)
            {
                File file2 = afile[i];
                if (!file2.renameTo(new File(file, file2.getName())))
                {
                    String s = SoundCloudApplication.TAG;
                    (new StringBuilder("could not rename ")).append(file2);
                }
            }

            deleteDir(file1);
        }
        return file;
    }

    public static String extension(File file)
    {
        file = file.getName();
        int i = file.lastIndexOf('.');
        if (i != -1 && i != file.length() - 1)
        {
            return file.substring(i + 1, file.length()).toLowerCase(Locale.US);
        } else
        {
            return null;
        }
    }

    public static transient long getDirSize(File afile[])
    {
        long l1 = 0L;
        int k = afile.length;
        for (int i = 0; i < k; i++)
        {
            File file = afile[i];
            File afile1[] = nullSafeListFiles(file, null);
            int l = afile1.length;
            int j = 0;
            while (j < l) 
            {
                File file1 = afile1[j];
                if (file1.isDirectory() && !file.equals(file1))
                {
                    l1 += getDirSize(new File[] {
                        file1
                    });
                } else
                {
                    l1 += file1.length();
                }
                j++;
            }
        }

        return l1;
    }

    public static String getFilenameFromUri(Uri uri, ContentResolver contentresolver)
    {
        contentresolver = contentresolver.query(uri, new String[] {
            "_display_name"
        }, null, null, null);
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_62;
        }
        String s;
        if (!contentresolver.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_62;
        }
        s = contentresolver.getString(contentresolver.getColumnIndex("_display_name"));
        if (s != null)
        {
            if (contentresolver != null)
            {
                contentresolver.close();
            }
            return s;
        }
        if (contentresolver != null)
        {
            contentresolver.close();
        }
_L2:
        return uri.getLastPathSegment();
        Object obj;
        obj;
_L3:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        if (true) goto _L2; else goto _L1
_L1:
        uri;
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw uri;
        obj;
          goto _L3
    }

    public static File getFromMediaUri(ContentResolver contentresolver, Uri uri)
    {
        if (uri != null) goto _L2; else goto _L1
_L1:
        uri = null;
_L4:
        return uri;
_L2:
        if ("file".equals(uri.getScheme()))
        {
            return new File(uri.getPath());
        }
        if (!"content".equals(uri.getScheme()))
        {
            break MISSING_BLOCK_LABEL_168;
        }
        contentresolver = contentresolver.query(uri, new String[] {
            "_data", "_display_name"
        }, null, null, null);
        if (contentresolver == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        int i;
        if (!contentresolver.moveToFirst())
        {
            break MISSING_BLOCK_LABEL_158;
        }
        if (!uri.toString().startsWith("content://com.google.android.gallery3d"))
        {
            break MISSING_BLOCK_LABEL_145;
        }
        i = contentresolver.getColumnIndex("_display_name");
_L5:
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        uri = contentresolver.getString(i);
        if (uri == null)
        {
            break MISSING_BLOCK_LABEL_158;
        }
        File file = new File(uri);
        uri = file;
        if (contentresolver == null) goto _L4; else goto _L3
_L3:
        contentresolver.close();
        return file;
        i = contentresolver.getColumnIndex("_data");
          goto _L5
        if (contentresolver != null)
        {
            contentresolver.close();
        }
_L7:
        return null;
        contentresolver;
        contentresolver = null;
_L10:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        if (true) goto _L7; else goto _L6
_L6:
        uri;
        contentresolver = null;
_L9:
        if (contentresolver != null)
        {
            contentresolver.close();
        }
        throw uri;
        uri;
        if (true) goto _L9; else goto _L8
_L8:
        uri;
          goto _L10
        contentresolver;
        contentresolver = null;
          goto _L10
        uri;
          goto _L10
    }

    public static long getMaxUsableSpace(long l, long l1)
    {
        return Math.min(l1, l);
    }

    public static String getProxy(Context context, NetworkInfo networkinfo)
    {
        if (networkinfo.getType() == 0)
        {
            String s = Proxy.getHost(context);
            networkinfo = s;
            if (s == null)
            {
                networkinfo = Proxy.getDefaultHost();
            }
            int j = Proxy.getPort(context);
            int i = j;
            if (j == -1)
            {
                i = Proxy.getDefaultPort();
            }
            if (networkinfo != null && i >= 0)
            {
                return (new HttpHost(networkinfo, i)).toURI();
            } else
            {
                return null;
            }
        } else
        {
            return null;
        }
    }

    public static long getSpaceLeft(File file)
    {
        int i;
        long l;
        try
        {
            StatFs statfs = new StatFs(file.getAbsolutePath());
            l = statfs.getBlockSize();
            i = statfs.getAvailableBlocks();
        }
        catch (IllegalArgumentException illegalargumentexception)
        {
            String s = SoundCloudApplication.TAG;
            (new StringBuilder("getSpaceLeft(")).append(file).append(")");
            return 0L;
        }
        return (long)i * l;
    }

    public static String inMbFormatted(double d)
    {
        return (new DecimalFormat("#.#")).format(d / 1048576D);
    }

    public static transient String inMbFormatted(File afile[])
    {
        return inMbFormatted(getDirSize(afile));
    }

    public static boolean isConnected(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            context = null;
        } else
        {
            context = context.getActiveNetworkInfo();
        }
        return context != null && context.isConnectedOrConnecting();
    }

    public static boolean isSDCardAvailable()
    {
        return "mounted".equals(Environment.getExternalStorageState());
    }

    public static boolean isWifiConnected(Context context)
    {
        context = (ConnectivityManager)context.getSystemService("connectivity");
        if (context == null)
        {
            context = null;
        } else
        {
            context = context.getNetworkInfo(1);
        }
        return context != null && context.isConnectedOrConnecting();
    }

    public static boolean mkdirs(File file)
    {
        if (!file.exists())
        {
            boolean flag = file.mkdirs();
            if (!flag)
            {
                String s = SoundCloudApplication.TAG;
                (new StringBuilder("mkdir ")).append(file.getAbsolutePath()).append(" returned false");
            }
            return flag;
        } else
        {
            return false;
        }
    }

    public static boolean nomedia(File file)
    {
        if (!file.isDirectory())
        {
            return false;
        }
        file = new File(file, ".nomedia");
        if (file.exists() && file.isFile())
        {
            return true;
        }
        boolean flag;
        try
        {
            flag = file.createNewFile();
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            file = SoundCloudApplication.TAG;
            return false;
        }
        return flag;
    }

    public static File[] nullSafeListFiles(File file, FilenameFilter filenamefilter)
    {
        if (file == null)
        {
            filenamefilter = new File[0];
        } else
        {
            if (filenamefilter != null)
            {
                file = file.listFiles(filenamefilter);
            } else
            {
                file = file.listFiles();
            }
            filenamefilter = file;
            if (file == null)
            {
                return new File[0];
            }
        }
        return filenamefilter;
    }

    public static List parseError(ObjectReader objectreader, InputStream inputstream)
        throws IOException
    {
        ArrayList arraylist = new ArrayList();
        objectreader = objectreader.readTree(inputstream);
        inputstream = objectreader.path("errors").path("error");
        JsonNode jsonnode = objectreader.path("error");
        if (!jsonnode.isTextual())
        {
            break MISSING_BLOCK_LABEL_56;
        }
        arraylist.add(jsonnode.asText());
        return arraylist;
        if (!inputstream.isTextual())
        {
            break MISSING_BLOCK_LABEL_83;
        }
        arraylist.add(inputstream.asText());
        return arraylist;
label0:
        {
            if (objectreader.path("errors").isArray())
            {
                for (objectreader = objectreader.path("errors").iterator(); objectreader.hasNext(); arraylist.add(((JsonNode)objectreader.next()).path("error_message").asText())) { }
                break label0;
            }
            try
            {
                for (objectreader = inputstream.iterator(); objectreader.hasNext(); arraylist.add(((JsonNode)objectreader.next()).asText())) { }
            }
            // Misplaced declaration of an exception variable
            catch (ObjectReader objectreader)
            {
                objectreader = SoundCloudApplication.TAG;
                return arraylist;
            }
        }
        return arraylist;
    }

    public static String readInputStream(InputStream inputstream)
        throws IOException
    {
        inputstream = readInputStreamAsBytes(inputstream);
        return new String(inputstream, 0, inputstream.length, "UTF-8");
    }

    public static byte[] readInputStreamAsBytes(InputStream inputstream)
        throws IOException
    {
        return readInputStreamAsBytes(inputstream, 8192);
    }

    public static byte[] readInputStreamAsBytes(InputStream inputstream, int i)
        throws IOException
    {
        byte abyte0[] = new byte[i];
        ByteArrayOutputStream bytearrayoutputstream = new ByteArrayOutputStream();
        Object obj = inputstream;
        if (!(inputstream instanceof BufferedInputStream))
        {
            obj = new BufferedInputStream(inputstream);
        }
        do
        {
            i = ((InputStream) (obj)).read(abyte0);
            if (i != -1)
            {
                bytearrayoutputstream.write(abyte0, 0, i);
            } else
            {
                bytearrayoutputstream.close();
                ((InputStream) (obj)).close();
                return bytearrayoutputstream.toByteArray();
            }
        } while (true);
    }

    public static File removeExtension(File file)
    {
        if (!file.isDirectory())
        {
            String s = file.getName();
            int i = s.lastIndexOf('.');
            if (i > 0)
            {
                return new File(file.getParent(), s.substring(0, i));
            }
        }
        return file;
    }

    public static boolean renameCaseSensitive(File file, File file1)
    {
        boolean flag1 = false;
        boolean flag;
        if (file.equals(file1))
        {
            flag = file.renameTo(file1);
        } else
        {
            flag = flag1;
            if (file.getParentFile() != null)
            {
                File file2 = new File(file.getParentFile(), (new StringBuilder(".")).append(System.currentTimeMillis()).toString());
                flag = flag1;
                if (file.renameTo(file2))
                {
                    flag = flag1;
                    if (file2.renameTo(file1))
                    {
                        return true;
                    }
                }
            }
        }
        return flag;
    }

    public static void skipFully(InputStream inputstream, long l)
        throws IOException
    {
        while (l > 0L) 
        {
            long l1 = inputstream.skip(l);
            if (l1 == 0L)
            {
                if (inputstream.read() == -1)
                {
                    throw new EOFException();
                }
                l--;
            } else
            {
                l -= l1;
            }
        }
    }

    public static void writeFileFromString(File file, String s)
    {
        FileOutputStream fileoutputstream = new FileOutputStream(file);
        file = fileoutputstream;
        fileoutputstream.write(s.getBytes("UTF-8"));
        close(fileoutputstream);
        return;
        IOException ioexception;
        ioexception;
        s = null;
_L4:
        file = s;
        ErrorUtils.handleThrowable(ioexception, com/soundcloud/android/utils/IOUtils);
        close(s);
        return;
        s;
        file = null;
_L2:
        close(file);
        throw s;
        s;
        if (true) goto _L2; else goto _L1
_L1:
        ioexception;
        s = fileoutputstream;
        if (true) goto _L4; else goto _L3
_L3:
    }
}
