// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.util.Log;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.zip.ZipFile;

public class LibraryLoaderHelper
{

    static final boolean $assertionsDisabled;
    private final String LIB_DIR = "lib";
    private final String TAG = "LibraryLoaderHelper";
    private final String allLibraries[];
    private final Context context;
    private final ExecutorService executorService = Executors.newSingleThreadExecutor();
    private Future loadTask;
    Map loadedLibraries;
    private boolean sLibrariesWereUnpacked;

    public LibraryLoaderHelper(Context context1, String as[])
    {
        sLibrariesWereUnpacked = false;
        context = context1;
        allLibraries = as;
        loadedLibraries = new HashMap(as.length) {

            final LibraryLoaderHelper this$0;

            
            {
                this$0 = LibraryLoaderHelper.this;
                super(i);
                libraryloaderhelper = allLibraries;
                int j = LibraryLoaderHelper.this.length;
                for (i = 0; i < j; i++)
                {
                    put(LibraryLoaderHelper.this[i], Boolean.valueOf(false));
                }

            }
        };
    }

    private void copyToOutputStream(InputStream inputstream, FileOutputStream fileoutputstream)
        throws IOException
    {
        byte abyte0[] = new byte[16384];
_L1:
        int i = inputstream.read(abyte0);
        if (i <= 0)
        {
            break MISSING_BLOCK_LABEL_48;
        }
        fileoutputstream.write(abyte0, 0, i);
          goto _L1
        Exception exception;
        exception;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_38;
        }
        inputstream.close();
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        throw exception;
        if (inputstream == null)
        {
            break MISSING_BLOCK_LABEL_56;
        }
        inputstream.close();
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        return;
        inputstream;
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        throw inputstream;
        inputstream;
        if (fileoutputstream != null)
        {
            fileoutputstream.close();
        }
        throw inputstream;
    }

    private void deleteDirectorySync(File file)
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
        file1.getName();
        if (!file1.delete())
        {
            Log.e("LibraryLoaderHelper", (new StringBuilder("Failed to remove ")).append(file1.getAbsolutePath()).toString());
        }
          goto _L4
