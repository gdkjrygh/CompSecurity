// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            db, cy, fc, at

public final class as extends db
{

    private String a;
    private String b;
    private at c;
    private String d;

    public as(at at1, String s)
    {
        a = cy.a.a();
        b = fc.a.a();
        c = at1;
        d = s;
    }

    public final JSONArray a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", Integer.valueOf(c.ordinal()));
        hashmap.put("viewName", d);
        return (new JSONArray()).put(b).put(5).put(new JSONObject(hashmap));
    }

    public final String j()
    {
        return a;
    }
}
