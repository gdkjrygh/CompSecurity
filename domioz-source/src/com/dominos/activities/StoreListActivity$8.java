// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.activities;

import android.view.View;
import com.dominos.App;
import com.dominos.android.sdk.app.ApplicationEventBus;
import com.nuance.b.e.c;

// Referenced classes of package com.dominos.activities:
//            StoreListActivity

class this._cls0
    implements android.view.stener
{

    final StoreListActivity this$0;

    public void onFocusChange(View view, boolean flag)
    {
        if (flag && c.i())
        {
            StoreListActivity.access$502(StoreListActivity.this, true);
            App.getInstance().bus.post(new com.dominos.bus.events.aRequest());
        }
    }

    tBus()
    {
        this$0 = StoreListActivity.this;
        super();
    }
}
