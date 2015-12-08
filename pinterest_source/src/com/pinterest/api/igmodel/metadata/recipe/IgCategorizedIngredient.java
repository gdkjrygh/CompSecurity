// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.pinterest.api.igmodel.IgModel;
import com.pinterest.api.model.metadata.recipe.CategorizedIngredient;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            IgIngredient

public class IgCategorizedIngredient
    implements IgModel
{

    public String a;
    public String b;
    public String c;
    public List d;

    public IgCategorizedIngredient()
    {
    }

    public final CategorizedIngredient a()
    {
        CategorizedIngredient categorizedingredient = new CategorizedIngredient();
        categorizedingredient.setId(a);
        categorizedingredient.setCategory(b);
        categorizedingredient.setType(c);
        if (d != null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = d.iterator(); iterator.hasNext(); arraylist.add(((IgIngredient)iterator.next()).a())) { }
            categorizedingredient.setIngredients(arraylist);
        }
        return categorizedingredient;
    }

    public Object getModel()
    {
        return a();
    }
}
