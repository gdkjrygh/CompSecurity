// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.d;
import com.google.android.gms.internal.hk;

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

    public String ik()
    {
        return getString("notification_id");
    }

    public String il()
    {
        return getString("ticker");
    }

    public String im()
    {
        return getString("coalesced_text");
    }

    public boolean in()
    {
        return getInteger("acknowledged") > 0;
    }

    public boolean io()
    {
        return getInteger("alert_level") == 0;
    }

    public String toString()
    {
        return hk.e(this).a("Id", Long.valueOf(getId())).a("NotificationId", ik()).a("Type", Integer.valueOf(getType())).a("Title", getTitle()).a("Ticker", il()).a("Text", getText()).a("CoalescedText", im()).a("isAcknowledged", Boolean.valueOf(in())).a("isSilent", Boolean.valueOf(io())).toString();
    }
}
