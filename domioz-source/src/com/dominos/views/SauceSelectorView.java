// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.content.Context;
import android.widget.ArrayAdapter;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.common.FontManager;
import com.dominos.android.sdk.core.models.LabsProduct;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.a.a.a.l;

// Referenced classes of package com.dominos.views:
//            ProductSpinner

public class SauceSelectorView extends LinearLayout
{

    private static final String TAG = com/dominos/views/SauceSelectorView.getSimpleName();
    private int amountIndex;
    RelativeLayout controlLayout;
    ImageButton decrementButton;
    RelativeLayout detailLayout;
    ImageButton incrementButton;
    TextView label;
    RelativeLayout labelLayout;
    private LabsTopping mCurrentSauce;
    private OnSauceSelectedListener mSauceClickListener;
    RadioGroup partRadioGroup;
    LinearLayout quantityControlLayout;
    TextView quantityLabel;
    ResUtils resUtils;
    private int sauceIndex;
    ProductSpinner sauceSpinner;
    TextView sectionViewLabel;
    TextView tapTip;
    private int timesListenerFired;
    private int userSelectedSauceIndex;

    public SauceSelectorView(Context context)
    {
        super(context);
        sauceIndex = 0;
        userSelectedSauceIndex = -1;
        timesListenerFired = 0;
    }

    private List getSauceList(LabsProductLine labsproductline)
    {
        ArrayList arraylist = new ArrayList();
        if (labsproductline.getAvailableToppingsList() != null)
        {
            Iterator iterator = labsproductline.getAvailableToppingsList().iterator();
            do
            {
                if (!iterator.hasNext())
                {
                    break;
                }
                LabsTopping labstopping = (LabsTopping)iterator.next();
                if (labstopping.isSauce() && (labsproductline.isBuildYourOwnPasta() || !labsproductline.getProduct().isPasta()) && labsproductline.getProduct().getMaxSauceQty() < 2)
                {
                    arraylist.add(labstopping);
                }
            } while (true);
        }
        return arraylist;
    }

