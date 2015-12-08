// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.metadata.recipe.Ingredient;

public class IgIngredient
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public String d;

    public IgIngredient()
    {
    }

    public final Ingredient a()
    {
        Ingredient ingredient = new Ingredient();
        if (!ModelHelper.isValid(a))
        {
            a = "";
        }
        ingredient.setAmount(a);
        ingredient.setId(b);
        ingredient.setName(c);
        ingredient.setType(d);
        return ingredient;
    }

    public Object getModel()
    {
        return a();
    }
}
