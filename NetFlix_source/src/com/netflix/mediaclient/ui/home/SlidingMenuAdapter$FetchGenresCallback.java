// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.home;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.home:
//            SlidingMenuAdapter

private class this._cls0 extends LoggingManagerCallback
{

    final SlidingMenuAdapter this$0;

    public void onGenreListsFetched(List list, int i)
    {
        super.onGenreListsFetched(list, i);
        if (i != 0)
        {
            Log.w("SlidingMenuAdapter", "Invalid status code");
            SlidingMenuAdapter.access$300(SlidingMenuAdapter.this);
            return;
        }
        if (list == null)
        {
            Log.v("SlidingMenuAdapter", "No details in response");
            SlidingMenuAdapter.access$300(SlidingMenuAdapter.this);
            return;
        } else
        {
            SlidingMenuAdapter.access$400(SlidingMenuAdapter.this, list);
            return;
        }
    }

    public ()
    {
        this$0 = SlidingMenuAdapter.this;
        super("SlidingMenuAdapter");
    }
}
