// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.analytics.internal;

import android.content.ComponentName;

// Referenced classes of package com.google.android.gms.analytics.internal:
//            w

class a
    implements Runnable
{

    final ComponentName a;
    final a b;

    public void run()
    {
        w.a(b.b, a);
    }

    _cls9(_cls9 _pcls9, ComponentName componentname)
    {
        b = _pcls9;
        a = componentname;
        super();
    }
}
