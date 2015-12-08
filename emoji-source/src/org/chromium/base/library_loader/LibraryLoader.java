// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.SystemClock;
import android.util.Log;
import org.chromium.base.CommandLine;
import org.chromium.base.SysUtils;
import org.chromium.base.TraceEvent;

// Referenced classes of package org.chromium.base.library_loader:
//            ProcessInitException, Linker, NativeLibraries, LibraryLoaderHelper

public class LibraryLoader
{

    static final boolean $assertionsDisabled;
    private static final String TAG = "LibraryLoader";
    private static boolean sCommandLineSwitched = false;
    private static boolean sInitialized = false;
    private static boolean sLoaded = false;
    private static final Object sLock = new Object();
    private static boolean sNativeLibraryHackWasUsed = false;

    public LibraryLoader()
    {
    }

    private static void ensureCommandLineSwitchedAlreadyLocked()
    {
        if (!$assertionsDisabled && !sLoaded)
        {
            throw new AssertionError();
        }
        if (sCommandLineSwitched)
        {
            return;
        } else
        {
            nativeInitCommandLine(CommandLine.getJavaSwitchesOrNull());
            CommandLine.enableNativeProxy();
            sCommandLineSwitched = true;
            return;
        }
    }

    public static void ensureInitialized()
        throws ProcessInitException
    {
        ensureInitialized(null, false);
    }

