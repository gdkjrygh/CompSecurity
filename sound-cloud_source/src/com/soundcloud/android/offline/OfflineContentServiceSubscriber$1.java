// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.offline;

import android.content.Context;
import rx.b.a;

// Referenced classes of package com.soundcloud.android.offline:
//            OfflineContentService

final class val.context
    implements a
{

    final Context val$context;

    public final void call()
    {
        OfflineContentService.start(val$context);
    }

    ()
    {
        val$context = context1;
        super();
    }
}
