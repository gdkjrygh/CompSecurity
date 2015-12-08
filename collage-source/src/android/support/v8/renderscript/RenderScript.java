// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v8.renderscript;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.Surface;
import java.io.File;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;

// Referenced classes of package android.support.v8.renderscript:
//            RSRuntimeException, RSDriverException, BaseObj, RSInvalidStateException, 
//            Element, Sampler

public class RenderScript
{
    public static final class ContextType extends Enum
    {

        private static final ContextType $VALUES[];
        public static final ContextType DEBUG;
        public static final ContextType NORMAL;
        public static final ContextType PROFILE;
        int mID;

        public static ContextType valueOf(String s)
        {
            return (ContextType)Enum.valueOf(android/support/v8/renderscript/RenderScript$ContextType, s);
        }

        public static ContextType[] values()
        {
            return (ContextType[])$VALUES.clone();
        }

        static 
        {
            NORMAL = new ContextType("NORMAL", 0, 0);
            DEBUG = new ContextType("DEBUG", 1, 1);
            PROFILE = new ContextType("PROFILE", 2, 2);
            $VALUES = (new ContextType[] {
                NORMAL, DEBUG, PROFILE
            });
        }

        private ContextType(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }

    static class MessageThread extends Thread
    {

        static final int RS_ERROR_FATAL_UNKNOWN = 4096;
        static final int RS_MESSAGE_TO_CLIENT_ERROR = 3;
        static final int RS_MESSAGE_TO_CLIENT_EXCEPTION = 1;
        static final int RS_MESSAGE_TO_CLIENT_NONE = 0;
        static final int RS_MESSAGE_TO_CLIENT_RESIZE = 2;
        static final int RS_MESSAGE_TO_CLIENT_USER = 4;
        int mAuxData[];
        RenderScript mRS;
        boolean mRun;

        public void run()
        {
            int ai[] = new int[16];
            mRS.nContextInitToClient(mRS.mContext);
            while (mRun) 
            {
                ai[0] = 0;
                int i = mRS.nContextPeekMessage(mRS.mContext, mAuxData);
                int j = mAuxData[1];
                int k = mAuxData[0];
                if (i == 4)
                {
                    int ai1[] = ai;
                    if (j >> 2 >= ai.length)
                    {
                        ai1 = new int[j + 3 >> 2];
                    }
                    if (mRS.nContextGetUserMessage(mRS.mContext, ai1) != 4)
                    {
                        throw new RSDriverException("Error processing message from RenderScript.");
                    }
                    if (mRS.mMessageCallback != null)
                    {
                        mRS.mMessageCallback.mData = ai1;
                        mRS.mMessageCallback.mID = k;
                        mRS.mMessageCallback.mLength = j;
                        mRS.mMessageCallback.run();
                        ai = ai1;
                    } else
                    {
                        throw new RSInvalidStateException("Received a message from the script with no message handler installed.");
                    }
                } else
                if (i == 3)
                {
                    String s = mRS.nContextGetErrorMessage(mRS.mContext);
                    if (k >= 4096)
                    {
                        throw new RSRuntimeException((new StringBuilder()).append("Fatal error ").append(k).append(", details: ").append(s).toString());
                    }
                    if (mRS.mErrorCallback != null)
                    {
                        mRS.mErrorCallback.mErrorMessage = s;
                        mRS.mErrorCallback.mErrorNum = k;
                        mRS.mErrorCallback.run();
                    } else
                    {
                        Log.e("RenderScript_jni", (new StringBuilder()).append("non fatal RS error, ").append(s).toString());
                    }
                } else
                {
                    try
                    {
                        sleep(1L, 0);
                    }
                    catch (InterruptedException interruptedexception) { }
                }
            }
        }

        MessageThread(RenderScript renderscript)
        {
            super("RSMessageThread");
            mRun = true;
            mAuxData = new int[2];
            mRS = renderscript;
        }
    }

    public static final class Priority extends Enum
    {

        private static final Priority $VALUES[];
        public static final Priority LOW;
        public static final Priority NORMAL;
        int mID;

        public static Priority valueOf(String s)
        {
            return (Priority)Enum.valueOf(android/support/v8/renderscript/RenderScript$Priority, s);
        }

        public static Priority[] values()
        {
            return (Priority[])$VALUES.clone();
        }

        static 
        {
            LOW = new Priority("LOW", 0, 15);
            NORMAL = new Priority("NORMAL", 1, -4);
            $VALUES = (new Priority[] {
                LOW, NORMAL
            });
        }

        private Priority(String s, int i, int j)
        {
            super(s, i);
            mID = j;
        }
    }

    public static class RSErrorHandler
        implements Runnable
    {

        protected String mErrorMessage;
        protected int mErrorNum;

        public void run()
        {
        }

        public RSErrorHandler()
        {
        }
    }

    public static class RSMessageHandler
        implements Runnable
    {

        protected int mData[];
        protected int mID;
        protected int mLength;

        public void run()
        {
        }

        public RSMessageHandler()
        {
        }
    }


    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static final int SUPPORT_LIB_API = 23;
    static Object lock = new Object();
    private static String mBlackList = "";
    static String mCachePath;
    private static ArrayList mProcessContextList = new ArrayList();
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    private static int sNative = -1;
    static int sPointerSize;
    static Object sRuntime;
    private static int sSdkVersion = -1;
    static boolean sUseGCHooks;
    private static boolean useIOlib = false;
    private static boolean useNative;
    private Context mApplicationContext;
    long mContext;
    private int mContextFlags;
    private int mContextSdkVersion;
    ContextType mContextType;
    long mDev;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    RSErrorHandler mErrorCallback;
    long mIncCon;
    long mIncDev;
    boolean mIncLoaded;
    private boolean mIsProcessContext;
    RSMessageHandler mMessageCallback;
    MessageThread mMessageThread;
    private String mNativeLibDir;
    ReentrantReadWriteLock mRWLock;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;

