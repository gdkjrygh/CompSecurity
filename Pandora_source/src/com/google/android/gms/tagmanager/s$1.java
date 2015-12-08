// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.tagmanager;


// Referenced classes of package com.google.android.gms.tagmanager:
//            s, bp, t, r

class c
    implements Runnable
{

    final r a;
    final long b;
    final String c;
    final s d;

    public void run()
    {
        if (s.a(d) == null)
        {
            bp bp1 = bp.a();
            bp1.a(s.b(d), a);
            s.a(d, bp1.b());
        }
        s.a(d).a(b, c);
    }

    (s s1, r r, long l, String s2)
    {
        d = s1;
        a = r;
        b = l;
        c = s2;
        super();
    }
}
