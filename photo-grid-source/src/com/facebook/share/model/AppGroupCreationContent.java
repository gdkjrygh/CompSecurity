// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.os.Parcel;

// Referenced classes of package com.facebook.share.model:
//            ShareModel

public final class AppGroupCreationContent
    implements ShareModel
{

    private final String description;
    private final String name;
    private AppGroupPrivacy privacy;

    AppGroupCreationContent(Parcel parcel)
    {
        name = parcel.readString();
        description = parcel.readString();
        privacy = AppGroupPrivacy.valueOf(parcel.readString());
    }

    private AppGroupCreationContent(Builder builder)
    {
        name = builder.name;
        description = builder.description;
        privacy = builder.privacy;
    }

    AppGroupCreationContent(Builder builder, _cls1 _pcls1)
    {
        this(builder);
    }

    public final int describeContents()
    {
        return 0;
    }

    public final AppGroupPrivacy getAppGroupPrivacy()
    {
        return privacy;
    }

    public final String getDescription()
    {
        return description;
    }

    public final String getName()
    {
        return name;
    }

    public final void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(name);
        parcel.writeString(description);
        parcel.writeString(privacy.toString());
    }

    private class AppGroupPrivacy extends Enum
    {

        private static final AppGroupPrivacy $VALUES[];
        public static final AppGroupPrivacy Closed;
        public static final AppGroupPrivacy Open;

        public static AppGroupPrivacy valueOf(String s)
        {
            return (AppGroupPrivacy)Enum.valueOf(com/facebook/share/model/AppGroupCreationContent$AppGroupPrivacy, s);
        }

        public static AppGroupPrivacy[] values()
        {
            return (AppGroupPrivacy[])$VALUES.clone();
        }

        static 
        {
            Open = new AppGroupPrivacy("Open", 0);
            Closed = new AppGroupPrivacy("Closed", 1);
            $VALUES = (new AppGroupPrivacy[] {
                Open, Closed
            });
        }

        private AppGroupPrivacy(String s, int i)
        {
            super(s, i);
        }
    }


    private class Builder
        implements ShareModelBuilder
    {

        private String description;
        private String name;
        private AppGroupPrivacy privacy;

        public AppGroupCreationContent build()
        {
            return new AppGroupCreationContent(this, null);
        }

        public volatile Object build()
        {
            return build();
        }

        public Builder readFrom(Parcel parcel)
        {
            return readFrom((AppGroupCreationContent)parcel.readParcelable(com/facebook/share/model/AppGroupCreationContent.getClassLoader()));
        }

        public Builder readFrom(AppGroupCreationContent appgroupcreationcontent)
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

        public Builder setAppGroupPrivacy(AppGroupPrivacy appgroupprivacy)
        {
            privacy = appgroupprivacy;
            return this;
        }

        public Builder setDescription(String s)
        {
            description = s;
            return this;
        }

        public Builder setName(String s)
        {
            name = s;
            return this;
        }




        public Builder()
        {
        }
    }

}
