// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.fq;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Player, c, f

public final class PlayerEntity extends fy
    implements Player
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    private final int a;
    private final String b;
    private final String c;
    private final Uri d;
    private final Uri e;
    private final long f;
    private final int g;
    private final long h;
    private final String i;
    private final String j;

    PlayerEntity(int i1, String s, String s1, Uri uri, Uri uri1, long l1, 
            int j1, long l2, String s2, String s3)
    {
        a = i1;
        b = s;
        c = s1;
        d = uri;
        i = s2;
        e = uri1;
        j = s3;
        f = l1;
        g = j1;
        h = l2;
    }

    public PlayerEntity(Player player)
    {
        a = 4;
        b = player.b();
        c = player.c();
        d = player.d();
        i = player.e();
        e = player.f();
        j = player.g();
        f = player.h();
        g = player.j();
        h = player.i();
        fq.a(b);
        fq.a(c);
        boolean flag;
        if (f > 0L)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        fq.a(flag);
    }

    static int a(Player player)
    {
        return Arrays.hashCode(new Object[] {
            player.b(), player.c(), player.d(), player.f(), Long.valueOf(player.h())
        });
    }

    static boolean a(Player player, Object obj)
    {
        if (obj instanceof Player)
        {
            if (player == obj)
            {
                return true;
            }
            obj = (Player)obj;
            if (gq.a(((Player) (obj)).b(), player.b()) && gq.a(((Player) (obj)).c(), player.c()) && gq.a(((Player) (obj)).d(), player.d()) && gq.a(((Player) (obj)).f(), player.f()) && gq.a(Long.valueOf(((Player) (obj)).h()), Long.valueOf(player.h())))
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

    static String b(Player player)
    {
        return gq.a(player).a("PlayerId", player.b()).a("DisplayName", player.c()).a("IconImageUri", player.d()).a("IconImageUrl", player.e()).a("HiResImageUri", player.f()).a("HiResImageUrl", player.g()).a("RetrievedTimestamp", Long.valueOf(player.h())).toString();
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

    public final Uri d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
    {
        return i;
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final Uri f()
    {
        return e;
    }

    public final String g()
    {
        return j;
    }

    public final long h()
    {
        return f;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final long i()
    {
        return h;
    }

    public final int j()
    {
        return g;
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
        Object obj = null;
        if (!z())
        {
            com.google.android.gms.games.f.a(this, parcel, i1);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        String s;
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
        parcel.writeLong(f);
    }

}
