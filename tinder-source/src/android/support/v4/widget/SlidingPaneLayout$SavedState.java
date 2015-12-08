// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//            SlidingPaneLayout

static class <init> extends android.view.t.SavedState
{

    public static final android.os.out.SavedState.a CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new SlidingPaneLayout.SavedState(parcel, (byte)0);
        }

        public final volatile Object[] newArray(int i)
        {
            return new SlidingPaneLayout.SavedState[i];
        }

    };
    boolean a;

    public void writeToParcel(Parcel parcel, int i)
    {
        super.rcel(parcel, i);
        if (a)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    private _cls1(Parcel parcel)
    {
        super(parcel);
        boolean flag;
        if (parcel.readInt() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        a = flag;
    }

    a(Parcel parcel, byte byte0)
    {
        this(parcel);
    }

    <init>(Parcelable parcelable)
    {
        super(parcelable);
    }
}
