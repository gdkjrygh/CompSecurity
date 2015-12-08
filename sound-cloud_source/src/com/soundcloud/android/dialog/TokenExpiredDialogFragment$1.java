// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.dialog;

import android.content.DialogInterface;
import com.soundcloud.android.accounts.LogoutActivity;

// Referenced classes of package com.soundcloud.android.dialog:
//            TokenExpiredDialogFragment

class this._cls0
    implements android.content.er
{

    final TokenExpiredDialogFragment this$0;

    public void onClick(DialogInterface dialoginterface, int i)
    {
        LogoutActivity.start(getActivity());
        dismiss();
    }

    ()
    {
        this$0 = TokenExpiredDialogFragment.this;
        super();
    }
}
