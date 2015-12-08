// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.sendapin.ui;

import android.view.View;
import com.pinterest.analytics.Pinalytics;
import com.pinterest.schemas.event.ComponentType;
import com.pinterest.schemas.event.ElementType;

// Referenced classes of package com.pinterest.activity.sendapin.ui:
//            AddMessageDialog

class this._cls0
    implements android.view.r
{

    final AddMessageDialog this$0;

    public void onClick(View view)
    {
        Pinalytics.a(ElementType.ADD_MESSAGE_BUTTON, ComponentType.MODAL_DIALOG);
        AddMessageDialog.access$000(AddMessageDialog.this, _messageEt);
    }

    ()
    {
        this$0 = AddMessageDialog.this;
        super();
    }
}
