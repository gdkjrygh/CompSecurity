// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.details;

import android.widget.Toast;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.service.logging.client.model.ActionOnUIError;
import com.netflix.mediaclient.servicemgr.LoggingManagerCallback;
import com.netflix.mediaclient.servicemgr.VideoDetails;
import com.netflix.mediaclient.ui.common.VideoDetailsProvider;
import com.netflix.mediaclient.util.LogUtils;

// Referenced classes of package com.netflix.mediaclient.ui.details:
//            NetflixRatingBar

private class rating extends LoggingManagerCallback
{

    private final int rating;
    final NetflixRatingBar this$0;

    public void onVideoRatingSet(int i)
    {
        super.onVideoRatingSet(i);
        if (NetflixRatingBar.access$000(NetflixRatingBar.this) == null || NetflixRatingBar.access$000(NetflixRatingBar.this).destroyed())
        {
            Log.v("NetflixRatingBar", "Activity destroyed - ignoring ratings update callback");
            return;
        }
        setEnabled(true);
        if (i != 0)
        {
            Log.w("NetflixRatingBar", "Invalid status code");
            Toast.makeText(getContext(), 0x7f0c0150, 1).show();
            setRating(NetflixRatingBar.access$100(NetflixRatingBar.this));
            return;
        }
        Log.v("NetflixRatingBar", "Rating has been updated");
        Toast.makeText(getContext(), 0x7f0c0151, 1).show();
        NetflixRatingBar.access$102(NetflixRatingBar.this, rating);
        com.netflix.mediaclient.util.lback lback;
        if (NetflixRatingBar.access$200(NetflixRatingBar.this) != null)
        {
            NetflixRatingBar.access$200(NetflixRatingBar.this).setUserRating(rating);
        } else
        {
            Log.e("NetflixRatingBar", "Failed to update rating, details missing!");
        }
        NetflixRatingBar.access$300(NetflixRatingBar.this);
        setRating(NetflixRatingBar.access$100(NetflixRatingBar.this));
        Log.d("NetflixRatingBar", "Report rate action ended");
        lback = new com.netflix.mediaclient.util.lback.this._cls0(i, ActionOnUIError.displayedError, "", null);
        LogUtils.reportRateActionEnded(getContext(), lback.displayedError(), lback.displayedError(), null, Integer.valueOf(NetflixRatingBar.access$100(NetflixRatingBar.this)));
    }

    public (int i)
    {
        this$0 = NetflixRatingBar.this;
        super("NetflixRatingBar");
        rating = i;
    }
}
