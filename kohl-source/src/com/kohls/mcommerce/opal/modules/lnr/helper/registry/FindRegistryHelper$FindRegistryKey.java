// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kohls.mcommerce.opal.modules.lnr.helper.registry;

import java.io.Serializable;

// Referenced classes of package com.kohls.mcommerce.opal.modules.lnr.helper.registry:
//            FindRegistryHelper

public class this._cls0
    implements Comparable, Serializable
{

    private static final long serialVersionUID = 1L;
    private String ownersFirstName;
    private String ownersLastName;
    private String retailerUserId;
    final FindRegistryHelper this$0;

    public int compareTo(this._cls0 _pcls0)
    {
        return (new StringBuilder()).append(ownersFirstName).append(" ").append(ownersLastName).toString().compareToIgnoreCase((new StringBuilder()).append(_pcls0.ownersFirstName).append(" ").append(_pcls0.ownersLastName).toString());
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
            if (ownersFirstName != null && ownersFirstName.equalsIgnoreCase(((ownersFirstName) (obj)).getOwnersFirstName()) && ownersLastName != null && ownersLastName.equalsIgnoreCase(((ownersLastName) (obj)).getOwnersLastName()))
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

    public ()
    {
        this$0 = FindRegistryHelper.this;
        super();
    }
}
