// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.spotify.mobile.android.spotlets.ads.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.mobile.android.cosmos.JacksonModel;

// Referenced classes of package com.spotify.mobile.android.spotlets.ads.model:
//            Format, Ad

public class AdEvent
    implements Parcelable, JacksonModel
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new AdEvent(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AdEvent[i];
        }

    };
    private final Ad mAd;
    private final Event mEvent;
    private final String mEventString;
    private final Format mFormat;
    private final String mFormatString;

    private AdEvent(Parcel parcel)
    {
        mEventString = parcel.readString();
        mEvent = Event.getByName(mEventString);
        mFormatString = parcel.readString();
        mFormat = Format.getByName(mFormatString);
        mAd = (Ad)parcel.readParcelable(getClass().getClassLoader());
    }


    public AdEvent(String s, String s1, Ad ad)
    {
        mEventString = s;
        mEvent = Event.getByName(mEventString);
        mFormatString = s1;
        mFormat = Format.getByName(mFormatString);
        mAd = ad;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (AdEvent)obj;
            if (!mAd.equals(((AdEvent) (obj)).mAd))
            {
                return false;
            }
            if (!mEvent.equals(((AdEvent) (obj)).mEvent))
            {
                return false;
            }
            if (!mFormat.equals(((AdEvent) (obj)).mFormat))
            {
                return false;
            }
        }
        return true;
    }

    public Ad getAd()
    {
        return mAd;
    }

    public Event getEvent()
    {
        return mEvent;
    }

    public Format getFormat()
    {
        return mFormat;
    }

    public int hashCode()
    {
        return (mEvent.hashCode() * 31 + mFormat.hashCode()) * 31 + mAd.hashCode();
    }

    public String toString()
    {
        return (new StringBuilder("AdEvent{mEvent=")).append(mEvent).append(", mFormat=").append(mFormat).append(", mAd=").append(mAd).append('}').toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(mEventString);
        parcel.writeString(mFormatString);
        parcel.writeParcelable(mAd, 0);
    }


    private class Event extends Enum
        implements JacksonModel
    {

        private static final Event $VALUES[];
        public static final Event AVAILABLE;
        public static final Event DISCARD;
        public static final Event DISPLAY;
        public static final Event PLAY;
        public static final Event UNKNOWN;
        private static Map sNameMap;
        private final String mName;

        public static Event getByName(String s)
        {
            return (Event)sNameMap.get(s);
        }

        public static Event valueOf(String s)
        {
            return (Event)Enum.valueOf(com/spotify/mobile/android/spotlets/ads/model/AdEvent$Event, s);
        }

        public static Event[] values()
        {
            return (Event[])$VALUES.clone();
        }

        public final String getName()
        {
            return mName;
        }

        static 
        {
            AVAILABLE = new Event("AVAILABLE", 0, "available");
            DISCARD = new Event("DISCARD", 1, "discard");
            PLAY = new Event("PLAY", 2, "play");
            DISPLAY = new Event("DISPLAY", 3, "display");
            UNKNOWN = new Event("UNKNOWN", 4, "unknown");
            $VALUES = (new Event[] {
                AVAILABLE, DISCARD, PLAY, DISPLAY, UNKNOWN
            });
            sNameMap = new HashMap();
            Event event;
            for (Iterator iterator = EnumSet.allOf(com/spotify/mobile/android/spotlets/ads/model/AdEvent$Event).iterator(); iterator.hasNext(); sNameMap.put(event.getName(), event))
            {
                event = (Event)iterator.next();
            }

        }

        private Event(String s, int i, String s1)
        {
            super(s, i);
            mName = s1;
        }
    }

}
