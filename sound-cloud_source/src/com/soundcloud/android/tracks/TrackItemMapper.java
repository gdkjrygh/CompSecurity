// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.tracks;

import com.soundcloud.android.model.PlayableProperty;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.offline.OfflineProperty;
import com.soundcloud.android.offline.OfflineState;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.propeller.CursorReader;
import com.soundcloud.propeller.rx.RxResultMapper;
import java.util.Date;

// Referenced classes of package com.soundcloud.android.tracks:
//            TrackProperty

final class TrackItemMapper extends RxResultMapper
{

    private static final String SHARING_PRIVATE = "private";

    TrackItemMapper()
    {
    }

    private void addOptionalOfflineSyncDates(CursorReader cursorreader, PropertySet propertyset)
    {
        Date date1 = new Date(0L);
        Date date = getDateOr(cursorreader, "sound_offline_removed_at", date1);
        cursorreader = getDateOr(cursorreader, "sound_offline_downloaded_at", date1);
        if (isMostRecentDate(cursorreader, new Date[] {
    date
}))
        {
            propertyset.put(OfflineProperty.OFFLINE_STATE, OfflineState.DOWNLOADED);
        } else
        if (isMostRecentDate(date, new Date[] {
    cursorreader
}))
        {
            propertyset.put(OfflineProperty.OFFLINE_STATE, OfflineState.NO_OFFLINE);
            return;
        }
    }

    private Date getDateOr(CursorReader cursorreader, String s, Date date)
    {
        if (cursorreader.isNotNull(s))
        {
            date = cursorreader.getDateFromTimestamp(s);
        }
        return date;
    }

    private transient boolean isMostRecentDate(Date date, Date adate[])
    {
        int j = adate.length;
        for (int i = 0; i < j; i++)
        {
            Date date1 = adate[i];
            if (date1.after(date) || date1.equals(date))
            {
                return false;
            }
        }

        return true;
    }

    private void putOptionalFields(CursorReader cursorreader, PropertySet propertyset)
    {
        Object obj = cursorreader.getString("sound_policies_policy");
        if (obj != null)
        {
            propertyset.put(TrackProperty.POLICY, obj);
        }
        obj = cursorreader.getString("waveform_url");
        if (obj != null)
        {
            propertyset.put(TrackProperty.WAVEFORM_URL, obj);
        }
        String s = cursorreader.getString("sound_user_username");
        com.soundcloud.java.collections.Property property = PlayableProperty.CREATOR_NAME;
        obj = s;
        if (s == null)
        {
            obj = "";
        }
        propertyset.put(property, obj);
        long l = cursorreader.getLong("sound_user_id");
        obj = PlayableProperty.CREATOR_URN;
        if (l == -1L)
        {
            cursorreader = Urn.NOT_SET;
        } else
        {
            cursorreader = Urn.forUser(l);
        }
        propertyset.put(((com.soundcloud.java.collections.Property) (obj)), cursorreader);
    }

    private Urn readTrackUrn(CursorReader cursorreader)
    {
        return Urn.forTrack(cursorreader.getLong("_id"));
    }

    public final PropertySet map(CursorReader cursorreader)
    {
        PropertySet propertyset = PropertySet.create(cursorreader.getColumnCount());
        propertyset.put(TrackProperty.URN, readTrackUrn(cursorreader));
        propertyset.put(PlayableProperty.TITLE, cursorreader.getString("title"));
        propertyset.put(PlayableProperty.DURATION, Long.valueOf(cursorreader.getLong("duration")));
        propertyset.put(TrackProperty.PLAY_COUNT, Integer.valueOf(cursorreader.getInt("playback_count")));
        propertyset.put(TrackProperty.COMMENTS_COUNT, Integer.valueOf(cursorreader.getInt("comment_count")));
        propertyset.put(TrackProperty.STREAM_URL, cursorreader.getString("stream_url"));
        propertyset.put(PlayableProperty.LIKES_COUNT, Integer.valueOf(cursorreader.getInt("favoritings_count")));
        propertyset.put(PlayableProperty.REPOSTS_COUNT, Integer.valueOf(cursorreader.getInt("reposts_count")));
        propertyset.put(TrackProperty.MONETIZABLE, Boolean.valueOf(cursorreader.getBoolean("sound_policies_monetizable")));
        propertyset.put(PlayableProperty.IS_LIKED, Boolean.valueOf(cursorreader.getBoolean("sound_user_like")));
        propertyset.put(PlayableProperty.PERMALINK_URL, cursorreader.getString("permalink_url"));
        propertyset.put(PlayableProperty.IS_REPOSTED, Boolean.valueOf(cursorreader.getBoolean("sound_user_repost")));
        propertyset.put(PlayableProperty.IS_PRIVATE, Boolean.valueOf("private".equalsIgnoreCase(cursorreader.getString("sharing"))));
        propertyset.put(PlayableProperty.CREATED_AT, cursorreader.getDateFromTimestamp("created_at"));
        putOptionalFields(cursorreader, propertyset);
        addOptionalOfflineSyncDates(cursorreader, propertyset);
        return propertyset;
    }

    public final volatile Object map(CursorReader cursorreader)
    {
        return map(cursorreader);
    }
}
