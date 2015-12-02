// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.http.b;


// Referenced classes of package com.facebook.http.b:
//            g, h

class i
    implements Runnable
{

    final g a;

    private i(g g1)
    {
        a = g1;
        super();
    }

    i(g g1, h h)
    {
        this(g1);
    }

    public void run()
    {
        a.c();
    }
}
