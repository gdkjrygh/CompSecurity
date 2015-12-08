// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.associations;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.associations:
//            RepostOperations

class val.addRepost
    implements f
{

    final RepostOperations this$0;
    final boolean val$addRepost;
    final Urn val$soundUrn;

    public PropertySet call(Integer integer)
    {
        return PropertySet.from(new PropertyBinding[] {
            PlayableProperty.URN.bind(val$soundUrn), PlayableProperty.IS_REPOSTED.bind(Boolean.valueOf(val$addRepost)), PlayableProperty.REPOSTS_COUNT.bind(integer)
        });
    }

    public volatile Object call(Object obj)
    {
        return call((Integer)obj);
    }

    ()
    {
        this$0 = final_repostoperations;
        val$soundUrn = urn;
        val$addRepost = Z.this;
        super();
    }
}
