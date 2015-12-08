// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import com.pinterest.activity.place.adapter.PlacePickerAdapter;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.place.fragment:
//            PlacePickerFragment

class this._cls0
    implements android.support.v4.app.stPermissionsResultCallback
{

    final PlacePickerFragment this$0;

    public void onRequestPermissionsResult(int i, String as[], int ai[])
    {
        boolean flag1 = false;
        boolean flag = flag1;
        if (ai.length > 0)
        {
            flag = flag1;
            if (ai[0] == 0)
            {
                flag = true;
            }
        }
        PlacePickerFragment.access$100(PlacePickerFragment.this).onLocationPermissionResponse(flag);
        if (flag)
        {
            PlacePickerFragment.access$200(PlacePickerFragment.this).setHint(0x7f0701bc);
            return;
        } else
        {
            PlacePickerFragment.access$200(PlacePickerFragment.this).setHint(0x7f070347);
            return;
        }
    }

    sultCallback()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
