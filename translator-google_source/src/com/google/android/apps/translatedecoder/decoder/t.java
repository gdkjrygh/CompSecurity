// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.apps.translatedecoder.decoder;

import java.util.HashSet;
import java.util.Set;

// Referenced classes of package com.google.android.apps.translatedecoder.decoder:
//            q, r

final class t
{

    int a;
    Set b;
    final r c;

    public t(r r, q q1)
    {
        c = r;
        super();
        b = null;
        a = q1.d;
        b = new HashSet();
        a(q1);
    }

    public final void a(q q1)
    {
        b.add(q1);
    }
}
