// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.roidapp.baselib.b;


// Referenced classes of package com.roidapp.baselib.b:
//            m

final class n
    implements Runnable
{

    final String a;
    final m b;

    n(m m1, String s)
    {
        b = m1;
        a = s;
        super();
    }

    public final void run()
    {
        m.b(b);
    }
}
