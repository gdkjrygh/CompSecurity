// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import android.net.Uri;
import com.google.android.gms.common.data.DataBufferRef;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.internal.Objects;

// Referenced classes of package com.google.android.gms.games.internal.notification:
//            GameNotification

public final class GameNotificationRef extends DataBufferRef
    implements GameNotification
{

    GameNotificationRef(DataHolder dataholder, int i)
    {
        super(dataholder, i);
    }

    public final String getApplicationId()
    {
        return getString("external_game_id");
    }

    public final String getCoalescedText()
    {
        return getString("coalesced_text");
    }

    public final long getId()
    {
        return getLong("_id");
    }

    public final Uri getImageUri()
    {
        return parseUri("image_uri");
    }

    public final String getNotificationId()
    {
        return getString("notification_id");
    }

    public final String getText()
    {
        return getString("text");
    }

    public final String getTicker()
    {
        return getString("ticker");
    }

    public final String getTitle()
    {
        return getString("title");
    }

    public final int getType()
    {
        return getInteger("type");
    }

    public final boolean isAcknowledged()
    {
        return getInteger("acknowledged") > 0;
    }

    public final boolean isSilent()
    {
        return getInteger("alert_level") == 0;
    }

    public final String toString()
    {
        return Objects.toStringHelper(this).add("Id", Long.valueOf(getLong("_id"))).add("NotificationId", getString("notification_id")).add("Type", Integer.valueOf(getInteger("type"))).add("Title", getString("title")).add("Ticker", getString("ticker")).add("Text", getString("text")).add("CoalescedText", getString("coalesced_text")).add("isAcknowledged", Boolean.valueOf(isAcknowledged())).add("isSilent", Boolean.valueOf(isSilent())).toString();
    }
}
