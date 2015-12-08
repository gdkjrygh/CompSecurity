// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            e, Fragment, m

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public final volatile Object[] newArray(int l)
        {
            return new BackStackState[l];
        }

    };
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

    public BackStackState(e e1)
    {
        int l = 0;
        for (e.a a1 = e1.c; a1 != null;)
        {
            int i1 = l;
            if (a1.i != null)
            {
                i1 = l + a1.i.size();
            }
            a1 = a1.a;
            l = i1;
        }

        a = new int[e1.e * 7 + l];
        if (!e1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        e.a a2 = e1.c;
        l = 0;
        while (a2 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = a2.c;
            ai = a;
            int l1 = j1 + 1;
            int j2;
            if (a2.d != null)
            {
                l = a2.d.mIndex;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = l1 + 1;
            ai[l1] = a2.e;
            ai = a;
            j1 = l + 1;
            ai[l] = a2.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = a2.g;
            ai = a;
            j2 = l + 1;
            ai[l] = a2.h;
            if (a2.i != null)
            {
                int i2 = a2.i.size();
                a[j2] = i2;
                int k1 = 0;
                for (l = j2 + 1; k1 < i2; l++)
                {
                    a[l] = ((Fragment)a2.i.get(k1)).mIndex;
                    k1++;
                }

            } else
            {
                int ai1[] = a;
                l = j2 + 1;
                ai1[j2] = 0;
            }
            a2 = a2.a;
        }
        b = e1.j;
        c = e1.k;
        d = e1.n;
        e = e1.p;
        f = e1.q;
        g = e1.r;
        h = e1.s;
        i = e1.t;
        j = e1.u;
        k = e1.v;
    }

    public final e a(m m1)
    {
        e e1 = new e(m1);
        int l = 0;
        for (int j1 = 0; l < a.length; j1++)
        {
            e.a a1 = new e.a();
            int ai[] = a;
            int i1 = l + 1;
            a1.c = ai[l];
            if (m.a)
            {
                (new StringBuilder("Instantiate ")).append(e1).append(" op #").append(j1).append(" base fragment #").append(a[i1]);
            }
            ai = a;
            l = i1 + 1;
            i1 = ai[i1];
            int k1;
            int i2;
            if (i1 >= 0)
            {
                a1.d = (Fragment)m1.f.get(i1);
            } else
            {
                a1.d = null;
            }
            ai = a;
            i1 = l + 1;
            a1.e = ai[l];
            ai = a;
            l = i1 + 1;
            a1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            a1.g = ai[l];
            ai = a;
            k1 = i1 + 1;
            a1.h = ai[i1];
            ai = a;
            l = k1 + 1;
            i2 = ai[k1];
            i1 = l;
            if (i2 > 0)
            {
                a1.i = new ArrayList(i2);
                int l1 = 0;
                do
                {
                    i1 = l;
                    if (l1 >= i2)
                    {
                        break;
                    }
                    if (m.a)
                    {
                        (new StringBuilder("Instantiate ")).append(e1).append(" set remove fragment #").append(a[l]);
                    }
                    Fragment fragment = (Fragment)m1.f.get(a[l]);
                    a1.i.add(fragment);
                    l1++;
                    l++;
                } while (true);
            }
            l = i1;
            e1.a(a1);
        }

        e1.j = b;
        e1.k = c;
        e1.n = d;
        e1.p = e;
        e1.l = true;
        e1.q = f;
        e1.r = g;
        e1.s = h;
        e1.t = i;
        e1.u = j;
        e1.v = k;
        e1.a(1);
        return e1;
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
