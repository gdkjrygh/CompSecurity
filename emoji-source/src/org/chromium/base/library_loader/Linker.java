// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.base.library_loader;

import android.os.Bundle;
import android.os.Parcel;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable;
import android.util.Log;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import org.chromium.base.SysUtils;
import org.chromium.base.ThreadUtils;

// Referenced classes of package org.chromium.base.library_loader:
//            NativeLibraries

public class Linker
{
    public static class LibInfo
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

            public volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public LibInfo createFromParcel(Parcel parcel)
            {
                return new LibInfo(parcel);
            }

            public volatile Object[] newArray(int i)
            {
                return newArray(i);
            }

            public LibInfo[] newArray(int i)
            {
                return new LibInfo[i];
            }

        };
        public long mLoadAddress;
        public long mLoadSize;
        public int mRelroFd;
        public long mRelroSize;
        public long mRelroStart;

        public void close()
        {
            if (mRelroFd >= 0)
            {
                try
                {
                    ParcelFileDescriptor.adoptFd(mRelroFd).close();
                }
                catch (IOException ioexception) { }
                mRelroFd = -1;
            }
        }

        public int describeContents()
        {
            return 1;
        }

        public String toString()
        {
            return String.format(Locale.US, "[load=0x%x-0x%x relro=0x%x-0x%x fd=%d]", new Object[] {
                Long.valueOf(mLoadAddress), Long.valueOf(mLoadAddress + mLoadSize), Long.valueOf(mRelroStart), Long.valueOf(mRelroStart + mRelroSize), Integer.valueOf(mRelroFd)
            });
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            if (mRelroFd < 0)
            {
                break MISSING_BLOCK_LABEL_57;
            }
            parcel.writeLong(mLoadAddress);
            parcel.writeLong(mLoadSize);
            parcel.writeLong(mRelroStart);
            parcel.writeLong(mRelroSize);
            ParcelFileDescriptor parcelfiledescriptor = ParcelFileDescriptor.fromFd(mRelroFd);
            parcelfiledescriptor.writeToParcel(parcel, 0);
            parcelfiledescriptor.close();
            return;
            parcel;
            Log.e("chromium_android_linker", "Cant' write LibInfo file descriptor to parcel", parcel);
            return;
        }


        public LibInfo()
        {
            mLoadAddress = 0L;
            mLoadSize = 0L;
            mRelroStart = 0L;
            mRelroSize = 0L;
            mRelroFd = -1;
        }

        public LibInfo(Parcel parcel)
        {
            mLoadAddress = parcel.readLong();
            mLoadSize = parcel.readLong();
            mRelroStart = parcel.readLong();
            mRelroSize = parcel.readLong();
            parcel = parcel.readFileDescriptor();
            int i;
            if (parcel == null)
            {
                i = -1;
            } else
            {
                i = parcel.detachFd();
            }
            mRelroFd = i;
        }
    }

    public static interface TestRunner
    {

        public abstract boolean runChecks(int i, boolean flag);
    }


    static final boolean $assertionsDisabled;
    public static final int BROWSER_SHARED_RELRO_CONFIG = 1;
    public static final int BROWSER_SHARED_RELRO_CONFIG_ALWAYS = 2;
    public static final int BROWSER_SHARED_RELRO_CONFIG_LOW_RAM_ONLY = 1;
    public static final int BROWSER_SHARED_RELRO_CONFIG_NEVER = 0;
    private static final boolean DEBUG = false;
    public static final String EXTRA_LINKER_SHARED_RELROS = "org.chromium.base.android.linker.shared_relros";
    public static final int MEMORY_DEVICE_CONFIG_INIT = 0;
    public static final int MEMORY_DEVICE_CONFIG_LOW = 1;
    public static final int MEMORY_DEVICE_CONFIG_NORMAL = 2;
    private static final String TAG = "chromium_android_linker";
    private static long sBaseLoadAddress = 0L;
    private static boolean sBrowserUsesSharedRelro = false;
    private static long sCurrentLoadAddress = 0L;
    private static boolean sInBrowserProcess = true;
    private static boolean sInitialized = false;
    private static boolean sLoadAtFixedAddressFailed = false;
    private static HashMap sLoadedLibraries = null;
    private static int sMemoryDeviceConfig = 0;
    private static boolean sPrepareLibraryLoadCalled = false;
    private static boolean sRelroSharingSupported = false;
    private static Bundle sSharedRelros = null;
    static String sTestRunnerClassName = null;
    private static boolean sWaitForSharedRelros = false;

    public Linker()
    {
    }

    private static void closeLibInfoMap(HashMap hashmap)
    {
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); ((LibInfo)((java.util.Map.Entry)hashmap.next()).getValue()).close()) { }
    }

    private static long computeRandomBaseLoadAddress()
    {
        return nativeGetRandomBaseLoadAddress(0xc000000L);
    }

    private static Bundle createBundleFromLibInfoMap(HashMap hashmap)
    {
        Bundle bundle = new Bundle(hashmap.size());
        java.util.Map.Entry entry;
        for (hashmap = hashmap.entrySet().iterator(); hashmap.hasNext(); bundle.putParcelable((String)entry.getKey(), (Parcelable)entry.getValue()))
        {
            entry = (java.util.Map.Entry)hashmap.next();
        }

        return bundle;
    }

    private static HashMap createLibInfoMapFromBundle(Bundle bundle)
    {
        HashMap hashmap = new HashMap();
        String s;
        for (Iterator iterator = bundle.keySet().iterator(); iterator.hasNext(); hashmap.put(s, (LibInfo)bundle.getParcelable(s)))
        {
            s = (String)iterator.next();
        }

        return hashmap;
    }

    public static void disableSharedRelros()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        sInBrowserProcess = false;
        sWaitForSharedRelros = false;
        sBrowserUsesSharedRelro = false;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    private static void dumpBundle(Bundle bundle)
    {
    }

    private static void ensureInitializedLocked()
    {
        if (!$assertionsDisabled && !Thread.holdsLock(org/chromium/base/library_loader/Linker))
        {
            throw new AssertionError();
        }
        if (sInitialized) goto _L2; else goto _L1
_L1:
        sRelroSharingSupported = false;
        if (!NativeLibraries.USE_LINKER) goto _L4; else goto _L3
_L3:
        try
        {
            System.loadLibrary("chromium_android_linker");
        }
        catch (UnsatisfiedLinkError unsatisfiedlinkerror)
        {
            System.loadLibrary("chromium_android_linker.cr");
        }
        sRelroSharingSupported = nativeCanUseSharedRelro();
        if (!sRelroSharingSupported)
        {
            Log.w("chromium_android_linker", "This system cannot safely share RELRO sections");
        }
        if (sMemoryDeviceConfig == 0)
        {
            int i;
            if (SysUtils.isLowEndDevice())
            {
                i = 1;
            } else
            {
                i = 2;
            }
            sMemoryDeviceConfig = i;
        }
        1;
        JVM INSTR tableswitch 0 2: default 108
    //                   0 138
    //                   1 161
    //                   2 196;
           goto _L5 _L6 _L7 _L8
_L5:
        if (!$assertionsDisabled)
        {
            throw new AssertionError("Unreached");
        }
        break; /* Loop/switch isn't completed */
_L6:
        sBrowserUsesSharedRelro = false;
_L4:
        if (!sRelroSharingSupported)
        {
            sBrowserUsesSharedRelro = false;
            sWaitForSharedRelros = false;
        }
        sInitialized = true;
_L2:
        return;
_L7:
        boolean flag;
        if (sMemoryDeviceConfig == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        sBrowserUsesSharedRelro = flag;
        if (sBrowserUsesSharedRelro)
        {
            Log.w("chromium_android_linker", "Low-memory device: shared RELROs used in all processes");
        }
        continue; /* Loop/switch isn't completed */
_L8:
        Log.w("chromium_android_linker", "Beware: shared RELROs used in all processes!");
        sBrowserUsesSharedRelro = true;
        if (true) goto _L4; else goto _L9
_L9:
    }

    public static void finishLibraryLoad()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        if (sLoadedLibraries != null) goto _L2; else goto _L1
_L1:
        if (!NativeLibraries.ENABLE_LINKER_TESTS) goto _L4; else goto _L3
_L3:
        Object obj = sTestRunnerClassName;
        if (obj == null) goto _L4; else goto _L5
_L5:
        obj = (TestRunner)Class.forName(sTestRunnerClassName).newInstance();
_L10:
        if (obj == null) goto _L4; else goto _L6
_L6:
        if (((TestRunner) (obj)).runChecks(sMemoryDeviceConfig, sInBrowserProcess)) goto _L8; else goto _L7
_L7:
        Object obj1;
        Log.wtf("chromium_android_linker", "Linker runtime tests failed in this process!!");
        if (!$assertionsDisabled)
        {
            throw new AssertionError();
        }
          goto _L4
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw obj1;
_L2:
        if (sInBrowserProcess)
        {
            sSharedRelros = createBundleFromLibInfoMap(sLoadedLibraries);
            if (sBrowserUsesSharedRelro)
            {
                useSharedRelrosLocked(sSharedRelros);
            }
        }
        if (!sWaitForSharedRelros)
        {
            continue; /* Loop/switch isn't completed */
        }
        if (!$assertionsDisabled && sInBrowserProcess)
        {
            throw new AssertionError();
        }
_L9:
        obj1 = sSharedRelros;
label0:
        {
            if (obj1 != null)
            {
                break label0;
            }
            try
            {
                org/chromium/base/library_loader/Linker.wait();
            }
            // Misplaced declaration of an exception variable
            catch (Object obj1) { }
            finally { }
        }
          goto _L9
        useSharedRelrosLocked(sSharedRelros);
        sSharedRelros.clear();
        sSharedRelros = null;
        continue; /* Loop/switch isn't completed */
        obj1;
        Log.e("chromium_android_linker", "Could not extract test runner class name", ((Throwable) (obj1)));
        obj1 = null;
          goto _L10
_L8:
        Log.i("chromium_android_linker", "All linker tests passed!");
_L4:
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        if (true) goto _L1; else goto _L11
_L11:
    }

    public static long getBaseLoadAddress()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        ensureInitializedLocked();
        if (sInBrowserProcess)
        {
            break MISSING_BLOCK_LABEL_26;
        }
        Log.w("chromium_android_linker", "Shared RELRO sections are disabled in this process!");
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return 0L;
        long l;
        setupBaseLoadAddressLocked();
        l = sBaseLoadAddress;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static Bundle getSharedRelros()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        if (sInBrowserProcess)
        {
            break MISSING_BLOCK_LABEL_14;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return null;
        Bundle bundle = sSharedRelros;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return bundle;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static String getTestRunnerClassName()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        String s = sTestRunnerClassName;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return s;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void initServiceProcess(long l)
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        ensureInitializedLocked();
        sInBrowserProcess = false;
        sBrowserUsesSharedRelro = false;
        if (sRelroSharingSupported)
        {
            sWaitForSharedRelros = true;
            sBaseLoadAddress = l;
            sCurrentLoadAddress = l;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean isInZipFile()
    {
        return NativeLibraries.USE_LIBRARY_IN_ZIP_FILE;
    }

    public static boolean isUsed()
    {
        if (!NativeLibraries.USE_LINKER)
        {
            return false;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        boolean flag;
        ensureInitializedLocked();
        flag = sRelroSharingSupported;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean isUsingBrowserSharedRelros()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        boolean flag;
        ensureInitializedLocked();
        flag = sBrowserUsesSharedRelro;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return flag;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static boolean loadAtFixedAddressFailed()
    {
        return sLoadAtFixedAddressFailed;
    }

    public static void loadLibrary(String s)
    {
        loadLibraryMaybeInZipFile(null, s);
    }

    public static void loadLibraryInZipFile(String s, String s1)
    {
        loadLibraryMaybeInZipFile(s, s1);
    }

    private static void loadLibraryMaybeInZipFile(String s, String s1)
    {
        if (s1.equals("chromium_android_linker") || s1.equals("chromium_android_linker.cr"))
        {
            return;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        ensureInitializedLocked();
        if (!$assertionsDisabled && !sPrepareLibraryLoadCalled)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_51;
        s;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw s;
        String s2;
        s2 = System.mapLibraryName(s1);
        if (sLoadedLibraries == null)
        {
            sLoadedLibraries = new HashMap();
        }
        if (!sLoadedLibraries.containsKey(s2))
        {
            break MISSING_BLOCK_LABEL_86;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        LibInfo libinfo = new LibInfo();
        long l = 0L;
        if (sInBrowserProcess && sBrowserUsesSharedRelro || sWaitForSharedRelros)
        {
            l = sCurrentLoadAddress;
        }
        s1 = s2;
        if (s == null) goto _L2; else goto _L1
_L1:
        if (!nativeLoadLibraryInZipFile(s, s2, l, libinfo))
        {
            s = (new StringBuilder()).append("Unable to load library: ").append(s2).append(" in: ").append(s).toString();
            Log.e("chromium_android_linker", s);
            throw new UnsatisfiedLinkError(s);
        }
_L4:
        if (l == 0L)
        {
            break MISSING_BLOCK_LABEL_205;
        }
        if (l != libinfo.mLoadAddress)
        {
            sLoadAtFixedAddressFailed = true;
        }
        Locale locale;
        if (!NativeLibraries.ENABLE_LINKER_TESTS)
        {
            break MISSING_BLOCK_LABEL_262;
        }
        locale = Locale.US;
        if (sInBrowserProcess)
        {
            s1 = "BROWSER";
        } else
        {
            s1 = "RENDERER";
        }
        Log.i("chromium_android_linker", String.format(locale, "%s_LIBRARY_ADDRESS: %s %x", new Object[] {
            s1, s2, Long.valueOf(libinfo.mLoadAddress)
        }));
        if (sInBrowserProcess && !nativeCreateSharedRelro(s, sCurrentLoadAddress, libinfo))
        {
            Log.w("chromium_android_linker", String.format(Locale.US, "Could not create shared RELRO for %s at %x", new Object[] {
                s2, Long.valueOf(sCurrentLoadAddress)
            }));
        }
        if (sCurrentLoadAddress != 0L)
        {
            sCurrentLoadAddress = libinfo.mLoadAddress + libinfo.mLoadSize;
        }
        sLoadedLibraries.put(s2, libinfo);
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
_L2:
        s = s1;
        if (nativeLoadLibrary(s2, l, libinfo)) goto _L4; else goto _L3
_L3:
        s = (new StringBuilder()).append("Unable to load library: ").append(s2).toString();
        Log.e("chromium_android_linker", s);
        throw new UnsatisfiedLinkError(s);
    }

    private static native boolean nativeCanUseSharedRelro();

    private static native boolean nativeCreateSharedRelro(String s, long l, LibInfo libinfo);

    private static native long nativeGetRandomBaseLoadAddress(long l);

    private static native boolean nativeLoadLibrary(String s, long l, LibInfo libinfo);

    private static native boolean nativeLoadLibraryInZipFile(String s, String s1, long l, LibInfo libinfo);

    private static native void nativeRunCallbackOnUiThread(long l);

    private static native boolean nativeUseSharedRelro(String s, LibInfo libinfo);

    public static void postCallbackOnMainThread(long l)
    {
        ThreadUtils.postOnUiThread(new Runnable(l) {

            final long val$opaque;

            public void run()
            {
                Linker.nativeRunCallbackOnUiThread(opaque);
            }

            
            {
                opaque = l;
                super();
            }
        });
    }

    public static void prepareLibraryLoad()
    {
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        sPrepareLibraryLoadCalled = true;
        if (sInBrowserProcess)
        {
            setupBaseLoadAddressLocked();
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
    }

    public static void setMemoryDeviceConfig(int i)
    {
        if (!$assertionsDisabled && !NativeLibraries.ENABLE_LINKER_TESTS)
        {
            throw new AssertionError();
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && sMemoryDeviceConfig != 0)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_49;
        Exception exception;
        exception;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw exception;
        if ($assertionsDisabled || i == 1 || i == 2)
        {
            break MISSING_BLOCK_LABEL_73;
        }
        throw new AssertionError();
        sMemoryDeviceConfig = i;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
    }

    public static void setTestRunnerClassName(String s)
    {
        if (!NativeLibraries.ENABLE_LINKER_TESTS)
        {
            return;
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        if (!$assertionsDisabled && sTestRunnerClassName != null)
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_36;
        s;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw s;
        sTestRunnerClassName = s;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
    }

    private static void setupBaseLoadAddressLocked()
    {
        if (!$assertionsDisabled && !Thread.holdsLock(org/chromium/base/library_loader/Linker))
        {
            throw new AssertionError();
        }
        if (sBaseLoadAddress == 0L)
        {
            long l = computeRandomBaseLoadAddress();
            sBaseLoadAddress = l;
            sCurrentLoadAddress = l;
            if (l == 0L)
            {
                Log.w("chromium_android_linker", "Disabling shared RELROs due address space pressure");
                sBrowserUsesSharedRelro = false;
                sWaitForSharedRelros = false;
            }
        }
    }

    public static void useSharedRelros(Bundle bundle)
    {
        Bundle bundle1;
        bundle1 = null;
        if (bundle != null)
        {
            bundle.setClassLoader(org/chromium/base/library_loader/Linker$LibInfo.getClassLoader());
            bundle1 = new Bundle(org/chromium/base/library_loader/Linker$LibInfo.getClassLoader());
            Parcel parcel = Parcel.obtain();
            bundle.writeToParcel(parcel, 0);
            parcel.setDataPosition(0);
            bundle1.readFromParcel(parcel);
            parcel.recycle();
        }
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorenter ;
        sSharedRelros = bundle1;
        org/chromium/base/library_loader/Linker.notifyAll();
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        return;
        bundle;
        org/chromium/base/library_loader/Linker;
        JVM INSTR monitorexit ;
        throw bundle;
    }

    private static void useSharedRelrosLocked(Bundle bundle)
    {
        if (!$assertionsDisabled && !Thread.holdsLock(org/chromium/base/library_loader/Linker))
        {
            throw new AssertionError();
        }
        break MISSING_BLOCK_LABEL_22;
        if (bundle != null && sRelroSharingSupported && sLoadedLibraries != null)
        {
            bundle = createLibInfoMapFromBundle(bundle);
            Iterator iterator = bundle.entrySet().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                java.util.Map.Entry entry = (java.util.Map.Entry)iterator.next();
                String s = (String)entry.getKey();
                if (!nativeUseSharedRelro(s, (LibInfo)entry.getValue()))
                {
                    Log.w("chromium_android_linker", (new StringBuilder()).append("Could not use shared RELRO section for ").append(s).toString());
                }
            } while (true);
            if (!sInBrowserProcess)
            {
                closeLibInfoMap(bundle);
                return;
            }
        }
        return;
    }

    static 
    {
        boolean flag;
        if (!org/chromium/base/library_loader/Linker.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }

}
