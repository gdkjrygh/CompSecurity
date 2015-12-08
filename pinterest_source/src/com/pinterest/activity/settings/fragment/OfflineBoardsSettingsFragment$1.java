// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.settings.fragment;

import com.pinterest.activity.settings.fragment.adapter.OfflineBoardsSettingsAdapter;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.MyUser;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.offline.OfflineDataInfo;
import java.util.List;

// Referenced classes of package com.pinterest.activity.settings.fragment:
//            OfflineBoardsSettingsFragment

class this._cls0 extends BackgroundTask
{

    private List _usersBoards;
    final OfflineBoardsSettingsFragment this$0;

    public void onFinish()
    {
        if (OfflineBoardsSettingsFragment.access$000(OfflineBoardsSettingsFragment.this) != null)
        {
            ((OfflineBoardsSettingsAdapter)OfflineBoardsSettingsFragment.access$100(OfflineBoardsSettingsFragment.this)).setDataSource(_usersBoards);
        }
    }

    public void run()
    {
        _usersBoards = ModelHelper.getUserBoards(MyUser.getUid());
        OfflineDataInfo.g().a(_usersBoards);
    }

    pter()
    {
        this$0 = OfflineBoardsSettingsFragment.this;
        super();
    }
}
