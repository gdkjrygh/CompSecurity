// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.loyalty.fragments;

import com.google.android.libraries.commerce.ocr.loyalty.debug.DebugInfo;

// Referenced classes of package com.google.android.libraries.commerce.ocr.loyalty.fragments:
//            OcrStateManager

public class CameraFailureHandler
    implements com.google.android.libraries.commerce.ocr.ui.CameraPreviewView.OnErrorCallback
{

    private final OcrStateManager stateManager;

    public CameraFailureHandler(OcrStateManager ocrstatemanager)
    {
        stateManager = ocrstatemanager;
    }

    public final void onError()
    {
        stateManager.exit(10003, null, new DebugInfo());
    }
}
