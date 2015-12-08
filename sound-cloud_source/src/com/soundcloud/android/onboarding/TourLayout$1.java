// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.onboarding;

import android.graphics.Matrix;
import android.graphics.Point;
import android.widget.ImageView;

// Referenced classes of package com.soundcloud.android.onboarding:
//            TourLayout

class lastWidth
    implements android.view.ver.OnGlobalLayoutListener
{

    private int lastHeight;
    private int lastWidth;
    final TourLayout this$0;

    public void onGlobalLayout()
    {
        if (TourLayout.access$000(TourLayout.this)[0] < 0 || TourLayout.access$000(TourLayout.this)[1] < 0 || lastWidth == getWidth() && lastHeight == getHeight())
        {
            return;
        } else
        {
            int i = TourLayout.access$000(TourLayout.this)[0];
            int j = TourLayout.access$000(TourLayout.this)[1];
            lastHeight = getHeight();
            lastWidth = getWidth();
            Point point = TourLayout.access$100(TourLayout.this);
            float f = Math.max((float)point.y / (float)j, (float)point.x / (float)i);
            Matrix matrix = new Matrix();
            matrix.setScale(f, f);
            matrix.postTranslate(((float)point.x - (float)i * f) / 2.0F, ((float)point.y - (float)j * f) / 2.0F);
            TourLayout.access$200(TourLayout.this).setImageMatrix(matrix);
            return;
        }
    }

    tener()
    {
        this$0 = TourLayout.this;
        super();
        lastHeight = -1;
        lastWidth = -1;
    }
}
