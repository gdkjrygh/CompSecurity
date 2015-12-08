// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android;

import android.view.View;
import com.google.common.base.Optional;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.intermediaterepresentation.SpinnerIr;
import com.google.wallet.wobl.renderer.android.views.SpinnerView;

// Referenced classes of package com.google.wallet.wobl.renderer.android:
//            AndroidTagRenderer, AndroidRenderer

public class AndroidSpinnerTagRenderer extends AndroidTagRenderer
{

    public AndroidSpinnerTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    public volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((SpinnerView)view, (SpinnerIr)intermediaterepresentation);
    }

    public void applyIrToView(SpinnerView spinnerview, SpinnerIr spinnerir)
    {
        super.applyIrToView(spinnerview, spinnerir);
        spinnerview.setImageResource(R.drawable.wobl_ic_refresh);
        if (spinnerir.getAltText().isPresent())
        {
            spinnerview.setContentDescription((CharSequence)spinnerir.getAltText().get());
        }
    }

    public volatile View getViewInstance()
    {
        return getViewInstance();
    }

    public SpinnerView getViewInstance()
    {
        return new SpinnerView(getContext());
    }
}
