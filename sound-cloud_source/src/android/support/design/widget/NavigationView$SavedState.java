// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.design.widget:
//            NavigationView

public static class menuState extends android.view.nView.SavedState
{

    public static final android.os.ionView.SavedState._cls1 CREATOR = new _cls1();
    public Bundle menuState;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.oParcel(parcel, i);
        parcel.writeBundle(menuState);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        menuState = parcel.readBundle();
    }

    public menuState(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements android.os.Parcelable.Creator
    {

        public final NavigationView.SavedState createFromParcel(Parcel parcel)
        {
            return new NavigationView.SavedState(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final NavigationView.SavedState[] newArray(int i)
        {
            return new NavigationView.SavedState[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

            _cls1()
            {
            }
    }

}
