// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;

// Referenced classes of package android.support.v7.app:
//            AppCompatDelegateImplV7

private static class <init>
    implements Parcelable
{

    public static final android.os..SavedState.menuState CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

        public AppCompatDelegateImplV7.PanelFeatureState.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return AppCompatDelegateImplV7.PanelFeatureState.SavedState.readFromParcel(parcel, classloader);
        }

        public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return createFromParcel(parcel, classloader);
        }

        public AppCompatDelegateImplV7.PanelFeatureState.SavedState[] newArray(int i)
        {
            return new AppCompatDelegateImplV7.PanelFeatureState.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    });
    int featureId;
    boolean isOpen;
    Bundle menuState;

    private static <init> readFromParcel(Parcel parcel, ClassLoader classloader)
    {
        boolean flag = true;
        <init> <init>1 = new <init>();
        <init>1.featureId = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        <init>1.isOpen = flag;
        if (<init>1.isOpen)
        {
            <init>1.menuState = parcel.readBundle(classloader);
        }
        return <init>1;
    }

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



    private _cls1()
    {
    }

    _cls1(_cls1 _pcls1)
    {
        this();
    }
}
