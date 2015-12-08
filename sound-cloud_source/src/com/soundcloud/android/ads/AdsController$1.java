// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.ads;

import com.soundcloud.android.events.PlayQueueEvent;
import rx.b.f;

final class t
    implements f
{

    public final Boolean call(PlayQueueEvent playqueueevent)
    {
        return Boolean.valueOf(playqueueevent.isQueueUpdate());
    }

    public final volatile Object call(Object obj)
    {
        return call((PlayQueueEvent)obj);
    }

    t()
    {
    }
}
