// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.flashlight;

import android.view.ViewTreeObserver;

// Referenced classes of package com.pinterest.activity.flashlight:
//            BottomSheetLayout

class this._cls0
    implements android.view.reDrawListener
{

    final BottomSheetLayout this$0;

    public boolean onPreDraw()
    {
        getViewTreeObserver().removeOnPreDrawListener(this);
        class _cls1
            implements Runnable
        {

            final BottomSheetLayout._cls6 this$1;

            public void run()
            {
                if (getSheetView() != null)
                {
                    peekSheet();
                }
            }

            _cls1()
            {
                this$1 = BottomSheetLayout._cls6.this;
                super();
            }
        }

        post(new _cls1());
        return true;
    }

    _cls1()
    {
        this$0 = BottomSheetLayout.this;
        super();
    }
}
