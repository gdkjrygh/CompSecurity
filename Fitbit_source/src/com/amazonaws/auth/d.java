// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.amazonaws.auth;

import com.amazonaws.RequestClientOptions;
import com.amazonaws.regions.Regions;
import com.amazonaws.regions.a;
import com.amazonaws.services.cognitoidentity.b;
import com.amazonaws.services.cognitoidentity.model.GetIdRequest;
import com.amazonaws.services.cognitoidentity.model.GetIdResult;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenRequest;
import com.amazonaws.services.cognitoidentity.model.GetOpenIdTokenResult;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

// Referenced classes of package com.amazonaws.auth:
//            f, o, y

public abstract class d
    implements f
{

    protected final com.amazonaws.services.cognitoidentity.a a;
    protected String b;
    protected String c;
    protected Set d;
    protected Map e;
    private final String f;
    private final String g;

    public d(String s, String s1)
    {
        this(s, s1, new com.amazonaws.d());
    }

    public d(String s, String s1, com.amazonaws.d d1)
    {
        this(s, s1, ((com.amazonaws.services.cognitoidentity.a) (new b(new o(), d1))));
    }

    public d(String s, String s1, com.amazonaws.d d1, Regions regions)
    {
        this(s, s1, ((com.amazonaws.services.cognitoidentity.a) (new b(new o(), d1))));
        a.a(com.amazonaws.regions.a.a(regions));
    }

    public d(String s, String s1, Regions regions)
    {
        this(s, s1, new com.amazonaws.d(), regions);
    }

    public d(String s, String s1, com.amazonaws.services.cognitoidentity.a a1)
    {
        f = s;
        g = s1;
        e = new HashMap();
        d = new HashSet();
        a = a1;
    }

    public abstract String a();

    public void a(y y1)
    {
        d.remove(y1);
    }

    protected void a(com.amazonaws.b b1, String s)
    {
        b1.d().b(s);
    }

    protected void a(String s)
    {
        b = s;
    }

    protected void a(String s, String s1)
    {
        if (b == null || !b.equals(s))
        {
            c(s);
        }
        if (c == null || !c.equals(s1))
        {
            c = s1;
        }
    }

    public void a(Map map)
    {
        e = map;
    }

    public String b()
    {
        if (b == null)
        {
            Object obj = (new GetIdRequest()).c(e()).e(d()).b(e);
            a(((com.amazonaws.b) (obj)), i());
            obj = a.a(((GetIdRequest) (obj)));
            if (((GetIdResult) (obj)).a() != null)
            {
                c(((GetIdResult) (obj)).a());
            }
        }
        return b;
    }

    public void b(y y1)
    {
        d.add(y1);
    }

    protected void b(String s)
    {
        c = s;
    }

    public String c()
    {
        if (c == null)
        {
            Object obj = (new GetOpenIdTokenRequest()).c(b()).b(e);
            a(((com.amazonaws.b) (obj)), i());
            obj = a.a(((GetOpenIdTokenRequest) (obj)));
            if (!((GetOpenIdTokenResult) (obj)).a().equals(b()))
            {
                c(((GetOpenIdTokenResult) (obj)).a());
            }
            c = ((GetOpenIdTokenResult) (obj)).b();
        }
        return c;
    }

    public void c(String s)
    {
        if (b == null || !b.equals(s))
        {
            String s1 = b;
            b = s;
            s = d.iterator();
            while (s.hasNext()) 
            {
                ((y)s.next()).a(s1, b);
            }
        }
    }

    public String d()
    {
        return g;
    }

    public String e()
    {
        return f;
    }

    public Map f()
    {
        return e;
    }

    public boolean g()
    {
        return e != null && e.size() > 0;
    }

    public void h()
    {
        d.clear();
    }

    protected String i()
    {
        return "";
    }

    public String j()
    {
        b();
        String s = c();
        a(b(), s);
        return s;
    }
}
