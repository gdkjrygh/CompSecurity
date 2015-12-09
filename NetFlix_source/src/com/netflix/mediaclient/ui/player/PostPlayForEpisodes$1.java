// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.os.Handler;
import android.widget.TextView;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForEpisodes, PlayerActivity

class this._cls0
    implements Runnable
{

    final PostPlayForEpisodes this$0;

    public void run()
    {
        if (!mInPostPlay || mContext.destroyed())
        {
            Log.d("nf_postplay", "post play timer exit or activity is destroyed");
            return;
        }
        int _tmp = PostPlayForEpisodes.access$010(PostPlayForEpisodes.this);
        if (mTimerView != null)
        {
            mTimerView.setText(String.valueOf(PostPlayForEpisodes.access$000(PostPlayForEpisodes.this)));
        }
        if (PostPlayForEpisodes.access$000(PostPlayForEpisodes.this) <= 0)
        {
            Log.d("nf_postplay", "Timer counter to 0, play next episode");
            onTimerEnd();
            return;
        } else
        {
            mContext.getHandler().postDelayed(this, 1000L);
            return;
        }
    }

    ()
    {
        this$0 = PostPlayForEpisodes.this;
        super();
    }
}
