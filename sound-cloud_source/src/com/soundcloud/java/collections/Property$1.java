// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.soundcloud.java.collections;

import android.os.Parcel;

// Referenced classes of package com.soundcloud.java.collections:
//            Property

final class 
    implements android.os.Creator
{

    public final Property createFromParcel(Parcel parcel)
    {
        Class class1;
        Class class2;
        try
        {
            class1 = Class.forName(parcel.readString());
            class2 = Class.forName(parcel.readString());
        }
        // Misplaced declaration of an exception variable
        catch (Parcel parcel)
        {
            throw new IllegalStateException((new StringBuilder("Unable to restore parceled property type\n")).append(parcel).toString());
        }
        return new Property(class1, class2, parcel.readInt());
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final Property[] newArray(int i)
    {
        return new Property[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
