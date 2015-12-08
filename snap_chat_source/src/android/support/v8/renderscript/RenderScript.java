// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import bM;
import bN;
import bQ;
import bS;
import bT;
import bU;
import bV;
import java.io.File;
import java.lang.reflect.Method;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class RenderScript
{
    public static final class a extends Enum
    {

        public static final a a;
        private static a c;
        private static a d;
        private static final a e[];
        int b;

        public static a valueOf(String s)
        {
            return (a)Enum.valueOf(android/support/v8/renderscript/RenderScript$a, s);
        }

        public static a[] values()
        {
            return (a[])e.clone();
        }

        static 
        {
            a = new a("NORMAL", 0, 0);
            c = new a("DEBUG", 1, 1);
            d = new a("PROFILE", 2, 2);
            e = (new a[] {
                a, c, d
            });
        }

        private a(String s, int i, int j)
        {
            super(s, i);
            b = j;
        }
    }

    static final class b extends Thread
    {

        boolean a;
        private RenderScript b;
        private int c[];

        public final void run()
        {
            Object obj = new int[16];
            b.nContextInitToClient(b.mContext);
            do
            {
                if (!a)
                {
                    break;
                }
                obj[0] = 0;
                int i = b.nContextPeekMessage(b.mContext, c);
                int j = c[1];
                int k = c[0];
                if (i == 4)
                {
                    int ai[] = ((int []) (obj));
                    if (j >> 2 >= obj.length)
                    {
                        ai = new int[j + 3 >> 2];
                    }
                    if (b.nContextGetUserMessage(b.mContext, ai) != 4)
                    {
                        throw new bQ("Error processing message from RenderScript.");
                    }
                    if (b.mMessageCallback != null)
                    {
                        obj = b.mMessageCallback;
                        obj = b.mMessageCallback;
                        obj = b.mMessageCallback;
                        b.mMessageCallback.run();
                        obj = ai;
                    } else
                    {
                        throw new bS("Received a message from the script with no message handler installed.");
                    }
                } else
                if (i == 3)
                {
                    String s = b.nContextGetErrorMessage(b.mContext);
                    if (k >= 4096)
                    {
                        throw new bT((new StringBuilder("Fatal error ")).append(k).append(", details: ").append(s).toString());
                    }
                    if (b.mErrorCallback != null)
                    {
                        d d1 = b.mErrorCallback;
                        d1 = b.mErrorCallback;
                        b.mErrorCallback.run();
                    }
                } else
                {
                    try
                    {
                        sleep(1L, 0);
                    }
                    catch (InterruptedException interruptedexception) { }
                }
            } while (true);
        }

        b(RenderScript renderscript)
        {
            super("RSMessageThread");
            a = true;
            c = new int[2];
            b = renderscript;
        }
    }

    public static final class c extends Enum
    {

        public static final c a;
        public static final c b;
        private static final c d[];
        int c;

        public static c valueOf(String s)
        {
            return (c)Enum.valueOf(android/support/v8/renderscript/RenderScript$c, s);
        }

        public static c[] values()
        {
            return (c[])d.clone();
        }

        static 
        {
            a = new c("LOW", 0, 15);
            b = new c("NORMAL", 1, -4);
            d = (new c[] {
                a, b
            });
        }

        private c(String s, int i, int j)
        {
            super(s, i);
            c = j;
        }
    }

    public static final class d
        implements Runnable
    {

        public final void run()
        {
        }
    }

    public static final class e
        implements Runnable
    {

        public final void run()
        {
        }
    }


    private static final String CACHE_PATH = "com.android.renderscript.cache";
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    public static boolean isNative = false;
    static Object lock = new Object();
    static String mCachePath;
    public static Method registerNativeAllocation;
    public static Method registerNativeFree;
    static boolean sInitialized;
    public static Object sRuntime;
    private static int sSdkVersion = -1;
    private static int sThunk = -1;
    public static boolean sUseGCHooks;
    private Context mApplicationContext;
    int mContext;
    int mDev;
    bN mElement_ALLOCATION;
    public bN mElement_A_8;
    bN mElement_BOOLEAN;
    bN mElement_CHAR_2;
    bN mElement_CHAR_3;
    bN mElement_CHAR_4;
    bN mElement_DOUBLE_2;
    bN mElement_DOUBLE_3;
    bN mElement_DOUBLE_4;
    bN mElement_ELEMENT;
    bN mElement_F32;
    bN mElement_F64;
    bN mElement_FLOAT_2;
    bN mElement_FLOAT_3;
    bN mElement_FLOAT_4;
    bN mElement_I16;
    bN mElement_I32;
    bN mElement_I64;
    bN mElement_I8;
    bN mElement_INT_2;
    bN mElement_INT_3;
    bN mElement_INT_4;
    bN mElement_LONG_2;
    bN mElement_LONG_3;
    bN mElement_LONG_4;
    bN mElement_MATRIX_2X2;
    bN mElement_MATRIX_3X3;
    bN mElement_MATRIX_4X4;
    public bN mElement_RGBA_4444;
    bN mElement_RGBA_5551;
    public bN mElement_RGBA_8888;
    public bN mElement_RGB_565;
    bN mElement_RGB_888;
    bN mElement_SAMPLER;
    bN mElement_SCRIPT;
    bN mElement_SHORT_2;
    bN mElement_SHORT_3;
    bN mElement_SHORT_4;
    bN mElement_TYPE;
    bN mElement_U16;
    bN mElement_U32;
    bN mElement_U64;
    public bN mElement_U8;
    bN mElement_UCHAR_2;
    bN mElement_UCHAR_3;
    public bN mElement_UCHAR_4;
    bN mElement_UINT_2;
    bN mElement_UINT_3;
    bN mElement_UINT_4;
    bN mElement_ULONG_2;
    bN mElement_ULONG_3;
    bN mElement_ULONG_4;
    bN mElement_USHORT_2;
    bN mElement_USHORT_3;
    bN mElement_USHORT_4;
    public d mErrorCallback;
    public e mMessageCallback;
    b mMessageThread;
    public ReentrantReadWriteLock mRWLock;
    bV mSampler_CLAMP_LINEAR;
    bV mSampler_CLAMP_LINEAR_MIP_LINEAR;
    bV mSampler_CLAMP_NEAREST;
    bV mSampler_MIRRORED_REPEAT_LINEAR;
    bV mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    bV mSampler_MIRRORED_REPEAT_NEAREST;
    bV mSampler_WRAP_LINEAR;
    bV mSampler_WRAP_LINEAR_MIP_LINEAR;
    bV mSampler_WRAP_NEAREST;

    public RenderScript(Context context)
    {
        mMessageCallback = null;
        mErrorCallback = null;
        if (context != null)
        {
            mApplicationContext = context.getApplicationContext();
        }
        mRWLock = new ReentrantReadWriteLock();
    }

    public static RenderScript create(Context context)
    {
        return create(context, a.a);
    }

    public static RenderScript create(Context context, int i)
    {
        return create(context, i, a.a);
    }

    public static RenderScript create(Context context, int i, a a1)
    {
        RenderScript renderscript;
        renderscript = new RenderScript(context);
        if (sSdkVersion == -1)
        {
            sSdkVersion = i;
        } else
        if (sSdkVersion != i)
        {
            throw new bT("Can't have two contexts with different SDK versions in support lib");
        }
        if (setupThunk(sSdkVersion, context))
        {
            return bU.a(context, sSdkVersion);
        }
        context = ((Context) (lock));
        context;
        JVM INSTR monitorenter ;
        boolean flag = sInitialized;
        if (flag) goto _L2; else goto _L1
_L1:
        Class class1 = Class.forName("dalvik.system.VMRuntime");
        sRuntime = class1.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
        registerNativeAllocation = class1.getDeclaredMethod("registerNativeAllocation", new Class[] {
            Integer.TYPE
        });
        registerNativeFree = class1.getDeclaredMethod("registerNativeFree", new Class[] {
            Integer.TYPE
        });
        sUseGCHooks = true;
_L3:
        System.loadLibrary("RSSupport");
        System.loadLibrary("rsjni");
        sInitialized = true;
_L2:
        context;
        JVM INSTR monitorexit ;
        renderscript.mDev = renderscript.nDeviceCreate();
        renderscript.mContext = renderscript.nContextCreate(renderscript.mDev, 0, i, a1.b);
        Exception exception;
        if (renderscript.mContext == 0)
        {
            throw new bQ("Failed to create RS context.");
        } else
        {
            renderscript.mMessageThread = new b(renderscript);
            renderscript.mMessageThread.start();
            return renderscript;
        }
        exception;
        sUseGCHooks = false;
          goto _L3
        a1;
        context;
        JVM INSTR monitorexit ;
        throw a1;
        a1;
        (new StringBuilder("Error loading RS jni library: ")).append(a1);
        throw new bT((new StringBuilder("Error loading RS jni library: ")).append(a1).toString());
    }

    public static RenderScript create(Context context, a a1)
    {
        return create(context, context.getApplicationInfo().targetSdkVersion, a1);
    }

    public static void setupDiskCache(File file)
    {
        file = new File(file, "com.android.renderscript.cache");
        mCachePath = file.getAbsolutePath();
        file.mkdirs();
    }

    private static boolean setupThunk(int i, Context context)
    {
        boolean flag = false;
        if (sThunk != -1) goto _L2; else goto _L1
_L1:
        int j;
        long l;
        long l1;
        try
        {
            j = ((Integer)Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", new Class[] {
                java/lang/String, Integer.TYPE
            }).invoke(null, new Object[] {
                "debug.rs.forcecompat", new Integer(0)
            })).intValue();
        }
        catch (Exception exception)
        {
            j = 0;
        }
        if ((android.os.Build.VERSION.SDK_INT != 18 || i < 19) && android.os.Build.VERSION.SDK_INT >= 18 && j == 0)
        {
            sThunk = 1;
        } else
        {
            sThunk = 0;
        }
        if (sThunk != 1) goto _L2; else goto _L3
