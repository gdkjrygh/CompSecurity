// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.views;

import android.view.View;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;

// Referenced classes of package com.dominos.views:
//            LoginButton

class this._cls0
    implements android.view.stener
{

    final LoginButton this$0;

    public void onClick(View view)
    {
        App.getInstance().bus.post(new com.dominos.bus.events.topNinaRequest());
        LoginButton.access$000(LoginButton.this);
    }

    icationEventBus()
    {
        this$0 = LoginButton.this;
        super();
    }
}
