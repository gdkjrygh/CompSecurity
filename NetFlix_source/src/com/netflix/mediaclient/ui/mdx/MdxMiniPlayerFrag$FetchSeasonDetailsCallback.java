// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.SeasonDetails;
import com.netflix.mediaclient.util.ThreadUtils;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxMiniPlayerFrag, MdxMiniPlayerViews

private class this._cls0 extends LoggingManagerCallback
{

    final MdxMiniPlayerFrag this$0;

    public void onSeasonDetailsFetched(SeasonDetails seasondetails, int i)
    {
        super.onSeasonDetailsFetched(seasondetails, i);
        ThreadUtils.assertOnMain();
        if (i != 0)
        {
            return;
        }
        if (seasondetails == null)
        {
            Log.w("MdxMiniPlayerFrag", "Season is null, should NOT happen!");
        }
        this._cls0 _lcls0 = MdxMiniPlayerFrag.access$500();
        boolean flag;
        if (seasondetails != null)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        _lcls0.ched = flag;
        MdxMiniPlayerFrag.access$300(MdxMiniPlayerFrag.this).setControlsEnabled(MdxMiniPlayerFrag.access$500().);
    }

    public Q()
    {
        this$0 = MdxMiniPlayerFrag.this;
        super("MdxMiniPlayerFrag");
    }
}
