// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.app.Activity;
import com.google.android.gms.analytics.g;

// Referenced classes of package com.google.android.gms.internal:
//            ju, jn

static final class a
    implements a
{

    private final g a;

    public final void a(jn jn1)
    {
        a.a(jn1.a());
        com.google.android.gms.analytics.  = new com.google.android.gms.analytics.init>();
        .("&a", String.valueOf(jn1.b()));
        a.a(.());
    }

    public final void a(jn jn1, Activity activity)
    {
    }

    (g g1)
    {
        a = g1;
    }
}
