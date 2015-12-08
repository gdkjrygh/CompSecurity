// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.ui.enterprise;

import android.view.View;
import android.widget.AdapterView;

// Referenced classes of package me.lyft.android.ui.enterprise:
//            WorkPerksInviteCoworkersViaContactsView

class this._cls0
    implements android.widget.ContactsView._cls3
{

    final WorkPerksInviteCoworkersViaContactsView this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        boolean flag;
        if (!view.isSelected())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        view.setSelected(flag);
        WorkPerksInviteCoworkersViaContactsView.access$400(WorkPerksInviteCoworkersViaContactsView.this, i);
    }

    ()
    {
        this$0 = WorkPerksInviteCoworkersViaContactsView.this;
        super();
    }
}
