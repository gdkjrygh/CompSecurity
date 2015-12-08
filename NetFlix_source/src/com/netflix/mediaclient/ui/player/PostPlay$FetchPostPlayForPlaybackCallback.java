// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlay, PlayerActivity

private class this._cls0 extends LoggingManagerCallback
{

    final PostPlay this$0;

    public void onPostPlayVideosFetched(List list, int i)
    {
        boolean flag1 = false;
        super.onPostPlayVideosFetched(list, i);
        if (mContext.destroyed())
        {
            return;
        }
        if (i != 0 || list == null)
        {
            Log.w("nf_postplay", "Error loading post play data");
            mPostPlayDataExist = false;
            return;
        }
        if (Log.isLoggable("nf_postplay", 3) && list != null)
        {
            Log.d("nf_postplay", (new StringBuilder()).append("Postplay data retrieved ").append(list.size()).toString());
        }
        mPostPlayVideos = list;
        PostPlay postplay = PostPlay.this;
        boolean flag = flag1;
        if (list != null)
        {
            flag = flag1;
            if (list.size() > 0)
            {
                flag = true;
            }
        }
        postplay.mPostPlayDataExist = flag;
        updateOnPostPlayVideosFetched(list);
    }

    public Q()
    {
        this$0 = PostPlay.this;
        super("nf_postplay");
    }
}
