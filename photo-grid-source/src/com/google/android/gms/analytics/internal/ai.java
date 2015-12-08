// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            ag, ae

final class ai
    implements Runnable
{

    final ComponentName a;
    final ag b;

    ai(ag ag1, ComponentName componentname)
    {
        b = ag1;
        a = componentname;
        super();
    }

    public final void run()
    {
        ae.a(b.a, a);
    }
}
