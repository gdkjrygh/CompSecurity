// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;

import android.os.Parcel;

// Referenced classes of package com.microsoft.advertising.android:
//            ExpandProperties

final class 
    implements android.os.oid.ExpandProperties._cls1
{

    public final Object createFromParcel(Parcel parcel)
    {
        return new ExpandProperties(parcel);
    }

    public final volatile Object[] newArray(int i)
    {
        return new ExpandProperties[i];
    }

    ()
    {
    }
}
