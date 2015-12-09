// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package crittercism.android;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package crittercism.android:
//            r, l, i

public abstract class s extends r
{

    public static String c = "uhe";
    public static String d = "uhe-bg";
    public static String e = "he";
    public static String f = "he-bg";
    public static String g = "appload";
    public static String h = "error";
    protected String a;
    protected Collection b;

    public s()
    {
    }

    private static boolean b(JSONObject jsonobject)
    {
        if (!jsonobject.has("success"))
        {
            break MISSING_BLOCK_LABEL_26;
        }
        int j = jsonobject.getInt("success");
        return j == 1;
        jsonobject;
        return false;
    }

    public final void a(Object obj)
    {
        try
        {
            b.add(obj);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Object obj)
        {
            return;
        }
    }

    public final void a(Collection collection)
    {
        try
        {
            b.addAll(collection);
            return;
        }
        // Misplaced declaration of an exception variable
        catch (Collection collection)
        {
            return;
        }
    }

    public void a(JSONObject jsonobject)
    {
        (new StringBuilder("class.name = ")).append(getClass().getName());
        try
        {
            if (!b(jsonobject))
            {
                c();
            }
            g();
            return;
        }
        // Misplaced declaration of an exception variable
        catch (JSONObject jsonobject)
        {
            (new StringBuilder("Exception in CrittercismRequestData$handleResponseObject: ")).append(jsonobject.getClass().getName());
        }
    }

    public abstract JSONObject b();

    public JSONObject d()
    {
        JSONObject jsonobject;
        jsonobject = new JSONObject();
        JSONObject jsonobject1 = new JSONObject();
        try
        {
            e();
        }
        catch (Exception exception1)
        {
            (new StringBuilder("Exception in CrittercismRequestData$sendData: ")).append(exception1.getClass().getName());
        }
        if (b.size() != 0)
        {
            break MISSING_BLOCK_LABEL_87;
        }
        jsonobject1.put("success", 1);
        return jsonobject1;
        Object obj;
        obj;
        (new StringBuilder("Exception in CrittercismRequestData$sendData when data vector is size 0: ")).append(obj.getClass().getName());
_L4:
        HashMap hashmap;
        hashmap = new HashMap();
        hashmap.put("success", Integer.valueOf(0));
        JSONObject jsonobject2 = b();
        jsonobject = jsonobject2;
_L2:
        try
        {
            jsonobject = l.i().c.a(jsonobject);
        }
        catch (Exception exception)
        {
            (new StringBuilder("Exception obtaining response object in CrittercismRequestData$sendData ")).append(exception.getClass().getName());
            return new JSONObject(hashmap);
        }
        return jsonobject;
        jsonobject2;
        (new StringBuilder("Exception creating request object in CrittercismRequestData$sendData ")).append(jsonobject2.getClass().getName());
        if (true) goto _L2; else goto _L1
_L1:
        jsonobject2;
        if (true) goto _L4; else goto _L3
_L3:
    }

    public final Collection f()
    {
        return b;
    }

    public final void g()
    {
        try
        {
            b.clear();
            return;
        }
        catch (Exception exception)
        {
            return;
        }
    }

}
