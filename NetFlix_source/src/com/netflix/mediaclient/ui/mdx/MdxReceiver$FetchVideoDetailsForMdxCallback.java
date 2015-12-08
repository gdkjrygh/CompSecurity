// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.mdx;

import android.text.TextUtils;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.PostPlayVideo;
import com.netflix.mediaclient.ui.common.PlayContext;
import com.netflix.mediaclient.ui.player.MDXControllerActivity;
import java.util.List;

// Referenced classes of package com.netflix.mediaclient.ui.mdx:
//            MdxReceiver

private static class mActivity extends LoggingManagerCallback
{

    private final NetflixActivity mActivity;

    public void onPostPlayVideosFetched(List list, int i)
    {
        super.onPostPlayVideosFetched(list, i);
        if (mActivity != null && i == 0 && list.size() > 0)
        {
            list = ((PostPlayVideo)list.get(0)).getId();
            if (!TextUtils.isEmpty(list))
            {
                MDXControllerActivity.showMDXController(mActivity, list, PlayContext.DFLT_MDX_CONTEXT);
            }
        }
    }

    public (String s, NetflixActivity netflixactivity)
    {
        super(s);
        mActivity = netflixactivity;
    }
}
