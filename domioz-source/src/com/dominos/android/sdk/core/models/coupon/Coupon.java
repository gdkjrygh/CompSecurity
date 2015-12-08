// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.dominos.android.sdk.core.models.coupon;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.List;
import org.a.a.a.a.f;
import org.a.a.a.a.g;

// Referenced classes of package com.dominos.android.sdk.core.models.coupon:
//            GroupCodes, CouponTags, Usage

public class Coupon
    implements Parcelable
{

    public static final android.os.Parcelable.Creator CREATOR = new _cls1();
    private boolean bundled;
    private String businessDate;
    private String code;
    private String description;
    private boolean doneEditing;
    private GroupCodes groupCodes;
    private String imageCode;
    private String languageCode;
    private boolean local;
    private String masterSortSeq;
    private String name;
    private String price;
    private List productGroups;
    private String pulseCode;
    private String pulseSortSeq;
    private String sizeLargeImageURL;
    private String sizeThumbNailImageURL;
    private int status;
    private String storeAsOfTime;
    private String storeID;
    private CouponTags tags;
    private Usage usage;

    public Coupon()
    {
    }

    protected Coupon(Parcel parcel)
    {
        boolean flag1 = true;
        super();
        boolean flag;
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        bundled = flag;
        businessDate = parcel.readString();
        code = parcel.readString();
        description = parcel.readString();
        groupCodes = (GroupCodes)parcel.readParcelable(com/dominos/android/sdk/core/models/coupon/GroupCodes.getClassLoader());
        imageCode = parcel.readString();
        languageCode = parcel.readString();
        if (parcel.readByte() != 0)
        {
            flag = true;
        } else
        {
            flag = false;
        }
        local = flag;
        masterSortSeq = parcel.readString();
        name = parcel.readString();
        price = parcel.readString();
        productGroups = new ArrayList();
        parcel.readList(productGroups, java/util/List.getClassLoader());
        pulseCode = parcel.readString();
        pulseSortSeq = parcel.readString();
        sizeLargeImageURL = parcel.readString();
        sizeThumbNailImageURL = parcel.readString();
        status = parcel.readInt();
        storeAsOfTime = parcel.readString();
        storeID = parcel.readString();
        tags = (CouponTags)parcel.readParcelable(com/dominos/android/sdk/core/models/coupon/CouponTags.getClassLoader());
        usage = (Usage)parcel.readParcelable(com/dominos/android/sdk/core/models/coupon/Usage.getClassLoader());
        if (parcel.readByte() != 0)
        {
            flag = flag1;
        } else
        {
            flag = false;
        }
        doneEditing = flag;
    }

    public Coupon(Coupon coupon)
    {
        code = coupon.code;
        imageCode = coupon.imageCode;
        description = coupon.description;
        name = coupon.name;
        price = coupon.price;
        groupCodes = coupon.groupCodes;
        imageCode = coupon.imageCode;
        languageCode = coupon.languageCode;
        local = coupon.local;
        masterSortSeq = coupon.masterSortSeq;
        productGroups = coupon.productGroups;
        pulseCode = coupon.pulseCode;
        pulseSortSeq = coupon.pulseSortSeq;
        sizeLargeImageURL = coupon.sizeLargeImageURL;
        sizeThumbNailImageURL = coupon.sizeThumbNailImageURL;
        status = coupon.status;
        storeAsOfTime = coupon.storeAsOfTime;
        storeID = coupon.storeID;
        tags = coupon.tags;
        usage = coupon.usage;
        bundled = coupon.bundled;
    }

    public int describeContents()
    {
        return 0;
    }

    public boolean equals(Object obj)
    {
        if (this != obj)
        {
            if (obj == null || getClass() != obj.getClass())
            {
                return false;
            }
            obj = (Coupon)obj;
            if (code == null ? ((Coupon) (obj)).code != null : !code.equals(((Coupon) (obj)).code))
            {
                return false;
            }
            if (description == null ? ((Coupon) (obj)).description != null : !description.equals(((Coupon) (obj)).description))
            {
                return false;
            }
            if (name == null ? ((Coupon) (obj)).name != null : !name.equals(((Coupon) (obj)).name))
            {
                return false;
            }
            if (price == null ? ((Coupon) (obj)).price != null : !price.equals(((Coupon) (obj)).price))
            {
                return false;
            }
            if (imageCode == null ? ((Coupon) (obj)).imageCode != null : !imageCode.equals(((Coupon) (obj)).imageCode))
            {
                return false;
            }
            if (languageCode == null ? ((Coupon) (obj)).languageCode != null : !languageCode.equals(((Coupon) (obj)).languageCode))
            {
                return false;
            }
            if (local != ((Coupon) (obj)).local)
            {
                return false;
            }
            if (masterSortSeq == null ? ((Coupon) (obj)).masterSortSeq != null : !masterSortSeq.equals(((Coupon) (obj)).masterSortSeq))
            {
                return false;
            }
            if (productGroups == null ? ((Coupon) (obj)).productGroups != null : !productGroups.equals(((Coupon) (obj)).productGroups))
            {
                return false;
            }
            if (pulseCode == null ? ((Coupon) (obj)).pulseCode != null : !pulseCode.equals(((Coupon) (obj)).pulseCode))
            {
                return false;
            }
            if (pulseSortSeq == null ? ((Coupon) (obj)).pulseSortSeq != null : !pulseSortSeq.equals(((Coupon) (obj)).pulseSortSeq))
            {
                return false;
            }
            if (status != ((Coupon) (obj)).status)
            {
                return false;
            }
            if (storeID == null ? ((Coupon) (obj)).storeID != null : !storeID.equals(((Coupon) (obj)).storeID))
            {
                return false;
            }
            if (bundled != ((Coupon) (obj)).bundled)
            {
                return false;
            }
        }
        return true;
    }

    public String getBusinessDate()
    {
        return businessDate;
    }

    public String getCode()
    {
        return code;
    }

    public String getDescription()
    {
        return description;
    }

    public GroupCodes getGroupCodes()
    {
        return groupCodes;
    }

    public String getImageCode()
    {
        return imageCode;
    }

    public String getLanguageCode()
    {
        return languageCode;
    }

    public String getMasterSortSeq()
    {
        return masterSortSeq;
    }

    public String getName()
    {
        return name;
    }

    public String getPrice()
    {
        return price;
    }

    public List getProductGroups()
    {
        return productGroups;
    }

    public String getPulseCode()
    {
        return pulseCode;
    }

    public String getPulseSortSeq()
    {
        return pulseSortSeq;
    }

    public String getSizeLargeImageURL()
    {
        return sizeLargeImageURL;
    }

    public String getSizeThumbNailImageURL()
    {
        return sizeThumbNailImageURL;
    }

    public int getStatus()
    {
        return status;
    }

    public String getStoreAsOfTime()
    {
        return storeAsOfTime;
    }

    public String getStoreID()
    {
        return storeID;
    }

    public CouponTags getTags()
    {
        return tags;
    }

    public Usage getUsage()
    {
        return usage;
    }

    public boolean isBundled()
    {
        return bundled;
    }

    public boolean isDoneEditing()
    {
        return bundled || doneEditing;
    }

    public boolean isLocal()
    {
        return local;
    }

    public void setBundled(boolean flag)
    {
        bundled = flag;
    }

    public void setBusinessDate(String s)
    {
        businessDate = s;
    }

    public void setCode(String s)
    {
        code = s;
    }

    public void setDescription(String s)
    {
        description = s;
    }

    public void setDoneEditing(boolean flag)
    {
        doneEditing = flag;
    }

    public void setGroupCodes(GroupCodes groupcodes)
    {
        groupCodes = groupcodes;
    }

    public void setImageCode(String s)
    {
        imageCode = s;
    }

    public void setLanguageCode(String s)
    {
        languageCode = s;
    }

    public void setLocal(boolean flag)
    {
        local = flag;
    }

    public void setMasterSortSeq(String s)
    {
        masterSortSeq = s;
    }

    public void setName(String s)
    {
        name = s;
    }

    public void setPrice(String s)
    {
        price = s;
    }

    public void setProductGroups(List list)
    {
        productGroups = list;
    }

    public void setPulseCode(String s)
    {
        pulseCode = s;
    }

    public void setPulseSortSeq(String s)
    {
        pulseSortSeq = s;
    }

    public void setSizeLargeImageURL(String s)
    {
        sizeLargeImageURL = s;
    }

    public void setSizeThumbNailImageURL(String s)
    {
        sizeThumbNailImageURL = s;
    }

    public void setStatus(int i)
    {
        status = i;
    }

    public void setStoreAsOfTime(String s)
    {
        storeAsOfTime = s;
    }

    public void setStoreID(String s)
    {
        storeID = s;
    }

    public void setTags(CouponTags coupontags)
    {
        tags = coupontags;
    }

    public void setUsage(Usage usage1)
    {
        usage = usage1;
    }

    public String toString()
    {
        return f.b(this, g.d);
    }

    public void writeToParcel(Parcel parcel, int i)
    {
        boolean flag = true;
        byte byte0;
        if (bundled)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(businessDate);
        parcel.writeString(code);
        parcel.writeString(description);
        parcel.writeParcelable(groupCodes, i);
        parcel.writeString(imageCode);
        parcel.writeString(languageCode);
        if (local)
        {
            byte0 = 1;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
        parcel.writeString(masterSortSeq);
        parcel.writeString(name);
        parcel.writeString(price);
        parcel.writeList(productGroups);
        parcel.writeString(pulseCode);
        parcel.writeString(pulseSortSeq);
        parcel.writeString(sizeLargeImageURL);
        parcel.writeString(sizeThumbNailImageURL);
        parcel.writeInt(status);
        parcel.writeString(storeAsOfTime);
        parcel.writeString(storeID);
        parcel.writeParcelable(tags, i);
        parcel.writeParcelable(usage, i);
        if (doneEditing)
        {
            byte0 = flag;
        } else
        {
            byte0 = 0;
        }
        parcel.writeByte(byte0);
    }


    private class _cls1
        implements android.os.Parcelable.Creator
    {

        public final Coupon createFromParcel(Parcel parcel)
        {
            return new Coupon(parcel);
        }

        public final volatile Object createFromParcel(Parcel parcel)
        {
            return createFromParcel(parcel);
        }

        public final Coupon[] newArray(int i)
        {
            return new Coupon[i];
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
