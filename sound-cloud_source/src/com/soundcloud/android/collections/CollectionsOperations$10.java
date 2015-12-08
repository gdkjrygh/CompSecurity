// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.collections;

import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.collections:
//            CollectionsOperations

class this._cls0
    implements f
{

    final CollectionsOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    public b call(Boolean boolean1)
    {
        if (boolean1.booleanValue())
        {
            return CollectionsOperations.access$200(CollectionsOperations.this);
        } else
        {
            return CollectionsOperations.access$300(CollectionsOperations.this);
        }
    }

    A()
    {
        this$0 = CollectionsOperations.this;
        super();
    }
}
