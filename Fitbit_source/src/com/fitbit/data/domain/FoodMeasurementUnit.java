// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.FitBitApplication;
import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.ah;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class FoodMeasurementUnit extends Entity
    implements b
{

    private int foodMeasurementUnitTypeBitmap;
    private String name;
    private String pluralForm;

    public FoodMeasurementUnit()
    {
    }

    public int a()
    {
        return foodMeasurementUnitTypeBitmap;
    }

    public void a(int i)
    {
        foodMeasurementUnitTypeBitmap = i;
    }

    public void a(String s)
    {
        name = s;
    }

    public String b()
    {
        return name;
    }

    public void b(String s)
    {
        pluralForm = s;
    }

    public String c()
    {
        if (pluralForm == null)
        {
            return FitBitApplication.a().d().a(name);
        } else
        {
            return pluralForm;
        }
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        name = com.fitbit.d.a.a(jsonobject, "name");
        pluralForm = com.fitbit.d.a.a(jsonobject, "plural");
        setServerId(com.fitbit.d.a.a(jsonobject, "id", -1));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(b());
        stringbuilder.append(" pluralForm: ").append(c());
        return stringbuilder.toString();
    }
}
