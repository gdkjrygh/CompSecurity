// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.internal;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.util.SparseArray;

public class ParcelableSparseArray extends SparseArray
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

        public ParcelableSparseArray createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return new ParcelableSparseArray(parcel, classloader);
        }

        public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return createFromParcel(parcel, classloader);
        }

        public ParcelableSparseArray[] newArray(int i)
        {
            return new ParcelableSparseArray[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    });

    public ParcelableSparseArray()
    {
    }

    public ParcelableSparseArray(Parcel parcel, ClassLoader classloader)
    {
        int j = parcel.readInt();
        int ai[] = new int[j];
        parcel.readIntArray(ai);
        parcel = parcel.readParcelableArray(classloader);
        for (int i = 0; i < j; i++)
        {
            put(ai[i], parcel[i]);
        }

    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        int k = size();
        int ai[] = new int[k];
        Parcelable aparcelable[] = new Parcelable[k];
        for (int j = 0; j < k; j++)
        {
            ai[j] = keyAt(j);
            aparcelable[j] = (Parcelable)valueAt(j);
        }

        parcel.writeInt(k);
        parcel.writeIntArray(ai);
        parcel.writeParcelableArray(aparcelable, i);
    }

}
