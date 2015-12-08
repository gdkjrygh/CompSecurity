// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.fragment;

import android.os.Handler;
import com.pinterest.api.model.PinPicksFeed;
import com.pinterest.common.async.BackgroundTask;
import com.pinterest.kit.data.DiskCache;

// Referenced classes of package com.pinterest.fragment:
//            PinPicksFragment

class <init> extends BackgroundTask
{

    PinPicksFeed _cachedFeed;
    final PinPicksFragment this$0;

    public void onFinish()
    {
        PinPicksFragment.access$202(PinPicksFragment.this, false);
        _pinPickHandler.onSuccess(_cachedFeed);
        refresh();
    }

    public void run()
    {
        com.pinterest.network.json.PinterestJsonObject pinterestjsonobject = DiskCache.getJsonObject("MY_PINPICKS_FEED");
        if (pinterestjsonobject == null)
        {
            class _cls1
                implements Runnable
            {

                final PinPicksFragment._cls1 this$1;

                public void run()
                {
                    PinPicksFragment.access$000(this$0);
                }

            _cls1()
            {
                this$1 = PinPicksFragment._cls1.this;
                super();
            }
            }

            PinPicksFragment.access$100(PinPicksFragment.this).post(new _cls1());
            return;
        } else
        {
            _cachedFeed = new PinPicksFeed(pinterestjsonobject, null);
            return;
        }
    }

    _cls1()
    {
        this$0 = PinPicksFragment.this;
        super();
    }
}
