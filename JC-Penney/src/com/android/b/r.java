// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.b;


// Referenced classes of package com.android.b:
//            q, ae

class r
    implements Runnable
{

    final String a;
    final long b;
    final q c;

    r(q q1, String s, long l)
    {
        c = q1;
        a = s;
        b = l;
        super();
    }

    public void run()
    {
        q.b(c).a(a, b);
        q.b(c).a(toString());
    }
}
