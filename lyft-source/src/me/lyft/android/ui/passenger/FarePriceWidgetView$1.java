// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.text.SpannableStringBuilder;
import android.text.style.StrikethroughSpan;
import android.widget.TextView;
import me.lyft.android.common.Strings;
import me.lyft.android.domain.payment.Money;
import me.lyft.android.domain.payment.NullMoney;
import me.lyft.android.domain.ride.FixedFare;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            FarePriceWidgetView

class this._cls0
    implements Action1
{

    final FarePriceWidgetView this$0;

    public volatile void call(Object obj)
    {
        call((FixedFare)obj);
    }

    public void call(FixedFare fixedfare)
    {
        Object obj;
label0:
        {
            if (!fixedfare.isNull())
            {
                farePrice.setText(fixedfare.getTotalMoney().format());
                obj = fixedfare.getComparisonMoney();
                fixedfare = fixedfare.getComparisonText();
                if (!NullMoney.isNull(((Money) (obj))) && !Strings.isNullOrEmpty(fixedfare))
                {
                    break label0;
                }
                comparisonLabel.setVisibility(8);
            }
            return;
        }
        comparisonLabel.setVisibility(0);
        obj = ((Money) (obj)).format();
        courierFareText.clear();
        courierFareText.append(((CharSequence) (obj)));
        courierFareText.append(' ');
        courierFareText.append(fixedfare);
        courierFareText.setSpan(new StrikethroughSpan(), 0, ((String) (obj)).length(), 33);
        comparisonLabel.setText(courierFareText);
    }

    ()
    {
        this$0 = FarePriceWidgetView.this;
        super();
    }
}
