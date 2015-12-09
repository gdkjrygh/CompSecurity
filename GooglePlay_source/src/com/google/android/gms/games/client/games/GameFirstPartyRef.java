// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.client.games;

import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameRef;
import com.google.android.gms.games.internal.game.GameBadgeRef;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import com.google.android.gms.games.snapshot.SnapshotMetadataRef;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.google.android.gms.games.client.games:
//            GameFirstParty, GameFirstPartyEntity

public class GameFirstPartyRef extends DataBufferRef
    implements GameFirstParty
{

    private final GameRef mGame;
    private final int mNumChildren;
    private final SnapshotMetadataRef mSnapshot;

    GameFirstPartyRef(DataHolder dataholder, int i, int j)
    {
        super(dataholder, i);
        mGame = new GameRef(dataholder, i);
        mNumChildren = j;
        if (hasColumn("external_snapshot_id") && !hasNull("external_snapshot_id"))
        {
            mSnapshot = new SnapshotMetadataRef(dataholder, i);
            return;
        } else
        {
            mSnapshot = null;
            return;
        }
    }

    private GameFirstParty freeze()
    {
        return new GameFirstPartyEntity(this);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return GameFirstPartyEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final int getAchievementUnlockedCount()
    {
        return getInteger("achievement_unlocked_count");
    }

    public final int getAvailability()
    {
        return getInteger("availability");
    }

    public final ArrayList getBadges()
    {
        if (mDataHolder.getString("badge_title", mDataRow, mDataHolder.getWindowIndex(mDataRow)) != null) goto _L2; else goto _L1
_L1:
        ArrayList arraylist = new ArrayList(0);
_L4:
        return arraylist;
_L2:
        ArrayList arraylist1 = new ArrayList(mNumChildren);
        int i = 0;
        do
        {
            arraylist = arraylist1;
            if (i >= mNumChildren)
            {
                continue;
            }
            arraylist1.add(new GameBadgeRef(mDataHolder, mDataRow + i));
            i++;
        } while (true);
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String getFormattedFullPrice()
    {
        return getString("formatted_full_price");
    }

    public final String getFormattedPrice()
    {
        return getString("formatted_price");
    }

    public final long getFullPriceMicros()
    {
        return getLong("full_price_micros");
    }

    public final Game getGame()
    {
        return mGame;
    }

    public final long getLastPlayedServerTimestamp()
    {
        return getLong("last_played_server_time");
    }

    public final long getPriceMicros()
    {
        return getLong("price_micros");
    }

    public final List getScreenshotImageUris()
    {
        ArrayList arraylist = new ArrayList();
        String s = getString("screenshot_image_uris");
        if (!TextUtils.isEmpty(s))
        {
            String as[] = TextUtils.split(s, ",");
            int i = 0;
            for (int j = as.length; i < j; i++)
            {
                arraylist.add(Uri.parse(as[i]));
            }

        }
        return arraylist;
    }

    public final SnapshotMetadata getSnapshot()
    {
        return mSnapshot;
    }

    public final String getVideoUrl()
    {
        return getString("video_url");
    }

    public int hashCode()
    {
        return GameFirstPartyEntity.hashCode(this);
    }

    public final boolean isOwned()
    {
        return getBoolean("owned");
    }

    public String toString()
    {
        return GameFirstPartyEntity.toString(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameFirstPartyEntity)freeze()).writeToParcel(parcel, i);
    }
}
