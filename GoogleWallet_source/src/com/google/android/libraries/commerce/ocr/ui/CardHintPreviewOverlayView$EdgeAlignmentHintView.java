// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import android.view.View;
import com.google.android.libraries.commerce.ocr.cv.Boundaries;

// Referenced classes of package com.google.android.libraries.commerce.ocr.ui:
//            CardHintPreviewOverlayView

final class this._cls0 extends View
{

    private final PointF lineEndBuffer = new PointF();
    private final PointF lineStartBuffer = new PointF();
    final CardHintPreviewOverlayView this$0;

    private void drawEdgeDectionHintLine(Canvas canvas, PointF pointf, RectF rectf, float f, PointF pointf1, RectF rectf1, float f1)
    {
        canvas.drawLine(pointf.x, pointf.y, pointf1.x, pointf1.y, CardHintPreviewOverlayView.access$1100(CardHintPreviewOverlayView.this));
        canvas.drawArc(rectf, f, 45F, false, CardHintPreviewOverlayView.access$1100(CardHintPreviewOverlayView.this));
        canvas.drawArc(rectf1, f1, 45F, false, CardHintPreviewOverlayView.access$1100(CardHintPreviewOverlayView.this));
    }

    protected final void onDraw(Canvas canvas)
    {
        if (CardHintPreviewOverlayView.access$600(CardHintPreviewOverlayView.this) != null)
        {
            Rect rect = roiProvider.getMidBoundingBoxRect();
            if (CardHintPreviewOverlayView.access$600(CardHintPreviewOverlayView.this).getTop() != null)
            {
                lineStartBuffer.set((float)rect.left + CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this), rect.top);
                lineEndBuffer.set((float)rect.right - CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this), rect.top);
                drawEdgeDectionHintLine(canvas, lineStartBuffer, CardHintPreviewOverlayView.access$700(CardHintPreviewOverlayView.this), 225F, lineEndBuffer, CardHintPreviewOverlayView.access$800(CardHintPreviewOverlayView.this), 270F);
            }
            if (CardHintPreviewOverlayView.access$600(CardHintPreviewOverlayView.this).getBottom() != null)
            {
                lineStartBuffer.set((float)rect.left + CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this), rect.bottom);
                lineEndBuffer.set((float)rect.right - CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this), rect.bottom);
                drawEdgeDectionHintLine(canvas, lineStartBuffer, CardHintPreviewOverlayView.access$900(CardHintPreviewOverlayView.this), 90F, lineEndBuffer, CardHintPreviewOverlayView.access$1000(CardHintPreviewOverlayView.this), 45F);
            }
            if (CardHintPreviewOverlayView.access$600(CardHintPreviewOverlayView.this).getLeft() != null)
            {
                lineStartBuffer.set(rect.left, (float)rect.top + CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this));
                lineEndBuffer.set(rect.left, (float)rect.bottom - CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this));
                drawEdgeDectionHintLine(canvas, lineStartBuffer, CardHintPreviewOverlayView.access$700(CardHintPreviewOverlayView.this), 180F, lineEndBuffer, CardHintPreviewOverlayView.access$900(CardHintPreviewOverlayView.this), 135F);
            }
            if (CardHintPreviewOverlayView.access$600(CardHintPreviewOverlayView.this).getRight() != null)
            {
                lineStartBuffer.set(rect.right, (float)rect.top + CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this));
                lineEndBuffer.set(rect.right, (float)rect.bottom - CardHintPreviewOverlayView.access$400(CardHintPreviewOverlayView.this));
                drawEdgeDectionHintLine(canvas, lineStartBuffer, CardHintPreviewOverlayView.access$800(CardHintPreviewOverlayView.this), -45F, lineEndBuffer, CardHintPreviewOverlayView.access$1000(CardHintPreviewOverlayView.this), 0.0F);
                return;
            }
        }
    }

    public stProvider(Context context)
    {
        this$0 = CardHintPreviewOverlayView.this;
        super(context);
    }
}
