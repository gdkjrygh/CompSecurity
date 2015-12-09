// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.internal.game.GameSearchSuggestionBuffer;

// Referenced classes of package com.google.android.gms.games.internal:
//            GamesClientImpl

private static final class mBuffer extends mBuffer
    implements com.google.android.gms.games.sultImpl
{

    private final GameSearchSuggestionBuffer mBuffer;

    public final GameSearchSuggestionBuffer getSuggestions()
    {
        return mBuffer;
    }

    (DataHolder dataholder)
    {
        super(dataholder);
        mBuffer = new GameSearchSuggestionBuffer(dataholder);
    }
}
