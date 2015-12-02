// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.broadcast;

import com.facebook.common.time.a;
import com.facebook.orca.compose.ComposeAttachmentContainer;
import com.facebook.orca.photos.picking.i;
import com.facebook.ui.media.attachments.MediaResource;
import com.facebook.ui.media.attachments.d;

// Referenced classes of package com.facebook.orca.broadcast:
//            ComposeBroadcastFragment

class o extends i
{

    final ComposeBroadcastFragment a;

    o(ComposeBroadcastFragment composebroadcastfragment)
    {
        a = composebroadcastfragment;
        super();
    }

    public void a()
    {
    }

    public void a(MediaResource mediaresource)
    {
        if (mediaresource == null)
        {
            return;
        } else
        {
            ComposeBroadcastFragment.c(a).a(ComposeBroadcastFragment.g(a).b(mediaresource), Long.toString(ComposeBroadcastFragment.h(a).a()));
            return;
        }
    }

    public void b()
    {
    }

    public void c()
    {
    }

    public void d()
    {
        ComposeBroadcastFragment.c(a).a();
    }
}
