// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package a.a;

import com.appboy.d.j;
import com.appboy.f;
import com.appboy.f.a;
import org.json.JSONException;
import org.json.JSONObject;

public final class bq
{

    private static final String b;
    public final j a;

    public bq(JSONObject jsonobject)
    {
        JSONObject jsonobject1;
        jsonobject1 = jsonobject.optJSONObject("error");
        if (jsonobject1 == null) goto _L2; else goto _L1
_L1:
        jsonobject = new j(jsonobject1);
_L4:
        a = jsonobject;
        return;
        jsonobject;
        com.appboy.f.a.b(b, (new StringBuilder("Encountered exception processing ResponseError: ")).append(jsonobject1.toString()).toString(), jsonobject);
_L2:
        jsonobject = null;
        if (true) goto _L4; else goto _L3
_L3:
    }

    static 
    {
        b = String.format("%s.%s", new Object[] {
            f.a, a/a/bq.getName()
        });
    }
}
