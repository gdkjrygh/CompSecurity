// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.microsoft.advertising.android;


// Referenced classes of package com.microsoft.advertising.android:
//            j, b, av

final class a
    implements Runnable
{

    final j a;

    public final void run()
    {
        if (j.c(a) == null)
        {
            return;
        }
        j.c(a).setVisibility(0);
        if (j.a(a) != null)
        {
            j.a(a).c();
            j.a(a).f_();
            j.a(a).startAnimation(j.g(a));
        }
        j.c(a).startAnimation(j.h(a));
        av.a("AdLayoutVector", "slide animation(s) started");
    }

    (j j1)
    {
        a = j1;
        super();
    }
}
