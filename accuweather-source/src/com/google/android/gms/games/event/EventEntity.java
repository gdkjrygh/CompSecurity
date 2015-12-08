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
import com.google.android.gms.internal.hl;
import com.google.android.gms.internal.il;

// Referenced classes of package com.google.android.gms.games.event:
//            Event, EventEntityCreator

public final class EventEntity
    implements SafeParcelable, Event
{

    public static final EventEntityCreator CREATOR = new EventEntityCreator();
    private final String Mm;
    private final Uri Mo;
    private final String Mz;
    private final String Nf;
    private final PlayerEntity Ng;
    private final long Nh;
    private final String Ni;
    private final boolean Nj;
    private final String mName;
    private final int xJ;

    EventEntity(int i, String s, String s1, String s2, Uri uri, String s3, Player player, 
            long l, String s4, boolean flag)
    {
        xJ = i;
        Nf = s;
        mName = s1;
        Mm = s2;
        Mo = uri;
        Mz = s3;
        Ng = new PlayerEntity(player);
        Nh = l;
        Ni = s4;
        Nj = flag;
    }

    public EventEntity(Event event)
    {
        xJ = 1;
        Nf = event.getEventId();
        mName = event.getName();
        Mm = event.getDescription();
        Mo = event.getIconImageUri();
        Mz = event.getIconImageUrl();
        Ng = (PlayerEntity)event.getPlayer().freeze();
        Nh = event.getValue();
        Ni = event.getFormattedValue();
        Nj = event.isVisible();
    }

    static int a(Event event)
    {
        return hl.hashCode(new Object[] {
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
        if (!hl.equal(((Event) (obj)).getEventId(), event.getEventId()) || !hl.equal(((Event) (obj)).getName(), event.getName()) || !hl.equal(((Event) (obj)).getDescription(), event.getDescription()) || !hl.equal(((Event) (obj)).getIconImageUri(), event.getIconImageUri()) || !hl.equal(((Event) (obj)).getIconImageUrl(), event.getIconImageUrl()) || !hl.equal(((Event) (obj)).getPlayer(), event.getPlayer()) || !hl.equal(Long.valueOf(((Event) (obj)).getValue()), Long.valueOf(event.getValue())) || !hl.equal(((Event) (obj)).getFormattedValue(), event.getFormattedValue()))
        {
            break; /* Loop/switch isn't completed */
        }
        flag = flag1;
        if (hl.equal(Boolean.valueOf(((Event) (obj)).isVisible()), Boolean.valueOf(event.isVisible()))) goto _L4; else goto _L5
_L5:
        return false;
    }

    static String b(Event event)
    {
        return hl.e(event).a("Id", event.getEventId()).a("Name", event.getName()).a("Description", event.getDescription()).a("IconImageUri", event.getIconImageUri()).a("IconImageUrl", event.getIconImageUrl()).a("Player", event.getPlayer()).a("Value", Long.valueOf(event.getValue())).a("FormattedValue", event.getFormattedValue()).a("isVisible", Boolean.valueOf(event.isVisible())).toString();
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
        return Mm;
    }

    public void getDescription(CharArrayBuffer chararraybuffer)
    {
        il.b(Mm, chararraybuffer);
    }

    public String getEventId()
    {
        return Nf;
    }

    public String getFormattedValue()
    {
        return Ni;
    }

    public void getFormattedValue(CharArrayBuffer chararraybuffer)
    {
        il.b(Ni, chararraybuffer);
    }

    public Uri getIconImageUri()
    {
        return Mo;
    }

    public String getIconImageUrl()
    {
        return Mz;
    }

    public String getName()
    {
        return mName;
    }

    public void getName(CharArrayBuffer chararraybuffer)
    {
        il.b(mName, chararraybuffer);
    }

    public Player getPlayer()
    {
        return Ng;
    }

    public long getValue()
    {
        return Nh;
    }

    public int getVersionCode()
    {
        return xJ;
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
        return Nj;
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
