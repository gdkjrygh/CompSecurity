// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Parcel;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.spotify.cosmos.android.Resolver;
import com.spotify.mobile.android.spotlets.recentlyplayed.RecentlyPlayedItems;

public final class fdq extends epe
    implements epf
{

    private final String k;
    private final ObjectMapper l;

    public fdq(Context context, Resolver resolver, int i, boolean flag, boolean flag1)
    {
        super(context, resolver);
        k = String.format("sp://core-recently-played/unstable/items?updateThrottling=%d&limit=%d&include_shows=%s&include_radio=%s", new Object[] {
            Integer.valueOf(750), Integer.valueOf(i), String.valueOf(flag), String.valueOf(flag1)
        });
        l = ((gni)dmz.a(gni)).a().a(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false).a();
    }

    protected final fip a(byte abyte0[])
    {
        Parcel parcel = Parcel.obtain();
        parcel.unmarshall(abyte0, 0, abyte0.length);
        parcel.setDataPosition(0);
        return (RecentlyPlayedItems)RecentlyPlayedItems.CREATOR.createFromParcel(parcel);
    }

    public final void a(epg epg)
    {
        super.a(k, null, epg, false);
    }

    protected final byte[] a(fip fip)
    {
        RecentlyPlayedItems recentlyplayeditems = (RecentlyPlayedItems)fip;
        fip = Parcel.obtain();
        recentlyplayeditems.writeToParcel(fip, 0);
        byte abyte0[] = fip.marshall();
        fip.recycle();
        return abyte0;
    }

    public final byte[] a(Object obj)
    {
        throw new UnsupportedOperationException();
    }

    protected final fip b(byte abyte0[])
    {
        return (RecentlyPlayedItems)l.readValue(abyte0, com/spotify/mobile/android/spotlets/recentlyplayed/RecentlyPlayedItems);
    }

    public final void b(epg epg)
    {
        super.a(k, null, epg, true);
    }

    public final Object c(byte abyte0[])
    {
        throw new UnsupportedOperationException();
    }
}
