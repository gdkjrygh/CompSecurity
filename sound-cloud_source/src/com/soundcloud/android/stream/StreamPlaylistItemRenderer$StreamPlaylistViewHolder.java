// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import a.a;
import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.soundcloud.android.stream:
//            StreamItemViewHolder, StreamPlaylistItemRenderer

static class tracksView extends StreamItemViewHolder
{

    private final TextView trackCount;
    private final TextView tracksView;

    public void setTrackCount(String s, String s1)
    {
        trackCount.setText(s);
        tracksView.setText(s1);
    }

    public (View view)
    {
        super(view);
        trackCount = (TextView)a.a(view, 0x7f0f025d);
        tracksView = (TextView)a.a(view, 0x7f0f025e);
    }
}
