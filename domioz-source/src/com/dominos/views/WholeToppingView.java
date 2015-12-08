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
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView

public class WholeToppingView extends LinearLayout
{

    private static final int MIN = 1;
    private static final int PASTA_SAUCE_MIN = 0;
    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    RelativeLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    private boolean mAdded;
    private int mAmountIndex;
    private OnWholeToppingClickListener mClickListener;
    private LabsProductLine mProductLine;
    private LabsTopping mTopping;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    TextView sectionViewLabel;
    TextView tapTip;

    public WholeToppingView(Context context)
    {
        super(context);
    }

    public void bind(LabsTopping labstopping, LabsProductLine labsproductline, boolean flag, boolean flag1, boolean flag2, final boolean isReadOnly, OnWholeToppingClickListener onwholetoppingclicklistener)
    {
        mTopping = labstopping;
        mClickListener = onwholetoppingclicklistener;
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
        mAdded = flag2;
        mProductLine = labsproductline;
        toggleWholeToppingControls(mTopping);
        setOnClickListener(new _cls1());
        tapTip.setOnClickListener(new _cls2());
        decrementButton.setOnClickListener(new _cls3());
        incrementButton.setOnClickListener(new _cls4());
    }

    public void decrementAmount()
    {
        boolean flag1 = true;
        mAmountIndex = mAmountIndex - 1;
        if (mAmountIndex < 0)
        {
            mAmountIndex = 0;
        }
        ImageButton imagebutton = decrementButton;
        boolean flag;
        if (mAmountIndex > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        imagebutton = incrementButton;
        if (mAmountIndex < mTopping.getOptionAvailability().size() - 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        if (!mTopping.getOptionAvailability().isEmpty())
        {
            quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mTopping.getOptionAvailability().get(mAmountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        }
        if (mClickListener != null)
        {
            mClickListener.onWholeToppingWeightUpdate(mTopping, mAmountIndex, this);
        }
        refreshDrawableState();
    }

    public void incrementAmount()
    {
        mAmountIndex = mAmountIndex + 1;
        if (mAmountIndex >= mTopping.getOptionAvailability().size())
        {
            mAmountIndex = mTopping.getOptionAvailability().size() - 1;
        }
        if (mClickListener != null)
        {
            mClickListener.onWholeToppingWeightUpdate(mTopping, mAmountIndex, this);
        }
    }

    public void setToppingAdded(LabsTopping labstopping, boolean flag)
    {
        mAdded = flag;
        toggleWholeToppingControls(labstopping);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

    public void toggleWholeToppingControls(LabsTopping labstopping)
    {
        boolean flag1 = true;
        mTopping = labstopping;
        if (mAdded)
        {
            labelLayout.setVisibility(0);
            label.setText(mTopping.getName());
            tapTip.setVisibility(0);
            tapTip.setText(getContext().getString(0x7f0802f4));
            detailLayout.setSelected(true);
            controlLayout.setVisibility(0);
            quantityControlLayout.setVisibility(0);
            quantityLabel.setText(LabsTopping.getOptionQuantityName(mTopping.getQuantityForPart(mTopping.getPartWithQuantity()), resUtils.getOptionToQuantityMap()));
            mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(mTopping.getQuantityForPart(mTopping.getPartWithQuantity())));
            if (mTopping.getOptionAvailability().size() == 1)
            {
                decrementButton.setEnabled(false);
                incrementButton.setEnabled(false);
                tapTip.setVisibility(8);
                return;
            }
            boolean flag;
            if (mTopping.isSauce() && mProductLine.getProduct().isPasta())
            {
                tapTip.setVisibility(8);
                labstopping = decrementButton;
                if (mAmountIndex > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                labstopping.setEnabled(flag);
            } else
            {
                labstopping = decrementButton;
                if (mAmountIndex > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                labstopping.setEnabled(flag);
            }
            labstopping = incrementButton;
            if (mAmountIndex < mTopping.getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            labstopping.setEnabled(flag);
            return;
        } else
        {
            labelLayout.setVisibility(0);
            label.setText(mTopping.getName());
            tapTip.setVisibility(0);
            tapTip.setText(getContext().getString(0x7f0802f3));
            detailLayout.setSelected(false);
            controlLayout.setVisibility(8);
            return;
        }
    }




/*
    static boolean access$002(WholeToppingView wholetoppingview, boolean flag)
    {
        wholetoppingview.mAdded = flag;
        return flag;
    }

*/




/*
    static int access$202(WholeToppingView wholetoppingview, int i)
    {
        wholetoppingview.mAmountIndex = i;
        return i;
    }

*/


    private class _cls1
        implements android.view.View.OnClickListener
    {

        final WholeToppingView this$0;

        public void onClick(View view)
        {
            if (!mAdded)
            {
                mTopping.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                if (mAmountIndex == -1)
                {
                    mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(0.0D));
                }
                if (mClickListener != null)
                {
                    mClickListener.onWholeToppingAdded(mTopping, mAmountIndex, WholeToppingView.this);
                }
            }
        }

        _cls1()
        {
            this$0 = WholeToppingView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final WholeToppingView this$0;
        final boolean val$isReadOnly;

        public void onClick(View view)
        {
            if (!mAdded)
            {
                mTopping.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                if (mAmountIndex == -1)
                {
                    mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(0.0D));
                }
                if (mClickListener != null)
                {
                    mClickListener.onWholeToppingAdded(mTopping, mAmountIndex, WholeToppingView.this);
                }
            } else
            if (!isReadOnly)
            {
                mAdded = false;
                toggleWholeToppingControls(mTopping);
                if (mClickListener != null)
                {
                    mClickListener.onWholeToppingRemoved(mTopping);
                    return;
                }
            }
        }

        _cls2()
        {
            this$0 = WholeToppingView.this;
            isReadOnly = flag;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final WholeToppingView this$0;

        public void onClick(View view)
        {
            decrementAmount();
        }

        _cls3()
        {
            this$0 = WholeToppingView.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final WholeToppingView this$0;

        public void onClick(View view)
        {
            incrementAmount();
        }

        _cls4()
        {
            this$0 = WholeToppingView.this;
            super();
        }
    }


    private class OnWholeToppingClickListener
    {

        public abstract void onWholeToppingAdded(LabsTopping labstopping, int i, WholeToppingView wholetoppingview);

        public abstract void onWholeToppingRemoved(LabsTopping labstopping);

        public abstract void onWholeToppingWeightUpdate(LabsTopping labstopping, int i, WholeToppingView wholetoppingview);
    }

}
