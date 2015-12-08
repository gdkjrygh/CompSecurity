// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerRef;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntity

public final class EventRef extends d
    implements Event
{

    EventRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return EventEntity.a(this, obj);
    }

    public Event freeze()
    {
        return new EventEntity(this);
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDescription()
    {
        return getString("description");
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        a("description", chararraybuffer);
    }

    public String getEventId()
    {
        return getString("external_event_id");
    }

    public String getFormattedValue()
    {
        return getString("formatted_value");
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        a("formatted_value", chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return aw("icon_image_uri");
    }

    public String getIconImageUrl()
    {
        return getString("icon_image_url");
    }

    public String getName()
    {
        return getString("name");
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        a("name", chararraybuffer);
    }

    public Player getPlayer()
    {
        return new PlayerRef(DG, EC);
    }

    public long getValue()
    {
        return getLong("value");
    }

    public int hashCode()
    {
        return EventEntity.a(this);
    }

    public boolean isVisible()
    {
        return getBoolean("visibility");
    }

    public String toString()
    {
        return EventEntity.b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        ((EventEntity)freeze()).writeToParcel(parcel, i);
    }
}
