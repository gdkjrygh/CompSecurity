// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import java.util.ArrayList;

public interface GameRequest
    extends Parcelable, d
{

    public abstract int a(String s);

    public abstract String b();

    public abstract Game c();

    public abstract Player d();

    public abstract ArrayList e();

    public abstract byte[] f();

    public abstract int g();

    public abstract long h();

    public abstract long i();
}