    public void bind(final LabsProductLine productLine, final OnSauceSelectedListener noSauce)
    {
        final List sauceList;
        boolean flag;
        boolean flag1;
        flag1 = true;
        mSauceClickListener = noSauce;
        setSectionHeader(getContext().getString(0x7f080436));
        setItemBackground(0x7f020139);
        noSauce = productLine.getToppingsList().iterator();
        do
        {
            if (!noSauce.hasNext())
            {
                break;
            }
            LabsTopping labstopping = (LabsTopping)noSauce.next();
            if (labstopping.isSauce() && labstopping.getQuantityForPart("1/1") > 0.0D)
            {
                mCurrentSauce = labstopping;
            }
        } while (true);
        noSauce = getContext().getString(0x7f08021c);
        final ArrayList sauceNameList = new ArrayList();
        sauceList = getSauceList(productLine);
        if (!productLine.isBuildYourOwnPasta())
        {
            sauceNameList.add(noSauce);
        }
        for (Iterator iterator = sauceList.iterator(); iterator.hasNext(); sauceNameList.add(((LabsTopping)iterator.next()).getName())) { }
        if (mCurrentSauce != null)
        {
            for (int i = 0; i < sauceList.size(); i++)
            {
                if (l.a(((LabsTopping)sauceList.get(i)).getCode(), mCurrentSauce.getCode()))
                {
                    sauceIndex = i;
                    String s = LabsTopping.getOptionQuantityName(mCurrentSauce.getQuantityForPart("1/1"), resUtils.getOptionToQuantityMap());
                    quantityLabel.setText(s);
                    amountIndex = mCurrentSauce.getOptionAvailability().indexOf(Double.valueOf(mCurrentSauce.getQuantityForPart("1/1")));
                }
            }

        } else
        {
            sauceIndex = -1;
        }
        Object obj = new ArrayAdapter(getContext(), 0x1090008, sauceNameList);
        ((ArrayAdapter) (obj)).setDropDownViewResource(0x1090009);
        sauceSpinner.setAdapter(((android.widget.SpinnerAdapter) (obj)));
        obj = sauceSpinner;
        int j;
        if (productLine.isBuildYourOwnPasta())
        {
            if (sauceIndex < 0)
            {
                j = 0;
            } else
            {
                j = sauceIndex;
            }
        } else
        {
            j = sauceIndex + 1;
        }
        ((ProductSpinner) (obj)).setSelection(j);
        sauceSpinner.setOnItemSelectedListener(new _cls1());
        controlLayout.setVisibility(0);
        quantityControlLayout.setVisibility(0);
        if (sauceIndex >= 0 && ((LabsTopping)sauceList.get(sauceIndex)).getOptionAvailability().size() != 1) goto _L2; else goto _L1
_L1:
        decrementButton.setEnabled(false);
        noSauce = incrementButton;
_L6:
        flag = false;
_L4:
        noSauce.setEnabled(flag);
        decrementButton.setOnClickListener(new _cls2());
        incrementButton.setOnClickListener(new _cls3());
        ImageButton imagebutton;
        if (sauceIndex < 0 || sauceIndex >= sauceList.size())
        {
            quantityLabel.setText(LabsTopping.getOptionQuantityName(0.0D, resUtils.getOptionToQuantityMap()));
        } else
        {
            quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)((LabsTopping)sauceList.get(sauceIndex)).getOptionAvailability().get(amountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        }
        setOnClickListener(null);
        return;
_L2:
        noSauce = decrementButton;
        if (amountIndex > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        noSauce.setEnabled(flag);
        imagebutton = incrementButton;
        noSauce = imagebutton;
        flag = flag1;
        if (amountIndex < ((LabsTopping)sauceList.get(sauceIndex)).getOptionAvailability().size() - 1) goto _L4; else goto _L3
_L3:
        noSauce = imagebutton;
        if (true) goto _L6; else goto _L5
_L5:
    }

    public void decrementSauceAmount(LabsProductLine labsproductline)
    {
        boolean flag1;
        flag1 = true;
        amountIndex = amountIndex - 1;
        labsproductline = getSauceList(labsproductline);
        if (amountIndex < 0)
        {
            amountIndex = 0;
        }
        if (sauceIndex < 0 || sauceIndex >= labsproductline.size()) goto _L2; else goto _L1
_L1:
        List list = ((LabsTopping)labsproductline.get(sauceIndex)).getOptionAvailability();
        if (list.size() != 1) goto _L4; else goto _L3
_L3:
        decrementButton.setEnabled(false);
        labsproductline = incrementButton;
_L8:
        boolean flag = false;
_L6:
        labsproductline.setEnabled(flag);
        if (!list.isEmpty())
        {
            quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)list.get(amountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        }
_L2:
        if (mSauceClickListener != null)
        {
            mSauceClickListener.onSauceQuantityUpdate(mCurrentSauce, amountIndex);
        }
        refreshDrawableState();
        return;
_L4:
        labsproductline = decrementButton;
        ImageButton imagebutton;
        if (amountIndex > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        labsproductline.setEnabled(flag);
        imagebutton = incrementButton;
        labsproductline = imagebutton;
        if (amountIndex >= list.size() - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        labsproductline = imagebutton;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void incrementSauceAmount(LabsProductLine labsproductline)
    {
        boolean flag1;
        flag1 = true;
        amountIndex = amountIndex + 1;
        labsproductline = getSauceList(labsproductline);
        if (sauceIndex < 0 || sauceIndex >= labsproductline.size()) goto _L2; else goto _L1
_L1:
        List list;
        list = ((LabsTopping)labsproductline.get(sauceIndex)).getOptionAvailability();
        if (amountIndex >= list.size())
        {
            amountIndex = list.size() - 1;
        }
        if (list.size() != 1) goto _L4; else goto _L3
_L3:
        decrementButton.setEnabled(false);
        labsproductline = incrementButton;
_L8:
        boolean flag = false;
_L6:
        labsproductline.setEnabled(flag);
        if (!list.isEmpty())
        {
            quantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)list.get(amountIndex)).doubleValue(), resUtils.getOptionToQuantityMap()));
        }
_L2:
        if (mSauceClickListener != null)
        {
            mSauceClickListener.onSauceQuantityUpdate(mCurrentSauce, amountIndex);
        }
        refreshDrawableState();
        return;
_L4:
        labsproductline = decrementButton;
        ImageButton imagebutton;
        if (amountIndex > 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        labsproductline.setEnabled(flag);
        imagebutton = incrementButton;
        labsproductline = imagebutton;
        if (amountIndex >= list.size() - 1)
        {
            continue; /* Loop/switch isn't completed */
        }
        labsproductline = imagebutton;
        flag = flag1;
        if (true) goto _L6; else goto _L5
_L5:
        if (true) goto _L8; else goto _L7
_L7:
    }

    public void setItemBackground(int i)
    {
        detailLayout.setBackgroundResource(i);
    }

    public void setSauceIndex(int i)
    {
        sauceIndex = i;
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






/*
    static LabsTopping access$202(SauceSelectorView sauceselectorview, LabsTopping labstopping)
    {
        sauceselectorview.mCurrentSauce = labstopping;
        return labstopping;
    }

*/



/*
    static int access$302(SauceSelectorView sauceselectorview, int i)
    {
        sauceselectorview.userSelectedSauceIndex = i;
        return i;
    }

*/



/*
    static int access$402(SauceSelectorView sauceselectorview, int i)
    {
        sauceselectorview.amountIndex = i;
        return i;
    }

*/


/*
    static int access$508(SauceSelectorView sauceselectorview)
    {
        int i = sauceselectorview.timesListenerFired;
        sauceselectorview.timesListenerFired = i + 1;
        return i;
    }

*/

    private class _cls1
        implements android.widget.AdapterView.OnItemSelectedListener
    {

        final SauceSelectorView this$0;
        final String val$noSauce;
        final LabsProductLine val$productLine;
        final List val$sauceList;
        final List val$sauceNameList;

        public void onItemSelected(AdapterView adapterview, View view, int i, long l1)
        {
            boolean flag1 = true;
            adapterview = controlLayout;
            byte byte0;
            if (((String)sauceNameList.get(i)).equalsIgnoreCase(noSauce))
            {
                byte0 = 8;
            } else
            {
                byte0 = 0;
            }
            adapterview.setVisibility(byte0);
            adapterview = SauceSelectorView.this;
            if (!productLine.isBuildYourOwnPasta())
            {
                i--;
            }
            adapterview.setSauceIndex(i);
            if (sauceIndex < 0 || ((LabsTopping)sauceList.get(sauceIndex)).getOptionAvailability().size() == 1)
            {
                decrementButton.setEnabled(false);
                incrementButton.setEnabled(false);
                if (mSauceClickListener != null)
                {
                    mSauceClickListener.onSauceSelected(mCurrentSauce, null);
                }
            } else
            {
                adapterview = (LabsTopping)sauceList.get(sauceIndex);
                boolean flag;
                if (userSelectedSauceIndex != sauceIndex)
                {
                    view = adapterview.getOptionAvailability();
                    double d;
                    if (adapterview.getQuantityForPart("1/1") != 0.0D)
                    {
                        d = adapterview.getQuantityForPart("1/1");
                    } else
                    {
                        d = adapterview.getDefaultQuantity();
                    }
                    if (d == 0.0D)
                    {
                        if (view.contains(Double.valueOf(1.0D)))
                        {
                            String s = LabsTopping.getOptionQuantityName(1.0D, resUtils.getOptionToQuantityMap());
                            quantityLabel.setText(s);
                            amountIndex = view.indexOf(Double.valueOf(1.0D));
                            adapterview.setQuantityForPart("1/1", 1.0D);
                        } else
                        {
                            String s1 = LabsTopping.getOptionQuantityName(d, resUtils.getOptionToQuantityMap());
                            quantityLabel.setText(s1);
                            amountIndex = view.indexOf(Double.valueOf(d));
                        }
                    } else
                    {
                        String s2 = LabsTopping.getOptionQuantityName(d, resUtils.getOptionToQuantityMap());
                        quantityLabel.setText(s2);
                        amountIndex = view.indexOf(Double.valueOf(d));
                    }
                    userSelectedSauceIndex = sauceIndex;
                }
                view = decrementButton;
                if (amountIndex > 0)
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                view.setEnabled(flag);
                view = incrementButton;
                if (amountIndex < ((LabsTopping)sauceList.get(sauceIndex)).getOptionAvailability().size() - 1)
                {
                    flag = flag1;
                } else
                {
                    flag = false;
                }
                view.setEnabled(flag);
                int i = ((setVisibility) (this)).setVisibility;
                if (userSelectedSauceIndex == -1)
                {
                    userSelectedSauceIndex = sauceIndex;
                }
                adapterview.setQuantityForPart("1/1", ((Double)adapterview.getOptionAvailability().get(amountIndex)).doubleValue());
                if (mSauceClickListener != null)
                {
                    mSauceClickListener.onSauceSelected(mCurrentSauce, adapterview);
                }
                mCurrentSauce = adapterview;
            }
            sauceSpinner.dismiss();
        }

        public void onNothingSelected(AdapterView adapterview)
        {
            if (mSauceClickListener != null)
            {
                mSauceClickListener.onSauceSelected(mCurrentSauce, null);
            }
            controlLayout.setVisibility(8);
        }

        _cls1()
        {
            this$0 = SauceSelectorView.this;
            sauceNameList = list;
            noSauce = s;
            productLine = labsproductline;
            sauceList = list1;
            super();
        }
    }


    private class _cls2
        implements android.view.View.OnClickListener
    {

        final SauceSelectorView this$0;
        final LabsProductLine val$productLine;

        public void onClick(View view)
        {
            decrementSauceAmount(productLine);
        }

        _cls2()
        {
            this$0 = SauceSelectorView.this;
            productLine = labsproductline;
            super();
        }
    }


    private class _cls3
        implements android.view.View.OnClickListener
    {

        final SauceSelectorView this$0;
        final LabsProductLine val$productLine;

        public void onClick(View view)
        {
            incrementSauceAmount(productLine);
        }

        _cls3()
        {
            this$0 = SauceSelectorView.this;
            productLine = labsproductline;
            super();
        }
    }


    private class OnSauceSelectedListener
    {

        public abstract void onSauceQuantityUpdate(LabsTopping labstopping, int i);

        public abstract void onSauceSelected(LabsTopping labstopping, LabsTopping labstopping1);
    }

}
