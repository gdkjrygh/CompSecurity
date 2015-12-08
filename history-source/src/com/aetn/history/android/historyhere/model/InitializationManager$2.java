// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager

class this._cls0
    implements com.aetn.history.android.historyhere.nConfigLoadedListener
{

    final InitializationManager this$0;

    public void onConfigLoaded()
    {
        Utils.logger("InitializationManager", "onConfigLoaded: successfully loaded the config");
        InitializationManager.access$200(InitializationManager.this);
    }

    gLoadedListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
