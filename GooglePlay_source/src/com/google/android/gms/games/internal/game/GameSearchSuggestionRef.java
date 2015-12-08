// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameSearchSuggestion

public final class GameSearchSuggestionRef extends DataBufferRef
    implements GameSearchSuggestion
{

    GameSearchSuggestionRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final String getSuggestedTitle()
    {
        return getString("suggestion");
    }
}
