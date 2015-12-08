// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.os.Parcel;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import com.google.android.gms.internal.gt;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Invitation, a, Participant, ParticipantEntity, 
//            g

public final class InvitationEntity extends fy
    implements Invitation
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final GameEntity b;
    private final String c;
    private final long d;
    private final int e;
    private final ParticipantEntity f;
    private final ArrayList g;
    private final int h;
    private final int i;

    InvitationEntity(int l, GameEntity gameentity, String s, long l1, int i1, ParticipantEntity participantentity, 
            ArrayList arraylist, int j1, int k1)
    {
        a = l;
        b = gameentity;
        c = s;
        d = l1;
        e = i1;
        f = participantentity;
        g = arraylist;
        h = j1;
        i = k1;
    }

    InvitationEntity(Invitation invitation)
    {
        a = 2;
        b = new GameEntity(invitation.b());
        c = invitation.c();
        d = invitation.e();
        e = invitation.f();
        h = invitation.g();
        i = invitation.h();
        String s = invitation.d().k();
        Object obj = null;
        ArrayList arraylist = invitation.j();
        int i1 = arraylist.size();
        g = new ArrayList(i1);
        int l = 0;
        invitation = obj;
        for (; l < i1; l++)
        {
            Participant participant = (Participant)arraylist.get(l);
            if (participant.k().equals(s))
            {
                invitation = participant;
            }
            g.add((ParticipantEntity)participant.a());
        }

        gt.a(invitation, "Must have a valid inviter!");
        f = (ParticipantEntity)invitation.a();
    }

    static int a(Invitation invitation)
    {
        return Arrays.hashCode(new Object[] {
            invitation.b(), invitation.c(), Long.valueOf(invitation.e()), Integer.valueOf(invitation.f()), invitation.d(), invitation.j(), Integer.valueOf(invitation.g()), Integer.valueOf(invitation.h())
        });
    }

    static boolean a(Invitation invitation, Object obj)
    {
        if (obj instanceof Invitation)
        {
            if (invitation == obj)
            {
                return true;
            }
            obj = (Invitation)obj;
            if (gq.a(((Invitation) (obj)).b(), invitation.b()) && gq.a(((Invitation) (obj)).c(), invitation.c()) && gq.a(Long.valueOf(((Invitation) (obj)).e()), Long.valueOf(invitation.e())) && gq.a(Integer.valueOf(((Invitation) (obj)).f()), Integer.valueOf(invitation.f())) && gq.a(((Invitation) (obj)).d(), invitation.d()) && gq.a(((Invitation) (obj)).j(), invitation.j()) && gq.a(Integer.valueOf(((Invitation) (obj)).g()), Integer.valueOf(invitation.g())) && gq.a(Integer.valueOf(((Invitation) (obj)).h()), Integer.valueOf(invitation.h())))
            {
                return true;
            }
        }
        return false;
    }

    static boolean a(Integer integer)
    {
        return b(integer);
    }

    static boolean a(String s)
    {
        return b(s);
    }

    static String b(Invitation invitation)
    {
        return gq.a(invitation).a("Game", invitation.b()).a("InvitationId", invitation.c()).a("CreationTimestamp", Long.valueOf(invitation.e())).a("InvitationType", Integer.valueOf(invitation.f())).a("Inviter", invitation.d()).a("Participants", invitation.j()).a("Variant", Integer.valueOf(invitation.g())).a("AvailableAutoMatchSlots", Integer.valueOf(invitation.h())).toString();
    }

    static Integer k()
    {
        return y();
    }

    public final volatile Object a()
    {
        return this;
    }

    public final Game b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final Participant d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        return d;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final int f()
    {
        return e;
    }

    public final int g()
    {
        return h;
    }

    public final int h()
    {
        return i;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final int i()
    {
        return a;
    }

    public final ArrayList j()
    {
        return new ArrayList(g);
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        if (!z())
        {
            com.google.android.gms.games.multiplayer.g.a(this, parcel, l);
        } else
        {
            b.writeToParcel(parcel, l);
            parcel.writeString(c);
            parcel.writeLong(d);
            parcel.writeInt(e);
            f.writeToParcel(parcel, l);
            int j1 = g.size();
            parcel.writeInt(j1);
            int i1 = 0;
            while (i1 < j1) 
            {
                ((ParticipantEntity)g.get(i1)).writeToParcel(parcel, l);
                i1++;
            }
        }
    }

}
