// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import com.pinterest.api.model.Board;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.common.async.BackgroundTask;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            OfflineBoardsSettingsFragment

class this._cls0 extends BackgroundTask
{

    final OfflineBoardsSettingsFragment this$0;

    public void run()
    {
        List list = ModelHelper.getUserBoards(MyUser.getUid());
        for (Iterator iterator = list.iterator(); iterator.hasNext(); ((Board)iterator.next()).setSyncedAt(null)) { }
        ModelHelper.setBoards(list);
    }

    ()
    {
        this$0 = OfflineBoardsSettingsFragment.this;
        super();
    }
}
