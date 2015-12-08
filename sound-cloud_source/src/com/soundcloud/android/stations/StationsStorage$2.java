// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.stations;

import com.soundcloud.android.model.Urn;
import com.soundcloud.propeller.CursorReader;
import rx.b.f;

final class Queues
    implements f
{

    public final Urn call(CursorReader cursorreader)
    {
        return new Urn(cursorreader.getString(com.soundcloud.android.storage.yQueues.TRACK_URN));
    }

    public final volatile Object call(Object obj)
    {
        return call((CursorReader)obj);
    }

    Queues()
    {
    }
}
