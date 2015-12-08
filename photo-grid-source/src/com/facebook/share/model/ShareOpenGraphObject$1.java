// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphObject

final class 
    implements android.os.GraphObject._cls1
{

    public final ShareOpenGraphObject createFromParcel(Parcel parcel)
    {
        return new ShareOpenGraphObject(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final ShareOpenGraphObject[] newArray(int i)
    {
        return new ShareOpenGraphObject[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
