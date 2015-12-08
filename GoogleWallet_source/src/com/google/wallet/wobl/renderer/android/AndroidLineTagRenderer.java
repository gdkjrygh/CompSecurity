// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.graphics.Color;
import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.LineIr;
import com.google.wallet.wobl.renderer.android.views.LineView;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderUtils, AndroidRenderer

class AndroidLineTagRenderer extends AndroidTagRenderer
{

    public AndroidLineTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    private com.google.wallet.wobl.renderer.android.views.LineView.Orientation getOrientation(LineIr lineir)
    {
        if (lineir.getOrientation() == com.google.wallet.wobl.intermediaterepresentation.LineIr.Orientation.VERTICAL)
        {
            return com.google.wallet.wobl.renderer.android.views.LineView.Orientation.VERTICAL;
        } else
        {
            return com.google.wallet.wobl.renderer.android.views.LineView.Orientation.HORIZONTAL;
        }
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((LineView)view, (LineIr)intermediaterepresentation);
    }

    public void applyIrToView(LineView lineview, LineIr lineir)
    {
        super.applyIrToView(lineview, lineir);
        lineview.setColor(Color.parseColor(lineir.getColor()));
        lineview.setOrientation(getOrientation(lineir));
        lineview.setLength(AndroidRenderUtils.displayUnitToPx(lineir.getLength(), getContext()));
        lineview.setThickness(AndroidRenderUtils.displayUnitToPx(lineir.getThickness(), getContext()));
        lineview.setGravity(AndroidRenderUtils.calculateGravity(lineir));
        if (lineir.getAlpha().isPresent())
        {
            lineview.setAlpha(((Float)lineir.getAlpha().get()).floatValue());
        }
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public LineView getViewInstance()
    {
        return new LineView(getContext());
    }
}
