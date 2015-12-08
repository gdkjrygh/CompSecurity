// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.events.EntityStateChangedEvent;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

final class 
    implements f
{

    public final Boolean call(EntityStateChangedEvent entitystatechangedevent)
    {
        boolean flag;
        if (entitystatechangedevent.getKind() == 7 && entitystatechangedevent.isSingularChange() && ((Boolean)entitystatechangedevent.getNextChangeSet().getOrElse(UserProperty.IS_FOLLOWED_BY_ME, Boolean.valueOf(false))).booleanValue())
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
        return call((EntityStateChangedEvent)obj);
    }

    ()
    {
    }
}
