// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcelable;
import com.google.android.gms.common.data.d;
import com.google.android.gms.games.Player;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            ParticipantResult

public interface Participant
    extends Parcelable, d
{

    public abstract int b();

    public abstract String c();

    public abstract int d();

    public abstract boolean e();

    public abstract String f();

    public abstract Uri g();

    public abstract String h();

    public abstract Uri i();

    public abstract String j();

    public abstract String k();

    public abstract Player l();

    public abstract ParticipantResult m();
}
