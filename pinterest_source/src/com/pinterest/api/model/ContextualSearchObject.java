// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

// Referenced classes of package com.pinterest.api.model:
//            Model, Pin

public class ContextualSearchObject extends Model
{

    private Pin pin;
    private String title;

    public ContextualSearchObject()
    {
    }

    public static ContextualSearchObject make(PinterestJsonObject pinterestjsonobject)
    {
        ContextualSearchObject contextualsearchobject = new ContextualSearchObject();
        if (pinterestjsonobject != null)
        {
            contextualsearchobject.setTitle(pinterestjsonobject.a("term", ""));
            pinterestjsonobject = pinterestjsonobject.c("pin");
            if (pinterestjsonobject != null)
            {
                contextualsearchobject.setPin(Pin.make(pinterestjsonobject));
            }
        }
        return contextualsearchobject;
    }

    public static List makeAll(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        int i = 0;
        for (int j = pinterestjsonarray.a(); i < j; i++)
        {
            arraylist.add(make(pinterestjsonarray.d(i)));
        }

        return arraylist;
    }

    public Date getCacheExpirationDate()
    {
        return null;
    }

    public Pin getPin()
    {
        return pin;
    }

    public String getTitle()
    {
        return title;
    }

    public String getUid()
    {
        return null;
    }

    public void setCacheExpirationDate(Date date)
    {
    }

    public void setPin(Pin pin1)
    {
        pin = pin1;
    }

    public void setTitle(String s)
    {
        title = s;
    }
}
