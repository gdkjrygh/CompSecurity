// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.functions.Predicate;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineStatePublisher

class val.currentDownload
    implements Predicate
{

    final OfflineStatePublisher this$0;
    final Urn val$currentDownload;

    public boolean apply(Urn urn)
    {
        return urn != null && !urn.equals(val$currentDownload);
    }

    public volatile boolean apply(Object obj)
    {
        return apply((Urn)obj);
    }

    ()
    {
        this$0 = final_offlinestatepublisher;
        val$currentDownload = Urn.this;
        super();
    }
}
