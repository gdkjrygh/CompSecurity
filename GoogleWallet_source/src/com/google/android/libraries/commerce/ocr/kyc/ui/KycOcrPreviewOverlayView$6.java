// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrPreviewOverlayView

final class val.side
    implements Runnable
{

    final KycOcrPreviewOverlayView this$0;
    final com.google.android.libraries.commerce.ocr.kyc.pub.his._cls0 val$side;

    public final void run()
    {
        Object obj = KycOcrPreviewOverlayView.access$300(KycOcrPreviewOverlayView.this);
        TextView textview;
        int i;
        if (val$side == com.google.android.libraries.commerce.ocr.kyc.pub.al.side)
        {
            i = com.google.android.libraries.commerce.ocr.kyc.;
        } else
        {
            i = com.google.android.libraries.commerce.ocr.kyc.d;
        }
        ((TextView) (obj)).setText(i);
        textview = KycOcrPreviewOverlayView.access$300(KycOcrPreviewOverlayView.this);
        if (val$side == com.google.android.libraries.commerce.ocr.kyc.pub.al.side)
        {
            obj = KycOcrPreviewOverlayView.access$400(KycOcrPreviewOverlayView.this);
        } else
        {
            obj = KycOcrPreviewOverlayView.access$500(KycOcrPreviewOverlayView.this);
        }
        textview.setContentDescription(((CharSequence) (obj)));
        KycOcrPreviewOverlayView.access$600(KycOcrPreviewOverlayView.this).sendAnnouncementEventForViewContentDescription(KycOcrPreviewOverlayView.access$300(KycOcrPreviewOverlayView.this));
    }

    Q()
    {
        this$0 = final_kycocrpreviewoverlayview;
        val$side = com.google.android.libraries.commerce.ocr.kyc.pub.al.side.this;
        super();
    }
}
