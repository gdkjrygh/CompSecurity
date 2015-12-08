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
//            v, p, t, Fragment, 
//            am

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new v();
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

    public BackStackState(p p1)
    {
        t t1 = p1.c;
        int l;
        int i1;
        for (l = 0; t1 != null; l = i1)
        {
            i1 = l;
            if (t1.i != null)
            {
                i1 = l + t1.i.size();
            }
            t1 = t1.a;
        }

        a = new int[l + p1.e * 7];
        if (!p1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        t1 = p1.c;
        l = 0;
        while (t1 != null) 
        {
            int ai[] = a;
            int j1 = l + 1;
            ai[l] = t1.c;
            ai = a;
            int k1 = j1 + 1;
            if (t1.d != null)
            {
                l = t1.d.p;
            } else
            {
                l = -1;
            }
            ai[j1] = l;
            ai = a;
            l = k1 + 1;
            ai[k1] = t1.e;
            ai = a;
            j1 = l + 1;
            ai[l] = t1.f;
            ai = a;
            l = j1 + 1;
            ai[j1] = t1.g;
            ai = a;
            j1 = l + 1;
            ai[l] = t1.h;
            if (t1.i != null)
            {
                int l1 = t1.i.size();
                int ai1[] = a;
                l = j1 + 1;
                ai1[j1] = l1;
                for (j1 = 0; j1 < l1;)
                {
                    a[l] = ((Fragment)t1.i.get(j1)).p;
                    j1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = j1 + 1;
                ai2[j1] = 0;
            }
            t1 = t1.a;
        }
        b = p1.j;
        c = p1.k;
        d = p1.n;
        e = p1.p;
        f = p1.q;
        g = p1.r;
        h = p1.s;
        i = p1.t;
        j = p1.u;
        k = p1.v;
    }

    public p a(am am1)
    {
        p p1 = new p(am1);
        int j1 = 0;
        for (int l = 0; l < a.length;)
        {
            t t1 = new t();
            int ai[] = a;
            int i1 = l + 1;
            t1.c = ai[l];
            if (am.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(p1).append(" op #").append(j1).append(" base fragment #").append(a[i1]).toString());
            }
            ai = a;
            l = i1 + 1;
            i1 = ai[i1];
            int l1;
            if (i1 >= 0)
            {
                t1.d = (Fragment)am1.f.get(i1);
            } else
            {
                t1.d = null;
            }
            ai = a;
            i1 = l + 1;
            t1.e = ai[l];
            ai = a;
            l = i1 + 1;
            t1.f = ai[i1];
            ai = a;
            i1 = l + 1;
            t1.g = ai[l];
            ai = a;
            l = i1 + 1;
            t1.h = ai[i1];
            ai = a;
            i1 = l + 1;
            l1 = ai[l];
            l = i1;
            if (l1 > 0)
            {
                t1.i = new ArrayList(l1);
                int k1 = 0;
                do
                {
                    l = i1;
                    if (k1 >= l1)
                    {
                        break;
                    }
                    if (am.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(p1).append(" set remove fragment #").append(a[i1]).toString());
                    }
                    Fragment fragment = (Fragment)am1.f.get(a[i1]);
                    t1.i.add(fragment);
                    k1++;
                    i1++;
                } while (true);
            }
            p1.a(t1);
            j1++;
        }

        p1.j = b;
        p1.k = c;
        p1.n = d;
        p1.p = e;
        p1.l = true;
        p1.q = f;
        p1.r = g;
        p1.s = h;
        p1.t = i;
        p1.u = j;
        p1.v = k;
        p1.a(1);
        return p1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
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
