// Decompiled by Jad v1.5.8e. Copyright 2001 Pavel Kouznetsov.
// Jad home page: http://www.geocities.com/kpdus/jad.html
// Decompiler options: braces fieldsfirst space lnc 

package com.viewpagerindicator;


// Referenced classes of package com.viewpagerindicator:
//            UnderlinePageIndicator

final class a
    implements Runnable
{

    final UnderlinePageIndicator a;

    public final void run()
    {
        if (UnderlinePageIndicator.a(a))
        {
            a.post(UnderlinePageIndicator.b(a));
        }
    }

    (UnderlinePageIndicator underlinepageindicator)
    {
        a = underlinepageindicator;
        super();
    }
}
