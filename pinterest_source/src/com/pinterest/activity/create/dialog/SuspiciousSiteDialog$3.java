// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.dialog;

import android.support.v4.app.FragmentActivity;
import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.activity.create.dialog:
//            SuspiciousSiteDialog

class this._cls0
    implements com.pinterest.activity.task.dialog.tener
{

    final SuspiciousSiteDialog this$0;

    public void onDismiss(BaseDialog basedialog)
    {
        if (getActivity() != null)
        {
            getActivity().finish();
        }
    }

    ner()
    {
        this$0 = SuspiciousSiteDialog.this;
        super();
    }
}
