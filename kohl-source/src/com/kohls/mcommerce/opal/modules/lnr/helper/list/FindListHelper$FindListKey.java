// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.helper.list;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.helper.list:
//            FindListHelper

public class this._cls0
    implements Comparable, Serializable
{

    private static final long serialVersionUID = 1L;
    private String emailId;
    private String firstName;
    private String lastName;
    final FindListHelper this$0;
    private long userId;

    public int compareTo(this._cls0 _pcls0)
    {
        int j = (new StringBuilder()).append(firstName).append(" ").append(lastName).toString().compareToIgnoreCase((new StringBuilder()).append(_pcls0.firstName).append(" ").append(_pcls0.lastName).toString());
        int i = j;
        if (j == 0)
        {
            i = Long.compare(_pcls0.userId, userId);
        }
        return i;
    }

    public volatile int compareTo(Object obj)
    {
        return compareTo((compareTo)obj);
    }

    public boolean equals(Object obj)
    {
        if (obj != null && (obj instanceof compareTo))
        {
            obj = (compareTo)obj;
            if (userId == ((userId) (obj)).userId || firstName.equals(((firstName) (obj)).getFirstName()) && !lastName.equals(((lastName) (obj)).getLastName()))
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


    public Q()
    {
        this$0 = FindListHelper.this;
        super();
    }
}
