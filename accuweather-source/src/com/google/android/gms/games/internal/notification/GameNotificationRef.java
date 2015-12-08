// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.hl;

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

    public String _mthif()
    {
        return getString("notification_id");
    }

    public String ig()
    {
        return getString("ticker");
    }

    public String ih()
    {
        return getString("coalesced_text");
    }

    public boolean ii()
    {
        return getInteger("acknowledged") > 0;
    }

    public boolean ij()
    {
        return getInteger("alert_level") == 0;
    }

    public String toString()
    {
        return hl.e(this).a("Id", Long.valueOf(getId())).a("NotificationId", _mthif()).a("Type", Integer.valueOf(getType())).a("Title", getTitle()).a("Ticker", ig()).a("Text", getText()).a("CoalescedText", ih()).a("isAcknowledged", Boolean.valueOf(ii())).a("isSilent", Boolean.valueOf(ij())).toString();
    }
}
