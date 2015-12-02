// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.video.analytics;

import android.os.Parcel;
import android.os.ParcelFormatException;
import android.os.Parcelable;
import com.facebook.common.json.FbObjectMapper;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.node.ArrayNode;
import java.io.IOException;

// Referenced classes of package com.facebook.video.analytics:
//            ChannelEligibility

public class VideoFeedStoryInfo
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private ArrayNode a;
    private VideoAnalytics.EventTriggerType b;
    private ChannelEligibility c;
    private boolean d;

    public VideoFeedStoryInfo()
    {
        b = VideoAnalytics.EventTriggerType.UNSET;
        c = ChannelEligibility.NO_INFO;
    }

    private VideoFeedStoryInfo(Parcel parcel)
    {
        b = VideoAnalytics.EventTriggerType.UNSET;
        c = ChannelEligibility.NO_INFO;
        com.fasterxml.jackson.databind.JsonNode jsonnode;
        boolean flag;
        try
        {
            jsonnode = FbObjectMapper.i().a(parcel.readString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new ParcelFormatException((new StringBuilder("Could not parse parcel ")).append(parcel.toString()).toString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new ParcelFormatException((new StringBuilder("Could not parse parcel ")).append(parcel.toString()).toString());
        }
        a = (ArrayNode)jsonnode;
        b = VideoAnalytics.EventTriggerType.asEventTriggerType(parcel.readString());
        c = ChannelEligibility.valueOf(parcel.readString());
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
    }

    VideoFeedStoryInfo(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    public VideoFeedStoryInfo(Builder builder)
    {
        b = VideoAnalytics.EventTriggerType.UNSET;
        c = ChannelEligibility.NO_INFO;
        a = builder.a;
        b = builder.b;
        c = builder.c;
        d = builder.d;
    }

    public final ArrayNode a()
    {
        return a;
    }

    public final void a(VideoAnalytics.EventTriggerType eventtriggertype)
    {
        b = eventtriggertype;
    }

    public final void a(ArrayNode arraynode, VideoAnalytics.EventTriggerType eventtriggertype, ChannelEligibility channeleligibility, boolean flag)
    {
        a = arraynode;
        b = eventtriggertype;
        c = channeleligibility;
        d = flag;
    }

    public final VideoAnalytics.EventTriggerType b()
    {
        return b;
    }

    public final ChannelEligibility c()
    {
        return c;
    }

    public final boolean d()
    {
        return d;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(a.toString());
        parcel.writeString(b.value);
        parcel.writeString(c.value);
        if (d)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeByte((byte)i);
    }


    private class Builder
    {

        public final ArrayNode a;
        public VideoAnalytics.EventTriggerType b;
        public ChannelEligibility c;
        public boolean d;

        public final Builder a(ChannelEligibility channeleligibility)
        {
            c = channeleligibility;
            return this;
        }

        public final Builder a(VideoAnalytics.EventTriggerType eventtriggertype)
        {
            b = eventtriggertype;
            return this;
        }

        public final Builder a(boolean flag)
        {
            d = flag;
            return this;
        }

        public final VideoFeedStoryInfo a()
        {
            return new VideoFeedStoryInfo(this);
        }

        public Builder(ArrayNode arraynode)
        {
            b = VideoAnalytics.EventTriggerType.BY_USER;
            c = ChannelEligibility.NO_INFO;
            d = false;
            a = arraynode;
        }
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        private static VideoFeedStoryInfo a(Parcel parcel)
        {
            return new VideoFeedStoryInfo(parcel, (byte)0);
        }

        private static VideoFeedStoryInfo[] a(int i)
        {
            return new VideoFeedStoryInfo[i];
        }

        public final Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public final Object[] newArray(int i)
        {
            return a(i);
        }

        _cls1()
        {
        }
    }

}
