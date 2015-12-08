// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package android.support.v7.app;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

// Referenced classes of package android.support.v7.app:
//            ag

class Q
    implements Parcelable
{

    public static final android.os..SavedState.c CREATOR = new ag();
    int a;
    boolean b;
    Bundle c;

    static Q a(Parcel parcel)
    {
        boolean flag = true;
        Q q = new <init>();
        q.a = parcel.readInt();
        if (parcel.readInt() != 1)
        {
            flag = false;
        }
        q.b = flag;
        if (q.b)
        {
            q.c = parcel.readBundle();
        }
        return q;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeInt(a);
        if (b)
        {
            i = 1;
        } else
        {
            i = 0;
        }
        parcel.writeInt(i);
        if (b)
        {
            parcel.writeBundle(c);
        }
    }


    private Q()
    {
    }
}
