// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.helper.registry;

import com.kohls.mcommerce.opal.common.util.Logger;
import com.kohls.mcommerce.opal.modules.lnr.common.po.RegistryPropertiesPO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.ManageRegistryVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FindRegistryHelper
    implements Serializable
{
    public class FindRegistryKey
        implements Comparable, Serializable
    {

        private static final long serialVersionUID = 1L;
        private String ownersFirstName;
        private String ownersLastName;
        private String retailerUserId;
        final FindRegistryHelper this$0;

        public int compareTo(FindRegistryKey findregistrykey)
        {
            return (new StringBuilder()).append(ownersFirstName).append(" ").append(ownersLastName).toString().compareToIgnoreCase((new StringBuilder()).append(findregistrykey.ownersFirstName).append(" ").append(findregistrykey.ownersLastName).toString());
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((FindRegistryKey)obj);
        }

        public boolean equals(Object obj)
        {
            if (obj != null && (obj instanceof FindRegistryKey))
            {
                obj = (FindRegistryKey)obj;
                if (ownersFirstName != null && ownersFirstName.equalsIgnoreCase(((FindRegistryKey) (obj)).getOwnersFirstName()) && ownersLastName != null && ownersLastName.equalsIgnoreCase(((FindRegistryKey) (obj)).getOwnersLastName()))
                {
                    return true;
                }
            }
            return false;
        }

        public String getOwnersFirstName()
        {
            return ownersFirstName;
        }

        public String getOwnersLastName()
        {
            return ownersLastName;
        }

        public String getRetailerUserId()
        {
            return retailerUserId;
        }

        public int hashCode()
        {
            int i = 0;
            if (ownersFirstName != null)
            {
                i = ownersFirstName.toLowerCase().hashCode();
            }
            int j = i;
            if (ownersLastName != null)
            {
                j = i + ownersLastName.toLowerCase().hashCode();
            }
            return j;
        }

        public void setOwnersFirstName(String s)
        {
            ownersFirstName = s;
        }

        public void setOwnersLastName(String s)
        {
            ownersLastName = s;
        }

        public void setRetailerUserId(String s)
        {
            retailerUserId = s;
        }

        public FindRegistryKey()
        {
            this$0 = FindRegistryHelper.this;
            super();
        }
    }


    private static final long serialVersionUID = 1L;

    public FindRegistryHelper()
    {
    }

    public Map getUserGroupForRegistry(ManageRegistryVO manageregistryvo)
    {
        HashMap hashmap = new HashMap();
        int i = manageregistryvo.getLists().size();
        Logger.debug("", (new StringBuilder()).append("Total Registry Count: ").append(i).toString());
        manageregistryvo = manageregistryvo.getLists().iterator();
        do
        {
            if (!manageregistryvo.hasNext())
            {
                break;
            }
            com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList wishlist = (com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyRegistryVO.WishList)manageregistryvo.next();
            if (!wishlist.isDeleted())
            {
                FindRegistryKey findregistrykey = new FindRegistryKey();
                findregistrykey.setOwnersFirstName(wishlist.getRegistryProperties().getProperties().getOwnerFirstName());
                findregistrykey.setOwnersLastName(wishlist.getRegistryProperties().getProperties().getOwnerLastName());
                findregistrykey.setRetailerUserId(wishlist.getListuser().getRetailerUserId());
                ArrayList arraylist = (ArrayList)hashmap.get(findregistrykey);
                if (arraylist == null)
                {
                    arraylist = new ArrayList();
                    arraylist.add(wishlist);
                    hashmap.put(findregistrykey, arraylist);
                } else
                {
                    arraylist.add(wishlist);
                }
            }
        } while (true);
        manageregistryvo = new TreeMap(new _cls1());
        manageregistryvo.putAll(hashmap);
        return manageregistryvo;
    }

    /* member class not found */
    class _cls1 {}

}
