// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.content.Context;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            z, Fragment, p, s

final class FragmentState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new z();
    final String a;
    final int b;
    final int c;
    final boolean d;
    final int e;
    final int f;
    final String g;
    final boolean h;
    final boolean i;
    final Bundle j;
    Bundle k;
    Fragment l;

    public FragmentState(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readInt();
        c = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        d = flag;
        e = parcel.readInt();
        f = parcel.readInt();
        g = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        i = flag;
        j = parcel.readBundle();
        k = parcel.readBundle();
    }

    public FragmentState(Fragment fragment)
    {
        a = fragment.getClass().getName();
        b = fragment.o;
        c = fragment.p;
        d = fragment.y;
        e = fragment.G;
        f = fragment.H;
        g = fragment.I;
        h = fragment.L;
        i = fragment.K;
        j = fragment.r;
    }

    public Fragment a(p p1, Fragment fragment)
    {
        if (l != null)
        {
            return l;
        }
        if (j != null)
        {
            j.setClassLoader(p1.a().getClassLoader());
        }
        l = Fragment.a(p1.a(), a, j);
        if (k != null)
        {
            k.setClassLoader(p1.a().getClassLoader());
            l.m = k;
        }
        l.a(b, fragment);
        l.p = c;
        l.y = d;
        l.A = true;
        l.G = e;
        l.H = f;
        l.I = g;
        l.L = h;
        l.K = i;
        l.C = p1.g();
        if (s.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Instantiated fragment ").append(l).toString());
        }
        return l;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i1)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        if (d)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeInt(e);
        parcel.writeInt(f);
        parcel.writeString(g);
        if (h)
        {
            i1 = 1;
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        if (i)
        {
            i1 = ((flag) ? 1 : 0);
        } else
        {
            i1 = 0;
        }
        parcel.writeInt(i1);
        parcel.writeBundle(j);
        parcel.writeBundle(k);
    }

}
