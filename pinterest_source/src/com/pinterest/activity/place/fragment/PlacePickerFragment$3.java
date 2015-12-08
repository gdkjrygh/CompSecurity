// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.place.fragment;

import android.text.Editable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import com.pinterest.activity.place.adapter.PlacePickerAdapter;
import com.pinterest.api.model.Place;
import com.pinterest.base.Device;
import com.pinterest.ui.text.SearchEditText;

// Referenced classes of package com.pinterest.activity.place.fragment:
//            PlacePickerFragment

class this._cls0
    implements android.widget.kListener
{

    final PlacePickerFragment this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
label0:
        {
label1:
            {
                adapterview = (Place)PlacePickerFragment.access$100(PlacePickerFragment.this).getItem(i);
                if (adapterview != null && adapterview.getUid() != null)
                {
                    if (!PlacePickerFragment.access$100(PlacePickerFragment.this).isShowingLocations())
                    {
                        break label0;
                    }
                    PlacePickerFragment.access$200(PlacePickerFragment.this).setText(adapterview.getName());
                    PlacePickerFragment.access$000(PlacePickerFragment.this).requestFocus();
                    Device.showSoftKeyboard(PlacePickerFragment.access$000(PlacePickerFragment.this));
                    if (PlacePickerFragment.access$000(PlacePickerFragment.this).getText().length() <= 0)
                    {
                        break label1;
                    }
                    PlacePickerFragment.access$100(PlacePickerFragment.this).onSearchQueryChanged(PlacePickerFragment.access$000(PlacePickerFragment.this).getText().toString());
                }
                return;
            }
            PlacePickerFragment.access$300(PlacePickerFragment.this).setVisibility(0);
            return;
        }
        PlacePickerFragment.access$400(PlacePickerFragment.this, adapterview);
    }

    A()
    {
        this$0 = PlacePickerFragment.this;
        super();
    }
}
