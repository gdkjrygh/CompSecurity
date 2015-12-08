// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.service;

import android.content.Context;
import com.google.android.gms.games.internal.events.EventIncrementCache;

// Referenced classes of package com.google.android.gms.games.service:
//            PlayGamesServiceBroker, PlayGamesAsyncService

private final class this._cls0 extends EventIncrementCache
{

    final this._cls0 this$0;

    protected final void doIncrementEvent(String s, int i)
    {
        PlayGamesAsyncService.incrementEvents(this._mth0(this._cls0.this), s, i);
    }

    public ()
    {
        this$0 = this._cls0.this;
        super(this._mth0(this._cls0.this).getMainLooper(), 5000);
    }
}
