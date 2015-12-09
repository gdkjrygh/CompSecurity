// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.wallet.frontinginstrument;

import com.google.android.apps.wallet.base.java.System;
import java.util.concurrent.TimeUnit;

// Referenced classes of package com.google.android.apps.wallet.frontinginstrument:
//            TapAndPayModelPublisher

final class this._cls0
    implements Runnable
{

    final TapAndPayModelPublisher this$0;

    public final void run()
    {
        System _tmp = TapAndPayModelPublisher.access$000(TapAndPayModelPublisher.this);
        if (System.currentTimeMillis() > TapAndPayModelPublisher.access$100(TapAndPayModelPublisher.this) + TapAndPayModelPublisher.access$200().toMillis(5L))
        {
            TapAndPayModelPublisher.access$300(TapAndPayModelPublisher.this);
        }
    }

    Q()
    {
        this$0 = TapAndPayModelPublisher.this;
        super();
    }
}
