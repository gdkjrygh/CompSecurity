// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.dialogs;

import android.view.View;

// Referenced classes of package com.dominos.dialogs:
//            LoginDialogFragment

class this._cls0
    implements android.view.ment._cls8
{

    final LoginDialogFragment this$0;

    public void onClick(View view)
    {
        if (LoginDialogFragment.access$200(LoginDialogFragment.this) != null)
        {
            LoginDialogFragment.access$200(LoginDialogFragment.this).onCanceled();
        }
    }

    ActionListener()
    {
        this$0 = LoginDialogFragment.this;
        super();
    }
}
