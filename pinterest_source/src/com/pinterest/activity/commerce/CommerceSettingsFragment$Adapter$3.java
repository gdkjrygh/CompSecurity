// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.model.commerce.DetailedShipping;

class val.shipping
    implements android.view.Fragment.Adapter._cls3
{

    final val.shipping this$1;
    final DetailedShipping val$shipping;

    public boolean onLongClick(View view)
    {
        Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForShippingAddress(val$shipping)));
        return true;
    }

    ()
    {
        this$1 = final_;
        val$shipping = DetailedShipping.this;
        super();
    }
}
