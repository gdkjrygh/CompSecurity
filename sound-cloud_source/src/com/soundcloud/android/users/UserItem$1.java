// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.users;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.users:
//            UserItem

final class Set
    implements f
{

    public final UserItem call(PropertySet propertyset)
    {
        return UserItem.from(propertyset);
    }

    public final volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    Set()
    {
    }
}
