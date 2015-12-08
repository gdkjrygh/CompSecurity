// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.kik.cards.web.plugin;

import com.kik.g.e;
import com.kik.g.k;
import java.util.ArrayList;
import java.util.List;
import org.c.b;
import org.c.c;
import org.json.JSONObject;

// Referenced classes of package com.kik.cards.web.plugin:
//            j, a, f

public abstract class d
{

    private final int a = 1;
    private final String b;
    protected final b c;
    private boolean d;
    private List e;
    private boolean f;
    private final k g = new k(this);

    public d(String s)
    {
        d = false;
        e = new ArrayList();
        f = false;
        c = org.c.c.a(s);
        b = s;
    }

    protected static void a(a a1, int l, JSONObject jsonobject)
    {
        a1.a(new j(l, jsonobject));
    }

    protected final void a(f f1)
    {
        if (!f)
        {
            if (d)
            {
                e.add(f1);
            }
            return;
        } else
        {
            g.a(f1);
            return;
        }
    }

    public boolean a(String s)
    {
        return true;
    }

    public boolean b()
    {
        return false;
    }

    protected final void c(String s)
    {
        a(new f(s));
    }

    protected final boolean e()
    {
        return f;
    }

    public final String f()
    {
        return b;
    }

    public void f_()
    {
    }

    public final int g()
    {
        return a;
    }

    public j getInfo(JSONObject jsonobject)
    {
        return new j((new JSONObject()).put("name", b).put("version", a));
    }

    public final List h()
    {
        f = true;
        List list = e;
        e = new ArrayList();
        return list;
    }

    public final e i()
    {
        return g.a();
    }
}
