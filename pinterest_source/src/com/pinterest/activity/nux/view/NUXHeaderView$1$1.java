// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.nux.view;

import android.view.View;
import com.pinterest.activity.nux.adapter.NUXNextFragmentListener;
import com.pinterest.activity.task.dialog.BaseDialog;

// Referenced classes of package com.pinterest.activity.nux.view:
//            NUXHeaderView

class val.dialog
    implements android.view.er
{

    final iss this$1;
    final BaseDialog val$dialog;

    public void onClick(View view)
    {
        if (_skipListener != null)
        {
            _skipListener.skipFragment();
        }
        val$dialog.dismiss();
    }

    Listener()
    {
        this$1 = final_listener;
        val$dialog = BaseDialog.this;
        super();
    }
}
