// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.tinder.fragments;

import android.view.View;
import android.widget.TextView;

// Referenced classes of package com.tinder.fragments:
//            af

final class a
    implements Runnable
{

    final af a;

    public final void run()
    {
        af.a(a, af.d(a).getWidth());
        af.b(a, af.e(a).getWidth());
        af.f(a).getLayoutParams().width = af.g(a);
        af.f(a).setLayoutParams(af.f(a).getLayoutParams());
        af.h(a);
    }

    outParams(af af1)
    {
        a = af1;
        super();
    }
}
