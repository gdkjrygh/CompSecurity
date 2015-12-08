// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager

class this._cls0
    implements adedListener
{

    final InitializationManager this$0;

    public void onDataLoaded(ArrayList arraylist)
    {
        Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded()");
        if (arraylist.size() > 0)
        {
            Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded(): we have data so update it");
            InitializationManager.access$600(InitializationManager.this, arraylist);
            return;
        } else
        {
            Utils.logger("InitializationManager", "checkForLatestRecords.onDataLoaded(): we have NO NEW data so load tours");
            InitializationManager.access$500(InitializationManager.this);
            return;
        }
    }

    adedListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
