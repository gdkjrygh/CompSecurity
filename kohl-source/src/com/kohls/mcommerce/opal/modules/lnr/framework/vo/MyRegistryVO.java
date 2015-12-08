// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.framework.vo;

import com.kohls.mcommerce.opal.framework.vo.IValueObject;
import java.io.Serializable;

public class MyRegistryVO
    implements Serializable, IValueObject
{
    public static class WishList
        implements Serializable
    {

        private static final long serialVersionUID = 3L;
        float budget;
        private long createdTime;
        boolean emailOptIn;
        private String firstName;
        private boolean hasPurchased;
        private boolean isDeleted;
        boolean isPublic;
        private long lastUpdatedTime;
        String listEventDate;
        private long listId;
        private String listName;
        private Long listViewedTime;
        private WishListUser listuser;
        private int numberOfItems;
        private String promoCode;
        private com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO.RProperties registryProperties;
        private int totalPurchaseQty;
        private String type;

        public float getBudget()
        {
            return budget;
        }

        public long getCreatedTime()
        {
            return createdTime;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public long getLastUpdatedTime()
        {
            return lastUpdatedTime;
        }

        public String getListEventDate()
        {
            return listEventDate;
        }

        public long getListId()
        {
            return listId;
        }

        public String getListName()
        {
            return listName;
        }

        public Long getListViewedTime()
        {
            return listViewedTime;
        }

        public WishListUser getListuser()
        {
            return listuser;
        }

        public int getNumberOfItems()
        {
            return numberOfItems;
        }

        public String getPromoCode()
        {
            return promoCode;
        }

        public com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO.RProperties getRegistryProperties()
        {
            return registryProperties;
        }

        public int getTotalPurchaseQty()
        {
            return totalPurchaseQty;
        }

        public String getType()
        {
            return type;
        }

        public boolean isDeleted()
        {
            return isDeleted;
        }

        public boolean isEmailOptIn()
        {
            return emailOptIn;
        }

        public boolean isHasPurchased()
        {
            return hasPurchased;
        }

        public boolean isPublic()
        {
            return isPublic;
        }

        public void setBudget(float f)
        {
            budget = f;
        }

        public void setCreatedTime(long l)
        {
            createdTime = l;
        }

        public void setDeleted(boolean flag)
        {
            isDeleted = flag;
        }

        public void setEmailOptIn(boolean flag)
        {
            emailOptIn = flag;
        }

        public void setFirstName(String s)
        {
            firstName = s;
        }

        public void setHasPurchased(boolean flag)
        {
            hasPurchased = flag;
        }

        public void setLastUpdatedTime(long l)
        {
            lastUpdatedTime = l;
        }

        public void setListEventDate(String s)
        {
            listEventDate = s;
        }

        public void setListId(long l)
        {
            listId = l;
        }

        public void setListName(String s)
        {
            listName = s;
        }

        public void setListViewedTime(Long long1)
        {
            listViewedTime = long1;
        }

        public void setListuser(WishListUser wishlistuser)
        {
            listuser = wishlistuser;
        }

        public void setNumberOfItems(int i)
        {
            numberOfItems = i;
        }

        public void setPromoCode(String s)
        {
            promoCode = s;
        }

        public void setPublic(boolean flag)
        {
            isPublic = flag;
        }

        public void setRegistryProperties(com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPO.RProperties rproperties)
        {
            registryProperties = rproperties;
        }

        public void setTotalPurchaseQty(int i)
        {
            totalPurchaseQty = i;
        }

        public void setType(String s)
        {
            type = s;
        }

        public WishList()
        {
        }
    }


    private static final long serialVersionUID = 1L;
    private int responseCode;
    private String responseMessage;
    private WishList wishList;

    public MyRegistryVO()
    {
    }

    public int getResponseCode()
    {
        return responseCode;
    }

    public String getResponseMessage()
    {
        return responseMessage;
    }

    public WishList getWishList()
    {
        return wishList;
    }

    public void setResponseCode(int i)
    {
        responseCode = i;
    }

    public void setResponseMessage(String s)
    {
        responseMessage = s;
    }

    public void setWishList(WishList wishlist)
    {
        wishList = wishlist;
    }

    // Unreferenced inner class com/kohls/mcommerce/opal/modules/lnr/framework/vo/MyRegistryVO$WishListUser
    /* block-local class not found */
    class WishListUser {}

}
