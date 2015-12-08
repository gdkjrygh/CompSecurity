// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.internal.player.MostRecentGameInfo;

// Referenced classes of package com.google.android.gms.games:
//            PlayerLevelInfo

public interface Player
    extends Parcelable, Freezable
{

    public static final long CURRENT_XP_UNKNOWN = -1L;
    public static final long TIMESTAMP_UNKNOWN = -1L;

    public abstract int gS();

    public abstract boolean gT();

    public abstract MostRecentGameInfo gU();

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getHiResImageUri();

    public abstract String getHiResImageUrl();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract long getLastPlayedWithTimestamp();

    public abstract PlayerLevelInfo getLevelInfo();

    public abstract String getPlayerId();

    public abstract long getRetrievedTimestamp();

    public abstract String getTitle();

    public abstract void getTitle(CharArrayBuffer chararraybuffer);

    public abstract boolean hasHiResImage();

    public abstract boolean hasIconImage();
}
