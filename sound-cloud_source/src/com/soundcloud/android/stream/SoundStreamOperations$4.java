// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stream;

import com.soundcloud.android.facebookinvites.FacebookInvitesItem;
import com.soundcloud.java.optional.Optional;
import java.util.List;
import rx.b.g;

// Referenced classes of package com.soundcloud.android.stream:
//            SoundStreamOperations

class this._cls0
    implements g
{

    final SoundStreamOperations this$0;

    public volatile Object call(Object obj, Object obj1)
    {
        return call((List)obj, (Optional)obj1);
    }

    public List call(List list, Optional optional)
    {
        if (optional.isPresent() && SoundStreamOperations.access$500(SoundStreamOperations.this, list))
        {
            list.add(0, optional.get());
            SoundStreamOperations.access$600(SoundStreamOperations.this, (FacebookInvitesItem)optional.get());
        }
        return list;
    }

    Item()
    {
        this$0 = SoundStreamOperations.this;
        super();
    }
}
