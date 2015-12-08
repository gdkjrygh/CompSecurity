// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games;

import android.net.Uri;
import android.os.Parcel;
import com.google.android.gms.internal.fy;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games:
//            Game, a, e

public final class GameEntity extends fy
    implements Game
{

    public static final android.os.Parcelable.Creator CREATOR = new a();
    private final int a;
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;
    private final Uri h;
    private final Uri i;
    private final Uri j;
    private final boolean k;
    private final boolean l;
    private final String m;
    private final int n;
    private final int o;
    private final int p;
    private final boolean q;
    private final boolean r;
    private final String s;
    private final String t;
    private final String u;
    private final boolean v;

    GameEntity(int i1, String s1, String s2, String s3, String s4, String s5, String s6, 
            Uri uri, Uri uri1, Uri uri2, boolean flag, boolean flag1, String s7, int j1, 
            int k1, int l1, boolean flag2, boolean flag3, String s8, String s9, String s10, 
            boolean flag4)
    {
        a = i1;
        b = s1;
        c = s2;
        d = s3;
        e = s4;
        f = s5;
        g = s6;
        h = uri;
        s = s8;
        i = uri1;
        t = s9;
        j = uri2;
        u = s10;
        k = flag;
        l = flag1;
        m = s7;
        n = j1;
        o = k1;
        p = l1;
        q = flag2;
        r = flag3;
        v = flag4;
    }

    public GameEntity(Game game)
    {
        a = 2;
        b = game.b();
        d = game.d();
        e = game.e();
        f = game.f();
        g = game.g();
        c = game.c();
        h = game.h();
        s = game.i();
        i = game.j();
        t = game.k();
        j = game.l();
        u = game.m();
        k = game.n();
        l = game.p();
        m = game.q();
        n = game.r();
        o = game.s();
        p = game.t();
        q = game.u();
        r = game.v();
        v = game.o();
    }

    static int a(Game game)
    {
        return Arrays.hashCode(new Object[] {
            game.b(), game.c(), game.d(), game.e(), game.f(), game.g(), game.h(), game.j(), game.l(), Boolean.valueOf(game.n()), 
            Boolean.valueOf(game.p()), game.q(), Integer.valueOf(game.r()), Integer.valueOf(game.s()), Integer.valueOf(game.t()), Boolean.valueOf(game.u()), Boolean.valueOf(game.v()), Boolean.valueOf(game.o())
        });
    }

    static boolean a(Game game, Object obj)
    {
        if (obj instanceof Game)
        {
            if (game == obj)
            {
                return true;
            }
            obj = (Game)obj;
            if (gq.a(((Game) (obj)).b(), game.b()) && gq.a(((Game) (obj)).c(), game.c()) && gq.a(((Game) (obj)).d(), game.d()) && gq.a(((Game) (obj)).e(), game.e()) && gq.a(((Game) (obj)).f(), game.f()) && gq.a(((Game) (obj)).g(), game.g()) && gq.a(((Game) (obj)).h(), game.h()) && gq.a(((Game) (obj)).j(), game.j()) && gq.a(((Game) (obj)).l(), game.l()) && gq.a(Boolean.valueOf(((Game) (obj)).n()), Boolean.valueOf(game.n())) && gq.a(Boolean.valueOf(((Game) (obj)).p()), Boolean.valueOf(game.p())) && gq.a(((Game) (obj)).q(), game.q()) && gq.a(Integer.valueOf(((Game) (obj)).r()), Integer.valueOf(game.r())) && gq.a(Integer.valueOf(((Game) (obj)).s()), Integer.valueOf(game.s())) && gq.a(Integer.valueOf(((Game) (obj)).t()), Integer.valueOf(game.t())) && gq.a(Boolean.valueOf(((Game) (obj)).u()), Boolean.valueOf(game.u())))
            {
                boolean flag1 = ((Game) (obj)).v();
                boolean flag;
                if (game.v() && gq.a(Boolean.valueOf(((Game) (obj)).o()), Boolean.valueOf(game.o())))
                {
                    flag = true;
                } else
                {
                    flag = false;
                }
                if (gq.a(Boolean.valueOf(flag1), Boolean.valueOf(flag)))
                {
                    return true;
                }
            }
        }
        return false;
    }

    static boolean a(Integer integer)
    {
        return b(integer);
    }

    static boolean a(String s1)
    {
        return b(s1);
    }

    static String b(Game game)
    {
        return gq.a(game).a("ApplicationId", game.b()).a("DisplayName", game.c()).a("PrimaryCategory", game.d()).a("SecondaryCategory", game.e()).a("Description", game.f()).a("DeveloperName", game.g()).a("IconImageUri", game.h()).a("IconImageUrl", game.i()).a("HiResImageUri", game.j()).a("HiResImageUrl", game.k()).a("FeaturedImageUri", game.l()).a("FeaturedImageUrl", game.m()).a("PlayEnabledGame", Boolean.valueOf(game.n())).a("InstanceInstalled", Boolean.valueOf(game.p())).a("InstancePackageName", game.q()).a("AchievementTotalCount", Integer.valueOf(game.s())).a("LeaderboardCount", Integer.valueOf(game.t())).a("RealTimeMultiplayerEnabled", Boolean.valueOf(game.u())).a("TurnBasedMultiplayerEnabled", Boolean.valueOf(game.v())).toString();
    }

    static Integer x()
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

    public final String d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final String e()
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

    public final String g()
    {
        return g;
    }

    public final Uri h()
    {
        return h;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final String i()
    {
        return s;
    }

    public final Uri j()
    {
        return i;
    }

    public final String k()
    {
        return t;
    }

    public final Uri l()
    {
        return j;
    }

    public final String m()
    {
        return u;
    }

    public final boolean n()
    {
        return k;
    }

    public final boolean o()
    {
        return v;
    }

    public final boolean p()
    {
        return l;
    }

    public final String q()
    {
        return m;
    }

    public final int r()
    {
        return n;
    }

    public final int s()
    {
        return o;
    }

    public final int t()
    {
        return p;
    }

    public final String toString()
    {
        return b(this);
    }

    public final boolean u()
    {
        return q;
    }

    public final boolean v()
    {
        return r;
    }

    public final int w()
    {
        return a;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        Object obj = null;
        if (!z())
        {
            com.google.android.gms.games.e.a(this, parcel, i1);
            return;
        }
        parcel.writeString(b);
        parcel.writeString(c);
        parcel.writeString(d);
        parcel.writeString(e);
        parcel.writeString(f);
        parcel.writeString(g);
        String s1;
        if (h == null)
        {
            s1 = null;
        } else
        {
            s1 = h.toString();
        }
        parcel.writeString(s1);
        if (i == null)
        {
            s1 = null;
        } else
        {
            s1 = i.toString();
        }
        parcel.writeString(s1);
        if (j == null)
        {
            s1 = obj;
        } else
        {
            s1 = j.toString();
        }
        parcel.writeString(s1);
        if (k)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (l)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeString(m);
        parcel.writeInt(n);
        parcel.writeInt(o);
        parcel.writeInt(p);
    }

}
