// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package me.lyft.android.analytics.definitions;

import java.util.HashSet;

// Referenced classes of package me.lyft.android.analytics.definitions:
//            LifecycleEvent, Subevent

final class add extends HashSet
{

    (int i)
    {
        super(i);
        add(Subevent.BASE);
        add(Subevent.CLIENT);
        add(Subevent.DEVICE);
        add(Subevent.VENDOR);
        add(Subevent.USER);
        add(Subevent.RIDE);
        add(Subevent.LOCATION);
        add(Subevent.NETWORK);
    }
}
