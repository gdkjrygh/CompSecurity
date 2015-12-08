// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;

// Referenced classes of package com.pinterest.api.model:
//            CommentFeed

final class 
    implements android.os.ator
{

    public final CommentFeed createFromParcel(Parcel parcel)
    {
        return new CommentFeed(parcel);
    }

    public final volatile Object createFromParcel(Parcel parcel)
    {
        return createFromParcel(parcel);
    }

    public final CommentFeed[] newArray(int i)
    {
        return new CommentFeed[i];
    }

    public final volatile Object[] newArray(int i)
    {
        return newArray(i);
    }

    ()
    {
    }
}
