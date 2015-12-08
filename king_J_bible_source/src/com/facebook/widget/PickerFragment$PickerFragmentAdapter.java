// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.widget;

import android.content.Context;
import android.widget.CheckBox;

// Referenced classes of package com.facebook.widget:
//            GraphObjectAdapter, PickerFragment

abstract class this._cls0 extends GraphObjectAdapter
{

    final PickerFragment this$0;

    boolean isGraphObjectSelected(String s)
    {
        return PickerFragment.access$3(PickerFragment.this).lected(s);
    }

    void updateCheckboxState(CheckBox checkbox, boolean flag)
    {
        checkbox.setChecked(flag);
        int i;
        if (flag || PickerFragment.access$3(PickerFragment.this).ldShowCheckBoxIfUnselected())
        {
            i = 0;
        } else
        {
            i = 8;
        }
        checkbox.setVisibility(i);
    }

    public (Context context)
    {
        this$0 = PickerFragment.this;
        super(context);
    }
}
