// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.notification;

import android.net.Uri;

public interface GameNotification
{

    public abstract String getApplicationId();

    public abstract String getCoalescedText();

    public abstract long getId();

    public abstract Uri getImageUri();

    public abstract String getNotificationId();

    public abstract String getText();

    public abstract String getTicker();

    public abstract String getTitle();

    public abstract int getType();

    public abstract boolean isAcknowledged();

    public abstract boolean isSilent();
}
