// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.sync;

import rx.b.f;

// Referenced classes of package com.soundcloud.android.sync:
//            SyncResult

final class 
    implements f
{

    public final SyncResult call(Boolean boolean1)
    {
        return SyncResult.success("syncPlaylist", boolean1.booleanValue());
    }

    public final volatile Object call(Object obj)
    {
        return call((Boolean)obj);
    }

    ()
    {
    }
}
