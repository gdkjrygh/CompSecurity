// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.util.AccessibilityUtils;
import com.google.android.libraries.commerce.ocr.wobs.WobsOcrFragment;
import com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder;
import com.google.android.libraries.commerce.ocr.wobs.ui.RoundedCornerClickableImage;
import com.google.android.libraries.commerce.ocr.wobs.ui.WobsOcrUiModule;

// Referenced classes of package com.google.android.libraries.commerce.ocr.wobs.fragments:
//            TransitionHandler, OcrResultNotifier

public class ImagePreviewFragment extends Fragment
    implements OcrResultNotifier.OcrResultCallback
{

    AccessibilityUtils accessibilityUtils;
    RoundedCornerClickableImage firstImageView;
    private View fragmentView;
    private Button nextButton;
    private OcrResultNotifier ocrResultNotifier;
    private View progressView;
    RoundedCornerClickableImage secondImageView;
    private TextView titleView;
    TransitionHandler transitionHandler;
    private WobsOcrUiModule wobsOcrUiModule;

    public ImagePreviewFragment()
    {
    }

    private void performOnStart()
    {
        accessibilityUtils.sendAnnouncementEventForViewContentDescription(titleView);
    }

    private void renderImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side side)
    {
        RoundedCornerClickableImage roundedcornerclickableimage;
        byte abyte0[];
        if (side == com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK)
        {
            roundedcornerclickableimage = firstImageView;
        } else
        {
            roundedcornerclickableimage = secondImageView;
        }
        abyte0 = OcrImageHolder.get(side);
        if (abyte0 != null)
        {
            int i;
            try
            {
                roundedcornerclickableimage.setImage(abyte0);
            }
            catch (OutOfMemoryError outofmemoryerror)
            {
                transitionHandler.exit(10009);
            }
            if (side == com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK)
            {
                i = com.google.android.libraries.commerce.ocr.wobs.R.string.back_label;
            } else
            {
                i = com.google.android.libraries.commerce.ocr.wobs.R.string.front_label;
            }
            roundedcornerclickableimage.setMessage(i);
        }
    }

    private void setWaitingForOcrMode(boolean flag)
    {
        boolean flag2 = true;
        Object obj = progressView;
        int i;
        boolean flag1;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        ((View) (obj)).setVisibility(i);
        obj = firstImageView;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((RoundedCornerClickableImage) (obj)).setClickable(flag1);
        obj = secondImageView;
        if (!flag)
        {
            flag1 = true;
        } else
        {
            flag1 = false;
        }
        ((RoundedCornerClickableImage) (obj)).setClickable(flag1);
        obj = nextButton;
        if (!flag)
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        ((Button) (obj)).setClickable(flag);
    }

    public final void onAttach(Activity activity)
    {
        super.onAttach(activity);
        WobsOcrFragment wobsocrfragment = (WobsOcrFragment)getParentFragment();
        ocrResultNotifier = wobsocrfragment.provideOcrResultNotifier();
        transitionHandler = wobsocrfragment;
        wobsOcrUiModule = new WobsOcrUiModule(activity);
        accessibilityUtils = wobsOcrUiModule.provideAccessibilityUtils();
    }

    public final void onCreate(Bundle bundle)
    {
        super.onCreate(bundle);
    }

    public final View onCreateView(LayoutInflater layoutinflater, ViewGroup viewgroup, Bundle bundle)
    {
        fragmentView = layoutinflater.inflate(com.google.android.libraries.commerce.ocr.wobs.R.layout.image_preview, viewgroup, false);
        layoutinflater = wobsOcrUiModule;
        titleView = WobsOcrUiModule.provideTitleView(fragmentView);
        layoutinflater = wobsOcrUiModule;
        progressView = WobsOcrUiModule.provideProgressView(fragmentView);
        layoutinflater = wobsOcrUiModule;
        nextButton = WobsOcrUiModule.provideNextButton(fragmentView);
        layoutinflater = wobsOcrUiModule;
        firstImageView = WobsOcrUiModule.provideFirstImageView(fragmentView);
        layoutinflater = wobsOcrUiModule;
        secondImageView = WobsOcrUiModule.provideSecondImageView(fragmentView);
        nextButton.setOnClickListener(new android.view.View.OnClickListener() {

            final ImagePreviewFragment this$0;

            public final void onClick(View view)
            {
                setWaitingForOcrMode(true);
                ocrResultNotifier.setOcrResultCallback(ImagePreviewFragment.this);
            }

            
            {
                this$0 = ImagePreviewFragment.this;
                super();
            }
        });
        return fragmentView;
    }

    public final void onDestroy()
    {
        super.onDestroy();
        ocrResultNotifier.setOcrResultCallback(null);
    }

    public final void onOcrResult()
    {
        transitionHandler.next();
    }

    public final void onPause()
    {
        super.onPause();
        firstImageView.setOnClickListener(null);
        secondImageView.setOnClickListener(null);
    }

    public final void onResume()
    {
        super.onResume();
        firstImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ImagePreviewFragment this$0;

            public final void onClick(View view)
            {
                transitionHandler.captureSingleSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK);
            }

            
            {
                this$0 = ImagePreviewFragment.this;
                super();
            }
        });
        secondImageView.setOnClickListener(new android.view.View.OnClickListener() {

            final ImagePreviewFragment this$0;

            public final void onClick(View view)
            {
                transitionHandler.captureSingleSide(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT);
            }

            
            {
                this$0 = ImagePreviewFragment.this;
                super();
            }
        });
        renderImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.BACK);
        renderImage(com.google.android.libraries.commerce.ocr.wobs.pub.OcrImageHolder.Side.FRONT);
        setWaitingForOcrMode(false);
    }

    public final void onStart()
    {
        super.onStart();
        performOnStart();
    }


}
