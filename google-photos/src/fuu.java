// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

import java.util.HashMap;

public class fuu
    implements nuc
{

    public HashMap a;
    public boolean b;
    public final nud c = new ntz(this);

    public fuu()
    {
        b = false;
        a = new HashMap();
    }

    public final nud a()
    {
        return c;
    }

    public final void a(mhp mhp1)
    {
        a.put(mhp1.a(), mhp1);
        c.b();
    }

    public final void a(boolean flag)
    {
        b = flag;
        c.b();
    }

    public final boolean a(String s)
    {
        return a.get(s) != null;
    }

    public final void b()
    {
        c.b();
    }

    public final boolean b(String s)
    {
        return a.get(s) != null && ((mhp)a.get(s)).b();
    }
}
