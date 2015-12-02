// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.profile;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

// Referenced classes of package com.qihoo.security.profile:
//            ProfileDataKeeper

static final class e
    implements Parcelable
{

    public static final android.os.taKeeper.Sample.e CREATOR = new android.os.Parcelable.Creator() {

        public ProfileDataKeeper.Sample a(Parcel parcel)
        {
            return new ProfileDataKeeper.Sample(parcel);
        }

        public ProfileDataKeeper.Sample[] a(int i)
        {
            return new ProfileDataKeeper.Sample[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    long a;
    long b;
    int c;
    String d;
    SparseArray e;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeLong(a);
        parcel.writeLong(b);
        parcel.writeInt(c);
        String s;
        int j;
        if (d == null)
        {
            s = "";
        } else
        {
            s = d;
        }
        parcel.writeString(s);
        j = e.size();
        parcel.writeInt(j);
        for (i = 0; i < j; i++)
        {
            parcel.writeInt(e.keyAt(i));
            String s1 = (String)e.valueAt(i);
            s = s1;
            if (s1 == null)
            {
                s = "";
            }
            parcel.writeString(s);
        }

    }


    _cls1()
    {
        e = new SparseArray();
    }

    e(Parcel parcel)
    {
        e = new SparseArray();
        a = parcel.readLong();
        b = parcel.readLong();
        c = parcel.readInt();
        d = parcel.readString();
        int j = parcel.readInt();
        for (int i = 0; i < j; i++)
        {
            e.put(parcel.readInt(), parcel.readString());
        }

    }
}
