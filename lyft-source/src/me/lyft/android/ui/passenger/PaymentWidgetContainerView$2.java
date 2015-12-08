// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.passenger;

import android.graphics.Rect;
import android.view.View;
import java.util.List;
import rx.functions.Action1;

// Referenced classes of package me.lyft.android.ui.passenger:
//            PaymentWidgetContainerView

class this._cls0
    implements Action1
{

    final PaymentWidgetContainerView this$0;

    public volatile void call(Object obj)
    {
        call((List)obj);
    }

    public void call(List list)
    {
        int k = list.size();
        Rect rect = new Rect();
        int j = 0;
        while (j < list.size()) 
        {
            View view;
            int i;
            if (j == 0 && j == k - 1)
            {
                i = 0x7f02001b;
            } else
            if (j == 0)
            {
                i = 0x7f02001d;
            } else
            if (j > 0 && j < k - 1)
            {
                i = 0x7f02001c;
            } else
            {
                i = 0x7f02001e;
            }
            view = (View)list.get(j);
            PaymentWidgetContainerView.access$000(view, rect);
            view.setBackgroundResource(i);
            PaymentWidgetContainerView.access$100(view, rect);
            j++;
        }
    }

    ()
    {
        this$0 = PaymentWidgetContainerView.this;
        super();
    }
}
