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

    public abstract ArrayList hQ();

    public abstract int hR();

    public abstract boolean hS();

    public abstract int hT();

    public abstract long hU();

    public abstract long hV();

    public abstract String hW();

    public abstract long hX();

    public abstract String hY();

    public abstract SnapshotMetadata hZ();
}
