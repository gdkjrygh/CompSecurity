// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareVideoContent, SharePhoto, ShareVideo, ShareContent, 
//            ShareModelBuilder, ShareModel

public final class  extends 
{

    private String contentDescription;
    private String contentTitle;
    private SharePhoto previewPhoto;
    private ShareVideo video;

    public final ShareVideoContent build()
    {
        return new ShareVideoContent(this, null);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareVideoContent)sharecontent);
    }

    public final volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareVideoContent)sharemodel);
    }

    public final readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareVideoContent)parcel.readParcelable(com/facebook/share/model/ShareVideoContent.getClassLoader()));
    }

    public final readFrom readFrom(ShareVideoContent sharevideocontent)
    {
        if (sharevideocontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.rom(sharevideocontent)).setContentDescription(sharevideocontent.getContentDescription()).setContentTitle(sharevideocontent.getContentTitle()).setPreviewPhoto(sharevideocontent.getPreviewPhoto()).setVideo(sharevideocontent.getVideo());
        }
    }

    public final  setContentDescription(String s)
    {
        contentDescription = s;
        return this;
    }

    public final contentDescription setContentTitle(String s)
    {
        contentTitle = s;
        return this;
    }

    public final contentTitle setPreviewPhoto(SharePhoto sharephoto)
    {
        if (sharephoto == null)
        {
            sharephoto = null;
        } else
        {
            sharephoto = (new contentTitle()).m(sharephoto).m();
        }
        previewPhoto = sharephoto;
        return this;
    }

    public final previewPhoto setVideo(ShareVideo sharevideo)
    {
        if (sharevideo == null)
        {
            return this;
        } else
        {
            video = (new video()).m(sharevideo).m();
            return this;
        }
    }





    public ()
    {
    }
}
