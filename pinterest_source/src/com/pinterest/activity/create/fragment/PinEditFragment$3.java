// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import android.view.View;
import com.pinterest.activity.task.dialog.BaseDialog;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.api.model.Pin;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinEditFragment

class val.dialog
    implements android.view.er
{

    final PinEditFragment this$0;
    final BaseDialog val$dialog;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.PIN_DELETE_BUTTON, ComponentType.MODAL_DIALOG, _pin.getUid());
        val$dialog.dismiss();
        PinEditFragment.access$000(PinEditFragment.this);
    }

    ()
    {
        this$0 = final_pineditfragment;
        val$dialog = BaseDialog.this;
        super();
    }
}
