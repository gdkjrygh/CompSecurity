// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.view.View;
import android.widget.ToggleButton;
import java.util.Set;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerRateView

class this._cls0
    implements android.view.
{

    final PassengerRateView this$0;

    public void onClick(View view)
    {
        ToggleButton togglebutton = (ToggleButton)view;
        view = (String)view.getTag();
        if (togglebutton.isChecked())
        {
            improvementAreas.add(view);
            return;
        } else
        {
            improvementAreas.remove(view);
            return;
        }
    }

    ()
    {
        this$0 = PassengerRateView.this;
        super();
    }
}
