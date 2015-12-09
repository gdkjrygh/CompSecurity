// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity, MealItem

public class Meal extends Entity
    implements b
{

    private String description;
    private List mealItems;
    private String name;

    public Meal()
    {
        mealItems = new ArrayList();
    }

    public String a()
    {
        return name;
    }

    public void a(String s)
    {
        name = s;
    }

    public void a(List list)
    {
        mealItems = list;
    }

    public String b()
    {
        return description;
    }

    public void b(String s)
    {
        description = s;
    }

    public List c()
    {
        return mealItems;
    }

    public double d()
    {
        Iterator iterator = mealItems.iterator();
        double d1;
        for (d1 = 0.0D; iterator.hasNext(); d1 = ((MealItem)iterator.next()).getCalories() + d1) { }
        return d1;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(jsonobject.getString("name"));
        setServerId(jsonobject.getLong("id"));
        b(jsonobject.getString("description"));
        ArrayList arraylist = new ArrayList();
        jsonobject = jsonobject.getJSONArray("mealFoods");
        for (int i = 0; i < jsonobject.length(); i++)
        {
            JSONObject jsonobject1 = jsonobject.getJSONObject(i);
            MealItem mealitem = new MealItem();
            mealitem.initFromPublicApiJsonObject(jsonobject1);
            mealitem.setMeal(this);
            arraylist.add(mealitem);
        }

        a(arraylist);
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(a());
        stringbuilder.append(" mealItems: {").append(c()).append("}");
        return stringbuilder.toString();
    }
}
