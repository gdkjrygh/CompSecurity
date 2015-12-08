// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.momentsstart.model;

import android.content.Context;
import android.os.Parcel;
import android.text.Html;
import android.text.TextUtils;
import com.spotify.mobile.android.cosmos.player.v2.PlayerState;
import com.spotify.mobile.android.util.SpotifyLink;
import ezr;
import java.util.Locale;

// Referenced classes of package com.spotify.mobile.android.spotlets.momentsstart.model:
//            MomentContext

public class MomentCurrentlyPlayingContext extends MomentContext
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new MomentCurrentlyPlayingContext(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new MomentCurrentlyPlayingContext[i];
        }

    };

    protected MomentCurrentlyPlayingContext(Parcel parcel)
    {
        super(parcel);
    }

    public MomentCurrentlyPlayingContext(String s, String s1, String s2, String s3, String s4, String s5)
    {
        super(s, s1, s2, s3, s4, null, s5);
    }

    public static boolean canCreateFromPlayerState(PlayerState playerstate)
    {
        return !TextUtils.isEmpty(ezr.a(playerstate, "artist_name"));
    }

    public static MomentCurrentlyPlayingContext createFromPlayerState(Context context, PlayerState playerstate)
    {
        String s = playerstate.entityUri();
        if (TextUtils.isEmpty(s))
        {
            return null;
        } else
        {
            return new MomentCurrentlyPlayingContext(getDescription(context, playerstate), getImage(playerstate), getName(playerstate), context.getString(0x7f08035a), getType(playerstate).toString(), s);
        }
    }

    private static String getDescription(Context context, PlayerState playerstate)
    {
        String s1 = playerstate.entityUri();
        String s = Html.fromHtml(ezr.b(playerstate, "context_long_description")).toString();
        if (getType(playerstate) == MomentContext.Type.b)
        {
            if (s1.contains(":artist"))
            {
                context = context.getString(0x7f08043b);
            } else
            if (s1.contains(":track"))
            {
                context = context.getString(0x7f08043e);
            } else
            if (s1.contains(":playlist"))
            {
                context = context.getString(0x7f08043d);
            } else
            if (s1.contains(":album"))
            {
                context = context.getString(0x7f08043a);
            } else
            {
                context = context.getString(0x7f08043c);
            }
            s = context.toUpperCase(Locale.ENGLISH);
        }
        return s;
    }

    private static String getImage(PlayerState playerstate)
    {
        String s1 = ezr.b(playerstate, "image_url");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = ezr.a(playerstate, "image_xlarge_url");
        }
        return s;
    }

    private static String getName(PlayerState playerstate)
    {
        String s1 = ezr.b(playerstate, "context_description");
        String s = s1;
        if (TextUtils.isEmpty(s1))
        {
            s = ezr.a(playerstate, "artist_name");
        }
        return s;
    }

    private static MomentContext.Type getType(PlayerState playerstate)
    {
        String s = ezr.a(playerstate, "media.type");
        MomentContext.Type type = MomentContext.Type.a;
        if (TextUtils.equals(s, "video"))
        {
            type = MomentContext.Type.c;
        } else
        if (SpotifyLink.a(playerstate.entityUri(), new com.spotify.mobile.android.util.SpotifyLink.LinkType[] {
    com.spotify.mobile.android.util.SpotifyLink.LinkType.aQ, com.spotify.mobile.android.util.SpotifyLink.LinkType.aA
}))
        {
            return MomentContext.Type.b;
        }
        return type;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.writeToParcel(parcel, i);
    }

}
