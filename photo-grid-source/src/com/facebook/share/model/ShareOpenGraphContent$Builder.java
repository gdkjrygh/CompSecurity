// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphContent, ShareOpenGraphAction, ShareContent, ShareModelBuilder, 
//            ShareModel

public final class  extends 
{

    private ShareOpenGraphAction action;
    private String previewPropertyName;

    public final ShareOpenGraphContent build()
    {
        return new ShareOpenGraphContent(this, null);
    }

    public final volatile Object build()
    {
        return build();
    }

    public final volatile build readFrom(ShareContent sharecontent)
    {
        return readFrom((ShareOpenGraphContent)sharecontent);
    }

    public final volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public final volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareOpenGraphContent)sharemodel);
    }

    public final readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareOpenGraphContent)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphContent.getClassLoader()));
    }

    public final readFrom readFrom(ShareOpenGraphContent shareopengraphcontent)
    {
        if (shareopengraphcontent == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.readFrom(shareopengraphcontent)).setAction(shareopengraphcontent.getAction()).setPreviewPropertyName(shareopengraphcontent.getPreviewPropertyName());
        }
    }

    public final ewPropertyName setAction(ShareOpenGraphAction shareopengraphaction)
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

    public final action setPreviewPropertyName(String s)
    {
        previewPropertyName = s;
        return this;
    }



    public ()
    {
    }
}
