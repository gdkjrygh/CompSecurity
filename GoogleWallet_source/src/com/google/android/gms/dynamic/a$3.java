// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//            a, LifecycleDelegate

final class Jy
    implements Jy
{

    final Bundle Jy;
    final a afB;

    public final void b(LifecycleDelegate lifecycledelegate)
    {
        a.b(afB).onCreate(Jy);
    }

    public final int getState()
    {
        return 1;
    }

    cycleDelegate(a a1, Bundle bundle)
    {
        afB = a1;
        Jy = bundle;
        super();
    }
}
