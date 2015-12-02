// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.contacts.picker;

import com.facebook.widget.a.j;

// Referenced classes of package com.facebook.contacts.picker:
//            ac, u, l

class ab
{

    private final u a;
    private final String b;
    private final boolean c;
    private l d;
    private j e;

    public ab(ac ac1)
    {
        e = j.FINISHED;
        a = ac1.a();
        b = ac1.c();
        c = ac1.b();
    }

    public u a()
    {
        return a;
    }

    public void a(l l)
    {
        d = l;
    }

    public void a(j j1)
    {
        e = j1;
    }

    public String b()
    {
        return b;
    }

    public l c()
    {
        return d;
    }

    public j d()
    {
        return e;
    }
}
