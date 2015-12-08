// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.view.View;
import android.widget.LinearLayout;
import com.google.wallet.wobl.intermediaterepresentation.FieldIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.AbstractRenderer;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderUtils, AndroidRenderer

class AndroidFieldTagRenderer extends AndroidTagRenderer
{

    public AndroidFieldTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((LinearLayout)view, (FieldIr)intermediaterepresentation);
    }

    public void applyIrToView(LinearLayout linearlayout, FieldIr fieldir)
    {
        super.applyIrToView(linearlayout, fieldir);
        linearlayout.removeAllViews();
        linearlayout.setOrientation(1);
        linearlayout.setGravity(AndroidRenderUtils.calculateGravity(fieldir));
        android.widget.LinearLayout.LayoutParams layoutparams = new android.widget.LinearLayout.LayoutParams(-1, -2);
        linearlayout.addView((View)getRenderer().render(fieldir.getFieldName()), layoutparams);
        linearlayout.addView((View)getRenderer().render(fieldir.getFieldValue()), layoutparams);
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public LinearLayout getViewInstance()
    {
        return new LinearLayout(getContext());
    }
}
