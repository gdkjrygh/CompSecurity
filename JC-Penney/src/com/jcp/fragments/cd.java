// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.fragments;

import android.view.View;
import android.widget.Toast;
import com.brightcove.player.event.Event;
import com.brightcove.player.model.Video;
import com.jcp.adapters.bc;

// Referenced classes of package com.jcp.fragments:
//            MultipleVideosGridFragment

class cd extends bc
{

    final MultipleVideosGridFragment a;

    cd(MultipleVideosGridFragment multiplevideosgridfragment)
    {
        a = multiplevideosgridfragment;
        super();
    }

    public void a(Video video, int i, Event event)
    {
        a.mProgressBar.setVisibility(8);
    }

    public void a(String s)
    {
        MultipleVideosGridFragment.a(a);
    }

    public void b(int i, Event event)
    {
        event.preventDefault();
        event.stopPropagation();
        Toast.makeText(a.i(), a.a(0x7f070468), 0).show();
    }
}
