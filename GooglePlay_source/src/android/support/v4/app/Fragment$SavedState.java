// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            Fragment

public static class mState
    implements Parcelable
{

    public static final android.os..SavedState.mState CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return new Fragment.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new Fragment.SavedState[i];
        }

    };
    final Bundle mState;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(mState);
    }


    _cls1(Parcel parcel)
    {
        mState = parcel.readBundle();
    }
}
