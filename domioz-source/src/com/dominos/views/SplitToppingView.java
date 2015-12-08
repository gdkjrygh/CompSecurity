// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.common.LogUtil;
import com.dominos.android.sdk.common.StringHelper;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView, ProductSpinner

public class SplitToppingView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    LinearLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    RadioButton leftPart;
    private boolean mAdded;
    private int mAmountIndex;
    private LabsProductLine mProductLine;
    private LabsTopping mTopping;
    private OnSplitToppingClickListener mToppingClickListener;
    RadioGroup partRadioGroup;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    RadioButton rightPart;
    ProductSpinner sauceSpinner;
    TextView sectionViewLabel;
    TextView tapTip;
    RadioButton wholePart;

    public SplitToppingView(Context context)
    {
        super(context);
    }

    public void bind(LabsTopping labstopping, LabsProductLine labsproductline, boolean flag, boolean flag1, boolean flag2, OnSplitToppingClickListener onsplittoppingclicklistener)
    {
        mProductLine = labsproductline;
        mTopping = labstopping;
        mToppingClickListener = onsplittoppingclicklistener;
        mAdded = flag2;
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
        if (mAdded)
        {
            mAmountIndex = labstopping.getOptionAvailability().indexOf(Double.valueOf(labstopping.getQuantityForPart(labstopping.getPartWithQuantity())));
        }
        toggleSplitToppingControls(labstopping);
        setOnClickListener(new _cls1());
        tapTip.setOnClickListener(new _cls2());
        labstopping = new _cls3();
        leftPart.setOnClickListener(labstopping);
        wholePart.setOnClickListener(labstopping);
        rightPart.setOnClickListener(labstopping);
        decrementButton.setOnClickListener(new _cls4());
        incrementButton.setOnClickListener(new _cls5());
    }

    public void decrementAmount(LabsTopping labstopping)
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
        if (mAmountIndex < labstopping.getOptionAvailability().size() - 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        imagebutton.setEnabled(flag);
        quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)labstopping.getOptionAvailability().get(mAmountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        mTopping.setQuantityForPart(labstopping.getPartWithQuantity(), ((Double)labstopping.getOptionAvailability().get(mAmountIndex)).doubleValue());
        if (mToppingClickListener != null)
        {
            mToppingClickListener.onSplitToppingWeightUpdate(mTopping, mAmountIndex, this, mAmountIndex);
        }
        refreshDrawableState();
    }

    public String getSelectedPart()
    {
        if (partRadioGroup.getCheckedRadioButtonId() == 0x7f0f0370)
        {
            return "1/2";
        }
        if (partRadioGroup.getCheckedRadioButtonId() == 0x7f0f0372)
        {
            return "2/2";
        } else
        {
            partRadioGroup.getCheckedRadioButtonId();
            return "1/1";
        }
    }

    public void incrementAmount()
    {
        int i = mAmountIndex;
        mAmountIndex = mAmountIndex + 1;
        if (mAmountIndex >= mTopping.getOptionAvailability().size())
        {
            mAmountIndex = mTopping.getOptionAvailability().size() - 1;
        }
        quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mTopping.getOptionAvailability().get(mAmountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        if (mToppingClickListener != null)
        {
            mToppingClickListener.onSplitToppingWeightUpdate(mTopping, mAmountIndex, this, i);
        }
        refreshDrawableState();
    }

    public void setSelectedPartForItem(String s, LabsTopping labstopping)
    {
        String s1 = labstopping.getPartWithQuantity();
        double d = labstopping.getQuantityForPart(s1);
        mTopping.reset();
        mTopping.setQuantityForPart(s, d);
        s = mProductLine.validateSidesOptionsQuantity();
        if (!s.equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            mTopping.setQuantityForPart(s1, d);
            toggleSplitToppingControls(mTopping);
            LogUtil.d(TAG, "POSTING iINVALID PART AMOUNT EVENT.", new Object[0]);
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.ToppingsError(s));
        }
    }

    public void setToppingAdded(LabsTopping labstopping, boolean flag)
    {
        mAdded = flag;
        toggleSplitToppingControls(labstopping);
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

    public void toggleSplitToppingControls(LabsTopping labstopping)
    {
        boolean flag1 = true;
        mTopping = labstopping;
        if (labstopping.isToppingAdded())
        {
            labelLayout.setVisibility(0);
            label.setText(labstopping.getName());
            tapTip.setText(getContext().getString(0x7f0802f4));
            tapTip.setBackgroundResource(0x7f02018b);
            detailLayout.setSelected(true);
            controlLayout.setVisibility(0);
            if (StringHelper.equals(labstopping.getPartWithQuantity(), "1/2"))
            {
                leftPart.setChecked(true);
            } else
            if (StringHelper.equals(labstopping.getPartWithQuantity(), "1/1"))
            {
                wholePart.setChecked(true);
            } else
            if (StringHelper.equals(labstopping.getPartWithQuantity(), "2/2"))
            {
                rightPart.setChecked(true);
            }
            quantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart(labstopping.getPartWithQuantity()), resUtils.getOptionToQuantityMap()));
            if (labstopping.getOptionAvailability().size() == 1)
            {
                decrementButton.setEnabled(false);
                incrementButton.setEnabled(false);
            } else
            {
                ImageButton imagebutton = decrementButton;
                boolean flag;
                if (mAmountIndex > 1)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                imagebutton.setEnabled(flag);
                imagebutton = incrementButton;
                if (mAmountIndex < labstopping.getOptionAvailability().size() - 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                imagebutton.setEnabled(flag);
            }
        } else
        {
            label.setText(labstopping.getName());
            tapTip.setText(getContext().getString(0x7f0802f3));
            tapTip.setBackgroundResource(0);
            detailLayout.setSelected(false);
            controlLayout.setVisibility(8);
        }
        refreshDrawableState();
    }





