// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.b;
import com.google.android.gms.internal.fo;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotification

public final class GameNotificationRef extends b
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

    public String hp()
    {
        return getString("notification_id");
    }

    public String hq()
    {
        return getString("ticker");
    }

    public String hr()
    {
        return getString("coalesced_text");
    }

    public boolean hs()
    {
        return getInteger("acknowledged") > 0;
    }

    public boolean ht()
    {
        return getInteger("alert_level") == 0;
    }

    public String toString()
    {
        return fo.e(this).a("Id", Long.valueOf(getId())).a("NotificationId", hp()).a("Type", Integer.valueOf(getType())).a("Title", getTitle()).a("Ticker", hq()).a("Text", getText()).a("CoalescedText", hr()).a("isAcknowledged", Boolean.valueOf(hs())).a("isSilent", Boolean.valueOf(ht())).toString();
    }
}
