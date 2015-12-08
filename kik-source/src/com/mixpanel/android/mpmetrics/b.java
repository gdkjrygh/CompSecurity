// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.mpmetrics;


// Referenced classes of package com.mixpanel.android.mpmetrics:
//            t, v

final class b
    implements v.a
{

    final String a;
    final a.b.a b;

    b(a.b.a a1, String s)
    {
        b = a1;
        a = s;
        super();
    }

    public final void a(v v1)
    {
        if (t.a)
        {
            (new StringBuilder("Using existing pushId ")).append(a);
        }
        v1.c().a(a);
    }
}
