// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.multiplayer.Participatable;

public interface Room
    extends Parcelable, Freezable, Participatable
{

    public abstract Bundle getAutoMatchCriteria();

    public abstract int getAutoMatchWaitEstimateSeconds();

    public abstract long getCreationTimestamp();

    public abstract String getCreatorId();

    public abstract String getDescription();

    public abstract String getParticipantId(String s);

    public abstract String getRoomId();

    public abstract int getStatus();

    public abstract int getVariant();
}
