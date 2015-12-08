// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareOpenGraphAction, ShareModelBuilder, ShareModel, ShareOpenGraphValueContainer

public final class Builder extends Builder
{

    private static final String ACTION_TYPE_KEY = "og:type";

    public ShareOpenGraphAction build()
    {
        return new ShareOpenGraphAction(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareOpenGraphAction)sharemodel);
    }

    public readFrom readFrom(Parcel parcel)
    {
        return readFrom((ShareOpenGraphAction)parcel.readParcelable(com/facebook/share/model/ShareOpenGraphAction.getClassLoader()));
    }

    public readFrom readFrom(ShareOpenGraphAction shareopengraphaction)
    {
        if (shareopengraphaction == null)
        {
            return this;
        } else
        {
            return ((readFrom)super.readFrom(shareopengraphaction)).setActionType(shareopengraphaction.getActionType());
        }
    }

    public volatile Builder readFrom(ShareOpenGraphValueContainer shareopengraphvaluecontainer)
    {
        return readFrom((ShareOpenGraphAction)shareopengraphvaluecontainer);
    }

    public readFrom setActionType(String s)
    {
        putString("og:type", s);
        return this;
    }

    public Builder()
    {
    }
}
