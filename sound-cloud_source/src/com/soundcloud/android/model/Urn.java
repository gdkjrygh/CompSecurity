// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.soundcloud.java.collections.Property;
import com.soundcloud.java.collections.PropertyBinding;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.strings.Charsets;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.Charset;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// Referenced classes of package com.soundcloud.android.model:
//            EntityProperty

public final class Urn
    implements Parcelable, Comparable
{

    private static final String COLON = ":";
    private static final String COMMENTS_TYPE = "comments";
    private static final String COMMENT_PATTERN = "soundcloud:comments:(-?\\d+)";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private static final String LEGACY_TRACK_PATTERN = "soundcloud:sounds:(-?\\d+)";
    private static final String LOCAL_PLAYLIST_PATTERN = "local:playlists:(-?\\d+)";
    public static final String LOCAL_SCHEME = "local";
    public static final Urn NOT_SET = new Urn("soundcloud:unknown", -1L);
    private static final String NUMERIC_ID_PATTERN = ":(-?\\d+)";
    private static final String PLAYLISTS_TYPE = "playlists";
    private static final String PLAYLIST_PATTERN = "soundcloud:playlists:(-?\\d+)";
    public static final String SOUNDCLOUD_SCHEME = "soundcloud";
    private static final String SOUNDS_TYPE = "sounds";
    private static final String STATION_PATTERN = "soundcloud:[\\w-]+-stations:.*";
    private static final String TRACKS_TYPE = "tracks";
    private static final String TRACK_PATTERN = "soundcloud:tracks:(-?\\d+)";
    private static final String TRACK_STATION_TYPE = "track-stations";
    private static final String USERS_TYPE = "users";
    private static final String USER_PATTERN = "soundcloud:users:(-?\\d+)";
    private final String content;
    private final long numericId;

    public Urn(String s)
    {
        content = s.replaceFirst("soundcloud:sounds:", "soundcloud:tracks:");
        numericId = parseNumericId();
    }

    private Urn(String s, long l)
    {
        content = (new StringBuilder()).append(s).append(":").append(l).toString();
        numericId = l;
    }

    public static Urn forComment(long l)
    {
        return new Urn("soundcloud:comments", l);
    }

    public static Urn forLocalPlaylist(long l)
    {
        return new Urn("local:playlists", l);
    }

    public static Urn forPlaylist(long l)
    {
        return new Urn("soundcloud:playlists", l);
    }

    public static Urn forTrack(long l)
    {
        return new Urn("soundcloud:tracks", l);
    }

    public static Urn forTrackStation(long l)
    {
        return new Urn("soundcloud:track-stations", l);
    }

    public static Urn forUser(long l)
    {
        return new Urn("soundcloud:users", Math.max(0L, l));
    }

    public static boolean isLocalUrn(String s)
    {
        return s.matches("local:playlists:(-?\\d+)");
    }

    public static boolean isSoundCloudUrn(String s)
    {
        return s.matches("soundcloud:tracks:(-?\\d+)") || s.matches("soundcloud:sounds:(-?\\d+)") || s.matches("soundcloud:playlists:(-?\\d+)") || s.matches("soundcloud:users:(-?\\d+)") || s.matches("soundcloud:comments:(-?\\d+)") || s.matches("soundcloud:[\\w-]+-stations:.*");
    }

    private long parseNumericId()
    {
        Matcher matcher = Pattern.compile(":(-?\\d+)").matcher(content);
        if ((isSoundCloudUrn(content) || isLocalUrn(content)) && matcher.find())
        {
            return Long.parseLong(matcher.group(1));
        } else
        {
            return -1L;
        }
    }

    public final int compareTo(Urn urn)
    {
        return content.compareTo(urn.content);
    }

    public final volatile int compareTo(Object obj)
    {
        return compareTo((Urn)obj);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        if (this == obj)
        {
            return true;
        }
        if (obj == null || getClass() != obj.getClass())
        {
            return false;
        } else
        {
            return ((Urn)obj).content.equals(content);
        }
    }

    public final long getNumericId()
    {
        return numericId;
    }

    public final int hashCode()
    {
        return content.hashCode();
    }

    public final boolean isPlayable()
    {
        return isTrack() || isPlaylist();
    }

    public final boolean isPlaylist()
    {
        return content.matches("soundcloud:playlists:(-?\\d+)") || content.matches("local:playlists:(-?\\d+)");
    }

    public final boolean isStation()
    {
        return content.matches("soundcloud:[\\w-]+-stations:.*");
    }

    public final boolean isTrack()
    {
        return content.matches("soundcloud:tracks:(-?\\d+)") || content.matches("soundcloud:sounds:(-?\\d+)");
    }

    public final boolean isUser()
    {
        return content.matches("soundcloud:users:(-?\\d+)");
    }

    public final String toEncodedString()
    {
        String s;
        try
        {
            s = URLEncoder.encode(toString(), Charsets.UTF_8.displayName());
        }
        catch (UnsupportedEncodingException unsupportedencodingexception)
        {
            throw new IllegalStateException(unsupportedencodingexception);
        }
        return s;
    }

    public final PropertySet toPropertySet()
    {
        return PropertySet.from(new PropertyBinding[] {
            EntityProperty.URN.bind(this)
        });
    }

    public final String toString()
    {
        return content;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(content);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Urn createFromParcel(Parcel parcel)
        {
            return new Urn(parcel.readString());
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Urn[] newArray(int i)
        {
            return new Urn[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
