// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.signin;

import com.pinterest.base.Application;
import com.pinterest.kit.utils.NetworkUtils;

// Referenced classes of package com.pinterest.activity.signin:
//            TwitterAuthActivity

class this._cls1
    implements Runnable
{

    final sh this$1;

    public void run()
    {
        if (!NetworkUtils.getInstance().hasInternet())
        {
            Application.showToast(0x7f07039b);
        } else
        {
            Application.showToast(0x7f070355);
        }
        finish();
    }

    ()
    {
        this$1 = this._cls1.this;
        super();
    }
}
