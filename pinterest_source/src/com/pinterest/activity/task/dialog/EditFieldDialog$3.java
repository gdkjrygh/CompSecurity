// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.view.View;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            EditFieldDialog

class this._cls0
    implements android.view.er
{

    final EditFieldDialog this$0;

    public void onClick(View view)
    {
        dismiss();
        if (EditFieldDialog.access$000(EditFieldDialog.this) != null)
        {
            EditFieldDialog.access$000(EditFieldDialog.this).onNegativeClicked();
        }
    }

    ClickListener()
    {
        this$0 = EditFieldDialog.this;
        super();
    }
}
