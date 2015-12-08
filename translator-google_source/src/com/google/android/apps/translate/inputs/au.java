// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import com.google.android.libraries.translate.core.m;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            at, aq

final class au
    implements Runnable
{

    final String a;
    final m b;
    final at c;

    au(at at1, String s, m m)
    {
        c = at1;
        a = s;
        b = m;
        super();
    }

    public final void run()
    {
        c.b.a(a, b);
    }
}
