// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.Log;
import j;
import java.util.ArrayList;
import n;

// Referenced classes of package android.support.v4.app:
//            Fragment

public final class BackStackState
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

    public BackStackState(n n1, j j1)
    {
        n1 = j1.c;
        int l;
        int i1;
        for (l = 0; n1 != null; l = i1)
        {
            i1 = l;
            if (((j.a) (n1)).i != null)
            {
                i1 = l + ((j.a) (n1)).i.size();
            }
            n1 = ((j.a) (n1)).a;
        }

        a = new int[l + j1.e * 7];
        if (!j1.l)
        {
            throw new IllegalStateException("Not on back stack");
        }
        n1 = j1.c;
        l = 0;
        while (n1 != null) 
        {
            int ai[] = a;
            int k1 = l + 1;
            ai[l] = ((j.a) (n1)).c;
            ai = a;
            int l1 = k1 + 1;
            if (((j.a) (n1)).d != null)
            {
                l = ((j.a) (n1)).d.p;
            } else
            {
                l = -1;
            }
            ai[k1] = l;
            ai = a;
            l = l1 + 1;
            ai[l1] = ((j.a) (n1)).e;
            ai = a;
            k1 = l + 1;
            ai[l] = ((j.a) (n1)).f;
            ai = a;
            l = k1 + 1;
            ai[k1] = ((j.a) (n1)).g;
            ai = a;
            k1 = l + 1;
            ai[l] = ((j.a) (n1)).h;
            if (((j.a) (n1)).i != null)
            {
                int i2 = ((j.a) (n1)).i.size();
                int ai1[] = a;
                l = k1 + 1;
                ai1[k1] = i2;
                for (k1 = 0; k1 < i2;)
                {
                    a[l] = ((Fragment)((j.a) (n1)).i.get(k1)).p;
                    k1++;
                    l++;
                }

            } else
            {
                int ai2[] = a;
                l = k1 + 1;
                ai2[k1] = 0;
            }
            n1 = ((j.a) (n1)).a;
        }
        b = j1.j;
        c = j1.k;
        d = j1.n;
        e = j1.p;
        f = j1.q;
        g = j1.r;
        h = j1.s;
        i = j1.t;
        j = j1.u;
        k = j1.v;
    }

    public j a(n n1)
    {
        j j1 = new j(n1);
        int k1 = 0;
        for (int l = 0; l < a.length;)
        {
            j.a a1 = new j.a();
            int ai[] = a;
            int i1 = l + 1;
            a1.c = ai[l];
            if (n.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(j1).append(" op #").append(k1).append(" base fragment #").append(a[i1]).toString());
            }
            ai = a;
            l = i1 + 1;
            i1 = ai[i1];
            int i2;
            if (i1 >= 0)
            {
                a1.d = (Fragment)n1.f.get(i1);
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
            l = i1 + 1;
            a1.h = ai[i1];
            ai = a;
            i1 = l + 1;
            i2 = ai[l];
            l = i1;
            if (i2 > 0)
            {
                a1.i = new ArrayList(i2);
                int l1 = 0;
                do
                {
                    l = i1;
                    if (l1 >= i2)
                    {
                        break;
                    }
                    if (n.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(j1).append(" set remove fragment #").append(a[i1]).toString());
                    }
                    Fragment fragment = (Fragment)n1.f.get(a[i1]);
                    a1.i.add(fragment);
                    l1++;
                    i1++;
                } while (true);
            }
            j1.a(a1);
            k1++;
        }

        j1.j = b;
        j1.k = c;
        j1.n = d;
        j1.p = e;
        j1.l = true;
        j1.q = f;
        j1.r = g;
        j1.s = h;
        j1.t = i;
        j1.u = j;
        j1.v = k;
        j1.a(1);
        return j1;
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