_L2:
        try
        {
            if (!file.delete())
            {
                Log.w("LibraryLoaderHelper", (new StringBuilder("Failed to remove ")).append(file.getAbsolutePath()).toString());
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

    private boolean extractLib(Context context1, File file, ZipFile zipfile, String s)
    {
        java.util.zip.ZipEntry zipentry;
        String s1;
        s1 = (new StringBuilder("lib/")).append(Build.CPU_ABI2).append("/").append(System.mapLibraryName(s)).toString();
        zipentry = zipfile.getEntry(s1);
        if (zipentry != null) goto _L2; else goto _L1
_L1:
        Log.e("LibraryLoaderHelper", (new StringBuilder()).append(zipfile.getName()).append(" doesn't have file ").append(s1).toString());
        deleteDirectorySync(file);
_L4:
        return false;
_L2:
        context1 = getLibFile(context1, s);
        Log.i("LibraryLoaderHelper", (new StringBuilder("Extracting native libraries into ")).append(context1.getAbsolutePath()).toString());
        if (!$assertionsDisabled && context1.exists())
        {
            throw new AssertionError();
        }
        try
        {
            if (!context1.createNewFile())
            {
                throw new IOException((new StringBuilder("Could not create output file for ")).append(context1).toString());
            }
            break MISSING_BLOCK_LABEL_213;
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (!context1.exists() || context1.delete()) goto _L4; else goto _L3
_L3:
        Log.e("LibraryLoaderHelper", (new StringBuilder("Failed to delete ")).append(context1.getAbsolutePath()).toString());
        return false;
        copyToOutputStream(zipfile.getInputStream(zipentry), new FileOutputStream(context1));
        setFileReadableExecutableAndOwnerOnlyWritable(context1);
        return true;
    }

    private File getLibFile(Context context1, String s)
    {
        s = System.mapLibraryName(s);
        return new File(getLibDir(context1), s);
    }

    private void setFileReadableExecutableAndOwnerOnlyWritable(File file)
    {
        file.setReadable(true, false);
        file.setExecutable(true, false);
        file.setWritable(true);
    }

    private boolean unpackLibrariesOnce(Context context1, String as[])
    {
        if (sLibrariesWereUnpacked)
        {
            return false;
        }
        sLibrariesWereUnpacked = true;
        File file = getLibDir(context1);
        deleteDirectorySync(file);
        Object obj = context1.getApplicationInfo().sourceDir;
        int j;
        try
        {
            obj = new ZipFile(new File(((String) (obj))), 1);
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            Log.e("LibraryLoaderHelper", "Failed to unpack native libraries", context1);
            deleteDirectorySync(file);
            return false;
        }
        j = as.length;
        for (int i = 0; i < j && extractLib(context1, file, ((ZipFile) (obj)), as[i]); i++) { }
        try
        {
            ((ZipFile) (obj)).close();
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            Log.e("LibraryLoaderHelper", (new StringBuilder("Failed to close archive ")).append(obj).toString(), context1);
            deleteDirectorySync(file);
            return false;
        }
        return true;
    }

    public void cleanup(String s)
    {
        s = getLibFile(context, s);
        if (!s.exists())
        {
            s.delete();
        }
    }

    void deleteWorkaroundLibrariesAsynchronously(final Context context)
    {
        (new Thread() {

            final LibraryLoaderHelper this$0;
            final Context val$context;

            public final void run()
            {
                deleteWorkaroundLibrariesSynchronously(context);
            }

            
            {
                this$0 = LibraryLoaderHelper.this;
                context = context1;
                super();
            }
        }).start();
    }

    public void deleteWorkaroundLibrariesSynchronously(Context context1)
    {
        deleteDirectorySync(getLibDir(context1));
    }

    public File getLibDir(Context context1)
    {
        return context1.getDir("lib", 0);
    }

    public void loadAllNativeLibraries()
    {
        if (loadTask == null)
        {
            loadTask = executorService.submit(new Runnable() {

                final LibraryLoaderHelper this$0;

                public final void run()
                {
                    if (unpackLibrariesOnce(context, allLibraries)) goto _L2; else goto _L1
_L1:
                    return;
_L2:
                    String as[] = allLibraries;
                    int j = as.length;
                    int i = 0;
                    do
                    {
                        if (i >= j)
                        {
                            break; /* Loop/switch isn't completed */
                        }
                        String s = as[i];
                        if (!tryLoadLibrary(context, s))
                        {
                            break;
                        }
                        loadedLibraries.put(s, Boolean.valueOf(true));
                        i++;
                    } while (true);
                    if (true) goto _L1; else goto _L3
_L3:
                    synchronized (LibraryLoaderHelper.this)
                    {
                        notifyAll();
                    }
                    return;
                    exception;
                    libraryloaderhelper;
                    JVM INSTR monitorexit ;
                    throw exception;
                }

            
            {
                this$0 = LibraryLoaderHelper.this;
                super();
            }
            });
        }
    }

    public boolean loadNativeLibrary(String s)
    {
        if (!loadedLibraries.containsKey(s))
        {
            return false;
        }
        if (!tryLoadLibrary(context, s) && loadTask == null)
        {
            loadAllNativeLibraries();
        }
        if (((Boolean)loadedLibraries.get(s)).booleanValue())
        {
            return true;
        }
        try
        {
            loadTask.get();
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return false;
        }
        return ((Boolean)loadedLibraries.get(s)).booleanValue();
    }

    boolean tryLoadLibrary(Context context1, String s)
    {
        if (!$assertionsDisabled && context1 == null)
        {
            throw new AssertionError();
        }
        context1 = getLibFile(context1, s);
        if (!context1.exists())
        {
            return false;
        }
        try
        {
            System.load(context1.getAbsolutePath());
            loadedLibraries.put(s, Boolean.valueOf(true));
        }
        // Misplaced declaration of an exception variable
        catch (Context context1)
        {
            return false;
        }
        return true;
    }

    static 
    {
        boolean flag;
        if (!com/skype/LibraryLoaderHelper.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }



}
