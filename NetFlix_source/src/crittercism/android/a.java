// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import android.util.Log;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            g, au, b

public final class a
{

    JSONObject a;

    private a(g g1, List list)
    {
        a = new JSONObject();
        list.size();
        JSONArray jsonarray = new JSONArray();
        JSONArray jsonarray1 = new JSONArray();
        jsonarray1.put(g1.a());
        jsonarray1.put(g1.b());
        jsonarray1.put(g1.c());
        jsonarray1.put("3.1.4");
        jsonarray1.put(g1.d());
        jsonarray.put(jsonarray1);
        jsonarray1 = new JSONArray();
        jsonarray1.put(au.a.a());
        jsonarray1.put(g1.e());
        jsonarray1.put(g1.g());
        jsonarray1.put(g1.f());
        jsonarray1.put(g1.h());
        jsonarray.put(jsonarray1);
        g1 = new JSONArray();
        for (list = list.iterator(); list.hasNext(); g1.put(((b)list.next()).a())) { }
        jsonarray.put(g1);
        a.put("d", jsonarray);
    }

    public static a a(g g1, List list)
    {
        try
        {
            g1 = new a(g1, list);
        }
        // Misplaced declaration of an exception variable
        catch (g g1)
        {
            Log.e("Crittercism", (new StringBuilder("Unable to generate APM request's JSON: ")).append(g1).toString());
            return null;
        }
        return g1;
    }
}
