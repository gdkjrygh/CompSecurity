// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, ShareVideo, ShareModel

public final class 
    implements ShareModelBuilder
{

    private Uri localUrl;

    public final ShareVideo build()
    {
        return new ShareVideo(this, null);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareVideo)sharemodel);
    }

    public final readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareVideo)parcel.readParcelable(com/facebook/share/model/ShareVideo.getClassLoader()));
    }

    public final readFrom readFrom(ShareVideo sharevideo)
    {
        if (sharevideo == null)
        {
            return this;
        } else
        {
            return setLocalUrl(sharevideo.getLocalUrl());
        }
    }

    public final Url setLocalUrl(Uri uri)
    {
        localUrl = uri;
        return this;
    }


    public ()
    {
    }
}
