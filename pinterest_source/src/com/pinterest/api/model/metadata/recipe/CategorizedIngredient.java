// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.recipe;

import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model.metadata.recipe:
//            Ingredient

public class CategorizedIngredient
{

    private String _category;
    private String _categoryDisplay;
    private String _id;
    private List _ingredients;
    private String _type;

    public CategorizedIngredient()
    {
        _ingredients = new ArrayList();
    }

    public CategorizedIngredient(PinterestJsonObject pinterestjsonobject)
    {
        _ingredients = new ArrayList();
        if (pinterestjsonobject == null)
        {
            return;
        } else
        {
            _id = pinterestjsonobject.a("id", "");
            _category = pinterestjsonobject.a("category", "");
            _type = pinterestjsonobject.a("type", "");
            _ingredients = Ingredient.getIngredients(pinterestjsonobject.e("ingredients"));
            updateCategoryDisplay();
            return;
        }
    }

    public static List getCategorizedIngredients(PinterestJsonArray pinterestjsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (pinterestjsonarray != null)
        {
            int i = 0;
            int j = pinterestjsonarray.a();
            while (i < j) 
            {
                arraylist.add(new CategorizedIngredient(pinterestjsonarray.c(i)));
                i++;
            }
        }
        return arraylist;
    }

    private void updateCategoryDisplay()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append("<b>").append(_category).append("</b>");
        stringbuilder.append("<br/>");
        for (Iterator iterator = _ingredients.iterator(); iterator.hasNext(); stringbuilder.append("<br/>"))
        {
            Ingredient ingredient = (Ingredient)iterator.next();
            stringbuilder.append(ingredient.getName()).append(" ").append(ingredient.getAmount());
        }

        _categoryDisplay = stringbuilder.toString();
    }

    public String getCategory()
    {
        return _category;
    }

    public String getCategoryDisplay()
    {
        return _categoryDisplay;
    }

    public String getId()
    {
        return _id;
    }

    public List getIngredients()
    {
        return _ingredients;
    }

    public String getType()
    {
        return _type;
    }

    public void setCategory(String s)
    {
        _category = s;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setIngredients(List list)
    {
        _ingredients = list;
    }

    public void setType(String s)
    {
        _type = s;
    }
}
