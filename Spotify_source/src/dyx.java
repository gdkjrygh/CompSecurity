// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;
import org.json.JSONObject;

public final class dyx
{

    public dyy a;
    boolean b;
    public boolean c;
    dyw d;
    private final dmh e = new dmh() {

        private dyx a;

        public final void a(int i, Object obj)
        {
            obj = (JSONObject)obj;
            a.b = false;
            a.d = new dyv(((JSONObject) (obj)));
            a.c = true;
            a.a.a();
        }

        public final void a(Throwable throwable, String s)
        {
            a.b = false;
            a.d = null;
            a.c = false;
            a.a.b();
        }

            
            {
                a = dyx.this;
                super();
            }
    };
    private final dyy f = new dyt();
    private dme g;
    private HashMap h;

    public dyx(dme dme1)
    {
        h = new HashMap();
        g = (dme)ctz.a(dme1);
        h.put("validate", "1");
        a = f;
    }

    public final void a()
    {
        while (c || b) 
        {
            return;
        }
        b = true;
        g.b("", h, e);
    }

    public final dyw b()
    {
        ctz.b(c, "Don't call this before the licenses have been loaded.");
        ctz.a(d);
        return d;
    }
}
