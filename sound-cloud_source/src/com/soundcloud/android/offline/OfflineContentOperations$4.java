// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.policies.PolicyOperations;
import java.util.Collection;
import rx.b;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentOperations

class this._cls0
    implements f
{

    final OfflineContentOperations this$0;

    public volatile Object call(Object obj)
    {
        return call((Collection)obj);
    }

    public b call(Collection collection)
    {
        if (collection.isEmpty())
        {
            return b.just(null);
        } else
        {
            return OfflineContentOperations.access$000(OfflineContentOperations.this).updatePolicies(collection);
        }
    }

    ()
    {
        this$0 = OfflineContentOperations.this;
        super();
    }
}
