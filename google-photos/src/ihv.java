// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public final class ihv
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new ihw();
    private static final ekk a = (new ekm()).a(hpg).a();
    private static final ekk b = (new ekm()).a(hpg).b(elt).a();
    private final List c;
    private final boolean d;
    private final boolean e;
    private final boolean f;
    private Context g;
    private mtj h;
    private mmr i;
    private hfy j;
    private ifj k;
    private List l;
    private List m;
    private Intent n;

    ihv(Parcel parcel)
    {
        c = Collections.unmodifiableList(a(parcel));
        d = b.c(parcel);
        e = b.c(parcel);
        f = b.c(parcel);
        l = a(parcel);
        m = a(parcel);
    }

    ihv(ihx ihx1)
    {
        c = Collections.unmodifiableList(ihx1.a);
        d = ihx1.b;
        e = ihx1.c;
        f = ihx1.d;
    }

    private static List a(Parcel parcel)
    {
        int j1 = parcel.readInt();
        if (j1 == -1)
        {
            return null;
        }
        ArrayList arraylist = new ArrayList(j1);
        for (int i1 = 0; i1 < j1; i1++)
        {
            arraylist.add((ekp)parcel.readParcelable(ekp.getClassLoader()));
        }

        return arraylist;
    }

    private static void a(Parcel parcel, int i1, List list)
    {
        if (list == null)
        {
            parcel.writeInt(-1);
        } else
        {
            parcel.writeInt(list.size());
            list = list.iterator();
            while (list.hasNext()) 
            {
                parcel.writeParcelable((ekp)list.next(), i1);
            }
        }
    }

    private void a(mue mue1)
    {
        if (mue1 == null)
        {
            mue1 = null;
        } else
        {
            mue1 = mue1.c;
        }
        b.a(g, mue1);
    }

    private void c()
    {
        int i1 = i.d();
        Object obj = m;
        HashSet hashset = new HashSet();
        obj = ((List) (obj)).iterator();
        do
        {
            if (!((Iterator) (obj)).hasNext())
            {
                break;
            }
            ekp ekp1 = (ekp)((Iterator) (obj)).next();
            elt elt1 = (elt)ekp1.b(elt);
            if (elt1 == null || !elt1.e().g().e())
            {
                hashset.add(((hpg)ekp1.a(hpg)).b().e);
            }
        } while (true);
        ArrayList arraylist = new ArrayList(l.size());
        Iterator iterator = l.iterator();
        while (iterator.hasNext()) 
        {
            ekp ekp2 = (ekp)iterator.next();
            if (hashset.contains(((hpg)ekp2.a(hpg)).b().e))
            {
                obj = ihq.b;
            } else
            {
                obj = ihq.a;
            }
            arraylist.add(new ihp(ekp2, ((ihq) (obj))));
        }
        boolean flag;
        if (arraylist != null && !arraylist.isEmpty())
        {
            flag = true;
        } else
        {
            flag = false;
        }
        p.a(flag, "must specify a non-empty mediaList");
        obj = new ihi(ihj.b, null, arraylist);
        obj.d = k.a(i1);
        h.a(new ihf(i1, ((ihi) (obj)), d));
        obj = g.getString(b.zt);
        j.a(((String) (obj)));
        j.a(true);
    }

    public final ekk a()
    {
        return a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        h = ((mtj)olm1.a(mtj)).a(this);
        i = (mmr)olm1.a(mmr);
        j = (hfy)olm1.a(hfy);
        k = (ifj)olm1.a(ifj);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!"CreateEnvelopeTask".equals(s)) goto _L2; else goto _L1
_L1:
        if (mue1 != null && !mue1.c()) goto _L4; else goto _L3
_L3:
        a(mue1);
_L6:
        return;
_L4:
        s = (ihk)mue1.a().getParcelable("envelope_share_details");
        n = new Intent();
        n.putExtra("envelope_share_details", s);
        if (e)
        {
            int i1 = i.d();
            s = ((ihk) (s)).a;
            h.a(new ihy(i1, s));
            return;
        } else
        {
            b.a(g, n);
            return;
        }
_L2:
        if (eld.a(b.zs).equals(s))
        {
            if (mue1 == null || mue1.c())
            {
                a(mue1);
                return;
            } else
            {
                m = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
                c();
                return;
            }
        }
        if ("ReadMediaUrlById".equals(s))
        {
            if (mue1 == null || mue1.c())
            {
                a(mue1);
                return;
            } else
            {
                s = mue1.a().getString("media_url");
                n.putExtra("media_url", s);
                b.a(g, n);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(List list)
    {
        l = list;
        h.a(new eld(c, b, b.zs));
    }

    public final void b()
    {
        h.b(eld.a(b.zs));
        h.b("ReadMediaUrlById");
        h.b("CreateEnvelopeTask");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        a(parcel, i1, c);
        b.a(parcel, d);
        b.a(parcel, f);
        a(parcel, i1, l);
        a(parcel, i1, m);
    }

}
