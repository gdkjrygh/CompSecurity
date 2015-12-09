// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.database.CharArrayBuffer;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.Participatable;
import java.util.ArrayList;

public interface Room
    extends Parcelable, Freezable, Participatable
{

    public static final int ROOM_STATUS_ACTIVE = 3;
    public static final int ROOM_STATUS_AUTO_MATCHING = 1;
    public static final int ROOM_STATUS_CONNECTING = 2;
    public static final int ROOM_STATUS_INVITING = 0;
    public static final int ROOM_VARIANT_DEFAULT = -1;

    public abstract Bundle getAutoMatchCriteria();

    public abstract int getAutoMatchWaitEstimateSeconds();

    public abstract long getCreationTimestamp();

    public abstract String getCreatorId();

    public abstract String getDescription();

    public abstract void getDescription(CharArrayBuffer chararraybuffer);

    public abstract Participant getParticipant(String s);

    public abstract String getParticipantId(String s);

    public abstract ArrayList getParticipantIds();

    public abstract int getParticipantStatus(String s);

    public abstract String getRoomId();

    public abstract int getStatus();

    public abstract int getVariant();
}
