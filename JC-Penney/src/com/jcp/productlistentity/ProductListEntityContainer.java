// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productlistentity;

import android.os.Parcel;
import android.os.Parcelable;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

// Referenced classes of package com.jcp.productlistentity:
//            ProductListContentEntity

public class ProductListEntityContainer
    implements Parcelable, Serializable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private String alternateMessage;
    private Boolean brand;
    private Boolean clearance;
    private ProductListContentEntity content;
    private Integer count;
    private List filters;
    private Boolean header;
    private Boolean hideOnDotcom;
    private Boolean hideOnMobile;
    private Boolean hideOnTablet;
    private String highResolutionImage;
    private String id;
    private String image;
    private Boolean manufacturerAdvertisedPrice;
    private String name;
    private List pages;
    private List products;
    private List redirectUrl;
    private List relatedTerms;
    private List sortOptions;
    private String titleImage;

    public ProductListEntityContainer()
    {
        products = new ArrayList();
        filters = new ArrayList();
        pages = new ArrayList();
        sortOptions = new ArrayList();
        relatedTerms = new ArrayList();
    }

    public ProductListEntityContainer(Parcel parcel)
    {
        products = new ArrayList();
        filters = new ArrayList();
        pages = new ArrayList();
        sortOptions = new ArrayList();
        relatedTerms = new ArrayList();
        id = parcel.readString();
        name = parcel.readString();
        image = parcel.readString();
        highResolutionImage = parcel.readString();
        titleImage = parcel.readString();
        alternateMessage = parcel.readString();
    }

    public int describeContents()
    {
        return 0;
    }

    public String getAlternateMessage()
    {
        return alternateMessage;
    }

    public Boolean getBrand()
    {
        return brand;
    }

    public Boolean getClearance()
    {
        return clearance;
    }

    public ProductListContentEntity getContent()
    {
        return content;
    }

    public Integer getCount()
    {
        return count;
    }

    public List getFilters()
    {
        return filters;
    }

    public Boolean getHeader()
    {
        return header;
    }

    public Boolean getHideOnDotcom()
    {
        return hideOnDotcom;
    }

    public Boolean getHideOnMobile()
    {
        return hideOnMobile;
    }

    public Boolean getHideOnTablet()
    {
        return hideOnTablet;
    }

    public String getHighResolutionImage()
    {
        return highResolutionImage;
    }

    public String getId()
    {
        return id;
    }

    public String getImage()
    {
        return image;
    }

    public Boolean getManufacturerAdvertisedPrice()
    {
        return manufacturerAdvertisedPrice;
    }

    public String getName()
    {
        if (name == null)
        {
            name = "";
        }
        return name;
    }

    public List getPages()
    {
        return pages;
    }

    public List getProducts()
    {
        return products;
    }

    public List getRedirectUrl()
    {
        return redirectUrl;
    }

    public List getRelatedTerms()
    {
        return relatedTerms;
    }

    public List getSortOptions()
    {
        return sortOptions;
    }

    public String getTitleImage()
    {
        return titleImage;
    }

    public void setAlternateMessage(String s)
    {
        alternateMessage = s;
    }

    public void setBrand(Boolean boolean1)
    {
        brand = boolean1;
    }

    public void setClearance(Boolean boolean1)
    {
        clearance = boolean1;
    }

    public void setContent(ProductListContentEntity productlistcontententity)
    {
        content = productlistcontententity;
    }

    public void setCount(Integer integer)
    {
        count = integer;
    }

    public void setFilters(List list)
    {
        filters = list;
    }

    public void setHeader(Boolean boolean1)
    {
        header = boolean1;
    }

    public void setHideOnDotcom(Boolean boolean1)
    {
        hideOnDotcom = boolean1;
    }

    public void setHideOnMobile(Boolean boolean1)
    {
        hideOnMobile = boolean1;
    }

    public void setHideOnTablet(Boolean boolean1)
    {
        hideOnTablet = boolean1;
    }

    public void setHighResolutionImage(String s)
    {
        highResolutionImage = s;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImage(String s)
    {
        image = s;
    }

    public void setManufacturerAdvertisedPrice(Boolean boolean1)
    {
        manufacturerAdvertisedPrice = boolean1;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPages(List list)
    {
        pages = list;
    }

    public void setProducts(List list)
    {
        products = list;
    }

    public void setRedirectUrl(List list)
    {
        redirectUrl = list;
    }

    public void setRelatedTerms(List list)
    {
        relatedTerms = list;
    }

    public void setSortOptions(List list)
    {
        sortOptions = list;
    }

    public void setTitleImage(String s)
    {
        titleImage = s;
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        parcel.writeString(id);
        parcel.writeString(name);
        parcel.writeString(image);
        parcel.writeString(highResolutionImage);
        parcel.writeString(titleImage);
        parcel.writeString(alternateMessage);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public ProductListEntityContainer createFromParcel(Parcel parcel)
        {
            return new ProductListEntityContainer(parcel);
        }

        public volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public ProductListEntityContainer[] newArray(int i)
        {
            return new ProductListEntityContainer[i];
        }

        public volatile Object[] newArray(int i)
        {
            return newArray(i);
        }

        _cls1()
        {
        }
    }

}
