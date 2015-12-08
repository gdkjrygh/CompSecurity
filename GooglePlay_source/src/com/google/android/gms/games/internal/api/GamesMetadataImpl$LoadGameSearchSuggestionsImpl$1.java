// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.api;

import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;

// Referenced classes of package com.google.android.gms.games.internal.api:
//            GamesMetadataImpl

final class val.status
    implements com.google.android.gms.games.stionsImpl._cls1
{

    final val.status this$0;
    final Status val$status;

    public final Status getStatus()
    {
        return val$status;
    }

    public final GameSearchSuggestionBuffer getSuggestions()
    {
        return new GameSearchSuggestionBuffer(DataHolder.empty(14));
    }

    public final void release()
    {
    }

    a()
    {
        this$0 = final_a;
        val$status = Status.this;
        super();
    }
}
