// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.worklight.androidgap.plugin;

import com.worklight.androidgap.directupdate.WLDirectUpdateManager;

// Referenced classes of package com.worklight.androidgap.plugin:
//            WLDirectUpdatePlugin

class this._cls0
    implements Runnable
{

    final WLDirectUpdatePlugin this$0;

    public void run()
    {
        WLDirectUpdateManager.getInstance().stop();
    }

    ager()
    {
        this$0 = WLDirectUpdatePlugin.this;
        super();
    }
}
