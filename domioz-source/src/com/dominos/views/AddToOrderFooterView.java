// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.content.res.Resources;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.dominos.android.sdk.common.FontManager;

public class AddToOrderFooterView extends RelativeLayout
{

    private OnButtonClickListener mClickListener;
    private boolean mIsEditMode;
    Button mSaveButton;

    public AddToOrderFooterView(Context context, OnButtonClickListener onbuttonclicklistener, boolean flag)
    {
        super(context);
        mIsEditMode = flag;
        mClickListener = onbuttonclicklistener;
    }

    void init()
    {
        FontManager.applyDominosFont(this);
        if (mIsEditMode)
        {
            mSaveButton.setText(getResources().getString(0x7f08028b));
        }
    }

    protected void onAddToOrderButtonClick()
    {
        if (mClickListener != null)
        {
            mClickListener.onAddToOrderClick();
        }
    }

    private class OnButtonClickListener
    {

        public abstract void onAddToOrderClick();
    }

}
