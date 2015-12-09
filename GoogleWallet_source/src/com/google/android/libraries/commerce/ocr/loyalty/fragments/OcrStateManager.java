// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import android.os.Handler;
import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.common.base.Stopwatch;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrCaptureListener

public class OcrStateManager
{

    private final CameraManager cameraManager;
    private final InstrumentationSupervisor instrumentationSupervisor;
    private final AtomicBoolean isCompleted = new AtomicBoolean(false);
    private final OcrCaptureListener listener;
    private final Handler uiHandler;
    private final Stopwatch userWaitTimeStopwatch = Stopwatch.createUnstarted();

    public OcrStateManager(OcrCaptureListener ocrcapturelistener, CameraManager cameramanager, InstrumentationSupervisor instrumentationsupervisor, Handler handler)
    {
        listener = ocrcapturelistener;
        cameraManager = cameramanager;
        instrumentationSupervisor = instrumentationsupervisor;
        uiHandler = handler;
    }

    public final void exit(final int resultCode, final ArrayList data, final DebugInfo debugInfo)
    {
        this;
        JVM INSTR monitorenter ;
        if (userWaitTimeStopwatch.isRunning())
        {
            userWaitTimeStopwatch.stop();
        }
        debugInfo.setTimeSinceStartInMs(userWaitTimeStopwatch.elapsed(TimeUnit.MILLISECONDS));
        cameraManager.closeDriver();
        if (listener != null && !isCompleted.getAndSet(true))
        {
            instrumentationSupervisor.finish();
            instrumentationSupervisor.mergeTo(debugInfo);
            uiHandler.post(new Runnable() {

                final OcrStateManager this$0;
                final ArrayList val$data;
                final DebugInfo val$debugInfo;
                final int val$resultCode;

                public final void run()
                {
                    if (data == null || data.isEmpty())
                    {
                        listener.onUnrecognized(resultCode, debugInfo);
                        return;
                    } else
                    {
                        listener.onRecognized(data, resultCode, debugInfo);
                        return;
                    }
                }

            
            {
                this$0 = OcrStateManager.this;
                data = arraylist;
                resultCode = i;
                debugInfo = debuginfo;
                super();
            }
            });
        }
        this;
        JVM INSTR monitorexit ;
        return;
        data;
        throw data;
    }

    public final void reset()
    {
        this;
        JVM INSTR monitorenter ;
        isCompleted.set(false);
        instrumentationSupervisor.start();
        userWaitTimeStopwatch.reset().start();
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

}
