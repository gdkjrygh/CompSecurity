// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public final class eqp
    implements jcp, mti, omb
{

    public static final android.os.Parcelable.Creator CREATOR = new eqq();
    private static final String a;
    private static final String b;
    private static final ekk c = (new ekm()).a(hpg).a();
    private final String d;
    private final List e;
    private final eqr f;
    private Context g;
    private noz h;
    private mtj i;
    private mmr j;
    private hfy k;
    private List l;
    private List m;

    eqp(Parcel parcel)
    {
        d = parcel.readString();
        e = new ArrayList();
        parcel = parcel.readParcelableArray(ekp.getClassLoader());
        int j1 = parcel.length;
        for (int i1 = 0; i1 < j1; i1++)
        {
            Object obj = parcel[i1];
            e.add((ekp)obj);
        }

        f = new eqr();
    }

    public eqp(String s, List list)
    {
        this(s, list, new eqr());
    }

    private eqp(String s, List list, eqr eqr1)
    {
        p.a(s, "must specify a non-empty media key");
        p.b(list, "must specify a non-null original media list");
        d = s;
        e = list;
        f = eqr1;
    }

    private void a(String s, mue mue1)
    {
        if (h.a())
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
        b.a(g, s);
    }

    static ekk c()
    {
        return c;
    }

    private void d()
    {
        if (l != null && m != null)
        {
            Object obj1 = m;
            Object obj = l;
            Object obj3 = (new equ(((Collection) (obj1)))).a();
            Object obj2 = (new eqg(d, ((Collection) (obj)))).a();
            obj = new ArrayList();
            obj1 = new ArrayList();
            obj3 = ((Collection) (obj3)).iterator();
            do
            {
                if (!((Iterator) (obj3)).hasNext())
                {
                    break;
                }
                num num2 = (num)((Iterator) (obj3)).next();
                if (num2.a())
                {
                    ((List) (obj)).add(num2.b());
                }
            } while (true);
            obj2 = ((Collection) (obj2)).iterator();
            do
            {
                if (!((Iterator) (obj2)).hasNext())
                {
                    break;
                }
                num num1 = (num)((Iterator) (obj2)).next();
                if (num1.a())
                {
                    ((List) (obj1)).add(num1.b());
                }
            } while (true);
            obj = new epa(j.d(), d, ((List) (obj)), ((List) (obj1)));
            i.a(((mtf) (obj)));
            l = null;
            m = null;
        }
    }

    public final ekk a()
    {
        return ekk.a;
    }

    public final void a(Context context, olm olm1, Bundle bundle)
    {
        g = context;
        h = noz.a(context, "EditAlbumPhotosHandler", new String[0]);
        i = ((mtj)olm1.a(mtj)).a(this);
        j = (mmr)olm1.a(mmr);
        k = (hfy)olm1.a(hfy);
    }

    public final void a(String s, mue mue1, mua mua)
    {
        if (!a.equals(s)) goto _L2; else goto _L1
_L1:
        if (mue1 == null || mue1.c()) goto _L4; else goto _L3
_L3:
        m = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
        d();
_L6:
        return;
_L4:
        a("Failed loading photos", mue1);
        return;
_L2:
        if (b.equals(s))
        {
            if (mue1 != null && !mue1.c())
            {
                l = mue1.a().getParcelableArrayList("com.google.android.apps.photos.core.media_list");
                d();
                return;
            } else
            {
                a("Failed loading photos", mue1);
                return;
            }
        }
        if ("EditAlbumPhotosTask".equals(s))
        {
            if (mue1 == null || mue1.c())
            {
                a("Error executing EditAlbumPhotosTask", mue1);
                return;
            } else
            {
                b.a(g, null);
                return;
            }
        }
        if (true) goto _L6; else goto _L5
_L5:
    }

    public final void a(List list)
    {
        Object obj = new ArrayList(e);
        ArrayList arraylist = new ArrayList();
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            ekp ekp1 = (ekp)list.next();
            if (!((List) (obj)).remove(ekp1))
            {
                arraylist.add(ekp1);
            }
        } while (true);
        i.a(eqr.a(new ArrayList(arraylist), b.mX));
        i.a(eqr.a(new ArrayList(((Collection) (obj))), b.mY));
        int i1 = arraylist.size();
        int j1 = ((List) (obj)).size();
        list = "";
        if (i1 > 0)
        {
            list = g.getResources().getQuantityString(b.mZ, i1, new Object[] {
                Integer.valueOf(i1)
            });
        }
        obj = list;
        if (j1 > 0)
        {
            obj = list;
            if (i1 > 0)
            {
                obj = String.valueOf(list).concat("\n");
            }
            list = String.valueOf(obj);
            obj = String.valueOf(g.getResources().getQuantityString(b.na, j1, new Object[] {
                Integer.valueOf(j1)
            }));
            if (((String) (obj)).length() != 0)
            {
                obj = list.concat(((String) (obj)));
            } else
            {
                obj = new String(list);
            }
        }
        k.a(((String) (obj)));
        k.a(true);
    }

    public final void b()
    {
        i.b(a);
        i.b(b);
        i.b("EditAlbumPhotosTask");
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
    {
        parcel.writeString(d);
        parcel.writeParcelableArray((android.os.Parcelable[])e.toArray(new ekp[e.size()]), i1);
    }

    static 
    {
        a = eld.a(b.mX);
        b = eld.a(b.mY);
    }
}
