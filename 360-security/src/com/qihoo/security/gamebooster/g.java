// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.qihoo.security.gamebooster;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

// Referenced classes of package com.qihoo.security.gamebooster:
//            LocalGamePkg

public class g
    implements Cloneable
{

    private long a;
    private List b;
    private List c;

    public g(long l, List list, List list1)
    {
        a = l;
        b = list;
        c = list1;
    }

    public static g a(String s)
    {
        try
        {
            Object obj = new JSONObject(s);
            long l = ((JSONObject) (obj)).optLong("v5_version");
            s = ((JSONObject) (obj)).optJSONArray("pkgs");
            obj = ((JSONObject) (obj)).optJSONArray("delete_pkgs");
            s = new g(l, LocalGamePkg.fromJsonArray(s), LocalGamePkg.fromJsonArray(((org.json.JSONArray) (obj))));
        }
        // Misplaced declaration of an exception variable
        catch (String s)
        {
            return null;
        }
        return s;
    }

    public static String a(g g1)
    {
        if (g1 == null)
        {
            return null;
        }
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("v5_version", g1.a);
            jsonobject.put("pkgs", LocalGamePkg.toJsonArray(g1.c()));
            jsonobject.put("delete_pkgs", LocalGamePkg.toJsonArray(g1.a()));
        }
        // Misplaced declaration of an exception variable
        catch (g g1) { }
        return jsonobject.toString();
    }

    public static g d()
    {
        return new g(0L, new ArrayList(), new ArrayList());
    }

    public List a()
    {
        return c;
    }

    public void a(long l)
    {
        a = l;
    }

    public long b()
    {
        return a;
    }

    public List c()
    {
        return b;
    }

    public Object clone()
        throws CloneNotSupportedException
    {
        return e();
    }

    public g e()
    {
        ArrayList arraylist = new ArrayList();
        ArrayList arraylist1 = new ArrayList();
        arraylist.addAll(b);
        arraylist1.addAll(c);
        return new g(a, arraylist, arraylist1);
    }
}
