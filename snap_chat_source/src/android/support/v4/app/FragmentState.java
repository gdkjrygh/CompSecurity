// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            Fragment

public final class FragmentState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new FragmentState(parcel);
        }

        public final volatile Object[] newArray(int l)
        {
            return new FragmentState[l];
        }

    };
    public final String a;
    public final int b;
    public final boolean c;
    public final int d;
    public final int e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final Bundle i;
    public Bundle j;
    public Fragment k;

    public FragmentState(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        a = parcel.readString();
        b = parcel.readInt();
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        c = flag;
        d = parcel.readInt();
        e = parcel.readInt();
        f = parcel.readString();
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        g = flag;
        if (parcel.readInt() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        h = flag;
        i = parcel.readBundle();
        j = parcel.readBundle();
    }

    public FragmentState(Fragment fragment)
    {
        a = fragment.getClass().getName();
        b = fragment.mIndex;
        c = fragment.mFromLayout;
        d = fragment.mFragmentId;
        e = fragment.mContainerId;
        f = fragment.mTag;
        g = fragment.mRetainInstance;
        h = fragment.mDetached;
        i = fragment.mArguments;
    }

    public final int describeContents()
    {
        return 0;
    }

    public final void writeToParcel(Parcel parcel, int l)
    {
        boolean flag = true;
        parcel.writeString(a);
        parcel.writeInt(b);
        if (c)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeInt(d);
        parcel.writeInt(e);
        parcel.writeString(f);
        if (g)
        {
            l = 1;
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        if (h)
        {
            l = ((flag) ? 1 : 0);
        } else
        {
            l = 0;
        }
        parcel.writeInt(l);
        parcel.writeBundle(i);
        parcel.writeBundle(j);
    }

}
