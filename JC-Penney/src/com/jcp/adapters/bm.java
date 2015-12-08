// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.adapters;

import android.view.View;
import android.widget.ImageView;
import com.brightcove.player.media.VideoListener;
import com.brightcove.player.model.Video;
import com.jcp.util.ae;
import java.util.Map;

// Referenced classes of package com.jcp.adapters:
//            MultipleVideoItemAdapter

class bm
    implements VideoListener
{

    final String a;
    final MultipleVideoItemAdapter.ViewHolder b;
    final View c;
    final MultipleVideoItemAdapter d;

    bm(MultipleVideoItemAdapter multiplevideoitemadapter, String s, MultipleVideoItemAdapter.ViewHolder viewholder, View view)
    {
        d = multiplevideoitemadapter;
        a = s;
        b = viewholder;
        c = view;
        super();
    }

    public void onError(String s)
    {
        ae.a(MultipleVideoItemAdapter.a(), (new StringBuilder()).append("Video load error:").append(s).toString());
    }

    public void onVideo(Video video)
    {
        MultipleVideoItemAdapter.a(d).put(a, video);
        b.mPlayIcon.setVisibility(0);
        c.setEnabled(true);
        MultipleVideoItemAdapter.a(d, b, MultipleVideoItemAdapter.a(d, video));
        d.notifyDataSetChanged();
    }
}
