// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareContent;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

// Referenced classes of package com.facebook.share.internal:
//            ShareFeedContent

public static final class  extends com.facebook.share.model.er
{

    private String link;
    private String linkCaption;
    private String linkDescription;
    private String linkName;
    private String mediaSource;
    private String picture;
    private String toId;

    public ShareFeedContent build()
    {
        return new ShareFeedContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public build readFrom(Parcel parcel)
    {
        return readFrom((ShareFeedContent)parcel.readParcelable(com/facebook/share/internal/ShareFeedContent.getClassLoader()));
    }

    public readFrom readFrom(ShareFeedContent sharefeedcontent)
    {
        if (sharefeedcontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.From(sharefeedcontent)).setToId(sharefeedcontent.getToId()).setLink(sharefeedcontent.getLink()).setLinkName(sharefeedcontent.getLinkName()).setLinkCaption(sharefeedcontent.getLinkCaption()).setLinkDescription(sharefeedcontent.getLinkDescription()).setPicture(sharefeedcontent.getPicture()).setMediaSource(sharefeedcontent.getMediaSource());
        }
    }

    public volatile com.facebook.share.model.er readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareFeedContent)sharecontent);
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareFeedContent)sharemodel);
    }

    public readFrom setLink(String s)
    {
        link = s;
        return this;
    }

    public link setLinkCaption(String s)
    {
        linkCaption = s;
        return this;
    }

    public linkCaption setLinkDescription(String s)
    {
        linkDescription = s;
        return this;
    }

    public linkDescription setLinkName(String s)
    {
        linkName = s;
        return this;
    }

    public linkName setMediaSource(String s)
    {
        mediaSource = s;
        return this;
    }

    public mediaSource setPicture(String s)
    {
        picture = s;
        return this;
    }

    public picture setToId(String s)
    {
        toId = s;
        return this;
    }








    public ()
    {
    }
}
