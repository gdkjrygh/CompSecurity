// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin.dialog;

import android.view.View;
import com.facebook.Session;

// Referenced classes of package com.pinterest.activity.signin.dialog:
//            FBPermissionDialog

class this._cls0
    implements android.view.og.FBPermissionDialog._cls1
{

    final FBPermissionDialog this$0;

    public void onClick(View view)
    {
        view = Session.getActiveSession();
        if (view == null || !view.isOpened())
        {
            return;
        } else
        {
            view.requestNewReadPermissions(new com.facebook.sRequest(getActivity(), view.getDeclinedPermissions()));
            dismiss();
            return;
        }
    }

    ()
    {
        this$0 = FBPermissionDialog.this;
        super();
    }
}
