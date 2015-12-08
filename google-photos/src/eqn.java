// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import java.util.List;

public final class eqn
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new eqo();
    private static final ekk a = (new ekm()).a(hpg).a();
    private static final ekk b = (new ekm()).a(hpe).a();
    private final String c;
    private Context d;
    private mtj e;
    private mmr f;
    private hfy g;
    private noz h;
    private Intent i;
    private eqs j;

    public eqn(Parcel parcel)
    {
        c = parcel.readString();
    }

    public eqn(String s)
    {
        p.a(s, "must specify a non-empty albumTitle");
        c = s;
    }

    private void a(String s, mue mue1)
    {
        if (h.a())
        {
            noy.a("result", mue1);
        }
        s = j;
        s.b = eqt.b;
        ((eqs) (s)).a.b();
        if (mue1 == null)
        {
            s = null;
        } else
        {
            s = mue1.c;
        }
        b.a(d, s);
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        d = context;
        j = (eqs)olm1.a(eqs);
        h = noz.a(context, "CreateNewAlbumHandler", new String[0]);
        e = ((mtj)olm1.a(mtj)).a(this);
        f = (mmr)olm1.a(mmr);
        g = (hfy)olm1.a(hfy);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"CopyPhotosToAlbumTask".equals(s)) goto _L2; else goto _L1
_L1:
        if (mue1 != null && !mue1.c()) goto _L4; else goto _L3
_L3:
        a("Error executing CopyPhotosToAlbumTask", mue1);
_L6:
        return;
_L4:
        i = new Intent();
        s = mue1.a().getString("media_key");
        i.putExtra("collection_type", esm.b);
        j.a(s, f.d());
        mue1 = new hgg();
        mue1.b = d;
        mue1.a = f.d();
        mue1.c = s;
        s = mue1.a();
        e.a(s);
        return;
_L2:
        if ("ReadMediaCollectionById".equals(s))
        {
            if (mue1 == null || mue1.c())
            {
                a("Error executing ReadMediaCollectionByIdTask", mue1);
                return;
            } else
            {
                s = mue1.a().getString("media_key");
                s = b.a(f.d(), s);
                e.a(new elc(s, b, b.mW));
                return;
            }
        }
        if (elc.a(b.mW).equals(s))
        {
            if (!mue1.c())
            {
                s = (ekq)mue1.a().getParcelable("com.google.android.apps.photos.core.media_collection");
                ((epb)olm.a(d, epb)).a(f.d(), s, true);
                b.a(d, i);
                return;
            } else
            {
                a("Couldn't open album", mue1);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(List list)
    {
        list = nui.a(d, f.d(), c, new equ(list));
        list.a = nuh.b;
        e.a(list);
        list = d.getString(b.nc);
        g.a(list);
        g.a(true);
    }

    public final void b()
    {
        e.b("CopyPhotosToAlbumTask");
        e.b("ReadMediaCollectionById");
        e.b(elc.a(b.mW));
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int k)
    {
        parcel.writeString(c);
    }

}
