// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsSide;
import com.dominos.utils.ResUtils;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView, ProductSpinner

public class SideView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    RelativeLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    private OnSideClickListener mClickListener;
    private int mQuantity;
    private LabsSide mSide;
    RadioGroup partRadioGroup;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    ProductSpinner sauceSpinner;
    TextView sectionViewLabel;
    TextView tapTip;

    public SideView(Context context)
    {
        super(context);
    }

    public void bind(LabsSide labsside, boolean flag, boolean flag1, OnSideClickListener onsideclicklistener)
    {
        boolean flag2 = true;
        if (flag && flag1)
        {
            detailLayout.setBackgroundResource(0x7f020139);
        } else
        if (flag)
        {
            detailLayout.setBackgroundResource(0x7f02013a);
        } else
        if (flag1)
        {
            detailLayout.setBackgroundResource(0x7f020137);
        } else
        {
            detailLayout.setBackgroundResource(0x7f020138);
        }
        mClickListener = onsideclicklistener;
        mSide = labsside;
        mQuantity = (int)labsside.getQuantityForPart("1/1");
        label.setText(labsside.getName());
        detailLayout.setSelected(false);
        labsside = decrementButton;
        if (mQuantity > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        labsside.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(mQuantity)
        }));
        labsside = incrementButton;
        if (mQuantity < mSide.getMaxQuantity())
        {
            flag = flag2;
        } else
        {
            flag = false;
        }
        labsside.setEnabled(flag);
        decrementButton.setOnClickListener(new _cls1());
        incrementButton.setOnClickListener(new _cls2());
        setOnClickListener(null);
    }

    public void decrementQuantity()
    {
        mQuantity = mQuantity - 1;
        if (mQuantity <= 0)
        {
            mQuantity = 0;
        }
        ImageButton imagebutton = decrementButton;
        boolean flag;
        if (mQuantity > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        imagebutton = incrementButton;
        if (mQuantity < mSide.getMaxQuantity())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(mQuantity)
        }));
        if (mClickListener != null)
        {
            mClickListener.onQuantityUpdated(mSide, mQuantity);
        }
        refreshDrawableState();
    }

    public void incrementQuantity()
    {
        mQuantity = mQuantity + 1;
        ImageButton imagebutton = decrementButton;
        boolean flag;
        if (mQuantity > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        imagebutton = incrementButton;
        if (mQuantity < mSide.getMaxQuantity())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(mQuantity)
        }));
        if (mClickListener != null)
        {
            mClickListener.onQuantityUpdated(mSide, mQuantity);
        }
        refreshDrawableState();
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SideView this$0;

        public void onClick(View view)
        {
            decrementQuantity();
        }

        _cls1()
        {
            this$0 = SideView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SideView this$0;

        public void onClick(View view)
        {
            incrementQuantity();
        }

        _cls2()
        {
            this$0 = SideView.this;
            super();
        }
    }


    private class OnSideClickListener
    {

        public abstract void onQuantityUpdated(LabsSide labsside, int i);
    }

}
