// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.b;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntity

public final class d extends b
    implements Player
{

    public d(com.google.android.gms.common.data.d d1, int i)
    {
        super(d1, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return PlayerEntity.a(this, obj);
    }

    public Player freeze()
    {
        return new PlayerEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDisplayName()
    {
        return getString("profile_name");
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a("profile_name", chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return u("profile_hi_res_image_uri");
    }

    public Uri getIconImageUri()
    {
        return u("profile_icon_image_uri");
    }

    public String getPlayerId()
    {
        return getString("external_player_id");
    }

    public long getRetrievedTimestamp()
    {
        return getLong("last_updated");
    }

    public boolean hasHiResImage()
    {
        return getHiResImageUri() != null;
    }

    public boolean hasIconImage()
    {
        return getIconImageUri() != null;
    }

    public int hashCode()
    {
        return PlayerEntity.a(this);
    }

    public String toString()
    {
        return com.google.android.gms.games.PlayerEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((PlayerEntity)freeze()).writeToParcel(parcel, i);
    }
}
