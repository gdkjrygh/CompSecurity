// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;

// Referenced classes of package com.google.android.gms.games.internal.game:
//            GameBadge, GameBadgeEntity

public final class GameBadgeRef extends b
    implements GameBadge
{

    GameBadgeRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return GameBadgeEntity.a(this, obj);
    }

    public Object freeze()
    {
        return hh();
    }

    public String getDescription()
    {
        return getString("badge_description");
    }

    public Uri getIconImageUri()
    {
        return ah("badge_icon_image_uri");
    }

    public String getTitle()
    {
        return getString("badge_title");
    }

    public int getType()
    {
        return getInteger("badge_type");
    }

    public int hashCode()
    {
        return GameBadgeEntity.a(this);
    }

    public GameBadge hh()
    {
        return new GameBadgeEntity(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.internal.game.GameBadgeEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((GameBadgeEntity)hh()).writeToParcel(parcel, i);
    }
}
