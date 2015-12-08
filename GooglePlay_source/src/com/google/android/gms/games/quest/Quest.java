// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.quest;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.quest:
//            Milestone

public interface Quest
    extends Parcelable, Freezable
{

    public static final int QUEST_STATE_ALL[] = {
        1, 2, 3, 4, 6, 5
    };
    public static final String QUEST_STATE_NON_TERMINAL[] = {
        Integer.toString(1), Integer.toString(2), Integer.toString(3)
    };

    public abstract long getAcceptedTimestamp();

    public abstract Uri getBannerImageUri();

    public abstract String getBannerImageUrl();

    public abstract Milestone getCurrentMilestone();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract long getEndTimestamp();

    public abstract Game getGame();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract long getLastUpdatedTimestamp();

    public abstract List getMilestones();

    public abstract String getName();

    public abstract void getName(CharArrayBuffer chararraybuffer);

    public abstract long getNotifyTimestamp();

    public abstract String getQuestId();

    public abstract long getStartTimestamp();

    public abstract int getState();

    public abstract int getType();

}
