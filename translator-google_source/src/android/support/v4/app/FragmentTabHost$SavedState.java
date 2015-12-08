// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.app;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.app:
//            ac

class a extends android.view.avedState
{

    public static final android.os..SavedState.a CREATOR = new ac();
    String a;

    public String toString()
    {
        return (new StringBuilder("FragmentTabHost.SavedState{")).append(Integer.toHexString(System.identityHashCode(this))).append(" curTab=").append(a).append("}").toString();
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        super.Parcel(parcel, i);
        parcel.writeString(a);
    }


    (Parcel parcel)
    {
        super(parcel);
        a = parcel.readString();
    }

    a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
