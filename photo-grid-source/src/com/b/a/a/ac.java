// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.b.a.a;

import a.a.a.a.a.b.l;
import a.a.a.a.a.b.x;
import a.a.a.a.a.b.y;
import android.content.Context;
import java.util.Map;
import java.util.UUID;

// Referenced classes of package com.b.a.a:
//            aa

final class ac
{

    private final Context a;
    private final x b;
    private final String c;
    private final String d;

    public ac(Context context, x x1, String s, String s1)
    {
        a = context;
        b = x1;
        c = s;
        d = s1;
    }

    public final aa a()
    {
        Object obj = b.g();
        String s = a.getPackageName();
        String s1 = b.b();
        String s2 = (String)((Map) (obj)).get(y.d);
        String s3 = (String)((Map) (obj)).get(y.g);
        Boolean boolean1 = b.i();
        obj = (String)((Map) (obj)).get(y.c);
        String s4 = l.l(a);
        String s5 = x.d();
        String s6 = x.e();
        return new aa(s, UUID.randomUUID().toString(), s1, s2, s3, boolean1, ((String) (obj)), s4, s5, s6, c, d);
    }
}
