// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.database.CharArrayBuffer;
import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.Freezable;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResult

public interface Participant
    extends Parcelable, Freezable
{

    public static final int STATUS_DECLINED = 3;
    public static final int STATUS_FINISHED = 5;
    public static final int STATUS_INVITED = 1;
    public static final int STATUS_JOINED = 2;
    public static final int STATUS_LEFT = 4;
    public static final int STATUS_NOT_INVITED_YET = 0;
    public static final int STATUS_UNRESPONSIVE = 6;

    public abstract String gW();

    public abstract int getCapabilities();

    public abstract String getDisplayName();

    public abstract void getDisplayName(CharArrayBuffer chararraybuffer);

    public abstract Uri getHiResImageUri();

    public abstract String getHiResImageUrl();

    public abstract Uri getIconImageUri();

    public abstract String getIconImageUrl();

    public abstract String getParticipantId();

    public abstract Player getPlayer();

    public abstract ParticipantResult getResult();

    public abstract int getStatus();

    public abstract boolean isConnectedToRoom();
}
