// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.player;

import android.view.View;
import com.netflix.mediaclient.Log;

// Referenced classes of package com.netflix.mediaclient.ui.player:
//            PostPlayForMovies

class val.i
    implements android.view.
{

    final PostPlayForMovies this$0;
    final int val$i;

    public void onClick(View view)
    {
        if (PostPlayForMovies.access$100(PostPlayForMovies.this) != val$i)
        {
            Log.e("nf_postplay", "This should NOT happen. This movie was NOT selected before");
        }
        handlePlayNow(false);
    }

    ()
    {
        this$0 = final_postplayformovies;
        val$i = I.this;
        super();
    }
}
