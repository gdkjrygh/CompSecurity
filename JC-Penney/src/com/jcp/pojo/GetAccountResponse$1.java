// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.pojo;

import android.os.Parcel;

// Referenced classes of package com.jcp.pojo:
//            GetAccountResponse

final class 
    implements android.os._cls1
{

    public GetAccountResponse createFromParcel(Parcel parcel)
    {
        return new GetAccountResponse(parcel);
    }

    public volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public GetAccountResponse[] newArray(int i)
    {
        return new GetAccountResponse[i];
    }

    public volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
