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
import com.google.android.gms.internal.jv;
import com.google.android.gms.internal.le;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final int CK;
    private final String UO;
    private final Uri WD;
    private final String WO;
    private final PlayerEntity XE;
    private final String Ye;
    private final long Yf;
    private final String Yg;
    private final boolean Yh;
    private final String mName;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        CK = i;
        Ye = s;
        mName = s1;
        UO = s2;
        WD = uri;
        WO = s3;
        XE = new PlayerEntity(player);
        Yf = l;
        Yg = s4;
        Yh = flag;
    }

    public EventEntity(Event event)
    {
        CK = 1;
        Ye = event.getEventId();
        mName = event.getName();
        UO = event.getDescription();
        WD = event.getIconImageUri();
        WO = event.getIconImageUrl();
        XE = (PlayerEntity)event.getPlayer().freeze();
        Yf = event.getValue();
        Yg = event.getFormattedValue();
        Yh = event.isVisible();
    }

    static int a(Event event)
    {
        return jv.hashCode(new Object[] {
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
        if (!jv.equal(((Event) (obj)).getEventId(), event.getEventId()) || !jv.equal(((Event) (obj)).getName(), event.getName()) || !jv.equal(((Event) (obj)).getDescription(), event.getDescription()) || !jv.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !jv.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !jv.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !jv.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !jv.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (jv.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Event event)
    {
        return jv.h(event).a("Id", event.getEventId()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.getIconImageUri()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.getPlayer()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.getFormattedValue()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
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
        return UO;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        le.b(UO, chararraybuffer);
    }

    public String getEventId()
    {
        return Ye;
    }

    public String getFormattedValue()
    {
        return Yg;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        le.b(Yg, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return WD;
    }

    public String getIconImageUrl()
    {
        return WO;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        le.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return XE;
    }

    public long getValue()
    {
        return Yf;
    }

    public int getVersionCode()
    {
        return CK;
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
        return Yh;
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
