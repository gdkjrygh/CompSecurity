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
//            d, b, c, Fragment, 
//            s

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new d();
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

    public BackStackState(s s1, b b1)
    {
        s1 = b1.b;
        int j;
        int k;
        for (j = 0; s1 != null; j = k)
        {
            k = j;
            if (((c) (s1)).i != null)
            {
                k = j + ((c) (s1)).i.size();
            }
            s1 = ((c) (s1)).a;
        }

        a = new int[j + b1.d * 7];
        if (!b1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        s1 = b1.b;
        j = 0;
        while (s1 != null) 
        {
            int ai[] = a;
            int l = j + 1;
            ai[j] = ((c) (s1)).c;
            ai = a;
            int i1 = l + 1;
            if (((c) (s1)).d != null)
            {
                j = ((c) (s1)).d.o;
            } else
            {
                j = -1;
            }
            ai[l] = j;
            ai = a;
            j = i1 + 1;
            ai[i1] = ((c) (s1)).e;
            ai = a;
            l = j + 1;
            ai[j] = ((c) (s1)).f;
            ai = a;
            j = l + 1;
            ai[l] = ((c) (s1)).g;
            ai = a;
            l = j + 1;
            ai[j] = ((c) (s1)).h;
            if (((c) (s1)).i != null)
            {
                int j1 = ((c) (s1)).i.size();
                int ai1[] = a;
                j = l + 1;
                ai1[l] = j1;
                for (l = 0; l < j1;)
                {
                    a[j] = ((Fragment)((c) (s1)).i.get(l)).o;
                    l++;
                    j++;
                }

            } else
            {
                int ai2[] = a;
                j = l + 1;
                ai2[l] = 0;
            }
            s1 = ((c) (s1)).a;
        }
        b = b1.i;
        c = b1.j;
        d = b1.m;
        e = b1.o;
        f = b1.p;
        g = b1.q;
        h = b1.r;
        i = b1.s;
    }

    public b a(s s1)
    {
        b b1 = new b(s1);
        int l = 0;
        for (int j = 0; j < a.length;)
        {
            c c1 = new c();
            int ai[] = a;
            int k = j + 1;
            c1.c = ai[j];
            if (s.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(b1).append(" op #").append(l).append(" base fragment #").append(a[k]).toString());
            }
            ai = a;
            j = k + 1;
            k = ai[k];
            int j1;
            if (k >= 0)
            {
                c1.d = (Fragment)s1.f.get(k);
            } else
            {
                c1.d = null;
            }
            ai = a;
            k = j + 1;
            c1.e = ai[j];
            ai = a;
            j = k + 1;
            c1.f = ai[k];
            ai = a;
            k = j + 1;
            c1.g = ai[j];
            ai = a;
            j = k + 1;
            c1.h = ai[k];
            ai = a;
            k = j + 1;
            j1 = ai[j];
            j = k;
            if (j1 > 0)
            {
                c1.i = new ArrayList(j1);
                int i1 = 0;
                do
                {
                    j = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    if (s.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(b1).append(" set remove fragment #").append(a[k]).toString());
                    }
                    Fragment fragment = (Fragment)s1.f.get(a[k]);
                    c1.i.add(fragment);
                    i1++;
                    k++;
                } while (true);
            }
            b1.a(c1);
            l++;
        }

        b1.i = b;
        b1.j = c;
        b1.m = d;
        b1.o = e;
        b1.k = true;
        b1.p = f;
        b1.q = g;
        b1.r = h;
        b1.s = i;
        b1.a(1);
        return b1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int j)
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
