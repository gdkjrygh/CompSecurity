// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.design.widget:
//            NavigationView

public static class menuState extends android.view.nView.SavedState
{

    public static final android.os.tCreatorCallbacks CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

        public NavigationView.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return new NavigationView.SavedState(parcel, classloader);
        }

        public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return createFromParcel(parcel, classloader);
        }

        public NavigationView.SavedState[] newArray(int i)
        {
            return new NavigationView.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    });
    public Bundle menuState;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.oParcel(parcel, i);
        parcel.writeBundle(menuState);
    }


    public _cls1(Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        menuState = parcel.readBundle(classloader);
    }

    public menuState(Parcelable parcelable)
    {
        super(parcelable);
    }
}
