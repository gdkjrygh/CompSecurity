// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cardinalblue.android.piccollage.model.memento;

import android.os.Bundle;
import android.os.Parcel;

// Referenced classes of package com.cardinalblue.android.piccollage.model.memento:
//            IMemento

public class BaseMemento
    implements IMemento
{

    public static final android.os.Parcelable.Creator CREATOR = new android.os.Parcelable.Creator() {

        public IMemento a(Parcel parcel)
        {
            return new BaseMemento(parcel);
        }

        public IMemento[] a(int i)
        {
            return new BaseMemento[i];
        }

        public Object createFromParcel(Parcel parcel)
        {
            return a(parcel);
        }

        public Object[] newArray(int i)
        {
            return a(i);
        }

    };
    private Bundle a;

    public BaseMemento()
    {
        a = new Bundle();
    }

    public BaseMemento(Bundle bundle)
    {
        a = new Bundle();
        a(bundle);
    }

    public BaseMemento(Parcel parcel)
    {
        a = new Bundle();
        a(parcel.readBundle());
    }

    public Bundle a()
    {
        return a;
    }

    public void a(Bundle bundle)
    {
        a = bundle;
    }

    public int describeContents()
    {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeBundle(a());
    }

}
