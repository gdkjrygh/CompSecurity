// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.design.widget:
//            NavigationView

public static class a extends android.view.nView.SavedState
{

    public static final android.os.ionView.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new NavigationView.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new NavigationView.SavedState[i];
        }

    };
    public Bundle a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.oParcel(parcel, i);
        parcel.writeBundle(a);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        a = parcel.readBundle();
    }

    public a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
