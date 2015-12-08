// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.capture;

import android.os.Vibrator;
import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.loyalty.pub.RecognizedWobInstanceParcelable;
import com.google.android.libraries.commerce.ocr.util.TimeoutManager;
import com.google.android.libraries.commerce.ocr.wobs.fragments.OcrResultNotifier;
import com.google.android.libraries.commerce.ocr.wobs.fragments.TransitionHandler;
import com.google.android.libraries.commerce.ocr.wobs.pub.DebugResponseInfoParcelable;
import com.google.common.collect.Lists;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.TimerTask;

public final class WobsOcrResponseHandler
    implements com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler, OcrResultNotifier
{

    private final ArrayList aggregatedDebugResponseInfo = Lists.newArrayList();
    private final ArrayList aggregatedResponse = Lists.newArrayList();
    private com.google.android.libraries.commerce.ocr.wobs.fragments.OcrResultNotifier.OcrResultCallback ocrResultCallback;
    private final TimeoutManager timeoutManager;
    private final TransitionHandler transitionHandler;
    private final Vibrator vibrator;

    public WobsOcrResponseHandler(Vibrator vibrator1, TransitionHandler transitionhandler, TimeoutManager timeoutmanager)
    {
        vibrator = vibrator1;
        transitionHandler = transitionhandler;
        timeoutManager = timeoutmanager;
    }

    private void notifyOcrResultIfCallbackIsSet()
    {
        this;
        JVM INSTR monitorenter ;
        if (ocrResultCallback != null)
        {
            ocrResultCallback.onOcrResult();
        }
        this;
        JVM INSTR monitorexit ;
        return;
        Exception exception;
        exception;
        throw exception;
    }

    private void onRecognized(ArrayList arraylist)
    {
        onRecognized(arraylist, ((DebugResponseInfoParcelable) (null)));
    }

    private void onRecognized(ArrayList arraylist, DebugResponseInfoParcelable debugresponseinfoparcelable)
    {
        for (Iterator iterator = arraylist.iterator(); iterator.hasNext(); Log.d("WobsOcrResponseHandler", ((RecognizedWobInstanceParcelable)iterator.next()).toString())) { }
        aggregatedResponse.addAll(arraylist);
        aggregatedDebugResponseInfo.add(debugresponseinfoparcelable);
        notifyOcrResultIfCallbackIsSet();
    }

    public final ArrayList getAggregatedDebugResponseInfo()
    {
        return aggregatedDebugResponseInfo;
    }

    public final ArrayList getAggregatedResponse()
    {
        return aggregatedResponse;
    }

    public final void onError(OcrException ocrexception)
    {
        String s = String.valueOf(ocrexception);
        Log.i("WobsOcrResponseHandler", (new StringBuilder(String.valueOf(s).length() + 9)).append("onError :").append(s).toString());
        if (ocrexception.getType() == 5)
        {
            transitionHandler.exit(10009);
        }
    }

    public final boolean onOcrAttempt()
    {
        vibrator.vibrate(50L);
        return true;
    }

    public final volatile void onRecognized(Object obj)
    {
        onRecognized((ArrayList)obj);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized((ArrayList)obj, (DebugResponseInfoParcelable)obj1);
    }

    public final void onUnrecognized()
    {
    }

    public final volatile void onUnrecognized(Object obj)
    {
    }

    public final void setOcrResultCallback(com.google.android.libraries.commerce.ocr.wobs.fragments.OcrResultNotifier.OcrResultCallback ocrresultcallback)
    {
        this;
        JVM INSTR monitorenter ;
        ocrResultCallback = ocrresultcallback;
        if (ocrresultcallback == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        if (aggregatedResponse.isEmpty()) goto _L2; else goto _L1
_L1:
        notifyOcrResultIfCallbackIsSet();
_L3:
        this;
        JVM INSTR monitorexit ;
        return;
_L2:
        timeoutManager.startTimeout(new TimerTask() {

            final WobsOcrResponseHandler this$0;

            public final void run()
            {
                notifyOcrResultIfCallbackIsSet();
            }

            
            {
                this$0 = WobsOcrResponseHandler.this;
                super();
            }
        });
          goto _L3
        ocrresultcallback;
        throw ocrresultcallback;
        timeoutManager.stopTimeout();
          goto _L3
    }

}
