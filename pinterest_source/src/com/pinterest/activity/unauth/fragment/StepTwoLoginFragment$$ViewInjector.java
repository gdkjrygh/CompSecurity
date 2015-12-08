// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import android.view.View;
import com.pinterest.ui.text.PEditText;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            StepTwoLoginFragment

public class _cls2
{

    public static void inject(butterknife.oginFragment oginfragment, final StepTwoLoginFragment target, Object obj)
    {
        target._passwordEt = (PEditText)oginfragment._passwordEt(obj, 0x7f0f0175, "field '_passwordEt'");
        class _cls1 extends DebouncingOnClickListener
        {

            final StepTwoLoginFragment val$target;

            public final void doClick(View view)
            {
                target.onButtonClick(view);
            }

            _cls1()
            {
                target = steptwologinfragment;
                super();
            }
        }

        oginfragment.oginFragment(obj, 0x7f0f0177, "method 'onButtonClick'").setOnClickListener(new _cls1());
        class _cls2 extends DebouncingOnClickListener
        {

            final StepTwoLoginFragment val$target;

            public final void doClick(View view)
            {
                target.onButtonClick(view);
            }

            _cls2()
            {
                target = steptwologinfragment;
                super();
            }
        }

        oginfragment.oginFragment(obj, 0x7f0f0176, "method 'onButtonClick'").setOnClickListener(new _cls2());
    }

    public static void reset(StepTwoLoginFragment steptwologinfragment)
    {
        steptwologinfragment._passwordEt = null;
    }

    public _cls2()
    {
    }
}
