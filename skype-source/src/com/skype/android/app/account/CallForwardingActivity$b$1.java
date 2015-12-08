// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.os.Bundle;
import android.view.View;

// Referenced classes of package com.skype.android.app.account:
//            CallForwardingActivity, DeleteCallForwardingNumberDialog

final class val.number
    implements android.view.dingActivity.b._cls1
{

    final upportFragmentManager this$1;
    final com.skype.android.util.ty.b val$number;

    public final void onClick(View view)
    {
        view = new DeleteCallForwardingNumberDialog();
        Bundle bundle = new Bundle();
        bundle.putString("phone_num", val$number.number);
        view.setArguments(bundle);
        view.show(getSupportFragmentManager());
    }

    ialog()
    {
        this$1 = final_ialog;
        val$number = com.skype.android.util.ty.b._cls1.val.number.this;
        super();
    }
}
