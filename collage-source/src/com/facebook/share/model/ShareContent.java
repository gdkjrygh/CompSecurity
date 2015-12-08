// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.share.model;

import android.net.Uri;
import android.os.Parcel;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.share.model:
//            ShareModel, ShareModelBuilder

public abstract class ShareContent
    implements ShareModel
{
    public static abstract class Builder
        implements ShareModelBuilder
    {

        private Uri contentUrl;
        private List peopleIds;
        private String placeId;
        private String ref;

        public Builder readFrom(ShareContent sharecontent)
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

        public Builder setContentUrl(Uri uri)
        {
            contentUrl = uri;
            return this;
        }

        public Builder setPeopleIds(List list)
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

        public Builder setPlaceId(String s)
        {
            placeId = s;
            return this;
        }

        public Builder setRef(String s)
        {
            ref = s;
            return this;
        }





        public Builder()
        {
        }
    }


    private final Uri contentUrl;
    private final List peopleIds;
    private final String placeId;
    private final String ref;

    protected ShareContent(Parcel parcel)
    {
        contentUrl = (Uri)parcel.readParcelable(android/net/Uri.getClassLoader());
        peopleIds = readUnmodifiableStringList(parcel);
        placeId = parcel.readString();
        ref = parcel.readString();
    }

    protected ShareContent(Builder builder)
    {
        contentUrl = builder.contentUrl;
        peopleIds = builder.peopleIds;
        placeId = builder.placeId;
        ref = builder.ref;
    }

    private List readUnmodifiableStringList(Parcel parcel)
    {
        ArrayList arraylist = new ArrayList();
        parcel.readStringList(arraylist);
        if (arraylist.size() == 0)
        {
            return null;
        } else
        {
            return Collections.unmodifiableList(arraylist);
        }
    }

    public int describeContents()
    {
        return 0;
    }

    public Uri getContentUrl()
    {
        return contentUrl;
    }

    public List getPeopleIds()
    {
        return peopleIds;
    }

    public String getPlaceId()
    {
        return placeId;
    }

    public String getRef()
    {
        return ref;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeParcelable(contentUrl, 0);
        parcel.writeStringList(peopleIds);
        parcel.writeString(placeId);
        parcel.writeString(ref);
    }
}
