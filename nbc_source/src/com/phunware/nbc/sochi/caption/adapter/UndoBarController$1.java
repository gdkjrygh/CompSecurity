// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.phunware.nbc.sochi.caption.adapter;

import android.view.View;

// Referenced classes of package com.phunware.nbc.sochi.caption.adapter:
//            UndoBarController

class this._cls0
    implements android.view.
{

    final UndoBarController this$0;

    public void onClick(View view)
    {
        hideUndoBar(false);
        UndoBarController.access$100(UndoBarController.this).onUndo(UndoBarController.access$000(UndoBarController.this));
    }

    doListener()
    {
        this$0 = UndoBarController.this;
        super();
    }
}
