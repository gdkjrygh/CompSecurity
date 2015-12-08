// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import com.pinterest.activity.commerce.view.PriceSliderView;

// Referenced classes of package com.pinterest.activity.commerce:
//            PriceFilterFragment

public class _cls2
{

    public static void inject(butterknife.gment gment, final PriceFilterFragment target, Object obj)
    {
        View view = gment.gment(obj, 0x7f0f0241, "field '_container' and method 'onFrameClicked'");
        target._container = (FrameLayout)view;
        class _cls1 extends DebouncingOnClickListener
        {

            final PriceFilterFragment val$target;

            public final void doClick(View view1)
            {
                target.onFrameClicked();
            }

            _cls1()
            {
                target = pricefilterfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls1());
        view = gment.gment(obj, 0x7f0f02aa, "field '_clearBt' and method 'onClearClicked'");
        target._clearBt = (Button)view;
        class _cls2 extends DebouncingOnClickListener
        {

            final PriceFilterFragment val$target;

            public final void doClick(View view1)
            {
                target.onClearClicked();
            }

            _cls2()
            {
                target = pricefilterfragment;
                super();
            }
        }

        view.setOnClickListener(new _cls2());
        target._closeBt = gment._closeBt(obj, 0x7f0f01db, "field '_closeBt'");
        target._draggerVw = (PriceSliderView)gment.erView(obj, 0x7f0f02ab, "field '_draggerVw'");
    }

    public static void reset(PriceFilterFragment pricefilterfragment)
    {
        pricefilterfragment._container = null;
        pricefilterfragment._clearBt = null;
        pricefilterfragment._closeBt = null;
        pricefilterfragment._draggerVw = null;
    }

    public _cls2()
    {
    }
}
