// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.notifications;

import android.view.View;
import android.widget.LinearLayout;
import com.pinterest.kit.log.PLog;
import com.pinterest.ui.ViewHelper;
import com.pinterest.ui.grid.AdapterEmptyView;
import com.pinterest.ui.megaphone.MegaphoneView;
import com.pinterest.ui.megaphone.NagUtils;

// Referenced classes of package com.pinterest.activity.notifications:
//            NetworkStoryFragment

class this._cls0
    implements com.pinterest.base.
{

    final NetworkStoryFragment this$0;

    public void onEventMainThread(gEvent gevent)
    {
        PLog.info("NetworkStoryFragment.NagEvent", new Object[0]);
        if (NetworkStoryFragment.access$300(NetworkStoryFragment.this) == null)
        {
            NetworkStoryFragment.access$402(NetworkStoryFragment.this, (MegaphoneView)ViewHelper.viewById(getActivity(), 0x7f03017d));
            NetworkStoryFragment.access$600(NetworkStoryFragment.this).setListViewParent(NetworkStoryFragment.access$500(NetworkStoryFragment.this));
        }
        NagUtils.showNagFromEvent(NetworkStoryFragment.this, NetworkStoryFragment.access$700(NetworkStoryFragment.this), gevent);
    }

    public void onEventMainThread(com.pinterest.base.rkStoryFragment._cls2 _pcls2)
    {
        if (_pcls2.etwork() == com.pinterest.base.)
        {
            NetworkStoryFragment.access$800(NetworkStoryFragment.this).setVisibility(0);
            ((LinearLayout)getView().findViewById(0x7f0f0211)).setVisibility(4);
        }
    }

    gEvent()
    {
        this$0 = NetworkStoryFragment.this;
        super();
    }
}
