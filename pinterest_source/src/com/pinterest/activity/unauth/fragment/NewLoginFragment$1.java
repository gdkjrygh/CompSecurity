// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.unauth.fragment;

import com.pinterest.base.Application;
import com.pinterest.ui.ViewHelper;

// Referenced classes of package com.pinterest.activity.unauth.fragment:
//            NewLoginFragment

class this._cls0
    implements com.pinterest.base.iber
{

    final NewLoginFragment this$0;

    public void onEventMainThread(com.pinterest.base.ent ent)
    {
        ViewHelper.setVisibility(_signupDialog, 4);
        Application.showToast(0x7f07054a);
    }

    ()
    {
        this$0 = NewLoginFragment.this;
        super();
    }
}
