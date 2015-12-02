// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.view;

import com.facebook.common.eventbus.TypedEvent;
import com.facebook.common.eventbus.TypedEventBus;

// Referenced classes of package com.facebook.video.view:
//            VideoServerDashDataSource

class a
    implements Runnable
{

    final TypedEvent a;
    final VideoServerDashDataSource b;

    public void run()
    {
        VideoServerDashDataSource.a(b).a(a);
    }

    _cls9(VideoServerDashDataSource videoserverdashdatasource, TypedEvent typedevent)
    {
        b = videoserverdashdatasource;
        a = typedevent;
        super();
    }
}
