// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce;

import android.view.View;
import com.pinterest.activity.commerce.dialog.CommerceOptionsDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import com.pinterest.model.commerce.UserCard;

class val.userCard
    implements android.view.Fragment.Adapter._cls5
{

    final val.userCard this$1;
    final UserCard val$userCard;

    public boolean onLongClick(View view)
    {
        Events.post(new DialogEvent(CommerceOptionsDialog.getInstanceForPaymentMethod(val$userCard)));
        return true;
    }

    ()
    {
        this$1 = final_;
        val$userCard = UserCard.this;
        super();
    }
}
