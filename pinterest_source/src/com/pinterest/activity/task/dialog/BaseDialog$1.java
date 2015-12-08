// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.task.dialog;

import android.view.View;

// Referenced classes of package com.pinterest.activity.task.dialog:
//            BaseDialog

class this._cls0
    implements android.view.istener
{

    final BaseDialog this$0;

    public void onClick(View view)
    {
        if (BaseDialog.access$000(BaseDialog.this) != null)
        {
            BaseDialog.access$000(BaseDialog.this).onClick(view);
            return;
        } else
        {
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = BaseDialog.this;
        super();
    }
}
