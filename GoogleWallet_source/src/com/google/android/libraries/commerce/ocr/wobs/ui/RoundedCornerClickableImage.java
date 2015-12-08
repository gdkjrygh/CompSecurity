// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.libraries.commerce.ocr.wobs.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.google.android.libraries.commerce.ocr.capture.ImageUtil;

public class RoundedCornerClickableImage extends RelativeLayout
{

    private final ImageUtil imageUtil = new ImageUtil();
    private final ImageView imageView;
    private final TextView label;

    public RoundedCornerClickableImage(Context context, AttributeSet attributeset)
    {
        super(context, attributeset);
        context = ((LayoutInflater)context.getSystemService("layout_inflater")).inflate(com.google.android.libraries.commerce.ocr.wobs.R.layout.rounded_corner_clickable_image, this);
        imageView = (ImageView)context.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.image);
        label = (TextView)context.findViewById(com.google.android.libraries.commerce.ocr.wobs.R.id.label);
    }

    public void setImage(Bitmap bitmap)
    {
        imageView.setImageBitmap(imageUtil.getRoundedCornerBitmap(bitmap));
    }

    public void setImage(byte abyte0[])
    {
        imageView.setImageBitmap(imageUtil.getRoundedCornerBitmap(abyte0));
    }

    public void setMessage(int i)
    {
        label.setText(i);
    }
}
