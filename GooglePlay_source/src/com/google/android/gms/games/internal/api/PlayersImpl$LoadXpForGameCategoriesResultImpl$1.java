// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            PlayersImpl

final class val.status
    implements com.google.android.gms.games.ResultImpl._cls1
{

    final val.status this$0;
    final Status val$status;

    public final List getGameCategories()
    {
        return null;
    }

    public final Status getStatus()
    {
        return val$status;
    }

    public final long getXpForCategory(String s)
    {
        return -1L;
    }

    ()
    {
        this$0 = final_;
        val$status = Status.this;
        super();
    }
}
