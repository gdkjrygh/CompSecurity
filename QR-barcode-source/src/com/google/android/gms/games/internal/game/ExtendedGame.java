// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.snapshot.SnapshotMetadata;
import java.util.ArrayList;

public interface ExtendedGame
    extends Parcelable, Freezable
{

    public abstract Game getGame();

    public abstract ArrayList kR();

    public abstract int kS();

    public abstract boolean kT();

    public abstract int kU();

    public abstract long kV();

    public abstract long kW();

    public abstract String kX();

    public abstract long kY();

    public abstract String kZ();

    public abstract SnapshotMetadata la();
}
