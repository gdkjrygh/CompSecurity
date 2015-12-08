// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package kik.android.gifs.a;

import android.graphics.Point;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package kik.android.gifs.a:
//            f, d, e, a

public final class n
{

    private static final Map a;

    protected static d a(JSONObject jsonobject)
    {
        int i = 0;
        String s;
        ArrayList arraylist;
        s = jsonobject.getString("next");
        arraylist = new ArrayList();
        for (jsonobject = jsonobject.getJSONArray("results"); i < jsonobject.length(); i++)
        {
            Object obj1 = jsonobject.getJSONObject(i);
            Object obj = ((JSONObject) (obj1)).getJSONArray("media").getJSONObject(0);
            obj1 = ((JSONObject) (obj1)).getString("id");
            obj = c(((JSONObject) (obj)));
            ((f) (obj)).a(((String) (obj1)));
            if (((f) (obj)).b())
            {
                arraylist.add(obj);
            }
            break MISSING_BLOCK_LABEL_107;
        }

        try
        {
            jsonobject = new d(arraylist, s);
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            return null;
        }
        return jsonobject;
    }

    private static e a(String s, JSONObject jsonobject)
    {
        jsonobject = jsonobject.getJSONObject(s);
        s = jsonobject.getString("url");
        if (s.equals("null"))
        {
            return null;
        }
        try
        {
            JSONArray jsonarray = jsonobject.getJSONArray("dims");
            int i = jsonarray.getInt(0);
            int j = jsonarray.getInt(1);
            jsonobject = jsonobject.getString("preview");
            s = new e(s, new Point(i, j), jsonobject);
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    protected static List b(JSONObject jsonobject)
    {
        ArrayList arraylist;
        JSONArray jsonarray;
        jsonarray = jsonobject.getJSONArray("tags");
        arraylist = new ArrayList();
        int i = 0;
_L2:
        jsonobject = arraylist;
        if (i >= jsonarray.length())
        {
            break; /* Loop/switch isn't completed */
        }
        jsonobject = jsonarray.getJSONObject(i);
        arraylist.add(new a(jsonobject.getString("character"), jsonobject.getString("name")));
        i++;
        if (true) goto _L2; else goto _L1
        jsonobject;
        jsonobject = null;
_L1:
        return jsonobject;
    }

    private static f c(JSONObject jsonobject)
    {
        f f1 = new f();
        Iterator iterator = a.keySet().iterator();
        do
        {
            if (!iterator.hasNext())
            {
                break;
            }
            f.a a1 = (f.a)iterator.next();
            e e1 = a((String)a.get(a1), jsonobject);
            if (e1 != null)
            {
                f1.a(a1, e1);
            }
        } while (true);
        return f1;
    }

    static 
    {
        HashMap hashmap = new HashMap();
        a = hashmap;
        hashmap.put(f.a.b, "webm");
        a.put(f.a.a, "mp4");
        a.put(f.a.i, "gif");
        a.put(f.a.f, "nanogif");
        a.put(f.a.e, "tinygif");
        a.put(f.a.c, "tinywebm");
        a.put(f.a.g, "tinymp4");
        a.put(f.a.d, "nanowebm");
    }
}
