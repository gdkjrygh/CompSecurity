// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.View;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinSwipeFragment

class this._cls0
    implements android.support.v4.view.ageTransformer
{

    final PinSwipeFragment this$0;

    public void transformPage(View view, float f, boolean flag, int i)
    {
        float f1 = 1.0F;
        if (f >= -1F && f <= 1.0F) goto _L2; else goto _L1
_L1:
        f1 = 0.9F;
_L4:
        view.setScaleX(f1);
        view.setScaleY(f1);
        return;
_L2:
        if (f != 0.0F)
        {
            f1 = 1.0F - Math.abs(f) * 0.1F;
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    er()
    {
        this$0 = PinSwipeFragment.this;
        super();
    }
}
