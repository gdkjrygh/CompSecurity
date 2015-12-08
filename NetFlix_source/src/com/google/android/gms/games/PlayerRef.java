// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;

// Referenced classes of package com.google.android.gms.games:
//            Player, PlayerEntity

public final class PlayerRef extends b
    implements Player
{
    private static final class PlayerColumnNames
    {

        public final String Ij;
        public final String Ik;
        public final String Il;
        public final String Im;
        public final String In;
        public final String Io;
        public final String Ip;
        public final String Iq;
        public final String Ir;

        public PlayerColumnNames(String s)
        {
            if (TextUtils.isEmpty(s))
            {
                Ij = "external_player_id";
                Ik = "profile_name";
                Il = "profile_icon_image_uri";
                Im = "profile_icon_image_url";
                In = "profile_hi_res_image_uri";
                Io = "profile_hi_res_image_url";
                Ip = "last_updated";
                Iq = "is_in_circles";
                Ir = "played_with_timestamp";
                return;
            } else
            {
                Ij = (new StringBuilder()).append(s).append("external_player_id").toString();
                Ik = (new StringBuilder()).append(s).append("profile_name").toString();
                Il = (new StringBuilder()).append(s).append("profile_icon_image_uri").toString();
                Im = (new StringBuilder()).append(s).append("profile_icon_image_url").toString();
                In = (new StringBuilder()).append(s).append("profile_hi_res_image_uri").toString();
                Io = (new StringBuilder()).append(s).append("profile_hi_res_image_url").toString();
                Ip = (new StringBuilder()).append(s).append("last_updated").toString();
                Iq = (new StringBuilder()).append(s).append("is_in_circles").toString();
                Ir = (new StringBuilder()).append(s).append("played_with_timestamp").toString();
                return;
            }
        }
    }


    private final PlayerColumnNames Ii;

    public PlayerRef(DataHolder dataholder, int i)
    {
        this(dataholder, i, null);
    }

    public PlayerRef(DataHolder dataholder, int i, String s)
    {
        super(dataholder, i);
        Ii = new PlayerColumnNames(s);
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
        return getString(Ii.Ik);
    }

    public void getDisplayName(CharArrayBuffer chararraybuffer)
    {
        a(Ii.Ik, chararraybuffer);
    }

    public Uri getHiResImageUri()
    {
        return ah(Ii.In);
    }

    public String getHiResImageUrl()
    {
        return getString(Ii.Io);
    }

    public Uri getIconImageUri()
    {
        return ah(Ii.Il);
    }

    public String getIconImageUrl()
    {
        return getString(Ii.Im);
    }

    public long getLastPlayedWithTimestamp()
    {
        if (!hasColumn(Ii.Ir))
        {
            return -1L;
        } else
        {
            return getLong(Ii.Ir);
        }
    }

    public String getPlayerId()
    {
        return getString(Ii.Ij);
    }

    public long getRetrievedTimestamp()
    {
        return getLong(Ii.Ip);
    }

    public int gh()
    {
        return getInteger(Ii.Iq);
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
