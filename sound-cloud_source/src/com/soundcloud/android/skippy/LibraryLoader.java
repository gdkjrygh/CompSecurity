// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.skippy;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.text.TextUtils;
import java.io.File;
import java.util.Date;
import java.util.Vector;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

// Referenced classes of package com.soundcloud.android.skippy:
//            LibraryLoaderHelper, SkippyVersionValidator

public class LibraryLoader
{

    private static final int LOAD_LIBS_TIMEOUT = 10;
    private static final Object LOCK = new Object();
    private static final String TAG = "SkippyLibraryLoader";
    private static Throwable loadLibsError;
    private static CountDownLatch loadLibsLatch;
    private static AtomicInteger loadProgress = new AtomicInteger();
    private static Vector loadProgressTimestamp = null;
    private final LibraryLoaderHelper libraryLoaderHelper;
    private SkippyVersionValidator libraryVersionValidator;

    public LibraryLoader()
    {
        this(new LibraryLoaderHelper());
        createDefaultVersionValidator();
    }

    public LibraryLoader(LibraryLoaderHelper libraryloaderhelper)
    {
        libraryLoaderHelper = libraryloaderhelper;
        createDefaultVersionValidator();
    }

    public LibraryLoader(LibraryLoaderHelper libraryloaderhelper, SkippyVersionValidator skippyversionvalidator)
    {
        libraryLoaderHelper = libraryloaderhelper;
        libraryVersionValidator = skippyversionvalidator;
    }

    public LibraryLoader(SkippyVersionValidator skippyversionvalidator)
    {
        libraryLoaderHelper = new LibraryLoaderHelper();
        libraryVersionValidator = skippyversionvalidator;
    }

    private void createDefaultVersionValidator()
    {
        if (libraryVersionValidator == null)
        {
            libraryVersionValidator = new _cls2();
        }
    }

    private Thread createLibraryLoadThread(final Context context)
    {
        return new Thread(new _cls1());
    }

    private void incrementProgress()
    {
        if (loadProgressTimestamp == null)
        {
            loadProgressTimestamp = new Vector();
        }
        loadProgress.incrementAndGet();
        loadProgressTimestamp.add(Long.valueOf((new Date()).getTime()));
    }

    private void loadLibs(Context context)
    {
        synchronized (LOCK)
        {
            if (loadLibsLatch == null)
            {
                loadLibsLatch = new CountDownLatch(1);
                createLibraryLoadThread(context).start();
            }
        }
        return;
        context;
        obj;
        JVM INSTR monitorexit ;
        throw context;
    }

    private void setLoadError(Throwable throwable)
    {
        synchronized (LOCK)
        {
            loadLibsError = throwable;
        }
        return;
        throwable;
        obj;
        JVM INSTR monitorexit ;
        throw throwable;
    }

    private void waitForLibs()
    {
        try
        {
            if (!loadLibsLatch.await(10L, TimeUnit.SECONDS))
            {
                setLoadError(new IllegalStateException((new StringBuilder("Timeout waiting for native libs : progress = ")).append(loadProgress.get()).toString()));
            }
            return;
        }
        catch (InterruptedException interruptedexception)
        {
            (new StringBuilder("Interrupted exception happened: ")).append(interruptedexception.getMessage());
            setLoadError(interruptedexception);
            return;
        }
    }

    protected Throwable getLoadError()
    {
        Throwable throwable;
        synchronized (LOCK)
        {
            throwable = loadLibsError;
        }
        return throwable;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected long[] getProgressStepsMilliseconds()
    {
        long al[] = new long[loadProgressTimestamp.size() - 1];
        for (int i = 0; i < al.length; i++)
        {
            al[i] = ((Long)loadProgressTimestamp.get(i + 1)).longValue() - ((Long)loadProgressTimestamp.get(i)).longValue();
        }

        return al;
    }

    protected long getProgressTotalMilliseconds()
    {
        long l = 0L;
        for (int i = 0; i < loadProgressTimestamp.size() - 1; i++)
        {
            l += ((Long)loadProgressTimestamp.get(i + 1)).longValue() - ((Long)loadProgressTimestamp.get(i)).longValue();
        }

        return l;
    }

    protected String listNativeLibDir(Context context)
    {
        Object obj = context.getApplicationInfo();
        if (obj != null)
        {
            context = (new File(((ApplicationInfo) (obj)).nativeLibraryDir)).list();
            obj = (new StringBuilder()).append(((ApplicationInfo) (obj)).nativeLibraryDir).append(" : ");
            if (context != null)
            {
                context = TextUtils.join(", ", context);
            } else
            {
                context = "nativeLibraryDir is not a directory";
            }
            return ((StringBuilder) (obj)).append(context).toString();
        } else
        {
            return "no application info";
        }
    }

    protected void preload(Context context)
    {
        loadLibs(context);
    }

    protected void reset()
    {
        synchronized (LOCK)
        {
            loadLibsLatch = null;
            loadLibsError = null;
        }
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }

    protected void start(Context context)
    {
        loadLibs(context);
        waitForLibs();
    }



/*
    static Vector access$002(Vector vector)
    {
        loadProgressTimestamp = vector;
        return vector;
    }

*/






    private class _cls2
        implements SkippyVersionValidator
    {

        final LibraryLoader this$0;

        public boolean isValidLibraryVersionLoaded(SkippyLibrary skippylibrary)
        {
            return true;
        }

        _cls2()
        {
            this$0 = LibraryLoader.this;
            super();
        }
    }


    private class _cls1
        implements Runnable
    {

        final LibraryLoader this$0;
        final Context val$context;

        public void run()
        {
            LibraryLoader.loadProgressTimestamp = null;
            incrementProgress();
            libraryLoaderHelper.load(context, SkippyLibrary.GSTREAMER);
            incrementProgress();
            libraryLoaderHelper.load(context, SkippyLibrary.SKIPPY);
            if (!libraryVersionValidator.isValidLibraryVersionLoaded(SkippyLibrary.SKIPPY))
            {
                libraryLoaderHelper.extractAndLoadLibFromApk(context, SkippyLibrary.SKIPPY.getLibraryName());
                if (!libraryVersionValidator.isValidLibraryVersionLoaded(SkippyLibrary.SKIPPY))
                {
                    throw new IllegalStateException("Native library version does not match Java wrapper version.");
                }
            }
            break MISSING_BLOCK_LABEL_149;
            Object obj;
            obj;
            (new StringBuilder("Caught exception: ")).append(obj);
            setLoadError(((Throwable) (obj)));
            LibraryLoader.loadLibsLatch.countDown();
            return;
            incrementProgress();
            GStreamer.a(context);
            incrementProgress();
            LibraryLoader.loadLibsLatch.countDown();
            return;
            obj;
            LibraryLoader.loadLibsLatch.countDown();
            throw obj;
        }

        _cls1()
        {
            this$0 = LibraryLoader.this;
            context = context1;
            super();
        }
    }

}
