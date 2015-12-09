// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;

public interface Player
    extends Parcelable, Freezable
{

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getHiResImageUri();

    public abstract String getHiResImageUrl();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract long getLastPlayedWithTimestamp();

    public abstract String getPlayerId();

    public abstract long getRetrievedTimestamp();

    public abstract int gh();

    public abstract boolean hasHiResImage();

    public abstract boolean hasIconImage();
}
