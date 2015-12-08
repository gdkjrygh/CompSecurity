// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package bo.app;

import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

// Referenced classes of package bo.app:
//            kw

public final class kz
{

    public boolean a;
    private StringBuilder b;
    private String c;
    private Object d;
    private Object e;
    private final List f;

    public kz()
    {
        this((byte)0);
    }

    private kz(byte byte0)
    {
        f = new ArrayList();
        a = true;
        b = new StringBuilder("");
    }

    private static String a(Object obj)
    {
        if (obj instanceof JSONArray)
        {
            return "a JSON array";
        }
        if (obj instanceof JSONObject)
        {
            return "a JSON object";
        } else
        {
            return obj.toString();
        }
    }

    public final kz a(String s, Object obj)
    {
        a((new StringBuilder()).append(s).append("\nExpected: ").append(a(obj)).append("\n     but none found\n").toString());
        return this;
    }

    public final kz a(String s, Object obj, Object obj1)
    {
        f.add(new kw(s, obj, obj1));
        c = s;
        d = obj;
        e = obj1;
        a((new StringBuilder()).append(s).append("\nExpected: ").append(a(obj)).append("\n     got: ").append(a(obj1)).append("\n").toString());
        return this;
    }

    public final void a(String s)
    {
        a = false;
        if (b.length() == 0)
        {
            b.append(s);
            return;
        } else
        {
            b.append(" ; ").append(s);
            return;
        }
    }

    public final kz b(String s, Object obj)
    {
        a((new StringBuilder()).append(s).append("\nUnexpected: ").append(a(obj)).append("\n").toString());
        return this;
    }

    public final String toString()
    {
        return b.toString();
    }
}
