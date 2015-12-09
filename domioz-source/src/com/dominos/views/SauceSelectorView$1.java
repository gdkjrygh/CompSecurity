// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsProductLine;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            SauceSelectorView, ProductSpinner

class val.sauceList
    implements android.widget.lectedListener
{

    final SauceSelectorView this$0;
    final String val$noSauce;
    final LabsProductLine val$productLine;
    final List val$sauceList;
    final List val$sauceNameList;

    public void onItemSelected(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag1 = true;
        adapterview = controlLayout;
        byte byte0;
        if (((String)val$sauceNameList.get(i)).equalsIgnoreCase(val$noSauce))
        {
            byte0 = 8;
        } else
        {
            byte0 = 0;
        }
        adapterview.setVisibility(byte0);
        adapterview = SauceSelectorView.this;
        if (!val$productLine.isBuildYourOwnPasta())
        {
            i--;
        }
        adapterview.setSauceIndex(i);
        if (SauceSelectorView.access$000(SauceSelectorView.this) < 0 || ((LabsTopping)val$sauceList.get(SauceSelectorView.access$000(SauceSelectorView.this))).getOptionAvailability().size() == 1)
        {
            decrementButton.setEnabled(false);
            incrementButton.setEnabled(false);
            if (SauceSelectorView.access$100(SauceSelectorView.this) != null)
            {
                SauceSelectorView.access$100(SauceSelectorView.this).onSauceSelected(SauceSelectorView.access$200(SauceSelectorView.this), null);
            }
        } else
        {
            adapterview = (LabsTopping)val$sauceList.get(SauceSelectorView.access$000(SauceSelectorView.this));
            boolean flag;
            if (SauceSelectorView.access$300(SauceSelectorView.this) != SauceSelectorView.access$000(SauceSelectorView.this))
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
                        SauceSelectorView.access$402(SauceSelectorView.this, view.indexOf(Double.valueOf(1.0D)));
                        adapterview.setQuantityForPart("1/1", 1.0D);
                    } else
                    {
                        String s1 = LabsTopping.getOptionQuantityName(d, resUtils.getOptionToQuantityMap());
                        quantityLabel.setText(s1);
                        SauceSelectorView.access$402(SauceSelectorView.this, view.indexOf(Double.valueOf(d)));
                    }
                } else
                {
                    String s2 = LabsTopping.getOptionQuantityName(d, resUtils.getOptionToQuantityMap());
                    quantityLabel.setText(s2);
                    SauceSelectorView.access$402(SauceSelectorView.this, view.indexOf(Double.valueOf(d)));
                }
                SauceSelectorView.access$302(SauceSelectorView.this, SauceSelectorView.access$000(SauceSelectorView.this));
            }
            view = decrementButton;
            if (SauceSelectorView.access$400(SauceSelectorView.this) > 0)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            view = incrementButton;
            if (SauceSelectorView.access$400(SauceSelectorView.this) < ((LabsTopping)val$sauceList.get(SauceSelectorView.access$000(SauceSelectorView.this))).getOptionAvailability().size() - 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            view.setEnabled(flag);
            int _tmp = SauceSelectorView.access$508(SauceSelectorView.this);
            if (SauceSelectorView.access$300(SauceSelectorView.this) == -1)
            {
                SauceSelectorView.access$302(SauceSelectorView.this, SauceSelectorView.access$000(SauceSelectorView.this));
            }
            adapterview.setQuantityForPart("1/1", ((Double)adapterview.getOptionAvailability().get(SauceSelectorView.access$400(SauceSelectorView.this))).doubleValue());
            if (SauceSelectorView.access$100(SauceSelectorView.this) != null)
            {
                SauceSelectorView.access$100(SauceSelectorView.this).onSauceSelected(SauceSelectorView.access$200(SauceSelectorView.this), adapterview);
            }
            SauceSelectorView.access$202(SauceSelectorView.this, adapterview);
        }
        sauceSpinner.dismiss();
    }

    public void onNothingSelected(AdapterView adapterview)
    {
        if (SauceSelectorView.access$100(SauceSelectorView.this) != null)
        {
            SauceSelectorView.access$100(SauceSelectorView.this).onSauceSelected(SauceSelectorView.access$200(SauceSelectorView.this), null);
        }
        controlLayout.setVisibility(8);
    }

    bsProductLine()
    {
        this$0 = final_sauceselectorview;
        val$sauceNameList = list;
        val$noSauce = s;
        val$productLine = labsproductline;
        val$sauceList = List.this;
        super();
    }
}
