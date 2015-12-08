// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

class g
    implements Parcelable
{

    public static final android.os.ger.SavedState.g CREATOR = new android.os.Parcelable.Creator() {

        public StaggeredGridLayoutManager.SavedState a(Parcel parcel)
        {
            return new StaggeredGridLayoutManager.SavedState(parcel);
        }

        public StaggeredGridLayoutManager.SavedState[] a(int k)
        {
            return new StaggeredGridLayoutManager.SavedState[k];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int k)
        {
            return a(k);
        }

    };
    int a;
    int b;
    int c;
    int d[];
    int e;
    int f[];
    List g;
    boolean h;
    boolean i;
    boolean j;

    void a()
    {
        d = null;
        c = 0;
        e = 0;
        f = null;
        g = null;
    }

    void b()
    {
        d = null;
        c = 0;
        a = -1;
        b = -1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = true;
        parcel.writeInt(a);
        parcel.writeInt(b);
        parcel.writeInt(c);
        if (c > 0)
        {
            parcel.writeIntArray(d);
        }
        parcel.writeInt(e);
        if (e > 0)
        {
            parcel.writeIntArray(f);
        }
        if (h)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        if (i)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        if (j)
        {
            k = ((flag) ? 1 : 0);
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        parcel.writeList(g);
    }


    public _cls1()
    {
    }

    _cls1(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readInt();
        b = parcel.readInt();
        c = parcel.readInt();
        if (c > 0)
        {
            d = new int[c];
            parcel.readIntArray(d);
        }
        e = parcel.readInt();
        if (e > 0)
        {
            f = new int[e];
            parcel.readIntArray(f);
        }
        boolean flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        h = flag;
        if (parcel.readInt() == 1)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        i = flag;
        if (parcel.readInt() == 1)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        j = flag;
        g = parcel.readArrayList(android/support/v7/widget/StaggeredGridLayoutManager$LazySpanLookup$FullSpanItem.getClassLoader());
    }

    public g(g g1)
    {
        c = g1.c;
        a = g1.a;
        b = g1.b;
        d = g1.d;
        e = g1.e;
        f = g1.f;
        h = g1.h;
        i = g1.i;
        j = g1.j;
        g = g1.g;
    }
}
