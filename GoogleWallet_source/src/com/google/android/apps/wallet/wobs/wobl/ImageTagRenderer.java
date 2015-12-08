// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.wobs.wobl;

import android.net.Uri;
import android.view.View;
import com.google.android.apps.wallet.wobs.wobl.view.WoblFetchedImageView;
import com.google.common.base.Optional;
import com.google.wallet.wobl.intermediaterepresentation.ImageIr;
import com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation;
import com.google.wallet.wobl.renderer.android.AndroidRenderer;
import com.google.wallet.wobl.renderer.android.AndroidTagRenderer;

public final class ImageTagRenderer extends AndroidTagRenderer
{

    public ImageTagRenderer(AndroidRenderer androidrenderer)
    {
        super(androidrenderer);
    }

    private void applyIrToView(WoblFetchedImageView woblfetchedimageview, ImageIr imageir)
    {
        super.applyIrToView(woblfetchedimageview, imageir);
        woblfetchedimageview.setImageUri(Uri.parse(imageir.getSource()));
        woblfetchedimageview.setAspectRatio(imageir.getAspect());
        static final class _cls1
        {

            static final int $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[];

            static 
            {
                $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign = new int[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.values().length];
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.TOP.ordinal()] = 1;
                }
                catch (NoSuchFieldError nosuchfielderror2) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.CENTER.ordinal()] = 2;
                }
                catch (NoSuchFieldError nosuchfielderror1) { }
                try
                {
                    $SwitchMap$com$google$wallet$wobl$intermediaterepresentation$IntermediateRepresentation$VerticalAlign[com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign.BOTTOM.ordinal()] = 3;
                }
                catch (NoSuchFieldError nosuchfielderror)
                {
                    return;
                }
            }
        }

        _cls1..SwitchMap.com.google.wallet.wobl.intermediaterepresentation.IntermediateRepresentation.VerticalAlign[imageir.getVerticalAlignment().ordinal()];
        JVM INSTR tableswitch 1 3: default 64
    //                   1 116
    //                   2 126
    //                   3 136;
           goto _L1 _L2 _L3 _L4
_L1:
        if (imageir.getAltText().isPresent())
        {
            woblfetchedimageview.setContentDescription((CharSequence)imageir.getAltText().get());
        }
        if (imageir.getAlpha().isPresent())
        {
            woblfetchedimageview.setAlpha(((Float)imageir.getAlpha().get()).floatValue());
        }
        return;
_L2:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_START);
        continue; /* Loop/switch isn't completed */
_L3:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_CENTER);
        continue; /* Loop/switch isn't completed */
_L4:
        woblfetchedimageview.setScaleType(android.widget.ImageView.ScaleType.FIT_END);
        if (true) goto _L1; else goto _L5
_L5:
    }

    private WoblFetchedImageView getViewInstance()
    {
        return new WoblFetchedImageView(getContext());
    }

    public final volatile void applyIrToView(View view, IntermediateRepresentation intermediaterepresentation)
    {
        applyIrToView((WoblFetchedImageView)view, (ImageIr)intermediaterepresentation);
    }

    public final volatile View getViewInstance()
    {
        return getViewInstance();
    }
}
