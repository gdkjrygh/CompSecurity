// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.graphics.Rect;
import android.view.View;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CardHintPreviewOverlayView

final class val.visiblePreviewArea
    implements Runnable
{

    final CardHintPreviewOverlayView this$0;
    final Rect val$visiblePreviewArea;

    public final void run()
    {
        CardHintPreviewOverlayView.access$000(CardHintPreviewOverlayView.this, val$visiblePreviewArea);
        CardHintPreviewOverlayView.access$100(CardHintPreviewOverlayView.this).setVisibility(0);
    }

    ()
    {
        this$0 = final_cardhintpreviewoverlayview;
        val$visiblePreviewArea = Rect.this;
        super();
    }
}
