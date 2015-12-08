// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import android.os.Parcel;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Feed, Category, ModelHelper, Model

public class CategoryFeed extends Feed
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    public static final String NAME = "CategoryFeed";
    public int sectionIndex;

    public CategoryFeed(Parcel parcel)
    {
        super(null, null);
        sectionIndex = -1;
        readFromParcel(parcel);
    }

    public CategoryFeed(PinterestJsonObject pinterestjsonobject)
    {
        super(pinterestjsonobject, null);
        sectionIndex = -1;
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(Category.makeAll((PinterestJsonArray)getData(), true, true, true));
            setData(null);
            return;
        }
    }

    public CategoryFeed(PinterestJsonObject pinterestjsonobject, boolean flag, boolean flag1)
    {
        super(pinterestjsonobject, null);
        sectionIndex = -1;
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            setItems(Category.makeAll((PinterestJsonArray)getData(), flag1, flag, true));
            setData(null);
            return;
        }
    }

    protected String getItemId(Category category)
    {
        return category.getKey();
    }

    protected volatile String getItemId(Model model)
    {
        return getItemId((Category)model);
    }

    protected List getPersistedItems()
    {
        return ModelHelper.getBrowsableCategories(_ids);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final CategoryFeed createFromParcel(Parcel parcel)
        {
            return new CategoryFeed(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final CategoryFeed[] newArray(int i)
        {
            return new CategoryFeed[i];
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
