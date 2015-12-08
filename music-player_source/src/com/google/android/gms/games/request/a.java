// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.games.request;

import android.os.Parcel;
import com.google.android.gms.common.data.DataHolder;
import com.google.android.gms.common.data.e;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.b;
import com.google.android.gms.games.d;
import java.util.ArrayList;

// Referenced classes of package com.google.android.gms.games.request:
//            GameRequest, GameRequestEntity

public final class a extends e
    implements GameRequest
{

    private final int c;

    private GameRequest j()
    {
        return new GameRequestEntity(this);
    }

    public final int a(String s)
    {
        for (int k = b; k < b + c; k++)
        {
            int l = a_.a(k);
            if (a_.c("recipient_external_player_id", k, l).equals(s))
            {
                return a_.b("recipient_status", k, l);
            }
        }

        return -1;
    }

    public final Object a()
    {
        return j();
    }

    public final String b()
    {
        return e("external_request_id");
    }

    public final Game c()
    {
        return new b(a_, b);
    }

    public final Player d()
    {
        return new d(a_, b, "sender_");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ArrayList e()
    {
        ArrayList arraylist = new ArrayList(c);
        for (int k = 0; k < c; k++)
        {
            arraylist.add(new d(a_, b + k, "recipient_"));
        }

        return arraylist;
    }

    public final boolean equals(Object obj)
    {
        return GameRequestEntity.a(this, obj);
    }

    public final byte[] f()
    {
        return f("data");
    }

    public final int g()
    {
        return c("type");
    }

    public final long h()
    {
        return b("creation_timestamp");
    }

    public final int hashCode()
    {
        return GameRequestEntity.a(this);
    }

    public final long i()
    {
        return b("expiration_timestamp");
    }

    public final String toString()
    {
        return com.google.android.gms.games.request.GameRequestEntity.b(this);
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        ((GameRequestEntity)j()).writeToParcel(parcel, k);
    }
}
