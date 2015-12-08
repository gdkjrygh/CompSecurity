// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.d.b;

import bo.app.cx;
import bo.app.eg;
import bo.app.el;
import com.appboy.d;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class c
{

    private static final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private eg f;
    private final Object g;

    private c(String s, int i, String s1, String s2)
    {
        g = new Object();
        b = s;
        c = i;
        d = s1;
        e = s2;
    }

    public c(String s, int i, String s1, String s2, eg eg1)
    {
        this(s, i, s1, s2);
        f = eg1;
    }

    public final JSONObject a()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("sdk_version", b);
            jsonobject.put("now", el.b());
            jsonobject.put("version_code", c);
            jsonobject.put("version_name", d);
            jsonobject.put("package_name", e);
            jsonobject.put("no_acks", true);
        }
        catch (JSONException jsonexception)
        {
            return jsonobject;
        }
        return jsonobject;
    }

    public final cx b()
    {
        Object obj2 = g;
        obj2;
        JVM INSTR monitorenter ;
        Object obj;
        Object obj1;
        obj1 = null;
        obj = obj1;
        if (f == null)
        {
            break MISSING_BLOCK_LABEL_52;
        }
        obj = obj1;
        if (f.c.get())
        {
            obj = String.valueOf(f.e());
            f.a(false);
        }
        obj = new cx(b, c, d, e, ((String) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return ((cx) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            d.a, com/appboy/d/b/c.getName()
        });
    }
}
