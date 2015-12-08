// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger.v2.widgets;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import me.lyft.android.domain.payment.Money;

// Referenced classes of package me.lyft.android.ui.passenger.v2.widgets:
//            WidgetContainer

class this._cls0
    implements senter.FixedFareView
{

    final SpannableStringBuilder courierFareTextSpan = new SpannableStringBuilder();
    final WidgetContainer this$0;

    public void setComparisonLabel(Money money, String s)
    {
        money = money.format();
        courierFareTextSpan.clear();
        courierFareTextSpan.append(money);
        courierFareTextSpan.append(' ');
        courierFareTextSpan.append(s);
        courierFareTextSpan.setSpan(new StrikethroughSpan(), 0, money.length(), 33);
        fixedFareComparisonLabel.setText(courierFareTextSpan);
    }

    public void setFarePrice(Money money)
    {
        fixedFarePriceLabel.setText(money.format());
    }

    public void setLoading(boolean flag)
    {
        if (flag)
        {
            fixedFareWidget.setVisibility(4);
            fixedFareProgress.setVisibility(0);
            return;
        } else
        {
            fixedFareWidget.setVisibility(0);
            fixedFareProgress.setVisibility(4);
            return;
        }
    }

    public void showComparisonLabel(boolean flag)
    {
        TextView textview = fixedFareComparisonLabel;
        int i;
        if (flag)
        {
            i = 0;
        } else
        {
            i = 8;
        }
        textview.setVisibility(i);
    }

    senter.FixedFareView()
    {
        this$0 = WidgetContainer.this;
        super();
    }
}
