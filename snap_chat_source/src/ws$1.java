// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.view.View;
import com.snapchat.android.controller.MediaOpenOrigin;
import com.snapchat.android.discover.ui.ChannelView;

final class lang.Object
    implements android.view.OnClickListener
{

    private ws a;

    public final void onClick(View view)
    {
        ChannelView channelview = (ChannelView)view;
        int i = -1;
        if (view.getTag(0x7f0d0001) != null)
        {
            i = ((Integer)view.getTag(0x7f0d0001)).intValue();
        }
        a.e.a(channelview, a.f, MediaOpenOrigin.DISCOVER, i);
    }

    >(ws ws1)
    {
        a = ws1;
        super();
    }
}
