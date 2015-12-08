// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            v

final class a
    implements Runnable
{

    final ComponentName a;
    final a b;

    public final void run()
    {
        v.a(b.b, a);
    }

    ( , ComponentName componentname)
    {
        b = ;
        a = componentname;
        super();
    }
}
