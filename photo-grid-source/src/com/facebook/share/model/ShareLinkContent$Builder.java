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

    public final ShareLinkContent build()
    {
        return new ShareLinkContent(this, null);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareLinkContent)sharecontent);
    }

    public final readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareLinkContent)parcel.readParcelable(com/facebook/share/model/ShareLinkContent.getClassLoader()));
    }

    public final readFrom readFrom(ShareLinkContent sharelinkcontent)
    {
        if (sharelinkcontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.From(sharelinkcontent)).setContentDescription(sharelinkcontent.getContentDescription()).setImageUrl(sharelinkcontent.getImageUrl()).setContentTitle(sharelinkcontent.getContentTitle());
        }
    }

    public final volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareLinkContent)sharemodel);
    }

    public final readFrom setContentDescription(String s)
    {
        contentDescription = s;
        return this;
    }

    public final contentDescription setContentTitle(String s)
    {
        contentTitle = s;
        return this;
    }

    public final contentTitle setImageUrl(Uri uri)
    {
        imageUrl = uri;
        return this;
    }




    public ()
    {
    }
}
