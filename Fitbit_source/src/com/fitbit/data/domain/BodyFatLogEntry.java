// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.fitbit.data.domain;

import com.fitbit.d.a;
import com.fitbit.d.b;
import com.fitbit.util.o;
import com.fitbit.weight.Fat;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.fitbit.data.domain:
//            TrackedValue, Measurable

public class BodyFatLogEntry extends TrackedValue
    implements b
{

    public static final String a = "FAT";
    private Fat fat;

    public BodyFatLogEntry()
    {
    }

    public Fat a()
    {
        return fat;
    }

    public volatile void a(Measurable measurable)
    {
        a((Fat)measurable);
    }

    public void a(Fat fat1)
    {
        fat = fat1;
    }

    public boolean b()
    {
        return o.l(getLogDate());
    }

    public String c()
    {
        return "FAT";
    }

    public Measurable d()
    {
        return a();
    }

    public void initFromPublicApiJsonObject(JSONObject jsonobject)
        throws JSONException
    {
        a(new Fat(com.fitbit.d.a.a(jsonobject, "fat", 0.0D)));
        setServerId(com.fitbit.d.a.b(jsonobject, "logId", -1));
        if (jsonobject.has("time"))
        {
            jsonobject.put("date-with-time", (new StringBuilder()).append(jsonobject.get("date")).append(" ").append(jsonobject.getString("time")).toString());
            setLogDate(com.fitbit.d.a.f(jsonobject, "date-with-time"));
        } else
        {
            setLogDate(com.fitbit.d.a.e(jsonobject, "date"));
        }
        setEntityStatus(Entity.EntityStatus.SYNCED);
    }

    public JSONObject toPublicApiJsonObject()
        throws JSONException
    {
        throw new UnsupportedOperationException();
    }
}
