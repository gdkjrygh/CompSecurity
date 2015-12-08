// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import com.pinterest.base.Device;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.place.fragment:
//            PlacePickerFragment

class this._cls0
    implements Runnable
{

    final PlacePickerFragment this$0;

    public void run()
    {
        PlacePickerFragment.access$000(PlacePickerFragment.this).requestFocusFromTouch();
        Device.showSoftKeyboard(PlacePickerFragment.access$000(PlacePickerFragment.this));
    }

    A()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
