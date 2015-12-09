// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package b.a;

import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package b.a:
//            l, fc, eg, eu

public final class a
{

    JSONObject a;

    private a(l l1, List list)
    {
        a = new JSONObject();
        list.size();
        JSONArray jsonarray = new JSONArray();
        JSONArray jsonarray1 = new JSONArray();
        jsonarray1.put(l1.a());
        jsonarray1.put(l1.b());
        jsonarray1.put(l1.c());
        jsonarray1.put("5.3.3");
        jsonarray1.put(l1.e());
        jsonarray.put(jsonarray1);
        jsonarray1 = new JSONArray();
        jsonarray1.put(fc.a.a());
        jsonarray1.put(l1.f());
        jsonarray1.put(l1.j());
        jsonarray1.put(l1.i());
        jsonarray1.put(l1.k());
        jsonarray1.put(l1.g());
        jsonarray1.put(l1.h());
        jsonarray.put(jsonarray1);
        l1 = new JSONArray();
        for (list = list.iterator(); list.hasNext(); l1.put(((eg)list.next()).d())) { }
        jsonarray.put(l1);
        a.put("d", jsonarray);
    }

    public static a a(l l1, List list)
    {
        try
        {
            l1 = new a(l1, list);
        }
        // Misplaced declaration of an exception variable
        catch (l l1)
        {
            eu.b((new StringBuilder("Unable to generate APM request's JSON: ")).append(l1).toString());
            return null;
        }
        return l1;
    }
}
