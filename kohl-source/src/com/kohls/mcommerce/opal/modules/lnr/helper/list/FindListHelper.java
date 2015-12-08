// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.helper.list;

import com.kohls.mcommerce.opal.modules.lnr.common.po.ListPO;
import com.kohls.mcommerce.opal.modules.lnr.framework.vo.MyListVO;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class FindListHelper
    implements Serializable
{
    public class FindListKey
        implements Comparable, Serializable
    {

        private static final long serialVersionUID = 1L;
        private String emailId;
        private String firstName;
        private String lastName;
        final FindListHelper this$0;
        private long userId;

        public int compareTo(FindListKey findlistkey)
        {
            int j = (new StringBuilder()).append(firstName).append(" ").append(lastName).toString().compareToIgnoreCase((new StringBuilder()).append(findlistkey.firstName).append(" ").append(findlistkey.lastName).toString());
            int i = j;
            if (j == 0)
            {
                i = Long.compare(findlistkey.userId, userId);
            }
            return i;
        }

        public volatile int compareTo(Object obj)
        {
            return compareTo((FindListKey)obj);
        }

        public boolean equals(Object obj)
        {
            if (obj != null && (obj instanceof FindListKey))
            {
                obj = (FindListKey)obj;
                if (userId == ((FindListKey) (obj)).userId || firstName.equals(((FindListKey) (obj)).getFirstName()) && !lastName.equals(((FindListKey) (obj)).getLastName()))
                {
                    return true;
                }
            }
            return false;
        }

        public String getEmailId()
        {
            return emailId;
        }

        public String getFirstName()
        {
            return firstName;
        }

        public String getLastName()
        {
            return lastName;
        }

        public long getUserId()
        {
            return userId;
        }

        public int hashCode()
        {
            return (int)(userId + (long)firstName.hashCode() + (long)lastName.hashCode());
        }

        public void setEmailId(String s)
        {
            emailId = s;
        }

        public void setFirstName(String s)
        {
            firstName = s;
        }

        public void setLastName(String s)
        {
            lastName = s;
        }

        public void setUserId(long l)
        {
            userId = l;
        }


        public FindListKey()
        {
            this$0 = FindListHelper.this;
            super();
        }
    }


    private static final long serialVersionUID = 1L;

    public FindListHelper()
    {
    }

    public Map getUserGroupForList(MyListVO mylistvo)
    {
        HashMap hashmap = new HashMap();
        mylistvo = mylistvo.getLists().iterator();
        do
        {
            if (!mylistvo.hasNext())
            {
                break;
            }
            ListPO listpo = (ListPO)mylistvo.next();
            if (!listpo.isDeleted())
            {
                FindListKey findlistkey = new FindListKey();
                findlistkey.setEmailId(listpo.getListuser().getRetailerEmail());
                findlistkey.setFirstName(listpo.getListuser().getFirstName());
                findlistkey.setLastName(listpo.getListuser().getLastName());
                findlistkey.setUserId(listpo.getListuser().getUserId());
                ArrayList arraylist = (ArrayList)hashmap.get(findlistkey);
                if (arraylist == null)
                {
                    arraylist = new ArrayList();
                    arraylist.add(listpo);
                    hashmap.put(findlistkey, arraylist);
                } else
                {
                    arraylist.add(listpo);
                }
            }
        } while (true);
        mylistvo = new TreeMap(new _cls1());
        mylistvo.putAll(hashmap);
        return mylistvo;
    }

    /* member class not found */
    class _cls1 {}

}
