// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.multiplayer.Invitation;
import com.google.android.gms.games.multiplayer.InvitationEntity;
import com.google.android.gms.games.multiplayer.Participant;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            iu, fq

public final class gy
    implements SafeParcelable, Invitation
{

    public static final iu a = new iu();
    private final int b;
    private final ArrayList c;

    gy(int i1, ArrayList arraylist)
    {
        b = i1;
        c = arraylist;
        l();
    }

    private void l()
    {
        Invitation invitation;
        int j1;
        boolean flag;
        if (!c.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag);
        invitation = (Invitation)c.get(0);
        j1 = c.size();
        for (int i1 = 1; i1 < j1; i1++)
        {
            Invitation invitation1 = (Invitation)c.get(i1);
            fq.a(invitation.d().equals(invitation1.d()), "All the invitations must be from the same inviter");
        }

    }

    public final volatile Object a()
    {
        return this;
    }

    public final Game b()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final String c()
    {
        return ((InvitationEntity)c.get(0)).c();
    }

    public final Participant d()
    {
        return ((InvitationEntity)c.get(0)).d();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof gy))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (gy)obj;
        if (((gy) (obj)).c.size() != c.size())
        {
            return false;
        }
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (!((Invitation)c.get(i1)).equals((Invitation)((gy) (obj)).c.get(i1)))
            {
                return false;
            }
        }

        return true;
    }

    public final int f()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int g()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int h()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int hashCode()
    {
        return Arrays.hashCode(c.toArray());
    }

    public final int i()
    {
        return b;
    }

    public final ArrayList j()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final ArrayList k()
    {
        return new ArrayList(c);
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        iu.a(this, parcel);
    }

}
