// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nbcsports.liveextra.library.api.models;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import java.io.Serializable;
import java.lang.reflect.Type;
import java.util.Locale;
import org.joda.time.DateTime;
import org.joda.time.DateTimeZone;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

// Referenced classes of package com.nbcsports.liveextra.library.api.models:
//            NbcDateParcelablePlease

public class NbcDate
    implements Parcelable, Serializable
{
    public static class TypeAdapter
        implements JsonDeserializer
    {

        public NbcDate deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
            throws JsonParseException
        {
            return new NbcDate(jsonelement.getAsString());
        }

        public volatile Object deserialize(JsonElement jsonelement, Type type, JsonDeserializationContext jsondeserializationcontext)
            throws JsonParseException
        {
            return deserialize(jsonelement, type, jsondeserializationcontext);
        }

        public TypeAdapter()
        {
        }
    }


    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public NbcDate createFromParcel(Parcel parcel)
        {
            NbcDate nbcdate = new NbcDate();
            NbcDateParcelablePlease.readFromParcel(nbcdate, parcel);
            return nbcdate;
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public NbcDate[] newArray(int i)
        {
            return new NbcDate[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    };
    DateTime date;
    String rawDate;

    public NbcDate()
    {
    }

    public NbcDate(Parcel parcel)
    {
    }

    public NbcDate(String s)
    {
        rawDate = s;
    }

    private DateTimeFormatter getAltNbcFormatter()
    {
        return DateTimeFormat.forPattern("MM/dd/yyyy HH:mm").withZone(DateTimeZone.forID("US/Eastern"));
    }

    private DateTimeFormatter getDisplayDateFormatter(Locale locale)
    {
        return DateTimeFormat.forPattern("MM/dd - EEEE").withLocale(locale);
    }

    private DateTimeFormatter getDisplayDateTimeFormatter(Locale locale)
    {
        return DateTimeFormat.forPattern("EEEE, MM/dd - hh:mm a zzz").withLocale(locale);
    }

    private DateTimeFormatter getListHeaderDateFormatter(Locale locale)
    {
        return DateTimeFormat.forPattern("E - MM/dd ").withLocale(locale);
    }

    private DateTimeFormatter getNbcFormatter()
    {
        return DateTimeFormat.forPattern("yyyyMMdd-HHmm").withZoneUTC();
    }

    public int describeContents()
    {
        return 0;
    }

    public DateTime getDateTime()
    {
        if (date == null)
        {
            try
            {
                date = DateTime.parse(rawDate, getNbcFormatter());
            }
            catch (IllegalArgumentException illegalargumentexception)
            {
                try
                {
                    date = DateTime.parse(rawDate, getAltNbcFormatter());
                }
                catch (IllegalArgumentException illegalargumentexception1) { }
            }
        }
        return date;
    }

    public String getDisplayDate(Locale locale)
    {
        return getDisplayDateFormatter(locale).withZone(DateTimeZone.getDefault()).print(getDateTime()).replace('-', '\267');
    }

    public String getDisplayDateTime(Locale locale)
    {
        return getDisplayDateTimeFormatter(locale).withZone(DateTimeZone.getDefault()).print(getDateTime()).replace('-', '\267');
    }

    public String getDisplayTime(Locale locale)
    {
        return getDisplayTimeFormatter(locale).withZone(DateTimeZone.getDefault()).print(getDateTime()).replace('-', '\267');
    }

    public DateTimeFormatter getDisplayTimeFormatter(Locale locale)
    {
        return DateTimeFormat.forPattern("hh:mm a zzz").withLocale(locale);
    }

    public String getListHeaderDate(Locale locale)
    {
        return getListHeaderDateFormatter(locale).withZone(DateTimeZone.getDefault()).print(getDateTime()).replace('-', '\267');
    }

    public long getTime()
    {
        return getDateTime().getMillis();
    }

    public boolean isToday()
    {
        return getDateTime().withZone(DateTimeZone.getDefault()).withTimeAtStartOfDay().equals(DateTime.now().withZone(DateTimeZone.getDefault()).withTimeAtStartOfDay());
    }

    public String raw()
    {
        return rawDate;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        NbcDateParcelablePlease.writeToParcel(this, parcel, i);
    }

}
