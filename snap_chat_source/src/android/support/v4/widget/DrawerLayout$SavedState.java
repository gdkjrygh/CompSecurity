// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//            DrawerLayout

public static class c extends android.view.t.SavedState
{

    public static final android.os.out.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new DrawerLayout.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new DrawerLayout.SavedState[i];
        }

    };
    int a;
    int b;
    int c;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.eToParcel(parcel, i);
        parcel.writeInt(a);
    }


    public _cls1(Parcel parcel)
    {
        super(parcel);
        a = 0;
        b = 0;
        c = 0;
        a = parcel.readInt();
    }

    public a(Parcelable parcelable)
    {
        super(parcelable);
        a = 0;
        b = 0;
        c = 0;
    }
}
