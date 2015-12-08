// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.multiplayer.realtime;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.games.multiplayer.Participant;
import com.google.android.gms.games.multiplayer.ParticipantEntity;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.multiplayer.realtime:
//            Room, b, d

public final class RoomEntity extends fy
    implements Room
{

    public static final android.os.Parcelable.Creator CREATOR = new b();
    private final int a;
    private final String b;
    private final String c;
    private final long d;
    private final int e;
    private final String f;
    private final int g;
    private final Bundle h;
    private final ArrayList i;
    private final int j;

    RoomEntity(int i1, String s, String s1, long l1, int j1, String s2, 
            int k1, Bundle bundle, ArrayList arraylist, int i2)
    {
        a = i1;
        b = s;
        c = s1;
        d = l1;
        e = j1;
        f = s2;
        g = k1;
        h = bundle;
        i = arraylist;
        j = i2;
    }

    public RoomEntity(Room room)
    {
        a = 2;
        b = room.b();
        c = room.c();
        d = room.d();
        e = room.e();
        f = room.f();
        g = room.g();
        h = room.h();
        ArrayList arraylist = room.j();
        int j1 = arraylist.size();
        i = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            i.add((ParticipantEntity)((Participant)arraylist.get(i1)).a());
        }

        j = room.i();
    }

    static int a(Room room)
    {
        return Arrays.hashCode(new Object[] {
            room.b(), room.c(), Long.valueOf(room.d()), Integer.valueOf(room.e()), room.f(), Integer.valueOf(room.g()), room.h(), room.j(), Integer.valueOf(room.i())
        });
    }

    static boolean a(Room room, Object obj)
    {
        if (obj instanceof Room)
        {
            if (room == obj)
            {
                return true;
            }
            obj = (Room)obj;
            if (gq.a(((Room) (obj)).b(), room.b()) && gq.a(((Room) (obj)).c(), room.c()) && gq.a(Long.valueOf(((Room) (obj)).d()), Long.valueOf(room.d())) && gq.a(Integer.valueOf(((Room) (obj)).e()), Integer.valueOf(room.e())) && gq.a(((Room) (obj)).f(), room.f()) && gq.a(Integer.valueOf(((Room) (obj)).g()), Integer.valueOf(room.g())) && gq.a(((Room) (obj)).h(), room.h()) && gq.a(((Room) (obj)).j(), room.j()) && gq.a(Integer.valueOf(((Room) (obj)).i()), Integer.valueOf(room.i())))
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

    static String b(Room room)
    {
        return gq.a(room).a("RoomId", room.b()).a("CreatorId", room.c()).a("CreationTimestamp", Long.valueOf(room.d())).a("RoomStatus", Integer.valueOf(room.e())).a("Description", room.f()).a("Variant", Integer.valueOf(room.g())).a("AutoMatchCriteria", room.h()).a("Participants", room.j()).a("AutoMatchWaitEstimateSeconds", Integer.valueOf(room.i())).toString();
    }

    static Integer l()
    {
        return y();
    }

    public final volatile Object a()
    {
        return this;
    }

    public final String b()
    {
        return b;
    }

    public final String c()
    {
        return c;
    }

    public final long d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final int e()
    {
        return e;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final String f()
    {
        return f;
    }

    public final int g()
    {
        return g;
    }

    public final Bundle h()
    {
        return h;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final int i()
    {
        return j;
    }

    public final ArrayList j()
    {
        return new ArrayList(i);
    }

    public final int k()
    {
        return a;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        if (!z())
        {
            com.google.android.gms.games.multiplayer.realtime.d.a(this, parcel);
        } else
        {
            parcel.writeString(b);
            parcel.writeString(c);
            parcel.writeLong(d);
            parcel.writeInt(e);
            parcel.writeString(f);
            parcel.writeInt(g);
            parcel.writeBundle(h);
            int k1 = i.size();
            parcel.writeInt(k1);
            int j1 = 0;
            while (j1 < k1) 
            {
                ((ParticipantEntity)i.get(j1)).writeToParcel(parcel, i1);
                j1++;
            }
        }
    }

}
