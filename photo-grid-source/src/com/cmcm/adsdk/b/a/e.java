// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.cmcm.adsdk.b.a;

import android.text.TextUtils;
import com.cmcm.adsdk.b.c.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package com.cmcm.adsdk.b.a:
//            a, c, b

public final class e
{

    private a a;
    private List b;

    public e()
    {
        a = new a();
        b = new ArrayList();
    }

    public static e a(String s)
    {
        JSONObject jsonobject;
        jsonobject = null;
        if (TextUtils.isEmpty(s))
        {
            return null;
        }
        Object obj = new e();
        s = (new JSONObject(s)).getJSONArray("poslist");
        if (s == null) goto _L2; else goto _L1
_L1:
        int i = 0;
_L6:
        JSONArray jsonarray;
        if (i >= s.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = s.getJSONObject(i);
        jsonarray = jsonobject.getJSONArray("info");
        if (jsonarray == null) goto _L4; else goto _L3
_L3:
        int j = 0;
_L5:
        if (j >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        c c1 = (c)(new c()).a(jsonobject);
        Object obj1 = jsonarray.getJSONObject(j);
        obj1 = (com.cmcm.adsdk.b.a.b)(new com.cmcm.adsdk.b.a.b()).a(((JSONObject) (obj1)));
        c1.d = ((com.cmcm.adsdk.b.a.b) (obj1)).a;
        c1.c = ((com.cmcm.adsdk.b.a.b) (obj1)).b;
        c1.e = Integer.valueOf(((com.cmcm.adsdk.b.a.b) (obj1)).c);
        ((e) (obj)).b.add(c1);
        j++;
        if (true) goto _L5; else goto _L4
_L4:
        i++;
        if (true) goto _L6; else goto _L2
_L2:
        return ((e) (obj));
        s;
        obj = jsonobject;
_L8:
        com.cmcm.adsdk.b.c.b.c("ConfigResponse", (new StringBuilder("ConfigResponse fromJson error...")).append(s.getMessage()).toString());
        return ((e) (obj));
        s;
        if (true) goto _L8; else goto _L7
_L7:
    }

    public final List a()
    {
        return b;
    }

    public final String toString()
    {
        StringBuilder stringbuilder = new StringBuilder();
        stringbuilder.append(a.toString());
        stringbuilder.append(":poslist{");
        for (Iterator iterator = b.iterator(); iterator.hasNext(); stringbuilder.append(","))
        {
            stringbuilder.append(((c)iterator.next()).toString());
        }

        stringbuilder.append("}");
        return stringbuilder.toString();
    }
}
