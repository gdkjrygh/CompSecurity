// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.design.widget;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;

// Referenced classes of package android.support.design.widget:
//            CoordinatorLayout

protected static class a extends android.view.ayout.SavedState
{

    public static final android.os.rLayout.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new CoordinatorLayout.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new CoordinatorLayout.SavedState[i];
        }

    };
    SparseArray a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.rcel(parcel, i);
        int ai[];
        Parcelable aparcelable[];
        int j;
        if (a != null)
        {
            j = a.size();
        } else
        {
            j = 0;
        }
        parcel.writeInt(j);
        ai = new int[j];
        aparcelable = new Parcelable[j];
        for (int k = 0; k < j; k++)
        {
            ai[k] = a.keyAt(k);
            aparcelable[k] = (Parcelable)a.valueAt(k);
        }

        parcel.writeIntArray(ai);
        parcel.writeParcelableArray(aparcelable, i);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        int j = parcel.readInt();
        int ai[] = new int[j];
        parcel.readIntArray(ai);
        parcel = parcel.readParcelableArray(android/support/design/widget/CoordinatorLayout.getClassLoader());
        a = new SparseArray(j);
        for (int i = 0; i < j; i++)
        {
            a.append(ai[i], parcel[i]);
        }

    }

    public a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
