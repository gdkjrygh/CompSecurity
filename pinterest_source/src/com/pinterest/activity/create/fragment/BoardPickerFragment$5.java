// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.fragment.view.CreateBoardListHeaderEdit;
import com.pinterest.activity.task.dialog.EditPinDescriptionDialog;
import com.pinterest.api.model.Pin;
import com.pinterest.base.Application;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            BoardPickerFragment

class tener extends com.pinterest.activity.task.dialog.kListener
{

    final BoardPickerFragment this$0;
    final EditPinDescriptionDialog val$dialog;

    public void onNegativeClicked()
    {
        val$dialog.dismiss();
    }

    public void onPositiveClicked(String s, boolean flag)
    {
        if (s == null)
        {
            Application.showToast(0x7f070195);
            return;
        }
        if (flag)
        {
            Pin pin = new Pin();
            pin.setUid((new StringBuilder()).append(_pin.getUid()).append("-repin").toString());
            pin.setDescription(s);
            Events.post(new com.pinterest.api.model.ckerFragment._pin(pin));
            _fastRepinEdit.setDescriptionText(pin.getDescription());
            _fastRepinEdit.requestFocus();
        }
        val$dialog.dismiss();
    }

    aderEdit()
    {
        this$0 = final_boardpickerfragment;
        val$dialog = EditPinDescriptionDialog.this;
        super();
    }
}
