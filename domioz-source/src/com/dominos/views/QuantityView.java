// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.utils.ResUtils;
import org.a.a.a.l;

public class QuantityView extends LinearLayout
{

    public static final String TAG = com/dominos/views/QuantityView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    ImageButton incrementButton;
    TextView label;
    private OnQuantityChangedListener mQuantityChangedListener;
    private int maxQuantity;
    private int quantity;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    RelativeLayout quantityLayout;
    ResUtils resUtils;
    TextView sectionViewLabel;

    public QuantityView(Context context)
    {
        super(context);
        quantity = 0;
        maxQuantity = 0;
    }

    public void bind(LabsProductLine labsproductline, OnQuantityChangedListener onquantitychangedlistener)
    {
        boolean flag1 = true;
        quantity = labsproductline.getQuantity();
        maxQuantity = labsproductline.getProduct().getMaxQuantity();
        setSectionHeader(getContext().getString(0x7f08043b));
        setItemBackground(0x7f020139);
        label.setText(getContext().getString(0x7f080430));
        mQuantityChangedListener = onquantitychangedlistener;
        onquantitychangedlistener = decrementButton;
        boolean flag;
        if (quantity > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        onquantitychangedlistener.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(quantity)
        }));
        onquantitychangedlistener = incrementButton;
        if (quantity < labsproductline.getProduct().getMaxQuantity())
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        onquantitychangedlistener.setEnabled(flag);
        decrementButton.setOnClickListener(new _cls1());
        incrementButton.setOnClickListener(new _cls2());
        setOnClickListener(null);
    }

    public void decrementQuantity()
    {
        quantity = quantity - 1;
        if (quantity <= 0)
        {
            quantity = 1;
        }
        ImageButton imagebutton = decrementButton;
        boolean flag;
        if (quantity > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        imagebutton = incrementButton;
        if (quantity < maxQuantity)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(quantity)
        }));
        refreshDrawableState();
    }

    public void incrementQuantity()
    {
        quantity = quantity + 1;
        ImageButton imagebutton = decrementButton;
        boolean flag;
        if (quantity > 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        imagebutton = incrementButton;
        if (quantity < maxQuantity)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        quantityLabel.setText(String.format("%d", new Object[] {
            Integer.valueOf(quantity)
        }));
        refreshDrawableState();
    }

    public void setItemBackground(int i)
    {
        quantityLayout.setBackgroundResource(i);
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

        final QuantityView this$0;

        public void onClick(View view)
        {
            decrementQuantity();
            if (mQuantityChangedListener != null)
            {
                mQuantityChangedListener.onQuantityChanged(quantity);
            }
        }

        _cls1()
        {
            this$0 = QuantityView.this;
            super();
        }

        private class OnQuantityChangedListener
        {

            public abstract void onQuantityChanged(int i);
        }

    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final QuantityView this$0;

        public void onClick(View view)
        {
            incrementQuantity();
            if (mQuantityChangedListener != null)
            {
                mQuantityChangedListener.onQuantityChanged(quantity);
            }
        }

        _cls2()
        {
            this$0 = QuantityView.this;
            super();
        }
    }

}
