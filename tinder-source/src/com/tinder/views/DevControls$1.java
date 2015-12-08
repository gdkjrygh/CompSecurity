// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.views;

import android.os.Handler;
import android.widget.BaseAdapter;
import android.widget.ListView;
import com.tinder.managers.ManagerApp;
import java.util.List;

// Referenced classes of package com.tinder.views:
//            DevControls

class this._cls0
    implements Runnable
{

    final DevControls this$0;

    public void run()
    {
        DevControls.access$000(DevControls.this).clear();
        DevControls.access$100(DevControls.this);
        BaseAdapter baseadapter = (BaseAdapter)DevControls.access$200(DevControls.this).getAdapter();
        baseadapter.notifyDataSetChanged();
        baseadapter.notifyDataSetInvalidated();
        if (ManagerApp.f())
        {
            DevControls.access$400(DevControls.this).postDelayed(DevControls.access$300(DevControls.this), 1000L);
        }
    }

    ()
    {
        this$0 = DevControls.this;
        super();
    }
}
