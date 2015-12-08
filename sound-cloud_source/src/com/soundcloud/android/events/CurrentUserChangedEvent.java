// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.api.legacy.model.PublicApiUser;
import com.soundcloud.java.collections.PropertySet;

public final class CurrentUserChangedEvent
{

    public static final int USER_REMOVED = 1;
    public static final int USER_UPDATED = 0;
    private final PropertySet currentUser;
    private final int kind;

    private CurrentUserChangedEvent(int i, PropertySet propertyset)
    {
        kind = i;
        currentUser = propertyset;
    }

    public static CurrentUserChangedEvent forLogout()
    {
        return new CurrentUserChangedEvent(1, null);
    }

    public static CurrentUserChangedEvent forUserUpdated(PublicApiUser publicapiuser)
    {
        return new CurrentUserChangedEvent(0, publicapiuser.toPropertySet());
    }

    public final PropertySet getCurrentUser()
    {
        return currentUser;
    }

    public final int getKind()
    {
        return kind;
    }
}
