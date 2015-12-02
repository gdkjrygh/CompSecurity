// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view.exo;

import com.facebook.common.eventbus.TypedEvent;
import com.facebook.common.eventbus.TypedEventBus;

// Referenced classes of package com.facebook.video.view.exo:
//            VideoServerDataSource

class a
    implements Runnable
{

    final TypedEvent a;
    final VideoServerDataSource b;

    public void run()
    {
        VideoServerDataSource.a(b).a(a);
    }

    _cls9(VideoServerDataSource videoserverdatasource, TypedEvent typedevent)
    {
        b = videoserverdatasource;
        a = typedevent;
        super();
    }
}
