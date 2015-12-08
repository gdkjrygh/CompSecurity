// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.adapter;

import com.pinterest.activity.search.model.TypeAheadItem;
import com.pinterest.kit.application.Resources;
import java.util.List;

// Referenced classes of package com.pinterest.activity.board.adapter:
//            BoardCollaboratorInviteAdapter

class val.apiItems
    implements Runnable
{

    final is._cls0 this$1;
    final List val$apiItems;

    public void run()
    {
        if (cess._mth1000(this._cls1.this).equalsIgnoreCase(BoardCollaboratorInviteAdapter.access$900(_fld0)))
        {
            if (val$apiItems.isEmpty())
            {
                TypeAheadItem typeaheaditem = new TypeAheadItem();
                typeaheaditem.setUid("0");
                typeaheaditem.setItemType(com.pinterest.activity.search.model..val.apiItems);
                typeaheaditem.setTitle(Resources.string(0x7f0703a0));
                val$apiItems.add(typeaheaditem);
            }
            BoardCollaboratorInviteAdapter.access$1102(_fld0, val$apiItems);
            BoardCollaboratorInviteAdapter.access$1200(_fld0);
            notifyDataSetChanged();
            setSpinnerState(false);
        }
    }

    ()
    {
        this$1 = final_;
        val$apiItems = List.this;
        super();
    }
}
