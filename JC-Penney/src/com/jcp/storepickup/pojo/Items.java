// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.storepickup.pojo;


// Referenced classes of package com.jcp.storepickup.pojo:
//            Inventory

public class Items
{

    private String id;
    private String imageUrl;
    private Inventory inventory;

    public Items()
    {
    }

    public String getId()
    {
        return id;
    }

    public String getImageUrl()
    {
        return imageUrl;
    }

    public Inventory getInventory()
    {
        return inventory;
    }

    public void setId(String s)
    {
        id = s;
    }

    public void setImageUrl(String s)
    {
        imageUrl = s;
    }

    public void setInventory(Inventory inventory1)
    {
        inventory = inventory1;
    }

    public String toString()
    {
        return (new StringBuilder()).append("ClassPojo [id = ").append(id).append(", inventory = ").append(inventory).append("]").toString();
    }
}
