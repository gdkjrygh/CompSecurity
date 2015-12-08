// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

public final class hma
    implements jcp, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new hmb();
    private static final ekk a = (new ekm()).a(hpg).a();
    private final String b;
    private final String c;
    private Context d;
    private mtj e;
    private int f;

    hma(Parcel parcel)
    {
        b = parcel.readString();
        c = parcel.readString();
    }

    public hma(ekq ekq1)
    {
        p.b(ekq1, "must specify a non-null media collection");
        b = (String)p.a(b.b(ekq1), "media key must be non-empty");
        c = ((iks)ekq1.a(iks)).a;
    }

    static void a(hma hma1, mue mue1)
    {
        if (mue1 == null)
        {
            b.a(hma1.d, null);
            return;
        }
        if (mue1.c())
        {
            b.a(hma1.d, mue1.c);
            return;
        } else
        {
            b.a(hma1.d, null);
            return;
        }
    }

    static void b(hma hma1, mue mue1)
    {
        if (mue1 == null)
        {
            b.a(hma1.d, null);
            return;
        }
        if (mue1.c())
        {
            b.a(hma1.d, mue1.c);
            return;
        } else
        {
            mue1 = hma1.d;
            hgg hgg1 = new hgg();
            hgg1.b = mue1;
            hgg1.a = hma1.f;
            hgg1.c = hma1.b;
            hgg1.d = hma1.c;
            hgg1.g = true;
            mue1 = hgg1.a();
            hma1.e.a(mue1);
            return;
        }
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        e = ((mtj)olm1.a(mtj)).a("remotemedia.tasks.AddMediaToEnvelope", new hmd(this)).a("ReadMediaCollectionById", new hmc(this));
        f = ((mmr)olm1.a(mmr)).d();
    }

    public final void a(List list)
    {
        list = new hlm(f, b, c, list);
        e.a(list);
    }

    public final void b()
    {
        e.b("remotemedia.tasks.AddMediaToEnvelope");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
        parcel.writeString(c);
    }

}
