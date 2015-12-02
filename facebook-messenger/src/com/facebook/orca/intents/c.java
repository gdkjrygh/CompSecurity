// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.facebook.orca.intents;

import android.content.Intent;
import com.google.common.d.a.ab;
import com.google.common.d.a.h;

// Referenced classes of package com.facebook.orca.intents:
//            b

class c
    implements h
{

    final Intent a;
    final String b;
    final boolean c;
    final String d;
    final ab e;
    final b f;

    c(b b1, Intent intent, String s, boolean flag, String s1, ab ab1)
    {
        f = b1;
        a = intent;
        b = s;
        c = flag;
        d = s1;
        e = ab1;
        super();
    }

    public void a(Boolean boolean1)
    {
        if (!boolean1.booleanValue())
        {
            com.facebook.orca.intents.b.a(f, a, com.facebook.orca.intents.b.a(f, b, c, d));
        }
        e.a_(Boolean.valueOf(true));
    }

    public volatile void a(Object obj)
    {
        a((Boolean)obj);
    }

    public void a(Throwable throwable)
    {
        com.facebook.orca.intents.b.a(f, a, com.facebook.orca.intents.b.a(f, b, c, d));
        e.a_(Boolean.valueOf(true));
    }
}
