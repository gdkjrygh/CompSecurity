// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.AbstractRenderer;
import com.google.wallet.wobl.renderer.android.views.ColumnLayout;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderUtils, AndroidRenderer

class AndroidColumnLayoutTagRenderer extends AndroidTagRenderer
{

    public AndroidColumnLayoutTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((ColumnLayout)view, (ColumnLayoutIr)intermediaterepresentation);
    }

    public void applyIrToView(ColumnLayout columnlayout, ColumnLayoutIr columnlayoutir)
    {
        super.applyIrToView(columnlayout, columnlayoutir);
        columnlayout.setColumnWidths(columnlayoutir.getColumnWidths());
        columnlayout.setVerticalGravity(AndroidRenderUtils.calculateGravity(columnlayoutir));
        columnlayout.removeAllViews();
        IntermediateRepresentation intermediaterepresentation;
        com.google.wallet.wobl.renderer.android.views.ColumnLayout.LayoutParams layoutparams;
        for (columnlayoutir = columnlayoutir.getChildren().iterator(); columnlayoutir.hasNext(); columnlayout.addView((View)getRenderer().render(intermediaterepresentation), layoutparams))
        {
            intermediaterepresentation = (IntermediateRepresentation)columnlayoutir.next();
            layoutparams = com.google.wallet.wobl.renderer.android.views.ColumnLayout.LayoutParams.fromRendererLayoutParams((com.google.wallet.wobl.intermediaterepresentation.ColumnLayoutIr.ColumnLayoutRendererLayoutParams)intermediaterepresentation.getRendererLayoutParams());
        }

    }

    protected volatile void applyOnClickColors(View view, ColorDrawable colordrawable)
    {
        applyOnClickColors((ColumnLayout)view, colordrawable);
    }

    protected void applyOnClickColors(ColumnLayout columnlayout, ColorDrawable colordrawable)
    {
        columnlayout.setForeground(getContext().getResources().getDrawable(R.drawable.wobl_bounded_rippleable));
        columnlayout.setBackgroundDrawable(colordrawable);
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public ColumnLayout getViewInstance()
    {
        return new ColumnLayout(getContext());
    }
}
