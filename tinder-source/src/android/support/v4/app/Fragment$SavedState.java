// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            Fragment

public static class a
    implements Parcelable
{

    public static final android.os..SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new Fragment.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Fragment.SavedState[i];
        }

    };
    final Bundle a;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(a);
    }


    _cls1(Bundle bundle)
    {
        a = bundle;
    }

    a(Parcel parcel)
    {
        a = parcel.readBundle();
    }
}
