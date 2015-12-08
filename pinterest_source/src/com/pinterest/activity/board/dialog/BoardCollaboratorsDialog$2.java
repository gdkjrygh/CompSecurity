// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import android.widget.AdapterView;
import com.pinterest.activity.task.model.Location;
import com.pinterest.activity.task.model.Navigation;
import com.pinterest.adapter.PeopleListAdapter;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardCollaboratorsDialog

class this._cls0
    implements android.widget.ener
{

    final BoardCollaboratorsDialog this$0;

    public void onItemClick(AdapterView adapterview, View view, int i, long l)
    {
        if (BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this) != null)
        {
            adapterview = BoardCollaboratorsDialog.access$100(BoardCollaboratorsDialog.this).getItem(i);
            if (adapterview != null)
            {
                Events.post(new Navigation(Location.USER, adapterview));
                dismiss();
            }
        }
    }

    ()
    {
        this$0 = BoardCollaboratorsDialog.this;
        super();
    }
}
