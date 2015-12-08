// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, AppInviteContent, ShareModel

public static class 
    implements ShareModelBuilder
{

    private String applinkUrl;
    private String previewImageUrl;

    public AppInviteContent build()
    {
        return new AppInviteContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public build readFrom(Parcel parcel)
    {
        return readFrom((AppInviteContent)parcel.readParcelable(com/facebook/share/model/AppInviteContent.getClassLoader()));
    }

    public readFrom readFrom(AppInviteContent appinvitecontent)
    {
        if (appinvitecontent == null)
        {
            return this;
        } else
        {
            return setApplinkUrl(appinvitecontent.getApplinkUrl()).setPreviewImageUrl(appinvitecontent.getPreviewImageUrl());
        }
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((AppInviteContent)sharemodel);
    }

    public readFrom setApplinkUrl(String s)
    {
        applinkUrl = s;
        return this;
    }

    public applinkUrl setPreviewImageUrl(String s)
    {
        previewImageUrl = s;
        return this;
    }



    public ()
    {
    }
}
