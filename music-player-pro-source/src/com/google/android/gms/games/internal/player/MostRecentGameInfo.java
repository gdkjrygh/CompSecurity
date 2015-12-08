// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.internal.player;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface MostRecentGameInfo
    extends Parcelable, Freezable
{

    public abstract Uri mA();

    public abstract Uri mB();

    public abstract String mw();

    public abstract String mx();

    public abstract long my();

    public abstract Uri mz();
}
