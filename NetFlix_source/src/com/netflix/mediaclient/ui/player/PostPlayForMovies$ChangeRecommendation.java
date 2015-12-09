// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.MotionEvent;
import android.view.View;
import com.netflix.mediaclient.Log;
import com.netflix.mediaclient.servicemgr.PostPlayVideo;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForMovies

private class <init>
    implements android.view.ChangeRecommendation
{

    private int selection;
    final PostPlayForMovies this$0;

    public boolean onTouch(View view, MotionEvent motionevent)
    {
        if (Log.isLoggable("nf_postplay", 3))
        {
            Log.d("nf_postplay", (new StringBuilder()).append("BoxArt touched: ").append(selection).toString());
        }
        if (PostPlayForMovies.access$200(PostPlayForMovies.this).getAndSet(false))
        {
            Log.d("nf_postplay", "Video was full size, scale down");
            PostPlayForMovies.access$300(PostPlayForMovies.this);
        }
        if (mPostPlayVideos.size() > selection)
        {
            PostPlayForMovies.access$102(PostPlayForMovies.this, selection);
            PostPlayForMovies.access$400(PostPlayForMovies.this, (PostPlayVideo)mPostPlayVideos.get(selection), selection);
            return true;
        } else
        {
            Log.e("nf_postplay", (new StringBuilder()).append("PostPlay not found for index ").append(selection).toString());
            return false;
        }
    }

    private (int i)
    {
        this$0 = PostPlayForMovies.this;
        super();
        selection = i;
    }

    selection(int i, selection selection1)
    {
        this(i);
    }
}
