// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            SkidmarkLoLoMoAdapter

private class this._cls0 extends LoggingManagerCallback
{

    final SkidmarkLoLoMoAdapter this$0;

    public void onCWVideosFetched(List list, int i)
    {
        super.onCWVideosFetched(list, i);
        if (i != 0)
        {
            Log.w("SkidmarkLoLoMoAdapter", "Invalid status code for CW refresh");
            return;
        }
        if (list == null)
        {
            Log.d("SkidmarkLoLoMoAdapter", "CW videos list is null");
            return;
        }
        com.netflix.mediaclient.servicemgr.LoMo lomo = SkidmarkLoLoMoAdapter.access$1200(SkidmarkLoLoMoAdapter.this, LoMoType.CONTINUE_WATCHING);
        if (lomo == null)
        {
            Log.d("SkidmarkLoLoMoAdapter", "CW lomo is now null - aborting refresh operation");
            return;
        }
        if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
        {
            Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" CW videos - adding to existing lomo data").toString());
        }
        List list1 = (List)SkidmarkLoLoMoAdapter.access$500(SkidmarkLoLoMoAdapter.this).get(lomo);
        list1.clear();
        list1.add(SkidmarkLoLoMoAdapter.access$700(SkidmarkLoLoMoAdapter.this));
        list1.addAll(list);
        if (SkidmarkLoLoMoAdapter.access$800(SkidmarkLoLoMoAdapter.this, lomo, list1))
        {
            list1.add(SkidmarkLoLoMoAdapter.access$900(SkidmarkLoLoMoAdapter.this));
        }
        notifyDataSetChanged();
        SkidmarkLoLoMoAdapter.access$1100(SkidmarkLoLoMoAdapter.this, i);
    }

    public ()
    {
        this$0 = SkidmarkLoLoMoAdapter.this;
        super("SkidmarkLoLoMoAdapter");
    }
}
