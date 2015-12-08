// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.Button;
import android.widget.RelativeLayout;
import com.dominos.android.sdk.common.FontManager;

public class CouponWizardFooterView extends RelativeLayout
{

    Button addAnotherItem;
    private OnButtonClickListener clickListener;
    Button doneButton;
    private boolean enabled;
    private boolean gwEnabled;

    public CouponWizardFooterView(Context context)
    {
        super(context);
    }

    void AddAnotherButtonClick()
    {
        if (clickListener != null)
        {
            clickListener.onAddAnotherItemClick();
        }
    }

    void afterViews()
    {
        FontManager.applyDominosFont(this);
    }

    void doneButtonClick()
    {
        if (clickListener != null)
        {
            clickListener.onDoneButtonClick();
        }
    }

    public void setClickListener(OnButtonClickListener onbuttonclicklistener)
    {
        clickListener = onbuttonclicklistener;
    }

    private class OnButtonClickListener
    {

        public abstract void onAddAnotherItemClick();

        public abstract void onDoneButtonClick();
    }

}
