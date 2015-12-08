// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.game;

import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

public interface ExtendedGame
    extends Parcelable, Freezable
{

    public abstract ArrayList gW();

    public abstract int gX();

    public abstract boolean gY();

    public abstract int gZ();

    public abstract Game getGame();

    public abstract long ha();

    public abstract long hb();

    public abstract String hc();

    public abstract long hd();

    public abstract String he();
}
