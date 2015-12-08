// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            ShopCollectionItemLayoutParams

public class ShopCollectionItem
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private final String actionText;
    private final String coverImageUrl;
    private final String description;
    private final String domain;
    private final String id;
    private final String labelText;
    private final String layout;
    private ShopCollectionItemLayoutParams layoutParams;
    private final String objectId;
    private final String title;
    private final String type;

    public ShopCollectionItem()
    {
        domain = null;
        layout = null;
        description = null;
        title = null;
        objectId = null;
        actionText = null;
        coverImageUrl = null;
        labelText = null;
        type = null;
        id = null;
        layoutParams = null;
    }

    protected ShopCollectionItem(Parcel parcel)
    {
        domain = parcel.readString();
        layout = parcel.readString();
        description = parcel.readString();
        title = parcel.readString();
        objectId = parcel.readString();
        actionText = parcel.readString();
        coverImageUrl = parcel.readString();
        labelText = parcel.readString();
        type = parcel.readString();
        id = parcel.readString();
        layoutParams = (ShopCollectionItemLayoutParams)parcel.readParcelable(com/pinterest/api/model/ShopCollectionItemLayoutParams.getClassLoader());
    }

    public static ShopCollectionItem make(PinterestJsonObject pinterestjsonobject)
    {
        ShopCollectionItem shopcollectionitem = (ShopCollectionItem)pinterestjsonobject.a(com/pinterest/api/model/ShopCollectionItem);
        pinterestjsonobject = pinterestjsonobject.c("layout_params");
        if (pinterestjsonobject != null)
        {
            shopcollectionitem.layoutParams = (ShopCollectionItemLayoutParams)pinterestjsonobject.a(com/pinterest/api/model/ShopCollectionItemLayoutParams);
        }
        return shopcollectionitem;
    }

    public static List make(PinterestJsonArray pinterestjsonarray)
    {
        int j = pinterestjsonarray.a();
        ArrayList arraylist = new ArrayList(j);
        for (int i = 0; i < j; i++)
        {
            arraylist.add(make(pinterestjsonarray.c(i)));
        }

        return arraylist;
    }

    public int describeContents()
    {
        return 0;
    }

    public String getActionText()
    {
        return actionText;
    }

    public String getCoverImageUrl()
    {
        return coverImageUrl;
    }

    public String getDescription()
    {
        return description;
    }

    public String getDomain()
    {
        return domain;
    }

    public String getId()
    {
        return id;
    }

    public String getLabelText()
    {
        return labelText;
    }

    public String getLayout()
    {
        return layout;
    }

    public ShopCollectionItemLayoutParams getLayoutParams()
    {
        return layoutParams;
    }

    public String getObjectId()
    {
        return objectId;
    }

    public String getTitle()
    {
        return title;
    }

    public String getType()
    {
        return type;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(domain);
        parcel.writeString(layout);
        parcel.writeString(description);
        parcel.writeString(title);
        parcel.writeString(objectId);
        parcel.writeString(actionText);
        parcel.writeString(coverImageUrl);
        parcel.writeString(labelText);
        parcel.writeString(type);
        parcel.writeString(id);
        parcel.writeParcelable(layoutParams, i);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final ShopCollectionItem createFromParcel(Parcel parcel)
        {
            return new ShopCollectionItem(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final ShopCollectionItem[] newArray(int i)
        {
            return new ShopCollectionItem[i];
        }

        public final volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
