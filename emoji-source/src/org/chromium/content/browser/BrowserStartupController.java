// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package org.chromium.content.browser;

import android.content.Context;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.chromium.base.ResourceExtractor;
import org.chromium.base.ThreadUtils;
import org.chromium.base.library_loader.LibraryLoader;
import org.chromium.base.library_loader.ProcessInitException;
import org.chromium.content.app.ContentMain;

// Referenced classes of package org.chromium.content.browser:
//            PepperPluginManager, DeviceUtils

public class BrowserStartupController
{
    public static interface StartupCallback
    {

        public abstract void onFailure();

        public abstract void onSuccess(boolean flag);
    }


    static final boolean $assertionsDisabled;
    private static final boolean ALREADY_STARTED = true;
    private static final boolean NOT_ALREADY_STARTED = false;
    static final int STARTUP_FAILURE = 1;
    static final int STARTUP_SUCCESS = -1;
    private static final String TAG = "BrowserStartupController";
    private static boolean sBrowserMayStartAsynchronously = false;
    private static BrowserStartupController sInstance;
    private final List mAsyncStartupCallbacks = new ArrayList();
    private final Context mContext;
    private boolean mHasStartedInitializingBrowserProcess;
    private boolean mStartupDone;
    private boolean mStartupSuccess;

    BrowserStartupController(Context context)
    {
        mContext = context;
    }

    static boolean browserMayStartAsynchonously()
    {
        return sBrowserMayStartAsynchronously;
    }

    static void browserStartupComplete(int i)
    {
        if (sInstance != null)
        {
            sInstance.executeEnqueuedCallbacks(i, false);
        }
    }

    private void enqueueCallbackExecution(final int startupFailure, final boolean alreadyStarted)
    {
        (new Handler()).post(new Runnable() {

            final BrowserStartupController this$0;
            final boolean val$alreadyStarted;
            final int val$startupFailure;

            public void run()
            {
                executeEnqueuedCallbacks(startupFailure, alreadyStarted);
            }

            
            {
                this$0 = BrowserStartupController.this;
                startupFailure = i;
                alreadyStarted = flag;
                super();
            }
        });
    }

    private void executeEnqueuedCallbacks(int i, boolean flag)
    {
        boolean flag1 = true;
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError("Callback from browser startup from wrong thread.");
        }
        mStartupDone = true;
        if (i > 0)
        {
            flag1 = false;
        }
        mStartupSuccess = flag1;
        for (Iterator iterator = mAsyncStartupCallbacks.iterator(); iterator.hasNext();)
        {
            StartupCallback startupcallback = (StartupCallback)iterator.next();
            if (mStartupSuccess)
            {
                startupcallback.onSuccess(flag);
            } else
            {
                startupcallback.onFailure();
            }
        }

        mAsyncStartupCallbacks.clear();
    }

    public static BrowserStartupController get(Context context)
    {
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError("Tried to start the browser on the wrong thread.");
        }
        ThreadUtils.assertOnUiThread();
        if (sInstance == null)
        {
            sInstance = new BrowserStartupController(context.getApplicationContext());
        }
        return sInstance;
    }

    private String getPlugins()
    {
        return PepperPluginManager.getPlugins(mContext);
    }

    private static native boolean nativeIsOfficialBuild();

    private static native boolean nativeIsPluginEnabled();

    private static native void nativeSetCommandLineFlags(boolean flag, String s);

    static BrowserStartupController overrideInstanceForTest(BrowserStartupController browserstartupcontroller)
    {
        if (sInstance == null)
        {
            sInstance = browserstartupcontroller;
        }
        return sInstance;
    }

    private void postStartupCompleted(final StartupCallback callback)
    {
        (new Handler()).post(new Runnable() {

            final BrowserStartupController this$0;
            final StartupCallback val$callback;

            public void run()
            {
                if (mStartupSuccess)
                {
                    callback.onSuccess(true);
                    return;
                } else
                {
                    callback.onFailure();
                    return;
                }
            }

            
            {
                this$0 = BrowserStartupController.this;
                callback = startupcallback;
                super();
            }
        });
    }

    private static void setAsynchronousStartup(boolean flag)
    {
        sBrowserMayStartAsynchronously = flag;
    }

    public void addStartupCompletedObserver(StartupCallback startupcallback)
    {
        ThreadUtils.assertOnUiThread();
        if (mStartupDone)
        {
            postStartupCompleted(startupcallback);
            return;
        } else
        {
            mAsyncStartupCallbacks.add(startupcallback);
            return;
        }
    }

    int contentStart()
    {
        return ContentMain.start();
    }

    public void initChromiumBrowserProcessForTests()
    {
        ResourceExtractor resourceextractor = ResourceExtractor.get(mContext);
        resourceextractor.startExtractingResources();
        resourceextractor.waitForCompletion();
        nativeSetCommandLineFlags(false, null);
    }

    void prepareToStartBrowserProcess(boolean flag)
        throws ProcessInitException
    {
        Log.i("BrowserStartupController", (new StringBuilder()).append("Initializing chromium process, singleProcess=").append(flag).toString());
        Object obj = ResourceExtractor.get(mContext);
        ((ResourceExtractor) (obj)).startExtractingResources();
        LibraryLoader.ensureInitialized(mContext, true);
        DeviceUtils.addDeviceSpecificUserAgentSwitch(mContext);
        Context context = mContext.getApplicationContext();
        ((ResourceExtractor) (obj)).waitForCompletion();
        if (nativeIsPluginEnabled())
        {
            obj = getPlugins();
        } else
        {
            obj = null;
        }
        nativeSetCommandLineFlags(flag, ((String) (obj)));
        ContentMain.initApplicationContext(context);
    }

    public void startBrowserProcessesAsync(StartupCallback startupcallback)
        throws ProcessInitException
    {
        if (!$assertionsDisabled && !ThreadUtils.runningOnUiThread())
        {
            throw new AssertionError("Tried to start the browser on the wrong thread.");
        }
        if (mStartupDone)
        {
            postStartupCompleted(startupcallback);
        } else
        {
            mAsyncStartupCallbacks.add(startupcallback);
            if (!mHasStartedInitializingBrowserProcess)
            {
                mHasStartedInitializingBrowserProcess = true;
                prepareToStartBrowserProcess(false);
                setAsynchronousStartup(true);
                if (contentStart() > 0)
                {
                    enqueueCallbackExecution(1, false);
                    return;
                }
            }
        }
    }

    public void startBrowserProcessesSync(boolean flag)
        throws ProcessInitException
    {
        if (!mStartupDone)
        {
            if (!mHasStartedInitializingBrowserProcess)
            {
                prepareToStartBrowserProcess(flag);
            }
            setAsynchronousStartup(false);
            if (contentStart() > 0)
            {
                enqueueCallbackExecution(1, false);
            }
        }
        if (!$assertionsDisabled && !mStartupDone)
        {
            throw new AssertionError();
        }
        if (!mStartupSuccess)
        {
            throw new ProcessInitException(4);
        } else
        {
            return;
        }
    }

    static 
    {
        boolean flag;
        if (!org/chromium/content/browser/BrowserStartupController.desiredAssertionStatus())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        $assertionsDisabled = flag;
    }


}
