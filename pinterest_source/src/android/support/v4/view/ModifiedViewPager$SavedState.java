// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;

public class loader extends android.view.SavedState
{

    public static final android.os.eatorCallbacks CREATOR = ParcelableCompat.newCreator(new _cls1());
    Parcelable adapterState;
    ClassLoader loader;
    int position;

    public String toString()
    {
        return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(position).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.rcel(parcel, i);
        parcel.writeInt(position);
        parcel.writeParcelable(adapterState, i);
    }


    _cls1(Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        ClassLoader classloader1 = classloader;
        if (classloader == null)
        {
            classloader1 = getClass().getClassLoader();
        }
        position = parcel.readInt();
        adapterState = parcel.readParcelable(classloader1);
        loader = classloader1;
    }

    public loader(Parcelable parcelable)
    {
        super(parcelable);
    }

    class _cls1
        implements ParcelableCompatCreatorCallbacks
    {

        public final ModifiedViewPager.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return new ModifiedViewPager.SavedState(parcel, classloader);
        }

        public final volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return createFromParcel(parcel, classloader);
        }

        public final ModifiedViewPager.SavedState[] newArray(int i)
        {
            return new ModifiedViewPager.SavedState[i];
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
