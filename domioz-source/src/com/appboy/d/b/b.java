// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import a.a.by;
import a.a.df;
import a.a.dj;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
{

    private final String a;
    private final int b;
    private final String c;
    private final String d;
    private df e;
    private final Object f;

    private b(String s, int i, String s1, String s2)
    {
        f = new Object();
        a = s;
        b = i;
        c = s1;
        d = s2;
    }

    public b(String s, int i, String s1, String s2, df df1)
    {
        this(s, i, s1, s2);
        e = df1;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("sdk_version", a);
            jsonobject.put("now", dj.b());
            jsonobject.put("version_code", b);
            jsonobject.put("version_name", c);
            jsonobject.put("package_name", d);
            jsonobject.put("no_acks", true);
        }
        catch (JSONException jsonexception)
        {
            jsonexception.printStackTrace();
            return jsonobject;
        }
        return jsonobject;
    }

    public final by b()
    {
        Object obj2 = f;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (e == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = obj1;
        if (e.c.get())
        {
            obj = String.valueOf(e.e());
            e.a(false);
        }
        obj = new by(a, b, c, d, ((String) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return ((by) (obj));
        Exception exception;
        exception;
        throw exception;
    }
}
