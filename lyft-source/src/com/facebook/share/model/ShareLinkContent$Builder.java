// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareLinkContent, ShareContent, ShareModelBuilder, ShareModel

public final class  extends 
{

    private String contentDescription;
    private String contentTitle;
    private Uri imageUrl;

    public ShareLinkContent build()
    {
        return new ShareLinkContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareLinkContent)sharecontent);
    }

    public readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareLinkContent)parcel.readParcelable(com/facebook/share/model/ShareLinkContent.getClassLoader()));
    }

    public readFrom readFrom(ShareLinkContent sharelinkcontent)
    {
        if (sharelinkcontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.From(sharelinkcontent)).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
        }
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareLinkContent)sharemodel);
    }

    public readFrom setContentDescription(String s)
    {
        contentDescription = s;
        return this;
    }

    public contentDescription setContentTitle(String s)
    {
        contentTitle = s;
        return this;
    }

    public contentTitle setImageUrl(Uri uri)
    {
        imageUrl = uri;
        return this;
    }




    public ()
    {
    }
}
