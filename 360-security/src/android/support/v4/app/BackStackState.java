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
//            d, Fragment, FragmentManagerImpl

final class BackStackState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public BackStackState a(Parcel parcel)
        {
            return new BackStackState(parcel);
        }

        public BackStackState[] a(int j)
        {
            return new BackStackState[j];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int j)
        {
            return a(j);
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

    public BackStackState(FragmentManagerImpl fragmentmanagerimpl, d d1)
    {
        fragmentmanagerimpl = d1.b;
        int j;
        int k;
        for (j = 0; fragmentmanagerimpl != null; j = k)
        {
            k = j;
            if (((d.a) (fragmentmanagerimpl)).i != null)
            {
                k = j + ((d.a) (fragmentmanagerimpl)).i.size();
            }
            fragmentmanagerimpl = ((d.a) (fragmentmanagerimpl)).a;
        }

        a = new int[j + d1.d * 7];
        if (!d1.k)
        {
            throw new IllegalStateException("Not on back stack");
        }
        fragmentmanagerimpl = d1.b;
        j = 0;
        while (fragmentmanagerimpl != null) 
        {
            int ai[] = a;
            int l = j + 1;
            ai[j] = ((d.a) (fragmentmanagerimpl)).c;
            ai = a;
            int i1 = l + 1;
            if (((d.a) (fragmentmanagerimpl)).d != null)
            {
                j = ((d.a) (fragmentmanagerimpl)).d.mIndex;
            } else
            {
                j = -1;
            }
            ai[l] = j;
            ai = a;
            j = i1 + 1;
            ai[i1] = ((d.a) (fragmentmanagerimpl)).e;
            ai = a;
            l = j + 1;
            ai[j] = ((d.a) (fragmentmanagerimpl)).f;
            ai = a;
            j = l + 1;
            ai[l] = ((d.a) (fragmentmanagerimpl)).g;
            ai = a;
            l = j + 1;
            ai[j] = ((d.a) (fragmentmanagerimpl)).h;
            if (((d.a) (fragmentmanagerimpl)).i != null)
            {
                int j1 = ((d.a) (fragmentmanagerimpl)).i.size();
                int ai1[] = a;
                j = l + 1;
                ai1[l] = j1;
                for (l = 0; l < j1;)
                {
                    a[j] = ((Fragment)((d.a) (fragmentmanagerimpl)).i.get(l)).mIndex;
                    l++;
                    j++;
                }

            } else
            {
                int ai2[] = a;
                j = l + 1;
                ai2[l] = 0;
            }
            fragmentmanagerimpl = ((d.a) (fragmentmanagerimpl)).a;
        }
        b = d1.i;
        c = d1.j;
        d = d1.m;
        e = d1.o;
        f = d1.p;
        g = d1.q;
        h = d1.r;
        i = d1.s;
    }

    public d a(FragmentManagerImpl fragmentmanagerimpl)
    {
        d d1 = new d(fragmentmanagerimpl);
        int l = 0;
        for (int j = 0; j < a.length;)
        {
            d.a a1 = new d.a();
            int ai[] = a;
            int k = j + 1;
            a1.c = ai[j];
            if (FragmentManagerImpl.a)
            {
                Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(d1).append(" op #").append(l).append(" base fragment #").append(a[k]).toString());
            }
            ai = a;
            j = k + 1;
            k = ai[k];
            int j1;
            if (k >= 0)
            {
                a1.d = (Fragment)fragmentmanagerimpl.f.get(k);
            } else
            {
                a1.d = null;
            }
            ai = a;
            k = j + 1;
            a1.e = ai[j];
            ai = a;
            j = k + 1;
            a1.f = ai[k];
            ai = a;
            k = j + 1;
            a1.g = ai[j];
            ai = a;
            j = k + 1;
            a1.h = ai[k];
            ai = a;
            k = j + 1;
            j1 = ai[j];
            j = k;
            if (j1 > 0)
            {
                a1.i = new ArrayList(j1);
                int i1 = 0;
                do
                {
                    j = k;
                    if (i1 >= j1)
                    {
                        break;
                    }
                    if (FragmentManagerImpl.a)
                    {
                        Log.v("FragmentManager", (new StringBuilder()).append("Instantiate ").append(d1).append(" set remove fragment #").append(a[k]).toString());
                    }
                    Fragment fragment = (Fragment)fragmentmanagerimpl.f.get(a[k]);
                    a1.i.add(fragment);
                    i1++;
                    k++;
                } while (true);
            }
            d1.a(a1);
            l++;
        }

        d1.i = b;
        d1.j = c;
        d1.m = d;
        d1.o = e;
        d1.k = true;
        d1.p = f;
        d1.q = g;
        d1.r = h;
        d1.s = i;
        d1.a(1);
        return d1;
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
