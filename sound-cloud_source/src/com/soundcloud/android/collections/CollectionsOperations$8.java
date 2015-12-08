// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import com.soundcloud.android.events.EntityStateChangedEvent;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        switch (entitystatechangedevent.getKind())
        {
        default:
            return Boolean.valueOf(false);

        case 2: // '\002'
        case 8: // '\b'
            return Boolean.valueOf(true);
        }
    }

    public final volatile Object call(Object obj)
    {
        return call((EntityStateChangedEvent)obj);
    }

    ()
    {
    }
}