/*
    static int access$102(SplitToppingView splittoppingview, int i)
    {
        splittoppingview.mAmountIndex = i;
        return i;
    }

*/



/*
    static boolean access$302(SplitToppingView splittoppingview, boolean flag)
    {
        splittoppingview.mAdded = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final SplitToppingView this$0;

        public void onClick(View view)
        {
            if (!mTopping.isToppingAdded())
            {
                mTopping.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                if (mToppingClickListener != null)
                {
                    mToppingClickListener.onSplitToppingAdded(mTopping, mAmountIndex, SplitToppingView.this);
                }
            }
        }

        _cls1()
        {
            this$0 = SplitToppingView.this;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SplitToppingView this$0;

        public void onClick(View view)
        {
            if (!mTopping.isToppingAdded())
            {
                mTopping.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mTopping.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                if (mToppingClickListener != null)
                {
                    mToppingClickListener.onSplitToppingAdded(mTopping, mAmountIndex, SplitToppingView.this);
                }
            } else
            {
                mAdded = false;
                toggleSplitToppingControls(mTopping);
                if (mToppingClickListener != null)
                {
                    mToppingClickListener.onSplitToppingRemoved(mTopping, SplitToppingView.this);
                    return;
                }
            }
        }

        _cls2()
        {
            this$0 = SplitToppingView.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final SplitToppingView this$0;

        public void onClick(View view)
        {
            setSelectedPartForItem(getSelectedPart(), mTopping);
            if (mToppingClickListener != null)
            {
                mToppingClickListener.onSplitToppingPartChanged(mTopping);
            }
        }

        _cls3()
        {
            this$0 = SplitToppingView.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final SplitToppingView this$0;

        public void onClick(View view)
        {
            decrementAmount(mTopping);
        }

        _cls4()
        {
            this$0 = SplitToppingView.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final SplitToppingView this$0;

        public void onClick(View view)
        {
            incrementAmount();
        }

        _cls5()
        {
            this$0 = SplitToppingView.this;
            super();
        }
    }


    private class OnSplitToppingClickListener
    {

        public abstract void onSplitToppingAdded(LabsTopping labstopping, int i, SplitToppingView splittoppingview);

        public abstract void onSplitToppingPartChanged(LabsTopping labstopping);

        public abstract void onSplitToppingRemoved(LabsTopping labstopping, SplitToppingView splittoppingview);

        public abstract void onSplitToppingWeightUpdate(LabsTopping labstopping, int i, SplitToppingView splittoppingview, int j);
    }

}
