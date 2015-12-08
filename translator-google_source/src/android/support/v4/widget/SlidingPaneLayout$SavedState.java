// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v4.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v4.widget:
//            bp

class a extends android.view.t.SavedState
{

    public static final android.os.out.SavedState.a CREATOR = new bp();
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


    (Parcel parcel)
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

    a(Parcelable parcelable)
    {
        super(parcelable);
    }
}
