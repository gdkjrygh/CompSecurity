// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.board.dialog;

import android.view.View;
import com.pinterest.activity.task.event.DialogEvent;
import com.pinterest.base.Events;

// Referenced classes of package com.pinterest.activity.board.dialog:
//            BoardEditNameDialog

class this._cls0
    implements android.view..BoardEditNameDialog._cls2
{

    final BoardEditNameDialog this$0;

    public void onClick(View view)
    {
        Events.post(new DialogEvent(BoardEditNameDialog.this));
    }

    ()
    {
        this$0 = BoardEditNameDialog.this;
        super();
    }
}
