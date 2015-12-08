// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.hk;
import com.google.android.gms.internal.ik;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final String MC;
    private final String Mp;
    private final Uri Mr;
    private final String Ni;
    private final PlayerEntity Nj;
    private final long Nk;
    private final String Nl;
    private final boolean Nm;
    private final String mName;
    private final int xM;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        xM = i;
        Ni = s;
        mName = s1;
        Mp = s2;
        Mr = uri;
        MC = s3;
        Nj = new PlayerEntity(player);
        Nk = l;
        Nl = s4;
        Nm = flag;
    }

    public EventEntity(Event event)
    {
        xM = 1;
        Ni = event.getEventId();
        mName = event.getName();
        Mp = event.getDescription();
        Mr = event.getIconImageUri();
        MC = event.getIconImageUrl();
        Nj = (PlayerEntity)event.getPlayer().freeze();
        Nk = event.getValue();
        Nl = event.getFormattedValue();
        Nm = event.isVisible();
    }

    static int a(Event event)
    {
        return hk.hashCode(new Object[] {
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
        if (!hk.equal(((Event) (obj)).getEventId(), event.getEventId()) || !hk.equal(((Event) (obj)).getName(), event.getName()) || !hk.equal(((Event) (obj)).getDescription(), event.getDescription()) || !hk.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !hk.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !hk.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !hk.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !hk.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hk.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Event event)
    {
        return hk.e(event).a("Id", event.getEventId()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.getIconImageUri()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.getPlayer()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.getFormattedValue()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
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
        return Mp;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        ik.b(Mp, chararraybuffer);
    }

    public String getEventId()
    {
        return Ni;
    }

    public String getFormattedValue()
    {
        return Nl;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        ik.b(Nl, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return Mr;
    }

    public String getIconImageUrl()
    {
        return MC;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        ik.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return Nj;
    }

    public long getValue()
    {
        return Nk;
    }

    public int getVersionCode()
    {
        return xM;
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
        return Nm;
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
