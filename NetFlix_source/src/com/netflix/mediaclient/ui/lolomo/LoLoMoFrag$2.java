// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lolomo;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.lolomo:
//            LoLoMoFrag

class this._cls0
    implements android.widget.ecyclerListener
{

    final LoLoMoFrag this$0;

    public void onMovedToScrapHeap(View view)
    {
        view = (pter.RowHolder)view.getTag();
        if (view == null)
        {
            return;
        } else
        {
            Log.v("LoLoMoFrag", "View moved to scrap heap - invalidating request");
            view.invalidateRequestId();
            return;
        }
    }

    pter.RowHolder()
    {
        this$0 = LoLoMoFrag.this;
        super();
    }
}
