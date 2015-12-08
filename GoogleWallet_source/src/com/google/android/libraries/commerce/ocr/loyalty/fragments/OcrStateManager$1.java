// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;
import java.util.ArrayList;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrStateManager, OcrCaptureListener

final class val.debugInfo
    implements Runnable
{

    final OcrStateManager this$0;
    final ArrayList val$data;
    final DebugInfo val$debugInfo;
    final int val$resultCode;

    public final void run()
    {
        if (val$data == null || val$data.isEmpty())
        {
            OcrStateManager.access$000(OcrStateManager.this).onUnrecognized(val$resultCode, val$debugInfo);
            return;
        } else
        {
            OcrStateManager.access$000(OcrStateManager.this).onRecognized(val$data, val$resultCode, val$debugInfo);
            return;
        }
    }

    ()
    {
        this$0 = final_ocrstatemanager;
        val$data = arraylist;
        val$resultCode = i;
        val$debugInfo = DebugInfo.this;
        super();
    }
}
