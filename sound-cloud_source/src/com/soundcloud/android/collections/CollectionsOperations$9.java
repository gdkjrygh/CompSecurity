// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsOperations, PlaylistsOptions

class val.options
    implements f
{

    final CollectionsOperations this$0;
    final PlaylistsOptions val$options;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            return CollectionsOperations.access$000(CollectionsOperations.this, val$options);
        } else
        {
            return CollectionsOperations.access$100(CollectionsOperations.this, val$options);
        }
    }

    ()
    {
        this$0 = final_collectionsoperations;
        val$options = PlaylistsOptions.this;
        super();
    }
}
