// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.commerce.logic;

import android.widget.Toast;
import com.pinterest.activity.commerce.dialog.CommerceListDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;
import java.util.ArrayList;

// Referenced classes of package com.pinterest.activity.commerce.logic:
//            AddressFormController

class this._cls0
    implements com.pinterest.activity.commerce.ddressItemsFetchedListener
{

    final AddressFormController this$0;

    public void onAddressItemsFetched(ArrayList arraylist)
    {
        Events.post(new DialogEvent(null));
        if (arraylist == null || arraylist.isEmpty())
        {
            Toast.makeText(_context, 0x7f07011d, 0).show();
            return;
        } else
        {
            Events.post(new DialogEvent(CommerceListDialog.newIntanceForContactAddresses(arraylist)));
            return;
        }
    }

    ItemsFetchedListener()
    {
        this$0 = AddressFormController.this;
        super();
    }
}
