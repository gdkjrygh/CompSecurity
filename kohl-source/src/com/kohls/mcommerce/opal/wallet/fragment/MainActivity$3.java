// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.wallet.fragment;

import android.animation.ValueAnimator;
import android.view.View;

// Referenced classes of package com.kohls.mcommerce.opal.wallet.fragment:
//            MainActivity

class val.row
    implements android.animation.nimatorUpdateListener
{

    final MainActivity this$0;
    final int val$row;

    public void onAnimationUpdate(ValueAnimator valueanimator)
    {
        int i = ((Integer)valueanimator.getAnimatedValue()).intValue();
        switch (val$row)
        {
        default:
            return;

        case 1: // '\001'
            valueanimator = MainActivity.access$200(MainActivity.this).findViewById(0x7f0d00a8).getLayoutParams();
            valueanimator.height = i;
            MainActivity.access$300(MainActivity.this).findViewById(0x7f0d00a8).setLayoutParams(valueanimator);
            return;

        case 2: // '\002'
            valueanimator = MainActivity.access$400(MainActivity.this).findViewById(0x7f0d00ab).getLayoutParams();
            valueanimator.height = i;
            MainActivity.access$500(MainActivity.this).findViewById(0x7f0d00ab).setLayoutParams(valueanimator);
            return;

        case 3: // '\003'
            valueanimator = MainActivity.access$600(MainActivity.this).findViewById(0x7f0d00ad).getLayoutParams();
            valueanimator.height = i;
            MainActivity.access$700(MainActivity.this).findViewById(0x7f0d00ad).setLayoutParams(valueanimator);
            return;

        case 4: // '\004'
            valueanimator = MainActivity.access$800(MainActivity.this).findViewById(0x7f0d00af).getLayoutParams();
            break;
        }
        valueanimator.height = i;
        MainActivity.access$900(MainActivity.this).findViewById(0x7f0d00af).setLayoutParams(valueanimator);
    }

    ()
    {
        this$0 = final_mainactivity;
        val$row = I.this;
        super();
    }
}
