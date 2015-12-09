// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.capture;

import android.util.Log;
import com.google.android.libraries.commerce.ocr.OcrException;
import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import com.google.android.libraries.commerce.ocr.loyalty.debug.InstrumentationSupervisor;
import com.google.android.libraries.commerce.ocr.loyalty.fragments.OcrStateManager;
import com.google.android.libraries.commerce.ocr.ui.UserSkipHandler;
import dagger.Lazy;
import java.util.ArrayList;

public class SimpleOcrResponseHandler
    implements com.google.android.libraries.commerce.ocr.capture.OcrRecognizer.OcrResponseHandler, UserSkipHandler
{

    private final InstrumentationSupervisor instrumentationSupervisor;
    private final Lazy ocrPresenter;
    private final OcrStateManager stateManager;

    public SimpleOcrResponseHandler(OcrStateManager ocrstatemanager, Lazy lazy, InstrumentationSupervisor instrumentationsupervisor)
    {
        stateManager = ocrstatemanager;
        ocrPresenter = lazy;
        instrumentationSupervisor = instrumentationsupervisor;
    }

    private void onRecognized(ArrayList arraylist)
    {
        stateManager.exit(-1, arraylist, new DebugInfo());
    }

    private void onRecognized(ArrayList arraylist, DebugInfo debuginfo)
    {
        stateManager.exit(-1, arraylist, debuginfo);
    }

    public final void onError(OcrException ocrexception)
    {
label0:
        {
            if (ocrexception != null)
            {
                switch (ocrexception.getType())
                {
                default:
                    ((com.google.android.libraries.commerce.ocr.ui.OcrView.Presenter)ocrPresenter.get()).showErrorMessage(com.google.android.libraries.commerce.ocr.R.string.ocr_error_title);
                    Log.w("SimpleOcrResponseHandler", String.format("onError: %s", new Object[] {
                        ocrexception.getMessage()
                    }));
                    break;

                case 3: // '\003'
                    break label0;

                case 4: // '\004'
                    break;
                }
            }
            return;
        }
        Log.w("SimpleOcrResponseHandler", String.format("onError: %s", new Object[] {
            ocrexception.getMessage()
        }));
    }

    public final boolean onOcrAttempt()
    {
        instrumentationSupervisor.onValidFrame();
        return true;
    }

    public final volatile void onRecognized(Object obj)
    {
        onRecognized((ArrayList)obj);
    }

    public final volatile void onRecognized(Object obj, Object obj1)
    {
        onRecognized((ArrayList)obj, (DebugInfo)obj1);
    }

    public final void onUnrecognized()
    {
    }

    public final volatile void onUnrecognized(Object obj)
    {
    }

    public final void onUserSkipped()
    {
        stateManager.exit(10007, null, new DebugInfo());
    }
}
