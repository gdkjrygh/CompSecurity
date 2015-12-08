// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.google.android.gms.internal;

import android.view.View;

// Referenced classes of package com.google.android.gms.internal:
//            by

final class bz
    implements Runnable
{

    final View a;
    final by b;

    bz(by by1, View view)
    {
        b = by1;
        a = view;
        super();
    }

    public final void run()
    {
        b.a(a);
    }
}
