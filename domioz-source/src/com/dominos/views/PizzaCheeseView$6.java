// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.dominos.android.sdk.core.models.LabsTopping;
import java.util.List;

// Referenced classes of package com.dominos.views:
//            PizzaCheeseView

class this._cls0
    implements android.view.er
{

    final PizzaCheeseView this$0;

    public void onClick(View view)
    {
        if (!PizzaCheeseView.access$000(PizzaCheeseView.this).isToppingAdded())
        {
            PizzaCheeseView.access$000(PizzaCheeseView.this).setQuantityForPart("1/1", 1.0D);
            PizzaCheeseView.access$102(PizzaCheeseView.this, PizzaCheeseView.access$000(PizzaCheeseView.this).getOptionAvailability().indexOf(Double.valueOf(1.0D)));
            PizzaCheeseView.access$400(PizzaCheeseView.this).onCheeseToppingAdded(PizzaCheeseView.access$000(PizzaCheeseView.this), PizzaCheeseView.access$100(PizzaCheeseView.this), PizzaCheeseView.this);
            controlLayout.setVisibility(0);
            setSelectedPartForItem("1/1", PizzaCheeseView.access$000(PizzaCheeseView.this));
            PizzaCheeseView.access$000(PizzaCheeseView.this).setQuantityForPart("1/1", 1.0D);
            toggleSplitToppingControls(PizzaCheeseView.access$000(PizzaCheeseView.this));
            tapTip.setText(0x7f0802f4);
            tapTip.setBackgroundResource(0x7f02018b);
        }
    }

    CheeseClickListener()
    {
        this$0 = PizzaCheeseView.this;
        super();
    }
}
