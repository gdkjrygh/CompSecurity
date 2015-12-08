// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translate.inputs;

import java.util.List;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translate.inputs:
//            bk, bj

final class bl
    implements Runnable
{

    final String a;
    final List b;
    final Set c;
    final bk d;

    bl(bk bk1, String s, List list, Set set)
    {
        d = bk1;
        a = s;
        b = list;
        c = set;
        super();
    }

    public final void run()
    {
        bj.a(d.b, a, b, c);
    }
}
