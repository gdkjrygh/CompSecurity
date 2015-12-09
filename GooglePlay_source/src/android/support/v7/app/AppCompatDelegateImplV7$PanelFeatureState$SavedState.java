// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private static class _cls1
    implements Parcelable
{

    public static final android.os..SavedState.menuState CREATOR = new android.os.Parcelable.Creator() {

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return boolean flag = true;
        }

        public final volatile Object[] newArray(int i)
        {
            return new AppCompatDelegateImplV7.PanelFeatureState.SavedState[i];
        }

    };
    int featureId;
    boolean isOpen;
    Bundle menuState;

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(featureId);
        if (isOpen)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (isOpen)
        {
            parcel.writeBundle(menuState);
        }
    }



/*
    static _cls1 access$1100(Parcel parcel)
    {
        boolean flag = true;
        _cls1 _lcls1 = new <init>();
        _lcls1.featureId = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        _lcls1.isOpen = flag;
        if (_lcls1.isOpen)
        {
            _lcls1.menuState = parcel.readBundle();
        }
        return _lcls1;
    }

*/

    private _cls1()
    {
    }
}
