// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.android.analytics.eventlogger;

import com.soundcloud.android.model.Urn;
import com.soundcloud.java.objects.MoreObjects;
import com.soundcloud.java.strings.Strings;
import java.util.HashMap;

class EventLoggerEventData
{

    final String event;
    final HashMap payload = new HashMap();
    final String version;

    public EventLoggerEventData(String s, String s1, int i, String s2, String s3, long l)
    {
        event = s;
        version = s1;
        addToPayload("client_id", i);
        addToPayload("anonymous_id", s2);
        addToPayload("user", s3);
        addToPayload("ts", l);
    }

    public EventLoggerEventData action(String s)
    {
        addToPayload("action", s);
        return this;
    }

    public EventLoggerEventData adUrn(String s)
    {
        addToPayload("ad_urn", s);
        return this;
    }

    protected void addToPayload(String s, int i)
    {
        addToPayload(s, String.valueOf(i));
    }

    protected void addToPayload(String s, long l)
    {
        addToPayload(s, String.valueOf(l));
    }

    protected void addToPayload(String s, String s1)
    {
        if (Strings.isNotBlank(s1))
        {
            payload.put(s, s1);
        }
    }

    protected void addToPayload(String s, boolean flag)
    {
        addToPayload(s, String.valueOf(flag));
    }

    public EventLoggerEventData appVersion(String s)
    {
        addToPayload("app_version", s);
        return this;
    }

    public EventLoggerEventData bitrate(String s)
    {
        addToPayload("bitrate", s);
        return this;
    }

    public EventLoggerEventData clickCategory(String s)
    {
        addToPayload("click_category", s);
        return this;
    }

    public EventLoggerEventData clickName(String s)
    {
        addToPayload("click_name", s);
        return this;
    }

    public EventLoggerEventData clickObject(String s)
    {
        addToPayload("click_object", s);
        return this;
    }

    public EventLoggerEventData clickTarget(String s)
    {
        addToPayload("click_target", s);
        return this;
    }

    public EventLoggerEventData connectionType(String s)
    {
        addToPayload("connection_type", s);
        return this;
    }

    public EventLoggerEventData consumerSubsPlan(String s)
    {
        addToPayload("consumer_subs_plan", s);
        return this;
    }

    public EventLoggerEventData duration(long l)
    {
        addToPayload("duration", String.valueOf(l));
        return this;
    }

