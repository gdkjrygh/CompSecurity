// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.productentity;

import java.io.Serializable;

// Referenced classes of package com.jcp.productentity:
//            Image

public class OptionValueEntity
    implements Serializable
{

    private static final long serialVersionUID = 1L;
    private String availability;
    private boolean available;
    private Image image;
    private String inventoryMsg;
    private boolean selected;
    private String url;
    private String value;

    public OptionValueEntity()
    {
    }

    public String getAvailability()
    {
        return availability;
    }

    public Boolean getAvailable()
    {
        return Boolean.valueOf(available);
    }

    public Image getImage()
    {
        return image;
    }

    public String getInventoryMsg()
    {
        return inventoryMsg;
    }

    public Boolean getSelected()
    {
        return Boolean.valueOf(selected);
    }

    public String getUrl()
    {
        return url;
    }

    public String getValue()
    {
        return value;
    }

    public void setAvailability(String s)
    {
        availability = s;
    }

    public void setAvailable(Boolean boolean1)
    {
        available = boolean1.booleanValue();
    }

    public void setImage(Image image1)
    {
        image = image1;
    }

    public void setInventoryMsg(String s)
    {
        inventoryMsg = s;
    }

    public void setSelected(Boolean boolean1)
    {
        selected = boolean1.booleanValue();
    }

    public void setUrl(String s)
    {
        url = s;
    }

    public void setValue(String s)
    {
        value = s;
    }
}
