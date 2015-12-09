// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.android.slyce.report.surveys;


// Referenced classes of package com.android.slyce.report.surveys:
//            h, f, CardCarouselLayout, e

class i
    implements Runnable
{

    final String a;
    final h b;

    i(h h1, String s)
    {
        b = h1;
        a = s;
        super();
    }

    public void run()
    {
        CardCarouselLayout.a(b.b.a).a(f.a(b.b), a);
    }
}
