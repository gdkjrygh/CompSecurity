// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import android.widget.AbsListView;
import com.pinterest.base.Device;

// Referenced classes of package com.pinterest.activity.place.fragment:
//            PlacePickerFragment

class this._cls0
    implements android.widget.stener
{

    final PlacePickerFragment this$0;

    public void onScroll(AbsListView abslistview, int i, int j, int k)
    {
    }

    public void onScrollStateChanged(AbsListView abslistview, int i)
    {
        if (i == 1 && PlacePickerFragment.access$000(PlacePickerFragment.this) != null)
        {
            Device.hideSoftKeyboard(PlacePickerFragment.access$000(PlacePickerFragment.this));
        }
    }

    A()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
