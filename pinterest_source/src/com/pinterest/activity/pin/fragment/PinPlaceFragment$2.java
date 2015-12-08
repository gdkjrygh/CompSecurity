// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.ViewTreeObserver;
import com.pinterest.activity.pin.view.PinPlaceInfoView;
import com.pinterest.kit.view.MapViewGroup;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0
    implements android.view.GlobalLayoutListener
{

    final PinPlaceFragment this$0;

    public void onGlobalLayout()
    {
        PinPlaceFragment.access$100(PinPlaceFragment.this).getViewTreeObserver().removeGlobalOnLayoutListener(this);
        PinPlaceFragment.access$100(PinPlaceFragment.this).setVerticalDragRangeAdjustment(PinPlaceFragment.access$200(PinPlaceFragment.this).getTitleHeight());
        PinPlaceFragment.access$300(PinPlaceFragment.this);
        PinPlaceFragment.access$100(PinPlaceFragment.this).setMapShown(true);
    }

    ()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
