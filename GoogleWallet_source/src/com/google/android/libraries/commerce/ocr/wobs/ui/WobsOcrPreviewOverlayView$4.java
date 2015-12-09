// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.ui:
//            WobsOcrPreviewOverlayView

final class val.animation
    implements Runnable
{

    final WobsOcrPreviewOverlayView this$0;
    final boolean val$animation;
    final com.google.android.libraries.commerce.ocr.wobs.pub.his._cls0 val$side;

    public final void run()
    {
        Object obj = WobsOcrPreviewOverlayView.access$000(WobsOcrPreviewOverlayView.this);
        TextView textview;
        int i;
        if (val$side == com.google.android.libraries.commerce.ocr.wobs.pub.al.side)
        {
            i = com.google.android.libraries.commerce.ocr.wobs.;
        } else
        {
            i = com.google.android.libraries.commerce.ocr.wobs.;
        }
        ((TextView) (obj)).setText(i);
        textview = WobsOcrPreviewOverlayView.access$000(WobsOcrPreviewOverlayView.this);
        if (val$side == com.google.android.libraries.commerce.ocr.wobs.pub.al.side)
        {
            obj = WobsOcrPreviewOverlayView.access$100(WobsOcrPreviewOverlayView.this);
        } else
        {
            obj = WobsOcrPreviewOverlayView.access$200(WobsOcrPreviewOverlayView.this);
        }
        textview.setContentDescription(((CharSequence) (obj)));
        if (val$animation)
        {
            WobsOcrPreviewOverlayView.access$400(WobsOcrPreviewOverlayView.this, WobsOcrPreviewOverlayView.access$300(WobsOcrPreviewOverlayView.this), true);
            WobsOcrPreviewOverlayView.access$500(WobsOcrPreviewOverlayView.this, WobsOcrPreviewOverlayView.access$300(WobsOcrPreviewOverlayView.this), false);
        }
        WobsOcrPreviewOverlayView.access$600(WobsOcrPreviewOverlayView.this).sendAnnouncementEventForViewContentDescription(WobsOcrPreviewOverlayView.access$000(WobsOcrPreviewOverlayView.this));
    }

    ()
    {
        this$0 = final_wobsocrpreviewoverlayview;
        val$side = ;
        val$animation = Z.this;
        super();
    }
}
