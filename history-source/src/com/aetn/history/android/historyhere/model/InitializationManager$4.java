// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager, PreferenceManager

class this._cls0
    implements adedListener
{

    final InitializationManager this$0;

    public void onDataLoaded()
    {
        Utils.logger("InitializationManager", "loadDataFromDisk.onDataLoaded()");
        PreferenceManager.setFirstRun(InitializationManager.access$300());
        PreferenceManager.setFullDatabaseRefreshDate(InitializationManager.access$300(), Utils.getDateAsISO8601String());
        PreferenceManager.setLimitedDatabaseUpdateDate(InitializationManager.access$300(), Utils.getDateAsISO8601String());
        InitializationManager.access$500(InitializationManager.this);
    }

    adedListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
