// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.user.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.adapter.InterestListAdapter;

// Referenced classes of package com.pinterest.activity.user.dialog:
//            AddInterestDialog, AddInterestView

class this._cls0
    implements android.widget.ickListener
{

    final AddInterestDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (AddInterestDialog.access$000(AddInterestDialog.this) != null)
        {
            if ((adapterview = AddInterestDialog.access$000(AddInterestDialog.this).getAdapter()) != null && (adapterview = adapterview.getItem(i)) != null)
            {
                AddInterestDialog.access$100(AddInterestDialog.this, adapterview);
                return;
            }
        }
    }

    ()
    {
        this$0 = AddInterestDialog.this;
        super();
    }
}
