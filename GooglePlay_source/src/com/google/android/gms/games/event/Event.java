// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.event;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

public interface Event
    extends Parcelable, Freezable
{

    public abstract String getDescription();

    public abstract String getEventId();

    public abstract String getFormattedValue();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract String getName();

    public abstract Player getPlayer();

    public abstract long getValue();

    public abstract boolean isVisible();
}
