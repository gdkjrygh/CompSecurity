// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, ShareContent, ShareModel

public static abstract class 
    implements ShareModelBuilder
{

    private Uri contentUrl;
    private List peopleIds;
    private String placeId;
    private String ref;

    public  readFrom(ShareContent sharecontent)
    {
        if (sharecontent == null)
        {
            return this;
        } else
        {
            return setContentUrl(sharecontent.getContentUrl()).setPeopleIds(sharecontent.getPeopleIds()).setPlaceId(sharecontent.getPlaceId()).setRef(sharecontent.getRef());
        }
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((ShareContent)sharemodel);
    }

    public readFrom setContentUrl(Uri uri)
    {
        contentUrl = uri;
        return this;
    }

    public contentUrl setPeopleIds(List list)
    {
        if (list == null)
        {
            list = null;
        } else
        {
            list = Collections.unmodifiableList(list);
        }
        peopleIds = list;
        return this;
    }

    public peopleIds setPlaceId(String s)
    {
        placeId = s;
        return this;
    }

    public placeId setRef(String s)
    {
        ref = s;
        return this;
    }





    public ()
    {
    }
}
