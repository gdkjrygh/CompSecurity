// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;

// Referenced classes of package android.support.v4.app:
//            l, f, j, Fragment, 
//            x

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new l();
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

    public BackStackState(f f1)
    {
        j j1 = f1.c;
        int i1;
        int k1;
        for (i1 = 0; j1 != null; i1 = k1)
        {
            k1 = i1;
            if (j1.i != null)
            {
                k1 = i1 + j1.i.size();
            }
            j1 = j1.a;
        }

        a = new int[i1 + f1.e * 7];
        if (!f1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        j1 = f1.c;
        i1 = 0;
        while (j1 != null) 
        {
            int ai[] = a;
            int l1 = i1 + 1;
            ai[i1] = j1.c;
            ai = a;
            int i2 = l1 + 1;
            if (j1.d != null)
            {
                i1 = j1.d.mIndex;
            } else
            {
                i1 = -1;
            }
            ai[l1] = i1;
            ai = a;
            i1 = i2 + 1;
            ai[i2] = j1.e;
            ai = a;
            l1 = i1 + 1;
            ai[i1] = j1.f;
            ai = a;
            i1 = l1 + 1;
            ai[l1] = j1.g;
            ai = a;
            l1 = i1 + 1;
            ai[i1] = j1.h;
            if (j1.i != null)
            {
                int j2 = j1.i.size();
                int ai1[] = a;
                i1 = l1 + 1;
                ai1[l1] = j2;
                for (l1 = 0; l1 < j2;)
                {
                    a[i1] = ((Fragment)j1.i.get(l1)).mIndex;
                    l1++;
                    i1++;
                }

            } else
            {
                int ai2[] = a;
                i1 = l1 + 1;
                ai2[l1] = 0;
            }
            j1 = j1.a;
        }
        b = f1.j;
        c = f1.k;
        d = f1.n;
        e = f1.p;
        f = f1.q;
        g = f1.r;
        h = f1.s;
        i = f1.t;
        j = f1.u;
        k = f1.v;
    }

    public final f a(x x1)
    {
        f f1 = new f(x1);
        int l1 = 0;
        for (int i1 = 0; i1 < a.length;)
        {
            j j1 = new j();
            int ai[] = a;
            int k1 = i1 + 1;
            j1.c = ai[i1];
            if (x.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(f1).append(" op #").append(l1).append(" base fragment #").append(a[k1]).toString());
            }
            ai = a;
            i1 = k1 + 1;
            k1 = ai[k1];
            int j2;
            if (k1 >= 0)
            {
                j1.d = (Fragment)x1.f.get(k1);
            } else
            {
                j1.d = null;
            }
            ai = a;
            k1 = i1 + 1;
            j1.e = ai[i1];
            ai = a;
            i1 = k1 + 1;
            j1.f = ai[k1];
            ai = a;
            k1 = i1 + 1;
            j1.g = ai[i1];
            ai = a;
            i1 = k1 + 1;
            j1.h = ai[k1];
            ai = a;
            k1 = i1 + 1;
            j2 = ai[i1];
            i1 = k1;
            if (j2 > 0)
            {
                j1.i = new ArrayList(j2);
                int i2 = 0;
                do
                {
                    i1 = k1;
                    if (i2 >= j2)
                    {
                        break;
                    }
                    if (x.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(f1).append(" set remove fragment #").append(a[k1]).toString());
                    }
                    Fragment fragment = (Fragment)x1.f.get(a[k1]);
                    j1.i.add(fragment);
                    i2++;
                    k1++;
                } while (true);
            }
            f1.a(j1);
            l1++;
        }

        f1.j = b;
        f1.k = c;
        f1.n = d;
        f1.p = e;
        f1.l = true;
        f1.q = f;
        f1.r = g;
        f1.s = h;
        f1.t = i;
        f1.u = j;
        f1.v = k;
        f1.a(1);
        return f1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int i1)
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
