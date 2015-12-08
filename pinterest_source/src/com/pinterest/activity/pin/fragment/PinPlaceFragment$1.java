// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.pin.fragment;

import android.view.View;
import com.pinterest.kit.view.MapViewGroup;

// Referenced classes of package com.pinterest.activity.pin.fragment:
//            PinPlaceFragment

class this._cls0
    implements android.view.r
{

    final PinPlaceFragment this$0;

    public void onClick(View view)
    {
        if (PinPlaceFragment.access$000(PinPlaceFragment.this) == com.pinterest.kit.view.te.a)
        {
            PinPlaceFragment.access$100(PinPlaceFragment.this).switchMapState(false);
        }
    }

    ()
    {
        this$0 = PinPlaceFragment.this;
        super();
    }
}
