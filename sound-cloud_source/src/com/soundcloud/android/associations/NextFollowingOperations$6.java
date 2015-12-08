// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.android.users.UserProperty;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.associations:
//            NextFollowingOperations

class val.following
    implements f
{

    final NextFollowingOperations this$0;
    final boolean val$following;
    final Urn val$targetUrn;

    public PropertySet call(Integer integer)
    {
        return PropertySet.from(new PropertyBinding[] {
            UserProperty.URN.bind(val$targetUrn), UserProperty.FOLLOWERS_COUNT.bind(integer), UserProperty.IS_FOLLOWED_BY_ME.bind(Boolean.valueOf(val$following))
        });
    }

    public volatile Object call(Object obj)
    {
        return call((Integer)obj);
    }

    ()
    {
        this$0 = final_nextfollowingoperations;
        val$targetUrn = urn;
        val$following = Z.this;
        super();
    }
}
