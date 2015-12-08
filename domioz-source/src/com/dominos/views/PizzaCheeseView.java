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

public class PizzaCheeseView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    RelativeLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    RadioButton leftPart;
    private boolean mAdded;
    private int mAmountIndex;
    private LabsTopping mCheese;
    private LabsProductLine mProductLine;
    private int mSecondCheeseAmountIndex;
    private OnCheeseClickListener mToppingClickListener;
    RadioGroup partRadioGroup;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    RadioButton rightPart;
    ProductSpinner sauceSpinner;
    ImageButton secondCheeseDecrementButton;
    ImageButton secondCheeseIncrementButton;
    RadioButton secondCheeseLeftPart;
    TextView secondCheeseQuantityLabel;
    RadioButton secondCheeseRightPart;
    RadioButton secondCheeseWholePart;
    TextView sectionViewLabel;
    RelativeLayout selectedLayout;
    RadioGroup selectedPartRadioGroup;
    TextView tapTip;
    RadioButton wholePart;

    public PizzaCheeseView(Context context)
    {
        super(context);
        mAmountIndex = 2;
        mSecondCheeseAmountIndex = -1;
    }

    private String getSelectedBottomPart()
    {
        if (partRadioGroup.getCheckedRadioButtonId() == 0x7f0f0370)
        {
            return "2/2";
        }
        if (partRadioGroup.getCheckedRadioButtonId() == 0x7f0f0372)
        {
            return "1/2";
        } else
        {
            partRadioGroup.getCheckedRadioButtonId();
            return "1/1";
        }
    }

    public void bind(LabsProductLine labsproductline, LabsTopping labstopping, boolean flag, OnCheeseClickListener oncheeseclicklistener)
    {
        mProductLine = labsproductline;
        mCheese = labstopping;
        if (!StringHelper.equals(mCheese.getPartWithQuantity(), "1/1"))
        {
            labsproductline = "1/2";
            mAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(mCheese.getQuantityForPart("1/2")));
            mSecondCheeseAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(mCheese.getQuantityForPart("2/2")));
        } else
        {
            labsproductline = "1/1";
            mAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(mCheese.getQuantityForPart("1/1")));
            mSecondCheeseAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(mCheese.getQuantityForPart("1/1")));
        }
        mToppingClickListener = oncheeseclicklistener;
        secondCheeseLeftPart.setEnabled(false);
        secondCheeseRightPart.setEnabled(false);
        secondCheeseWholePart.setEnabled(false);
        mAdded = flag;
        detailLayout.setBackgroundResource(0x7f020139);
        setSelectedPartForItem(labsproductline, mCheese);
        toggleSplitToppingControls(mCheese);
        labsproductline = new _cls1();
        leftPart.setOnClickListener(labsproductline);
        wholePart.setOnClickListener(labsproductline);
        rightPart.setOnClickListener(labsproductline);
        if (!mCheese.isToppingAdded())
        {
            mAdded = false;
            mCheese.reset();
            toggleSplitToppingControls(mCheese);
            mToppingClickListener.onCheeseToppingRemoved(mCheese);
            mAmountIndex = 0;
            mSecondCheeseAmountIndex = 0;
            setSelectedPartForItem("1/1", mCheese);
            controlLayout.setVisibility(8);
            tapTip.setText(0x7f0802f3);
            tapTip.setBackgroundResource(0);
        }
        decrementButton.setOnClickListener(new _cls2());
        incrementButton.setOnClickListener(new _cls3());
        secondCheeseDecrementButton.setOnClickListener(new _cls4());
        secondCheeseIncrementButton.setOnClickListener(new _cls5());
        setOnClickListener(new _cls6());
        tapTip.setOnClickListener(new _cls7());
    }

    public int decrementAmount(LabsTopping labstopping, int i, String s)
    {
        int j = i - 1;
        i = j;
        if (j < 0)
        {
            i = 0;
        }
        if (mToppingClickListener != null)
        {
            mToppingClickListener.onCheeseToppingWeightUpdate(labstopping, i, s);
        }
        refreshDrawableState();
        return i;
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

    public int incrementAmount(LabsTopping labstopping, int i, String s)
    {
        int k = i + 1;
        int j = k;
        if (k >= labstopping.getOptionAvailability().size())
        {
            j = labstopping.getOptionAvailability().size() - 1;
        }
        String s1 = mProductLine.validateSidesOptionsQuantity();
        if (!s1.equals("VALID_TOPPINGS_QUANTITY_CODE"))
        {
            LogUtil.d(TAG, "POSTING INVALID INCREMENT AMOUNT EVENT.", new Object[0]);
            App.getInstance().bus.post(new com.dominos.bus.events.DialogEvents.ToppingsError(s1));
            return i;
        }
        if (mToppingClickListener != null)
        {
            mToppingClickListener.onCheeseToppingWeightUpdate(labstopping, j, s);
        }
        refreshDrawableState();
        return j;
    }

    public void setSelectedPartForItem(String s, LabsTopping labstopping)
    {
        mProductLine.getToppingsList().remove(labstopping);
        if (!StringHelper.equals(s, "1/1"))
        {
            setSelected(true);
            selectedLayout.setVisibility(0);
            if (s == "1/2")
            {
                labstopping.reset();
                labstopping.setQuantityForPart("1/2", ((Double)labstopping.getOptionAvailability().get(mAmountIndex)).doubleValue());
                if (mSecondCheeseAmountIndex == -1)
                {
                    mSecondCheeseAmountIndex = mAmountIndex;
                }
                labstopping.setQuantityForPart("2/2", ((Double)labstopping.getOptionAvailability().get(mSecondCheeseAmountIndex)).doubleValue());
                secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart("2/2"), resUtils.getOptionToQuantityMap()));
                secondCheeseRightPart.setChecked(true);
            } else
            {
                labstopping.reset();
                if (mSecondCheeseAmountIndex == -1)
                {
                    mSecondCheeseAmountIndex = mAmountIndex;
                }
                labstopping.setQuantityForPart("2/2", ((Double)labstopping.getOptionAvailability().get(mAmountIndex)).doubleValue());
                labstopping.setQuantityForPart("1/2", ((Double)labstopping.getOptionAvailability().get(mSecondCheeseAmountIndex)).doubleValue());
                secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart("1/2"), resUtils.getOptionToQuantityMap()));
                secondCheeseLeftPart.setChecked(true);
            }
        } else
        {
            setSelected(false);
            labstopping.reset();
            labstopping.setQuantityForPart("1/1", ((Double)labstopping.getOptionAvailability().get(mAmountIndex)).doubleValue());
            selectedLayout.setVisibility(8);
        }
        refreshDrawableState();
        if (mToppingClickListener != null)
        {
            mToppingClickListener.onCheeseToppingPartChanged(labstopping);
        }
    }

    void setupFonts()
    {
        FontManager.applyDominosFont(this);
    }

    public void toggleSplitToppingControls(LabsTopping labstopping)
    {
        boolean flag2 = true;
        label.setText(labstopping.getName());
        labelLayout.setVisibility(0);
        controlLayout.setVisibility(0);
        if (labstopping.getQuantityForPart("1/2") > 0.0D)
        {
            leftPart.setChecked(true);
        }
        boolean flag;
        boolean flag1;
        if (labstopping.getQuantityForPart("1/1") > 0.0D)
        {
            detailLayout.setSelected(false);
            selectedLayout.setVisibility(8);
            wholePart.setChecked(true);
            quantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart("1/1"), resUtils.getOptionToQuantityMap()));
            ImageButton imagebutton = decrementButton;
            if (mAmountIndex > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            imagebutton = incrementButton;
            if (mAmountIndex < labstopping.getOptionAvailability().size() - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            flag = true;
        } else
        {
            flag = false;
        }
        if (!flag)
        {
            imagebutton = secondCheeseDecrementButton;
            if (mSecondCheeseAmountIndex > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            imagebutton = secondCheeseIncrementButton;
            if (mSecondCheeseAmountIndex < labstopping.getOptionAvailability().size() - 1)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart("2/2"), resUtils.getOptionToQuantityMap()));
            imagebutton = decrementButton;
            if (mAmountIndex > 0)
            {
                flag1 = true;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            imagebutton = incrementButton;
            if (mAmountIndex < labstopping.getOptionAvailability().size() - 1)
            {
                flag1 = flag2;
            } else
            {
                flag1 = false;
            }
            imagebutton.setEnabled(flag1);
            quantityLabel.setText(LabsTopping.getOptionQuantityName(labstopping.getQuantityForPart("1/2"), resUtils.getOptionToQuantityMap()));
        }
    }





