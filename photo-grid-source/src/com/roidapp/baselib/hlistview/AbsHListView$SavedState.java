// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.hlistview;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.util.LongSparseArray;
import android.support.v4.util.SparseArrayCompat;

// Referenced classes of package com.roidapp.baselib.hlistview:
//            o

class <init> extends android.view.tView.SavedState
{

    public static final android.os.rray.valueAt CREATOR = new o();
    long a;
    long b;
    int c;
    int d;
    int e;
    String f;
    boolean g;
    int h;
    SparseArrayCompat i;
    LongSparseArray j;

    private static void a(LongSparseArray longsparsearray, Parcel parcel, int k)
    {
        for (; k > 0; k--)
        {
            longsparsearray.put(parcel.readLong(), Integer.valueOf(parcel.readInt()));
        }

    }

    private static void a(SparseArrayCompat sparsearraycompat, Parcel parcel, int k)
    {
        while (k > 0) 
        {
            int l = parcel.readInt();
            boolean flag;
            if (parcel.readByte() == 1)
            {
                flag = true;
            } else
            {
                flag = false;
            }
            sparsearraycompat.append(l, Boolean.valueOf(flag));
            k--;
        }
    }

    public String toString()
    {
        return (new StringBuilder("AbsListView.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" selectedId=").append(a).append(" firstId=").append(b).append(" viewLeft=").append(c).append(" position=").append(d).append(" width=").append(e).append(" filter=").append(f).append(" checkState=").append(i).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int k)
    {
        boolean flag = false;
        super.eToParcel(parcel, k);
        parcel.writeLong(a);
        parcel.writeLong(b);
        parcel.writeInt(c);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeString(f);
        Object obj;
        if (g)
        {
            k = 1;
        } else
        {
            k = 0;
        }
        parcel.writeByte((byte)k);
        parcel.writeInt(h);
        obj = i;
        if (obj == null)
        {
            parcel.writeInt(-1);
        } else
        {
            int j1 = ((SparseArrayCompat) (obj)).size();
            parcel.writeInt(j1);
            k = 0;
            while (k < j1) 
            {
                parcel.writeInt(((SparseArrayCompat) (obj)).keyAt(k));
                int i1;
                if (((Boolean)((SparseArrayCompat) (obj)).valueAt(k)).booleanValue())
                {
                    i1 = 1;
                } else
                {
                    i1 = 0;
                }
                parcel.writeByte((byte)i1);
                k++;
            }
        }
        obj = j;
        if (obj != null)
        {
            k = ((LongSparseArray) (obj)).size();
        } else
        {
            k = 0;
        }
        parcel.writeInt(k);
        for (int l = ((flag) ? 1 : 0); l < k; l++)
        {
            parcel.writeLong(((LongSparseArray) (obj)).keyAt(l));
            parcel.writeInt(((Integer)((LongSparseArray) (obj)).valueAt(l)).intValue());
        }

    }


    private (Parcel parcel)
    {
        Object obj = null;
        super(parcel);
        a = parcel.readLong();
        b = parcel.readLong();
        c = parcel.readInt();
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readString();
        SparseArrayCompat sparsearraycompat;
        int k;
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        h = parcel.readInt();
        k = parcel.readInt();
        if (k < 0)
        {
            sparsearraycompat = null;
        } else
        {
            sparsearraycompat = new SparseArrayCompat(k);
            a(sparsearraycompat, parcel, k);
        }
        i = sparsearraycompat;
        k = parcel.readInt();
        if (k <= 0)
        {
            parcel = obj;
        } else
        {
            LongSparseArray longsparsearray = new LongSparseArray(k);
            a(longsparsearray, parcel, k);
            parcel = longsparsearray;
        }
        j = parcel;
    }

    j(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
