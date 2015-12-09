// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.experience;

import android.database.CharArrayBuffer;
import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;

// Referenced classes of package com.google.android.gms.games.internal.experience:
//            ExperienceEvent

public final class ExperienceEventRef extends DataBufferRef
    implements ExperienceEvent
{

    private final GameRef mGame;

    public ExperienceEventRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
        if (hasNull("external_game_id"))
        {
            mGame = null;
            return;
        } else
        {
            mGame = new GameRef(mDataHolder, mDataRow);
            return;
        }
    }

    public final long getCreatedTimestamp()
    {
        return getLong("created_timestamp");
    }

    public final String getDisplayDescription()
    {
        return getString("display_description");
    }

    public final void getDisplayDescription(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("display_description", chararraybuffer);
    }

    public final String getDisplayTitle()
    {
        return getString("display_title");
    }

    public final void getDisplayTitle(CharArrayBuffer chararraybuffer)
    {
        copyToBuffer("display_title", chararraybuffer);
    }

    public final String getExperienceId()
    {
        return getString("external_experience_id");
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final Uri getIconImageUri()
    {
        return parseUri("icon_uri");
    }

    public final int getNewLevel()
    {
        return getInteger("newLevel");
    }

    public final int getType()
    {
        return getInteger("type");
    }

    public final long getXpEarned()
    {
        return getLong("xp_earned");
    }
}
