// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.n;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.jv;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final int BR;
    private final String Tr;
    private final Uri Vh;
    private final String Vs;
    private final PlayerEntity Wh;
    private final String Wm;
    private final long Wn;
    private final String Wo;
    private final boolean Wp;
    private final String mName;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        BR = i;
        Wm = s;
        mName = s1;
        Tr = s2;
        Vh = uri;
        Vs = s3;
        Wh = new PlayerEntity(player);
        Wn = l;
        Wo = s4;
        Wp = flag;
    }

    public EventEntity(Event event)
    {
        BR = 1;
        Wm = event.getEventId();
        mName = event.getName();
        Tr = event.getDescription();
        Vh = event.getIconImageUri();
        Vs = event.getIconImageUrl();
        Wh = (PlayerEntity)event.getPlayer().freeze();
        Wn = event.getValue();
        Wo = event.getFormattedValue();
        Wp = event.isVisible();
    }

    static int a(Event event)
    {
        return n.hashCode(new Object[] {
            event.getEventId(), event.getName(), event.getDescription(), event.getIconImageUri(), event.getIconImageUrl(), event.getPlayer(), Long.valueOf(event.getValue()), event.getFormattedValue(), Boolean.valueOf(event.isVisible())
        });
    }

    static boolean a(Event event, Object obj)
    {
        boolean flag1 = true;
        if (obj instanceof Event) goto _L2; else goto _L1
_L1:
        boolean flag = false;
_L4:
        return flag;
_L2:
        flag = flag1;
        if (event == obj) goto _L4; else goto _L3
_L3:
        obj = (Event)obj;
        if (!n.equal(((Event) (obj)).getEventId(), event.getEventId()) || !n.equal(((Event) (obj)).getName(), event.getName()) || !n.equal(((Event) (obj)).getDescription(), event.getDescription()) || !n.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !n.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !n.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !n.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !n.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (n.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Event event)
    {
        return n.h(event).a("Id", event.getEventId()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.getIconImageUri()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.getPlayer()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.getFormattedValue()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public Event freeze()
    {
        return this;
    }

    public volatile Object freeze()
    {
        return freeze();
    }

    public String getDescription()
    {
        return Tr;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        jv.b(Tr, chararraybuffer);
    }

    public String getEventId()
    {
        return Wm;
    }

    public String getFormattedValue()
    {
        return Wo;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        jv.b(Wo, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return Vh;
    }

    public String getIconImageUrl()
    {
        return Vs;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        jv.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return Wh;
    }

    public long getValue()
    {
        return Wn;
    }

    public int getVersionCode()
    {
        return BR;
    }

    public int hashCode()
    {
        return a(this);
    }

    public boolean isDataValid()
    {
        return true;
    }

    public boolean isVisible()
    {
        return Wp;
    }

    public String toString()
    {
        return b(this);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        EventEntityCreator.a(this, parcel, i);
    }

}
