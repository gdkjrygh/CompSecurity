// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.activity.create.fragment;

import com.pinterest.activity.create.model.PinnableImageFeed;

// Referenced classes of package com.pinterest.activity.create.fragment:
//            PinMarkletFragment

class val.feed
    implements Runnable
{

    final val.feed this$1;
    final PinnableImageFeed val$feed;

    public void run()
    {
        onSuccess(val$feed);
    }

    ()
    {
        this$1 = final_;
        val$feed = PinnableImageFeed.this;
        super();
    }
}
