// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoMo;
import com.netflix.mediaclient.servicemgr.LoMoType;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.LinkedHashMap;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            SkidmarkLoLoMoAdapter

private class lomo extends LoggingManagerCallback
{

    private final LoMo lomo;
    final SkidmarkLoLoMoAdapter this$0;

    private void handleResponse(List list, int i)
    {
        int _tmp = SkidmarkLoLoMoAdapter.access$610(SkidmarkLoLoMoAdapter.this);
        if (i != 0)
        {
            Log.w("SkidmarkLoLoMoAdapter", "Invalid status code");
            notifyDataSetChanged();
        } else
        {
            if (list == null || list.size() <= 0)
            {
                Log.v("SkidmarkLoLoMoAdapter", "No videos in response");
                notifyDataSetChanged();
                return;
            }
            if (Log.isLoggable("SkidmarkLoLoMoAdapter", 2))
            {
                Log.v("SkidmarkLoLoMoAdapter", (new StringBuilder()).append("Got ").append(list.size()).append(" items, callback count: ").append(SkidmarkLoLoMoAdapter.access$600(SkidmarkLoLoMoAdapter.this)).toString());
            }
            List list1 = (List)SkidmarkLoLoMoAdapter.access$500(SkidmarkLoLoMoAdapter.this).get(lomo);
            if (list1.size() == 0)
            {
                list1.add(SkidmarkLoLoMoAdapter.access$700(SkidmarkLoLoMoAdapter.this));
                if (lomo.getType() == LoMoType.CHARACTERS)
                {
                    list1.add(SkidmarkLoLoMoAdapter.access$700(SkidmarkLoLoMoAdapter.this));
                }
            }
            list1.addAll(list);
            if (SkidmarkLoLoMoAdapter.access$800(SkidmarkLoLoMoAdapter.this, lomo, list1))
            {
                list1.add(SkidmarkLoLoMoAdapter.access$900(SkidmarkLoLoMoAdapter.this));
            }
            if (SkidmarkLoLoMoAdapter.access$600(SkidmarkLoLoMoAdapter.this) <= 0)
            {
                SkidmarkLoLoMoAdapter.access$1002(SkidmarkLoLoMoAdapter.this, false);
                SkidmarkLoLoMoAdapter.access$1100(SkidmarkLoLoMoAdapter.this, i);
                notifyDataSetChanged();
                return;
            }
        }
    }

    public void onCWVideosFetched(List list, int i)
    {
        super.onCWVideosFetched(list, i);
        handleResponse(list, i);
    }

    public void onVideosFetched(List list, int i)
    {
        super.onVideosFetched(list, i);
        handleResponse(list, i);
    }

    public (LoMo lomo1)
    {
        this$0 = SkidmarkLoLoMoAdapter.this;
        super("SkidmarkLoLoMoAdapter");
        lomo = lomo1;
    }
}
