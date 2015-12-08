// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager, PreferenceManager

class this._cls0
    implements datedListener
{

    final InitializationManager this$0;

    public void onDataUpdated()
    {
        Utils.logger("InitializationManager", "loadLimitedData.onDataUpdated(): PHEW! we're done updating!!");
        PreferenceManager.setLimitedDatabaseUpdateDate(InitializationManager.access$300(), Utils.getDateAsISO8601String());
        InitializationManager.access$500(InitializationManager.this);
    }

    datedListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
