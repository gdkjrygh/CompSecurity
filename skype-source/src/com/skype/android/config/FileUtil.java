// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.config;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Environment;
import android.os.StatFs;
import android.text.TextUtils;
import com.skype.android.app.media.MediaLinkSaveError;
import com.skype.android.util.Charsets;
import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.Flushable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.net.URL;
import java.nio.channels.FileChannel;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public class FileUtil
{

    private static final String PHOTO_EXTENSION = ".jpg";
    private static final String SKYPE_SAVE_PHOTO_PREFIX = "SkypePhoto";
    private static final String SKYPE_SAVE_VIDEO_PREFIX = "SkypeVideo";
    private static final String VIDEO_EXTENSION = ".mp4";
    private static File directory;
    private static final Logger log = Logger.getLogger("FileUtil");

    private FileUtil()
    {
    }

    public static MediaLinkSaveError canSaveMediaUnderGallery(File file)
    {
        if (!checkForMountedExternalStorage())
        {
            return MediaLinkSaveError.MISSING_EXTERNAL_DEVICE;
        }
        if (!file.exists() && !file.mkdir())
        {
            return MediaLinkSaveError.UNKNOWN_ERROR;
        } else
        {
            return MediaLinkSaveError.NONE;
        }
    }

    private static boolean checkForMountedExternalStorage()
    {
        return Environment.getExternalStorageState().equals("mounted");
    }

    public static boolean checkForStorageAvailability(String s, long l)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = new StatFs(s);
            long l1;
            if (android.os.Build.VERSION.SDK_INT >= 18)
            {
                l1 = s.getAvailableBlocksLong() * s.getBlockSizeLong();
            } else
            {
                l1 = (long)s.getAvailableBlocks() * (long)s.getBlockSize();
            }
            if (l1 >= l)
            {
                return true;
            }
        }
        return false;
    }

    public static void closeStream(Closeable closeable)
    {
        if (closeable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        closeable.close();
        return;
        closeable;
        closeable.printStackTrace();
        return;
    }

    public static String consolidateFileName(String s, File file)
    {
        String s1;
        String s2;
        int i;
        if (s.contains("."))
        {
            s1 = s.substring(0, s.lastIndexOf("."));
            s = (new StringBuilder(".")).append(getExtension(s)).toString();
        } else
        {
            s1 = s;
            s = "";
        }
        i = 0;
        for (s2 = (new StringBuilder()).append(s1).append(s).toString(); (new File((new StringBuilder()).append(file).append(File.separator).append(s2).toString())).exists(); s2 = (new StringBuilder()).append(s1).append("-").append(i).append(s).toString())
        {
            i++;
        }

        return s2;
    }

    public static void copy(File file, File file1)
        throws IOException
    {
        File file2;
        File file3;
        Object obj;
        file3 = null;
        obj = null;
        file2 = obj;
        file = (new FileInputStream(file)).getChannel();
        file2 = obj;
        file3 = file;
        file1 = (new FileOutputStream(file1)).getChannel();
        file2 = file1;
        file3 = file;
        file1.transferFrom(file, 0L, file.size());
        closeStream(file);
        closeStream(file1);
        return;
        file;
        closeStream(file3);
        closeStream(file2);
        throw file;
    }

    public static void copy(String s, String s1)
        throws IOException
    {
        copy(new File(s), new File(s1));
    }

    public static MediaLinkSaveError copyFileToGallery(File file, File file1, Context context)
    {
        try
        {
            copy(file, file1);
            saveFileToGallery(file1, context);
            file = MediaLinkSaveError.NONE;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            log.severe(file.toString());
            return MediaLinkSaveError.UNKNOWN_ERROR;
        }
        return file;
    }

    public static MediaLinkSaveError copyVimToGallery(String s, Context context)
    {
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        MediaLinkSaveError medialinksaveerror = canSaveMediaUnderGallery(file);
        if (medialinksaveerror != MediaLinkSaveError.NONE)
        {
            return medialinksaveerror;
        }
        file = createFileForVideoSave(file.getPath(), null);
        s = new File(s);
        if (!s.exists())
        {
            return MediaLinkSaveError.UNKNOWN_ERROR;
        }
        if (!checkForStorageAvailability(Environment.getExternalStorageDirectory().getPath(), s.length()))
        {
            return MediaLinkSaveError.OUT_OF_MEMORY;
        } else
        {
            return copyFileToGallery(s, file, context);
        }
    }

    public static File createFileForPhotoSave(String s, String s1)
    {
        return new File(s, (new StringBuilder()).append(getFileNameToSaveMedia(s1, "SkypePhoto")).append(".jpg").toString());
    }

    public static File createFileForVideoSave(String s, String s1)
    {
        return new File(s, (new StringBuilder()).append(getFileNameToSaveMedia(s1, "SkypeVideo")).append(".mp4").toString());
    }

    public static File createFileFromUri(Uri uri)
    {
        return new File(uri.getPath());
    }

    public static MediaLinkSaveError downloadAndSaveVideoMessage(Context context, String s)
    {
        Object obj = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_MOVIES);
        Object obj1 = canSaveMediaUnderGallery(((File) (obj)));
        if (obj1 != MediaLinkSaveError.NONE)
        {
            return ((MediaLinkSaveError) (obj1));
        }
        File file = createFileForVideoSave(((File) (obj)).getPath(), null);
        obj1 = null;
        Object obj3 = null;
        Object obj2 = null;
        obj = null;
        Object obj4 = null;
        int i;
        try
        {
            s = new BufferedInputStream((new URL(s)).openStream(), 8192);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            context = obj4;
            continue; /* Loop/switch isn't completed */
        }
        finally { }
        obj = new FileOutputStream(file);
        obj1 = new byte[1024];
_L3:
        i = s.read(((byte []) (obj1)));
        if (i == -1) goto _L2; else goto _L1
_L1:
        ((OutputStream) (obj)).write(((byte []) (obj1)), 0, i);
          goto _L3
        obj1;
        context = s;
        obj2 = obj;
        s = ((String) (obj1));
_L7:
        obj = context;
        obj1 = obj2;
        log.severe(s.toString());
        flushStream(((Flushable) (obj2)));
        closeStream(context);
        closeStream(((Closeable) (obj2)));
        return MediaLinkSaveError.UNKNOWN_ERROR;
_L2:
        saveFileToGallery(file, context);
        context = MediaLinkSaveError.NONE;
        flushStream(((Flushable) (obj)));
        closeStream(s);
        closeStream(((Closeable) (obj)));
        return context;
_L5:
        flushStream(((Flushable) (obj1)));
        closeStream(((Closeable) (obj)));
        closeStream(((Closeable) (obj1)));
        throw context;
        context;
        obj = s;
        obj1 = obj3;
        continue; /* Loop/switch isn't completed */
        context;
        obj1 = obj;
        obj = s;
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_66;
        IOException ioexception;
        ioexception;
        context = s;
        s = ioexception;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static boolean exists(File file)
    {
        return file.exists();
    }

    public static void flushStream(Flushable flushable)
    {
        if (flushable == null)
        {
            break MISSING_BLOCK_LABEL_10;
        }
        flushable.flush();
        return;
        flushable;
        flushable.printStackTrace();
        return;
    }

    public static File getDownloadsDirectory()
    {
        if (directory != null && directory.exists())
        {
            return directory;
        }
        File file = Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS);
        directory = file;
        if (!file.exists())
        {
            directory.mkdir();
        }
        return directory;
    }

    public static String getExtension(String s)
    {
        return s.substring(s.lastIndexOf(".") + 1, s.length()).toLowerCase(Locale.getDefault());
    }

    private static String getFileNameToSaveMedia(String s, String s1)
    {
        if (!TextUtils.isEmpty(s))
        {
            s = s.substring(0, s.lastIndexOf("."));
        } else
        {
            s = s1;
        }
        s1 = (new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.US)).format(new Date());
        return (new StringBuilder()).append(s).append("_").append(s1).toString();
    }

    public static String inputStreamToString(InputStream inputstream)
    {
        Object obj;
        Object obj1;
        Object obj3;
        obj1 = null;
        obj3 = null;
        obj = obj1;
        StringBuilder stringbuilder = new StringBuilder();
        obj = obj1;
        inputstream = new BufferedReader(new InputStreamReader(inputstream, Charsets.a), 4096);
        obj = new char[4096];
_L3:
        int i = inputstream.read(((char []) (obj)));
        if (i <= 0) goto _L2; else goto _L1
_L1:
        stringbuilder.append(((char []) (obj)), 0, i);
          goto _L3
        Object obj2;
        obj2;
_L7:
        obj = inputstream;
        log.log(Level.SEVERE, "Stream to String convertion failed", ((Throwable) (obj2)));
        closeStream(inputstream);
        return null;
_L2:
        obj = stringbuilder.toString();
        closeStream(inputstream);
        return ((String) (obj));
        inputstream;
_L5:
        closeStream(((Closeable) (obj)));
        throw inputstream;
        obj2;
        obj = inputstream;
        inputstream = ((InputStream) (obj2));
        if (true) goto _L5; else goto _L4
_L4:
        obj2;
        inputstream = obj3;
        if (true) goto _L7; else goto _L6
_L6:
    }

    public static String load(Context context, String s)
        throws IOException
    {
        return inputStreamToString(context.openFileInput(s));
    }

    public static int readFully(byte abyte0[], InputStream inputstream)
        throws IOException
    {
        int l = abyte0.length;
        int i = 0;
        do
        {
            int k = inputstream.read(abyte0, i, l);
            int j;
            if (k != -1)
            {
                j = k;
            } else
            {
                j = 0;
            }
            j = i + j;
            if (j >= l)
            {
                break;
            }
            i = j;
        } while (k != -1);
        return j;
    }

    public static void save(Context context, String s, String s1)
        throws IOException
    {
        Context context1 = null;
        context = context.openFileOutput(s, 0);
        context1 = context;
        context.write(s1.getBytes(Charsets.a));
        flushStream(context);
        closeStream(context);
        return;
        context;
        flushStream(context1);
        closeStream(context1);
        throw context;
    }

    public static void saveFileToGallery(File file, Context context)
    {
        context.sendBroadcast(new Intent("android.intent.action.MEDIA_SCANNER_SCAN_FILE", Uri.fromFile(file)));
    }

}
