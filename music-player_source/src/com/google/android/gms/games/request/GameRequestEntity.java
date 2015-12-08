// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Bundle;
import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.GameEntity;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.PlayerEntity;
import com.google.android.gms.internal.gq;
import com.google.android.gms.internal.gr;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, b

public final class GameRequestEntity
    implements SafeParcelable, GameRequest
{

    public static final b a = new b();
    private final int b;
    private final GameEntity c;
    private final PlayerEntity d;
    private final byte e[];
    private final String f;
    private final ArrayList g;
    private final int h;
    private final long i;
    private final long j;
    private final Bundle k;

    GameRequestEntity(int l, GameEntity gameentity, PlayerEntity playerentity, byte abyte0[], String s, ArrayList arraylist, int i1, 
            long l1, long l2, Bundle bundle)
    {
        b = l;
        c = gameentity;
        d = playerentity;
        e = abyte0;
        f = s;
        g = arraylist;
        h = i1;
        i = l1;
        j = l2;
        k = bundle;
    }

    public GameRequestEntity(GameRequest gamerequest)
    {
        b = 1;
        c = new GameEntity(gamerequest.c());
        d = new PlayerEntity(gamerequest.d());
        f = gamerequest.b();
        h = gamerequest.g();
        i = gamerequest.h();
        j = gamerequest.i();
        Object obj = gamerequest.f();
        int i1;
        if (obj == null)
        {
            e = null;
        } else
        {
            e = new byte[obj.length];
            System.arraycopy(obj, 0, e, 0, obj.length);
        }
        obj = gamerequest.e();
        i1 = ((ArrayList) (obj)).size();
        g = new ArrayList(i1);
        k = new Bundle();
        for (int l = 0; l < i1; l++)
        {
            Player player = (Player)((Player)((ArrayList) (obj)).get(l)).a();
            String s = player.b();
            g.add((PlayerEntity)player);
            k.putInt(s, gamerequest.a(s));
        }

    }

    static int a(GameRequest gamerequest)
    {
        return Arrays.hashCode(new Object[] {
            gamerequest.c(), gamerequest.e(), gamerequest.b(), gamerequest.d(), c(gamerequest), Integer.valueOf(gamerequest.g()), Long.valueOf(gamerequest.h()), Long.valueOf(gamerequest.i())
        });
    }

    static boolean a(GameRequest gamerequest, Object obj)
    {
        if (obj instanceof GameRequest)
        {
            if (gamerequest == obj)
            {
                return true;
            }
            obj = (GameRequest)obj;
            if (gq.a(((GameRequest) (obj)).c(), gamerequest.c()) && gq.a(((GameRequest) (obj)).e(), gamerequest.e()) && gq.a(((GameRequest) (obj)).b(), gamerequest.b()) && gq.a(((GameRequest) (obj)).d(), gamerequest.d()) && Arrays.equals(c(((GameRequest) (obj))), c(gamerequest)) && gq.a(Integer.valueOf(((GameRequest) (obj)).g()), Integer.valueOf(gamerequest.g())) && gq.a(Long.valueOf(((GameRequest) (obj)).h()), Long.valueOf(gamerequest.h())) && gq.a(Long.valueOf(((GameRequest) (obj)).i()), Long.valueOf(gamerequest.i())))
            {
                return true;
            }
        }
        return false;
    }

    static String b(GameRequest gamerequest)
    {
        return gq.a(gamerequest).a("Game", gamerequest.c()).a("Sender", gamerequest.d()).a("Recipients", gamerequest.e()).a("Data", gamerequest.f()).a("RequestId", gamerequest.b()).a("Type", Integer.valueOf(gamerequest.g())).a("CreationTimestamp", Long.valueOf(gamerequest.h())).a("ExpirationTimestamp", Long.valueOf(gamerequest.i())).toString();
    }

    private static int[] c(GameRequest gamerequest)
    {
        ArrayList arraylist = gamerequest.e();
        int i1 = arraylist.size();
        int ai[] = new int[i1];
        for (int l = 0; l < i1; l++)
        {
            ai[l] = gamerequest.a(((Player)arraylist.get(l)).b());
        }

        return ai;
    }

    public final int a(String s)
    {
        return k.getInt(s, 0);
    }

    public final volatile Object a()
    {
        return this;
    }

    public final String b()
    {
        return f;
    }

    public final Game c()
    {
        return c;
    }

    public final Player d()
    {
        return d;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ArrayList e()
    {
        return new ArrayList(g);
    }

    public final boolean equals(Object obj)
    {
        return a(this, obj);
    }

    public final byte[] f()
    {
        return e;
    }

    public final int g()
    {
        return h;
    }

    public final long h()
    {
        return i;
    }

    public final int hashCode()
    {
        return a(this);
    }

    public final long i()
    {
        return j;
    }

    public final int j()
    {
        return b;
    }

    public final Bundle k()
    {
        return k;
    }

    public final String toString()
    {
        return b(this);
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        com.google.android.gms.games.request.b.a(this, parcel, l);
    }

}
