// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.igmodel.metadata.recipe;

import com.pinterest.api.igmodel.metadata.IgAggregateRating;
import com.pinterest.api.igmodel.metadata.IgMetadata;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.metadata.recipe.Recipe;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.igmodel.metadata.recipe:
//            IgServingSummary, IgCookTimes, TypeTime, IgCategorizedIngredient, 
//            IgIngredient

public class IgRecipe extends IgMetadata
{

    IgAggregateRating h;
    public String i;
    public IgServingSummary j;
    public IgCookTimes k;
    List l;
    List m;
    public String n;
    public String o;
    public String p;

    public IgRecipe()
    {
    }

    public final PinterestJsonObject a()
    {
        PinterestJsonObject pinterestjsonobject = super.a();
        pinterestjsonobject.b("id", n);
        pinterestjsonobject.b("type", p);
        pinterestjsonobject.b("name", o);
        pinterestjsonobject.b("description", i);
        if (h != null)
        {
            pinterestjsonobject.a("aggregate_rating", h.b());
        }
        if (m != null)
        {
            pinterestjsonobject.a("diets", new PinterestJsonArray(m));
        }
        if (j != null)
        {
            IgServingSummary igservingsummary = j;
            PinterestJsonObject pinterestjsonobject1 = new PinterestJsonObject();
            pinterestjsonobject1.b("yields", igservingsummary.a);
            pinterestjsonobject1.b("serves", igservingsummary.b);
            pinterestjsonobject1.b("summary", igservingsummary.c);
            pinterestjsonobject.a("servings_summary", pinterestjsonobject1);
        }
        if (k != null)
        {
            IgCookTimes igcooktimes = k;
            PinterestJsonObject pinterestjsonobject2 = new PinterestJsonObject();
            if (igcooktimes.a != null)
            {
                pinterestjsonobject2.a("total", igcooktimes.a.a());
            }
            if (igcooktimes.b != null)
            {
                pinterestjsonobject2.a("prep", igcooktimes.b.a());
            }
            if (igcooktimes.c != null)
            {
                pinterestjsonobject2.a("cook", igcooktimes.c.a());
            }
            pinterestjsonobject.a("cook_times", pinterestjsonobject2);
        }
        if (l != null)
        {
            PinterestJsonArray pinterestjsonarray = new PinterestJsonArray();
            PinterestJsonObject pinterestjsonobject3;
            for (Iterator iterator = l.iterator(); iterator.hasNext(); pinterestjsonarray.a(pinterestjsonobject3))
            {
                Object obj = (IgCategorizedIngredient)iterator.next();
                pinterestjsonobject3 = new PinterestJsonObject();
                pinterestjsonobject3.b("id", ((IgCategorizedIngredient) (obj)).a);
                pinterestjsonobject3.b("type", ((IgCategorizedIngredient) (obj)).c);
                pinterestjsonobject3.b("category", ((IgCategorizedIngredient) (obj)).b);
                if (((IgCategorizedIngredient) (obj)).d == null)
                {
                    continue;
                }
                PinterestJsonArray pinterestjsonarray1 = new PinterestJsonArray();
                PinterestJsonObject pinterestjsonobject4;
                for (obj = ((IgCategorizedIngredient) (obj)).d.iterator(); ((Iterator) (obj)).hasNext(); pinterestjsonarray1.a(pinterestjsonobject4))
                {
                    IgIngredient igingredient = (IgIngredient)((Iterator) (obj)).next();
                    pinterestjsonobject4 = new PinterestJsonObject();
                    pinterestjsonobject4.b("id", igingredient.b);
                    pinterestjsonobject4.b("type", igingredient.d);
                    pinterestjsonobject4.b("name", igingredient.c);
                    pinterestjsonobject4.b("amt", igingredient.a);
                }

                pinterestjsonobject3.a("ingredients", pinterestjsonarray1);
            }

            pinterestjsonobject.a("categorized_ingredients", pinterestjsonarray);
        }
        return pinterestjsonobject;
    }

    public final Recipe b()
    {
        Recipe recipe;
        recipe = new Recipe();
        a(recipe);
        if (h != null)
        {
            recipe.setAggregateRating(h.a());
        }
        if (k != null)
        {
            recipe.setCookTimes(k.a());
        }
        if (l != null)
        {
            ArrayList arraylist = new ArrayList();
            for (Iterator iterator = l.iterator(); iterator.hasNext(); arraylist.add(((IgCategorizedIngredient)iterator.next()).a())) { }
            recipe.setCategorizedIngredients(arraylist);
        }
        if (m != null)
        {
            recipe.setDiets(new PinterestJsonArray(m));
        }
        if (j == null) goto _L2; else goto _L1
_L1:
        String s = j.a;
        if (!ModelHelper.isValid(s)) goto _L4; else goto _L3
_L3:
        recipe.setRecipeYield(s);
_L2:
        recipe.setId(n);
        recipe.setType(p);
        recipe.setName(o);
        recipe.generateCacheContent();
        return recipe;
_L4:
        String s1 = j.b;
        if (ModelHelper.isValid(s1))
        {
            int i1;
            if (s1.equals("1"))
            {
                i1 = 0x7f070489;
            } else
            {
                i1 = 0x7f070488;
            }
            recipe.setRecipeYield(Resources.string(i1, new Object[] {
                s1
            }));
        }
        if (true) goto _L2; else goto _L5
_L5:
    }

    public Object getModel()
    {
        return b();
    }
}
