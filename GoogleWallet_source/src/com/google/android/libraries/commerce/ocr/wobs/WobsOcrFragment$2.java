// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs;

import com.google.android.libraries.commerce.ocr.capture.CameraManager;
import com.google.android.libraries.commerce.ocr.wobs.fragments.ImageCaptureFragment;
import java.util.TimerTask;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs:
//            WobsOcrFragment

final class this._cls0 extends TimerTask
{

    final WobsOcrFragment this$0;

    public final void run()
    {
        WobsOcrFragment.access$200(WobsOcrFragment.this).flipSide(true);
        WobsOcrFragment.access$300(WobsOcrFragment.this).restartPreview();
    }

    tureFragment()
    {
        this$0 = WobsOcrFragment.this;
        super();
    }
}
