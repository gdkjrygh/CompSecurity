// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.java.collections:
//            PropertySet

final class 
    implements android.os.ator
{

    public final PropertySet createFromParcel(Parcel parcel)
    {
        return new PropertySet(parcel.readSparseArray(com/soundcloud/java/collections/PropertySet.getClassLoader()), null);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final PropertySet[] newArray(int i)
    {
        return new PropertySet[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
