// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.orbit;

import android.content.Context;
import com.spotify.mobile.android.util.Assertion;
import com.spotify.mobile.android.util.logging.Logger;
import ctz;
import dmx;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.util.Random;

public class OrbitLibraryLoader
    implements dmx
{

    private static final String ARMV7_ABI = "armeabi-v7a";
    private static final String LIB_BASE_FOLDER = "lib";
    public static final String ORBIT_JNI_LIBRARY_NAME = "orbit-jni-spotify";
    private static final String X86_ABI = "x86";
    private Thread mLibraryLoadingThread;

    public OrbitLibraryLoader()
    {
    }

    private static File buildNativeLibPath(Context context, String s)
    {
        return new File(new File(new File(context.getFilesDir(), (new StringBuilder()).append(File.separator).append("lib").toString()), s), "liborbit-jni-spotify.so");
    }

    private static boolean copyLibFromApk(URL url, File file)
    {
        URL url1;
        url1 = null;
        FileOutputStream fileoutputstream;
        int i;
        try
        {
            url = url.openStream();
        }
        // Misplaced declaration of an exception variable
        catch (URL url)
        {
            url = null;
            file = url1;
            continue; /* Loop/switch isn't completed */
        }
        finally
        {
            url1 = null;
            url = null;
        }
        fileoutputstream = new FileOutputStream(file);
        file = new byte[512];
_L3:
        i = url.read(file);
        if (i == -1) goto _L2; else goto _L1
_L1:
        fileoutputstream.write(file, 0, i);
          goto _L3
        file;
        file = fileoutputstream;
_L7:
        if (file != null)
        {
            try
            {
                file.close();
            }
            // Misplaced declaration of an exception variable
            catch (File file) { }
        }
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url)
            {
                return false;
            }
        }
        return false;
_L2:
        fileoutputstream.flush();
        try
        {
            fileoutputstream.close();
        }
        // Misplaced declaration of an exception variable
        catch (File file) { }
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        return true;
_L5:
        if (url != null)
        {
            try
            {
                url.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        if (url1 != null)
        {
            try
            {
                url1.close();
            }
            // Misplaced declaration of an exception variable
            catch (URL url) { }
        }
        throw file;
        file;
        fileoutputstream = null;
        url1 = url;
        url = fileoutputstream;
        continue; /* Loop/switch isn't completed */
        file;
        url1 = url;
        url = fileoutputstream;
        if (true) goto _L5; else goto _L4
_L4:
        break MISSING_BLOCK_LABEL_7;
        file;
        file = url1;
        if (true) goto _L7; else goto _L6
_L6:
    }

    private static void createLibDirIfNeeded(File file)
    {
        if (file.exists())
        {
            if (!file.delete())
            {
                Logger.c("Failed to delete old (possibly stale) native library", new Object[0]);
                throw new UnsatisfiedLinkError("Failed to delete old (possibly stale) native library");
            }
        } else
        {
            file = file.getParentFile();
            if (!file.exists())
            {
                if (!file.mkdirs())
                {
                    Logger.c("Failed to create directory for native library extraction", new Object[0]);
                    throw new UnsatisfiedLinkError("Failed to create directory for native library extraction");
                }
            } else
            if (!file.isDirectory())
            {
                Logger.c("Unexpected file where native lib dir expected!", new Object[0]);
                throw new UnsatisfiedLinkError("Unexpected file where native lib dir expected!");
            }
        }
    }

    private boolean fallbackNativeLoading(Context context, LibraryLoader libraryloader)
    {
        Object obj = getDeviceAbi(libraryloader);
        try
        {
            context = buildNativeLibPath(context, ((String) (obj)));
            createLibDirIfNeeded(context);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            Logger.b(context, context.getMessage(), new Object[0]);
            return false;
        }
        obj = libraryloader.getResource((new StringBuilder("/lib/")).append(((String) (obj))).append("/liborbit-jni-spotify.so").toString());
        if (obj == null)
        {
            Logger.c("Cannot find native library in APK - fallback extraction failed!", new Object[0]);
        } else
        if (copyLibFromApk(((URL) (obj)), context))
        {
            libraryloader.load(context.getAbsolutePath());
            return true;
        }
        return false;
    }

    private static String getDeviceAbi(LibraryLoader libraryloader)
    {
        String s = "armeabi-v7a";
        if (hasABI(libraryloader, "x86"))
        {
            s = "x86";
        }
        return s;
    }

    private static boolean hasABI(LibraryLoader libraryloader, String s)
    {
        boolean flag1 = false;
        libraryloader = libraryloader.getABIs();
        int j = libraryloader.length;
        int i = 0;
        do
        {
label0:
            {
                boolean flag = flag1;
                if (i < j)
                {
                    if (!libraryloader[i].contains(s))
                    {
                        break label0;
                    }
                    flag = true;
                }
                return flag;
            }
            i++;
        } while (true);
    }

    static void reportThrottledSuccess(Random random)
    {
        if ((double)random.nextFloat() >= 0.98999999999999999D)
        {
            Assertion.b("Successfully loaded native lib with fallback method (throttled 99%).");
        }
    }

    void loadLibrary(Context context, LibraryLoader libraryloader)
    {
        try
        {
            libraryloader.loadLibrary("orbit-jni-spotify");
            return;
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            if (!fallbackNativeLoading(context, libraryloader))
            {
                Logger.c("Error performing native lib fallback extraction", new Object[] {
                    unsatisfiedlinkerror
                });
                throw unsatisfiedlinkerror;
            } else
            {
                reportThrottledSuccess(new Random());
                return;
            }
        }
    }

    public void startLibraryLoading(Context context, LibraryLoader libraryloader)
    {
        mLibraryLoadingThread = new Thread(libraryloader) {

            final OrbitLibraryLoader this$0;
            final Context val$context;
            final LibraryLoader val$libraryLoader;

            public void run()
            {
                loadLibrary(context, libraryLoader);
            }

            
            {
                this$0 = OrbitLibraryLoader.this;
                context = context1;
                libraryLoader = libraryloader;
                super(final_s);
            }
        };
        mLibraryLoadingThread.start();
    }

    public void waitForLibraryLoaded()
    {
        ctz.a(mLibraryLoadingThread);
        try
        {
            mLibraryLoadingThread.join();
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            Assertion.a(interruptedexception);
        }
    }

    private class LibraryLoader
    {

        public String[] getABIs()
        {
            if (gcl.j)
            {
                return Build.SUPPORTED_ABIS;
            } else
            {
                return (new String[] {
                    Build.CPU_ABI
                });
            }
        }

        public URL getResource(String s)
        {
            return com/spotify/mobile/android/orbit/OrbitLibraryLoader$LibraryLoader.getResource(s);
        }

        public void load(String s)
        {
            System.load(s);
        }

        public void loadLibrary(String s)
        {
            System.loadLibrary(s);
        }

        public LibraryLoader()
        {
        }
    }

}
