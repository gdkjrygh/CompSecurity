// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.analytics.tracking.android;

import java.util.HashMap;
import java.util.Map;

// Referenced classes of package com.google.analytics.tracking.android:
//            at, as

final class ar
{

    Map a;

    ar()
    {
        a = new HashMap();
    }

    public final void a(String s, String s1, String s2, as as)
    {
        a.put(s, new at(s1, s2, as));
    }
}
