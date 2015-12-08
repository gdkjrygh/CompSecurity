// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.f;

public interface TurnBasedMatch
    extends Parcelable, d, f
{

    public static final int a[] = {
        0, 1, 2, 3
    };

    public abstract Game b();

    public abstract String c();

    public abstract String d();

    public abstract long e();

    public abstract int f();

    public abstract int g();

    public abstract String h();

    public abstract int i();

    public abstract String k();

    public abstract long l();

    public abstract String m();

    public abstract byte[] n();

    public abstract int o();

    public abstract String p();

    public abstract byte[] q();

    public abstract int r();

    public abstract Bundle s();

    public abstract int t();

    public abstract boolean u();

    public abstract String v();

}