    RenderScript(Context context)
    {
        mIsProcessContext = false;
        mContextFlags = 0;
        mContextSdkVersion = 0;
        mMessageCallback = null;
        mErrorCallback = null;
        mContextType = ContextType.NORMAL;
        if (context != null)
        {
            mApplicationContext = context.getApplicationContext();
            mNativeLibDir = mApplicationContext.getApplicationInfo().nativeLibraryDir;
        }
        mIncDev = 0L;
        mIncCon = 0L;
        mIncLoaded = false;
        mRWLock = new ReentrantReadWriteLock();
    }

    public static RenderScript create(Context context)
    {
        return create(context, ContextType.NORMAL);
    }

    public static RenderScript create(Context context, int i)
    {
        return create(context, i, ContextType.NORMAL, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contexttype)
    {
        return create(context, i, contexttype, 0);
    }

    public static RenderScript create(Context context, int i, ContextType contexttype, int j)
    {
label0:
        {
            RenderScript renderscript;
            synchronized (mProcessContextList)
            {
                Iterator iterator = mProcessContextList.iterator();
                do
                {
                    if (!iterator.hasNext())
                    {
                        break label0;
                    }
                    renderscript = (RenderScript)iterator.next();
                } while (renderscript.mContextType != contexttype || renderscript.mContextFlags != j || renderscript.mContextSdkVersion != i);
            }
            return renderscript;
        }
        context = internalCreate(context, i, contexttype, j);
        context.mIsProcessContext = true;
        mProcessContextList.add(context);
        arraylist;
        JVM INSTR monitorexit ;
        return context;
        context;
        arraylist;
        JVM INSTR monitorexit ;
        throw context;
    }

    public static RenderScript create(Context context, ContextType contexttype)
    {
        return create(context, contexttype, 0);
    }

    public static RenderScript create(Context context, ContextType contexttype, int i)
    {
        return create(context, context.getApplicationInfo().targetSdkVersion, contexttype, i);
    }

    public static RenderScript createMultiContext(Context context, ContextType contexttype, int i, int j)
    {
        return internalCreate(context, j, contexttype, i);
    }

    public static void forceCompat()
    {
        sNative = 0;
    }

    private static RenderScript internalCreate(Context context, int i, ContextType contexttype, int j)
    {
        RenderScript renderscript;
        renderscript = new RenderScript(context);
        Class class1;
        boolean flag;
        if (sSdkVersion == -1)
        {
            sSdkVersion = i;
        } else
        if (sSdkVersion != i)
        {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        useNative = setupNative(sSdkVersion, context);
        context = ((Context) (lock));
        context;
        JVM INSTR monitorenter ;
        flag = sInitialized;
        if (flag) goto _L2; else goto _L1
_L1:
        class1 = Class.forName("dalvik.system.VMRuntime");
        sRuntime = class1.getDeclaredMethod("getRuntime", new Class[0]).invoke(null, new Object[0]);
        registerNativeAllocation = class1.getDeclaredMethod("registerNativeAllocation", new Class[] {
            Integer.TYPE
        });
        registerNativeFree = class1.getDeclaredMethod("registerNativeFree", new Class[] {
            Integer.TYPE
        });
        sUseGCHooks = true;
_L3:
        System.loadLibrary("rsjni");
        sInitialized = true;
        sPointerSize = rsnSystemGetPointerSize();
_L2:
        context;
        JVM INSTR monitorexit ;
        int k;
        if (useNative)
        {
            Log.v("RenderScript_jni", "RS native mode");
        } else
        {
            Log.v("RenderScript_jni", "RS compat mode");
        }
        if (android.os.Build.VERSION.SDK_INT >= 14)
        {
            useIOlib = true;
        }
        if (i < android.os.Build.VERSION.SDK_INT)
        {
            k = android.os.Build.VERSION.SDK_INT;
        } else
        {
            k = i;
        }
        if (!renderscript.nLoadSO(useNative, k))
        {
            if (useNative)
            {
                Log.v("RenderScript_jni", "Unable to load libRS.so, falling back to compat mode");
                useNative = false;
            }
            Exception exception;
            try
            {
                System.loadLibrary("RSSupport");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                Log.e("RenderScript_jni", (new StringBuilder()).append("Error loading RS Compat library: ").append(context).toString());
                throw new RSRuntimeException((new StringBuilder()).append("Error loading RS Compat library: ").append(context).toString());
            }
            if (!renderscript.nLoadSO(false, k))
            {
                throw new RSRuntimeException("Error loading libRSSupport library");
            }
        }
        break MISSING_BLOCK_LABEL_404;
        exception;
        Log.e("RenderScript_jni", "No GC methods");
        sUseGCHooks = false;
          goto _L3
        contexttype;
        context;
        JVM INSTR monitorexit ;
        throw contexttype;
        contexttype;
        Log.e("RenderScript_jni", (new StringBuilder()).append("Error loading RS jni library: ").append(contexttype).toString());
        throw new RSRuntimeException((new StringBuilder()).append("Error loading RS jni library: ").append(contexttype).toString());
        if (useIOlib)
        {
            try
            {
                System.loadLibrary("RSSupportIO");
            }
            // Misplaced declaration of an exception variable
            catch (Context context)
            {
                useIOlib = false;
            }
            if (!useIOlib || !renderscript.nLoadIOSO())
            {
                Log.v("RenderScript_jni", "Unable to load libRSSupportIO.so, USAGE_IO not supported");
                useIOlib = false;
            }
        }
        renderscript.mDev = renderscript.nDeviceCreate();
        renderscript.mContext = renderscript.nContextCreate(renderscript.mDev, 0, i, contexttype.mID, renderscript.mNativeLibDir);
        renderscript.mContextType = contexttype;
        renderscript.mContextFlags = j;
        renderscript.mContextSdkVersion = i;
        if (renderscript.mContext == 0L)
        {
            throw new RSDriverException("Failed to create RS context.");
        } else
        {
            renderscript.mMessageThread = new MessageThread(renderscript);
            renderscript.mMessageThread.start();
            return renderscript;
        }
    }

    public static void releaseAllContexts()
    {
        synchronized (mProcessContextList)
        {
            obj = mProcessContextList;
            mProcessContextList = new ArrayList();
        }
        RenderScript renderscript;
        for (obj1 = ((ArrayList) (obj)).iterator(); ((Iterator) (obj1)).hasNext(); renderscript.destroy())
        {
            renderscript = (RenderScript)((Iterator) (obj1)).next();
            renderscript.mIsProcessContext = false;
        }

        break MISSING_BLOCK_LABEL_63;
        obj;
        obj1;
        JVM INSTR monitorexit ;
        throw obj;
        ((ArrayList) (obj)).clear();
        return;
    }

    static native int rsnSystemGetPointerSize();

    public static void setBlackList(String s)
    {
        if (s != null)
        {
            mBlackList = s;
        }
    }

    public static void setupDiskCache(File file)
    {
        file = new File(file, "com.android.renderscript.cache");
        mCachePath = file.getAbsolutePath();
        file.mkdirs();
    }

    private static boolean setupNative(int i, Context context)
    {
        if (android.os.Build.VERSION.SDK_INT < i && android.os.Build.VERSION.SDK_INT < 21)
        {
            sNative = 0;
        }
        if (sNative != -1) goto _L2; else goto _L1
_L1:
        Object obj;
        long l;
        long l1;
        try
        {
            i = ((Integer)Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", new Class[] {
                java/lang/String, Integer.TYPE
            }).invoke(null, new Object[] {
                "debug.rs.forcecompat", new Integer(0)
            })).intValue();
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            i = 0;
        }
        if (android.os.Build.VERSION.SDK_INT >= 19 && i == 0)
        {
            sNative = 1;
        } else
        {
            sNative = 0;
        }
        if (sNative != 1) goto _L2; else goto _L3
_L3:
        try
        {
            context = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128);
        }
        // Misplaced declaration of an exception variable
        catch (Context context)
        {
            context = null;
        }
        if (context == null) goto _L2; else goto _L4
_L4:
        l = 0L;
        obj = Class.forName("android.renderscript.RenderScript");
        if (android.os.Build.VERSION.SDK_INT > 22) goto _L6; else goto _L5
_L5:
        l1 = ((Long)((Class) (obj)).getDeclaredMethod("getMinorID", new Class[0]).invoke(null, new Object[0])).longValue();
        l = l1;
_L13:
        if (((ApplicationInfo) (context)).metaData != null)
        {
            if (((ApplicationInfo) (context)).metaData.getBoolean("com.android.support.v8.renderscript.EnableAsyncTeardown") && l == 0L)
            {
                sNative = 0;
            }
            if (((ApplicationInfo) (context)).metaData.getBoolean("com.android.support.v8.renderscript.EnableBlurWorkaround") && android.os.Build.VERSION.SDK_INT <= 19)
            {
                sNative = 0;
            }
        }
_L2:
        if (sNative != 1) goto _L8; else goto _L7
_L7:
        if (mBlackList.length() <= 0) goto _L10; else goto _L9
_L9:
        context = (new StringBuilder()).append('(').append(Build.MANUFACTURER).append(':').append(Build.PRODUCT).append(':').append(Build.MODEL).append(')').toString();
        if (!mBlackList.contains(context)) goto _L10; else goto _L11
_L11:
        sNative = 0;
_L8:
        return false;
_L6:
        long l2 = ((Long)((Class) (obj)).getDeclaredMethod("getMinorVersion", new Class[0]).invoke(null, new Object[0])).longValue();
        l = l2;
        continue; /* Loop/switch isn't completed */
_L10:
        return true;
        Exception exception;
        exception;
        if (true) goto _L13; else goto _L12
_L12:
    }