    public final boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (!(obj instanceof EventLoggerEventData))
            {
                return false;
            }
            obj = (EventLoggerEventData)obj;
            if (!MoreObjects.equal(event, ((EventLoggerEventData) (obj)).event) || !MoreObjects.equal(version, ((EventLoggerEventData) (obj)).version) || !MoreObjects.equal(payload, ((EventLoggerEventData) (obj)).payload))
            {
                return false;
            }
        }
        return true;
    }

    public EventLoggerEventData errorCode(String s)
    {
        addToPayload("errorCode", s);
        return this;
    }

    public EventLoggerEventData eventStage(String s)
    {
        addToPayload("event_stage", s);
        return this;
    }

    public EventLoggerEventData eventType(String s)
    {
        addToPayload("event_type", s);
        return this;
    }

    public EventLoggerEventData experiment(String s, int i)
    {
        addToPayload(s, i);
        return this;
    }

    public EventLoggerEventData externalMedia(String s)
    {
        addToPayload("external_media", s);
        return this;
    }

    public EventLoggerEventData format(String s)
    {
        addToPayload("format", s);
        return this;
    }

    public final int hashCode()
    {
        return MoreObjects.hashCode(new Object[] {
            event, version, payload
        });
    }

    public EventLoggerEventData host(String s)
    {
        addToPayload("host", s);
        return this;
    }

    public EventLoggerEventData impressionCategory(String s)
    {
        addToPayload("impression_category", s);
        return this;
    }

    public EventLoggerEventData impressionName(String s)
    {
        addToPayload("impression_name", s);
        return this;
    }

    public EventLoggerEventData impressionObject(String s)
    {
        addToPayload("impression_object", s);
        return this;
    }

    public EventLoggerEventData inLikes(boolean flag)
    {
        addToPayload("in_likes", flag);
        return this;
    }

    public EventLoggerEventData inPlaylist(Urn urn)
    {
        addToPayload("in_playlist", String.valueOf(urn));
        return this;
    }

    public EventLoggerEventData inPlaylist(boolean flag)
    {
        addToPayload("in_playlist", flag);
        return this;
    }

    public EventLoggerEventData latency(long l)
    {
        addToPayload("latency", String.valueOf(l));
        return this;
    }

    public EventLoggerEventData localStoragePlayback(boolean flag)
    {
        addToPayload("local_storage_playback", flag);
        return this;
    }

    public EventLoggerEventData monetizationType(String s)
    {
        addToPayload("monetization_type", s);
        return this;
    }

    public EventLoggerEventData monetizedObject(String s)
    {
        addToPayload("monetized_object", s);
        return this;
    }

    public EventLoggerEventData os(String s)
    {
        addToPayload("os", s);
        return this;
    }

    public EventLoggerEventData pageName(String s)
    {
        addToPayload("page_name", s);
        return this;
    }

    public EventLoggerEventData pageUrn(String s)
    {
        addToPayload("page_urn", s);
        return this;
    }

    public EventLoggerEventData playerType(String s)
    {
        addToPayload("player_type", s);
        return this;
    }

    public EventLoggerEventData playheadPosition(long l)
    {
        addToPayload("playhead_position", l);
        return this;
    }

    public EventLoggerEventData playlistId(String s)
    {
        addToPayload("set_id", s);
        return this;
    }

    public EventLoggerEventData playlistPosition(int i)
    {
        addToPayload("playlist_position", i);
        return this;
    }

    public EventLoggerEventData playlistPositionV0(String s)
    {
        addToPayload("set_position", String.valueOf(s));
        return this;
    }

    public EventLoggerEventData promotedBy(String s)
    {
        addToPayload("promoted_by", s);
        return this;
    }

    public EventLoggerEventData protocol(String s)
    {
        addToPayload("protocol", s);
        return this;
    }

    public EventLoggerEventData queryPosition(int i)
    {
        addToPayload("query_position", i);
        return this;
    }

    public EventLoggerEventData queryUrn(String s)
    {
        addToPayload("query_urn", s);
        return this;
    }

    public EventLoggerEventData reason(String s)
    {
        addToPayload("reason", s);
        return this;
    }

    public EventLoggerEventData referrer(String s)
    {
        addToPayload("referrer", s);
        return this;
    }

    public EventLoggerEventData reposter(Urn urn)
    {
        addToPayload("reposted_by", String.valueOf(urn));
        return this;
    }

    public EventLoggerEventData sound(String s)
    {
        addToPayload("sound", s);
        return this;
    }

    public EventLoggerEventData source(String s)
    {
        addToPayload("source", s);
        return this;
    }

    public EventLoggerEventData sourceVersion(String s)
    {
        addToPayload("source_version", s);
        return this;
    }

    public String toString()
    {
        return MoreObjects.toStringHelper(this).add("event", event).add("version", version).add("payload", payload).toString();
    }

    public EventLoggerEventData track(Urn urn)
    {
        addToPayload("track", String.valueOf(urn));
        return this;
    }

    public EventLoggerEventData trackLength(long l)
    {
        addToPayload("track_length", l);
        return this;
    }

    public EventLoggerEventData trackOwner(Urn urn)
    {
        addToPayload("track_owner", String.valueOf(urn));
        return this;
    }

    public EventLoggerEventData trigger(String s)
    {
        addToPayload("trigger", s);
        return this;
    }

    public EventLoggerEventData type(String s)
    {
        addToPayload("type", s);
        return this;
    }

    public EventLoggerEventData url(String s)
    {
        addToPayload("url", s);
        return this;
    }
}
