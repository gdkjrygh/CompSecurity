// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.zxing.client.android.camera;

import android.content.Context;
import android.content.SharedPreferences;
import android.hardware.Camera;
import android.os.AsyncTask;
import android.preference.PreferenceManager;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collection;

final class AutoFocusManager
    implements android.hardware.Camera.AutoFocusCallback
{
    private final class AutoFocusTask extends AsyncTask
    {

        final AutoFocusManager this$0;

        protected transient Object doInBackground(Object aobj[])
        {
            try
            {
                Thread.sleep(2000L);
            }
            // Misplaced declaration of an exception variable
            catch (Object aobj[]) { }
            synchronized (AutoFocusManager.this)
            {
                if (active)
                {
                    start();
                }
            }
            return null;
            exception;
            aobj;
            JVM INSTR monitorexit ;
            throw exception;
        }

        private AutoFocusTask()
        {
            this$0 = AutoFocusManager.this;
            super();
        }

    }


    private static final long AUTO_FOCUS_INTERVAL_MS = 2000L;
    private static final Collection FOCUS_MODES_CALLING_AF;
    private static final String TAG = com/google/zxing/client/android/camera/AutoFocusManager.getSimpleName();
    private boolean active;
    private final Camera camera;
    private AsyncTask outstandingTask;
    private final boolean useAutoFocus;

    AutoFocusManager(Context context, Camera camera1)
    {
        boolean flag = true;
        super();
        camera = camera1;
        context = PreferenceManager.getDefaultSharedPreferences(context);
        camera1 = camera1.getParameters().getFocusMode();
        if (!context.getBoolean("preferences_auto_focus", true) || !FOCUS_MODES_CALLING_AF.contains(camera1))
        {
            flag = false;
        }
        useAutoFocus = flag;
        Log.i(TAG, (new StringBuilder()).append("Current focus mode '").append(camera1).append("'; use auto focus? ").append(useAutoFocus).toString());
        start();
    }

    public void onAutoFocus(boolean flag, Camera camera1)
    {
        this;
        JVM INSTR monitorenter ;
        if (active)
        {
            outstandingTask = new AutoFocusTask();
            outstandingTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, new Object[0]);
        }
        this;
        JVM INSTR monitorexit ;
        return;
        camera1;
        throw camera1;
    }

    void start()
    {
        this;
        JVM INSTR monitorenter ;
        if (!useAutoFocus)
        {
            break MISSING_BLOCK_LABEL_22;
        }
        active = true;
        camera.autoFocus(this);
_L2:
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w(TAG, "Unexpected exception while focusing", ((Throwable) (obj)));
        if (true) goto _L2; else goto _L1
_L1:
        obj;
        throw obj;
    }

    void stop()
    {
        this;
        JVM INSTR monitorenter ;
        boolean flag = useAutoFocus;
        if (!flag)
        {
            break MISSING_BLOCK_LABEL_18;
        }
        camera.cancelAutoFocus();
_L1:
        if (outstandingTask != null)
        {
            outstandingTask.cancel(true);
            outstandingTask = null;
        }
        active = false;
        this;
        JVM INSTR monitorexit ;
        return;
        Object obj;
        obj;
        Log.w(TAG, "Unexpected exception while cancelling focusing", ((Throwable) (obj)));
          goto _L1
        obj;
        throw obj;
    }

    static 
    {
        FOCUS_MODES_CALLING_AF = new ArrayList(2);
        FOCUS_MODES_CALLING_AF.add("auto");
        FOCUS_MODES_CALLING_AF.add("macro");
    }

}