    public void contextDump()
    {
        validate();
        nContextDump(0);
    }

    public void destroy()
    {
        if (mIsProcessContext)
        {
            return;
        }
        validate();
        nContextFinish();
        if (mIncCon != 0L)
        {
            nIncContextFinish();
            nIncContextDestroy();
            mIncCon = 0L;
        }
        nContextDeinitToClient(mContext);
        mMessageThread.mRun = false;
        try
        {
            mMessageThread.join();
        }
        catch (InterruptedException interruptedexception) { }
        nContextDestroy();
        nDeviceDestroy(mDev);
        if (mIncDev != 0L)
        {
            nIncDeviceDestroy(mIncDev);
            mIncDev = 0L;
        }
        mDev = 0L;
    }

    public void finish()
    {
        nContextFinish();
    }

    public final Context getApplicationContext()
    {
        return mApplicationContext;
    }

    public RSErrorHandler getErrorHandler()
    {
        return mErrorCallback;
    }

    public RSMessageHandler getMessageHandler()
    {
        return mMessageCallback;
    }

    boolean isAlive()
    {
        return mContext != 0L;
    }

    boolean isUseNative()
    {
        return useNative;
    }

    void nAllocationCopyFromBitmap(long l, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyFromBitmap(mContext, l, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    void nAllocationCopyToBitmap(long l, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationCopyToBitmap(mContext, l, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    long nAllocationCreateBitmapBackedAllocation(long l, int i, Bitmap bitmap, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationCreateBitmapBackedAllocation(mContext, l, i, bitmap, j);
        this;
        JVM INSTR monitorexit ;
        return l;
        bitmap;
        throw bitmap;
    }

    long nAllocationCreateBitmapRef(long l, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationCreateBitmapRef(mContext, l, bitmap);
        this;
        JVM INSTR monitorexit ;
        return l;
        bitmap;
        throw bitmap;
    }

    long nAllocationCreateFromAssetStream(int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        validate();
        l = rsnAllocationCreateFromAssetStream(mContext, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    long nAllocationCreateFromBitmap(long l, int i, Bitmap bitmap, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationCreateFromBitmap(mContext, l, i, bitmap, j);
        this;
        JVM INSTR monitorexit ;
        return l;
        bitmap;
        throw bitmap;
    }

    long nAllocationCreateTyped(long l, int i, int j, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationCreateTyped(mContext, l, i, j, l1);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    long nAllocationCubeCreateFromBitmap(long l, int i, Bitmap bitmap, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationCubeCreateFromBitmap(mContext, l, i, bitmap, j);
        this;
        JVM INSTR monitorexit ;
        return l;
        bitmap;
        throw bitmap;
    }

    void nAllocationData1D(long l, int i, int j, int k, Object obj, int i1, 
            Element.DataType datatype, int j1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData1D(mContext, l, i, j, k, obj, i1, datatype.mID, j1, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationData2D(long l, int i, int j, int k, int i1, int j1, 
            int k1, long l1, int i2, int j2, int k2, int l2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, l, i, j, k, i1, j1, k1, l1, i2, j2, k2, l2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData2D(long l, int i, int j, int k, int i1, int j1, 
            int k1, Object obj, int l1, Element.DataType datatype, int i2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, l, i, j, k, i1, j1, k1, obj, l1, datatype.mID, i2, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationData2D(long l, int i, int j, int k, int i1, Bitmap bitmap)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData2D(mContext, l, i, j, k, i1, bitmap);
        this;
        JVM INSTR monitorexit ;
        return;
        bitmap;
        throw bitmap;
    }

    void nAllocationData3D(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, long l2, int i2, int j2, int k2, 
            int i3)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, l, i, j, k, i1, j1, k1, l1, l2, i2, j2, k2, i3);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationData3D(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, Object obj, int i2, Element.DataType datatype, int j2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationData3D(mContext, l, i, j, k, i1, j1, k1, l1, obj, i2, datatype.mID, j2, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationElementData1D(long l, int i, int j, int k, byte abyte0[], int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationElementData1D(mContext, l, i, j, k, abyte0, i1);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nAllocationGenerateMipmaps(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationGenerateMipmaps(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nAllocationGetType(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnAllocationGetType(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoReceive(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoReceive(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationIoSend(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationIoSend(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationRead(long l, Object obj, Element.DataType datatype, int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead(mContext, l, obj, datatype.mID, i, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationRead1D(long l, int i, int j, int k, Object obj, int i1, 
            Element.DataType datatype, int j1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead1D(mContext, l, i, j, k, obj, i1, datatype.mID, j1, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationRead2D(long l, int i, int j, int k, int i1, int j1, 
            int k1, Object obj, int l1, Element.DataType datatype, int i2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationRead2D(mContext, l, i, j, k, i1, j1, k1, obj, l1, datatype.mID, i2, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        obj;
        throw obj;
    }

    void nAllocationResize1D(long l, int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize1D(mContext, l, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationResize2D(long l, int i, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationResize2D(mContext, l, i, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nAllocationSetSurface(long l, Surface surface)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationSetSurface(mContext, l, surface);
        this;
        JVM INSTR monitorexit ;
        return;
        surface;
        throw surface;
    }

    void nAllocationSyncAll(long l, int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnAllocationSyncAll(mContext, l, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nClosureCreate(long l, long l1, long al[], long al1[], int ai[], 
            long al2[], long al3[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnClosureCreate(mContext, l, l1, al, al1, ai, al2, al3);
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_51;
        }
        throw new RSRuntimeException("Failed creating closure.");
        al;
        this;
        JVM INSTR monitorexit ;
        throw al;
        this;
        JVM INSTR monitorexit ;
        return l;
    }

    void nClosureSetArg(long l, int i, long l1, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnClosureSetArg(mContext, l, i, l1, j);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nClosureSetGlobal(long l, long l1, long l2, int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnClosureSetGlobal(mContext, l, l1, l2, i);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nContextCreate(long l, int i, int j, int k, String s)
    {
        this;
        JVM INSTR monitorenter ;
        l = rsnContextCreate(l, i, j, k, s);
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    native void nContextDeinitToClient(long l);

    void nContextDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writelock = mRWLock.writeLock();
        writelock.lock();
        long l = mContext;
        mContext = 0L;
        writelock.unlock();
        rsnContextDestroy(l);
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

    native String nContextGetErrorMessage(long l);

    native int nContextGetUserMessage(long l, int ai[]);

    native void nContextInitToClient(long l);

    native int nContextPeekMessage(long l, int ai[]);

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

    native long nDeviceCreate();

    native void nDeviceDestroy(long l);

    native void nDeviceSetConfig(long l, int i, int j);

    long nElementCreate(long l, int i, boolean flag, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnElementCreate(mContext, l, i, flag, j);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    long nElementCreate2(long al[], String as[], int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        validate();
        l = rsnElementCreate2(mContext, al, as, ai);
        this;
        JVM INSTR monitorexit ;
        return l;
        al;
        throw al;
    }

    void nElementGetNativeData(long l, int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetNativeData(mContext, l, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        ai;
        throw ai;
    }

    void nElementGetSubElements(long l, long al[], String as[], int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnElementGetSubElements(mContext, l, al, as, ai);
        this;
        JVM INSTR monitorexit ;
        return;
        al;
        throw al;
    }

    long nIncAllocationCreateTyped(long l, long l1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnIncAllocationCreateTyped(mContext, mIncCon, l, l1);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    long nIncContextCreate(long l, int i, int j, int k)
    {
        this;
        JVM INSTR monitorenter ;
        l = rsnIncContextCreate(l, i, j, k);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nIncContextDestroy()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        java.util.concurrent.locks.ReentrantReadWriteLock.WriteLock writelock = mRWLock.writeLock();
        writelock.lock();
        long l = mIncCon;
        mIncCon = 0L;
        writelock.unlock();
        rsnIncContextDestroy(l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nIncContextFinish()
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnIncContextFinish(mIncCon);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    native long nIncDeviceCreate();

    native void nIncDeviceDestroy(long l);

    long nIncElementCreate(long l, int i, boolean flag, int j)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnIncElementCreate(mIncCon, l, i, flag, j);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    native boolean nIncLoadSO(int i);

    void nIncObjDestroy(long l)
    {
        if (mIncCon != 0L)
        {
            rsnIncObjDestroy(mIncCon, l);
        }
    }

    long nIncTypeCreate(long l, int i, int j, int k, boolean flag, boolean flag1, 
            int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnIncTypeCreate(mIncCon, l, i, j, k, flag, flag1, i1);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    long nInvokeClosureCreate(long l, byte abyte0[], long al[], long al1[], int ai[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnInvokeClosureCreate(mContext, l, abyte0, al, al1, ai);
        if (l != 0L)
        {
            break MISSING_BLOCK_LABEL_45;
        }
        throw new RSRuntimeException("Failed creating closure.");
        abyte0;
        this;
        JVM INSTR monitorexit ;
        throw abyte0;
        this;
        JVM INSTR monitorexit ;
        return l;
    }

    native boolean nLoadIOSO();

    native boolean nLoadSO(boolean flag, int i);

    void nObjDestroy(long l)
    {
        if (mContext != 0L)
        {
            rsnObjDestroy(mContext, l);
        }
    }

    long nSamplerCreate(int i, int j, int k, int l, int i1, float f)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = rsnSamplerCreate(mContext, i, j, k, l, i1, f);
        this;
        JVM INSTR monitorexit ;
        return l1;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptBindAllocation(long l, long l1, int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l2;
        validate();
        l2 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l2 = mIncCon;
        rsnScriptBindAllocation(l2, l, l1, i, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nScriptCCreate(String s, String s1, byte abyte0[], int i)
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        validate();
        l = rsnScriptCCreate(mContext, s, s1, abyte0, i);
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    long nScriptFieldIDCreate(long l, int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        l = rsnScriptFieldIDCreate(l1, l, i, flag);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptForEach(long l, int i, long l1, long l2, 
            byte abyte0[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEach(mContext, mIncCon, l, i, l1, l2, flag);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEach(mContext, mIncCon, l, i, l1, l2, abyte0, flag);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    void nScriptForEachClipped(long l, int i, long l1, long l2, 
            byte abyte0[], int j, int k, int i1, int j1, int k1, int i2, 
            boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (abyte0 != null) goto _L2; else goto _L1
_L1:
        rsnScriptForEachClipped(mContext, mIncCon, l, i, l1, l2, j, k, i1, j1, k1, i2, flag);
_L4:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        rsnScriptForEachClipped(mContext, mIncCon, l, i, l1, l2, abyte0, j, k, i1, j1, k1, i2, flag);
        if (true) goto _L4; else goto _L3
_L3:
        abyte0;
        throw abyte0;
    }

    long nScriptGroup2Create(String s, String s1, long al[])
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        validate();
        l = rsnScriptGroup2Create(mContext, s, s1, al);
        this;
        JVM INSTR monitorexit ;
        return l;
        s;
        throw s;
    }

    void nScriptGroup2Execute(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroup2Execute(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nScriptGroupCreate(long al[], long al1[], long al2[], long al3[], long al4[])
    {
        this;
        JVM INSTR monitorenter ;
        long l;
        validate();
        l = rsnScriptGroupCreate(mContext, al, al1, al2, al3, al4);
        this;
        JVM INSTR monitorexit ;
        return l;
        al;
        throw al;
    }

    void nScriptGroupExecute(long l)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupExecute(mContext, l);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetInput(long l, long l1, long l2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetInput(mContext, l, l1, l2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptGroupSetOutput(long l, long l1, long l2)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptGroupSetOutput(mContext, l, l1, l2);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptIntrinsicBLAS_BNNM(long l, int i, int j, int k, long l1, 
            int i1, long l2, int j1, long l3, int k1, 
            int i2, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptIntrinsicBLAS_BNNM(mContext, mIncCon, l, i, j, k, l1, i1, l2, j1, l3, k1, i2, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptIntrinsicBLAS_Complex(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, int i2, int j2, float f, float f1, long l2, long l3, float f2, float f3, long l4, 
            int k2, int i3, int j3, int k3, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptIntrinsicBLAS_Complex(mContext, mIncCon, l, i, j, k, i1, j1, k1, l1, i2, j2, f, f1, l2, l3, f2, f3, l4, k2, i3, j3, k3, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptIntrinsicBLAS_Double(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, int i2, int j2, double d, long l2, long l3, double d1, long l4, 
            int k2, int i3, int j3, int k3, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptIntrinsicBLAS_Double(mContext, mIncCon, l, i, j, k, i1, j1, k1, l1, i2, j2, d, l2, l3, d1, l4, k2, i3, j3, k3, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptIntrinsicBLAS_Single(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, int i2, int j2, float f, long l2, 
            long l3, float f1, long l4, int k2, int i3, 
            int j3, int k3, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptIntrinsicBLAS_Single(mContext, mIncCon, l, i, j, k, i1, j1, k1, l1, i2, j2, f, l2, l3, f1, l4, k2, i3, j3, k3, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptIntrinsicBLAS_Z(long l, int i, int j, int k, int i1, int j1, 
            int k1, int l1, int i2, int j2, double d, double d1, long l2, long l3, double d2, 
            double d3, long l4, int k2, int i3, int j3, 
            int k3, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnScriptIntrinsicBLAS_Z(mContext, mIncCon, l, i, j, k, i1, j1, k1, l1, i2, j2, d, d1, l2, l3, d2, d3, l4, k2, i3, j3, k3, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nScriptIntrinsicCreate(int i, long l, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_204;
        }
        if (android.os.Build.VERSION.SDK_INT < 21)
        {
            Log.e("RenderScript_jni", "Incremental Intrinsics are not supported, please change targetSdkVersion to >= 21");
            throw new RSRuntimeException("Incremental Intrinsics are not supported before Lollipop (API 21)");
        }
        break MISSING_BLOCK_LABEL_46;
        Object obj;
        obj;
        this;
        JVM INSTR monitorexit ;
        throw obj;
        boolean flag1 = mIncLoaded;
        if (flag1)
        {
            break MISSING_BLOCK_LABEL_146;
        }
        System.loadLibrary("RSSupport");
        if (!nIncLoadSO(23))
        {
            throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
        }
        break MISSING_BLOCK_LABEL_141;
        obj;
        Log.e("RenderScript_jni", (new StringBuilder()).append("Error loading RS Compat library for Incremental Intrinsic Support: ").append(obj).toString());
        throw new RSRuntimeException((new StringBuilder()).append("Error loading RS Compat library for Incremental Intrinsic Support: ").append(obj).toString());
        mIncLoaded = true;
        if (mIncDev == 0L)
        {
            mIncDev = nIncDeviceCreate();
        }
        if (mIncCon == 0L)
        {
            mIncCon = nIncContextCreate(mIncDev, 0, 0, 0);
        }
        l = rsnScriptIntrinsicCreate(mIncCon, i, l, flag);
_L1:
        this;
        JVM INSTR monitorexit ;
        return l;
        l = rsnScriptIntrinsicCreate(mContext, i, l, flag);
          goto _L1
    }

    void nScriptInvoke(long l, int i, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptInvoke(l1, l, i, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    long nScriptInvokeIDCreate(long l, int i)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnScriptInvokeIDCreate(mContext, l, i);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptInvokeV(long l, int i, byte abyte0[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptInvokeV(l1, l, i, abyte0, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    long nScriptKernelIDCreate(long l, int i, int j, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        l = rsnScriptKernelIDCreate(l1, l, i, j, flag);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetTimeZone(long l, byte abyte0[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptSetTimeZone(l1, l, abyte0, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarD(long l, int i, double d, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptSetVarD(l1, l, i, d, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarF(long l, int i, float f, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptSetVarF(l1, l, i, f, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarI(long l, int i, int j, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptSetVarI(l1, l, i, j, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarJ(long l, int i, long l1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l2;
        validate();
        l2 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l2 = mIncCon;
        rsnScriptSetVarJ(l2, l, i, l1, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarObj(long l, int i, long l1, boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l2;
        validate();
        l2 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l2 = mIncCon;
        rsnScriptSetVarObj(l2, l, i, l1, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    void nScriptSetVarV(long l, int i, byte abyte0[], boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l1;
        validate();
        l1 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l1 = mIncCon;
        rsnScriptSetVarV(l1, l, i, abyte0, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    void nScriptSetVarVE(long l, int i, byte abyte0[], long l1, int ai[], 
            boolean flag)
    {
        this;
        JVM INSTR monitorenter ;
        long l2;
        validate();
        l2 = mContext;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_23;
        }
        l2 = mIncCon;
        rsnScriptSetVarVE(l2, l, i, abyte0, l1, ai, flag);
        this;
        JVM INSTR monitorexit ;
        return;
        abyte0;
        throw abyte0;
    }

    long nTypeCreate(long l, int i, int j, int k, boolean flag, boolean flag1, 
            int i1)
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        l = rsnTypeCreate(mContext, l, i, j, k, flag, flag1, i1);
        this;
        JVM INSTR monitorexit ;
        return l;
        Exception exception;
        exception;
        throw exception;
    }

    void nTypeGetNativeData(long l, long al[])
    {
        this;
        JVM INSTR monitorenter ;
        validate();
        rsnTypeGetNativeData(mContext, l, al);
        this;
        JVM INSTR monitorexit ;
        return;
        al;
        throw al;
    }

    native void rsnAllocationCopyFromBitmap(long l, long l1, Bitmap bitmap);

    native void rsnAllocationCopyToBitmap(long l, long l1, Bitmap bitmap);

    native long rsnAllocationCreateBitmapBackedAllocation(long l, long l1, int i, Bitmap bitmap, int j);

    native long rsnAllocationCreateBitmapRef(long l, long l1, Bitmap bitmap);

    native long rsnAllocationCreateFromAssetStream(long l, int i, int j, int k);

    native long rsnAllocationCreateFromBitmap(long l, long l1, int i, Bitmap bitmap, int j);

    native long rsnAllocationCreateTyped(long l, long l1, int i, int j, long l2);

    native long rsnAllocationCubeCreateFromBitmap(long l, long l1, int i, Bitmap bitmap, int j);

    native void rsnAllocationData1D(long l, long l1, int i, int j, int k, 
            Object obj, int i1, int j1, int k1, boolean flag);

    native void rsnAllocationData2D(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, long l2, int i2, int j2, 
            int k2, int i3);

    native void rsnAllocationData2D(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, Object obj, int i2, int j2, int k2, 
            boolean flag);

    native void rsnAllocationData2D(long l, long l1, int i, int j, int k, 
            int i1, Bitmap bitmap);

    native void rsnAllocationData3D(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, int i2, long l2, int j2, 
            int k2, int i3, int j3);

    native void rsnAllocationData3D(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, int i2, Object obj, int j2, int k2, 
            int l2, boolean flag);

    native void rsnAllocationElementData1D(long l, long l1, int i, int j, int k, 
            byte abyte0[], int i1);

    native void rsnAllocationGenerateMipmaps(long l, long l1);

    native long rsnAllocationGetType(long l, long l1);

    native void rsnAllocationIoReceive(long l, long l1);

    native void rsnAllocationIoSend(long l, long l1);

    native void rsnAllocationRead(long l, long l1, Object obj, int i, int j, 
            boolean flag);

    native void rsnAllocationRead1D(long l, long l1, int i, int j, int k, 
            Object obj, int i1, int j1, int k1, boolean flag);

    native void rsnAllocationRead2D(long l, long l1, int i, int j, int k, 
            int i1, int j1, int k1, Object obj, int i2, int j2, int k2, 
            boolean flag);

    native void rsnAllocationResize1D(long l, long l1, int i);

    native void rsnAllocationResize2D(long l, long l1, int i, int j);

    native void rsnAllocationSetSurface(long l, long l1, Surface surface);

    native void rsnAllocationSyncAll(long l, long l1, int i);

    native long rsnClosureCreate(long l, long l1, long l2, long al[], 
            long al1[], int ai[], long al2[], long al3[]);

    native void rsnClosureSetArg(long l, long l1, int i, long l2, 
            int j);

    native void rsnClosureSetGlobal(long l, long l1, long l2, long l3, int i);

    native long rsnContextCreate(long l, int i, int j, int k, String s);

    native void rsnContextDestroy(long l);

    native void rsnContextDump(long l, int i);

    native void rsnContextFinish(long l);

    native void rsnContextSendMessage(long l, int i, int ai[]);

    native void rsnContextSetPriority(long l, int i);

    native long rsnElementCreate(long l, long l1, int i, boolean flag, int j);

    native long rsnElementCreate2(long l, long al[], String as[], int ai[]);

    native void rsnElementGetNativeData(long l, long l1, int ai[]);

    native void rsnElementGetSubElements(long l, long l1, long al[], String as[], int ai[]);

    native long rsnIncAllocationCreateTyped(long l, long l1, long l2, long l3);

    native long rsnIncContextCreate(long l, int i, int j, int k);

    native void rsnIncContextDestroy(long l);

    native void rsnIncContextFinish(long l);

    native long rsnIncElementCreate(long l, long l1, int i, boolean flag, int j);

    native void rsnIncObjDestroy(long l, long l1);

    native long rsnIncTypeCreate(long l, long l1, int i, int j, int k, 
            boolean flag, boolean flag1, int i1);

    native long rsnInvokeClosureCreate(long l, long l1, byte abyte0[], long al[], long al1[], 
            int ai[]);

    native void rsnObjDestroy(long l, long l1);

    native long rsnSamplerCreate(long l, int i, int j, int k, int i1, int j1, 
            float f);

    native void rsnScriptBindAllocation(long l, long l1, long l2, int i, 
            boolean flag);

    native long rsnScriptCCreate(long l, String s, String s1, byte abyte0[], int i);

    native long rsnScriptFieldIDCreate(long l, long l1, int i, boolean flag);

    native void rsnScriptForEach(long l, long l1, long l2, int i, 
            long l3, long l4, boolean flag);

    native void rsnScriptForEach(long l, long l1, long l2, int i, 
            long l3, long l4, byte abyte0[], boolean flag);

    native void rsnScriptForEachClipped(long l, long l1, long l2, int i, 
            long l3, long l4, int j, int k, int i1, 
            int j1, int k1, int i2, boolean flag);

    native void rsnScriptForEachClipped(long l, long l1, long l2, int i, 
            long l3, long l4, byte abyte0[], int j, int k, 
            int i1, int j1, int k1, int i2, boolean flag);

    native long rsnScriptGroup2Create(long l, String s, String s1, long al[]);

    native void rsnScriptGroup2Execute(long l, long l1);

    native long rsnScriptGroupCreate(long l, long al[], long al1[], long al2[], long al3[], long al4[]);

    native void rsnScriptGroupExecute(long l, long l1);

    native void rsnScriptGroupSetInput(long l, long l1, long l2, long l3);

    native void rsnScriptGroupSetOutput(long l, long l1, long l2, long l3);

    native void rsnScriptIntrinsicBLAS_BNNM(long l, long l1, long l2, int i, 
            int j, int k, long l3, int i1, long l4, 
            int j1, long l5, int k1, int i2, boolean flag);

    native void rsnScriptIntrinsicBLAS_Complex(long l, long l1, long l2, int i, 
            int j, int k, int i1, int j1, int k1, int i2, int j2, 
            int k2, float f, float f1, long l3, long l4, 
            float f2, float f3, long l5, int i3, int j3, int k3, 
            int i4, boolean flag);

    native void rsnScriptIntrinsicBLAS_Double(long l, long l1, long l2, int i, 
            int j, int k, int i1, int j1, int k1, int i2, int j2, 
            int k2, double d, long l3, long l4, 
            double d1, long l5, int i3, int j3, int k3, 
            int i4, boolean flag);

    native void rsnScriptIntrinsicBLAS_Single(long l, long l1, long l2, int i, 
            int j, int k, int i1, int j1, int k1, int i2, int j2, 
            int k2, float f, long l3, long l4, float f1, 
            long l5, int i3, int j3, int k3, int i4, boolean flag);

    native void rsnScriptIntrinsicBLAS_Z(long l, long l1, long l2, int i, 
            int j, int k, int i1, int j1, int k1, int i2, int j2, 
            int k2, double d, double d1, long l3, 
            long l4, double d2, double d3, long l5, int i3, int j3, int k3, int i4, boolean flag);

    native long rsnScriptIntrinsicCreate(long l, int i, long l1, boolean flag);

    native void rsnScriptInvoke(long l, long l1, int i, boolean flag);

    native long rsnScriptInvokeIDCreate(long l, long l1, int i);

    native void rsnScriptInvokeV(long l, long l1, int i, byte abyte0[], boolean flag);

    native long rsnScriptKernelIDCreate(long l, long l1, int i, int j, boolean flag);

    native void rsnScriptSetTimeZone(long l, long l1, byte abyte0[], boolean flag);

    native void rsnScriptSetVarD(long l, long l1, int i, double d, 
            boolean flag);

    native void rsnScriptSetVarF(long l, long l1, int i, float f, boolean flag);

    native void rsnScriptSetVarI(long l, long l1, int i, int j, boolean flag);

    native void rsnScriptSetVarJ(long l, long l1, int i, long l2, 
            boolean flag);

    native void rsnScriptSetVarObj(long l, long l1, int i, long l2, 
            boolean flag);

    native void rsnScriptSetVarV(long l, long l1, int i, byte abyte0[], boolean flag);

    native void rsnScriptSetVarVE(long l, long l1, int i, byte abyte0[], long l2, int ai[], boolean flag);

    native long rsnTypeCreate(long l, long l1, int i, int j, int k, 
            boolean flag, boolean flag1, int i1);

    native void rsnTypeGetNativeData(long l, long l1, long al[]);

    long safeID(BaseObj baseobj)
    {
        if (baseobj != null)
        {
            return baseobj.getID(this);
        } else
        {
            return 0L;
        }
    }

    public void sendMessage(int i, int ai[])
    {
        nContextSendMessage(i, ai);
    }

    public void setErrorHandler(RSErrorHandler rserrorhandler)
    {
        mErrorCallback = rserrorhandler;
    }

    public void setMessageHandler(RSMessageHandler rsmessagehandler)
    {
        mMessageCallback = rsmessagehandler;
    }

    public void setPriority(Priority priority)
    {
        validate();
        nContextSetPriority(priority.mID);
    }

    boolean usingIO()
    {
        return useIOlib;
    }

    void validate()
    {
        if (mContext == 0L)
        {
            throw new RSInvalidStateException("Calling RS with no Context active.");
        } else
        {
            return;
        }
    }

}
