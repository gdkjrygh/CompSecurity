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
//            c, a, b, Fragment, 
//            m

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new c();
    final int a[];
    final int b;
    final int c;
    final String d;
    final int e;
    final int f;
    final CharSequence g;
    final int h;
    final CharSequence i;

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
    }

    public BackStackState(a a1)
    {
        b b1 = a1.b;
        int j;
        int k;
        for (j = 0; b1 != null; j = k)
        {
            k = j;
            if (b1.i != null)
            {
                k = j + b1.i.size();
            }
            b1 = b1.a;
        }

        a = new int[j + a1.d * 7];
        if (!a1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        b1 = a1.b;
        j = 0;
        while (b1 != null) 
        {
            int ai[] = a;
            int l = j + 1;
            ai[j] = b1.c;
            ai = a;
            int i1 = l + 1;
            if (b1.d != null)
            {
                j = b1.d.f;
            } else
            {
                j = -1;
            }
            ai[l] = j;
            ai = a;
            j = i1 + 1;
            ai[i1] = b1.e;
            ai = a;
            l = j + 1;
            ai[j] = b1.f;
            ai = a;
            j = l + 1;
            ai[l] = b1.g;
            ai = a;
            l = j + 1;
            ai[j] = b1.h;
            if (b1.i != null)
            {
                int j1 = b1.i.size();
                int ai1[] = a;
                j = l + 1;
                ai1[l] = j1;
                for (l = 0; l < j1;)
                {
                    a[j] = ((Fragment)b1.i.get(l)).f;
                    l++;
                    j++;
                }

            } else
            {
                int ai2[] = a;
                j = l + 1;
                ai2[l] = 0;
            }
            b1 = b1.a;
        }
        b = a1.i;
        c = a1.j;
        d = a1.m;
        e = a1.o;
        f = a1.p;
        g = a1.q;
        h = a1.r;
        i = a1.s;
    }

    public final a a(m m1)
    {
        a a1 = new a(m1);
        int l = 0;
        for (int j = 0; j < a.length;)
        {
            b b1 = new b();
            int ai[] = a;
            int k = j + 1;
            b1.c = ai[j];
            if (m.a)
            {
                Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(a1).append(" op #").append(l).append(" base fragment #").append(a[k]).toString());
            }
            ai = a;
            j = k + 1;
            k = ai[k];
            int j1;
            if (k >= 0)
            {
                b1.d = (Fragment)m1.f.get(k);
            } else
            {
                b1.d = null;
            }
            ai = a;
            k = j + 1;
            b1.e = ai[j];
            ai = a;
            j = k + 1;
            b1.f = ai[k];
            ai = a;
            k = j + 1;
            b1.g = ai[j];
            ai = a;
            j = k + 1;
            b1.h = ai[k];
            ai = a;
            k = j + 1;
            j1 = ai[j];
            j = k;
            if (j1 > 0)
            {
                b1.i = new ArrayList(j1);
                int i1 = 0;
                do
                {
                    j = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    if (m.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder("Instantiate ")).append(a1).append(" set remove fragment #").append(a[k]).toString());
                    }
                    Fragment fragment = (Fragment)m1.f.get(a[k]);
                    b1.i.add(fragment);
                    i1++;
                    k++;
                } while (true);
            }
            a1.a(b1);
            l++;
        }

        a1.i = b;
        a1.j = c;
        a1.m = d;
        a1.o = e;
        a1.k = true;
        a1.p = f;
        a1.q = g;
        a1.r = h;
        a1.s = i;
        a1.a(1);
        return a1;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int j)
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
    }

}
