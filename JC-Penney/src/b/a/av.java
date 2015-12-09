// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            db, cy, fc, aw

public final class av extends db
{

    private String a;
    private String b;
    private aw c;

    public av(aw aw1)
    {
        a = cy.a.a();
        b = fc.a.a();
        c = aw1;
    }

    public final JSONArray a()
    {
        HashMap hashmap = new HashMap();
        hashmap.put("event", c.a());
        return (new JSONArray()).put(b).put(3).put(new JSONObject(hashmap));
    }

    public final String j()
    {
        return a;
    }
}
