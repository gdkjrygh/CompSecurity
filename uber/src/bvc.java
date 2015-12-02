// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bvc
    implements bvr
{

    private String a;
    private bvf b;

    private bvc(JSONObject jsonobject)
    {
        a = bux.a(buz.aC);
        b = new bvf(jsonobject.optJSONArray("funding_sources"), jsonobject.optJSONObject("backup_funding_instrument"));
    }

    public static ArrayList a(JSONObject jsonobject, JSONArray jsonarray)
    {
        ArrayList arraylist = new ArrayList();
        if (jsonobject != null)
        {
            jsonobject = new bvc(jsonobject);
            if (jsonobject.h())
            {
                arraylist.add(jsonobject);
            }
        }
        if (jsonarray != null)
        {
            int i = 0;
            while (i < jsonarray.length()) 
            {
                try
                {
                    jsonobject = new bvc(jsonarray.getJSONObject(i));
                    if (jsonobject.h())
                    {
                        arraylist.add(jsonobject);
                    }
                }
                // Misplaced declaration of an exception variable
                catch (JSONObject jsonobject) { }
                i++;
            }
        }
        return arraylist;
    }

    private boolean h()
    {
        return b.f() > 0;
    }

    public final String a()
    {
        return b.d();
    }

    public final String b()
    {
        return a;
    }

    public final String c()
    {
        return b.a();
    }

    public final String d()
    {
        return b.c();
    }

    public final boolean e()
    {
        return b.b();
    }

    public final bvf f()
    {
        return b;
    }

    public final boolean g()
    {
        return b.f() == 1;
    }
}
