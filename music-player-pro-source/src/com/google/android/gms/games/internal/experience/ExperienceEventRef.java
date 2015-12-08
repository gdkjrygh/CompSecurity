// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.GameRef;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEvent

public final class ExperienceEventRef extends d
    implements ExperienceEvent
{

    private final GameRef acr;

    public ExperienceEventRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        if (aS("external_game_id"))
        {
            acr = null;
            return;
        } else
        {
            acr = new GameRef(JG, KZ);
            return;
        }
    }

    public String getIconImageUrl()
    {
        return getString("icon_url");
    }
}
