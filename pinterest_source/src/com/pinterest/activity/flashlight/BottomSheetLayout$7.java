// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.View;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout

class this._cls0
    implements android.view.istener
{

    final BottomSheetLayout this$0;

    public void onLayoutChange(View view, int i, int j, int k, int l, int i1, int j1, 
            int k1, int l1)
    {
        i = view.getMeasuredHeight();
        if (BottomSheetLayout.access$500(BottomSheetLayout.this) != ate.HIDDEN && i < BottomSheetLayout.access$600(BottomSheetLayout.this))
        {
            if (BottomSheetLayout.access$500(BottomSheetLayout.this) == ate.EXPANDED)
            {
                BottomSheetLayout.access$700(BottomSheetLayout.this, ate.PEEKED);
            }
            setSheetTranslation(i);
        }
        BottomSheetLayout.access$602(BottomSheetLayout.this, i);
    }

    ate()
    {
        this$0 = BottomSheetLayout.this;
        super();
    }
}
