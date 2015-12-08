// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.dialog;

import android.view.View;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.commerce.dialog:
//            CommerceListDialog

class val.event
    implements android.view.log.CommerceListAdapter._cls3
{

    final val.event this$1;
    final Object val$event;

    public void onClick(View view)
    {
        Events.post(val$event);
        dismiss();
    }

    ()
    {
        this$1 = final_;
        val$event = Object.this;
        super();
    }
}
