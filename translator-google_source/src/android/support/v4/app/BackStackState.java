// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            g, a, e, Fragment, 
//            s

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new g();
    final int a[];
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;
    final ArrayList j;
    final ArrayList k;

    public BackStackState(Parcel parcel)
    {
        a = parcel.createIntArray();
        b = parcel.readInt();
        c = parcel.readInt();
        d = parcel.readString();
        e = parcel.readInt();
        f = parcel.readInt();
        g = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        h = parcel.readInt();
        i = (CharSequence)TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel);
        j = parcel.createStringArrayList();
        k = parcel.createStringArrayList();
    }

    public BackStackState(a a1)
    {
        e e1 = a1.c;
        int l;
        int i1;
        for (l = 0; e1 != null; l = i1)
        {
            i1 = l;
            if (e1.i != null)
            {
                i1 = l + e1.i.size();
            }
            e1 = e1.a;
        }

        a = new int[l + a1.e * 7];
        if (!a1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        e1 = a1.c;
        l = 0;
        while (e1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = e1.c;
            ai = a;
            int k1 = j1 + 1;
            if (e1.d != null)
            {
                l = e1.d.g;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = e1.e;
            ai = a;
            j1 = l + 1;
            ai[l] = e1.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = e1.g;
            ai = a;
            j1 = l + 1;
            ai[l] = e1.h;
            if (e1.i != null)
            {
                int l1 = e1.i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((Fragment)e1.i.get(j1)).g;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            e1 = e1.a;
        }
        b = a1.j;
        c = a1.k;
        d = a1.n;
        e = a1.p;
        f = a1.q;
        g = a1.r;
        h = a1.s;
        i = a1.t;
        j = a1.u;
        k = a1.v;
    }

    public final a a(s s1)
    {
        a a1 = new a(s1);
        int j1 = 0;
        for (int l = 0; l < a.length;)
        {
            e e1 = new e();
            int ai[] = a;
            int i1 = l + 1;
            e1.c = ai[l];
            if (s.a)
            {
                (new StringBuilder("Instantiate ")).append(a1).append(" op #").append(j1).append(" base fragment #").append(a[i1]);
            }
            ai = a;
            l = i1 + 1;
            i1 = ai[i1];
            int l1;
            if (i1 >= 0)
            {
                e1.d = (Fragment)s1.f.get(i1);
            } else
            {
                e1.d = null;
            }
            ai = a;
            i1 = l + 1;
            e1.e = ai[l];
            ai = a;
            l = i1 + 1;
            e1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            e1.g = ai[l];
            ai = a;
            l = i1 + 1;
            e1.h = ai[i1];
            ai = a;
            i1 = l + 1;
            l1 = ai[l];
            l = i1;
            if (l1 > 0)
            {
                e1.i = new ArrayList(l1);
                int k1 = 0;
                do
                {
                    l = i1;
                    if (k1 >= l1)
                    {
                        break;
                    }
                    if (s.a)
                    {
                        (new StringBuilder("Instantiate ")).append(a1).append(" set remove fragment #").append(a[i1]);
                    }
                    Fragment fragment = (Fragment)s1.f.get(a[i1]);
                    e1.i.add(fragment);
                    k1++;
                    i1++;
                } while (true);
            }
            a1.a(e1);
            j1++;
        }

        a1.j = b;
        a1.k = c;
        a1.n = d;
        a1.p = e;
        a1.l = true;
        a1.q = f;
        a1.r = g;
        a1.s = h;
        a1.t = i;
        a1.u = j;
        a1.v = k;
        a1.a(1);
        return a1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        parcel.writeIntArray(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        parcel.writeString(d);
        parcel.writeInt(e);
        parcel.writeInt(f);
        TextUtils.writeToParcel(g, parcel, 0);
        parcel.writeInt(h);
        TextUtils.writeToParcel(i, parcel, 0);
        parcel.writeStringList(j);
        parcel.writeStringList(k);
    }

}