    public static void ensureInitialized(Context context, boolean flag)
        throws ProcessInitException
    {
label0:
        {
            synchronized (sLock)
            {
                if (!sInitialized)
                {
                    break label0;
                }
            }
            return;
        }
        loadAlreadyLocked(context, flag);
        initializeAlreadyLocked();
        obj;
        JVM INSTR monitorexit ;
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static void initialize()
        throws ProcessInitException
    {
        synchronized (sLock)
        {
            initializeAlreadyLocked();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void initializeAlreadyLocked()
        throws ProcessInitException
    {
        if (sInitialized)
        {
            return;
        }
        if (!sCommandLineSwitched)
        {
            nativeInitCommandLine(CommandLine.getJavaSwitchesOrNull());
        }
        if (!nativeLibraryLoaded())
        {
            Log.e("LibraryLoader", "error calling nativeLibraryLoaded");
            throw new ProcessInitException(1);
        }
        sInitialized = true;
        if (!sCommandLineSwitched)
        {
            CommandLine.enableNativeProxy();
            sCommandLineSwitched = true;
        }
        TraceEvent.registerNativeEnabledObserver();
    }

    public static boolean isInitialized()
    {
        boolean flag;
        synchronized (sLock)
        {
            flag = sInitialized;
        }
        return flag;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void loadAlreadyLocked(Context context, boolean flag)
        throws ProcessInitException
    {
        if (sLoaded) goto _L2; else goto _L1
_L1:
        if (!$assertionsDisabled && sInitialized)
        {
            throw new AssertionError();
        }
        long l = SystemClock.uptimeMillis();
        if (!Linker.isUsed()) goto _L4; else goto _L3
_L3:
        String as1[];
        int k;
        Linker.prepareLibraryLoad();
        as1 = NativeLibraries.LIBRARIES;
        k = as1.length;
        int i = 0;
_L25:
        if (i >= k) goto _L6; else goto _L5
_L5:
        String s;
        String s2;
        s2 = as1[i];
        s = null;
        if (!Linker.isInZipFile()) goto _L8; else goto _L7
_L7:
        s = context.getApplicationInfo().sourceDir;
        Log.i("LibraryLoader", (new StringBuilder()).append("Loading ").append(s2).append(" from within ").append(s).toString());
_L17:
        boolean flag1;
        boolean flag2;
        boolean flag3;
        flag2 = false;
        try
        {
            flag3 = Linker.isUsingBrowserSharedRelros();
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            throw new ProcessInitException(2, context);
        }
        flag1 = flag2;
        if (!flag3) goto _L10; else goto _L9
_L9:
        if (s == null) goto _L12; else goto _L11
_L11:
        Linker.loadLibraryInZipFile(s, s2);
_L18:
        flag1 = true;
_L10:
        if (flag1) goto _L14; else goto _L13
_L13:
        if (s == null) goto _L16; else goto _L15
_L15:
        Linker.loadLibraryInZipFile(s, s2);
          goto _L14
_L8:
        Log.i("LibraryLoader", (new StringBuilder()).append("Loading: ").append(s2).toString());
          goto _L17
_L12:
        Linker.loadLibrary(s2);
          goto _L18
        UnsatisfiedLinkError unsatisfiedlinkerror1;
        unsatisfiedlinkerror1;
        Log.w("LibraryLoader", "Failed to load native library with shared RELRO, retrying without");
        Linker.disableSharedRelros();
        flag1 = flag2;
          goto _L10
_L16:
        Linker.loadLibrary(s2);
          goto _L14
_L6:
        Linker.finishLibraryLoad();
_L21:
        if (context == null || !flag)
        {
            break MISSING_BLOCK_LABEL_260;
        }
        if (!sNativeLibraryHackWasUsed)
        {
            LibraryLoaderHelper.deleteWorkaroundLibrariesAsynchronously(context);
        }
        long l1 = SystemClock.uptimeMillis();
        Log.i("LibraryLoader", String.format("Time to load native libraries: %d ms (timestamps %d-%d)", new Object[] {
            Long.valueOf(l1 - l), Long.valueOf(l % 10000L), Long.valueOf(l1 % 10000L)
        }));
        sLoaded = true;
_L2:
        Log.i("LibraryLoader", String.format("Expected native library version number \"%s\",actual native library version number \"%s\"", new Object[] {
            NativeLibraries.VERSION_NUMBER, nativeGetVersionNumber()
        }));
        if (!NativeLibraries.VERSION_NUMBER.equals(nativeGetVersionNumber()))
        {
            throw new ProcessInitException(3);
        }
          goto _L19
_L4:
        String as[];
        int j;
        as = NativeLibraries.LIBRARIES;
        j = as.length;
        i = 0;
_L22:
        if (i >= j) goto _L21; else goto _L20
_L20:
        String s1 = as[i];
        System.loadLibrary(s1);
_L23:
        i++;
          goto _L22
          goto _L21
        UnsatisfiedLinkError unsatisfiedlinkerror;
        unsatisfiedlinkerror;
        if (context == null)
        {
            break MISSING_BLOCK_LABEL_424;
        }
        if (!LibraryLoaderHelper.tryLoadLibraryUsingWorkaround(context, s1))
        {
            break MISSING_BLOCK_LABEL_424;
        }
        sNativeLibraryHackWasUsed = true;
          goto _L23
        throw unsatisfiedlinkerror;
_L19:
        return;
_L14:
        i++;
        if (true) goto _L25; else goto _L24
_L24:
    }

    public static void loadNow()
        throws ProcessInitException
    {
        loadNow(null, false);
    }

    public static void loadNow(Context context, boolean flag)
        throws ProcessInitException
    {
        synchronized (sLock)
        {
            loadAlreadyLocked(context, flag);
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private static native String nativeGetVersionNumber();

    private static native void nativeInitCommandLine(String as[]);

    private static native boolean nativeLibraryLoaded();

    private static native void nativeRecordChromiumAndroidLinkerHistogram(boolean flag, boolean flag1);

    private static native void nativeRecordNativeLibraryHack(boolean flag);

    public static void onNativeInitializationComplete()
    {
        if (Linker.isUsed())
        {
            nativeRecordChromiumAndroidLinkerHistogram(Linker.loadAtFixedAddressFailed(), SysUtils.isLowEndDevice());
        }
        nativeRecordNativeLibraryHack(sNativeLibraryHackWasUsed);
    }

    public static void switchCommandLineForWebView()
    {
        synchronized (sLock)
        {
            ensureCommandLineSwitchedAlreadyLocked();
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/library_loader/LibraryLoader.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }
}
