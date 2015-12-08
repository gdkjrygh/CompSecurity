// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.os.Parcel;
import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.games.Game;
import com.google.android.gms.games.Player;
import com.google.android.gms.games.request.GameRequest;
import com.google.android.gms.games.request.GameRequestEntity;
import java.util.ArrayList;
import java.util.Arrays;

// Referenced classes of package com.google.android.gms.internal:
//            iw, fq

public final class gz
    implements SafeParcelable, GameRequest
{

    public static final iw a = new iw();
    private final int b;
    private final ArrayList c;

    gz(int i1, ArrayList arraylist)
    {
        b = i1;
        c = arraylist;
        l();
    }

    private void l()
    {
        GameRequest gamerequest;
        int i1;
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
        gamerequest = (GameRequest)c.get(0);
        j1 = c.size();
        i1 = 1;
        while (i1 < j1) 
        {
            GameRequest gamerequest1 = (GameRequest)c.get(i1);
            if (gamerequest.g() == gamerequest1.g())
            {
                flag = true;
            } else
            {
                flag = false;
            }
            fq.a(flag, "All the requests must be of the same type");
            fq.a(gamerequest.d().equals(gamerequest1.d()), "All the requests must be from the same sender");
            i1++;
        }
    }

    public final int a(String s)
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final volatile Object a()
    {
        return this;
    }

    public final String b()
    {
        return ((GameRequestEntity)c.get(0)).b();
    }

    public final Game c()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final Player d()
    {
        return ((GameRequestEntity)c.get(0)).d();
    }

    public final int describeContents()
    {
        return 0;
    }

    public final ArrayList e()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final boolean equals(Object obj)
    {
        if (!(obj instanceof gz))
        {
            return false;
        }
        if (this == obj)
        {
            return true;
        }
        obj = (gz)obj;
        if (((gz) (obj)).c.size() != c.size())
        {
            return false;
        }
        int j1 = c.size();
        for (int i1 = 0; i1 < j1; i1++)
        {
            if (!((GameRequest)c.get(i1)).equals((GameRequest)((gz) (obj)).c.get(i1)))
            {
                return false;
            }
        }

        return true;
    }

    public final byte[] f()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int g()
    {
        return ((GameRequestEntity)c.get(0)).g();
    }

    public final long h()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int hashCode()
    {
        return Arrays.hashCode(c.toArray());
    }

    public final long i()
    {
        throw new UnsupportedOperationException("Method not supported on a cluster");
    }

    public final int j()
    {
        return b;
    }

    public final ArrayList k()
    {
        return new ArrayList(c);
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        iw.a(this, parcel);
    }

}
