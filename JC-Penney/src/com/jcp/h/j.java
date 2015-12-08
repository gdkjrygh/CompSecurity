// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.jcp.h;

import com.jcp.model.CartItemsDetails;
import com.jcp.productentity.ProductEntityContainer;
import com.jcp.util.bj;

public final class j
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;

    private j()
    {
    }

    public static j a(CartItemsDetails cartitemsdetails)
    {
        j j1 = new j();
        j1.h(cartitemsdetails.getBrandName());
        j1.e(cartitemsdetails.getDivision());
        j1.f(cartitemsdetails.getEntity());
        j1.a(cartitemsdetails.getId());
        j1.b(cartitemsdetails.getName());
        j1.c(String.valueOf(cartitemsdetails.getQuantity()));
        j1.d(String.valueOf(cartitemsdetails.getActivePrice()));
        j1.g(cartitemsdetails.getSubdivision());
        j1.i(bj.a(cartitemsdetails));
        return j1;
    }

    public static j a(ProductEntityContainer productentitycontainer, String s, int l)
    {
        j j1 = new j();
        j1.h(productentitycontainer.getBrand());
        j1.e(productentitycontainer.getDivision());
        j1.f(productentitycontainer.getEntity());
        j1.a(productentitycontainer.getId());
        j1.b(productentitycontainer.getName());
        j1.c(String.valueOf(l));
        j1.d(s);
        j1.g(productentitycontainer.getSubdivision());
        j1.i(bj.a(productentitycontainer));
        return j1;
    }

    public String a()
    {
        return "USD";
    }

    public void a(String s)
    {
        a = s;
    }

    public String b()
    {
        if (a == null)
        {
            return "";
        } else
        {
            return a;
        }
    }

    public void b(String s)
    {
        b = s;
    }

    public String c()
    {
        if (f == null)
        {
            return "";
        } else
        {
            return f;
        }
    }

    public void c(String s)
    {
        c = s;
    }

    public String d()
    {
        if (e == null)
        {
            return "";
        } else
        {
            return e;
        }
    }

    public void d(String s)
    {
        d = s;
    }

    public String e()
    {
        if (g == null)
        {
            return "";
        } else
        {
            return g;
        }
    }

    public void e(String s)
    {
        e = s;
    }

    public String f()
    {
        if (b == null)
        {
            return "";
        } else
        {
            return b;
        }
    }

    public void f(String s)
    {
        f = s;
    }

    public String g()
    {
        if (c == null)
        {
            return "";
        } else
        {
            return c;
        }
    }

    public void g(String s)
    {
        g = s;
    }

    public String h()
    {
        if (d == null)
        {
            return "";
        } else
        {
            return d;
        }
    }

    public void h(String s)
    {
        i = s;
    }

    public String i()
    {
        return "JCP|BAG";
    }

    public void i(String s)
    {
        h = s;
    }

    public String j()
    {
        if (h == null)
        {
            return "";
        } else
        {
            return h;
        }
    }

    public String k()
    {
        if (i == null)
        {
            return "";
        } else
        {
            return i;
        }
    }
}
