// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.AbstractDataBuffer;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameSearchSuggestionRef, GameSearchSuggestion

public final class GameSearchSuggestionBuffer extends AbstractDataBuffer
{

    public GameSearchSuggestionBuffer(DataHolder dataholder)
    {
        super(dataholder);
    }

    public final GameSearchSuggestion get(int i)
    {
        return new GameSearchSuggestionRef(mDataHolder, i);
    }

    public final volatile Object get(int i)
    {
        return get(i);
    }
}
