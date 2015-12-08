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

    public static final android.os..SavedState.mState CREATOR = new _cls1();
    final Bundle mState;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(mState);
    }


    _cls1(Bundle bundle)
    {
        mState = bundle;
    }

    mState(Parcel parcel, ClassLoader classloader)
    {
        mState = parcel.readBundle();
        if (classloader != null && mState != null)
        {
            mState.setClassLoader(classloader);
        }
    }

    /* block-local class not found */
    class _cls1 {}

}
