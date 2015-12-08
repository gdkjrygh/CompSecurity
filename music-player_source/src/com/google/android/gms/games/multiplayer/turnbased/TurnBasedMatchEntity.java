// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.turnbased;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.turnbased:
//            TurnBasedMatch, b

public final class TurnBasedMatchEntity
    implements SafeParcelable, TurnBasedMatch
{

    public static final b b = new b();
    private final int c;
    private final GameEntity d;
    private final String e;
    private final String f;
    private final long g;
    private final String h;
    private final long i;
    private final String j;
    private final int k;
    private final int l;
    private final int m;
    private final byte n[];
    private final ArrayList o;
    private final String p;
    private final byte q[];
    private final int r;
    private final Bundle s;
    private final int t;
    private final boolean u;
    private final String v;
    private final String w;

    TurnBasedMatchEntity(int i1, GameEntity gameentity, String s1, String s2, long l1, String s3, 
            long l2, String s4, int j1, int k1, int i2, byte abyte0[], 
            ArrayList arraylist, String s5, byte abyte1[], int j2, Bundle bundle, int k2, boolean flag, 
            String s6, String s7)
    {
        c = i1;
        d = gameentity;
        e = s1;
        f = s2;
        g = l1;
        h = s3;
        i = l2;
        j = s4;
        k = j1;
        t = k2;
        l = k1;
        m = i2;
        n = abyte0;
        o = arraylist;
        p = s5;
        q = abyte1;
        r = j2;
        s = bundle;
        u = flag;
        v = s6;
        w = s7;
    }

    public TurnBasedMatchEntity(TurnBasedMatch turnbasedmatch)
    {
        c = 2;
        d = new GameEntity(turnbasedmatch.b());
        e = turnbasedmatch.c();
        f = turnbasedmatch.d();
        g = turnbasedmatch.e();
        h = turnbasedmatch.k();
        i = turnbasedmatch.l();
        j = turnbasedmatch.m();
        k = turnbasedmatch.f();
        t = turnbasedmatch.g();
        l = turnbasedmatch.i();
        m = turnbasedmatch.o();
        p = turnbasedmatch.p();
        r = turnbasedmatch.r();
        s = turnbasedmatch.s();
        u = turnbasedmatch.u();
        v = turnbasedmatch.h();
        w = turnbasedmatch.v();
        byte abyte0[] = turnbasedmatch.n();
        int j1;
        if (abyte0 == null)
        {
            n = null;
        } else
        {
            n = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, n, 0, abyte0.length);
        }
        abyte0 = turnbasedmatch.q();
        if (abyte0 == null)
        {
            q = null;
        } else
        {
            q = new byte[abyte0.length];
            System.arraycopy(abyte0, 0, q, 0, abyte0.length);
        }
        turnbasedmatch = turnbasedmatch.j();
        j1 = turnbasedmatch.size();
        o = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            o.add((ParticipantEntity)((Participant)turnbasedmatch.get(i1)).a());
        }

    }

    static int a(TurnBasedMatch turnbasedmatch)
    {
        return Arrays.hashCode(new Object[] {
            turnbasedmatch.b(), turnbasedmatch.c(), turnbasedmatch.d(), Long.valueOf(turnbasedmatch.e()), turnbasedmatch.k(), Long.valueOf(turnbasedmatch.l()), turnbasedmatch.m(), Integer.valueOf(turnbasedmatch.f()), Integer.valueOf(turnbasedmatch.g()), turnbasedmatch.h(), 
            Integer.valueOf(turnbasedmatch.i()), Integer.valueOf(turnbasedmatch.o()), turnbasedmatch.j(), turnbasedmatch.p(), Integer.valueOf(turnbasedmatch.r()), turnbasedmatch.s(), Integer.valueOf(turnbasedmatch.t()), Boolean.valueOf(turnbasedmatch.u())
        });
    }

    static boolean a(TurnBasedMatch turnbasedmatch, Object obj)
    {
        if (obj instanceof TurnBasedMatch)
        {
            if (turnbasedmatch == obj)
            {
                return true;
            }
            obj = (TurnBasedMatch)obj;
            if (gq.a(((TurnBasedMatch) (obj)).b(), turnbasedmatch.b()) && gq.a(((TurnBasedMatch) (obj)).c(), turnbasedmatch.c()) && gq.a(((TurnBasedMatch) (obj)).d(), turnbasedmatch.d()) && gq.a(Long.valueOf(((TurnBasedMatch) (obj)).e()), Long.valueOf(turnbasedmatch.e())) && gq.a(((TurnBasedMatch) (obj)).k(), turnbasedmatch.k()) && gq.a(Long.valueOf(((TurnBasedMatch) (obj)).l()), Long.valueOf(turnbasedmatch.l())) && gq.a(((TurnBasedMatch) (obj)).m(), turnbasedmatch.m()) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).f()), Integer.valueOf(turnbasedmatch.f())) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).g()), Integer.valueOf(turnbasedmatch.g())) && gq.a(((TurnBasedMatch) (obj)).h(), turnbasedmatch.h()) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).i()), Integer.valueOf(turnbasedmatch.i())) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).o()), Integer.valueOf(turnbasedmatch.o())) && gq.a(((TurnBasedMatch) (obj)).j(), turnbasedmatch.j()) && gq.a(((TurnBasedMatch) (obj)).p(), turnbasedmatch.p()) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).r()), Integer.valueOf(turnbasedmatch.r())) && gq.a(((TurnBasedMatch) (obj)).s(), turnbasedmatch.s()) && gq.a(Integer.valueOf(((TurnBasedMatch) (obj)).t()), Integer.valueOf(turnbasedmatch.t())) && gq.a(Boolean.valueOf(((TurnBasedMatch) (obj)).u()), Boolean.valueOf(turnbasedmatch.u())))
            {
                return true;
            }
        }
        return false;
    }

    static String b(TurnBasedMatch turnbasedmatch)
    {
        return gq.a(turnbasedmatch).a("Game", turnbasedmatch.b()).a("MatchId", turnbasedmatch.c()).a("CreatorId", turnbasedmatch.d()).a("CreationTimestamp", Long.valueOf(turnbasedmatch.e())).a("LastUpdaterId", turnbasedmatch.k()).a("LastUpdatedTimestamp", Long.valueOf(turnbasedmatch.l())).a("PendingParticipantId", turnbasedmatch.m()).a("MatchStatus", Integer.valueOf(turnbasedmatch.f())).a("TurnStatus", Integer.valueOf(turnbasedmatch.g())).a("Description", turnbasedmatch.h()).a("Variant", Integer.valueOf(turnbasedmatch.i())).a("Data", turnbasedmatch.n()).a("Version", Integer.valueOf(turnbasedmatch.o())).a("Participants", turnbasedmatch.j()).a("RematchId", turnbasedmatch.p()).a("PreviousData", turnbasedmatch.q()).a("MatchNumber", Integer.valueOf(turnbasedmatch.r())).a("AutoMatchCriteria", turnbasedmatch.s()).a("AvailableAutoMatchSlots", Integer.valueOf(turnbasedmatch.t())).a("LocallyModified", Boolean.valueOf(turnbasedmatch.u())).a("DescriptionParticipantId", turnbasedmatch.v()).toString();
    }

    public final volatile Object a()
    {
        return this;
    }

    public final Game b()
    {
        return d;
    }

    public final String c()
    {
        return e;
    }

    public final String d()
    {
        return f;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final long e()
    {
        return g;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final int f()
    {
        return k;
    }

    public final int g()
    {
        return t;
    }

    public final String h()
    {
        return v;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final int i()
    {
        return l;
    }

    public final ArrayList j()
    {
        return new ArrayList(o);
    }

    public final String k()
    {
        return h;
    }

    public final long l()
    {
        return i;
    }

    public final String m()
    {
        return j;
    }

    public final byte[] n()
    {
        return n;
    }

    public final int o()
    {
        return m;
    }

    public final String p()
    {
        return p;
    }

    public final byte[] q()
    {
        return q;
    }

    public final int r()
    {
        return r;
    }

    public final Bundle s()
    {
        return s;
    }

    public final int t()
    {
        if (s == null)
        {
            return 0;
        } else
        {
            return s.getInt("max_automatch_players");
        }
    }

    public final String toString()
    {
        return b(this);
    }

    public final boolean u()
    {
        return u;
    }

    public final String v()
    {
        return w;
    }

    public final int w()
    {
        return c;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        com.google.android.gms.games.multiplayer.turnbased.b.a(this, parcel, i1);
    }

}
