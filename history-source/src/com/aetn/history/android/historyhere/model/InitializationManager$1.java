// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager

class this._cls0
    implements rviceInstalledListener
{

    final InitializationManager this$0;

    public void onFailed()
    {
        Utils.logger("InitializationManager", "init(): OnPlayServiceInstalledListener: onFailed");
        InitializationManager.access$000(InitializationManager.this);
    }

    public void onSuccess()
    {
        Utils.logger("InitializationManager", "init(): OnPlayServiceInstalledListener: onSuccess");
        InitializationManager.access$100(InitializationManager.this);
    }

    rviceInstalledListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
