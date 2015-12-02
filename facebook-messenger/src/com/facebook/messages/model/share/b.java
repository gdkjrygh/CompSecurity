// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.messages.model.share;

import java.util.Collections;
import java.util.List;

// Referenced classes of package com.facebook.messages.model.share:
//            Share

public class b
{

    private String a;
    private String b;
    private String c;
    private String d;
    private String e;
    private List f;
    private List g;

    public b()
    {
        f = Collections.emptyList();
        g = Collections.emptyList();
    }

    public b a(String s)
    {
        a = s;
        return this;
    }

    public b a(List list)
    {
        f = list;
        return this;
    }

    public String a()
    {
        return a;
    }

    public b b(String s)
    {
        b = s;
        return this;
    }

    public b b(List list)
    {
        g = list;
        return this;
    }

    public String b()
    {
        return b;
    }

    public b c(String s)
    {
        c = s;
        return this;
    }

    public String c()
    {
        return c;
    }

    public b d(String s)
    {
        d = s;
        return this;
    }

    public List d()
    {
        return f;
    }

    public b e(String s)
    {
        e = s;
        return this;
    }

    public String e()
    {
        return d;
    }

    public String f()
    {
        return e;
    }

    public List g()
    {
        return g;
    }

    public Share h()
    {
        return new Share(this);
    }
}
