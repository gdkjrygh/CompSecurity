// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.view;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.support.v4.os.ParcelableCompatCreatorHoneycombMR2;

// Referenced classes of package android.support.v4.view:
//            ViewPager

public static class loader extends android.view.SavedState
{

    public static final android.os.r.SavedState.CREATOR CREATOR;
    Parcelable adapterState;
    ClassLoader loader;
    int position;

    public String toString()
    {
        return (new StringBuilder("FragmentPager.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" position=").append(position).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.riteToParcel(parcel, i);
        parcel.writeInt(position);
        parcel.writeParcelable(adapterState, i);
    }

    static 
    {
        Object obj = new ParcelableCompatCreatorCallbacks() {

            public final volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
            {
                return new ViewPager.SavedState(parcel, classloader);
            }

            public final volatile Object[] newArray(int i)
            {
                return new ViewPager.SavedState[i];
            }

        };
        if (android.os. >= 13)
        {
            obj = new ParcelableCompatCreatorHoneycombMR2(((ParcelableCompatCreatorCallbacks) (obj)));
        } else
        {
            obj = new android.support.v4.os.atCreator(((ParcelableCompatCreatorCallbacks) (obj)));
        }
        CREATOR = ((android.os.r.SavedState.CREATOR) (obj));
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
}
