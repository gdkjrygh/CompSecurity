// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import android.widget.Toast;
import java.util.List;

public final class eqh
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new eqi();
    private static final ekk a = (new ekm()).a(hpg).a();
    private final String b;
    private Context c;
    private noz d;
    private mtj e;
    private mmr f;
    private hfy g;

    eqh(Parcel parcel)
    {
        b = parcel.readString();
    }

    public eqh(String s)
    {
        p.a(s, "must specify a non-empty media key");
        b = s;
    }

    private void a(String s, mue mue1)
    {
        if (d.a())
        {
            noy.a("result", mue1);
        }
        if (mue1 == null)
        {
            s = null;
        } else
        {
            s = mue1.c;
        }
        b.a(c, s);
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        c = context;
        d = noz.a(context, "CopyToExistingAlbumHand", new String[0]);
        e = ((mtj)olm1.a(mtj)).a(this);
        f = (mmr)olm1.a(mmr);
        g = (hfy)olm1.a(hfy);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"CopyPhotosToAlbumTask".equals(s)) goto _L2; else goto _L1
_L1:
        s = c.getResources();
        if (mue1 != null && !mue1.c()) goto _L4; else goto _L3
_L3:
        a("Error executing CopyPhotosToAlbumTask", mue1);
_L6:
        return;
_L4:
        int i = mue1.a().getInt("num_photos_added");
        s = s.getQuantityString(b.nb, i, new Object[] {
            Integer.valueOf(i)
        });
        Toast.makeText(c, s, 1).show();
        s = mue1.a().getString("media_key");
        mue1 = new hgg();
        mue1.b = c;
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
                b.a(c, null);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(List list)
    {
        int i = f.d();
        nui nui1 = nui.b(c, i, b, new equ(list));
        nui1.a = nuh.b;
        e.a(nui1);
        i = list.size();
        list = c.getResources().getQuantityString(b.mZ, i, new Object[] {
            Integer.valueOf(i)
        });
        g.a(list);
        g.a(true);
    }

    public final void b()
    {
        e.b("CopyPhotosToAlbumTask");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(b);
    }

}
