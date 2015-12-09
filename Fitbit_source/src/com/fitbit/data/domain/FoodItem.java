// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.food.NutritionalValue;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, Brand, h

public class FoodItem extends Entity
    implements b
{

    private Brand brand;
    private Date createdOn;
    private h defaultServingUnit;
    private boolean isCustom;
    private boolean isGeneric;
    private boolean isRaw;
    private List lightServingUnits;
    private double maxGenericCalories;
    private double minGenericCalories;
    private double mostGenericCalories;
    private String name;
    private Map nutritionalValues;
    private boolean populated;

    public FoodItem()
    {
        lightServingUnits = new ArrayList();
        nutritionalValues = new HashMap();
    }

    public static FoodItem a(FoodItem fooditem, FoodItem fooditem1)
    {
        if (fooditem1 != null && !fooditem.n())
        {
            fooditem1.a(fooditem.f());
            fooditem1.a(fooditem.a());
            if (fooditem1.b().isEmpty())
            {
                fooditem1.a(fooditem.b());
            }
            if (fooditem1.d().isEmpty())
            {
                fooditem1.a(fooditem.d());
            }
            if (fooditem1.g() || fooditem.g())
            {
                fooditem1.a(true);
            }
            return fooditem1;
        }
        if (fooditem1 != null)
        {
            fooditem.setEntityId(fooditem1.getEntityId());
            fooditem.a(fooditem1.g());
            if (!fooditem.n())
            {
                fooditem.a(fooditem1.b());
            }
        }
        return fooditem;
    }

    private void a(JSONObject jsonobject, String s)
        throws JSONException
    {
        brand = new Brand();
        brand.a(com.fitbit.d.a.a(jsonobject, s));
    }

    public static Map e()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("calories", Double.valueOf(0.0D));
        return hashmap;
    }

    public Brand a()
    {
        return brand;
    }

    public void a(double d1)
    {
        minGenericCalories = d1;
    }

    public void a(Brand brand1)
    {
        brand = brand1;
    }

    public void a(Double double1)
    {
        nutritionalValues.put("calories", double1);
    }

    public void a(String s)
    {
        name = s;
    }

    public void a(Date date)
    {
        createdOn = date;
    }

    public void a(List list)
    {
        lightServingUnits = list;
        list = list.iterator();
        do
        {
            if (!list.hasNext())
            {
                break;
            }
            h h1 = (h)list.next();
            if (!h1.d())
            {
                continue;
            }
            defaultServingUnit = h1;
            break;
        } while (true);
    }

    public void a(Map map)
    {
        nutritionalValues = map;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public void a(boolean flag)
    {
        isCustom = flag;
    }

    public List b()
    {
        return lightServingUnits;
    }

    public void b(double d1)
    {
        mostGenericCalories = d1;
    }

    public void b(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = com.fitbit.d.a.h(jsonobject, "defaultUnit");
        double d1 = com.fitbit.d.a.a(jsonobject, "defaultServingSize", 1.0D);
        jsonobject = new ArrayList();
        if (jsonobject1 != null)
        {
            h h1 = new h();
            h1.a(com.fitbit.d.a.a(jsonobject1, "name"));
            h1.b(com.fitbit.d.a.a(jsonobject1, "plural"));
            h1.a(1.0D / d1);
            h1.a(this);
            h1.a(true);
            jsonobject.add(h1);
        }
        a(jsonobject);
    }

    public void b(boolean flag)
    {
        isRaw = flag;
    }

    public Double c()
    {
        return (Double)d().get("calories");
    }

    public void c(double d1)
    {
        maxGenericCalories = d1;
    }

    public void c(JSONObject jsonobject)
        throws JSONException
    {
        JSONObject jsonobject1 = com.fitbit.d.a.h(jsonobject, "servings");
        jsonobject = com.fitbit.d.a.a(jsonobject, "defaultServingUnit");
        ArrayList arraylist = new ArrayList();
        if (jsonobject1 != null)
        {
            JSONArray jsonarray = jsonobject1.names();
            for (int i1 = 0; i1 < jsonarray.length(); i1++)
            {
                JSONObject jsonobject2 = jsonobject1.optJSONObject(jsonarray.getString(i1));
                if (jsonobject2 != null)
                {
                    h h1 = new h();
                    h1.initFromPublicApiJsonObject(jsonobject2);
                    h1.a(this);
                    h1.a(h1.a().equals(jsonobject));
                    arraylist.add(h1);
                }
            }

        }
        a(arraylist);
    }

    public void c(boolean flag)
    {
        isGeneric = flag;
    }

    public Map d()
    {
        return nutritionalValues;
    }

    public void d(boolean flag)
    {
        populated = flag;
    }

    public String f()
    {
        return name;
    }

    public boolean g()
    {
        return isCustom;
    }

    public boolean h()
    {
        return isRaw;
    }

    public boolean i()
    {
        return isGeneric;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        int i1 = 0;
        Object obj = jsonobject;
        if (jsonobject.has("food"))
        {
            obj = jsonobject.getJSONObject("food");
        }
        if (((JSONObject) (obj)).has("defaultServingUnit"))
        {
            c(((JSONObject) (obj)));
        } else
        {
            b(((JSONObject) (obj)));
        }
        setServerId(((JSONObject) (obj)).getInt("foodId"));
        a(com.fitbit.d.a.a(((JSONObject) (obj)), "name"));
        a(((JSONObject) (obj)), "brand");
        b(com.fitbit.d.a.a(((JSONObject) (obj)), "isRaw", false).booleanValue());
        c(com.fitbit.d.a.a(((JSONObject) (obj)), "isGeneric", false).booleanValue());
        a(com.fitbit.d.a.a(((JSONObject) (obj)), "minGenericCalories", 0.0D));
        b(com.fitbit.d.a.a(((JSONObject) (obj)), "mostGenericCalories", 0.0D));
        c(com.fitbit.d.a.a(((JSONObject) (obj)), "maxGenericCalories", 0.0D));
        jsonobject = com.fitbit.d.a.a(((JSONObject) (obj)), "accessLevel");
        if (jsonobject != null && jsonobject.equals("PRIVATE"))
        {
            a(true);
        }
        a(com.fitbit.d.a.a(((JSONObject) (obj)), "isQuickCaloriesAdd", false).booleanValue());
        if (((JSONObject) (obj)).has("calories"))
        {
            a(Double.valueOf(((JSONObject) (obj)).getDouble("calories")));
        }
        if (((JSONObject) (obj)).has("nutritionalValues"))
        {
            jsonobject = ((JSONObject) (obj)).optJSONObject("nutritionalValues");
            if (jsonobject != null)
            {
                obj = NutritionalValue.values();
                for (int j1 = obj.length; i1 < j1; i1++)
                {
                    NutritionalValue nutritionalvalue = obj[i1];
                    if (jsonobject.has(nutritionalvalue.c()))
                    {
                        nutritionalValues.put(nutritionalvalue.c(), Double.valueOf(jsonobject.getDouble(nutritionalvalue.c())));
                    }
                }

            }
        }
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public h j()
    {
        return defaultServingUnit;
    }

    public double k()
    {
        return minGenericCalories;
    }

    public double l()
    {
        return mostGenericCalories;
    }

    public double m()
    {
        return maxGenericCalories;
    }

    public boolean n()
    {
        return populated;
    }

    public Date o()
    {
        return createdOn;
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(f());
        stringbuilder.append(" brand: {").append(a()).append("}");
        return stringbuilder.toString();
    }
}
