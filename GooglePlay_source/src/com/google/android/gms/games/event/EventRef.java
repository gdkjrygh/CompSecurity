// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntity

public final class EventRef extends DataBufferRef
    implements Event
{

    private Event freeze()
    {
        return new EventEntity(this);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean equals(Object obj)
    {
        return EventEntity.equals(this, obj);
    }

    public final volatile Object freeze()
    {
        return freeze();
    }

    public final String getDescription()
    {
        return getString("description");
    }

    public final String getEventId()
    {
        return getString("external_event_id");
    }

    public final String getFormattedValue()
    {
        return getString("formatted_value");
    }

    public final Uri getIconImageUri()
    {
        return parseUri("icon_image_uri");
    }

    public final String getIconImageUrl()
    {
        return getString("icon_image_url");
    }

    public final String getName()
    {
        return getString("name");
    }

    public final Player getPlayer()
    {
        return new PlayerRef(mDataHolder, mDataRow);
    }

    public final long getValue()
    {
        return getLong("value");
    }

    public final int hashCode()
    {
        return EventEntity.hashCode(this);
    }

    public final boolean isVisible()
    {
        return getBoolean("visibility");
    }

    public final String toString()
    {
        return EventEntity.toString(this);
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        ((EventEntity)freeze()).writeToParcel(parcel, i);
    }
}
