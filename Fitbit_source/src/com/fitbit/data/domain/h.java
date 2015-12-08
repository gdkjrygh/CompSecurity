// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            FoodItem

public class h
    implements b
{

    private String a;
    private String b;
    private double c;
    private boolean d;
    private FoodItem e;

    public h()
    {
    }

    public String a()
    {
        return a;
    }

    public void a(double d1)
    {
        c = d1;
    }

    public void a(FoodItem fooditem)
    {
        e = fooditem;
    }

    public void a(String s)
    {
        a = s;
    }

    public void a(boolean flag)
    {
        d = flag;
    }

    public String b()
    {
        return b;
    }

    public void b(String s)
    {
        b = s;
    }

    public double c()
    {
        return c;
    }

    public boolean d()
    {
        return d;
    }

    public FoodItem e()
    {
        return e;
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(com.fitbit.d.a.a(jsonobject, "unitName"));
        b(com.fitbit.d.a.a(jsonobject, "unitNamePlural"));
        a(com.fitbit.d.a.a(jsonobject, "multiplier", 1.0D));
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" unitName: ").append(a());
        stringbuilder.append(" unitNamePlural: ").append(b());
        stringbuilder.append(" multiplier: ").append(c());
        stringbuilder.append(" isDefault: ").append(d());
        return stringbuilder.toString();
    }
}
