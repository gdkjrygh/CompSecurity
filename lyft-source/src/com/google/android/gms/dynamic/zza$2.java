// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.dynamic;

import android.app.Activity;
import android.os.Bundle;

// Referenced classes of package com.google.android.gms.dynamic:
//            zza, LifecycleDelegate

class c
    implements a
{

    final Activity a;
    final Bundle b;
    final Bundle c;
    final zza d;

    public int a()
    {
        return 0;
    }

    public void a(LifecycleDelegate lifecycledelegate)
    {
        zza.b(d).a(a, b, c);
    }

    cleDelegate(zza zza1, Activity activity, Bundle bundle, Bundle bundle1)
    {
        d = zza1;
        a = activity;
        b = bundle;
        c = bundle1;
        super();
    }
}
