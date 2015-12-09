// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.support.v4.os.ParcelableCompat;
import android.support.v4.os.ParcelableCompatCreatorCallbacks;
import android.util.SparseArray;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

protected static class behaviorStates extends android.view.ayout.SavedState
{

    public static final android.os.eatorCallbacks CREATOR = ParcelableCompat.newCreator(new ParcelableCompatCreatorCallbacks() {

        public CoordinatorLayout.SavedState createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return new CoordinatorLayout.SavedState(parcel, classloader);
        }

        public volatile Object createFromParcel(Parcel parcel, ClassLoader classloader)
        {
            return createFromParcel(parcel, classloader);
        }

        public CoordinatorLayout.SavedState[] newArray(int i)
        {
            return new CoordinatorLayout.SavedState[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

    });
    SparseArray behaviorStates;

    public void writeToParcel(Parcel parcel, int i)
    {
        int k = 0;
        super.rcel(parcel, i);
        int ai[];
        Parcelable aparcelable[];
        int j;
        if (behaviorStates != null)
        {
            j = behaviorStates.size();
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        ai = new int[j];
        aparcelable = new Parcelable[j];
        for (; k < j; k++)
        {
            ai[k] = behaviorStates.keyAt(k);
            aparcelable[k] = (Parcelable)behaviorStates.valueAt(k);
        }

        parcel.writeIntArray(ai);
        parcel.writeParcelableArray(aparcelable, i);
    }


    public _cls1(Parcel parcel, ClassLoader classloader)
    {
        super(parcel);
        int j = parcel.readInt();
        int ai[] = new int[j];
        parcel.readIntArray(ai);
        parcel = parcel.readParcelableArray(classloader);
        behaviorStates = new SparseArray(j);
        for (int i = 0; i < j; i++)
        {
            behaviorStates.append(ai[i], parcel[i]);
        }

    }

    public behaviorStates(Parcelable parcelable)
    {
        super(parcelable);
    }
}
