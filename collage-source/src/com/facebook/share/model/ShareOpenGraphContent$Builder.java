// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphContent, ShareOpenGraphAction, ShareContent, ShareModelBuilder, 
//            ShareModel

public static final class  extends 
{

    private ShareOpenGraphAction action;
    private String previewPropertyName;

    public ShareOpenGraphContent build()
    {
        return new ShareOpenGraphContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareOpenGraphContent)sharecontent);
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareOpenGraphContent)sharemodel);
    }

    public readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareOpenGraphContent)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphContent.getClassLoader()));
    }

    public readFrom readFrom(ShareOpenGraphContent shareopengraphcontent)
    {
        if (shareopengraphcontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.readFrom(shareopengraphcontent)).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
        }
    }

    public ewPropertyName setAction(ShareOpenGraphAction shareopengraphaction)
    {
        if (shareopengraphaction == null)
        {
            shareopengraphaction = null;
        } else
        {
            shareopengraphaction = (new init>()).eadFrom(shareopengraphaction).uild();
        }
        action = shareopengraphaction;
        return this;
    }

    public action setPreviewPropertyName(String s)
    {
        previewPropertyName = s;
        return this;
    }



    public ()
    {
    }
}
