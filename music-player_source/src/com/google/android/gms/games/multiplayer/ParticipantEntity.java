// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer:
//            Participant, c, h, ParticipantResult

public final class ParticipantEntity extends fy
    implements Participant
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final int f;
    private final String g;
    private final boolean h;
    private final PlayerEntity i;
    private final int j;
    private final ParticipantResult k;
    private final String l;
    private final String m;

    ParticipantEntity(int i1, String s, String s1, Uri uri, Uri uri1, int j1, String s2, 
            boolean flag, PlayerEntity playerentity, int k1, ParticipantResult participantresult, String s3, String s4)
    {
        a = i1;
        b = s;
        c = s1;
        d = uri;
        e = uri1;
        f = j1;
        g = s2;
        h = flag;
        i = playerentity;
        j = k1;
        k = participantresult;
        l = s3;
        m = s4;
    }

    public ParticipantEntity(Participant participant)
    {
        a = 3;
        b = participant.k();
        c = participant.f();
        d = participant.g();
        e = participant.i();
        f = participant.b();
        g = participant.c();
        h = participant.e();
        Object obj = participant.l();
        if (obj == null)
        {
            obj = null;
        } else
        {
            obj = new PlayerEntity(((Player) (obj)));
        }
        i = ((PlayerEntity) (obj));
        j = participant.d();
        k = participant.m();
        l = participant.h();
        m = participant.j();
    }

    static int a(Participant participant)
    {
        return Arrays.hashCode(new Object[] {
            participant.l(), Integer.valueOf(participant.b()), participant.c(), Boolean.valueOf(participant.e()), participant.f(), participant.g(), participant.i(), Integer.valueOf(participant.d()), participant.m()
        });
    }

    static boolean a(Participant participant, Object obj)
    {
        if (obj instanceof Participant)
        {
            if (participant == obj)
            {
                return true;
            }
            obj = (Participant)obj;
            if (gq.a(((Participant) (obj)).l(), participant.l()) && gq.a(Integer.valueOf(((Participant) (obj)).b()), Integer.valueOf(participant.b())) && gq.a(((Participant) (obj)).c(), participant.c()) && gq.a(Boolean.valueOf(((Participant) (obj)).e()), Boolean.valueOf(participant.e())) && gq.a(((Participant) (obj)).f(), participant.f()) && gq.a(((Participant) (obj)).g(), participant.g()) && gq.a(((Participant) (obj)).i(), participant.i()) && gq.a(Integer.valueOf(((Participant) (obj)).d()), Integer.valueOf(participant.d())) && gq.a(((Participant) (obj)).m(), participant.m()))
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

    static String b(Participant participant)
    {
        return gq.a(participant).a("Player", participant.l()).a("Status", Integer.valueOf(participant.b())).a("ClientAddress", participant.c()).a("ConnectedToRoom", Boolean.valueOf(participant.e())).a("DisplayName", participant.f()).a("IconImage", participant.g()).a("IconImageUrl", participant.h()).a("HiResImage", participant.i()).a("HiResImageUrl", participant.j()).a("Capabilities", Integer.valueOf(participant.d())).a("Result", participant.m()).toString();
    }

    static Integer o()
    {
        return y();
    }

    public final volatile Object a()
    {
        return this;
    }

    public final int b()
    {
        return f;
    }

    public final String c()
    {
        return g;
    }

    public final int d()
    {
        return j;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final boolean e()
    {
        return h;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final String f()
    {
        if (i == null)
        {
            return c;
        } else
        {
            return i.c();
        }
    }

    public final Uri g()
    {
        if (i == null)
        {
            return d;
        } else
        {
            return i.d();
        }
    }

    public final String h()
    {
        if (i == null)
        {
            return l;
        } else
        {
            return i.e();
        }
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final Uri i()
    {
        if (i == null)
        {
            return e;
        } else
        {
            return i.f();
        }
    }

    public final String j()
    {
        if (i == null)
        {
            return m;
        } else
        {
            return i.g();
        }
    }

    public final String k()
    {
        return b;
    }

    public final Player l()
    {
        return i;
    }

    public final ParticipantResult m()
    {
        return k;
    }

    public final int n()
    {
        return a;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        Object obj = null;
        boolean flag = false;
        if (!z())
        {
            com.google.android.gms.games.multiplayer.h.a(this, parcel, i1);
        } else
        {
            parcel.writeString(b);
            parcel.writeString(c);
            String s;
            int j1;
            if (d == null)
            {
                s = null;
            } else
            {
                s = d.toString();
            }
            parcel.writeString(s);
            if (e == null)
            {
                s = obj;
            } else
            {
                s = e.toString();
            }
            parcel.writeString(s);
            parcel.writeInt(f);
            parcel.writeString(g);
            if (h)
            {
                j1 = 1;
            } else
            {
                j1 = 0;
            }
            parcel.writeInt(j1);
            if (i == null)
            {
                j1 = ((flag) ? 1 : 0);
            } else
            {
                j1 = 1;
            }
            parcel.writeInt(j1);
            if (i != null)
            {
                i.writeToParcel(parcel, i1);
                return;
            }
        }
    }

}
