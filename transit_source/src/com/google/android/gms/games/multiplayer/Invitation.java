// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participatable, Participant

public interface Invitation
    extends Parcelable, Freezable, Participatable
{

    public abstract int ch();

    public abstract long getCreationTimestamp();

    public abstract Game getGame();

    public abstract String getInvitationId();

    public abstract Participant getInviter();

    public abstract int getVariant();
}
