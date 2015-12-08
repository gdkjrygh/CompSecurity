// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.widget;

import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.widget:
//            LinearLayoutManager

static class c
    implements Parcelable
{

    public static final android.os.ger.SavedState.c CREATOR = new android.os.Parcelable.Creator() {

        public final Object createFromParcel(Parcel parcel)
        {
            return new LinearLayoutManager.SavedState(parcel);
        }

        public final volatile Object[] newArray(int i)
        {
            return new LinearLayoutManager.SavedState[i];
        }

    };
    int a;
    int b;
    boolean c;

    final boolean a()
    {
        return a >= 0;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        parcel.writeInt(b);
        if (c)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
    }


    public _cls1()
    {
    }

    _cls1(Parcel parcel)
    {
        boolean flag = true;
        super();
        a = parcel.readInt();
        b = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        c = flag;
    }

    public c(c c1)
    {
        a = c1.a;
        b = c1.b;
        c = c1.c;
    }
}
