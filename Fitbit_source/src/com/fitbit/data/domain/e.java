// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.data.repo.greendao.food.FoodItem;
import com.fitbit.data.repo.greendao.food.FoodItemDao;
import com.fitbit.data.repo.greendao.mapping.FoodItemMapper;
import com.fitbit.data.repo.greendao.mapping.MappingUtils;
import com.fitbit.util.g.b;
import com.fitbit.util.w;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            d, h, FoodItem, MealType

public class e
    implements d
{

    private static Map a = new HashMap();
    private static final String b = "EntityWithFoodItemBase";
    private com.fitbit.data.domain.FoodItem c;
    private String d;
    private String e;
    private MealType f;
    private double g;
    private double h;
    private String i;
    private String j;

    public e()
    {
    }

    private static com.fitbit.util.g.b.b a(Object obj, String s)
    {
        Object obj1 = (Map)a.get(obj.getClass());
        if (obj1 == null)
        {
            obj1 = new HashMap();
            a.put(obj.getClass(), obj1);
        }
        Method method1 = (Method)((Map) (obj1)).get(s);
        Method method = method1;
        if (method1 == null)
        {
            method = com.fitbit.util.g.b.a(obj.getClass(), s, new String[0]);
            ((Map) (obj1)).put(s, method);
        }
        return com.fitbit.util.g.b.a(obj, method, new Object[0]);
    }

    private static void a(Object obj, String s, Class class1, Object obj1)
    {
        Object obj2 = (Map)a.get(obj.getClass());
        if (obj2 == null)
        {
            obj2 = new HashMap();
            a.put(obj.getClass(), obj2);
        }
        Method method1 = (Method)((Map) (obj2)).get(s);
        Method method = method1;
        if (method1 == null)
        {
            method = com.fitbit.util.g.b.a(obj.getClass(), s, new String[] {
                class1.getName()
            });
            ((Map) (obj2)).put(s, method);
        }
        com.fitbit.util.g.b.a(obj, method, new Object[] {
            obj1
        });
    }

    private static void a(Object obj, String s, Class class1, Object obj1, String s1)
    {
        obj = a(obj, s);
        if (((com.fitbit.util.g.b.b) (obj)).b)
        {
            a(obj1, s1, class1, ((com.fitbit.util.g.b.b) (obj)).c);
        }
    }

    public double getAmount()
    {
        return h;
    }

    public String getBrand()
    {
        return e;
    }

    public double getCalories()
    {
        return g;
    }

    public com.fitbit.data.domain.FoodItem getFoodItem()
    {
        return c;
    }

    public MealType getMealType()
    {
        return f;
    }

    public String getName()
    {
        return d;
    }

    public String getUnitName()
    {
        return i;
    }

    public String getUnitNamePlural()
    {
        return j;
    }

    public void initFoodDefaultServing()
    {
        double d1 = 1.0D;
        h h1 = new h();
        h1.a(getUnitName());
        h1.b(getUnitNamePlural());
        if (getAmount() > 0.0D)
        {
            d1 = 1.0D / getAmount();
        }
        h1.a(d1);
        h1.a(true);
        ArrayList arraylist = new ArrayList();
        arraylist.add(h1);
        getFoodItem().a(arraylist);
    }

    public void initFoodItemFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        com.fitbit.data.domain.FoodItem fooditem = new com.fitbit.data.domain.FoodItem();
        fooditem.initFromPublicApiJsonObject(jsonobject);
        setFoodItem(fooditem);
    }

    public void initGeneralPartFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        setAmount(com.fitbit.d.a.a(jsonobject, "amount", 0.0D));
        setName(com.fitbit.d.a.a(jsonobject, "name"));
        setBrand(com.fitbit.d.a.a(jsonobject, "brand"));
        setUnitName(com.fitbit.d.a.a(jsonobject, "unitName"));
        setUnitNamePlural(com.fitbit.d.a.a(jsonobject, "unitNamePlural"));
        setCalories(com.fitbit.d.a.a(jsonobject, "calories", 0.0D));
        setMealType(MealType.getByServerType(com.fitbit.d.a.a(jsonobject, "mealType"), MealType.ANYTIME));
    }

    public void populateEntity(Object obj, FoodItemDao fooditemdao, boolean flag)
    {
        a(obj, "setMealType", java/lang/Integer, Integer.valueOf(getMealType().getCode()));
        if (flag)
        {
            MappingUtils.assertEntityHasId(getFoodItem());
            a(obj, "setFoodItem", com/fitbit/data/repo/greendao/food/FoodItem, fooditemdao.load(getFoodItem().getEntityId()));
        }
        a(this, "getAmount", java/lang/Double, obj, "setAmount");
        a(this, "getName", java/lang/String, obj, "setName");
        a(this, "getBrand", java/lang/String, obj, "setBrand");
        a(this, "getCalories", java/lang/Double, obj, "setCalories");
        a(this, "getUnitName", java/lang/String, obj, "setUnitName");
        a(this, "getUnitNamePlural", java/lang/String, obj, "setUnitNamePlural");
    }

    public void populateFromEntity(Object obj, FoodItemMapper fooditemmapper)
    {
        com.fitbit.util.g.b.b b1 = a(obj, "getMealType");
        if (b1.b)
        {
            setMealType((MealType)w.a(((Integer)b1.c).intValue(), com/fitbit/data/domain/MealType));
        }
        b1 = a(obj, "getFoodItem");
        if (b1.b)
        {
            setFoodItem(fooditemmapper.fromDbEntity((FoodItem)b1.c));
        }
        a(obj, "getAmount", Double.TYPE, this, "setAmount");
        a(obj, "getName", java/lang/String, this, "setName");
        a(obj, "getBrand", java/lang/String, this, "setBrand");
        a(obj, "getCalories", Double.TYPE, this, "setCalories");
        a(obj, "getUnitName", java/lang/String, this, "setUnitName");
        a(obj, "getUnitNamePlural", java/lang/String, this, "setUnitNamePlural");
    }

    public void setAmount(double d1)
    {
        h = d1;
    }

    public void setBrand(String s)
    {
        e = s;
    }

    public void setCalories(double d1)
    {
        g = d1;
    }

    public void setFoodItem(com.fitbit.data.domain.FoodItem fooditem)
    {
        c = fooditem;
    }

    public void setMealType(MealType mealtype)
    {
        f = mealtype;
    }

    public void setName(String s)
    {
        d = s;
    }

    public void setUnitName(String s)
    {
        i = s;
    }

    public void setUnitNamePlural(String s)
    {
        j = s;
    }

}