/*
    static int access$102(PizzaCheeseView pizzacheeseview, int i)
    {
        pizzacheeseview.mAmountIndex = i;
        return i;
    }

*/



/*
    static int access$202(PizzaCheeseView pizzacheeseview, int i)
    {
        pizzacheeseview.mSecondCheeseAmountIndex = i;
        return i;
    }

*/




/*
    static boolean access$502(PizzaCheeseView pizzacheeseview, boolean flag)
    {
        pizzacheeseview.mAdded = flag;
        return flag;
    }

*/

    private class _cls1
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            setSelectedPartForItem(getSelectedPart(), mCheese);
        }

        _cls1()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class OnCheeseClickListener
    {

        public abstract void onCheeseToppingAdded(LabsTopping labstopping, int i, PizzaCheeseView pizzacheeseview);

        public abstract void onCheeseToppingPartChanged(LabsTopping labstopping);

        public abstract void onCheeseToppingRemoved(LabsTopping labstopping);

        public abstract void onCheeseToppingWeightUpdate(LabsTopping labstopping, int i, String s);
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            boolean flag1 = true;
            int i = decrementAmount(mCheese, mAmountIndex, getSelectedPart());
            view = decrementButton;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = incrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            if (!mCheese.getOptionAvailability().isEmpty())
            {
                quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mCheese.getOptionAvailability().get(i)).doubleValue(), resUtils.getOptionToQuantityMap()));
            }
            mAmountIndex = i;
        }

        _cls2()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            boolean flag1 = true;
            int i = incrementAmount(mCheese, mAmountIndex, getSelectedPart());
            view = decrementButton;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = incrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = decrementButton;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = incrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            if (!mCheese.getOptionAvailability().isEmpty())
            {
                quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mCheese.getOptionAvailability().get(i)).doubleValue(), resUtils.getOptionToQuantityMap()));
            }
            mAmountIndex = i;
        }

        _cls3()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class _cls4
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            boolean flag1 = true;
            int i = decrementAmount(mCheese, mSecondCheeseAmountIndex, getSelectedBottomPart());
            view = secondCheeseDecrementButton;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = secondCheeseIncrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            if (!mCheese.getOptionAvailability().isEmpty())
            {
                secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mCheese.getOptionAvailability().get(i)).doubleValue(), resUtils.getOptionToQuantityMap()));
            }
            mSecondCheeseAmountIndex = i;
        }

        _cls4()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class _cls5
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            boolean flag1 = true;
            int i = incrementAmount(mCheese, mSecondCheeseAmountIndex, getSelectedBottomPart());
            view = secondCheeseDecrementButton;
            boolean flag;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = secondCheeseIncrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = secondCheeseDecrementButton;
            if (i > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = secondCheeseIncrementButton;
            if (i < mCheese.getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            if (!mCheese.getOptionAvailability().isEmpty())
            {
                secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)mCheese.getOptionAvailability().get(i)).doubleValue(), resUtils.getOptionToQuantityMap()));
            }
            mSecondCheeseAmountIndex = i;
        }

        _cls5()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class _cls6
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            if (!mCheese.isToppingAdded())
            {
                mCheese.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                mToppingClickListener.onCheeseToppingAdded(mCheese, mAmountIndex, PizzaCheeseView.this);
                controlLayout.setVisibility(0);
                setSelectedPartForItem("1/1", mCheese);
                mCheese.setQuantityForPart("1/1", 1.0D);
                toggleSplitToppingControls(mCheese);
                tapTip.setText(0x7f0802f4);
                tapTip.setBackgroundResource(0x7f02018b);
            }
        }

        _cls6()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }


    private class _cls7
        implements android.view.View.OnClickListener
    {

        final PizzaCheeseView this$0;

        public void onClick(View view)
        {
            if (!mCheese.isToppingAdded())
            {
                mCheese.setQuantityForPart("1/1", 1.0D);
                mAmountIndex = mCheese.getOptionAvailability().indexOf(Double.valueOf(1.0D));
                mToppingClickListener.onCheeseToppingAdded(mCheese, mAmountIndex, PizzaCheeseView.this);
                controlLayout.setVisibility(0);
                setSelectedPartForItem("1/1", mCheese);
                mCheese.setQuantityForPart("1/1", 1.0D);
                toggleSplitToppingControls(mCheese);
                tapTip.setText(0x7f0802f4);
                tapTip.setBackgroundResource(0x7f02018b);
                return;
            } else
            {
                mAdded = false;
                mCheese.reset();
                toggleSplitToppingControls(mCheese);
                mToppingClickListener.onCheeseToppingRemoved(mCheese);
                mAmountIndex = 0;
                mSecondCheeseAmountIndex = 0;
                setSelectedPartForItem("1/1", mCheese);
                controlLayout.setVisibility(8);
                tapTip.setText(0x7f0802f3);
                tapTip.setBackgroundResource(0);
                return;
            }
        }

        _cls7()
        {
            this$0 = PizzaCheeseView.this;
            super();
        }
    }

}
