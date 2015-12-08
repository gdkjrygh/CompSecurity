// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.skype.android.app.account;

import android.view.View;

// Referenced classes of package com.skype.android.app.account:
//            MyInfoFragment, BuyOnlineNumberDialog

final class this._cls0
    implements android.view.er
{

    final MyInfoFragment this$0;

    public final void onClick(View view)
    {
        (new BuyOnlineNumberDialog()).show(getFragmentManager());
    }

    log()
    {
        this$0 = MyInfoFragment.this;
        super();
    }
}
