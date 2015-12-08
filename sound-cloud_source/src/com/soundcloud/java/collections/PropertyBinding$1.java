// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.java.collections:
//            PropertyBinding, Property

final class 
    implements android.os.
{

    public final PropertyBinding createFromParcel(Parcel parcel)
    {
        return new PropertyBinding((Property)parcel.readParcelable(getClass().getClassLoader()), parcel.readValue(getClass().getClassLoader()));
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final PropertyBinding[] newArray(int i)
    {
        return new PropertyBinding[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
