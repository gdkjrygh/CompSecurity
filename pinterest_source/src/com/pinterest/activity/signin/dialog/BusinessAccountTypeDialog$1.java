// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            BusinessAccountTypeDialog, BusinessTypeListAdapter

class this._cls0
    implements android.widget.ner
{

    final BusinessAccountTypeDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        adapterview = BusinessAccountTypeDialog.access$000(BusinessAccountTypeDialog.this).getItem(i);
        if (adapterview != null)
        {
            Events.post(new sinessTypeSelected(adapterview));
        }
        dismiss();
    }

    sinessTypeSelected()
    {
        this$0 = BusinessAccountTypeDialog.this;
        super();
    }
}
