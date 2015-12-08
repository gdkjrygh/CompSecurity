// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            Entity

public class Brand extends Entity
{

    private int brandType;
    private boolean isPublic;
    private String name;

    public Brand()
    {
    }

    public String a()
    {
        return name;
    }

    public void a(int i)
    {
        brandType = i;
    }

    public void a(String s)
    {
        name = s;
    }

    public void a(JSONObject jsonobject)
        throws JSONException
    {
        setServerId(com.fitbit.d.a.a(jsonobject, "id", -1));
        a(com.fitbit.d.a.a(jsonobject, "brand"));
        a(com.fitbit.d.a.a(jsonobject, "brandIsPublic", false).booleanValue());
    }

    public void a(boolean flag)
    {
        isPublic = flag;
    }

    public int b()
    {
        return brandType;
    }

    public boolean c()
    {
        return isPublic;
    }

    public String toString()
    {
        StringBuilder stringbuilder = new StringBuilder(super.toString());
        stringbuilder.append(" name: ").append(a());
        stringbuilder.append(" brandType: ").append(b());
        stringbuilder.append(" isPublic: ").append(c());
        return stringbuilder.toString();
    }
}
