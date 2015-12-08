// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.home;

import android.os.Handler;

// Referenced classes of package com.pinterest.activity.home:
//            HomefeedBuilderBaseFragment

class this._cls0
    implements Runnable
{

    final HomefeedBuilderBaseFragment this$0;

    public void run()
    {
        HomefeedBuilderBaseFragment.access$000(HomefeedBuilderBaseFragment.this);
        if (isAdded() && isActive() && _handler != null)
        {
            _handler.postDelayed(this, 30000L);
        }
    }

    ()
    {
        this$0 = HomefeedBuilderBaseFragment.this;
        super();
    }
}
