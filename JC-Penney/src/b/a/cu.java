// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            db, cv, cy, fc

public final class cu extends db
{

    private String a;
    private String b;
    private cv c;
    private String d;
    private String e;
    private String f;

    public cu(cv cv1)
    {
        cv cv2;
        if (cv1 != cv.a)
        {
            cv2 = cv.b;
        }
        a = cy.a.a();
        b = fc.a.a();
        c = cv1;
    }

    public cu(cv cv1, String s)
    {
        cv cv2;
        if (cv1 != cv.c)
        {
            cv2 = cv.d;
        }
        a = cy.a.a();
        b = fc.a.a();
        c = cv1;
        d = s;
    }

    public cu(cv cv1, String s, String s1)
    {
        cv cv2 = cv.e;
        a = cy.a.a();
        b = fc.a.a();
        c = cv1;
        e = s;
        f = s1;
    }

    public final JSONArray a()
    {
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("change", Integer.valueOf(c.ordinal()));
        if (c != cv.c && c != cv.d) goto _L2; else goto _L1
_L1:
        hashmap.put("type", d);
_L4:
        return (new JSONArray()).put(b).put(4).put(new JSONObject(hashmap));
_L2:
        if (c == cv.e)
        {
            hashmap.put("oldType", e);
            hashmap.put("newType", f);
        }
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final String j()
    {
        return a;
    }
}
