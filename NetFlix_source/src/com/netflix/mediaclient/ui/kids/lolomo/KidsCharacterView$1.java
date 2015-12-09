// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.kids.lolomo;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.Video;
import com.netflix.mediaclient.ui.details.DetailsActivity;

// Referenced classes of package com.netflix.mediaclient.ui.kids.lolomo:
//            KidsCharacterView

class val.video
    implements android.view.
{

    final KidsCharacterView this$0;
    final Video val$video;

    public void onClick(View view)
    {
        DetailsActivity.show((NetflixActivity)getContext(), val$video, KidsCharacterView.access$000(KidsCharacterView.this));
    }

    ()
    {
        this$0 = final_kidscharacterview;
        val$video = Video.this;
        super();
    }
}
