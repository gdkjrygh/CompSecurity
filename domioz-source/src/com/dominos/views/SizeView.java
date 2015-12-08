// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsProductLine;
import org.a.a.a.l;

public class SizeView extends LinearLayout
{

    public static final String TAG = com/dominos/views/SizeView.getSimpleName();
    RelativeLayout detailLayout;
    TextView label;
    RelativeLayout labelLayout;
    private OnSizeClickListener mSizeClickListener;
    TextView sectionViewLabel;

    public SizeView(Context context)
    {
        super(context);
    }

    public void bind(LabsProductLine labsproductline, OnSizeClickListener onsizeclicklistener)
    {
        setSectionHeader(getContext().getString(0x7f08043c));
        mSizeClickListener = onsizeclicklistener;
        setItemBackground(0x7f020139);
        label.setText(labsproductline.getFormattedFlavor());
        setOnClickListener(new _cls1());
    }

    public void setItemBackground(int i)
    {
        detailLayout.setBackgroundResource(i);
    }

    public void setSectionHeader(String s)
    {
        if (l.b(s))
        {
            sectionViewLabel.setText(s);
            sectionViewLabel.setVisibility(0);
            return;
        } else
        {
            sectionViewLabel.setVisibility(8);
            return;
        }
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }



    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SizeView this$0;

        public void onClick(View view)
        {
            if (mSizeClickListener != null)
            {
                mSizeClickListener.onSizeClicked();
            }
        }

        _cls1()
        {
            this$0 = SizeView.this;
            super();
        }

        private class OnSizeClickListener
        {

            public abstract void onSizeClicked();
        }

    }

}
