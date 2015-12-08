// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.events;

import com.soundcloud.android.offline.OfflineState;
import rx.b.f;

// Referenced classes of package com.soundcloud.android.events:
//            CurrentDownloadEvent

final class 
    implements f
{

    public final OfflineState call(CurrentDownloadEvent currentdownloadevent)
    {
        return currentdownloadevent.kind;
    }

    public final volatile Object call(Object obj)
    {
        return call((CurrentDownloadEvent)obj);
    }

    ()
    {
    }
}
