// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.ui.appcontent;

import android.content.Context;
import android.content.res.Resources;
import android.widget.TextView;
import com.google.android.gms.common.images.ImageManager;
import com.google.android.gms.common.images.internal.LoadingImageView;
import com.google.android.gms.games.appcontent.AppContentAnnotation;
import com.google.android.gms.games.ui.appcontent.utils.AnnotationUtils;
import com.google.android.gms.games.ui.layouts.LayoutSlot;
import java.util.ArrayList;
import java.util.List;

public class TextViewLayoutSlot extends LayoutSlot
{

    private final ArrayList mClickableViews;
    private final Context mContext;
    public int mDefaultTextColor;
    private final int mImagePosition;
    private final LoadingImageView mImageView;
    private final TextView mTextView;

    public TextViewLayoutSlot(Context context, TextView textview)
    {
        this(context, textview, -1);
    }

    public TextViewLayoutSlot(Context context, TextView textview, byte byte0)
    {
        this(context, textview, 0);
    }

    private TextViewLayoutSlot(Context context, TextView textview, int i)
    {
        mContext = context;
        mTextView = textview;
        mImageView = null;
        mImagePosition = i;
        mDefaultTextColor = mTextView.getCurrentTextColor();
        mClickableViews = new ArrayList();
        mClickableViews.add(mTextView);
    }

    public final List getClickableViews()
    {
        return mClickableViews;
    }

    public void resetAnnotation()
    {
        super.resetAnnotation();
        mTextView.setVisibility(8);
        if (mImagePosition != -1)
        {
            Context context = mContext;
            TextView textview = mTextView;
            int i = mImagePosition;
            AnnotationUtils.ensureImageManager(context);
            AnnotationUtils.mImageManager.loadImage(new com.google.android.gms.games.ui.appcontent.utils.AnnotationUtils.AnnotationTextImageRequest(textview, i));
        }
    }

    public void setAnnotation(AppContentAnnotation appcontentannotation)
    {
        super.setAnnotation(appcontentannotation);
        mTextView.setTextColor(AnnotationUtils.getColor(appcontentannotation, mDefaultTextColor, "textColor"));
        if (mImagePosition != -1)
        {
            AnnotationUtils.putImageInTextView(mContext, mTextView, mImagePosition, appcontentannotation);
        }
        mTextView.setText(appcontentannotation.getTitle());
        mTextView.setVisibility(0);
    }

    public final TextViewLayoutSlot setDefaultTextColorResId(int i)
    {
        mDefaultTextColor = mContext.getResources().getColor(i);
        return this;
    }
}
