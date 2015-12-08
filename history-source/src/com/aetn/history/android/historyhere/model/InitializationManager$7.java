// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.aetn.history.android.historyhere.model;

import com.aetn.history.android.historyhere.utils.Utils;
import java.util.ArrayList;

// Referenced classes of package com.aetn.history.android.historyhere.model:
//            InitializationManager

class this._cls0
    implements oadedListener
{

    final InitializationManager this$0;

    public void onDataLoadFailed()
    {
        Utils.logger("InitializationManager", "loadAllTours: onDataLoadFailed");
        InitializationManager.access$700(InitializationManager.this);
    }

    public void onDataLoaded(ArrayList arraylist)
    {
        Utils.logger("InitializationManager", "loadAllTours.AllToursDataLoadedListener: onDataLoaded: successfully loaded the tours - we're inited!");
        InitializationManager.access$700(InitializationManager.this);
    }

    oadedListener()
    {
        this$0 = InitializationManager.this;
        super();
    }
}
