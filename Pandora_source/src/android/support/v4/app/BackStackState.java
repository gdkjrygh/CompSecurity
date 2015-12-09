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
//            e, Fragment, i

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BackStackState a(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public BackStackState[] a(int l)
        {
            return new BackStackState[l];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int l)
        {
            return a(l);
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

    public BackStackState(i l, e e1)
    {
        l = e1.b;
        int i1;
        int j1;
        for (i1 = 0; l != null; i1 = j1)
        {
            j1 = i1;
            if (((e.a) (l)).i != null)
            {
                j1 = i1 + ((e.a) (l)).i.size();
            }
            l = ((e.a) (l)).a;
        }

        a = new int[i1 + e1.d * 7];
        if (!e1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        l = e1.b;
        i1 = 0;
        while (l != null) 
        {
            int ai[] = a;
            int k1 = i1 + 1;
            ai[i1] = ((e.a) (l)).c;
            ai = a;
            int l1 = k1 + 1;
            if (((e.a) (l)).d != null)
            {
                i1 = ((e.a) (l)).d.mIndex;
            } else
            {
                i1 = -1;
            }
            ai[k1] = i1;
            ai = a;
            i1 = l1 + 1;
            ai[l1] = ((e.a) (l)).e;
            ai = a;
            k1 = i1 + 1;
            ai[i1] = ((e.a) (l)).f;
            ai = a;
            i1 = k1 + 1;
            ai[k1] = ((e.a) (l)).g;
            ai = a;
            k1 = i1 + 1;
            ai[i1] = ((e.a) (l)).h;
            if (((e.a) (l)).i != null)
            {
                int i2 = ((e.a) (l)).i.size();
                int ai1[] = a;
                i1 = k1 + 1;
                ai1[k1] = i2;
                for (k1 = 0; k1 < i2;)
                {
                    a[i1] = ((Fragment)((e.a) (l)).i.get(k1)).mIndex;
                    k1++;
                    i1++;
                }

            } else
            {
                int ai2[] = a;
                i1 = k1 + 1;
                ai2[k1] = 0;
            }
            l = ((e.a) (l)).a;
        }
        b = e1.i;
        c = e1.j;
        d = e1.m;
        e = e1.o;
        f = e1.p;
        g = e1.q;
        h = e1.r;
        i = e1.s;
        j = e1.t;
        k = e1.u;
    }

    public e a(i l)
    {
        e e1 = new e(l);
        int k1 = 0;
        for (int i1 = 0; i1 < a.length;)
        {
            e.a a1 = new e.a();
            int ai[] = a;
            int j1 = i1 + 1;
            a1.c = ai[i1];
            if (i.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(e1).append(" op #").append(k1).append(" base fragment #").append(a[j1]).toString());
            }
            ai = a;
            i1 = j1 + 1;
            j1 = ai[j1];
            int i2;
            if (j1 >= 0)
            {
                a1.d = (Fragment)l.f.get(j1);
            } else
            {
                a1.d = null;
            }
            ai = a;
            j1 = i1 + 1;
            a1.e = ai[i1];
            ai = a;
            i1 = j1 + 1;
            a1.f = ai[j1];
            ai = a;
            j1 = i1 + 1;
            a1.g = ai[i1];
            ai = a;
            i1 = j1 + 1;
            a1.h = ai[j1];
            ai = a;
            j1 = i1 + 1;
            i2 = ai[i1];
            i1 = j1;
            if (i2 > 0)
            {
                a1.i = new ArrayList(i2);
                int l1 = 0;
                do
                {
                    i1 = j1;
                    if (l1 >= i2)
                    {
                        break;
                    }
                    if (i.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(e1).append(" set remove fragment #").append(a[j1]).toString());
                    }
                    Fragment fragment = (Fragment)l.f.get(a[j1]);
                    a1.i.add(fragment);
                    l1++;
                    j1++;
                } while (true);
            }
            e1.a(a1);
            k1++;
        }

        e1.i = b;
        e1.j = c;
        e1.m = d;
        e1.o = e;
        e1.k = true;
        e1.p = f;
        e1.q = g;
        e1.r = h;
        e1.s = i;
        e1.t = j;
        e1.u = k;
        e1.b(1);
        return e1;
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
