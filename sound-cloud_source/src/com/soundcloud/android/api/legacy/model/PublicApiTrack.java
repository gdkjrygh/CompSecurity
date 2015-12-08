// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.api.legacy.model;

import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.soundcloud.android.api.legacy.model.behavior.Refreshable;
import com.soundcloud.android.api.model.ApiTrack;
import com.soundcloud.android.api.model.ApiTrackStats;
import com.soundcloud.android.model.Urn;
import com.soundcloud.android.storage.provider.Content;
import com.soundcloud.android.tracks.TrackProperty;
import com.soundcloud.android.tracks.TrackRecord;
import com.soundcloud.android.users.UserRecord;
import com.soundcloud.java.collections.PropertySet;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.optional.Optional;
import com.soundcloud.java.strings.Strings;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.Locale;

// Referenced classes of package com.soundcloud.android.api.legacy.model:
//            Playable, PublicApiUser

public class PublicApiTrack extends Playable
    implements TrackRecord
{
    public static class CreatedWith
        implements Parcelable
    {

        public static final android.os.Parcelable.Creator CREATOR = new _cls1();
        public String external_url;
        public long id;
        public String name;
        public String permalink_url;
        public String uri;

        public int describeContents()
        {
            return 0;
        }

        public boolean isEmpty()
        {
            return TextUtils.isEmpty(name) || TextUtils.isEmpty(permalink_url);
        }

        public void writeToParcel(Parcel parcel, int i)
        {
            parcel.writeLong(id);
            parcel.writeString(name);
            parcel.writeString(uri);
            parcel.writeString(permalink_url);
            parcel.writeString(external_url);
        }


        public CreatedWith()
        {
        }

        public CreatedWith(Parcel parcel)
        {
            id = parcel.readLong();
            name = parcel.readString();
            uri = parcel.readString();
            permalink_url = parcel.readString();
            external_url = parcel.readString();
        }

        class _cls1
            implements android.os.Parcelable.Creator
        {

            public final CreatedWith createFromParcel(Parcel parcel)
            {
                return new CreatedWith(parcel);
            }

            public final volatile Object createFromParcel(Parcel parcel)
            {
                return createFromParcel(parcel);
            }

            public final CreatedWith[] newArray(int i)
            {
                return new CreatedWith[i];
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

    public static final class State extends Enum
    {

        private static final State $VALUES[];
        public static final State FAILED;
        public static final State FINISHED;
        public static final State PROCESSING;
        public static final State READY;
        public static final State UNDEFINED;
        private final String name;

        public static State fromString(String s)
        {
            State astate[] = values();
            int j = astate.length;
            for (int i = 0; i < j; i++)
            {
                State state1 = astate[i];
                if (state1.name.equalsIgnoreCase(s))
                {
                    return state1;
                }
            }

            return UNDEFINED;
        }

        public static State valueOf(String s)
        {
            return (State)Enum.valueOf(com/soundcloud/android/api/legacy/model/PublicApiTrack$State, s);
        }

        public static State[] values()
        {
            return (State[])$VALUES.clone();
        }

        public final boolean isFailed()
        {
            return FAILED == this;
        }

        public final boolean isFinished()
        {
            return FINISHED == this;
        }

        public final boolean isProcessing()
        {
            return PROCESSING == this;
        }

        public final boolean isStreamable()
        {
            return FINISHED == this || UNDEFINED == this;
        }

        public final String value()
        {
            return name;
        }

        static 
        {
            UNDEFINED = new State("UNDEFINED", 0, "");
            FINISHED = new State("FINISHED", 1, "finished");
            FAILED = new State("FAILED", 2, "failed");
            READY = new State("READY", 3, "ready");
            PROCESSING = new State("PROCESSING", 4, "processing");
            $VALUES = (new State[] {
                UNDEFINED, FINISHED, FAILED, READY, PROCESSING
            });
        }


        private State(String s, int i, String s1)
        {
            super(s, i);
            name = s1;
        }
    }


    private static final String API_MONETIZABLE_VALUE = "monetize";
    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String EXTRA = "track";
    public static final String EXTRA_ID = "track_id";
    private static final String TAG = "Track";
    public String attachments_uri;
    public float bpm;
    public int comment_count;
    public boolean commentable;
    public CreatedWith created_with;
    public int download_count;
    public String download_url;
    public int downloads_remaining;
    public String isrc;
    public String key_signature;
    public PublicApiUser label;
    public int last_playback_error;
    public boolean local_cached;
    public int local_user_playback_count;
    public String original_format;
    public int playback_count;
    public String policy;
    public String secret_token;
    public String secret_uri;
    public State state;
    public String stream_url;
    public String track_type;
    public int user_playback_count;
    public String user_uri;
    public String video_url;
    public String waveform_url;

    public PublicApiTrack()
    {
        playback_count = -1;
        download_count = -1;
        comment_count = -1;
        user_playback_count = -1;
        last_playback_error = -1;
    }

    public PublicApiTrack(long l)
    {
        super(l);
        playback_count = -1;
        download_count = -1;
        comment_count = -1;
        user_playback_count = -1;
        last_playback_error = -1;
    }

    public PublicApiTrack(Cursor cursor)
    {
        boolean flag1 = true;
        super(cursor);
        playback_count = -1;
        download_count = -1;
        comment_count = -1;
        user_playback_count = -1;
        last_playback_error = -1;
        policy = cursor.getString(cursor.getColumnIndex("sound_policies_policy"));
        state = State.fromString(cursor.getString(cursor.getColumnIndex("state")));
        track_type = cursor.getString(cursor.getColumnIndex("track_type"));
        waveform_url = cursor.getString(cursor.getColumnIndex("waveform_url"));
        download_url = cursor.getString(cursor.getColumnIndex("download_url"));
        stream_url = cursor.getString(cursor.getColumnIndex("stream_url"));
        playback_count = getIntOrNotSet(cursor, "playback_count");
        download_count = getIntOrNotSet(cursor, "download_count");
        comment_count = getIntOrNotSet(cursor, "comment_count");
        shared_to_count = getIntOrNotSet(cursor, "shared_to_count");
        int i;
        boolean flag;
        if (cursor.getInt(cursor.getColumnIndex("commentable")) == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        commentable = flag;
        description = cursor.getString(cursor.getColumnIndex("description"));
        i = cursor.getColumnIndex("sound_user_play_count");
        if (i != -1)
        {
            local_user_playback_count = cursor.getInt(i);
        }
        i = cursor.getColumnIndex("sound_cached");
        if (i != -1)
        {
            if (cursor.getInt(i) == 1)
            {
                flag = flag1;
            } else
            {
                flag = false;
            }
            local_cached = flag;
        }
    }

    public PublicApiTrack(Parcel parcel)
    {
        playback_count = -1;
        download_count = -1;
        comment_count = -1;
        user_playback_count = -1;
        last_playback_error = -1;
        parcel = parcel.readBundle(getClass().getClassLoader());
        super.readFromBundle(parcel);
        policy = parcel.getString("policy");
        state = State.fromString(parcel.getString("state"));
        commentable = parcel.getBoolean("commentable");
        label = (PublicApiUser)parcel.getParcelable("label");
        isrc = parcel.getString("isrc");
        video_url = parcel.getString("video_url");
        track_type = parcel.getString("track_type");
        key_signature = parcel.getString("key_signature");
        bpm = parcel.getFloat("bpm");
        playback_count = parcel.getInt("playback_count");
        download_count = parcel.getInt("download_count");
        comment_count = parcel.getInt("comment_count");
        reposts_count = parcel.getInt("reposts_count");
        shared_to_count = parcel.getInt("shared_to_count");
        original_format = parcel.getString("original_format");
        user_uri = parcel.getString("user_uri");
        waveform_url = parcel.getString("waveform_url");
        stream_url = parcel.getString("stream_url");
        user_playback_count = parcel.getInt("user_playback_count");
        user_like = parcel.getBoolean("user_like");
        user_repost = parcel.getBoolean("user_repost");
        created_with = (CreatedWith)parcel.getParcelable("created_with");
        attachments_uri = parcel.getString("attachments_uri");
        download_url = parcel.getString("download_url");
        downloads_remaining = parcel.getInt("downloads_remaining");
        secret_token = parcel.getString("secret_token");
        secret_uri = parcel.getString("secret_uri");
        local_user_playback_count = parcel.getInt("local_user_playback_count");
        local_cached = parcel.getBoolean("local_cached");
        last_playback_error = parcel.getInt("last_playback_error");
    }

    public PublicApiTrack(ApiTrack apitrack)
    {
        playback_count = -1;
        download_count = -1;
        comment_count = -1;
        user_playback_count = -1;
        last_playback_error = -1;
        setUrn(apitrack.getUrn().toString());
        setUser(new PublicApiUser(apitrack.getUser()));
        setTitle(apitrack.getTitle());
        setWaveformUrl(apitrack.getWaveformUrl());
        duration = apitrack.getDuration();
        artwork_url = apitrack.getArtworkUrl();
        genre = apitrack.getGenre();
        commentable = apitrack.isCommentable();
        stream_url = apitrack.getStreamUrl();
        String s;
        if (apitrack.getUserTags() == null)
        {
            s = "";
        } else
        {
            s = TextUtils.join(" ", apitrack.getUserTags());
        }
        tag_list = s;
        created_at = apitrack.getCreatedAt();
        sharing = apitrack.getSharing();
        permalink_url = apitrack.getPermalinkUrl();
        policy = apitrack.getPolicy();
        apitrack = apitrack.getStats();
        if (apitrack != null)
        {
            playback_count = apitrack.getPlaybackCount();
            likes_count = apitrack.getLikesCount();
            comment_count = apitrack.getCommentsCount();
            reposts_count = apitrack.getRepostsCount();
        }
    }

    protected static String fixWaveform(String s)
    {
        String s1 = s;
        if (s != null)
        {
            s1 = s;
            if (!s.endsWith("_m.png"))
            {
                s1 = s.replace(".png", "_m.png");
            }
        }
        return s1;
    }

    private String getCCLink(String s)
    {
        return (new StringBuilder("http://creativecommons.org/licenses/")).append(s).append("/3.0").toString();
    }

    public ContentValues buildContentValues()
    {
        ContentValues contentvalues = super.buildContentValues();
        if (stream_url != null)
        {
            contentvalues.put("stream_url", stream_url);
        }
        if (state != null)
        {
            contentvalues.put("state", state.name);
        }
        if (track_type != null)
        {
            contentvalues.put("track_type", track_type);
        }
        if (waveform_url != null)
        {
            contentvalues.put("waveform_url", waveform_url);
        }
        if (download_url != null)
        {
            contentvalues.put("download_url", download_url);
        }
        if (playback_count != -1)
        {
            contentvalues.put("playback_count", Integer.valueOf(playback_count));
        }
        if (download_count != -1)
        {
            contentvalues.put("download_count", Integer.valueOf(download_count));
        }
        if (comment_count != -1)
        {
            contentvalues.put("comment_count", Integer.valueOf(comment_count));
        }
        if (commentable)
        {
            contentvalues.put("commentable", Boolean.valueOf(commentable));
        }
        if (shared_to_count != -1)
        {
            contentvalues.put("shared_to_count", Integer.valueOf(shared_to_count));
        }
        if (description != null)
        {
            contentvalues.put("description", description);
        }
        if (isCompleteTrack())
        {
            contentvalues.put("last_updated", Long.valueOf(System.currentTimeMillis()));
        }
        return contentvalues;
    }

    public int describeContents()
    {
        return 0;
    }

    public String formattedLicense()
    {
        String s;
        StringBuilder stringbuilder;
        stringbuilder = new StringBuilder(200);
        if (TextUtils.isEmpty(license))
        {
            s = "all-rights-reserved";
        } else
        {
            s = license;
        }
        if (!s.startsWith("cc-")) goto _L2; else goto _L1
_L1:
        s = s.substring(3, s.length());
        stringbuilder.append("Licensed under a Creative Commons License (<a href='").append(getCCLink(s)).append("'>").append(s.toUpperCase(Locale.US)).append("</a>)");
_L4:
        return stringbuilder.toString();
_L2:
        if ("no-rights-reserved".equals(s))
        {
            stringbuilder.append("No Rights Reserved");
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public Uri getBulkInsertUri()
    {
        return Content.TRACKS.uri;
    }

    public int getCommentsCount()
    {
        return comment_count;
    }

    public Optional getDescription()
    {
        return Optional.fromNullable(description);
    }

    public long getDuration()
    {
        return duration;
    }

    public int getEstimatedFileSize()
    {
        if (duration <= 0L)
        {
            return 0;
        } else
        {
            return (int)(((128L * duration) / 8L) * 1024L);
        }
    }

    public String getGenre()
    {
        return genre;
    }

    public String getGenreOrTag()
    {
        if (Strings.isNotBlank(genre))
        {
            return genre;
        }
        List list = humanTags();
        if (!list.isEmpty())
        {
            return (String)list.get(0);
        } else
        {
            return null;
        }
    }

    public int getLikesCount()
    {
        return likes_count;
    }

    public Optional getMonetizationModel()
    {
        return Optional.absent();
    }

    public String getPermalinkUrl()
    {
        return permalink_url;
    }

    public int getPlaybackCount()
    {
        return playback_count;
    }

    public String getPolicy()
    {
        return policy;
    }

    public Refreshable getRefreshableResource()
    {
        return this;
    }

    public int getRepostsCount()
    {
        return reposts_count;
    }

    public String getStreamUrl()
    {
        return stream_url;
    }

    public int getTypeId()
    {
        return 0;
    }

    public volatile UserRecord getUser()
    {
        return super.getUser();
    }

    public String getUserName()
    {
        if (user != null)
        {
            return user.username;
        } else
        {
            return null;
        }
    }

    public URL getWaveformDataURL()
    {
        if (TextUtils.isEmpty(waveform_url))
        {
            return null;
        }
        Object obj;
        try
        {
            obj = Uri.parse(waveform_url);
            obj = new URL((new StringBuilder("http://wis.sndcdn.com/")).append(((Uri) (obj)).getLastPathSegment()).toString());
        }
        catch (MalformedURLException malformedurlexception)
        {
            return null;
        }
        return ((URL) (obj));
    }

    public String getWaveformUrl()
    {
        return waveform_url;
    }

    public boolean hasWaveform()
    {
        return !TextUtils.isEmpty(waveform_url);
    }

    public boolean isCommentable()
    {
        return commentable;
    }

    public boolean isCompleteTrack()
    {
        return state != null && created_at != null && duration > 0L;
    }

    public boolean isFailed()
    {
        return state != null && state.isFailed();
    }

    public boolean isFinished()
    {
        return state != null && state.isFinished();
    }

    public boolean isMonetizable()
    {
        return policy != null && policy.equalsIgnoreCase("monetize");
    }

    public boolean isProcessing()
    {
        return state != null && state.isProcessing();
    }

    public boolean isStale()
    {
        return System.currentTimeMillis() - last_updated > com.soundcloud.android.Consts.ResourceStaleTimes.TRACK;
    }

    public Optional isSubHighTier()
    {
        return Optional.absent();
    }

    public Optional isSubMidTier()
    {
        return Optional.absent();
    }

    public boolean isSyncable()
    {
        return false;
    }

    public boolean isWaitingOnState()
    {
        return state == null;
    }

    public void setGenre(String s)
    {
        genre = s;
    }

    public void setId(long l)
    {
        super.setId(l);
        urn = Urn.forTrack(l);
    }

    public void setPolicy(String s)
    {
        policy = s;
    }

    public void setStreamUrl(String s)
    {
        stream_url = s;
    }

    public void setWaveformUrl(String s)
    {
        waveform_url = fixWaveform(s);
    }

    public ApiTrack toApiMobileTrack()
    {
        ApiTrack apitrack = new ApiTrack();
        apitrack.setUrn(getUrn());
        apitrack.setCreatedAt(created_at);
        apitrack.setArtworkUrl(artwork_url);
        apitrack.setCommentable(commentable);
        apitrack.setDuration(duration);
        apitrack.setGenre(genre);
        apitrack.setMonetizable(isMonetizable());
        apitrack.setPermalinkUrl(permalink_url);
        apitrack.setPolicy(policy);
        apitrack.setSharing(sharing);
        apitrack.setStreamUrl(stream_url);
        apitrack.setSyncable(isSyncable());
        apitrack.setUserTags(humanTags());
        apitrack.setTitle(title);
        apitrack.setWaveformUrl(waveform_url);
        apitrack.setUser(getUser().toApiMobileUser());
        ApiTrackStats apitrackstats = new ApiTrackStats();
        apitrackstats.setCommentsCount(comment_count);
        apitrackstats.setPlaybackCount(playback_count);
        apitrackstats.setLikesCount(likes_count);
        apitrackstats.setRepostsCount(reposts_count);
        apitrack.setStats(apitrackstats);
        return apitrack;
    }

    public PropertySet toPropertySet()
    {
        PropertySet propertyset = super.toPropertySet().put(TrackProperty.URN, Urn.forTrack(getId())).put(TrackProperty.PLAY_COUNT, Integer.valueOf(playback_count)).put(TrackProperty.COMMENTS_COUNT, Integer.valueOf(comment_count));
        com.soundcloud.java.collections.Property property = TrackProperty.DESCRIPTION;
        Object obj;
        if (description == null)
        {
            obj = "";
        } else
        {
            obj = description;
        }
        obj = propertyset.put(property, obj);
        if (policy != null)
        {
            ((PropertySet) (obj)).put(TrackProperty.POLICY, policy);
            ((PropertySet) (obj)).put(TrackProperty.MONETIZABLE, Boolean.valueOf(isMonetizable()));
            return ((PropertySet) (obj));
        } else
        {
            ((PropertySet) (obj)).put(TrackProperty.MONETIZABLE, Boolean.valueOf(false));
            return ((PropertySet) (obj));
        }
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("id", getId()).add("title", title).add("policy", policy).add("permalink_url", permalink_url).add("artwork_url", artwork_url).add("duration", duration).add("state", state).add("user", user).toString();
    }

    public Uri toUri()
    {
        return Content.TRACKS.forId(getId());
    }

    public String trackInfo()
    {
        StringBuilder stringbuilder = new StringBuilder(200);
        if (!TextUtils.isEmpty(description))
        {
            stringbuilder.append(description.replace("\n", "<br/>")).append("<br/><br/>");
        }
        if (!TextUtils.isEmpty(key_signature))
        {
            stringbuilder.append(key_signature).append("<br/>");
        }
        if (bpm != 0.0F)
        {
            stringbuilder.append(' ');
            if (Math.floor(bpm) == (double)bpm)
            {
                stringbuilder.append((int)bpm);
            } else
            {
                stringbuilder.append(bpm);
            }
            stringbuilder.append(" BPM <br/>");
        }
        if (!TextUtils.isEmpty(formattedLicense()))
        {
            stringbuilder.append("<br/>").append(formattedLicense()).append("<br/><br/>");
        }
        if (!TextUtils.isEmpty(label_name))
        {
            stringbuilder.append("<b>Released By</b><br/>").append(label_name).append("<br/>");
            if (release_day > 0)
            {
                stringbuilder.append(release_year).append("<br/>");
            }
            stringbuilder.append("<br />");
        }
        if (created_with != null && !created_with.isEmpty())
        {
            stringbuilder.append("Created with <a href=\"").append(created_with.permalink_url).append("\">").append(created_with.name).append("</a><br/>");
        }
        return stringbuilder.toString();
    }

    public PublicApiTrack updateFrom(PublicApiTrack publicapitrack, PublicApiResource.CacheUpdateMode cacheupdatemode)
    {
        super.updateFrom(publicapitrack, cacheupdatemode);
        stream_url = publicapitrack.stream_url;
        if (cacheupdatemode == PublicApiResource.CacheUpdateMode.FULL)
        {
            policy = publicapitrack.policy;
            user_like = publicapitrack.user_like;
            commentable = publicapitrack.commentable;
            state = publicapitrack.state;
            waveform_url = publicapitrack.waveform_url;
            playback_count = publicapitrack.playback_count;
            comment_count = publicapitrack.comment_count;
            shared_to_count = publicapitrack.shared_to_count;
        }
        return this;
    }

    public String userTrackPermalink()
    {
        if (permalink == null)
        {
            return null;
        }
        StringBuilder stringbuilder = new StringBuilder();
        String s;
        if (user != null && !TextUtils.isEmpty(user.permalink))
        {
            s = (new StringBuilder()).append(user.permalink).append("/").toString();
        } else
        {
            s = "";
        }
        return stringbuilder.append(s).append(permalink).toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        Bundle bundle = super.getBundle();
        bundle.putString("policy", policy);
        String s;
        if (state != null)
        {
            s = state.value();
        } else
        {
            s = null;
        }
        bundle.putString("state", s);
        bundle.putBoolean("commentable", commentable);
        bundle.putParcelable("label", label);
        bundle.putString("isrc", isrc);
        bundle.putString("video_url", video_url);
        bundle.putString("track_type", track_type);
        bundle.putString("key_signature", key_signature);
        bundle.putFloat("bpm", bpm);
        bundle.putInt("playback_count", playback_count);
        bundle.putInt("download_count", download_count);
        bundle.putInt("comment_count", comment_count);
        bundle.putInt("reposts_count", reposts_count);
        bundle.putInt("shared_to_count", shared_to_count);
        bundle.putString("original_format", original_format);
        bundle.putString("user_uri", user_uri);
        bundle.putString("waveform_url", waveform_url);
        bundle.putString("stream_url", stream_url);
        bundle.putInt("user_playback_count", user_playback_count);
        bundle.putBoolean("user_like", user_like);
        bundle.putBoolean("user_repost", user_repost);
        bundle.putParcelable("created_with", created_with);
        bundle.putString("attachments_uri", attachments_uri);
        bundle.putString("download_url", download_url);
        bundle.putInt("downloads_remaining", downloads_remaining);
        bundle.putString("secret_token", secret_token);
        bundle.putString("secret_uri", secret_uri);
        bundle.putInt("local_user_playback_count", local_user_playback_count);
        bundle.putBoolean("local_cached", local_cached);
        bundle.putInt("last_playback_error", last_playback_error);
        parcel.writeBundle(bundle);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final PublicApiTrack createFromParcel(Parcel parcel)
        {
            return new PublicApiTrack(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final PublicApiTrack[] newArray(int i)
        {
            return new PublicApiTrack[i];
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
