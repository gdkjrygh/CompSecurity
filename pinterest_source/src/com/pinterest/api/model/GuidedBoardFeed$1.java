// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;

// Referenced classes of package com.pinterest.api.model:
//            GuidedBoardFeed

final class 
    implements android.os.
{

    public final GuidedBoardFeed createFromParcel(Parcel parcel)
    {
        return new GuidedBoardFeed(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final GuidedBoardFeed[] newArray(int i)
    {
        return new GuidedBoardFeed[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
