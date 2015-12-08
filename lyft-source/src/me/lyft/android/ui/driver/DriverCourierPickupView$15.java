// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.driver;

import android.widget.TextView;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.driver:
//            DriverCourierPickupView

class this._cls0
    implements Action1
{

    final DriverCourierPickupView this$0;

    public void call(Integer integer)
    {
        Integer integer1 = integer;
        if (integer.intValue() == 0)
        {
            integer1 = Integer.valueOf(1);
        }
        confirmPartySizeTextView.setText(String.valueOf(integer1));
        int i;
        if (integer1.intValue() > 1)
        {
            i = 0x7f020193;
        } else
        {
            i = 0x7f020195;
        }
        confirmPartySizeTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, i, 0);
    }

    public volatile void call(Object obj)
    {
        call((Integer)obj);
    }

    ()
    {
        this$0 = DriverCourierPickupView.this;
        super();
    }
}
