// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.pinterest.api.model.metadata.recipe;

import android.text.Html;
import android.text.Spanned;
import com.pinterest.api.model.BoostablePinMetadata;
import com.pinterest.api.model.ModelHelper;
import com.pinterest.api.model.Pin;
import com.pinterest.api.model.metadata.AggregateRating;
import com.pinterest.kit.application.Resources;
import com.pinterest.network.json.PinterestJsonArray;
import com.pinterest.network.json.PinterestJsonObject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

// Referenced classes of package com.pinterest.api.model.metadata.recipe:
//            CategorizedIngredient, CookTimes

public class Recipe extends BoostablePinMetadata
{

    private AggregateRating _aggregateRating;
    private String _bullet;
    private List _categorizedIngredients;
    private CookTimes _cookTimes;
    private String _description;
    private PinterestJsonArray _diets;
    private String _id;
    private int _ingredientCount;
    private String _metadataDisplay;
    private String _name;
    private String _recipeYield;
    private String _type;

    public Recipe()
    {
        super(null, null);
        _categorizedIngredients = new ArrayList();
        _diets = new PinterestJsonArray();
        _ingredientCount = 0;
        _bullet = " &#8226; ";
    }

    public Recipe(Pin pin, PinterestJsonObject pinterestjsonobject)
    {
        super(pin, pinterestjsonobject);
        _categorizedIngredients = new ArrayList();
        _diets = new PinterestJsonArray();
        _ingredientCount = 0;
        _bullet = " &#8226; ";
        if (pinterestjsonobject != null) goto _L2; else goto _L1
_L1:
        return;
_L2:
        if ((pin = pinterestjsonobject.c("recipe")) == null) goto _L1; else goto _L3
_L3:
        _aggregateRating = new AggregateRating(pin.c("aggregate_rating"));
        _categorizedIngredients = CategorizedIngredient.getCategorizedIngredients(pin.e("categorized_ingredients"));
        _cookTimes = new CookTimes(pin.c("cook_times"));
        _diets = pin.e("diets");
        _description = pin.a("description", "");
        _id = pin.a("id", "");
        _name = pin.a("name", "");
        pinterestjsonobject = pin.c("servings_summary");
        if (pinterestjsonobject == null) goto _L5; else goto _L4
_L4:
        String s = pinterestjsonobject.a("yields", "");
        if (!ModelHelper.isValid(s)) goto _L7; else goto _L6
_L6:
        _recipeYield = s;
_L5:
        _type = pin.a("type", "");
_L9:
        generateCacheContent();
        return;
_L7:
        pinterestjsonobject = pinterestjsonobject.a("serves", "");
        if (!ModelHelper.isValid(pinterestjsonobject)) goto _L5; else goto _L8
_L8:
        int i;
        if (pinterestjsonobject.equals("1"))
        {
            i = 0x7f070489;
        } else
        {
            i = 0x7f070488;
        }
        _recipeYield = Resources.string(i, new Object[] {
            pinterestjsonobject
        });
          goto _L5
        pin;
          goto _L9
    }

    private String makeMetadataDisplay()
    {
        String s = getCookTimeDisplay();
        boolean flag = ModelHelper.isValid(s);
        String s1 = getRecipeYield();
        boolean flag1 = ModelHelper.isValid(s1);
        if (flag && flag1)
        {
            s = Resources.string(0x7f070487, new Object[] {
                s, s1
            });
        } else
        if (!flag)
        {
            if (flag1)
            {
                return s1;
            } else
            {
                return "";
            }
        }
        return s;
    }

    public void generateCacheContent()
    {
        for (Iterator iterator = _categorizedIngredients.iterator(); iterator.hasNext();)
        {
            CategorizedIngredient categorizedingredient = (CategorizedIngredient)iterator.next();
            int i = _ingredientCount;
            _ingredientCount = categorizedingredient.getIngredients().size() + i;
        }

        _metadataDisplay = makeMetadataDisplay();
    }

    public AggregateRating getAggregateRating()
    {
        return _aggregateRating;
    }

    public List getCategorizedIngredients()
    {
        return _categorizedIngredients;
    }

    public String getCookTimeDisplay()
    {
        if (!ModelHelper.isValid(_cookTimes.getDisplay()))
        {
            return null;
        } else
        {
            return _cookTimes.getDisplay();
        }
    }

    public CookTimes getCookTimes()
    {
        return _cookTimes;
    }

    public String getDescription()
    {
        return _description;
    }

    public PinterestJsonArray getDiets()
    {
        return _diets;
    }

    public String getId()
    {
        return _id;
    }

    protected PinterestJsonObject getJsonObject(PinterestJsonObject pinterestjsonobject)
    {
        return pinterestjsonobject.c("recipe");
    }

    public Spanned getMetadataDisplay()
    {
        return Html.fromHtml(_metadataDisplay);
    }

    public String getName()
    {
        return _name;
    }

    public String getRecipeYield()
    {
        return _recipeYield;
    }

    public String getType()
    {
        return _type;
    }

    public void setAggregateRating(AggregateRating aggregaterating)
    {
        _aggregateRating = aggregaterating;
    }

    public void setCategorizedIngredients(List list)
    {
        _categorizedIngredients = list;
    }

    public void setCookTimes(CookTimes cooktimes)
    {
        _cookTimes = cooktimes;
    }

    public void setDescription(String s)
    {
        _description = s;
    }

    public void setDiets(PinterestJsonArray pinterestjsonarray)
    {
        _diets = pinterestjsonarray;
    }

    public void setId(String s)
    {
        _id = s;
    }

    public void setName(String s)
    {
        _name = s;
    }

    public void setRecipeYield(String s)
    {
        _recipeYield = s;
    }

    public void setType(String s)
    {
        _type = s;
    }
}
