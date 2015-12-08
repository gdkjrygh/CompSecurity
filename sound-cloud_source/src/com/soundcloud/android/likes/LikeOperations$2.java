// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.likes;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.likes:
//            LikeOperations

class val.addLike
    implements f
{

    final LikeOperations this$0;
    final boolean val$addLike;
    final Urn val$targetUrn;

    public PropertySet call(Integer integer)
    {
        return PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(val$targetUrn), PlayableProperty.LIKES_COUNT.bind(integer), PlayableProperty.IS_LIKED.bind(Boolean.valueOf(val$addLike))
        });
    }

    public volatile Object call(Object obj)
    {
        return call((Integer)obj);
    }

    g()
    {
        this$0 = final_likeoperations;
        val$targetUrn = urn;
        val$addLike = Z.this;
        super();
    }
}
