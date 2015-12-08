// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.common.internal.n;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotification

public final class GameNotificationRef extends d
    implements GameNotification
{

    GameNotificationRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public long getId()
    {
        return getLong("_id");
    }

    public String getText()
    {
        return getString("text");
    }

    public String getTitle()
    {
        return getString("title");
    }

    public int getType()
    {
        return getInteger("type");
    }

    public String lk()
    {
        return getString("notification_id");
    }

    public String ll()
    {
        return getString("ticker");
    }

    public String lm()
    {
        return getString("coalesced_text");
    }

    public boolean ln()
    {
        return getInteger("acknowledged") > 0;
    }

    public boolean lo()
    {
        return getInteger("alert_level") == 0;
    }

    public String toString()
    {
        return n.h(this).a("Id", Long.valueOf(getId())).a("NotificationId", lk()).a("Type", Integer.valueOf(getType())).a("Title", getTitle()).a("Ticker", ll()).a("Text", getText()).a("CoalescedText", lm()).a("isAcknowledged", Boolean.valueOf(ln())).a("isSilent", Boolean.valueOf(lo())).toString();
    }
}
