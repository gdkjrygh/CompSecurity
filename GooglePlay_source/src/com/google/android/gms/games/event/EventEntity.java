// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    final String mDescription;
    final String mEventId;
    final String mFormattedValue;
    final Uri mIconImageUri;
    final String mIconImageUrl;
    final boolean mIsVisible;
    final String mName;
    final PlayerEntity mPlayer;
    final long mValue;
    final int mVersionCode;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        mVersionCode = i;
        mEventId = s;
        mName = s1;
        mDescription = s2;
        mIconImageUri = uri;
        mIconImageUrl = s3;
        mPlayer = new PlayerEntity(player);
        mValue = l;
        mFormattedValue = s4;
        mIsVisible = flag;
    }

    public EventEntity(Event event)
    {
        mVersionCode = 1;
        mEventId = event.getEventId();
        mName = event.getName();
        mDescription = event.getDescription();
        mIconImageUri = event.getIconImageUri();
        mIconImageUrl = event.getIconImageUrl();
        mPlayer = (PlayerEntity)event.getPlayer().freeze();
        mValue = event.getValue();
        mFormattedValue = event.getFormattedValue();
        mIsVisible = event.isVisible();
    }

    static boolean equals(Event event, Object obj)
    {
        if (obj instanceof Event)
        {
            if (event == obj)
            {
                return true;
            }
            obj = (Event)obj;
            if (Objects.equal(((Event) (obj)).getEventId(), event.getEventId()) && Objects.equal(((Event) (obj)).getName(), event.getName()) && Objects.equal(((Event) (obj)).getDescription(), event.getDescription()) && Objects.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) && Objects.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) && Objects.equal(((Event) (obj)).getPlayer(), event.getPlayer()) && Objects.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) && Objects.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()) && Objects.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible())))
            {
                return true;
            }
        }
        return false;
    }

    static int hashCode(Event event)
    {
        return Arrays.hashCode(new Object[] {
            event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible())
        });
    }

    static String toString(Event event)
    {
        return Objects.toStringHelper(event).add("Id", event.getEventId()).add("Name", event.getName()).add("Description", event.getDescription()).add("IconImageUri", event.getIconImageUri()).add("IconImageUrl", event.getIconImageUrl()).add("Player", event.getPlayer()).add("Value", Long.valueOf(event.getValue())).add("FormattedValue", event.getFormattedValue()).add("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return equals(((Event) (this)), obj);
    }

    public final volatile Object freeze()
    {
        return this;
    }

    public final String getDescription()
    {
        return mDescription;
    }

    public final String getEventId()
    {
        return mEventId;
    }

    public final String getFormattedValue()
    {
        return mFormattedValue;
    }

    public final Uri getIconImageUri()
    {
        return mIconImageUri;
    }

    public final String getIconImageUrl()
    {
        return mIconImageUrl;
    }

    public final String getName()
    {
        return mName;
    }

    public final Player getPlayer()
    {
        return mPlayer;
    }

    public final long getValue()
    {
        return mValue;
    }

    public final int hashCode()
    {
        return hashCode(((Event) (this)));
    }

    public final boolean isDataValid()
    {
        return true;
    }

    public final boolean isVisible()
    {
        return mIsVisible;
    }

    public final String toString()
    {
        return toString(((Event) (this)));
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        EventEntityCreator.writeToParcel(this, parcel, i);
    }

}
