// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.mixpanel.android.surveys;


// Referenced classes of package com.mixpanel.android.surveys:
//            c, CardCarouselLayout

final class d
    implements Runnable
{

    final String a;
    final c b;

    d(c c1, String s)
    {
        b = c1;
        a = s;
        super();
    }

    public final void run()
    {
        CardCarouselLayout.a(b.b.a).a(CardCarouselLayout.d.a(b.b), a);
    }
}
