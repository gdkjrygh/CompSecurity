// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Log;

// Referenced classes of package android.support.v4.app:
//            Fragment, FragmentActivity, i

final class FragmentState
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public FragmentState a(Parcel parcel)
        {
            return new FragmentState(parcel);
        }

        public FragmentState[] a(int l)
        {
            return new FragmentState[l];
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
    final String a;
    final int b;
    final boolean c;
    final int d;
    final int e;
    final String f;
    final boolean g;
    final boolean h;
    final Bundle i;
    Bundle j;
    Fragment k;

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

    public Fragment a(FragmentActivity fragmentactivity, Fragment fragment)
    {
        if (k != null)
        {
            return k;
        }
        if (i != null)
        {
            i.setClassLoader(fragmentactivity.getClassLoader());
        }
        k = Fragment.instantiate(fragmentactivity, a, i);
        if (j != null)
        {
            j.setClassLoader(fragmentactivity.getClassLoader());
            k.mSavedFragmentState = j;
        }
        k.setIndex(b, fragment);
        k.mFromLayout = c;
        k.mRestored = true;
        k.mFragmentId = d;
        k.mContainerId = e;
        k.mTag = f;
        k.mRetainInstance = g;
        k.mDetached = h;
        k.mFragmentManager = fragmentactivity.b;
        if (i.a)
        {
            Log.v("FragmentManager", (new StringBuilder()).append("Instantiated fragment ").append(k).toString());
        }
        return k;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int l)
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
