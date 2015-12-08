// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.snapchat.android.stories.deeplink;

import com.snapchat.android.Timber;
import com.snapchat.android.controller.stories.StoryLoadingContext;
import com.snapchat.android.model.StoryCollection;
import sX;
import sZ;
import ta;

// Referenced classes of package com.snapchat.android.stories.deeplink:
//            StoriesDeepLinkProcessor

final class b
    implements Runnable
{

    private StoryCollection a;
    private long b;
    private StoriesDeepLinkProcessor c;

    public final void run()
    {
        sZ sz;
label0:
        {
            StoriesDeepLinkProcessor.b(c);
            sz = ta.a(a.i(), a, false, StoriesDeepLinkProcessor.a(c));
            int i = StoriesDeepLinkProcessor.c(c).a(sz, StoriesDeepLinkProcessor.c(c).c(), null, 0, false, StoryLoadingContext.EXTERNAL, b);
            Timber.c("StoriesDeepLinkProcessor", "number of snaps in loading is: %d", new Object[] {
                Integer.valueOf(i)
            });
            if (i == 0)
            {
                if (!sz.l())
                {
                    break label0;
                }
                Timber.c("StoriesDeepLinkProcessor", "Snaps are loading by other tasks", new Object[0]);
                StoriesDeepLinkProcessor.d(c);
                StoriesDeepLinkProcessor.a(c, a.mUsername);
            }
            return;
        }
        if (sz.t_())
        {
            c.a(sz);
            return;
        } else
        {
            c.a(0, a.mUsername, "unknown");
            return;
        }
    }

    (StoriesDeepLinkProcessor storiesdeeplinkprocessor, StoryCollection storycollection, long l)
    {
        c = storiesdeeplinkprocessor;
        a = storycollection;
        b = l;
        super();
    }
}
