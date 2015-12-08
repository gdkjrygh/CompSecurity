// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, InvitationEntity, d, Participant

public final class b extends e
    implements Invitation
{

    private final Game c;
    private final d d;
    private final ArrayList e;

    private Invitation i()
    {
        return new InvitationEntity(this);
    }

    public final Object a()
    {
        return i();
    }

    public final Game b()
    {
        return c;
    }

    public final String c()
    {
        return e("external_invitation_id");
    }

    public final Participant d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        return Math.max(b("creation_timestamp"), b("last_modified_timestamp"));
    }

    public final boolean equals(Object obj)
    {
        return InvitationEntity.a(this, obj);
    }

    public final int f()
    {
        return c("type");
    }

    public final int g()
    {
        return c("variant");
    }

    public final int h()
    {
        if (!d("has_automatch_criteria"))
        {
            return 0;
        } else
        {
            return c("automatch_max_players");
        }
    }

    public final int hashCode()
    {
        return InvitationEntity.a(this);
    }

    public final ArrayList j()
    {
        return e;
    }

    public final String toString()
    {
        return InvitationEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        ((InvitationEntity)i()).writeToParcel(parcel, k);
    }
}
