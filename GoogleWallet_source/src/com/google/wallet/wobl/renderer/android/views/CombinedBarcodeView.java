// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.wallet.wobl.renderer.android.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.google.common.base.Optional;

// Referenced classes of package com.google.wallet.wobl.renderer.android.views:
//            BarcodeView

public class CombinedBarcodeView extends LinearLayout
{

    private final int barcode1dBottomQuietZoneHeightPx;
    private final int barcode1dTopQuietZoneHeightPx;
    private final BarcodeView barcodeView;
    private final TextView humanReadableText;
    private final int humanReadableTextHeight;
    private final int humanReadableTextHeightBarcodeError;
    private final int humanReadableTextQuietZoneHeight;

    public CombinedBarcodeView(Context context)
    {
        this(context, new BarcodeView(context), new TextView(context));
    }

    public CombinedBarcodeView(Context context, BarcodeView barcodeview, final TextView humanReadableText)
    {
        super(context);
        setOrientation(1);
        barcodeView = barcodeview;
        addView(barcodeview);
        this.humanReadableText = humanReadableText;
        addView(humanReadableText);
        humanReadableText.setTextIsSelectable(true);
        humanReadableText.setTextColor(context.getResources().getColor(com.google.wallet.wobl.renderer.android.R.color.barcode_human_readable_code));
        humanReadableTextHeight = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_human_readable_text_height);
        humanReadableTextHeightBarcodeError = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_human_readable_text_height_barcode_error);
        humanReadableTextQuietZoneHeight = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_human_readable_text_quiet_zone_height);
        barcode1dTopQuietZoneHeightPx = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_1d_top_quiet_zone_height);
        barcode1dBottomQuietZoneHeightPx = context.getResources().getDimensionPixelSize(com.google.wallet.wobl.renderer.android.R.dimen.barcode_1d_bottom_quiet_zone_height);
        barcodeview.setListener(new BarcodeView.BarcodeRenderListener() {

            final CombinedBarcodeView this$0;
            final TextView val$humanReadableText;

            public void onErrorRenderingBarcode()
            {
                setVerticalPaddings(humanReadableTextQuietZoneHeight, humanReadableTextQuietZoneHeight);
                humanReadableText.setTextSize(0, humanReadableTextHeightBarcodeError);
            }

            public void onReset()
            {
                humanReadableText.setTextSize(0, humanReadableTextHeight);
            }

            
            {
                this$0 = CombinedBarcodeView.this;
                humanReadableText = textview;
                super();
            }
        });
    }

    private void setVerticalPaddings(int i, int j)
    {
        super.setPadding(getPaddingLeft(), getPaddingTop() + i, getPaddingRight(), getPaddingBottom() + j);
    }

    public void setBarcodeAlpha(float f)
    {
        barcodeView.setAlpha(f);
    }

    public void setData(String s, com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType barcodetype, Optional optional)
    {
label0:
        {
            barcodeView.setData(s, barcodetype);
            if (optional.isPresent())
            {
                humanReadableText.setText((CharSequence)optional.get());
                humanReadableText.setVisibility(0);
            } else
            {
                humanReadableText.setVisibility(8);
            }
            if (barcodetype != null)
            {
                if (barcodetype.is2d() && barcodetype != com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417 && barcodetype != com.google.wallet.wobl.intermediaterepresentation.BarcodeIr.BarcodeType.PDF_417_COMPACT)
                {
                    break label0;
                }
                setVerticalPaddings(barcode1dTopQuietZoneHeightPx, barcode1dBottomQuietZoneHeightPx);
            }
            return;
        }
        setVerticalPaddings(0, 0);
    }

    public void setGravity(int i)
    {
        barcodeView.setGravity(i);
        humanReadableText.setGravity(i);
    }

    public void setPadding(int i, int j, int k, int l)
    {
        super.setPadding(i, j, k, l);
    }




}
