// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModelBuilder, AppGroupCreationContent, ShareModel

public static class Privacy
    implements ShareModelBuilder
{

    private String description;
    private String name;
    private Privacy privacy;

    public AppGroupCreationContent build()
    {
        return new AppGroupCreationContent(this, null);
    }

    public volatile Object build()
    {
        return build();
    }

    public build readFrom(Parcel parcel)
    {
        return readFrom((AppGroupCreationContent)parcel.readParcelable(com/facebook/share/model/AppGroupCreationContent.getClassLoader()));
    }

    public readFrom readFrom(AppGroupCreationContent appgroupcreationcontent)
    {
        if (appgroupcreationcontent == null)
        {
            return this;
        } else
        {
            return setName(appgroupcreationcontent.getName()).setDescription(appgroupcreationcontent.getDescription()).setAppGroupPrivacy(appgroupcreationcontent.getAppGroupPrivacy());
        }
    }

    public volatile ShareModelBuilder readFrom(Parcel parcel)
    {
        return readFrom(parcel);
    }

    public volatile ShareModelBuilder readFrom(ShareModel sharemodel)
    {
        return readFrom((AppGroupCreationContent)sharemodel);
    }

    public Privacy setAppGroupPrivacy(Privacy privacy1)
    {
        privacy = privacy1;
        return this;
    }

    public privacy setDescription(String s)
    {
        description = s;
        return this;
    }

    public description setName(String s)
    {
        name = s;
        return this;
    }




    public Privacy()
    {
    }
}
