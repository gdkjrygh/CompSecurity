// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.nuance.dragon.toolkit.a;

import com.nuance.dragon.toolkit.audio.b;
import com.nuance.dragon.toolkit.audio.e;
import com.nuance.dragon.toolkit.d.b.c;

// Referenced classes of package com.nuance.dragon.toolkit.a:
//            al, l, s, f, 
//            c, e

public class k extends al
{

    private final l a;
    private final com.nuance.dragon.toolkit.b.e e;

    public k(String s1, com.nuance.dragon.toolkit.b.e e1, e e2)
    {
        super(2, s1);
        c.a("dict", e1);
        e = e1;
        a = new l(e2);
    }

    public final b a()
    {
        return a;
    }

    final void a(com.nuance.dragon.toolkit.a.e e1)
    {
        c.a(com/nuance/dragon/toolkit/a/s, ((f)e1).c().l().equals(a.a()), "The audio type specified in the TTSSpec does not match the player codec specified in the CloudServices");
        e1.a(b, e, a);
    }
}
