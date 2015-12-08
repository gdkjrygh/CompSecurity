// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.profile;

import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.profile:
//            ProfileUser, UserProfileOperations

class this._cls0
    implements f
{

    final UserProfileOperations this$0;

    public ProfileUser call(PropertySet propertyset)
    {
        return new ProfileUser(propertyset);
    }

    public volatile Object call(Object obj)
    {
        return call((PropertySet)obj);
    }

    ()
    {
        this$0 = UserProfileOperations.this;
        super();
    }
}
