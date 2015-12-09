// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.util;

import android.content.Context;
import android.content.res.AssetManager;
import android.os.Environment;
import com.netflix.mediaclient.Log;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;

// Referenced classes of package com.netflix.mediaclient.util:
//            IoUtil

public final class FileUtils
{

    public static final int BYTES_PER_KB = 1024;
    public static final int BYTES_PER_MB = 0x100000;
    private static final String TAG = "FileUtils";

    private FileUtils()
    {
    }

    public static boolean copyFileFromAssetToFS(Context context, String s, String s1, boolean flag)
    {
        int i;
        boolean flag1;
        flag1 = false;
        i = 0;
        Object obj = context.openFileInput(s1);
        if (obj != null)
        {
            i = 1;
        }
        IoUtil.safeClose(((java.io.Closeable) (obj)));
_L2:
        if (i && !flag)
        {
            return false;
        }
        break; /* Loop/switch isn't completed */
        FileNotFoundException filenotfoundexception;
        filenotfoundexception;
        IoUtil.safeClose(null);
        i = ((flag1) ? 1 : 0);
        if (true) goto _L2; else goto _L1
        context;
        IoUtil.safeClose(null);
        throw context;
_L1:
        Context context1;
        String s2;
        Context context2;
        Object obj1;
        Object obj2;
        if (i && flag && !context.deleteFile(s1))
        {
            Log.e("FileUtils", "Failed to delete file");
        }
        s2 = null;
        filenotfoundexception = null;
        obj2 = null;
        obj1 = null;
        context1 = obj1;
        context2 = obj2;
        s1 = context.openFileOutput(s1, 0);
        filenotfoundexception = s1;
        context1 = obj1;
        s2 = s1;
        context2 = obj2;
        context = context.getAssets().open(s);
        if (context != null)
        {
            break MISSING_BLOCK_LABEL_166;
        }
        filenotfoundexception = s1;
        context1 = context;
        s2 = s1;
        context2 = context;
        Log.e("FileUtils", "IS is null");
        IoUtil.safeClose(s1);
        IoUtil.safeClose(context);
        return false;
        filenotfoundexception = s1;
        context1 = context;
        s2 = s1;
        context2 = context;
        s = new byte[1024];
_L4:
        filenotfoundexception = s1;
        context1 = context;
        s2 = s1;
        context2 = context;
        i = context.read(s);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        filenotfoundexception = s1;
        context1 = context;
        s2 = s1;
        context2 = context;
        s1.write(s, 0, i);
        if (true) goto _L4; else goto _L3
        context;
        s2 = filenotfoundexception;
        context2 = context1;
        Log.e("FileUtils", "Failed to extract CA", context);
        IoUtil.safeClose(filenotfoundexception);
        IoUtil.safeClose(context1);
        return false;
_L3:
        IoUtil.safeClose(s1);
        IoUtil.safeClose(context);
        return true;
        context;
        IoUtil.safeClose(s2);
        IoUtil.safeClose(context2);
        throw context;
    }

    public static String download(Context context, String s)
        throws IOException
    {
        String s1;
        byte abyte0[];
        FileOutputStream fileoutputstream;
        String s2;
        abyte0 = null;
        s2 = s.substring(s.lastIndexOf('/') + 1);
        fileoutputstream = getOutputStream(context, s2, true);
        s1 = abyte0;
        s = (new URL(s)).openConnection();
        s1 = abyte0;
        s.setConnectTimeout(5000);
        s1 = abyte0;
        s.setReadTimeout(5000);
        s1 = abyte0;
        s.connect();
        s1 = abyte0;
        s = s.getInputStream();
        s1 = s;
        abyte0 = new byte[512];
_L2:
        s1 = s;
        int i = s.read(abyte0);
        if (i == -1)
        {
            break; /* Loop/switch isn't completed */
        }
        s1 = s;
        fileoutputstream.write(abyte0, 0, i);
        if (true) goto _L2; else goto _L1
        context;
        IoUtil.safeClose(fileoutputstream);
        IoUtil.safeClose(s1);
        throw context;
_L1:
        s1 = s;
        fileoutputstream.flush();
        IoUtil.safeClose(fileoutputstream);
        IoUtil.safeClose(s);
        return (new StringBuilder()).append("file://").append(context.getFilesDir().getAbsolutePath()).append("/").append(s2).toString();
    }

    public static FileOutputStream getOutputStream(Context context, String s, boolean flag)
        throws FileNotFoundException, IOException
    {
        if (flag)
        {
            return context.openFileOutput(s, 0);
        }
        context = new File(Environment.getExternalStorageDirectory(), s);
        Log.d("FileUtils", (new StringBuilder()).append("File ").append(context.getAbsolutePath()).toString());
        if (!context.exists())
        {
            context.createNewFile();
        }
        return new FileOutputStream(context);
    }

    public static void removeFilesFromFS(Context context, String as[])
    {
        for (int i = 0; i < as.length; i++)
        {
            File file = context.getDir(as[i], 0);
            if (!file.exists())
            {
                continue;
            }
            if (Log.isLoggable("FileUtils", 3))
            {
                Log.d("FileUtils", (new StringBuilder()).append("File for removal found: ").append(file.getAbsolutePath()).toString());
            }
            boolean flag = context.deleteFile(as[i]);
            if (Log.isLoggable("FileUtils", 3))
            {
                Log.d("FileUtils", (new StringBuilder()).append("File ").append(as[i]).append(" is deleted ").append(flag).toString());
            }
        }

    }
}