_L3:
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            return true;
        }
        l = 0L;
        l1 = ((Long)Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID", new Class[0]).invoke(null, new Object[0])).longValue();
        l = l1;
_L5:
        if (((ApplicationInfo) (context)).metaData != null)
        {
            if (((ApplicationInfo) (context)).metaData.getBoolean("com.android.support.v8.renderscript.EnableAsyncTeardown") && l == 0L)
            {
                sThunk = 0;
            }
            if (((ApplicationInfo) (context)).metaData.getBoolean("com.android.support.v8.renderscript.EnableBlurWorkaround") && android.os.Build.VERSION.SDK_INT <= 19)
            {
                sThunk = 0;
            }
        }
_L2:
        if (sThunk == 1)
        {
            flag = true;
        }
        return flag;
        Exception exception1;
        exception1;
        if (true) goto _L5; else goto _L4
_L4:
    }

    static boolean shouldThunk()
    {
        if (sThunk == -1)
        {
            throw new bT("Can't use RS classes before setting up a RenderScript context");
        }
        return sThunk == 1;
    }

    public void contextDump()
    {
        validate();
        nContextDump(0);
    }

    public void destroy()
    {
        validate();
        nContextFinish();
        nContextDeinitToClient(mContext);
        mMessageThread.a = false;
        try
        {
            mMessageThread.join();
        }
        catch (InterruptedException interruptedexception) { }
        nContextDestroy();
        nDeviceDestroy(mDev);
        mDev = 0;
    }

    public void finish()
    {
        nContextFinish();
    }

    public final Context getApplicationContext()
    {
        return mApplicationContext;
    }

    public d getErrorHandler()
    {
        return mErrorCallback;
    }

    public e getMessageHandler()
    {
        return mMessageCallback;
    }

    public boolean isAlive()
    {
        return mContext != 0;
    }

    void nAllocationCopyFromBitmap(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyFromBitmap(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    public void nAllocationCopyToBitmap(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyToBitmap(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    public int nAllocationCreateBitmapBackedAllocation(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateBitmapBackedAllocation(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateBitmapRef(int i, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateBitmapRef(mContext, i, bitmap);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateFromAssetStream(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateFromAssetStream(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public int nAllocationCreateFromBitmap(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateFromBitmap(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    int nAllocationCreateTyped(int i, int j, int k, int l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCreateTyped(mContext, i, j, k, l);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    int nAllocationCubeCreateFromBitmap(int i, int j, Bitmap bitmap, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationCubeCreateFromBitmap(mContext, i, j, bitmap, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        bitmap;
        throw bitmap;
    }

    void nAllocationData1D(int i, int j, int k, int l, byte abyte0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, abyte0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData1D(int i, int j, int k, int l, float af[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, af, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData1D(int i, int j, int k, int l, int ai[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, ai, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData1D(int i, int j, int k, int l, short aword0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, i, j, k, l, aword0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2, k2, l2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            byte abyte0[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, abyte0, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            float af[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, af, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int ai[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, ai, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            short aword0[], int l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, j1, k1, aword0, l1);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationData2D(int i, int j, int k, int l, int i1, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, i, j, k, l, i1, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2, k2, l2, i3);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, abyte0, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, float af[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, af, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int ai[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, ai, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, short aword0[], int i2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, i, j, k, l, i1, j1, k1, l1, aword0, i2);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationElementData1D(int i, int j, int k, int l, byte abyte0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationElementData1D(mContext, i, j, k, l, abyte0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationGenerateMipmaps(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationGenerateMipmaps(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nAllocationGetType(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnAllocationGetType(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoReceive(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoReceive(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoSend(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoSend(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationRead(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationRead(int i, float af[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, af);
        this;
        JVM INSTR monitorexit ;
        return;
        af;
        throw af;
    }

    void nAllocationRead(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nAllocationRead(int i, short aword0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, i, aword0);
        this;
        JVM INSTR monitorexit ;
        return;
        aword0;
        throw aword0;
    }

    void nAllocationResize1D(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize1D(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationResize2D(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize2D(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationSyncAll(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationSyncAll(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nContextCreate(int i, int j, int k, int l)
    {
        this;
        JVM INSTR monitorenter ;
        i = rsnContextCreate(i, j, k, l);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    native void nContextDeinitToClient(int i);

    void nContextDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writelock = mRWLock.writeLock();
        writelock.lock();
        int i = mContext;
        mContext = 0;
        writelock.unlock();
        rsnContextDestroy(i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nContextDump(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextDump(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nContextFinish()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextFinish(mContext);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    native String nContextGetErrorMessage(int i);

    native int nContextGetUserMessage(int i, int ai[]);

    native void nContextInitToClient(int i);

    native int nContextPeekMessage(int i, int ai[]);

    void nContextSendMessage(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextSendMessage(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nContextSetPriority(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnContextSetPriority(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    native int nDeviceCreate();

    native void nDeviceDestroy(int i);

    native void nDeviceSetConfig(int i, int j, int k);

    public int nElementCreate(int i, int j, boolean flag, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnElementCreate(mContext, i, j, flag, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    int nElementCreate2(int ai[], String as[], int ai1[])
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        validate();
        i = rsnElementCreate2(mContext, ai, as, ai1);
        this;
        JVM INSTR monitorexit ;
        return i;
        ai;
        throw ai;
    }

    void nElementGetNativeData(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetNativeData(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nElementGetSubElements(int i, int ai[], String as[], int ai1[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetSubElements(mContext, i, ai, as, ai1);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    public void nObjDestroy(int i)
    {
        if (mContext != 0)
        {
            rsnObjDestroy(mContext, i);
        }
    }

    int nSamplerCreate(int i, int j, int k, int l, int i1, float f)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnSamplerCreate(mContext, i, j, k, l, i1, f);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptBindAllocation(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptBindAllocation(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    int nScriptCCreate(String s, String s1, byte abyte0[], int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptCCreate(mContext, s, s1, abyte0, i);
        this;
        JVM INSTR monitorexit ;
        return i;
        s;
        throw s;
    }

    int nScriptFieldIDCreate(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptFieldIDCreate(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    public void nScriptForEach(int i, int j, int k, int l, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEach(mContext, i, j, k, l);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEach(mContext, i, j, k, l, abyte0);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    void nScriptForEachClipped(int i, int j, int k, int l, byte abyte0[], int i1, int j1, 
            int k1, int l1, int i2, int j2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEachClipped(mContext, i, j, k, l, i1, j1, k1, l1, i2, j2);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEachClipped(mContext, i, j, k, l, abyte0, i1, j1, k1, l1, i2, j2);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    int nScriptGroupCreate(int ai[], int ai1[], int ai2[], int ai3[], int ai4[])
    {
        this;
        JVM INSTR monitorenter ;
        int i;
        validate();
        i = rsnScriptGroupCreate(mContext, ai, ai1, ai2, ai3, ai4);
        this;
        JVM INSTR monitorexit ;
        return i;
        ai;
        throw ai;
    }

    void nScriptGroupExecute(int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupExecute(mContext, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetInput(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetInput(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetOutput(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetOutput(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public int nScriptIntrinsicCreate(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptIntrinsicCreate(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptInvoke(int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptInvoke(mContext, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptInvokeV(int i, int j, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptInvokeV(mContext, i, j, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    int nScriptKernelIDCreate(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnScriptKernelIDCreate(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetTimeZone(int i, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetTimeZone(mContext, i, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarD(int i, int j, double d1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarD(mContext, i, j, d1);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void nScriptSetVarF(int i, int j, float f)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarF(mContext, i, j, f);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarI(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarI(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarJ(int i, int j, long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarJ(mContext, i, j, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    public void nScriptSetVarObj(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarObj(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarV(int i, int j, byte abyte0[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarV(mContext, i, j, abyte0);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarVE(int i, int j, byte abyte0[], int k, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptSetVarVE(mContext, i, j, abyte0, k, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    public int nTypeCreate(int i, int j, int k, int l, boolean flag, boolean flag1, int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        i = rsnTypeCreate(mContext, i, j, k, l, flag, flag1, i1);
        this;
        JVM INSTR monitorexit ;
        return i;
        Exception exception;
        exception;
        throw exception;
    }

    void nTypeGetNativeData(int i, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnTypeGetNativeData(mContext, i, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    native void rsnAllocationCopyFromBitmap(int i, int j, Bitmap bitmap);

    native void rsnAllocationCopyToBitmap(int i, int j, Bitmap bitmap);

    native int rsnAllocationCreateBitmapBackedAllocation(int i, int j, int k, Bitmap bitmap, int l);

    native int rsnAllocationCreateBitmapRef(int i, int j, Bitmap bitmap);

    native int rsnAllocationCreateFromAssetStream(int i, int j, int k, int l);

    native int rsnAllocationCreateFromBitmap(int i, int j, int k, Bitmap bitmap, int l);

    native int rsnAllocationCreateTyped(int i, int j, int k, int l, int i1);

    native int rsnAllocationCubeCreateFromBitmap(int i, int j, int k, Bitmap bitmap, int l);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, byte abyte0[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, float af[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, int ai[], int j1);

    native void rsnAllocationData1D(int i, int j, int k, int l, int i1, short aword0[], int j1);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, byte abyte0[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, float af[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int ai[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, short aword0[], int i2);

    native void rsnAllocationData2D(int i, int j, int k, int l, int i1, int j1, Bitmap bitmap);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2, int l2, int i3, int j3);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, byte abyte0[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, float af[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int ai[], int j2);

    native void rsnAllocationData3D(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, short aword0[], int j2);

    native void rsnAllocationElementData1D(int i, int j, int k, int l, int i1, byte abyte0[], int j1);

    native void rsnAllocationGenerateMipmaps(int i, int j);

    native int rsnAllocationGetType(int i, int j);

    native void rsnAllocationIoReceive(int i, int j);

    native void rsnAllocationIoSend(int i, int j);

    native void rsnAllocationRead(int i, int j, byte abyte0[]);

    native void rsnAllocationRead(int i, int j, float af[]);

    native void rsnAllocationRead(int i, int j, int ai[]);

    native void rsnAllocationRead(int i, int j, short aword0[]);

    native void rsnAllocationResize1D(int i, int j, int k);

    native void rsnAllocationResize2D(int i, int j, int k, int l);

    native void rsnAllocationSyncAll(int i, int j, int k);

    native int rsnContextCreate(int i, int j, int k, int l);

    native void rsnContextDestroy(int i);

    native void rsnContextDump(int i, int j);

    native void rsnContextFinish(int i);

    native void rsnContextSendMessage(int i, int j, int ai[]);

    native void rsnContextSetPriority(int i, int j);

    native int rsnElementCreate(int i, int j, int k, boolean flag, int l);

    native int rsnElementCreate2(int i, int ai[], String as[], int ai1[]);

    native void rsnElementGetNativeData(int i, int j, int ai[]);

    native void rsnElementGetSubElements(int i, int j, int ai[], String as[], int ai1[]);

    native void rsnObjDestroy(int i, int j);

    native int rsnSamplerCreate(int i, int j, int k, int l, int i1, int j1, float f);

    native void rsnScriptBindAllocation(int i, int j, int k, int l);

    native int rsnScriptCCreate(int i, String s, String s1, byte abyte0[], int j);

    native int rsnScriptFieldIDCreate(int i, int j, int k);

    native void rsnScriptForEach(int i, int j, int k, int l, int i1);

    native void rsnScriptForEach(int i, int j, int k, int l, int i1, byte abyte0[]);

    native void rsnScriptForEachClipped(int i, int j, int k, int l, int i1, int j1, int k1, 
            int l1, int i2, int j2, int k2);

    native void rsnScriptForEachClipped(int i, int j, int k, int l, int i1, byte abyte0[], int j1, 
            int k1, int l1, int i2, int j2, int k2);

    native int rsnScriptGroupCreate(int i, int ai[], int ai1[], int ai2[], int ai3[], int ai4[]);

    native void rsnScriptGroupExecute(int i, int j);

    native void rsnScriptGroupSetInput(int i, int j, int k, int l);

    native void rsnScriptGroupSetOutput(int i, int j, int k, int l);

    native int rsnScriptIntrinsicCreate(int i, int j, int k);

    native void rsnScriptInvoke(int i, int j, int k);

    native void rsnScriptInvokeV(int i, int j, int k, byte abyte0[]);

    native int rsnScriptKernelIDCreate(int i, int j, int k, int l);

    native void rsnScriptSetTimeZone(int i, int j, byte abyte0[]);

    native void rsnScriptSetVarD(int i, int j, int k, double d1);

    native void rsnScriptSetVarF(int i, int j, int k, float f);

    native void rsnScriptSetVarI(int i, int j, int k, int l);

    native void rsnScriptSetVarJ(int i, int j, int k, long l);

    native void rsnScriptSetVarObj(int i, int j, int k, int l);

    native void rsnScriptSetVarV(int i, int j, int k, byte abyte0[]);

    native void rsnScriptSetVarVE(int i, int j, int k, byte abyte0[], int l, int ai[]);

    native int rsnTypeCreate(int i, int j, int k, int l, int i1, boolean flag, boolean flag1, 
            int j1);

    native void rsnTypeGetNativeData(int i, int j, int ai[]);

    int safeID(bM bm)
    {
        if (bm != null)
        {
            return bm.a(this);
        } else
        {
            return 0;
        }
    }

    public void sendMessage(int i, int ai[])
    {
        nContextSendMessage(i, ai);
    }

    public void setErrorHandler(d d1)
    {
        mErrorCallback = d1;
        if (isNative)
        {
            ((bU)this).setErrorHandler(d1);
        }
    }

    public void setMessageHandler(e e1)
    {
        mMessageCallback = e1;
        if (isNative)
        {
            ((bU)this).setMessageHandler(e1);
        }
    }

    public void setPriority(c c1)
    {
        validate();
        nContextSetPriority(c1.c);
    }

    public void validate()
    {
        if (mContext == 0)
        {
            throw new bS("Calling RS with no Context active.");
        } else
        {
            return;
        }
    }

}
