// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.content.res.Resources;
import android.text.Html;
import android.widget.TextView;
import java.util.concurrent.TimeUnit;
import me.lyft.android.application.IConstantsProvider;
import me.lyft.android.infrastructure.lyft.constants.Constants;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PassengerCourierRideMatchingView, PassengerMatchingBottomView

class this._cls0
    implements Action1
{

    final PassengerCourierRideMatchingView this$0;

    public void call(Integer integer)
    {
        if (integer.intValue() > 0)
        {
            int i = Math.max((int)TimeUnit.SECONDS.toMinutes(integer.intValue()), 1);
            String s = constantsProvider.getConstants().getPlaceholderMatchingScreenHeaderString(getResources().getString(0x7f0702b4));
            s = getResources().getQuantityString(0x7f0f0000, i, new Object[] {
                s, Integer.valueOf(i)
            });
            waitTimeTextView.setText(Html.fromHtml(s));
            contactingDriverBottomView.setWaitTime(integer.intValue());
        }
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = PassengerCourierRideMatchingView.this;
        super();
    }
}
