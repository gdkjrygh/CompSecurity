// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsTopping;
import com.dominos.utils.ResUtils;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            PizzaCheeseView

class this._cls0
    implements android.view.er
{

    final PizzaCheeseView this$0;

    public void onClick(View view)
    {
        boolean flag1 = true;
        int i = decrementAmount(PizzaCheeseView.access$000(PizzaCheeseView.this), PizzaCheeseView.access$200(PizzaCheeseView.this), PizzaCheeseView.access$300(PizzaCheeseView.this));
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
        if (i < PizzaCheeseView.access$000(PizzaCheeseView.this).getOptionAvailability().size() - 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        view.setEnabled(flag);
        if (!PizzaCheeseView.access$000(PizzaCheeseView.this).getOptionAvailability().isEmpty())
        {
            secondCheeseQuantityLabel.setText(LabsTopping.getOptionQuantityName(((Double)PizzaCheeseView.access$000(PizzaCheeseView.this).getOptionAvailability().get(i)).doubleValue(), resUtils.getOptionToQuantityMap()));
        }
        PizzaCheeseView.access$202(PizzaCheeseView.this, i);
    }

    LabsTopping()
    {
        this$0 = PizzaCheeseView.this;
        super();
    }
}
