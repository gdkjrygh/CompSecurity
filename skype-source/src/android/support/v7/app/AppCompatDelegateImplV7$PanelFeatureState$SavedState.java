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

    public static final android.os..SavedState.c CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return AppCompatDelegateImplV7.PanelFeatureState.SavedState.a(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new AppCompatDelegateImplV7.PanelFeatureState.SavedState[i];
        }

    };
    int a;
    boolean b;
    Bundle c;

    static _cls1 a(Parcel parcel)
    {
        boolean flag = true;
        _cls1 _lcls1 = new <init>();
        _lcls1.a = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        _lcls1.b = flag;
        if (_lcls1.b)
        {
            _lcls1.c = parcel.readBundle();
        }
        return _lcls1;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (b)
        {
            parcel.writeBundle(c);
        }
    }


    private _cls1()
    {
    }
}
