// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.selfupdate;


// Referenced classes of package com.facebook.selfupdate:
//            s, q

class t
    implements Runnable
{

    final long a;
    final s b;

    t(s s1, long l)
    {
        b = s1;
        a = l;
        super();
    }

    public void run()
    {
        q.a(b.a, a);
    }
}
