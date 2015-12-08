// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.recipe;

import com.pinterest.api.model.ModelHelper;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.List;

public class Ingredient
{

    private String _amount;
    private String _id;
    private String _name;
    private String _type;

    public Ingredient()
    {
        this(null);
    }

    public Ingredient(PinterestJsonObject pinterestjsonobject)
    {
        if (pinterestjsonobject == null)
        {
            return;
        }
        _amount = pinterestjsonobject.a("amt", "");
        if (!ModelHelper.isValid(_amount))
        {
            _amount = "";
        }
        _id = pinterestjsonobject.a("id", "");
        _name = pinterestjsonobject.a("name", "");
        _type = pinterestjsonobject.a("type", "");
    }

    public static List getIngredients(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray != null)
        {
            int i = 0;
            int j = pinterestjsonarray.a();
            while (i < j) 
            {
                arraylist.add(new Ingredient(pinterestjsonarray.d(i)));
                i++;
            }
        }
        return arraylist;
    }

    public String getAmount()
    {
        return _amount;
    }

    public String getId()
    {
        return _id;
    }

    public String getName()
    {
        return _name;
    }

    public String getType()
    {
        return _type;
    }

    public void setAmount(String s)
    {
        _amount = s;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setType(String s)
    {
        _type = s;
    }
}
