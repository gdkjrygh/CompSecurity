// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.leanplum;

import com.leanplum.callbacks.VariablesChangedCallback;
import java.util.Map;
import org.json.JSONObject;

// Referenced classes of package com.leanplum:
//            ab, T, a, aU, 
//            N

final class C
    implements ab
{

    private final VariablesChangedCallback a;

    C(VariablesChangedCallback variableschangedcallback)
    {
        a = variableschangedcallback;
        super();
    }

    public final void a(JSONObject jsonobject)
    {
        Object obj = T.b(jsonobject);
        jsonobject = com.leanplum.a.a(((JSONObject) (obj)).optJSONObject("vars"));
        Map map = com.leanplum.a.a(((JSONObject) (obj)).optJSONObject("messages"));
        Map map1 = com.leanplum.a.a(((JSONObject) (obj)).optJSONObject("regions"));
        obj = com.leanplum.a.a(((JSONObject) (obj)).optJSONArray("variants"));
        if (!jsonobject.equals(aU.a()) || !map.equals(aU.b()))
        {
            aU.a(jsonobject, map, map1, ((java.util.List) (obj)));
        }
        if (a != null)
        {
            N.a().a(a);
        }
    }
}
