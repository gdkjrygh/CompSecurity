// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.internal;

import android.os.Parcel;
import com.facebook.share.model.ShareModel;
import com.facebook.share.model.ShareModelBuilder;

// Referenced classes of package com.facebook.share.internal:
//            LikeContent

public class 
    implements ShareModelBuilder
{

    private String objectId;
    private String objectType;

    public LikeContent build()
    {
        return new LikeContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public build readFrom(Parcel parcel)
    {
        return readFrom((LikeContent)parcel.readParcelable(com/facebook/share/internal/LikeContent.getClassLoader()));
    }

    public readFrom readFrom(LikeContent likecontent)
    {
        if (likecontent == null)
        {
            return this;
        } else
        {
            return setObjectId(likecontent.getObjectId()).setObjectType(likecontent.getObjectType());
        }
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((LikeContent)sharemodel);
    }

    public readFrom setObjectId(String s)
    {
        objectId = s;
        return this;
    }

    public objectId setObjectType(String s)
    {
        objectType = s;
        return this;
    }



    public ()
    {
    }
}
