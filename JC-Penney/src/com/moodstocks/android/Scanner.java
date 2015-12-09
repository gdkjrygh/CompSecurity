// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.moodstocks.android;

import android.content.Context;
import android.content.res.AssetManager;
import android.util.Log;
import com.moodstocks.android.advanced.Image;
import com.moodstocks.android.advanced.Synchronizer;
import com.moodstocks.android.core.Loader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

// Referenced classes of package com.moodstocks.android:
//            MoodstocksError, Result

public final class Scanner
{

    private static Scanner instance;
    private long ptr;
    private SyncListener syncListener;
    private ExecutorService syncThread;
    private Synchronizer synchronizer;

    private Scanner()
    {
        ptr = 0L;
        synchronizer = null;
        syncListener = null;
        syncThread = Executors.newSingleThreadExecutor();
        initialize();
    }

    private native void close_native();

    private static void copyAssetFile(InputStream inputstream, OutputStream outputstream)
    {
        byte abyte0[] = new byte[1024];
_L1:
        int i = inputstream.read(abyte0);
        if (i == -1)
        {
            break MISSING_BLOCK_LABEL_33;
        }
        outputstream.write(abyte0, 0, i);
          goto _L1
        try
        {
            inputstream.close();
            outputstream.flush();
            outputstream.close();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (InputStream inputstream)
        {
            inputstream.printStackTrace();
        }
        return;
    }

    private native void destruct();

    public static Scanner get()
    {
        if (instance != null) goto _L2; else goto _L1
_L1:
        com/moodstocks/android/Scanner;
        JVM INSTR monitorenter ;
        if (instance == null)
        {
            instance = new Scanner();
        }
        com/moodstocks/android/Scanner;
        JVM INSTR monitorexit ;
_L2:
        return instance;
        Exception exception;
        exception;
        com/moodstocks/android/Scanner;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private native void importBundle_native(String s);

    private static native void init();

    private native void initialize();

    public static boolean isCompatible()
    {
        return Loader.isCompatible();
    }

    private native void open_native(String s, String s1, String s2);

    public static String pathFromFilesDir(Context context, String s)
    {
        return (new StringBuilder()).append(context.getFilesDir().getAbsolutePath()).append("/").append(s).toString();
    }

    public void cancelSync()
    {
        if (synchronizer != null)
        {
            synchronizer.cancel();
        }
    }

    public void close()
    {
        close_native();
    }

    public native int count();

    public native Result decode(Image image, int i, int j);

    public void destroy()
    {
        destruct();
        instance = null;
    }

    public void importBundle(Context context, String s, String s1)
    {
        String s3 = (new StringBuilder()).append(s1).append("/data/").append(s).append("/default").toString();
        s = (new StringBuilder()).append(s3).append("/bundles").toString();
        String s4 = (new StringBuilder()).append(context.getCacheDir()).append("/").append(s3).toString();
        String s2 = (new StringBuilder()).append(s4).append("/bundles").toString();
        Object obj = new File(s4);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = new File(s2);
        if (!((File) (obj)).exists())
        {
            ((File) (obj)).mkdirs();
        }
        obj = context.getAssets();
        copyAssetFile(((AssetManager) (obj)).open((new StringBuilder()).append(s3).append("/syncstate").toString()), new FileOutputStream((new StringBuilder()).append(s4).append("/syncstate").toString()));
        String as[] = ((AssetManager) (obj)).list(s);
        int j = as.length;
        for (int i = 0; i < j; i++)
        {
            String s5 = as[i];
            copyAssetFile(((AssetManager) (obj)).open((new StringBuilder()).append(s).append("/").append(s5).toString()), new FileOutputStream((new StringBuilder()).append(s2).append("/").append(s5).toString()));
        }

        importBundle_native((new StringBuilder()).append(context.getCacheDir()).append("/").append(s1).toString());
    }

    public native List info();

    public boolean isSyncing()
    {
        return syncListener != null;
    }

    public native Result match(Image image, Result result, int i, int j);

    public void open(String s, String s1, String s2)
    {
        if (!isCompatible())
        {
            throw new RuntimeException("DEVICE IS NOT COMPATIBLE WITH MOODSTOCKS SDK");
        }
        try
        {
            open_native(s, s1, s2);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (String s) { }
        if (s.getErrorCode() == 12)
        {
            Log.e("Moodstocks SDK", "Warning: There is a problem with your API key/secret pair.\nYou have already opened the scanner with a different pair. To solve this issue:\n1/ Uninstall the application from your device or clear its data,\n2/ Make sure you have properly set your API key/secret pair,\n3/ Re-build and run.");
        }
        throw s;
    }

    public native Result search(Image image, int i, int j);

    public native void setAuthenticatedProxy(String s, int i, String s1, String s2);

    public void setProxy(String s, int i)
    {
        setAuthenticatedProxy(s, i, null, null);
    }

    public void setSyncListener(SyncListener synclistener)
    {
        syncListener = synclistener;
        if (synchronizer != null)
        {
            synchronizer.setListener(synclistener);
        }
    }

    public boolean sync()
    {
        if (synchronizer != null)
        {
            return false;
        } else
        {
            synchronizer = new Synchronizer(this);
            synchronizer.setListener(syncListener);
            _cls1 _lcls1 = new _cls1();
            syncThread.submit(_lcls1);
            return true;
        }
    }

    static 
    {
        Loader.load();
        if (isCompatible())
        {
            init();
        }
    }



/*
    static Synchronizer access$002(Scanner scanner, Synchronizer synchronizer1)
    {
        scanner.synchronizer = synchronizer1;
        return synchronizer1;
    }

*/

    private class _cls1
        implements Runnable
    {

        final Scanner this$0;

        public void run()
        {
            synchronizer.synchronize();
            synchronizer = null;
        }

        _cls1()
        {
            this$0 = Scanner.this;
            super();
        }
    }

}
