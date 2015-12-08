// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.appboy.models.outgoing;

import bo.app.dd;
import bo.app.em;
import bo.app.er;
import com.appboy.Constants;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

public class Environment
{

    private static final String a;
    private final String b;
    private final int c;
    private final String d;
    private final String e;
    private em f;
    private final Object g;

    public Environment(String s, int i, String s1, String s2)
    {
        g = new Object();
        b = s;
        c = i;
        d = s1;
        e = s2;
    }

    public Environment(String s, int i, String s1, String s2, em em1)
    {
        this(s, i, s1, s2);
        f = em1;
    }

    public dd dispatch()
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
        obj = new dd(b, c, d, e, ((String) (obj)));
        obj2;
        JVM INSTR monitorexit ;
        return ((dd) (obj));
        Exception exception;
        exception;
        throw exception;
    }

    public JSONObject forStatelessJsonPut()
    {
        JSONObject jsonobject = new JSONObject();
        try
        {
            jsonobject.put("sdk_version", b);
            jsonobject.put("now", er.b());
            jsonobject.put("version_code", c);
            jsonobject.put("version_name", d);
            jsonobject.put("package_name", e);
            jsonobject.put("no_acks", true);
        }
        catch (JSONException jsonexception)
        {
            String s = a;
            return jsonobject;
        }
        return jsonobject;
    }

    static 
    {
        a = String.format("%s.%s", new Object[] {
            Constants.APPBOY_LOG_TAG_PREFIX, com/appboy/models/outgoing/Environment.getName()
        });
    }
}
