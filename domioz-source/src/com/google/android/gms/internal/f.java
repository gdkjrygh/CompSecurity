// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            e

final class f
    implements Runnable
{

    final View a;
    final e b;

    f(e e1, View view)
    {
        b = e1;
        a = view;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
