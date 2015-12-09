// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.netflix.mediaclient.ui.lomo;

import android.view.View;
import com.netflix.mediaclient.android.activity.NetflixActivity;
import com.netflix.mediaclient.servicemgr.CWVideo;
import com.netflix.mediaclient.ui.common.PlaybackLauncher;

// Referenced classes of package com.netflix.mediaclient.ui.lomo:
//            CwView

class o
    implements android.view.ickListener
{

    final CwView this$0;
    final CWVideo val$video;

    public void onClick(View view)
    {
        PlaybackLauncher.startPlaybackAfterPIN((NetflixActivity)getContext(), val$video, CwView.access$000(CwView.this));
    }

    o()
    {
        this$0 = final_cwview;
        val$video = CWVideo.this;
        super();
    }
}
