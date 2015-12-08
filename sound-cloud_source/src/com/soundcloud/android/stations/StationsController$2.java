// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.events.CurrentUserChangedEvent;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(CurrentUserChangedEvent currentuserchangedevent)
    {
        boolean flag;
        if (currentuserchangedevent.getKind() == 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        return Boolean.valueOf(flag);
    }

    public final volatile Object call(Object obj)
    {
        return call((CurrentUserChangedEvent)obj);
    }

    ()
    {
    }
}
