// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import com.soundcloud.android.rx.observers.DefaultSubscriber;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService

final class OfflineContentServiceSubscriber extends DefaultSubscriber
{

    private final Context context;

    public OfflineContentServiceSubscriber(Context context1)
    {
        context = context1;
    }

    public static a startServiceAction(final Context context)
    {
        return new _cls1();
    }

    public final void onNext(Object obj)
    {
        OfflineContentService.start(context);
    }

    private class _cls1
        implements a
    {

        final Context val$context;

        public final void call()
        {
            OfflineContentService.start(context);
        }

        _cls1()
        {
            context = context1;
            super();
        }
    }

}
