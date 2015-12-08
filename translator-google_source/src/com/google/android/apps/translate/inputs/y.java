// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.apps.translate.wordlens.GTRNativeUI;
import com.google.android.libraries.wordlens.WordLensSystem;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            Camera2InputPopup

final class y
    implements Runnable
{

    final com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word a[];
    final Camera2InputPopup b;

    y(Camera2InputPopup camera2inputpopup, com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[])
    {
        b = camera2inputpopup;
        a = aword;
        super();
    }

    public final void run()
    {
        GTRNativeUI gtrnativeui = GTRNativeUI.a();
        com.google.bionics.goggles.api2.GogglesStructuredResponseProtos.RecognizedText.Word aword[] = a;
        synchronized (WordLensSystem.c())
        {
            gtrnativeui.setCloudhanceResultsNative(aword);
        }
        GTRNativeUI.a().a(false);
        return;
        exception;
        obj;
        JVM INSTR monitorexit ;
        throw exception;
    }
}
