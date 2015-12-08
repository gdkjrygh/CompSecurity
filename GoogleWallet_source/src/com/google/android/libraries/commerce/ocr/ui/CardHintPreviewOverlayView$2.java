// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.view.View;
import com.google.android.libraries.commerce.ocr.cv.Boundaries;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CardHintPreviewOverlayView

final class val.boundaries
    implements Runnable
{

    final CardHintPreviewOverlayView this$0;
    final Boundaries val$boundaries;

    public final void run()
    {
        CardHintPreviewOverlayView.access$602(CardHintPreviewOverlayView.this, val$boundaries);
        CardHintPreviewOverlayView.access$1200(CardHintPreviewOverlayView.this).postInvalidate();
    }

    ()
    {
        this$0 = final_cardhintpreviewoverlayview;
        val$boundaries = Boundaries.this;
        super();
    }
}
