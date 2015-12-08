// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntity

public final class GameBadgeRef extends DataBufferRef
    implements GameBadge
{

    public GameBadgeRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    private GameBadge freeze()
    {
        return new GameBadgeEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return GameBadgeEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDescription()
    {
        return getString("badge_description");
    }

    public final Uri getIconImageUri()
    {
        return parseUri("badge_icon_image_uri");
    }

    public final String getTitle()
    {
        return getString("badge_title");
    }

    public final int getType()
    {
        return getInteger("badge_type");
    }

    public final int hashCode()
    {
        return GameBadgeEntity.hashCode(this);
    }

    public final String toString()
    {
        return GameBadgeEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((GameBadgeEntity)freeze()).writeToParcel(parcel, i);
    }
}
