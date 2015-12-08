// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.library.view;

import android.view.View;
import com.pinterest.activity.create.dialog.CreateBoardDialog;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.library.view:
//            LibraryEmptyStateSectionView

class this._cls0
    implements android.view.mptyStateSectionView._cls1
{

    final LibraryEmptyStateSectionView this$0;

    public void onClick(View view)
    {
        Events.post(new DialogEvent(CreateBoardDialog.newInstance(null)));
    }

    ()
    {
        this$0 = LibraryEmptyStateSectionView.this;
        super();
    }
}
