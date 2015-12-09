// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.kyc.ui;

import android.animation.Animator;
import android.view.View;
import android.widget.TextView;
import java.util.Iterator;
import java.util.Set;

// Referenced classes of package com.google.android.libraries.commerce.ocr.kyc.ui:
//            KycOcrPreviewOverlayView

final class faultAnimatorListener extends faultAnimatorListener
{

    final KycOcrPreviewOverlayView this$0;

    public final void onAnimationEnd(Animator animator)
    {
        for (animator = KycOcrPreviewOverlayView.access$1300(KycOcrPreviewOverlayView.this).iterator(); animator.hasNext(); ((View)animator.next()).setEnabled(true)) { }
        for (animator = KycOcrPreviewOverlayView.access$1200(KycOcrPreviewOverlayView.this).iterator(); animator.hasNext(); ((View)animator.next()).setVisibility(4)) { }
        KycOcrPreviewOverlayView.access$1400(KycOcrPreviewOverlayView.this).setText(com.google.android.libraries.commerce.ocr.kyc.);
    }

    public final void onAnimationStart(Animator animator)
    {
        for (animator = KycOcrPreviewOverlayView.access$1200(KycOcrPreviewOverlayView.this).iterator(); animator.hasNext(); ((View)animator.next()).setEnabled(false)) { }
        for (animator = KycOcrPreviewOverlayView.access$1300(KycOcrPreviewOverlayView.this).iterator(); animator.hasNext(); ((View)animator.next()).setVisibility(0)) { }
    }

    faultAnimatorListener()
    {
        this$0 = KycOcrPreviewOverlayView.this;
        super(null);
    }
}
