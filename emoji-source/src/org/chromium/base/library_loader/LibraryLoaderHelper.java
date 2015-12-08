// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.zip.ZipFile;

// Referenced classes of package org.chromium.base.library_loader:
//            NativeLibraries

public class LibraryLoaderHelper
{

    static final boolean $assertionsDisabled;
    private static final String LIB_DIR = "lib";
    private static final String TAG = "LibraryLoaderHelper";
    private static boolean sLibrariesWereUnpacked = false;

    public LibraryLoaderHelper()
    {
    }

    private static void deleteDirectorySync(File file)
    {
        File afile[] = file.listFiles();
        if (afile == null) goto _L2; else goto _L1
_L1:
        int j = afile.length;
        int i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L3
_L3:
        File file1 = afile[i];
        if (!file1.delete())
        {
            Log.e("LibraryLoaderHelper", (new StringBuilder()).append("Failed to remove ").append(file1.getAbsolutePath()).toString());
        }
          goto _L4
_L2:
        try
        {
            if (!file.delete())
            {
                Log.w("LibraryLoaderHelper", (new StringBuilder()).append("Failed to remove ").append(file.getAbsolutePath()).toString());
            }
            return;
        }
        // Misplaced declaration of an exception variable
        catch (File file)
        {
            Log.e("LibraryLoaderHelper", "Failed to remove old libs, ", file);
        }
        return;
_L4:
        i++;
        if (true) goto _L6; else goto _L5
_L5:
    }

    static void deleteWorkaroundLibrariesAsynchronously(Context context)
    {
        (new Thread(context) {

            final Context val$context;

            public void run()
            {
                LibraryLoaderHelper.deleteWorkaroundLibrariesSynchronously(context);
            }

            
            {
                context = context1;
                super();
            }
        }).start();
    }

    public static void deleteWorkaroundLibrariesSynchronously(Context context)
    {
        deleteDirectorySync(getWorkaroundLibDir(context));
    }

    private static String getJniNameInApk(String s)
    {
        return (new StringBuilder()).append("lib/").append(Build.CPU_ABI).append("/").append(System.mapLibraryName(s)).toString();
    }

    public static File getWorkaroundLibDir(Context context)
    {
        return context.getDir("lib", 0);
    }

    private static File getWorkaroundLibFile(Context context, String s)
    {
        s = System.mapLibraryName(s);
        return new File(getWorkaroundLibDir(context), s);
    }

    public static boolean loadNativeLibrariesUsingWorkaroundForTesting(Context context)
    {
        String as[] = NativeLibraries.LIBRARIES;
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            if (!tryLoadLibraryUsingWorkaround(context, as[i]))
            {
                return false;
            }
        }

        return true;
    }

    static boolean tryLoadLibraryUsingWorkaround(Context context, String s)
    {
        if (!$assertionsDisabled && context == null)
        {
            throw new AssertionError();
        }
        s = getWorkaroundLibFile(context, s);
        if (!s.exists() && !unpackLibrariesOnce(context))
        {
            return false;
        }
        try
        {
            System.load(s.getAbsolutePath());
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return false;
        }
        return true;
    }

    private static boolean unpackLibrariesOnce(Context context)
    {
        Object obj1;
        ZipFile zipfile;
        File file1;
        int i;
        if (sLibrariesWereUnpacked)
        {
            return false;
        }
        sLibrariesWereUnpacked = true;
        File file = getWorkaroundLibDir(context);
        deleteDirectorySync(file);
        String s;
        String s1;
        ApplicationInfo applicationinfo;
        String as[];
        int j;
        try
        {
            applicationinfo = context.getApplicationInfo();
            zipfile = new ZipFile(new File(applicationinfo.sourceDir), 1);
            as = NativeLibraries.LIBRARIES;
            j = as.length;
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Log.e("LibraryLoaderHelper", "Failed to unpack native libraries", context);
            deleteDirectorySync(file);
            return false;
        }
        i = 0;
_L6:
        if (i >= j) goto _L2; else goto _L1
_L1:
        s = as[i];
        s1 = getJniNameInApk(s);
        obj1 = zipfile.getEntry(s1);
        if (obj1 != null)
        {
            break MISSING_BLOCK_LABEL_138;
        }
        Log.e("LibraryLoaderHelper", (new StringBuilder()).append(applicationinfo.sourceDir).append(" doesn't have file ").append(s1).toString());
        zipfile.close();
        deleteDirectorySync(file);
        return false;
        file1 = getWorkaroundLibFile(context, s);
        Log.i("LibraryLoaderHelper", (new StringBuilder()).append("Extracting native libraries into ").append(file1.getAbsolutePath()).toString());
        if (!$assertionsDisabled && file1.exists())
        {
            throw new AssertionError();
        }
        try
        {
            if (!file1.createNewFile())
            {
                throw new IOException();
            }
            break MISSING_BLOCK_LABEL_282;
        }
        // Misplaced declaration of an exception variable
        catch (Context context) { }
        if (file1.exists() && !file1.delete())
        {
            Log.e("LibraryLoaderHelper", (new StringBuilder()).append("Failed to delete ").append(file1.getAbsolutePath()).toString());
        }
        zipfile.close();
        throw context;
        Object obj;
        Exception exception2;
        obj = null;
        exception2 = null;
        obj1 = zipfile.getInputStream(((java.util.zip.ZipEntry) (obj1)));
        obj = obj1;
        FileOutputStream fileoutputstream = new FileOutputStream(file1);
        obj = new byte[16384];
_L5:
        int k = ((InputStream) (obj1)).read(((byte []) (obj)));
        if (k <= 0) goto _L4; else goto _L3
_L3:
        fileoutputstream.write(((byte []) (obj)), 0, k);
          goto _L5
        exception2;
        context = fileoutputstream;
        obj = obj1;
_L7:
        if (obj == null)
        {
            break MISSING_BLOCK_LABEL_350;
        }
        ((InputStream) (obj)).close();
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_358;
        }
        context.close();
        throw exception2;
_L4:
        if (obj1 == null)
        {
            break MISSING_BLOCK_LABEL_368;
        }
        ((InputStream) (obj1)).close();
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_378;
        }
        fileoutputstream.close();
        file1.setReadable(true, false);
        file1.setExecutable(true, false);
        file1.setWritable(true);
        i++;
          goto _L6
        context;
        if (fileoutputstream == null)
        {
            break MISSING_BLOCK_LABEL_421;
        }
        fileoutputstream.close();
        throw context;
        Exception exception;
        exception;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_432;
        }
        context.close();
        throw exception;
_L2:
        zipfile.close();
        return true;
        Exception exception1;
        exception1;
        context = exception2;
        exception2 = exception1;
          goto _L7
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/library_loader/LibraryLoaderHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
