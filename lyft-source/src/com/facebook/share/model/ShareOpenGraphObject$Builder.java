// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphObject, ShareModelBuilder

public final class putBoolean extends Builder
{

    public ShareOpenGraphObject build()
    {
        return new ShareOpenGraphObject(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public readFrom readFrom(Parcel parcel)
    {
        return (readFrom)readFrom(((ShareOpenGraphValueContainer) ((ShareOpenGraphObject)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphObject.getClassLoader()))));
    }

    public Builder()
    {
        putBoolean("fbsdk:create_object", true);
    }
}
